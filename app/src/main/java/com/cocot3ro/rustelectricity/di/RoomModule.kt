package com.cocot3ro.rustelectricity.di

import android.content.Context
import androidx.room.Room
import com.cocot3ro.rustelectricity.data.database.RustElectricityDatabase
import com.cocot3ro.rustelectricity.data.database.definition.DatabaseDefinition
import com.cocot3ro.rustelectricity.data.database.security.DatabasePassphrase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import jakarta.inject.Singleton
import net.sqlcipher.database.SupportFactory

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    @Provides
    @Singleton
    fun provideDatabasePassphrase(@ApplicationContext context: Context): DatabasePassphrase =
        DatabasePassphrase(context)

    @Provides
    @Singleton
    fun provideSupportFactory(databasePassphrase: DatabasePassphrase): SupportFactory =
        SupportFactory(databasePassphrase.getPassphrase())

    @Provides
    @Singleton
    fun provideRoom(
        @ApplicationContext context: Context,
        supportFactory: SupportFactory
    ): RustElectricityDatabase {
        return Room.databaseBuilder(
            context,
            RustElectricityDatabase::class.java,
            DatabaseDefinition.DATABASE_NAME
        )
            .openHelperFactory(supportFactory)
            .build()
    }

}
