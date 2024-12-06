package com.cocot3ro.rustelectricity.domain.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.cocot3ro.annotations.Researcheable
import com.cocot3ro.rustelectricity.R

sealed interface IFilter<T> {
    val filter: T
}

data class SimpleFilter(override val filter: RustObjectType) : IFilter<RustObjectType>
data class CategoryFilter(override val filter: FilterCategory) : IFilter<FilterCategory>
data class BlueprintFilter(override val filter: RustObjectType) : IFilter<RustObjectType> {
    init {
        require(filter::class.annotations.any { it is Researcheable }) {
            "BlueprintFilter can only be used with Researcheable objects"
        }
    }
}

enum class FilterCategory(
    @DrawableRes
    val icon: Int?,

    @StringRes
    val title: Int
) {
    WEAPON(icon = null, title = R.string.cat_weapon_title),
    CONSTRUCTION(icon = null, title = R.string.cat_construction_title),
    ITEMS(icon = null, title = R.string.cat_construction_title),
    RESOURCES(icon = null, title = R.string.cat_resources_title),
    ATTIRE(icon = null, title = R.string.cat_attire_title),
    TOOL(icon = null, title = R.string.cat_tool_title),
    MEDICAL(icon = null, title = R.string.cat_medical_title),
    FOOD(icon = null, title = R.string.cat_food_title),
    AMMUNITION(icon = null, title = R.string.cat_ammunition_title),
    TRAPS(icon = null, title = R.string.cat_traps_title),
    MISC(icon = null, title = R.string.cat_misc_title),
    COMPONENT(icon = null, title = R.string.cat_component_title),
    ELECTRICAL(icon = null, title = R.string.cat_electrical_title),
    FUN(icon = null, title = R.string.cat_fun_title)
}
