package com.cocot3ro.rustelectricity.ui.screen.schematic

import androidx.lifecycle.ViewModel
import com.cocot3ro.rustelectricity.domain.model.IDeployable
import com.cocot3ro.rustelectricity.domain.model.RustObjectType
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class SchematicViewModel @Inject constructor(

) : ViewModel() {
    private val _inUseItems: MutableStateFlow<Set<RustObjectType>> = MutableStateFlow(setOf())
    val itemPallet: StateFlow<Set<RustObjectType>> get() = _inUseItems

    private val _deployables: MutableStateFlow<List<IDeployable>> = MutableStateFlow(listOf())
    val deployables: StateFlow<List<IDeployable>> = _deployables

    fun loadSchematic(id: Long) {

    }

    fun addItemToPallet(item: RustObjectType) {
        _inUseItems.update { it + item }
    }

    fun removeItemFromPallet(item: RustObjectType) {
        _inUseItems.update { it - item }
    }

    fun addDeployable(deployable: IDeployable) {
        _deployables.update { it + deployable }
    }

    fun removeDeployable(deployable: IDeployable) {
        _deployables.update { it - deployable }
    }
}
