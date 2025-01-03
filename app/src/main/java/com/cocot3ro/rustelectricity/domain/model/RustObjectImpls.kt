package com.cocot3ro.rustelectricity.domain.model

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.annotations.Blueprint
import com.cocot3ro.rustelectricity.annotations.Deployable
import com.cocot3ro.rustelectricity.annotations.ItemDoorController
import com.cocot3ro.rustelectricity.annotations.DoorControllerAttachable
import com.cocot3ro.rustelectricity.annotations.ElectricalComponent
import com.cocot3ro.rustelectricity.annotations.ElectricalTool
import com.cocot3ro.rustelectricity.annotations.IndustrialComponent
import com.cocot3ro.rustelectricity.annotations.IndustrialTool
import com.cocot3ro.rustelectricity.annotations.ItemStorageAdaptor
import com.cocot3ro.rustelectricity.annotations.StorageAdaptorAttachable
import com.cocot3ro.rustelectricity.annotations.ItemStorageMonitor
import com.cocot3ro.rustelectricity.annotations.StorageMonitorAttachable
import com.cocot3ro.rustelectricity.annotations.WaterComponent
import com.cocot3ro.rustelectricity.annotations.WaterTool

@Blueprint
abstract class Item12GaugeBuckshot : RustObject(
    nameRes = R.string.item_12_gauge_buckshot,
    imageRes = R.drawable.item_12_gauge_buckshot
)

@Blueprint
abstract class Item12GaugeIncendiaryShell : RustObject(
    nameRes = R.string.item_12_gauge_incendiary_shell,
    imageRes = R.drawable.item_12_gauge_incendiary_shell
)

@Blueprint
abstract class Item12GaugeSlug : RustObject(
    nameRes = R.string.item_12_gauge_slug,
    imageRes = R.drawable.item_12_gauge_slug
)

abstract class Item16xZoomScope : RustObject(
    nameRes = R.string.item_16x_zoom_scope,
    imageRes = R.drawable.item_16x_zoom_scope
)

abstract class Item40mmHeGrenade : RustObject(
    nameRes = R.string.item_40mm_he_grenade,
    imageRes = R.drawable.item_40mm_he_grenade
)

abstract class Item40mmShotgunRound : RustObject(
    nameRes = R.string.item_40mm_shotgun_round,
    imageRes = R.drawable.item_40mm_shotgun_round
)

abstract class Item40mmSmokeGrenade : RustObject(
    nameRes = R.string.item_40mm_smoke_grenade,
    imageRes = R.drawable.item_40mm_smoke_grenade
)

@Blueprint
abstract class Item556RifleAmmo : RustObject(
    nameRes = R.string.item_5_56_rifle_ammo,
    imageRes = R.drawable.item_5_56_rifle_ammo
)

@Blueprint
abstract class Item8xZoomScope : RustObject(
    nameRes = R.string.item_8x_zoom_scope,
    imageRes = R.drawable.item_8x_zoom_scope
)

abstract class ItemAboveGroundPool : RustObject(
    nameRes = R.string.item_above_ground_pool,
    imageRes = R.drawable.item_above_ground_pool
)

@Blueprint
abstract class ItemAcousticGuitar : RustObject(
    nameRes = R.string.item_acoustic_guitar,
    imageRes = R.drawable.item_acoustic_guitar
)

abstract class ItemAdvancedHealingTea : RustObject(
    nameRes = R.string.item_advanced_healing_tea,
    imageRes = R.drawable.item_advanced_healing_tea
)

abstract class ItemAdvancedMaxHealthTea : RustObject(
    nameRes = R.string.item_advanced_max_health_tea,
    imageRes = R.drawable.item_advanced_max_health_tea
)

abstract class ItemAdvancedOreTea : RustObject(
    nameRes = R.string.item_advanced_ore_tea,
    imageRes = R.drawable.item_advanced_ore_tea
)

abstract class ItemAdvancedRadRemovalTea : RustObject(
    nameRes = R.string.item_advanced_rad_removal_tea,
    imageRes = R.drawable.item_advanced_rad_removal_tea
)

abstract class ItemAdvancedScrapTea : RustObject(
    nameRes = R.string.item_advanced_scrap_tea,
    imageRes = R.drawable.item_advanced_scrap_tea
)

abstract class ItemAdvancedWoodTea : RustObject(
    nameRes = R.string.item_advanced_wood_tea,
    imageRes = R.drawable.item_advanced_wood_tea
)

abstract class ItemAdventCalendar : RustObject(
    nameRes = R.string.item_advent_calendar,
    imageRes = R.drawable.item_advent_calendar
)

abstract class ItemAdvAntiRadTea : RustObject(
    nameRes = R.string.item_adv_anti_rad_tea,
    imageRes = R.drawable.item_adv_anti_rad_tea
)

abstract class ItemAnchovy : RustObject(
    nameRes = R.string.item_anchovy,
    imageRes = R.drawable.item_anchovy
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugInputA::class,
        PlugInputB::class
    ],
    electricalOutputs = [
        PlugPowerOut::class
    ]
)
abstract class ItemAndSwitch : RustObject(
    nameRes = R.string.item_and_switch,
    imageRes = R.drawable.item_and_switch
)

abstract class ItemAnimalFat : RustObject(
    nameRes = R.string.item_animal_fat,
    imageRes = R.drawable.item_animal_fat
)

abstract class ItemAntiRadiationPills : RustObject(
    nameRes = R.string.item_anti_radiation_pills,
    imageRes = R.drawable.item_anti_radiation_pills
)

abstract class ItemAntiRadTea : RustObject(
    nameRes = R.string.item_anti_rad_tea,
    imageRes = R.drawable.item_anti_rad_tea
)

abstract class ItemApple : RustObject(
    nameRes = R.string.item_apple,
    imageRes = R.drawable.item_apple
)

abstract class ItemArcticScientistSuit : RustObject(
    nameRes = R.string.item_arctic_scientist_suit,
    imageRes = R.drawable.item_arctic_scientist_suit
)

abstract class ItemArticSuit : RustObject(
    nameRes = R.string.item_arctic_suit,
    imageRes = R.drawable.item_arctic_suit
)

@Blueprint
abstract class ItemArmoredCockpitVehicleModule : RustObject(
    nameRes = R.string.item_armored_cockpit_vehicle_module,
    imageRes = R.drawable.item_armored_cockpit_vehicle_module
)

@Blueprint
@DoorControllerAttachable
abstract class ItemArmoredDoor : RustObject(
    nameRes = R.string.item_armored_door,
    imageRes = R.drawable.item_armored_door
)

@Blueprint
@DoorControllerAttachable
abstract class ItemArmoredDoubleDoor : RustObject(
    nameRes = R.string.item_armored_double_door,
    imageRes = R.drawable.item_armored_double_door
)

@Blueprint
abstract class ItemArmoredPassengerVehicleModule : RustObject(
    nameRes = R.string.item_armored_passenger_vehicle_module,
    imageRes = R.drawable.item_armored_passenger_vehicle_module
)

@Blueprint
abstract class ItemAssaultRifle : RustObject(
    nameRes = R.string.item_assault_rifle,
    imageRes = R.drawable.item_assault_rifle
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = []
)
abstract class ItemAudioAlarm : RustObject(
    nameRes = R.string.item_audio_alarm,
    imageRes = R.drawable.item_audio_alarm
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = [
        PlugNoAmmo::class,
        PlugLowAmmo::class,
        PlugHasTarget::class
    ]
)
abstract class ItemAutoTurret : RustObject(
    nameRes = R.string.item_auto_turret,
    imageRes = R.drawable.item_auto_turret
)

abstract class ItemABarrelCostume : RustObject(
    nameRes = R.string.item_a_barrel_costume,
    imageRes = R.drawable.item_a_barrel_costume
)

@Blueprint
abstract class ItemBandage : RustObject(
    nameRes = R.string.item_bandage,
    imageRes = R.drawable.item_bandage
)

@Blueprint
abstract class ItemBandanaMask : RustObject(
    nameRes = R.string.item_bandana_mask,
    imageRes = R.drawable.item_bandana_mask
)

abstract class ItemBanditGuardGear : RustObject(
    nameRes = R.string.item_bandit_guard_gear,
    imageRes = R.drawable.item_bandit_guard_gear
)

@Blueprint
abstract class ItemBarbedWoodenBarricade : RustObject(
    nameRes = R.string.item_barbed_wooden_barricade,
    imageRes = R.drawable.item_barbed_wooden_barricade
)

@Blueprint
abstract class ItemBarbeque : RustObject(
    nameRes = R.string.item_barbeque,
    imageRes = R.drawable.item_barbeque
)

abstract class ItemBaseballCap : RustObject(
    nameRes = R.string.item_baseball_cap,
    imageRes = R.drawable.item_baseball_cap
)

abstract class ItemBasicHealingTea : RustObject(
    nameRes = R.string.item_basic_healing_tea,
    imageRes = R.drawable.item_basic_healing_tea
)

@Blueprint
abstract class ItemBasicHorseShoes : RustObject(
    nameRes = R.string.item_basic_horse_shoes,
    imageRes = R.drawable.item_basic_horse_shoes
)

abstract class ItemBasicMaxHealthTea : RustObject(
    nameRes = R.string.item_basic_max_health_tea,
    imageRes = R.drawable.item_basic_max_health_tea
)

abstract class ItemBasicOreTea : RustObject(
    nameRes = R.string.item_basic_ore_tea,
    imageRes = R.drawable.item_basic_ore_tea
)

abstract class ItemBasicScrapTea : RustObject(
    nameRes = R.string.item_basic_scrap_tea,
    imageRes = R.drawable.item_basic_scrap_tea
)

abstract class ItemBasicWoodTea : RustObject(
    nameRes = R.string.item_basic_wood_tea,
    imageRes = R.drawable.item_basic_wood_tea
)

abstract class ItemBathTubPlanter : RustObject(
    nameRes = R.string.item_bath_tub_planter,
    imageRes = R.drawable.item_bath_tub_planter
)

@Blueprint
abstract class ItemBatterySmall : RustObject(
    nameRes = R.string.item_battery_small,
    imageRes = R.drawable.item_battery_small
)

@Blueprint
abstract class ItemBeachChair : RustObject(
    nameRes = R.string.item_beach_chair,
    imageRes = R.drawable.item_beach_chair
)

@Blueprint
abstract class ItemBeachParasol : RustObject(
    nameRes = R.string.item_beach_parasol,
    imageRes = R.drawable.item_beach_parasol
)

abstract class ItemBeachTable : RustObject(
    nameRes = R.string.item_beach_table,
    imageRes = R.drawable.item_beach_table
)

@Blueprint
abstract class ItemBeachTowel : RustObject(
    nameRes = R.string.item_beach_towel,
    imageRes = R.drawable.item_beach_towel
)

@Blueprint
abstract class ItemBeancanGrenade : RustObject(
    nameRes = R.string.item_beancan_grenade,
    imageRes = R.drawable.item_beancan_grenade
)

@Blueprint
abstract class ItemBed : RustObject(
    nameRes = R.string.item_bed,
    imageRes = R.drawable.item_bed
)

@Blueprint
abstract class ItemBeenieHat : RustObject(
    nameRes = R.string.item_beenie_hat,
    imageRes = R.drawable.item_beenie_hat
)

@Blueprint
abstract class ItemBinoculars : RustObject(
    nameRes = R.string.item_binoculars,
    imageRes = R.drawable.item_binoculars
)

abstract class ItemBirthdayCake : RustObject(
    nameRes = R.string.item_birthday_cake,
    imageRes = R.drawable.item_birthday_cake
)

abstract class ItemBlackBerry : RustObject(
    nameRes = R.string.item_black_berry,
    imageRes = R.drawable.item_black_berry
)

abstract class ItemBlackBerryClone : RustObject(
    nameRes = R.string.item_black_berry_clone,
    imageRes = R.drawable.item_black_berry_clone
)

abstract class ItemBlackBerrySeed : RustObject(
    nameRes = R.string.item_black_berry_seed,
    imageRes = R.drawable.item_black_berry_seed
)

abstract class ItemBlackRaspberries : RustObject(
    nameRes = R.string.item_black_raspberries,
    imageRes = R.drawable.item_black_raspberries
)

abstract class ItemBleach : RustObject(
    nameRes = R.string.item_bleach,
    imageRes = R.drawable.item_bleach
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class,
        PlugBlockPassthrough::class
    ],
    electricalOutputs = [
        PlugPowerOut::class
    ]
)
@StorageAdaptorAttachable(slotAmount = 3)
abstract class ItemBlocker : RustObject(
    nameRes = R.string.item_blocker,
    imageRes = R.drawable.item_blocker
)

abstract class ItemBlood : RustObject(
    nameRes = R.string.item_blood,
    imageRes = R.drawable.item_blood
)

abstract class ItemBlueberries : RustObject(
    nameRes = R.string.item_blueberries,
    imageRes = R.drawable.item_blueberries
)

abstract class ItemBlueBerry : RustObject(
    nameRes = R.string.item_blue_berry,
    imageRes = R.drawable.item_blue_berry
)

abstract class ItemBlueBerryClone : RustObject(
    nameRes = R.string.item_blue_berry_clone,
    imageRes = R.drawable.item_blue_berry_clone
)

abstract class ItemBlueBerrySeed : RustObject(
    nameRes = R.string.item_blue_berry_seed,
    imageRes = R.drawable.item_blue_berry_seed
)

abstract class ItemBlueBoomer : RustObject(
    nameRes = R.string.item_blue_boomer,
    imageRes = R.drawable.item_blue_boomer
)

abstract class ItemBlueJumpsuit : RustObject(
    nameRes = R.string.item_blue_jumpsuit,
    imageRes = R.drawable.item_blue_jumpsuit
)

abstract class ItemBlueKeycard : RustObject(
    nameRes = R.string.item_blue_keycard,
    imageRes = R.drawable.item_blue_keycard
)

abstract class ItemBlueRomanCandle : RustObject(
    nameRes = R.string.item_blue_roman_candle,
    imageRes = R.drawable.item_blue_roman_candle
)

@Blueprint
abstract class ItemBoltActionRifle : RustObject(
    nameRes = R.string.item_bolt_action_rifle,
    imageRes = R.drawable.item_bolt_action_rifle
)

@Blueprint
abstract class ItemBoneArmor : RustObject(
    nameRes = R.string.item_bone_armor,
    imageRes = R.drawable.item_bone_armor
)

@Blueprint
abstract class ItemBoneArrow : RustObject(
    nameRes = R.string.item_bone_arrow,
    imageRes = R.drawable.item_bone_arrow
)

@Blueprint
abstract class ItemBoneClub : RustObject(
    nameRes = R.string.item_bone_club,
    imageRes = R.drawable.item_bone_club
)

abstract class ItemBoneFragments : RustObject(
    nameRes = R.string.item_bone_fragments,
    imageRes = R.drawable.item_bone_fragments
)

@Blueprint
abstract class ItemBoneHelmet : RustObject(
    nameRes = R.string.item_bone_helmet,
    imageRes = R.drawable.item_bone_helmet
)

@Blueprint
abstract class ItemBoneKnife : RustObject(
    nameRes = R.string.item_bone_knife,
    imageRes = R.drawable.item_bone_knife
)

@Blueprint
abstract class ItemBoogieBoard : RustObject(
    nameRes = R.string.item_boogie_board,
    imageRes = R.drawable.item_boogie_board
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class,
        PlugTogglePlay::class
    ],
    electricalOutputs = [
        PlugAudioOut::class
    ]
)
abstract class ItemBoomBox : RustObject(
    nameRes = R.string.item_boom_box,
    imageRes = R.drawable.item_boom_box
)

abstract class ItemBoonieHat : RustObject(
    nameRes = R.string.item_boonie_hat,
    imageRes = R.drawable.item_boonie_hat
)

@Blueprint
abstract class ItemBoots : RustObject(
    nameRes = R.string.item_boots,
    imageRes = R.drawable.item_boots
)

@Blueprint
abstract class ItemBotaBag : RustObject(
    nameRes = R.string.item_bota_bag,
    imageRes = R.drawable.item_bota_bag
)

abstract class ItemBronceEgg : RustObject(
    nameRes = R.string.item_bronze_egg,
    imageRes = R.drawable.item_bronze_egg
)

@Blueprint
abstract class ItemBucketHelmet : RustObject(
    nameRes = R.string.item_bucket_helmet,
    imageRes = R.drawable.item_bucket_helmet
)

@Blueprint
abstract class ItemBuildingPlan : RustObject(
    nameRes = R.string.item_building_plan,
    imageRes = R.drawable.item_building_plan
)

abstract class ItemBunnyEars : RustObject(
    nameRes = R.string.item_bunny_ears,
    imageRes = R.drawable.item_bunny_ears
)

abstract class ItemBunnyHat : RustObject(
    nameRes = R.string.item_bunny_hat,
    imageRes = R.drawable.item_bunny_hat
)

abstract class ItemBunnyOnesie : RustObject(
    nameRes = R.string.item_bunny_onesie,
    imageRes = R.drawable.item_bunny_onesie
)

@Blueprint
abstract class ItemBurlapGloves : RustObject(
    nameRes = R.string.item_burlap_gloves,
    imageRes = R.drawable.item_burlap_gloves
)

@Blueprint
abstract class ItemBurlapHeadwrap : RustObject(
    nameRes = R.string.item_burlap_headwrap,
    imageRes = R.drawable.item_burlap_headwrap
)

@Blueprint
abstract class ItemBurlapShirt : RustObject(
    nameRes = R.string.item_burlap_shirt,
    imageRes = R.drawable.item_burlap_shirt
)

@Blueprint
abstract class ItemBurlapShoes : RustObject(
    nameRes = R.string.item_burlap_shoes,
    imageRes = R.drawable.item_burlap_shoes
)

@Blueprint
abstract class ItemBurlapTrousers : RustObject(
    nameRes = R.string.item_burlap_trousers,
    imageRes = R.drawable.item_burlap_trousers
)

abstract class ItemBurntBearMeat : RustObject(
    nameRes = R.string.item_burnt_bear_meat,
    imageRes = R.drawable.item_burnt_bear_meat
)

abstract class ItemBurntChicken : RustObject(
    nameRes = R.string.item_burnt_chicken,
    imageRes = R.drawable.item_burnt_chicken
)

abstract class ItemBurntDeerMeat : RustObject(
    nameRes = R.string.item_burnt_deer_meat,
    imageRes = R.drawable.item_burnt_deer_meat
)

abstract class ItemBurntHorseMeat : RustObject(
    nameRes = R.string.item_burnt_horse_meat,
    imageRes = R.drawable.item_burnt_horse_meat
)

abstract class ItemBurntHumanMeat : RustObject(
    nameRes = R.string.item_burnt_human_meat,
    imageRes = R.drawable.item_burnt_human_meat
)

abstract class ItemBurntPork : RustObject(
    nameRes = R.string.item_burnt_pork,
    imageRes = R.drawable.item_burnt_pork
)

abstract class ItemBurntWolfMeat : RustObject(
    nameRes = R.string.item_burnt_wolf_meat,
    imageRes = R.drawable.item_burnt_wolf_meat
)

abstract class ItemBurstModule : RustObject(
    nameRes = R.string.item_burst_module,
    imageRes = R.drawable.item_burst_module
)

abstract class ItemButcherKnife : RustObject(
    nameRes = R.string.item_butcher_knife,
    imageRes = R.drawable.item_butcher_knife
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = [
        PlugPowerOut::class
    ]
)
abstract class ItemButton : RustObject(
    nameRes = R.string.item_button,
    imageRes = R.drawable.item_button
)

abstract class ItemCableTunnel : RustObject(
    nameRes = R.string.item_cable_tunnel,
    imageRes = R.drawable.item_cable_tunnel
)

abstract class ItemCactusFlesh : RustObject(
    nameRes = R.string.item_cactus_flesh,
    imageRes = R.drawable.item_cactus_flesh
)

abstract class ItemCamera : RustObject(
    nameRes = R.string.item_camera,
    imageRes = R.drawable.item_camera
)

@Blueprint
abstract class ItemCamperVehicleModule : RustObject(
    nameRes = R.string.item_camper_vehicle_module,
    imageRes = R.drawable.item_camper_vehicle_module
)

@Blueprint
abstract class ItemCampFire : RustObject(
    nameRes = R.string.item_camp_fire,
    imageRes = R.drawable.item_camp_fire
)

@Blueprint
abstract class ItemCanbourine : RustObject(
    nameRes = R.string.item_canbourine,
    imageRes = R.drawable.item_canbourine
)

@Blueprint
abstract class ItemCandleHat : RustObject(
    nameRes = R.string.item_candle_hat,
    imageRes = R.drawable.item_candle_hat
)

abstract class ItemCandyCane : RustObject(
    nameRes = R.string.item_candy_cane,
    imageRes = R.drawable.item_candy_cane
)

abstract class ItemCandyCaneClub : RustObject(
    nameRes = R.string.item_candy_cane_club,
    imageRes = R.drawable.item_candy_cane_club
)

abstract class ItemCanOfBeans : RustObject(
    nameRes = R.string.item_can_of_beans,
    imageRes = R.drawable.item_can_of_beans
)

abstract class ItemCanOfTuna : RustObject(
    nameRes = R.string.item_can_of_tuna,
    imageRes = R.drawable.item_can_of_tuna
)

abstract class ItemCaptainsLog : RustObject(
    nameRes = R.string.item_captains_log,
    imageRes = R.drawable.item_captains_log
)

abstract class ItemCardMovemberMoustache : RustObject(
    nameRes = R.string.item_card_movember_moustache,
    imageRes = R.drawable.item_card_movember_moustache
)

abstract class ItemCarvablePumpkin : RustObject(
    nameRes = R.string.item_carvable_pumpkin,
    imageRes = R.drawable.item_carvable_pumpkin
)

@Blueprint
abstract class ItemCassetteLong : RustObject(
    nameRes = R.string.item_cassette_long,
    imageRes = R.drawable.item_cassette_long
)

@Blueprint
abstract class ItemCassetteMedium : RustObject(
    nameRes = R.string.item_cassette_medium,
    imageRes = R.drawable.item_cassette_medium
)

@Blueprint
abstract class ItemCassetteRecorder : RustObject(
    nameRes = R.string.item_cassette_recorder,
    imageRes = R.drawable.item_cassette_recorder
)

@Blueprint
abstract class ItemCassetteShort : RustObject(
    nameRes = R.string.item_cassette_short,
    imageRes = R.drawable.item_cassette_short
)

abstract class ItemCatfish : RustObject(
    nameRes = R.string.item_catfish,
    imageRes = R.drawable.item_catfish
)

abstract class ItemCctvCamera : RustObject(
    nameRes = R.string.item_cctv_camera,
    imageRes = R.drawable.item_cctv_camera
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = [
        PlugPassthroughElectrical::class
    ]
)
abstract class ItemCeilingLight : RustObject(
    nameRes = R.string.item_ceiling_light,
    imageRes = R.drawable.item_ceiling_light
)

@Blueprint
abstract class ItemChainlinkFence : RustObject(
    nameRes = R.string.item_chainlink_fence,
    imageRes = R.drawable.item_chainlink_fence
)

@Blueprint
@DoorControllerAttachable
abstract class ItemChainlinkFenceGate : RustObject(
    nameRes = R.string.item_chainlink_fence_gate,
    imageRes = R.drawable.item_chainlink_fence_gate
)

@Blueprint
abstract class ItemChainsaw : RustObject(
    nameRes = R.string.item_chainsaw,
    imageRes = R.drawable.item_chainsaw
)

@Blueprint
abstract class ItemChair : RustObject(
    nameRes = R.string.item_chair,
    imageRes = R.drawable.item_chair
)

abstract class ItemChampagneBoomer : RustObject(
    nameRes = R.string.item_champagne_boomer,
    imageRes = R.drawable.item_champagne_boomer
)

abstract class ItemCharcoal : RustObject(
    nameRes = R.string.item_charcoal,
    imageRes = R.drawable.item_charcoal
)

abstract class ItemChickenCostume : RustObject(
    nameRes = R.string.item_chicken_costume,
    imageRes = R.drawable.item_chicken_costume
)

abstract class ItemChineseLantern : RustObject(
    nameRes = R.string.item_chinese_lantern,
    imageRes = R.drawable.item_chinese_lantern
)

abstract class ItemChineseLanternWhite : RustObject(
    nameRes = R.string.item_chinese_lantern_white,
    imageRes = R.drawable.item_chinese_lantern_white
)

abstract class ItemChippyArcadeGame : RustObject(
    nameRes = R.string.item_chippy_arcade_game,
    imageRes = R.drawable.item_chippy_arcade_game
)

abstract class ItemChocolateBar : RustObject(
    nameRes = R.string.item_chocolate_bar,
    imageRes = R.drawable.item_chocolate_bar
)

abstract class ItemChristmasDoorWreath : RustObject(
    nameRes = R.string.item_christmas_door_wreath,
    imageRes = R.drawable.item_christmas_door_wreath
)

abstract class ItemChristmasLights : RustObject(
    nameRes = R.string.item_christmas_lights,
    imageRes = R.drawable.item_christmas_lights
)

abstract class ItemChristmasTree : RustObject(
    nameRes = R.string.item_christmas_tree,
    imageRes = R.drawable.item_christmas_tree
)

abstract class ItemClanTable : RustObject(
    nameRes = R.string.item_clan_table,
    imageRes = R.drawable.item_clan_table
)

abstract class ItemClatterHelmet : RustObject(
    nameRes = R.string.item_clatter_helmet,
    imageRes = R.drawable.item_clatter_helmet
)

abstract class ItemCloth : RustObject(
    nameRes = R.string.item_cloth,
    imageRes = R.drawable.item_cloth
)

abstract class ItemCoal : RustObject(
    nameRes = R.string.item_coal,
    imageRes = R.drawable.item_coal
)

@Blueprint
abstract class ItemCockpitVehicleModule : RustObject(
    nameRes = R.string.item_cockpit_vehicle_module,
    imageRes = R.drawable.item_cockpit_vehicle_module
)

@Blueprint
abstract class ItemCockpitWithEngineVehicleModule : RustObject(
    nameRes = R.string.item_cockpit_with_engine_vehicle_module,
    imageRes = R.drawable.item_cockpit_with_engine_vehicle_module
)

@Blueprint
abstract class ItemCodeLock : RustObject(
    nameRes = R.string.item_code_lock,
    imageRes = R.drawable.item_code_lock
)

@Blueprint
abstract class ItemCoffeeCanHelmet : RustObject(
    nameRes = R.string.item_coffee_can_helmet,
    imageRes = R.drawable.item_coffee_can_helmet
)

@StorageAdaptorAttachable(slotAmount = 1)
abstract class ItemCoffin : RustObject(
    nameRes = R.string.item_coffin,
    imageRes = R.drawable.item_coffin
)

@Blueprint
abstract class ItemCombatKnife : RustObject(
    nameRes = R.string.item_combat_knife,
    imageRes = R.drawable.item_combat_knife
)

@Blueprint
abstract class ItemComposter : RustObject(
    nameRes = R.string.item_composter,
    imageRes = R.drawable.item_composter
)

@Blueprint
abstract class ItemCompoundBow : RustObject(
    nameRes = R.string.item_compound_bow,
    imageRes = R.drawable.item_compound_bow
)

@Blueprint
abstract class ItemComputerStation : RustObject(
    nameRes = R.string.item_computer_station,
    imageRes = R.drawable.item_computer_station
)

@Blueprint
abstract class ItemConcreteBarricade : RustObject(
    nameRes = R.string.item_concrete_barricade,
    imageRes = R.drawable.item_concrete_barricade
)

abstract class ItemConfettiCannon : RustObject(
    nameRes = R.string.item_confetti_cannon,
    imageRes = R.drawable.item_confetti_cannon
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerAudioIn::class
    ],
    electricalOutputs = [
        PlugAudioPassthrough::class
    ]
)
abstract class ItemConnectedSpeaker : RustObject(
    nameRes = R.string.item_connected_speaker,
    imageRes = R.drawable.item_connected_speaker
)

abstract class ItemCookedBearMeat : RustObject(
    nameRes = R.string.item_cooked_bear_meat,
    imageRes = R.drawable.item_cooked_bear_meat
)

abstract class ItemCookedChicken : RustObject(
    nameRes = R.string.item_cooked_chicken,
    imageRes = R.drawable.item_cooked_chicken
)

abstract class ItemCookedDeerMeat : RustObject(
    nameRes = R.string.item_cooked_deer_meat,
    imageRes = R.drawable.item_cooked_deer_meat
)

abstract class ItemCookedFish : RustObject(
    nameRes = R.string.item_cooked_fish,
    imageRes = R.drawable.item_cooked_fish
)

abstract class ItemCookedHorseMeat : RustObject(
    nameRes = R.string.item_cooked_horse_meat,
    imageRes = R.drawable.item_cooked_horse_meat
)

abstract class ItemCookedHumanMeat : RustObject(
    nameRes = R.string.item_cooked_human_meat,
    imageRes = R.drawable.item_cooked_human_meat
)

abstract class ItemCookedPork : RustObject(
    nameRes = R.string.item_cooked_pork,
    imageRes = R.drawable.item_cooked_pork
)

abstract class ItemCookedWolfMeat : RustObject(
    nameRes = R.string.item_cooked_wolf_meat,
    imageRes = R.drawable.item_cooked_wolf_meat
)

abstract class ItemCorn : RustObject(
    nameRes = R.string.item_corn,
    imageRes = R.drawable.item_corn
)

abstract class ItemCornClone : RustObject(
    nameRes = R.string.item_corn_clone,
    imageRes = R.drawable.item_corn_clone
)

abstract class ItemCornSeed : RustObject(
    nameRes = R.string.item_corn_seed,
    imageRes = R.drawable.item_corn_seed
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class,
        PlugClearCounter::class,
        PlugIncrementCounter::class,
        PlugDecrementCounter::class
    ],
    electricalOutputs = [
        PlugPassthroughElectrical::class
    ]
)
abstract class ItemCounter : RustObject(
    nameRes = R.string.item_counter,
    imageRes = R.drawable.item_counter
)

@Blueprint
abstract class ItemCowbell : RustObject(
    nameRes = R.string.item_cowbell,
    imageRes = R.drawable.item_cowbell
)

abstract class ItemCrateCostume : RustObject(
    nameRes = R.string.item_crate_costume,
    imageRes = R.drawable.item_crate_costume
)

@Blueprint
abstract class ItemCrossbow : RustObject(
    nameRes = R.string.item_crossbow,
    imageRes = R.drawable.item_crossbow
)

abstract class ItemCrudeOil : RustObject(
    nameRes = R.string.item_crude_oil,
    imageRes = R.drawable.item_crude_oil
)

abstract class ItemCursedCauldron : RustObject(
    nameRes = R.string.item_cursed_cauldron,
    imageRes = R.drawable.item_cursed_cauldron
)

@Blueprint
abstract class ItemCustomSmg : RustObject(
    nameRes = R.string.item_custom_smg,
    imageRes = R.drawable.item_custom_smg
)

abstract class ItemDecorativeBaubels : RustObject(
    nameRes = R.string.item_decorative_baubels,
    imageRes = R.drawable.item_decorative_baubels
)

abstract class ItemDecorativeGingerbreadMen : RustObject(
    nameRes = R.string.item_decorative_gingerbread_men,
    imageRes = R.drawable.item_decorative_gingerbread_men
)

abstract class ItemDecorativePinecones : RustObject(
    nameRes = R.string.item_decorative_pinecones,
    imageRes = R.drawable.item_decorative_pinecones
)

abstract class ItemDecorativePlasticCandyCanes : RustObject(
    nameRes = R.string.item_decorative_plastic_candy_canes,
    imageRes = R.drawable.item_decorative_plastic_candy_canes
)

abstract class ItemDecorativeTinsel : RustObject(
    nameRes = R.string.item_decorative_tinsel,
    imageRes = R.drawable.item_decorative_tinsel
)

@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = [
        PlugPassthroughElectrical::class
    ]
)
abstract class ItemDeluxeChristmasLights : RustObject(
    nameRes = R.string.item_deluxe_christmas_lights,
    imageRes = R.drawable.item_deluxe_christmas_lights
)

abstract class ItemDieselFuel : RustObject(
    nameRes = R.string.item_diesel_fuel,
    imageRes = R.drawable.item_diesel_fuel
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = [
        PlugPowerOut::class
    ]
)
abstract class ItemDigitalClock : RustObject(
    nameRes = R.string.item_digital_clock,
    imageRes = R.drawable.item_digital_clock
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPower::class
    ],
    electricalOutputs = [
        PlugPassthroughElectrical::class
    ]
)
abstract class ItemDiscoBall : RustObject(
    nameRes = R.string.item_disco_ball,
    imageRes = R.drawable.item_disco_ball
)

@Blueprint
abstract class ItemDiscoFloor : RustObject(
    nameRes = R.string.item_disco_floor,
    imageRes = R.drawable.item_disco_floor
)

@Blueprint
abstract class ItemDiverPropulsionVehicle : RustObject(
    nameRes = R.string.item_diver_propulsion_vehicle,
    imageRes = R.drawable.item_diver_propulsion_vehicle
)

abstract class ItemDivingFins : RustObject(
    nameRes = R.string.item_diving_fins,
    imageRes = R.drawable.item_diving_fins
)

abstract class ItemDivingMask : RustObject(
    nameRes = R.string.item_diving_mask,
    imageRes = R.drawable.item_diving_mask
)

abstract class ItemDivingTank : RustObject(
    nameRes = R.string.item_diving_tank,
    imageRes = R.drawable.item_diving_tank
)

abstract class ItemDoorCloser : RustObject(
    nameRes = R.string.item_door_closer,
    imageRes = R.drawable.item_door_closer
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class,
        PlugOpen::class,
        PlugClose::class
    ],
    electricalOutputs = [
        PlugPassthroughElectrical::class
    ]
)
@ItemDoorController
abstract class ItemDoorController : RustObject(
    nameRes = R.string.item_door_controller,
    imageRes = R.drawable.item_door_controller
)

abstract class ItemDoorKey : RustObject(
    nameRes = R.string.item_door_key,
    imageRes = R.drawable.item_door_key
)

@Blueprint
abstract class ItemDoubleBarrelShotgun : RustObject(
    nameRes = R.string.item_double_barrel_shotgun,
    imageRes = R.drawable.item_double_barrel_shotgun
)

abstract class ItemDoubleHorseSaddle : RustObject(
    nameRes = R.string.item_double_horse_saddle,
    imageRes = R.drawable.item_double_horse_saddle
)

abstract class ItemDoubleSignPost : RustObject(
    nameRes = R.string.item_double_sign_post,
    imageRes = R.drawable.item_double_sign_post
)

abstract class ItemDraculaCape : RustObject(
    nameRes = R.string.item_dracula_cape,
    imageRes = R.drawable.item_dracula_cape
)

abstract class ItemDraculaMask : RustObject(
    nameRes = R.string.item_dracula_mask,
    imageRes = R.drawable.item_dracula_mask
)

abstract class ItemDragonDoorKnocker : RustObject(
    nameRes = R.string.item_dragon_door_knocker,
    imageRes = R.drawable.item_dragon_door_knocker
)

abstract class ItemDragonMask : RustObject(
    nameRes = R.string.item_dragon_mask,
    imageRes = R.drawable.item_dragon_mask
)

@Blueprint
abstract class ItemDrone : RustObject(
    nameRes = R.string.item_drone,
    imageRes = R.drawable.item_drone
)

@Blueprint
@StorageAdaptorAttachable(slotAmount = 1)
abstract class ItemDropBox : RustObject(
    nameRes = R.string.item_drop_box,
    imageRes = R.drawable.item_drop_box
)

abstract class ItemDuctTape : RustObject(
    nameRes = R.string.item_duct_tape,
    imageRes = R.drawable.item_duct_tape
)

abstract class ItemEasterDoorWreath : RustObject(
    nameRes = R.string.item_easter_door_wreath,
    imageRes = R.drawable.item_easter_door_wreath
)

abstract class ItemEggBasket : RustObject(
    nameRes = R.string.item_egg_basket,
    imageRes = R.drawable.item_egg_basket
)

abstract class ItemEggSuit : RustObject(
    nameRes = R.string.item_egg_suit,
    imageRes = R.drawable.item_egg_suit
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = [
        PlugBranchOut::class,
        PlugPowerOut::class
    ]
)
abstract class ItemElectricalBranch : RustObject(
    nameRes = R.string.item_electrical_branch,
    imageRes = R.drawable.item_electrical_branch
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = []
)
@StorageAdaptorAttachable(slotAmount = 2)
abstract class ItemElectricFurnace : RustObject(
    nameRes = R.string.item_electric_furnace,
    imageRes = R.drawable.item_electric_furnace
)

abstract class ItemElectricFuse : RustObject(
    nameRes = R.string.item_electric_fuse,
    imageRes = R.drawable.item_electric_fuse
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = [
        PlugPassthroughElectrical::class
    ]
)
abstract class ItemElectricHeater : RustObject(
    nameRes = R.string.item_electric_heater,
    imageRes = R.drawable.item_electric_heater
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = []
)
abstract class ItemElevator : RustObject(
    nameRes = R.string.item_elevator,
    imageRes = R.drawable.item_elevator
)

abstract class ItemEmptyCanOfBeans : RustObject(
    nameRes = R.string.item_empty_can_of_beans,
    imageRes = R.drawable.item_empty_can_of_beans
)

@Blueprint
abstract class ItemEmptyPropaneTank : RustObject(
    nameRes = R.string.item_empty_propane_tank,
    imageRes = R.drawable.item_empty_propane_tank
)

abstract class ItemEmptyTunaCan : RustObject(
    nameRes = R.string.item_empty_tuna_can,
    imageRes = R.drawable.item_empty_tuna_can
)

@Blueprint
abstract class ItemEngineVehicleModule : RustObject(
    nameRes = R.string.item_engine_vehicle_module,
    imageRes = R.drawable.item_engine_vehicle_module
)

@Blueprint
abstract class ItemEokaPistol : RustObject(
    nameRes = R.string.item_eoka_pistol,
    imageRes = R.drawable.item_eoka_pistol
)

@Blueprint
abstract class ItemExplosives : RustObject(
    nameRes = R.string.item_explosives,
    imageRes = R.drawable.item_explosives
)

@Blueprint
abstract class ItemExplosive556RifleAmmo : RustObject(
    nameRes = R.string.item_explosive_5_56_rifle_ammo,
    imageRes = R.drawable.item_explosive_5_56_rifle_ammo
)

@Blueprint
abstract class ItemExtendedMagazine : RustObject(
    nameRes = R.string.item_extended_magazine,
    imageRes = R.drawable.item_extended_magazine
)

@Blueprint
abstract class ItemF1Grenade : RustObject(
    nameRes = R.string.item_f1_grenade,
    imageRes = R.drawable.item_f1_grenade
)

abstract class ItemFertilizer : RustObject(
    nameRes = R.string.item_fertilizer,
    imageRes = R.drawable.item_fertilizer
)

abstract class ItemFestiveDoorwayGarland : RustObject(
    nameRes = R.string.item_festive_doorway_garland,
    imageRes = R.drawable.item_festive_doorway_garland
)

abstract class ItemFestiveDoubleDoorwayGarland : RustObject(
    nameRes = R.string.item_festive_double_doorway_garland,
    imageRes = R.drawable.item_festive_double_doorway_garland
)

abstract class ItemFestiveWindowGarland : RustObject(
    nameRes = R.string.item_festive_window_garland,
    imageRes = R.drawable.item_festive_window_garland
)

abstract class ItemFirecrackerString : RustObject(
    nameRes = R.string.item_firecracker_string,
    imageRes = R.drawable.item_firecracker_string
)

@Blueprint
abstract class ItemFireArrow : RustObject(
    nameRes = R.string.item_fire_arrow,
    imageRes = R.drawable.item_fire_arrow
)

abstract class ItemFishingTackle : RustObject(
    nameRes = R.string.item_fishing_tackle,
    imageRes = R.drawable.item_fishing_tackle
)

abstract class ItemFishTrophy : RustObject(
    nameRes = R.string.item_fish_trophy,
    imageRes = R.drawable.item_fish_trophy
)

@Blueprint
abstract class ItemFlameThrower : RustObject(
    nameRes = R.string.item_flame_thrower,
    imageRes = R.drawable.item_flame_thrower
)

@Blueprint
abstract class ItemFlameTurret : RustObject(
    nameRes = R.string.item_flame_turret,
    imageRes = R.drawable.item_flame_turret
)

@Blueprint
abstract class ItemFlare : RustObject(
    nameRes = R.string.item_flare,
    imageRes = R.drawable.item_flare
)

@Blueprint
abstract class ItemFlashbang : RustObject(
    nameRes = R.string.item_flashbang,
    imageRes = R.drawable.item_flashbang
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = [
        PlugPassthroughElectrical::class
    ]
)
abstract class ItemFlasherLight : RustObject(
    nameRes = R.string.item_flasher_light,
    imageRes = R.drawable.item_flasher_light
)

@Blueprint
abstract class ItemFlashlight : RustObject(
    nameRes = R.string.item_flashlight,
    imageRes = R.drawable.item_flashlight
)

@Blueprint
abstract class ItemFlatbedVehicleModule : RustObject(
    nameRes = R.string.item_flatbed_vehicle_module,
    imageRes = R.drawable.item_flatbed_vehicle_module
)

@Blueprint
abstract class ItemFloorGrill : RustObject(
    nameRes = R.string.item_floor_grill,
    imageRes = R.drawable.item_floor_grill
)

@Blueprint
abstract class ItemFloorTriangleGrill : RustObject(
    nameRes = R.string.item_floor_triangle_grill,
    imageRes = R.drawable.item_floor_triangle_grill
)

@Blueprint
@Deployable
@WaterComponent(
    waterInputs = [
        PlugWaterIn1::class,
        PlugWaterIn2::class,
        PlugWaterIn3::class
    ],
    waterOutputs = [
        PlugWaterOut::class
    ]
)
abstract class ItemFluidCombiner : RustObject(
    nameRes = R.string.item_fluid_combiner,
    imageRes = R.drawable.item_fluid_combiner
)

@Blueprint
@Deployable
@WaterComponent(
    waterInputs = [
        PlugWaterIn::class
    ],
    waterOutputs = [
        PlugWaterOut1::class,
        PlugWaterOut2::class,
        PlugWaterOut3::class
    ]
)
abstract class ItemFluidSplitter : RustObject(
    nameRes = R.string.item_fluid_splitter,
    imageRes = R.drawable.item_fluid_splitter
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPumpPower::class,
        PlugToggle::class
    ],
    electricalOutputs = []
)
@WaterComponent(
    waterInputs = [
        PlugFluidInput::class
    ],
    waterOutputs = [
        PlugFluidOutput::class
    ]
)
abstract class ItemFluidSwitchAndPump : RustObject(
    nameRes = R.string.item_fluid_switch_and_pump,
    imageRes = R.drawable.item_fluid_switch_and_pump
)

@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugToggle::class,
        PlugTurnOn::class,
        PlugTurnOff::class
    ],
    electricalOutputs = []
)
abstract class ItemFogger3000 : RustObject(
    nameRes = R.string.item_fogger_3000,
    imageRes = R.drawable.item_fogger_3000
)

abstract class ItemFrankensteinMask : RustObject(
    nameRes = R.string.item_frankenstein_mask,
    imageRes = R.drawable.item_frankenstein_mask
)

abstract class ItemFrankensteinTable : RustObject(
    nameRes = R.string.item_frankenstein_table,
    imageRes = R.drawable.item_frankenstein_table
)

@Blueprint
@StorageAdaptorAttachable(slotAmount = 1)
abstract class ItemFridge : RustObject(
    nameRes = R.string.item_fridge,
    imageRes = R.drawable.item_fridge
)

abstract class ItemFrogBoots : RustObject(
    nameRes = R.string.item_frog_boots,
    imageRes = R.drawable.item_frog_boots
)

abstract class ItemFrontierBoltsSingleItemRack : RustObject(
    nameRes = R.string.item_frontier_bolts_single_item_rack,
    imageRes = R.drawable.item_frontier_bolts_single_item_rack
)

abstract class ItemFrontierHornsSingleItemRack : RustObject(
    nameRes = R.string.item_frontier_horns_single_item_rack,
    imageRes = R.drawable.item_frontier_horns_single_item_rack
)

abstract class ItemFrontierHorseshoeSingleItemRack : RustObject(
    nameRes = R.string.item_frontier_horseshoe_single_item_rack,
    imageRes = R.drawable.item_frontier_horseshoe_single_item_rack
)

@Blueprint
abstract class ItemFuelTankVehicleModule : RustObject(
    nameRes = R.string.item_fuel_tank_vehicle_module,
    imageRes = R.drawable.item_fuel_tank_vehicle_module
)

@Blueprint
@StorageAdaptorAttachable(slotAmount = 1)
abstract class ItemFurnace : RustObject(
    nameRes = R.string.item_furnace,
    imageRes = R.drawable.item_furnace
)

@Blueprint
@DoorControllerAttachable
abstract class ItemGarageDoor : RustObject(
    nameRes = R.string.item_garage_door,
    imageRes = R.drawable.item_garage_door
)

abstract class ItemGarrysModToolGun : RustObject(
    nameRes = R.string.item_garrys_mod_tool_gun,
    imageRes = R.drawable.item_garrys_mod_tool_gun
)

@Blueprint
abstract class ItemGasCompressionOverdrive : RustObject(
    nameRes = R.string.item_gas_compression_overdrive,
    imageRes = R.drawable.item_gas_compression_overdrive
)

abstract class ItemGasMask : RustObject(
    nameRes = R.string.item_gas_mask,
    imageRes = R.drawable.item_gas_mask
)

@Blueprint
abstract class ItemGears : RustObject(
    nameRes = R.string.item_gears,
    imageRes = R.drawable.item_gears
)

abstract class ItemGeigerCounter : RustObject(
    nameRes = R.string.item_geiger_counter,
    imageRes = R.drawable.item_geiger_counter
)

abstract class ItemGhostCostume : RustObject(
    nameRes = R.string.item_ghost_costume,
    imageRes = R.drawable.item_ghost_costume
)

abstract class ItemGiantCandyDecor : RustObject(
    nameRes = R.string.item_giant_candy_decor,
    imageRes = R.drawable.item_giant_candy_decor
)

abstract class ItemGiantLollipopDecor : RustObject(
    nameRes = R.string.item_giant_lollipop_decor,
    imageRes = R.drawable.item_giant_lollipop_decor
)

abstract class ItemGingerbreadSuit : RustObject(
    nameRes = R.string.item_gingerbread_suit,
    imageRes = R.drawable.item_gingerbread_suit
)

abstract class ItemGlowingEyes : RustObject(
    nameRes = R.string.item_glowing_eyes,
    imageRes = R.drawable.item_glowing_eyes
)

abstract class ItemGlue : RustObject(
    nameRes = R.string.item_glue,
    imageRes = R.drawable.item_glue
)

abstract class ItemGoldEgg : RustObject(
    nameRes = R.string.item_gold_egg,
    imageRes = R.drawable.item_gold_egg
)

abstract class ItemGranolaBar : RustObject(
    nameRes = R.string.item_granola_bar,
    imageRes = R.drawable.item_granola_bar
)

abstract class ItemGravestone : RustObject(
    nameRes = R.string.item_gravestone,
    imageRes = R.drawable.item_gravestone
)

abstract class ItemGraveyardFence : RustObject(
    nameRes = R.string.item_graveyard_fence,
    imageRes = R.drawable.item_graveyard_fence
)

abstract class ItemGreenBerry : RustObject(
    nameRes = R.string.item_green_berry,
    imageRes = R.drawable.item_green_berry
)

abstract class ItemGreenBerryClone : RustObject(
    nameRes = R.string.item_green_berry_clone,
    imageRes = R.drawable.item_green_berry_clone
)

abstract class ItemGreenBerrySeed : RustObject(
    nameRes = R.string.item_green_berry_seed,
    imageRes = R.drawable.item_green_berry_seed
)

abstract class ItemGreenBoomer : RustObject(
    nameRes = R.string.item_green_boomer,
    imageRes = R.drawable.item_green_boomer
)

@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = [
        PlugPassthroughElectrical::class
    ]
)
abstract class ItemGreenIndustrialWallLight : RustObject(
    nameRes = R.string.item_green_industrial_wall_light,
    imageRes = R.drawable.item_green_industrial_wall_light
)

abstract class ItemGreenKeycard : RustObject(
    nameRes = R.string.item_green_keycard,
    imageRes = R.drawable.item_green_keycard
)

abstract class ItemGreenRomanCandle : RustObject(
    nameRes = R.string.item_green_roman_candle,
    imageRes = R.drawable.item_green_roman_candle
)

abstract class ItemGrub : RustObject(
    nameRes = R.string.item_grub,
    imageRes = R.drawable.item_grub
)

@Blueprint
abstract class ItemGunPowder : RustObject(
    nameRes = R.string.item_gun_powder,
    imageRes = R.drawable.item_gun_powder
)

abstract class ItemHalloweenCandy : RustObject(
    nameRes = R.string.item_halloween_candy,
    imageRes = R.drawable.item_halloween_candy
)

@Blueprint
abstract class ItemHammer : RustObject(
    nameRes = R.string.item_hammer,
    imageRes = R.drawable.item_hammer
)

@Blueprint
abstract class ItemHandcuffs : RustObject(
    nameRes = R.string.item_handcuffs,
    imageRes = R.drawable.item_handcuffs
)

@Blueprint
abstract class ItemHandmadeFishingRod : RustObject(
    nameRes = R.string.item_handmade_fishing_rod,
    imageRes = R.drawable.item_handmade_fishing_rod
)

@Blueprint
abstract class ItemHandmadeShell : RustObject(
    nameRes = R.string.item_handmade_shell,
    imageRes = R.drawable.item_handmade_shell
)

@Blueprint
abstract class ItemHandmadeSmg : RustObject(
    nameRes = R.string.item_handmade_smg,
    imageRes = R.drawable.item_handmade_smg
)

@Blueprint
abstract class ItemHatchet : RustObject(
    nameRes = R.string.item_hatchet,
    imageRes = R.drawable.item_hatchet
)

@Blueprint
abstract class ItemHazmatSuit : RustObject(
    nameRes = R.string.item_hazmat_suit,
    imageRes = R.drawable.item_hazmat_suit
)

abstract class ItemHazmatYoutooz : RustObject(
    nameRes = R.string.item_hazmat_youtooz,
    imageRes = R.drawable.item_hazmat_youtooz
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = [
        PlugPowerOut::class
    ]
)
abstract class ItemHbhfSensor : RustObject(
    nameRes = R.string.item_hbhf_sensor,
    imageRes = R.drawable.item_hbhf_sensor
)

@Blueprint
abstract class ItemHeadset : RustObject(
    nameRes = R.string.item_headset,
    imageRes = R.drawable.item_headset
)

abstract class ItemHeadBag : RustObject(
    nameRes = R.string.item_head_bag,
    imageRes = R.drawable.item_head_bag
)

abstract class ItemHeavyFrankensteinHead : RustObject(
    nameRes = R.string.item_heavy_frankenstein_head,
    imageRes = R.drawable.item_heavy_frankenstein_head
)

abstract class ItemHeavyFrankensteinLegs : RustObject(
    nameRes = R.string.item_heavy_frankenstein_legs,
    imageRes = R.drawable.item_heavy_frankenstein_legs
)

abstract class ItemHeavyFrankensteinTorso : RustObject(
    nameRes = R.string.item_heavy_frankenstein_torso,
    imageRes = R.drawable.item_heavy_frankenstein_torso
)

@Blueprint
abstract class ItemHeavyPlateHelmet : RustObject(
    nameRes = R.string.item_heavy_plate_helmet,
    imageRes = R.drawable.item_heavy_plate_helmet
)

@Blueprint
abstract class ItemHeavyPlateJacket : RustObject(
    nameRes = R.string.item_heavy_plate_jacket,
    imageRes = R.drawable.item_heavy_plate_jacket
)

@Blueprint
abstract class ItemHeavyPlatePants : RustObject(
    nameRes = R.string.item_heavy_plate_pants,
    imageRes = R.drawable.item_heavy_plate_pants
)

abstract class ItemHeavyScientistSuit : RustObject(
    nameRes = R.string.item_heavy_scientist_suit,
    imageRes = R.drawable.item_heavy_scientist_suit
)

abstract class ItemHeavyScientistYoutooz : RustObject(
    nameRes = R.string.item_heavy_scientist_youtooz,
    imageRes = R.drawable.item_heavy_scientist_youtooz
)

abstract class ItemHempClone : RustObject(
    nameRes = R.string.item_hemp_clone,
    imageRes = R.drawable.item_hemp_clone
)

abstract class ItemHempSeed : RustObject(
    nameRes = R.string.item_hemp_seed,
    imageRes = R.drawable.item_hemp_seed
)

abstract class ItemHerring : RustObject(
    nameRes = R.string.item_herring,
    imageRes = R.drawable.item_herring
)

@Blueprint
abstract class ItemHideBoots : RustObject(
    nameRes = R.string.item_hide_boots,
    imageRes = R.drawable.item_hide_boots
)

@Blueprint
abstract class ItemHideHalterneck : RustObject(
    nameRes = R.string.item_hide_halterneck,
    imageRes = R.drawable.item_hide_halterneck
)

@Blueprint
abstract class ItemHidePants : RustObject(
    nameRes = R.string.item_hide_pants,
    imageRes = R.drawable.item_hide_pants
)

@Blueprint
abstract class ItemHidePoncho : RustObject(
    nameRes = R.string.item_hide_poncho,
    imageRes = R.drawable.item_hide_poncho
)

@Blueprint
abstract class ItemHideSkirt : RustObject(
    nameRes = R.string.item_hide_skirt,
    imageRes = R.drawable.item_hide_skirt
)

@Blueprint
abstract class ItemHideVest : RustObject(
    nameRes = R.string.item_hide_vest,
    imageRes = R.drawable.item_hide_vest
)

@Blueprint
abstract class ItemHighCaliberRevolver : RustObject(
    nameRes = R.string.item_high_caliber_revolver,
    imageRes = R.drawable.item_high_caliber_revolver
)

@Blueprint
@DoorControllerAttachable
abstract class ItemHighExternalStoneGate : RustObject(
    nameRes = R.string.item_high_external_stone_gate,
    imageRes = R.drawable.item_high_external_stone_gate
)

@Blueprint
abstract class ItemHighExternalStoneWall : RustObject(
    nameRes = R.string.item_high_external_stone_wall,
    imageRes = R.drawable.item_high_external_stone_wall
)

@Blueprint
@DoorControllerAttachable
abstract class ItemHighExternalWoodenGate : RustObject(
    nameRes = R.string.item_high_external_wooden_gate,
    imageRes = R.drawable.item_high_external_wooden_gate
)

@Blueprint
abstract class ItemHighExternalWoodenWall : RustObject(
    nameRes = R.string.item_high_external_wooden_wall,
    imageRes = R.drawable.item_high_external_wooden_wall
)

abstract class ItemHighIceWall : RustObject(
    nameRes = R.string.item_high_ice_wall,
    imageRes = R.drawable.item_high_ice_wall
)

@Blueprint
abstract class ItemHighQualityCarburetor : RustObject(
    nameRes = R.string.item_high_quality_carburetor,
    imageRes = R.drawable.item_high_quality_carburetor
)

@Blueprint
abstract class ItemHighQualityCrankshaft : RustObject(
    nameRes = R.string.item_high_quality_crankshaft,
    imageRes = R.drawable.item_high_quality_crankshaft
)

@Blueprint
abstract class ItemHighQualityHorseShoes : RustObject(
    nameRes = R.string.item_high_quality_horse_shoes,
    imageRes = R.drawable.item_high_quality_horse_shoes
)

abstract class ItemHighQualityMetal : RustObject(
    nameRes = R.string.item_high_quality_metal,
    imageRes = R.drawable.item_high_quality_metal
)

abstract class ItemHighQualityMetalOre : RustObject(
    nameRes = R.string.item_high_quality_metal_ore,
    imageRes = R.drawable.item_high_quality_metal_ore
)

@Blueprint
abstract class ItemHighQualityPistons : RustObject(
    nameRes = R.string.item_high_quality_pistons,
    imageRes = R.drawable.item_high_quality_pistons
)

@Blueprint
abstract class ItemHighQualitySparkPlugs : RustObject(
    nameRes = R.string.item_high_quality_spark_plugs,
    imageRes = R.drawable.item_high_quality_spark_plugs
)

@Blueprint
abstract class ItemHighQualityValves : RustObject(
    nameRes = R.string.item_high_quality_valves,
    imageRes = R.drawable.item_high_quality_valves
)

@Blueprint
abstract class ItemHighVelocityArrow : RustObject(
    nameRes = R.string.item_high_velocity_arrow,
    imageRes = R.drawable.item_high_velocity_arrow
)

@Blueprint
abstract class ItemHighVelocityRocket : RustObject(
    nameRes = R.string.item_high_velocity_rocket,
    imageRes = R.drawable.item_high_velocity_rocket
)

@Blueprint
abstract class ItemHitchAndTrough : RustObject(
    nameRes = R.string.item_hitch_and_trough,
    imageRes = R.drawable.item_hitch_and_trough
)

@Blueprint
abstract class ItemHmlmg : RustObject(
    nameRes = R.string.item_hmlmg,
    imageRes = R.drawable.item_hmlmg
)

abstract class ItemHoboBarrel : RustObject(
    nameRes = R.string.item_hobo_barrel,
    imageRes = R.drawable.item_hobo_barrel
)

@Blueprint
abstract class ItemHolosight : RustObject(
    nameRes = R.string.item_holosight,
    imageRes = R.drawable.item_holosight
)

@Blueprint
abstract class ItemHomemadeLandmine : RustObject(
    nameRes = R.string.item_homemade_landmine,
    imageRes = R.drawable.item_homemade_landmine
)

@Blueprint
abstract class ItemHomingMissile : RustObject(
    nameRes = R.string.item_homing_missile,
    imageRes = R.drawable.item_homing_missile
)

@Blueprint
abstract class ItemHomingMissileLauncher : RustObject(
    nameRes = R.string.item_homing_missile_launcher,
    imageRes = R.drawable.item_homing_missile_launcher
)

@Blueprint
abstract class ItemHoodie : RustObject(
    nameRes = R.string.item_hoodie,
    imageRes = R.drawable.item_hoodie
)

abstract class ItemHorizontalWeaponRack : RustObject(
    nameRes = R.string.item_horizontal_weapon_rack,
    imageRes = R.drawable.item_horizontal_weapon_rack
)

abstract class ItemHorseDung : RustObject(
    nameRes = R.string.item_horse_dung,
    imageRes = R.drawable.item_horse_dung
)

abstract class ItemHorseSaddle : RustObject(
    nameRes = R.string.item_horse_saddle,
    imageRes = R.drawable.item_horse_saddle
)

@Blueprint
@WaterTool
abstract class ItemHoseTool : RustObject(
    nameRes = R.string.item_hose_tool,
    imageRes = R.drawable.item_hose_tool
)

@Blueprint
abstract class ItemHotAirBalloonArmor : RustObject(
    nameRes = R.string.item_hot_air_balloon_armor,
    imageRes = R.drawable.item_hot_air_balloon_armor
)

@Blueprint
abstract class ItemHugeWoodenSign : RustObject(
    nameRes = R.string.item_huge_wooden_sign,
    imageRes = R.drawable.item_huge_wooden_sign
)

abstract class ItemHumanSkill : RustObject(
    nameRes = R.string.item_human_skull,
    imageRes = R.drawable.item_human_skull
)

@Blueprint
abstract class ItemHuntingBow : RustObject(
    nameRes = R.string.item_hunting_bow,
    imageRes = R.drawable.item_hunting_bow
)

@Blueprint
abstract class ItemHv556RifleAmmo : RustObject(
    nameRes = R.string.item_hv_5_56_rifle_ammo,
    imageRes = R.drawable.item_hv_5_56_rifle_ammo
)

@Blueprint
abstract class ItemHvPistolAmmo : RustObject(
    nameRes = R.string.item_hv_pistol_ammo,
    imageRes = R.drawable.item_hv_pistol_ammo
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = []
)
abstract class ItemIgniter : RustObject(
    nameRes = R.string.item_igniter,
    imageRes = R.drawable.item_igniter
)

@Blueprint
abstract class ItemImprovisedBalaclava : RustObject(
    nameRes = R.string.item_improvised_balaclava,
    imageRes = R.drawable.item_improvised_balaclava
)

@Blueprint
abstract class ItemIncendiary556RifleAmmo : RustObject(
    nameRes = R.string.item_incendiary_5_56_rifle_ammo,
    imageRes = R.drawable.item_incendiary_5_56_rifle_ammo
)

abstract class ItemIncendiaryPistolBullet : RustObject(
    nameRes = R.string.item_incendiary_pistol_bullet,
    imageRes = R.drawable.item_incendiary_pistol_bullet
)

@Blueprint
abstract class ItemIncendiaryRocket : RustObject(
    nameRes = R.string.item_incendiary_rocket,
    imageRes = R.drawable.item_incendiary_rocket
)

@Blueprint
@Deployable
@IndustrialComponent(
    industrialInputs = [
        PlugIndustrialIn1::class,
        PlugIndustrialIn2::class,
        PlugIndustrialIn3::class
    ],
    industrialOutputs = [
        PlugIndustrialOut::class
    ]
)
abstract class ItemIndustrialCombiner : RustObject(
    nameRes = R.string.item_industrial_combiner,
    imageRes = R.drawable.item_industrial_combiner
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class,
        PlugTurnOn::class,
        PlugTurnOff::class
    ],
    electricalOutputs = [
        PlugPassthroughElectrical::class,
        PlugFilterPass::class,
        PlugFilterFail::class
    ]
)
abstract class ItemIndustrialConveyor : RustObject(
    nameRes = R.string.item_industrial_conveyor,
    imageRes = R.drawable.item_industrial_conveyor
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugTurnOff::class,
        PlugTurnOn::class,
        PlugPowerIn::class,
        PlugToggle::class
    ],
    electricalOutputs = []
)
@IndustrialComponent(
    industrialInputs = [
        PlugIndustrialIn::class,
        PlugBlueprintsIn::class
    ],
    industrialOutputs = [
        PlugIndustrialOut::class,
        PlugBlueprintOut::class
    ]
)
abstract class ItemIndustrialCrafter : RustObject(
    nameRes = R.string.item_industrial_crafter,
    imageRes = R.drawable.item_industrial_crafter
)

@Blueprint
@Deployable
@IndustrialComponent(
    industrialInputs = [
        PlugIndustrialIn::class
    ],
    industrialOutputs = [
        PlugIndustrialOut1::class,
        PlugIndustrialOut2::class,
        PlugIndustrialOut3::class
    ]
)
abstract class ItemIndustrialSplitter : RustObject(
    nameRes = R.string.item_industrial_splitter,
    imageRes = R.drawable.item_industrial_splitter
)

@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = [
        PlugPassthroughElectrical::class
    ]
)
abstract class ItemIndustrialWallLight : RustObject(
    nameRes = R.string.item_industrial_wall_light,
    imageRes = R.drawable.item_industrial_wall_light
)

@Blueprint
abstract class ItemInnerTube : RustObject(
    nameRes = R.string.item_inner_tube,
    imageRes = R.drawable.item_inner_tube
)

@Blueprint
abstract class ItemInstantCamera : RustObject(
    nameRes = R.string.item_instant_camera,
    imageRes = R.drawable.item_instant_camera
)

@Blueprint
abstract class ItemJacket : RustObject(
    nameRes = R.string.item_jacket,
    imageRes = R.drawable.item_jacket
)

abstract class ItemJackhammer : RustObject(
    nameRes = R.string.item_jackhammer,
    imageRes = R.drawable.item_jackhammer
)

abstract class ItemJackOLanternAngry : RustObject(
    nameRes = R.string.item_jack_o_lantern_angry,
    imageRes = R.drawable.item_jack_o_lantern_angry
)

abstract class ItemJackOLanternHappy : RustObject(
    nameRes = R.string.item_jack_o_lantern_happy,
    imageRes = R.drawable.item_jack_o_lantern_happy
)

@Blueprint
abstract class ItemJerryCanGuitar : RustObject(
    nameRes = R.string.item_jerry_can_guitar,
    imageRes = R.drawable.item_jerry_can_guitar
)

abstract class ItemJumpsuit : RustObject(
    nameRes = R.string.item_jumpsuit,
    imageRes = R.drawable.item_jumpsuit
)

@Blueprint
abstract class ItemJunkyardDrumKit : RustObject(
    nameRes = R.string.item_junkyard_drum_kit,
    imageRes = R.drawable.item_junkyard_drum_kit
)

@Blueprint
abstract class ItemKayak : RustObject(
    nameRes = R.string.item_kayak,
    imageRes = R.drawable.item_kayak
)

@Blueprint
abstract class ItemKeyLock : RustObject(
    nameRes = R.string.item_key_lock,
    imageRes = R.drawable.item_key_lock
)

abstract class ItemL96Rifle : RustObject(
    nameRes = R.string.item_l96_rifle,
    imageRes = R.drawable.item_l96_rifle
)

@Blueprint
@DoorControllerAttachable
abstract class ItemLadderHatch : RustObject(
    nameRes = R.string.item_ladder_hatch,
    imageRes = R.drawable.item_ladder_hatch
)

@Blueprint
abstract class ItemLandscapePhotoFrame : RustObject(
    nameRes = R.string.item_landscape_photo_frame,
    imageRes = R.drawable.item_landscape_photo_frame
)

abstract class ItemLandscapePictureFrame : RustObject(
    nameRes = R.string.item_landscape_picture_frame,
    imageRes = R.drawable.item_landscape_picture_frame
)

@Blueprint
abstract class ItemLantern : RustObject(
    nameRes = R.string.item_lantern,
    imageRes = R.drawable.item_lantern
)

@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = [
        PlugPassthroughElectrical::class
    ]
)
abstract class ItemLargeAnimatedNeonSign : RustObject(
    nameRes = R.string.item_large_animated_neon_sign,
    imageRes = R.drawable.item_large_animated_neon_sign
)

abstract class ItemLargeBackpack : RustObject(
    nameRes = R.string.item_large_backpack,
    imageRes = R.drawable.item_large_backpack
)

abstract class ItemLargeBannerHanging : RustObject(
    nameRes = R.string.item_large_banner_hanging,
    imageRes = R.drawable.item_large_banner_hanging
)

abstract class ItemLargeBannerOnPole : RustObject(
    nameRes = R.string.item_large_banner_on_pole,
    imageRes = R.drawable.item_large_banner_on_pole
)

abstract class ItemLargeCandleSet : RustObject(
    nameRes = R.string.item_large_candle_set,
    imageRes = R.drawable.item_large_candle_set
)

@Blueprint
abstract class ItemLargeFlatbedVehicleModule : RustObject(
    nameRes = R.string.item_large_flatbed_vehicle_module,
    imageRes = R.drawable.item_large_flatbed_vehicle_module
)

@Blueprint
@StorageAdaptorAttachable(slotAmount = 4)
abstract class ItemLargeFurnace : RustObject(
    nameRes = R.string.item_large_furnace,
    imageRes = R.drawable.item_large_furnace
)

abstract class ItemLargeHuntingTrophy : RustObject(
    nameRes = R.string.item_large_hunting_trophy,
    imageRes = R.drawable.item_large_hunting_trophy
)

abstract class ItemLargeLootBag : RustObject(
    nameRes = R.string.item_large_loot_bag,
    imageRes = R.drawable.item_large_loot_bag
)

@Blueprint
abstract class ItemLargeMedkit : RustObject(
    nameRes = R.string.item_large_medkit,
    imageRes = R.drawable.item_large_medkit
)

@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = [
        PlugPassthroughElectrical::class
    ]
)
abstract class ItemLargeNeonSign : RustObject(
    nameRes = R.string.item_large_neon_sign,
    imageRes = R.drawable.item_large_neon_sign
)

@Blueprint
abstract class ItemLargePhotoFrame : RustObject(
    nameRes = R.string.item_large_photo_frame,
    imageRes = R.drawable.item_large_photo_frame
)

@Blueprint
abstract class ItemLargePlanterBox : RustObject(
    nameRes = R.string.item_large_planter_box,
    imageRes = R.drawable.item_large_planter_box
)

abstract class ItemLargePresent : RustObject(
    nameRes = R.string.item_large_present,
    imageRes = R.drawable.item_large_present
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = [
        PlugPowerOutput::class
    ]
)
abstract class ItemLargeRechargeableBattery : RustObject(
    nameRes = R.string.item_large_rechargeable_battery,
    imageRes = R.drawable.item_large_rechargeable_battery
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [],
    electricalOutputs = [
        PlugElectricOutput::class
    ]
)
abstract class ItemLargeSolarPanel : RustObject(
    nameRes = R.string.item_large_solar_panel,
    imageRes = R.drawable.item_large_solar_panel
)

@Blueprint
@Deployable
@WaterComponent(
    waterInputs = [
        PlugWaterIn::class
    ],
    waterOutputs = [
        PlugWaterOut::class
    ]
)
abstract class ItemLargeWaterCatcher : RustObject(
    nameRes = R.string.item_large_water_catcher,
    imageRes = R.drawable.item_large_water_catcher
)

@Blueprint
abstract class ItemLargeWoodenSign : RustObject(
    nameRes = R.string.item_large_wooden_sign,
    imageRes = R.drawable.item_large_wooden_sign
)

@Blueprint
@Deployable
@StorageAdaptorAttachable(slotAmount = 4)
@StorageMonitorAttachable
abstract class ItemLargeWoodBox : RustObject(
    nameRes = R.string.item_large_wood_box,
    imageRes = R.drawable.item_large_wood_box
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = [
        PlugPowerOut::class
    ]
)
abstract class ItemLaserDetector : RustObject(
    nameRes = R.string.item_laser_detector,
    imageRes = R.drawable.item_laser_detector
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerAudioIn::class
    ],
    electricalOutputs = [
        PlugAudioPassthrough::class
    ]
)
abstract class ItemLaserLight : RustObject(
    nameRes = R.string.item_laser_light,
    imageRes = R.drawable.item_laser_light
)

abstract class ItemLeather : RustObject(
    nameRes = R.string.item_leather,
    imageRes = R.drawable.item_leather
)

@Blueprint
abstract class ItemLeatherGloves : RustObject(
    nameRes = R.string.item_leather_gloves,
    imageRes = R.drawable.item_leather_gloves
)

@Blueprint
abstract class ItemLegacyWoodShelter : RustObject(
    nameRes = R.string.item_legacy_wood_shelter,
    imageRes = R.drawable.item_legacy_wood_shelter
)

abstract class ItemLightFrankensteinHead : RustObject(
    nameRes = R.string.item_light_frankenstein_head,
    imageRes = R.drawable.item_light_frankenstein_head
)

abstract class ItemLightFrankensteinLegs : RustObject(
    nameRes = R.string.item_light_frankenstein_legs,
    imageRes = R.drawable.item_light_frankenstein_legs
)

abstract class ItemLightFrankensteinTorso : RustObject(
    nameRes = R.string.item_light_frankenstein_torso,
    imageRes = R.drawable.item_light_frankenstein_torso
)

@Blueprint
abstract class ItemLocker : RustObject(
    nameRes = R.string.item_locker,
    imageRes = R.drawable.item_locker
)

@Blueprint
abstract class ItemLongsleeveTShirt : RustObject(
    nameRes = R.string.item_longsleeve_t_shirt,
    imageRes = R.drawable.item_longsleeve_t_shirt
)

@Blueprint
abstract class ItemLongsword : RustObject(
    nameRes = R.string.item_longsword,
    imageRes = R.drawable.item_longsword
)

@Blueprint
abstract class ItemLowGradeFuel : RustObject(
    nameRes = R.string.item_low_grade_fuel,
    imageRes = R.drawable.item_low_grade_fuel
)

@Blueprint
abstract class ItemLowQualityCarburetor : RustObject(
    nameRes = R.string.item_low_quality_carburetor,
    imageRes = R.drawable.item_low_quality_carburetor
)

@Blueprint
abstract class ItemLowQualityCrankshaft : RustObject(
    nameRes = R.string.item_low_quality_crankshaft,
    imageRes = R.drawable.item_low_quality_crankshaft
)

@Blueprint
abstract class ItemLowQualityPistons : RustObject(
    nameRes = R.string.item_low_quality_pistons,
    imageRes = R.drawable.item_low_quality_pistons
)

@Blueprint
abstract class ItemLowQualitySparkPlugs : RustObject(
    nameRes = R.string.item_low_quality_spark_plugs,
    imageRes = R.drawable.item_low_quality_spark_plugs
)

@Blueprint
abstract class ItemLowQualityValves : RustObject(
    nameRes = R.string.item_low_quality_valves,
    imageRes = R.drawable.item_low_quality_valves
)

abstract class ItemLr300AssaultRifle : RustObject(
    nameRes = R.string.item_lr_300_assault_rifle,
    imageRes = R.drawable.item_lr_300_assault_rifle
)

abstract class ItemLumberjackHoodie : RustObject(
    nameRes = R.string.item_lumberjack_hoodie,
    imageRes = R.drawable.item_lumberjack_hoodie
)

abstract class ItemM249 : RustObject(
    nameRes = R.string.item_m249,
    imageRes = R.drawable.item_m249
)

abstract class ItemM39Rifle : RustObject(
    nameRes = R.string.item_m39_rifle,
    imageRes = R.drawable.item_m39_rifle
)

abstract class ItemM4Shotgun : RustObject(
    nameRes = R.string.item_m4_shotgun,
    imageRes = R.drawable.item_m4_shotgun
)

abstract class ItemM92Pistol : RustObject(
    nameRes = R.string.item_m92_pistol,
    imageRes = R.drawable.item_m92_pistol
)

@Blueprint
abstract class ItemMace : RustObject(
    nameRes = R.string.item_mace,
    imageRes = R.drawable.item_mace
)

@Blueprint
abstract class ItemMachete : RustObject(
    nameRes = R.string.item_machete,
    imageRes = R.drawable.item_machete
)

@Blueprint
abstract class ItemMailBox : RustObject(
    nameRes = R.string.item_mail_box,
    imageRes = R.drawable.item_mail_box
)

@Blueprint
abstract class ItemMedicalSyringe : RustObject(
    nameRes = R.string.item_medical_syringe,
    imageRes = R.drawable.item_medical_syringe
)

@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = [
        PlugPassthroughElectrical::class
    ]
)
abstract class ItemMediumAnimatedNeonSign : RustObject(
    nameRes = R.string.item_medium_animated_neon_sign,
    imageRes = R.drawable.item_medium_animated_neon_sign
)

abstract class ItemMediumFrankensteinHead : RustObject(
    nameRes = R.string.item_medium_frankenstein_head,
    imageRes = R.drawable.item_medium_frankenstein_head
)

abstract class ItemMediumFrankensteinLegs : RustObject(
    nameRes = R.string.item_medium_frankenstein_legs,
    imageRes = R.drawable.item_medium_frankenstein_legs
)

abstract class ItemMediumFrankensteinTorso : RustObject(
    nameRes = R.string.item_medium_frankenstein_torso,
    imageRes = R.drawable.item_medium_frankenstein_torso
)

abstract class ItemMediumLootBag : RustObject(
    nameRes = R.string.item_medium_loot_bag,
    imageRes = R.drawable.item_medium_loot_bag
)

@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = [
        PlugPassthroughElectrical::class
    ]
)
abstract class ItemMediumNeonSign : RustObject(
    nameRes = R.string.item_medium_neon_sign,
    imageRes = R.drawable.item_medium_neon_sign
)

abstract class ItemMediumPresent : RustObject(
    nameRes = R.string.item_medium_present,
    imageRes = R.drawable.item_medium_present
)

@Blueprint
abstract class ItemMediumQualityCarburetor : RustObject(
    nameRes = R.string.item_medium_quality_carburetor,
    imageRes = R.drawable.item_medium_quality_carburetor
)

@Blueprint
abstract class ItemMediumQualityCrankshaft : RustObject(
    nameRes = R.string.item_medium_quality_crankshaft,
    imageRes = R.drawable.item_medium_quality_crankshaft
)

@Blueprint
abstract class ItemMediumQualityPistons : RustObject(
    nameRes = R.string.item_medium_quality_pistons,
    imageRes = R.drawable.item_medium_quality_pistons
)

@Blueprint
abstract class ItemMediumQualitySparkPlugs : RustObject(
    nameRes = R.string.item_medium_quality_spark_plugs,
    imageRes = R.drawable.item_medium_quality_spark_plugs
)

@Blueprint
abstract class ItemMediumQualityValves : RustObject(
    nameRes = R.string.item_medium_quality_valves,
    imageRes = R.drawable.item_medium_quality_valves
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = [
        PlugPowerOutput::class
    ]
)
abstract class ItemMediumRechargeableBattery : RustObject(
    nameRes = R.string.item_medium_rechargeable_battery,
    imageRes = R.drawable.item_medium_rechargeable_battery
)

@Blueprint
abstract class ItemMediumWoodenSign : RustObject(
    nameRes = R.string.item_medium_wooden_sign,
    imageRes = R.drawable.item_medium_wooden_sign
)

@Blueprint
abstract class ItemMegaphone : RustObject(
    nameRes = R.string.item_megaphone,
    imageRes = R.drawable.item_megaphone
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class,
        PlugSet::class,
        PlugReset::class,
        PlugToggle::class
    ],
    electricalOutputs = [
        PlugInvertedOutput::class,
        PlugOutput::class
    ]
)
abstract class ItemMemoryCell : RustObject(
    nameRes = R.string.item_memory_cell,
    imageRes = R.drawable.item_memory_cell
)

@Blueprint
abstract class ItemMetalBarricade : RustObject(
    nameRes = R.string.item_metal_barricade,
    imageRes = R.drawable.item_metal_barricade
)

@Blueprint
abstract class ItemMetalBlade : RustObject(
    nameRes = R.string.item_metal_blade,
    imageRes = R.drawable.item_metal_blade
)

@Blueprint
abstract class ItemMetalChestPlate : RustObject(
    nameRes = R.string.item_metal_chest_plate,
    imageRes = R.drawable.item_metal_chest_plate
)

@Blueprint
abstract class ItemMetalDetector : RustObject(
    nameRes = R.string.item_metal_detector,
    imageRes = R.drawable.item_metal_detector
)

@Blueprint
abstract class ItemMetalFacemask : RustObject(
    nameRes = R.string.item_metal_facemask,
    imageRes = R.drawable.item_metal_facemask
)

abstract class ItemMetalFragments : RustObject(
    nameRes = R.string.item_metal_fragments,
    imageRes = R.drawable.item_metal_fragments
)

@Blueprint
abstract class ItemMetalHorizontalEmbrasure : RustObject(
    nameRes = R.string.item_metal_horizontal_embrasure,
    imageRes = R.drawable.item_metal_horizontal_embrasure
)

abstract class ItemMetalOre : RustObject(
    nameRes = R.string.item_metal_ore,
    imageRes = R.drawable.item_metal_ore
)

@Blueprint
abstract class ItemMetalPipe : RustObject(
    nameRes = R.string.item_metal_pipe,
    imageRes = R.drawable.item_metal_pipe
)

@Blueprint
abstract class ItemMetalShopFront : RustObject(
    nameRes = R.string.item_metal_shop_front,
    imageRes = R.drawable.item_metal_shop_front
)

@Blueprint
abstract class ItemMetalSpring : RustObject(
    nameRes = R.string.item_metal_spring,
    imageRes = R.drawable.item_metal_spring
)

@Blueprint
abstract class ItemMetalVerticalEmbrasure : RustObject(
    nameRes = R.string.item_metal_vertical_embrasure,
    imageRes = R.drawable.item_metal_vertical_embrasure
)

@Blueprint
abstract class ItemMetalWindowBars : RustObject(
    nameRes = R.string.item_metal_window_bars,
    imageRes = R.drawable.item_metal_window_bars
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = [
        PlugAudioOut::class
    ]
)
abstract class ItemMicrophoneStand : RustObject(
    nameRes = R.string.item_microphone_stand,
    imageRes = R.drawable.item_microphone_stand
)

abstract class ItemMilitaryFlameThrower : RustObject(
    nameRes = R.string.item_military_flame_thrower,
    imageRes = R.drawable.item_military_flame_thrower
)

abstract class ItemMinecartPlanter : RustObject(
    nameRes = R.string.item_minecart_planter,
    imageRes = R.drawable.item_minecart_planter
)

@Blueprint
abstract class ItemMinersHat : RustObject(
    nameRes = R.string.item_miners_hat,
    imageRes = R.drawable.item_miners_hat
)

abstract class ItemMinigun : RustObject(
    nameRes = R.string.item_minigun,
    imageRes = R.drawable.item_minigun
)

abstract class ItemMiningQuarry : RustObject(
    nameRes = R.string.item_mining_quarry,
    imageRes = R.drawable.item_mining_quarry
)

abstract class ItemMinnows : RustObject(
    nameRes = R.string.item_minnows,
    imageRes = R.drawable.item_minnows
)

@Blueprint
abstract class ItemMixingTable : RustObject(
    nameRes = R.string.item_mixing_table,
    imageRes = R.drawable.item_mixing_table
)

abstract class ItemMlrsAimingModule : RustObject(
    nameRes = R.string.item_mlrs_aiming_module,
    imageRes = R.drawable.item_mlrs_aiming_module
)

abstract class ItemMlrsRocket : RustObject(
    nameRes = R.string.item_mlrs_rocket,
    imageRes = R.drawable.item_mlrs_rocket
)

@Blueprint
abstract class ItemMobilePhone : RustObject(
    nameRes = R.string.item_mobile_phone,
    imageRes = R.drawable.item_mobile_phone
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = []
)
abstract class ItemModularCarLift : RustObject(
    nameRes = R.string.item_modular_car_lift,
    imageRes = R.drawable.item_modular_car_lift
)

@Blueprint
abstract class ItemMolotovCocktail : RustObject(
    nameRes = R.string.item_molotov_cocktail,
    imageRes = R.drawable.item_molotov_cocktail
)

abstract class ItemMovemberMoustache : RustObject(
    nameRes = R.string.item_movember_moustache,
    imageRes = R.drawable.item_movember_moustache
)

@Blueprint
abstract class ItemMp5a4 : RustObject(
    nameRes = R.string.item_mp5a4,
    imageRes = R.drawable.item_mp5a4
)

abstract class ItemMultipleGrenadeLauncher : RustObject(
    nameRes = R.string.item_multiple_grenade_launcher,
    imageRes = R.drawable.item_multiple_grenade_launcher
)

abstract class ItemMummyMask : RustObject(
    nameRes = R.string.item_mummy_mask,
    imageRes = R.drawable.item_mummy_mask
)

abstract class ItemMummySuit : RustObject(
    nameRes = R.string.item_mummy_suit,
    imageRes = R.drawable.item_mummy_suit
)

abstract class ItemMushroom : RustObject(
    nameRes = R.string.item_mushroom,
    imageRes = R.drawable.item_mushroom
)

@Blueprint
abstract class ItemMuzzleBoost : RustObject(
    nameRes = R.string.item_muzzle_boost,
    imageRes = R.drawable.item_muzzle_boost
)

@Blueprint
abstract class ItemMuzzleBrake : RustObject(
    nameRes = R.string.item_muzzle_brake,
    imageRes = R.drawable.item_muzzle_brake
)

@Blueprint
abstract class ItemNailgun : RustObject(
    nameRes = R.string.item_nailgun,
    imageRes = R.drawable.item_nailgun
)

@Blueprint
abstract class ItemNailgunNails : RustObject(
    nameRes = R.string.item_nailgun_nails,
    imageRes = R.drawable.item_nailgun_nails
)

abstract class ItemNestHat : RustObject(
    nameRes = R.string.item_nest_hat,
    imageRes = R.drawable.item_nest_hat
)

@Blueprint
abstract class ItemNetting : RustObject(
    nameRes = R.string.item_netting,
    imageRes = R.drawable.item_netting
)

abstract class ItemNewYearGong : RustObject(
    nameRes = R.string.item_new_year_gong,
    imageRes = R.drawable.item_new_year_gong
)

@Blueprint
abstract class ItemNightVisionGoggles : RustObject(
    nameRes = R.string.item_night_vision_goggles,
    imageRes = R.drawable.item_night_vision_goggles
)

abstract class ItemNinjaSuit : RustObject(
    nameRes = R.string.item_ninja_suit,
    imageRes = R.drawable.item_ninja_suit
)

@Blueprint
abstract class ItemNote : RustObject(
    nameRes = R.string.item_note,
    imageRes = R.drawable.item_note
)

abstract class ItemNvgmScientistSuit : RustObject(
    nameRes = R.string.item_nvgm_scientist_suit,
    imageRes = R.drawable.item_nvgm_scientist_suit
)

abstract class ItemOneSidedTownSignPost : RustObject(
    nameRes = R.string.item_one_sided_town_sign_post,
    imageRes = R.drawable.item_one_sided_town_sign_post
)

abstract class ItemOrangeBoomer : RustObject(
    nameRes = R.string.item_orange_boomer,
    imageRes = R.drawable.item_orange_boomer
)

abstract class ItemOrangeRoughy : RustObject(
    nameRes = R.string.item_orange_roughy,
    imageRes = R.drawable.item_orange_roughy
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugInputA::class,
        PlugInputB::class
    ],
    electricalOutputs = [
        PlugPowerOut::class
    ]
)
abstract class ItemOrSwitch : RustObject(
    nameRes = R.string.item_or_switch,
    imageRes = R.drawable.item_or_switch
)

abstract class ItemOxMask : RustObject(
    nameRes = R.string.item_ox_mask,
    imageRes = R.drawable.item_ox_mask
)

@Blueprint
abstract class ItemPaddle : RustObject(
    nameRes = R.string.item_paddle,
    imageRes = R.drawable.item_paddle
)

@Blueprint
abstract class ItemPaddlingPool : RustObject(
    nameRes = R.string.item_paddling_pool,
    imageRes = R.drawable.item_paddling_pool
)

abstract class ItemPaintedEgg : RustObject(
    nameRes = R.string.item_painted_egg,
    imageRes = R.drawable.item_painted_egg
)

@Blueprint
abstract class ItemPants : RustObject(
    nameRes = R.string.item_pants,
    imageRes = R.drawable.item_pants
)

@Blueprint
abstract class ItemPanFlute : RustObject(
    nameRes = R.string.item_pan_flute,
    imageRes = R.drawable.item_pan_flute
)

abstract class ItemPaper : RustObject(
    nameRes = R.string.item_paper,
    imageRes = R.drawable.item_paper
)

abstract class ItemPaperMap : RustObject(
    nameRes = R.string.item_paper_map,
    imageRes = R.drawable.item_paper_map
)

@Blueprint
abstract class ItemParachute : RustObject(
    nameRes = R.string.item_parachute,
    imageRes = R.drawable.item_parachute
)

@Blueprint
abstract class ItemPartyHat : RustObject(
    nameRes = R.string.item_party_hat,
    imageRes = R.drawable.item_party_hat
)

@Blueprint
abstract class ItemPassengerVehicleModule : RustObject(
    nameRes = R.string.item_passenger_vehicle_module,
    imageRes = R.drawable.item_passenger_vehicle_module
)

abstract class ItemPatternBoomer : RustObject(
    nameRes = R.string.item_pattern_boomer,
    imageRes = R.drawable.item_pattern_boomer
)

abstract class ItemPhotograph : RustObject(
    nameRes = R.string.item_photograph,
    imageRes = R.drawable.item_photograph
)

@Blueprint
abstract class ItemPickaxe : RustObject(
    nameRes = R.string.item_pickaxe,
    imageRes = R.drawable.item_pickaxe
)

abstract class ItemPickles : RustObject(
    nameRes = R.string.item_pickles,
    imageRes = R.drawable.item_pickles
)

abstract class ItemPinata : RustObject(
    nameRes = R.string.item_pinata,
    imageRes = R.drawable.item_pinata
)

@Blueprint
@IndustrialTool
abstract class ItemPipeTool : RustObject(
    nameRes = R.string.item_pipe_tool,
    imageRes = R.drawable.item_pipe_tool
)

@Blueprint
abstract class ItemPistolBullet : RustObject(
    nameRes = R.string.item_pistol_bullet,
    imageRes = R.drawable.item_pistol_bullet
)

abstract class ItemPitchfork : RustObject(
    nameRes = R.string.item_pitchfork,
    imageRes = R.drawable.item_pitchfork
)

abstract class ItemPlantFiber : RustObject(
    nameRes = R.string.item_plant_fiber,
    imageRes = R.drawable.item_plant_fiber
)

abstract class ItemPlumbersTrumpet : RustObject(
    nameRes = R.string.item_plumbers_trumpet,
    imageRes = R.drawable.item_plumbers_trumpet
)

abstract class ItemPookieBear : RustObject(
    nameRes = R.string.item_pookie_bear,
    imageRes = R.drawable.item_pookie_bear
)

@Blueprint
abstract class ItemPortableBoomBox : RustObject(
    nameRes = R.string.item_portable_boom_box,
    imageRes = R.drawable.item_portable_boom_box
)

@Blueprint
abstract class ItemPortraitPhotoFrame : RustObject(
    nameRes = R.string.item_portrait_photo_frame,
    imageRes = R.drawable.item_portrait_photo_frame
)

abstract class ItemPortraitPictureFrame : RustObject(
    nameRes = R.string.item_portrait_picture_frame,
    imageRes = R.drawable.item_portrait_picture_frame
)

abstract class ItemPotato : RustObject(
    nameRes = R.string.item_potato,
    imageRes = R.drawable.item_potato
)

abstract class ItemPotatoClone : RustObject(
    nameRes = R.string.item_potato_clone,
    imageRes = R.drawable.item_potato_clone
)

abstract class ItemPotatoSeed : RustObject(
    nameRes = R.string.item_potato_seed,
    imageRes = R.drawable.item_potato_seed
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = []
)
@WaterComponent(
    waterInputs = [
        PlugWaterIn::class
    ],
    waterOutputs = [
        PlugWaterOut::class
    ]
)
abstract class ItemPoweredWaterPurifier : RustObject(
    nameRes = R.string.item_powered_water_purifier,
    imageRes = R.drawable.item_powered_water_purifier
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = [
        PlugPowerOut::class
    ]
)
abstract class ItemPressurePad : RustObject(
    nameRes = R.string.item_pressure_pad,
    imageRes = R.drawable.item_pressure_pad
)

@Blueprint
abstract class ItemPrisonerHood : RustObject(
    nameRes = R.string.item_prisoner_hood,
    imageRes = R.drawable.item_prisoner_hood
)

@Blueprint
@DoorControllerAttachable
abstract class ItemPrisonCellGate : RustObject(
    nameRes = R.string.item_prison_cell_gate,
    imageRes = R.drawable.item_prison_cell_gate
)

@Blueprint
abstract class ItemPrisonCellWall : RustObject(
    nameRes = R.string.item_prison_cell_wall,
    imageRes = R.drawable.item_prison_cell_wall
)

abstract class ItemPrototype17 : RustObject(
    nameRes = R.string.item_prototype_17,
    imageRes = R.drawable.item_prototype_17
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = []
)
abstract class ItemPtzCctvCamera : RustObject(
    nameRes = R.string.item_ptz_cctv_camera,
    imageRes = R.drawable.item_ptz_cctv_camera
)

abstract class ItemPumpkin : RustObject(
    nameRes = R.string.item_pumpkin,
    imageRes = R.drawable.item_pumpkin
)

abstract class ItemPumpkinBasket : RustObject(
    nameRes = R.string.item_pumpkin_basket,
    imageRes = R.drawable.item_pumpkin_basket
)

abstract class ItemPumpkinPlantClone : RustObject(
    nameRes = R.string.item_pumpkin_plant_clone,
    imageRes = R.drawable.item_pumpkin_plant_clone
)

abstract class ItemPumpkinSeed : RustObject(
    nameRes = R.string.item_pumpkin_seed,
    imageRes = R.drawable.item_pumpkin_seed
)

abstract class ItemPumpJack : RustObject(
    nameRes = R.string.item_pump_jack,
    imageRes = R.drawable.item_pump_jack
)

@Blueprint
abstract class ItemPumpShotgun : RustObject(
    nameRes = R.string.item_pump_shotgun,
    imageRes = R.drawable.item_pump_shotgun
)

abstract class ItemPureAntiRadTea : RustObject(
    nameRes = R.string.item_pure_anti_rad_tea,
    imageRes = R.drawable.item_pure_anti_rad_tea
)

abstract class ItemPureHealingTea : RustObject(
    nameRes = R.string.item_pure_healing_tea,
    imageRes = R.drawable.item_pure_healing_tea
)

abstract class ItemPureMaxHealthTea : RustObject(
    nameRes = R.string.item_pure_max_health_tea,
    imageRes = R.drawable.item_pure_max_health_tea
)

abstract class ItemPureOreTea : RustObject(
    nameRes = R.string.item_pure_ore_tea,
    imageRes = R.drawable.item_pure_ore_tea
)

abstract class ItemPureRadRemovalTea : RustObject(
    nameRes = R.string.item_pure_rad_removal_tea,
    imageRes = R.drawable.item_pure_rad_removal_tea
)

abstract class ItemPureScrapTea : RustObject(
    nameRes = R.string.item_pure_scrap_tea,
    imageRes = R.drawable.item_pure_scrap_tea
)

abstract class ItemPureWoodTea : RustObject(
    nameRes = R.string.item_pure_wood_tea,
    imageRes = R.drawable.item_pure_wood_tea
)

abstract class ItemPurpleSunglasses : RustObject(
    nameRes = R.string.item_purple_sunglasses,
    imageRes = R.drawable.item_purple_sunglasses
)

@Blueprint
abstract class ItemPythonRevolver : RustObject(
    nameRes = R.string.item_python_revolver,
    imageRes = R.drawable.item_python_revolver
)

abstract class ItemRabbitMask : RustObject(
    nameRes = R.string.item_rabbit_mask,
    imageRes = R.drawable.item_rabbit_mask
)

abstract class ItemRadioactiveWater : RustObject(
    nameRes = R.string.item_radioactive_water,
    imageRes = R.drawable.item_radioactive_water
)

abstract class ItemRadRemovalTea : RustObject(
    nameRes = R.string.item_rad_removal_tea,
    imageRes = R.drawable.item_rad_removal_tea
)

abstract class ItemRailRoadPlanter : RustObject(
    nameRes = R.string.item_rail_road_planter,
    imageRes = R.drawable.item_rail_road_planter
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class,
        PlugSet::class,
        PlugReset::class
    ],
    electricalOutputs = [
        PlugPowerOut::class
    ]
)
abstract class ItemRandSwitch : RustObject(
    nameRes = R.string.item_rand_switch,
    imageRes = R.drawable.item_rand_switch
)

abstract class ItemRatMask : RustObject(
    nameRes = R.string.item_rat_mask,
    imageRes = R.drawable.item_rat_mask
)

abstract class ItemRawBearMeat : RustObject(
    nameRes = R.string.item_raw_bear_meat,
    imageRes = R.drawable.item_raw_bear_meat
)

abstract class ItemRawChickenBreast : RustObject(
    nameRes = R.string.item_raw_chicken_breast,
    imageRes = R.drawable.item_raw_chicken_breast
)

abstract class ItemRawDeerMeat : RustObject(
    nameRes = R.string.item_raw_deer_meat,
    imageRes = R.drawable.item_raw_deer_meat
)

abstract class ItemRawFish : RustObject(
    nameRes = R.string.item_raw_fish,
    imageRes = R.drawable.item_raw_fish
)

abstract class ItemRawHorseMeat : RustObject(
    nameRes = R.string.item_raw_horse_meat,
    imageRes = R.drawable.item_raw_horse_meat
)

abstract class ItemRawHumanMeat : RustObject(
    nameRes = R.string.item_raw_human_meat,
    imageRes = R.drawable.item_raw_human_meat
)

abstract class ItemRawPork : RustObject(
    nameRes = R.string.item_raw_pork,
    imageRes = R.drawable.item_raw_pork
)

abstract class ItemRawWolfMeat : RustObject(
    nameRes = R.string.item_raw_wolf_meat,
    imageRes = R.drawable.item_raw_wolf_meat
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class,
        PlugReset::class,
        PlugLower::class
    ],
    electricalOutputs = [
        PlugPowerOut::class
    ]
)
abstract class ItemReactiveTarget : RustObject(
    nameRes = R.string.item_reactive_target,
    imageRes = R.drawable.item_reactive_target
)

@Blueprint
abstract class ItemRearSeatsVehicleModule : RustObject(
    nameRes = R.string.item_rear_seats_vehicle_module,
    imageRes = R.drawable.item_rear_seats_vehicle_module
)

abstract class ItemRedBerry : RustObject(
    nameRes = R.string.item_red_berry,
    imageRes = R.drawable.item_red_berry
)

abstract class ItemRedBerryClone : RustObject(
    nameRes = R.string.item_red_berry_clone,
    imageRes = R.drawable.item_red_berry_clone
)

abstract class ItemRedBerrySeed : RustObject(
    nameRes = R.string.item_red_berry_seed,
    imageRes = R.drawable.item_red_berry_seed
)

abstract class ItemRedBoomer : RustObject(
    nameRes = R.string.item_red_boomer,
    imageRes = R.drawable.item_red_boomer
)

@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = [
        PlugPassthroughElectrical::class
    ]
)
abstract class ItemRedIndustrialWallLight : RustObject(
    nameRes = R.string.item_red_industrial_wall_light,
    imageRes = R.drawable.item_red_industrial_wall_light
)

abstract class ItemRedKeycard : RustObject(
    nameRes = R.string.item_red_keycard,
    imageRes = R.drawable.item_red_keycard
)

abstract class ItemRedRomanCandle : RustObject(
    nameRes = R.string.item_red_roman_candle,
    imageRes = R.drawable.item_red_roman_candle
)

abstract class ItemRedVolcanoFirework : RustObject(
    nameRes = R.string.item_red_volcano_firework,
    imageRes = R.drawable.item_red_volcano_firework
)

abstract class ItemReindeerAntlers : RustObject(
    nameRes = R.string.item_reindeer_antlers,
    imageRes = R.drawable.item_reindeer_antlers
)

@Blueprint
abstract class ItemReinforcedGlassWindow : RustObject(
    nameRes = R.string.item_reinforced_glass_window,
    imageRes = R.drawable.item_reinforced_glass_window
)

@Blueprint
abstract class ItemRepairBench : RustObject(
    nameRes = R.string.item_repair_bench,
    imageRes = R.drawable.item_repair_bench
)

abstract class ItemResearchPaper : RustObject(
    nameRes = R.string.item_research_paper,
    imageRes = R.drawable.item_research_paper
)

@Blueprint
abstract class ItemResearchTable : RustObject(
    nameRes = R.string.item_research_table,
    imageRes = R.drawable.item_research_table
)

@Blueprint
abstract class ItemRevolver : RustObject(
    nameRes = R.string.item_revolver,
    imageRes = R.drawable.item_revolver
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = []
)
abstract class ItemRfBroadcaster : RustObject(
    nameRes = R.string.item_rf_broadcaster,
    imageRes = R.drawable.item_rf_broadcaster
)

@Blueprint
abstract class ItemRfPager : RustObject(
    nameRes = R.string.item_rf_pager,
    imageRes = R.drawable.item_rf_pager
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = [
        PlugPowerOut::class
    ]
)
abstract class ItemRfReceiver : RustObject(
    nameRes = R.string.item_rf_receiver,
    imageRes = R.drawable.item_rf_receiver
)

@Blueprint
abstract class ItemRfTransmitter : RustObject(
    nameRes = R.string.item_rf_transmitter,
    imageRes = R.drawable.item_rf_transmitter
)

abstract class ItemRifleBody : RustObject(
    nameRes = R.string.item_rifle_body,
    imageRes = R.drawable.item_rifle_body
)

@Blueprint
abstract class ItemRiotHelmet : RustObject(
    nameRes = R.string.item_riot_helmet,
    imageRes = R.drawable.item_riot_helmet
)

@Blueprint
abstract class ItemRoadsignGloves : RustObject(
    nameRes = R.string.item_roadsign_gloves,
    imageRes = R.drawable.item_roadsign_gloves
)

@Blueprint
abstract class ItemRoadsignHorseArmor : RustObject(
    nameRes = R.string.item_roadsign_horse_armor,
    imageRes = R.drawable.item_roadsign_horse_armor
)

@Blueprint
abstract class ItemRoadSigns : RustObject(
    nameRes = R.string.item_road_signs,
    imageRes = R.drawable.item_road_signs
)

@Blueprint
abstract class ItemRoadSignJacket : RustObject(
    nameRes = R.string.item_road_sign_jacket,
    imageRes = R.drawable.item_road_sign_jacket
)

@Blueprint
abstract class ItemRoadSignKilt : RustObject(
    nameRes = R.string.item_road_sign_kilt,
    imageRes = R.drawable.item_road_sign_kilt
)

@Blueprint
abstract class ItemRock : RustObject(
    nameRes = R.string.item_rock,
    imageRes = R.drawable.item_rock
)

@Blueprint
abstract class ItemRocket : RustObject(
    nameRes = R.string.item_rocket,
    imageRes = R.drawable.item_rocket
)

@Blueprint
abstract class ItemRocketLauncher : RustObject(
    nameRes = R.string.item_rocket_launcher,
    imageRes = R.drawable.item_rocket_launcher
)

abstract class ItemRockingChair : RustObject(
    nameRes = R.string.item_rocking_chair,
    imageRes = R.drawable.item_rocking_chair
)

@Blueprint
@ElectricalComponent(
    electricalInputs = [
        PlugRootPower1::class,
        PlugRootPower2::class
    ],
    electricalOutputs = [
        PlugCombinedPowerOut::class
    ]
)
abstract class ItemRootCombiner : RustObject(
    nameRes = R.string.item_root_combiner,
    imageRes = R.drawable.item_root_combiner
)

abstract class ItemRope : RustObject(
    nameRes = R.string.item_rope,
    imageRes = R.drawable.item_rope
)

abstract class ItemRottenApple : RustObject(
    nameRes = R.string.item_rotten_apple,
    imageRes = R.drawable.item_rotten_apple
)

@Blueprint
abstract class ItemRug : RustObject(
    nameRes = R.string.item_rug,
    imageRes = R.drawable.item_rug
)

@Blueprint
abstract class ItemRugBearSkin : RustObject(
    nameRes = R.string.item_rug_bear_skin,
    imageRes = R.drawable.item_rug_bear_skin
)

abstract class ItemRustigeEggBlue : RustObject(
    nameRes = R.string.item_rustige_egg_blue,
    imageRes = R.drawable.item_rustige_egg_blue
)

abstract class ItemRustigeEggGreen : RustObject(
    nameRes = R.string.item_rustige_egg_green,
    imageRes = R.drawable.item_rustige_egg_green
)

abstract class ItemRustigeEggIvory : RustObject(
    nameRes = R.string.item_rustige_egg_ivory,
    imageRes = R.drawable.item_rustige_egg_ivory
)

abstract class ItemRustigeEggPurple : RustObject(
    nameRes = R.string.item_rustige_egg_purple,
    imageRes = R.drawable.item_rustige_egg_purple
)

abstract class ItemRustigeEggRed : RustObject(
    nameRes = R.string.item_rustige_egg_red,
    imageRes = R.drawable.item_rustige_egg_red
)

abstract class ItemRustigeEggWhite : RustObject(
    nameRes = R.string.item_rustige_egg_white,
    imageRes = R.drawable.item_rustige_egg_white
)

@Blueprint
abstract class ItemSaddleBag : RustObject(
    nameRes = R.string.item_saddle_bag,
    imageRes = R.drawable.item_saddle_bag
)

abstract class ItemSalmon : RustObject(
    nameRes = R.string.item_salmon,
    imageRes = R.drawable.item_salmon
)

abstract class ItemSaltWater : RustObject(
    nameRes = R.string.item_salt_water,
    imageRes = R.drawable.item_salt_water
)

@Blueprint
abstract class ItemSalvagedAxe : RustObject(
    nameRes = R.string.item_salvaged_axe,
    imageRes = R.drawable.item_salvaged_axe
)

@Blueprint
abstract class ItemSalvagedCleaver : RustObject(
    nameRes = R.string.item_salvaged_cleaver,
    imageRes = R.drawable.item_salvaged_cleaver
)

@Blueprint
abstract class ItemSalvagedHammer : RustObject(
    nameRes = R.string.item_salvaged_hammer,
    imageRes = R.drawable.item_salvaged_hammer
)

@Blueprint
abstract class ItemSalvagedIcepick : RustObject(
    nameRes = R.string.item_salvaged_icepick,
    imageRes = R.drawable.item_salvaged_icepick
)

@Blueprint
abstract class ItemSalvagedShelves : RustObject(
    nameRes = R.string.item_salvaged_shelves,
    imageRes = R.drawable.item_salvaged_shelves
)

@Blueprint
abstract class ItemSalvagedSword : RustObject(
    nameRes = R.string.item_salvaged_sword,
    imageRes = R.drawable.item_salvaged_sword
)

@Blueprint
abstract class ItemSamAmmo : RustObject(
    nameRes = R.string.item_sam_ammo,
    imageRes = R.drawable.item_sam_ammo
)

@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class,
        PlugInvertMode::class
    ],
    electricalOutputs = [
        PlugPassthroughElectrical::class,
        PlugHasTarget::class,
        PlugLowAmmo::class,
        PlugNoAmmo::class
    ]
)
abstract class ItemSamSite : RustObject(
    nameRes = R.string.item_sam_site,
    imageRes = R.drawable.item_sam_site
)

@Blueprint
abstract class ItemSandbagBarricade : RustObject(
    nameRes = R.string.item_sandbag_barricade,
    imageRes = R.drawable.item_sandbag_barricade
)

abstract class ItemSantaBeard : RustObject(
    nameRes = R.string.item_santa_beard,
    imageRes = R.drawable.item_santa_beard
)

abstract class ItemSantaHat : RustObject(
    nameRes = R.string.item_santa_hat,
    imageRes = R.drawable.item_santa_hat
)

abstract class ItemSardine : RustObject(
    nameRes = R.string.item_sardine,
    imageRes = R.drawable.item_sardine
)

@Blueprint
abstract class ItemSatchelCharge : RustObject(
    nameRes = R.string.item_satchel_charge,
    imageRes = R.drawable.item_satchel_charge
)

abstract class ItemScarecrow : RustObject(
    nameRes = R.string.item_scarecrow,
    imageRes = R.drawable.item_scarecrow
)

abstract class ItemScarecrowSuit : RustObject(
    nameRes = R.string.item_scarecrow_suit,
    imageRes = R.drawable.item_scarecrow_suit
)

abstract class ItemScarecrowWrap : RustObject(
    nameRes = R.string.item_scarecrow_wrap,
    imageRes = R.drawable.item_scarecrow_wrap
)

abstract class ItemScientistSuit : RustObject(
    nameRes = R.string.item_scientist_suit,
    imageRes = R.drawable.item_scientist_suit
)

abstract class ItemScrap : RustObject(
    nameRes = R.string.item_scrap,
    imageRes = R.drawable.item_scrap
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = [
        PlugPassthroughElectrical::class
    ]
)
abstract class ItemSearchLight : RustObject(
    nameRes = R.string.item_search_light,
    imageRes = R.drawable.item_search_light
)

@Blueprint
abstract class ItemSecretlabChair : RustObject(
    nameRes = R.string.item_secretlab_chair,
    imageRes = R.drawable.item_secretlab_chair
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = [
        PlugPowerOut::class
    ]
)
abstract class ItemSeismicSensor : RustObject(
    nameRes = R.string.item_seismic_sensor,
    imageRes = R.drawable.item_seismic_sensor
)

abstract class ItemSemiAutomaticBody : RustObject(
    nameRes = R.string.item_semi_automatic_body,
    imageRes = R.drawable.item_semi_automatic_body
)

@Blueprint
abstract class ItemSemiAutomaticPistol : RustObject(
    nameRes = R.string.item_semi_automatic_pistol,
    imageRes = R.drawable.item_semi_automatic_pistol
)

@Blueprint
abstract class ItemSemiAutomaticRifle : RustObject(
    nameRes = R.string.item_semi_automatic_rifle,
    imageRes = R.drawable.item_semi_automatic_rifle
)

@Blueprint
abstract class ItemSewingKit : RustObject(
    nameRes = R.string.item_sewing_kit,
    imageRes = R.drawable.item_sewing_kit
)

abstract class ItemSheetMetal : RustObject(
    nameRes = R.string.item_sheet_metal,
    imageRes = R.drawable.item_sheet_metal
)

@Blueprint
@DoorControllerAttachable
abstract class ItemSheetMetalDoor : RustObject(
    nameRes = R.string.item_sheet_metal_door,
    imageRes = R.drawable.item_sheet_metal_door
)

@Blueprint
@DoorControllerAttachable
abstract class ItemSheetMetalDoubleDoor : RustObject(
    nameRes = R.string.item_sheet_metal_double_door,
    imageRes = R.drawable.item_sheet_metal_double_door
)

@Blueprint
abstract class ItemShirt : RustObject(
    nameRes = R.string.item_shirt,
    imageRes = R.drawable.item_shirt
)

@Blueprint
@DoorControllerAttachable
abstract class ItemShopFront : RustObject(
    nameRes = R.string.item_shop_front,
    imageRes = R.drawable.item_shop_front
)

@Blueprint
abstract class ItemShorts : RustObject(
    nameRes = R.string.item_shorts,
    imageRes = R.drawable.item_shorts
)

abstract class ItemShortIceWall : RustObject(
    nameRes = R.string.item_short_ice_wall,
    imageRes = R.drawable.item_short_ice_wall
)

@Blueprint
abstract class ItemShotgunTrap : RustObject(
    nameRes = R.string.item_shotgun_trap,
    imageRes = R.drawable.item_shotgun_trap
)

abstract class ItemShovel : RustObject(
    nameRes = R.string.item_shovel,
    imageRes = R.drawable.item_shovel
)

@Blueprint
abstract class ItemShovelBass : RustObject(
    nameRes = R.string.item_shovel_bass,
    imageRes = R.drawable.item_shovel_bass
)

abstract class ItemSickle : RustObject(
    nameRes = R.string.item_sickle,
    imageRes = R.drawable.item_sickle
)

@Blueprint
abstract class ItemSilencer : RustObject(
    nameRes = R.string.item_silencer,
    imageRes = R.drawable.item_silencer
)

abstract class ItemSilverEgg : RustObject(
    nameRes = R.string.item_silver_egg,
    imageRes = R.drawable.item_silver_egg
)

@Blueprint
abstract class ItemSimpleHandmadeSight : RustObject(
    nameRes = R.string.item_simple_handmade_sight,
    imageRes = R.drawable.item_simple_handmade_sight
)

@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = [
        PlugPassthroughElectrical::class
    ]
)
abstract class ItemSimpleLight : RustObject(
    nameRes = R.string.item_simple_light,
    imageRes = R.drawable.item_simple_light
)

abstract class ItemSingleHorseSaddle : RustObject(
    nameRes = R.string.item_single_horse_saddle,
    imageRes = R.drawable.item_single_horse_saddle
)

abstract class ItemSingleSignPost : RustObject(
    nameRes = R.string.item_single_sign_post,
    imageRes = R.drawable.item_single_sign_post
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = [
        PlugPassthroughElectrical::class
    ]
)
abstract class ItemSirenLight : RustObject(
    nameRes = R.string.item_siren_light,
    imageRes = R.drawable.item_siren_light
)

abstract class ItemSkinningKnife : RustObject(
    nameRes = R.string.item_skinning_knife,
    imageRes = R.drawable.item_skinning_knife
)

@Blueprint
abstract class ItemSks : RustObject(
    nameRes = R.string.item_sks,
    imageRes = R.drawable.item_sks
)

abstract class ItemSkullDoorKnocker : RustObject(
    nameRes = R.string.item_skull_door_knocker,
    imageRes = R.drawable.item_skull_door_knocker
)

abstract class ItemSkullFirePit : RustObject(
    nameRes = R.string.item_skull_fire_pit,
    imageRes = R.drawable.item_skull_fire_pit
)

abstract class ItemSkullSpikes : RustObject(
    nameRes = R.string.item_skull_spikes,
    imageRes = R.drawable.item_skull_spikes
)

abstract class ItemSkullTrophy : RustObject(
    nameRes = R.string.item_skull_trophy,
    imageRes = R.drawable.item_skull_trophy
)

abstract class ItemSkyLantern : RustObject(
    nameRes = R.string.item_sky_lantern,
    imageRes = R.drawable.item_sky_lantern
)

abstract class ItemSled : RustObject(
    nameRes = R.string.item_sled,
    imageRes = R.drawable.item_sled
)

@Blueprint
abstract class ItemSleepingBag : RustObject(
    nameRes = R.string.item_sleeping_bag,
    imageRes = R.drawable.item_sleeping_bag
)

@Blueprint
abstract class ItemSmallBackpack : RustObject(
    nameRes = R.string.item_small_backpack,
    imageRes = R.drawable.item_small_backpack
)

abstract class ItemSmallCandleSet : RustObject(
    nameRes = R.string.item_small_candle_set,
    imageRes = R.drawable.item_small_candle_set
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugForceStart::class,
        PlugForceStop::class
    ],
    electricalOutputs = [
        PlugPowerOut::class
    ]
)
abstract class ItemSmallGenerator : RustObject(
    nameRes = R.string.item_small_generator,
    imageRes = R.drawable.item_small_generator
)

abstract class ItemSmallHuntingTrophy : RustObject(
    nameRes = R.string.item_small_hunting_trophy,
    imageRes = R.drawable.item_small_hunting_trophy
)

abstract class ItemSmallLootBag : RustObject(
    nameRes = R.string.item_small_loot_bag,
    imageRes = R.drawable.item_small_loot_bag
)

@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = [
        PlugPassthroughElectrical::class
    ]
)
abstract class ItemSmallNeonSign : RustObject(
    nameRes = R.string.item_small_neon_sign,
    imageRes = R.drawable.item_small_neon_sign
)

@Blueprint
@StorageAdaptorAttachable(slotAmount = 1)
abstract class ItemSmallOilRefinery : RustObject(
    nameRes = R.string.item_small_oil_refinery,
    imageRes = R.drawable.item_small_oil_refinery
)

@Blueprint
abstract class ItemSmallPlanterBox : RustObject(
    nameRes = R.string.item_small_planter_box,
    imageRes = R.drawable.item_small_planter_box
)

abstract class ItemSmallPresent : RustObject(
    nameRes = R.string.item_small_present,
    imageRes = R.drawable.item_small_present
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = [
        PlugPowerOutput::class
    ]
)
abstract class ItemSmallRechargeableBattery : RustObject(
    nameRes = R.string.item_small_rechargeable_battery,
    imageRes = R.drawable.item_small_rechargeable_battery
)

abstract class ItemShark : RustObject(
    nameRes = R.string.item_small_shark,
    imageRes = R.drawable.item_small_shark
)

@Blueprint
abstract class ItemSmallStash : RustObject(
    nameRes = R.string.item_small_stash,
    imageRes = R.drawable.item_small_stash
)

abstract class ItemSmallStocking : RustObject(
    nameRes = R.string.item_small_stocking,
    imageRes = R.drawable.item_small_stocking
)

abstract class ItemSmallTrout : RustObject(
    nameRes = R.string.item_small_trout,
    imageRes = R.drawable.item_small_trout
)

abstract class ItemSmallWaterBottle : RustObject(
    nameRes = R.string.item_small_water_bottle,
    imageRes = R.drawable.item_small_water_bottle
)

@Blueprint
@Deployable
@WaterComponent(
    waterInputs = [
        PlugWaterIn::class
    ],
    waterOutputs = [
        PlugWaterOut::class
    ]
)
abstract class ItemSmallWaterCatcher : RustObject(
    nameRes = R.string.item_small_water_catcher,
    imageRes = R.drawable.item_small_water_catcher
)

@Blueprint
abstract class ItemSmallWoodenSign : RustObject(
    nameRes = R.string.item_small_wooden_sign,
    imageRes = R.drawable.item_small_wooden_sign
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = [
        PlugPowerOut::class
    ]
)
abstract class ItemSmartAlarm : RustObject(
    nameRes = R.string.item_smart_alarm,
    imageRes = R.drawable.item_smart_alarm
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class,
        PlugSwitchOn::class,
        PlugSwitchOff::class
    ],
    electricalOutputs = [
        PlugPowerOut::class
    ]
)
abstract class ItemSmartSwitch : RustObject(
    nameRes = R.string.item_smart_switch,
    imageRes = R.drawable.item_smart_switch
)

abstract class ItemSmgBody : RustObject(
    nameRes = R.string.item_smg_body,
    imageRes = R.drawable.item_smg_body
)

@Blueprint
abstract class ItemSmokeGrenade : RustObject(
    nameRes = R.string.item_smoke_grenade,
    imageRes = R.drawable.item_smoke_grenade
)

abstract class ItemSmokeRocketWip : RustObject(
    nameRes = R.string.item_smoke_rocket_wip,
    imageRes = R.drawable.item_smoke_rocket_wip
)

@Blueprint
abstract class ItemSnapTrap : RustObject(
    nameRes = R.string.item_snap_trap,
    imageRes = R.drawable.item_snap_trap
)

abstract class ItemSnowball : RustObject(
    nameRes = R.string.item_snowball,
    imageRes = R.drawable.item_snowball
)

abstract class ItemSnowballGun : RustObject(
    nameRes = R.string.item_snowball_gun,
    imageRes = R.drawable.item_snowball_gun
)

abstract class ItemSnowman : RustObject(
    nameRes = R.string.item_snowman,
    imageRes = R.drawable.item_snowman
)

abstract class ItemSnowmanHelmet : RustObject(
    nameRes = R.string.item_snowman_helmet,
    imageRes = R.drawable.item_snowman_helmet
)

@Blueprint
abstract class ItemSnowJacket : RustObject(
    nameRes = R.string.item_snow_jacket,
    imageRes = R.drawable.item_snow_jacket
)

@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugToggle::class,
        PlugTurnOn::class,
        PlugTurnOff::class
    ],
    electricalOutputs = []
)
abstract class ItemSnowMachine : RustObject(
    nameRes = R.string.item_snow_machine,
    imageRes = R.drawable.item_snow_machine
)

abstract class ItemSofa : RustObject(
    nameRes = R.string.item_sofa,
    imageRes = R.drawable.item_sofa
)

abstract class ItemSofaPattern : RustObject(
    nameRes = R.string.item_sofa_pattern,
    imageRes = R.drawable.item_sofa_pattern
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerAudioIn::class
    ],
    electricalOutputs = [
        PlugAudioPassthrough::class
    ]
)
abstract class ItemSoundLight : RustObject(
    nameRes = R.string.item_sound_light,
    imageRes = R.drawable.item_sound_light
)

@Blueprint
abstract class ItemSousaphone : RustObject(
    nameRes = R.string.item_sousaphone,
    imageRes = R.drawable.item_sousaphone
)

abstract class ItemSpas12Shotgun : RustObject(
    nameRes = R.string.item_spas_12_shotgun,
    imageRes = R.drawable.item_spas_12_shotgun
)

@Blueprint
abstract class ItemSpeargun : RustObject(
    nameRes = R.string.item_speargun,
    imageRes = R.drawable.item_speargun
)

@Blueprint
abstract class ItemSpeargunSpear : RustObject(
    nameRes = R.string.item_speargun_spear,
    imageRes = R.drawable.item_speargun_spear
)

abstract class ItemSpiderWebs : RustObject(
    nameRes = R.string.item_spider_webs,
    imageRes = R.drawable.item_spider_webs
)

@Blueprint
abstract class ItemSpinningWheel : RustObject(
    nameRes = R.string.item_spinning_wheel,
    imageRes = R.drawable.item_spinning_wheel
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = [
        PlugPowerOut1::class,
        PlugPowerOut2::class,
        PlugPowerOut3::class
    ]
)
abstract class ItemSplitter : RustObject(
    nameRes = R.string.item_splitter,
    imageRes = R.drawable.item_splitter
)

abstract class ItemSpoiledChicken : RustObject(
    nameRes = R.string.item_spoiled_chicken,
    imageRes = R.drawable.item_spoiled_chicken
)

abstract class ItemSpoiledHumanMeat : RustObject(
    nameRes = R.string.item_spoiled_human_meat,
    imageRes = R.drawable.item_spoiled_human_meat
)

abstract class ItemSpoiledWolfMeat : RustObject(
    nameRes = R.string.item_spoiled_wolf_meat,
    imageRes = R.drawable.item_spoiled_wolf_meat
)

@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugTurnOn::class,
        PlugTurnOff::class
    ],
    electricalOutputs = []
)
abstract class ItemSpookySpeaker : RustObject(
    nameRes = R.string.item_spooky_speaker,
    imageRes = R.drawable.item_spooky_speaker
)

@Blueprint
abstract class ItemSprayCan : RustObject(
    nameRes = R.string.item_spray_can,
    imageRes = R.drawable.item_spray_can
)

@Blueprint
@Deployable
@WaterComponent(
    waterInputs = [
        PlugWaterIn::class
    ],
    waterOutputs = [
        PlugPassthroughWater::class
    ]
)
abstract class ItemSprinkler : RustObject(
    nameRes = R.string.item_sprinkler,
    imageRes = R.drawable.item_sprinkler
)

abstract class ItemStarTreeTopper : RustObject(
    nameRes = R.string.item_star_tree_topper,
    imageRes = R.drawable.item_star_tree_topper
)

abstract class ItemSticks : RustObject(
    nameRes = R.string.item_sticks,
    imageRes = R.drawable.item_sticks
)

abstract class ItemStones : RustObject(
    nameRes = R.string.item_stones,
    imageRes = R.drawable.item_stones
)

@Blueprint
abstract class ItemStoneBarricade : RustObject(
    nameRes = R.string.item_stone_barricade,
    imageRes = R.drawable.item_stone_barricade
)

@Blueprint
abstract class ItemStoneFireplace : RustObject(
    nameRes = R.string.item_stone_fireplace,
    imageRes = R.drawable.item_stone_fireplace
)

@Blueprint
abstract class ItemStoneHatchet : RustObject(
    nameRes = R.string.item_stone_hatchet,
    imageRes = R.drawable.item_stone_hatchet
)

@Blueprint
abstract class ItemStonePickaxe : RustObject(
    nameRes = R.string.item_stone_pickaxe,
    imageRes = R.drawable.item_stone_pickaxe
)

@Blueprint
abstract class ItemStoneSpear : RustObject(
    nameRes = R.string.item_stone_spear,
    imageRes = R.drawable.item_stone_spear
)

@Blueprint
@Deployable
@IndustrialComponent(
    industrialInputs = [
        PlugIndustrialIn::class
    ],
    industrialOutputs = [
        PlugIndustrialOut::class
    ]
)
@ItemStorageAdaptor
abstract class ItemStorageAdaptor : RustObject(
    nameRes = R.string.item_storage_adaptor,
    imageRes = R.drawable.item_storage_adaptor
)

@StorageAdaptorAttachable(slotAmount = 4)
@StorageMonitorAttachable
abstract class ItemStorageBarrelHorizontal : RustObject(
    nameRes = R.string.item_storage_barrel_horizontal,
    imageRes = R.drawable.item_storage_barrel_horizontal
)

@StorageAdaptorAttachable(slotAmount = 4)
@StorageMonitorAttachable
abstract class ItemStorageBarrelVertical : RustObject(
    nameRes = R.string.item_storage_barrel_vertical,
    imageRes = R.drawable.item_storage_barrel_vertical
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = [
        PlugPowerOut::class
    ]
)
@ItemStorageMonitor
abstract class ItemStorageMonitor : RustObject(
    nameRes = R.string.item_storage_monitor,
    imageRes = R.drawable.item_storage_monitor
)

@Blueprint
abstract class ItemStorageVehicleModule : RustObject(
    nameRes = R.string.item_storage_vehicle_module,
    imageRes = R.drawable.item_storage_vehicle_module
)

@Blueprint
abstract class ItemStrengthenedGlassWindow : RustObject(
    nameRes = R.string.item_strengthened_glass_window,
    imageRes = R.drawable.item_strengthened_glass_window
)

abstract class ItemStrobeLight : RustObject(
    nameRes = R.string.item_strobe_light,
    imageRes = R.drawable.item_strobe_light
)

abstract class ItemSulfur : RustObject(
    nameRes = R.string.item_sulfur,
    imageRes = R.drawable.item_sulfur
)

abstract class ItemSulfurOre : RustObject(
    nameRes = R.string.item_sulfur_ore,
    imageRes = R.drawable.item_sulfur_ore
)

@Blueprint
abstract class ItemSunglasses : RustObject(
    nameRes = R.string.item_sunglasses,
    imageRes = R.drawable.item_sunglasses
)

abstract class ItemSuperSerum : RustObject(
    nameRes = R.string.item_super_serum,
    imageRes = R.drawable.item_super_serum
)

abstract class ItemSuperStocking : RustObject(
    nameRes = R.string.item_super_stocking,
    imageRes = R.drawable.item_super_stocking
)

abstract class ItemSupplySignal : RustObject(
    nameRes = R.string.item_supply_signal,
    imageRes = R.drawable.item_supply_signal
)

abstract class ItemSurgeonScrubs : RustObject(
    nameRes = R.string.item_surgeon_scrubs,
    imageRes = R.drawable.item_surgeon_scrubs
)

@Blueprint
abstract class ItemSurveyCharge : RustObject(
    nameRes = R.string.item_survey_charge,
    imageRes = R.drawable.item_survey_charge
)

@Blueprint
abstract class ItemSurvivalFishTrap : RustObject(
    nameRes = R.string.item_survival_fish_trap,
    imageRes = R.drawable.item_survival_fish_trap
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class,
        PlugSwitchOn::class,
        PlugSwitchOff::class
    ],
    electricalOutputs = [
        PlugPowerOut::class
    ]
)
abstract class ItemSwitch : RustObject(
    nameRes = R.string.item_switch,
    imageRes = R.drawable.item_switch
)

@Blueprint
abstract class ItemTable : RustObject(
    nameRes = R.string.item_table,
    imageRes = R.drawable.item_table
)

abstract class ItemTacticalGloves : RustObject(
    nameRes = R.string.item_tactical_gloves,
    imageRes = R.drawable.item_tactical_gloves
)

abstract class ItemTallPictureFrame : RustObject(
    nameRes = R.string.item_tall_picture_frame,
    imageRes = R.drawable.item_tall_picture_frame
)

abstract class ItemTallWeaponRack : RustObject(
    nameRes = R.string.item_tall_weapon_rack,
    imageRes = R.drawable.item_tall_weapon_rack
)

@Blueprint
abstract class ItemTankTop : RustObject(
    nameRes = R.string.item_tank_top,
    imageRes = R.drawable.item_tank_top
)

abstract class ItemTargetingComputer : RustObject(
    nameRes = R.string.item_targeting_computer,
    imageRes = R.drawable.item_targeting_computer
)

abstract class ItemTarp : RustObject(
    nameRes = R.string.item_tarp,
    imageRes = R.drawable.item_tarp
)

@Blueprint
abstract class ItemTaxiVehicleModule : RustObject(
    nameRes = R.string.item_taxi_vehicle_module,
    imageRes = R.drawable.item_taxi_vehicle_module
)

abstract class ItemTechTrash : RustObject(
    nameRes = R.string.item_tech_trash,
    imageRes = R.drawable.item_tech_trash
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = [
        PlugCallPassthrough::class
    ]
)
abstract class ItemTelephone : RustObject(
    nameRes = R.string.item_telephone,
    imageRes = R.drawable.item_telephone
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = []
)
abstract class ItemTeslaCoil : RustObject(
    nameRes = R.string.item_tesla_coil,
    imageRes = R.drawable.item_tesla_coil
)

@Deployable
@ElectricalComponent(
    electricalInputs = [],
    electricalOutputs = [
        PlugPowerOutput1::class,
        PlugPowerOutput2::class,
        PlugPowerOutput3::class
    ]
)
abstract class ItemTestGenerator : RustObject(
    nameRes = R.string.item_test_generator,
    imageRes = R.drawable.item_test_generator
)

@Blueprint
abstract class ItemThompson : RustObject(
    nameRes = R.string.item_thompson,
    imageRes = R.drawable.item_thompson
)

abstract class ItemTigerMask : RustObject(
    nameRes = R.string.item_tiger_mask,
    imageRes = R.drawable.item_tiger_mask
)

@Blueprint
abstract class ItemTimedExplosiveCharge : RustObject(
    nameRes = R.string.item_timed_explosive_charge,
    imageRes = R.drawable.item_timed_explosive_charge
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class,
        PlugToggleOn::class
    ],
    electricalOutputs = [
        PlugPowerOut::class
    ]
)
abstract class ItemTimer : RustObject(
    nameRes = R.string.item_timer,
    imageRes = R.drawable.item_timer
)

@Blueprint
abstract class ItemTinCanAlarm : RustObject(
    nameRes = R.string.item_tin_can_alarm,
    imageRes = R.drawable.item_tin_can_alarm
)

@Blueprint
@Deployable
@StorageAdaptorAttachable(slotAmount = 2)
@StorageMonitorAttachable
abstract class ItemToolCupboard : RustObject(
    nameRes = R.string.item_tool_cupboard,
    imageRes = R.drawable.item_tool_cupboard
)

@Blueprint
abstract class ItemTorch : RustObject(
    nameRes = R.string.item_torch,
    imageRes = R.drawable.item_torch
)

abstract class ItemTorchHolder : RustObject(
    nameRes = R.string.item_torch_holder,
    imageRes = R.drawable.item_torch_holder
)

@Blueprint
abstract class ItemTorpedo : RustObject(
    nameRes = R.string.item_torpedo,
    imageRes = R.drawable.item_torpedo
)

abstract class ItemTreeLights : RustObject(
    nameRes = R.string.item_tree_lights,
    imageRes = R.drawable.item_tree_lights
)

@Blueprint
@DoorControllerAttachable
abstract class ItemTriangleLadderHatch : RustObject(
    nameRes = R.string.item_triangle_ladder_hatch,
    imageRes = R.drawable.item_triangle_ladder_hatch
)

abstract class ItemTunaCanLamp : RustObject(
    nameRes = R.string.item_tuna_can_lamp,
    imageRes = R.drawable.item_tuna_can_lamp
)

abstract class ItemTwitchRivalsTrophy : RustObject(
    nameRes = R.string.item_twitch_rivals_trophy,
    imageRes = R.drawable.item_twitch_rivals_trophy
)

abstract class ItemTwitchRivalsTrophy2023 : RustObject(
    nameRes = R.string.item_twitch_rivals_trophy_2023,
    imageRes = R.drawable.item_twitch_rivals_trophy_2023
)

abstract class ItemTwoSidedHangingSign : RustObject(
    nameRes = R.string.item_two_sided_hanging_sign,
    imageRes = R.drawable.item_two_sided_hanging_sign
)

abstract class ItemTwoSidedOrnateHangingSign : RustObject(
    nameRes = R.string.item_two_sided_ornate_hanging_sign,
    imageRes = R.drawable.item_two_sided_ornate_hanging_sign
)

abstract class ItemTwoSidedTownSignPost : RustObject(
    nameRes = R.string.item_two_sided_town_sign_post,
    imageRes = R.drawable.item_two_sided_town_sign_post
)

@Blueprint
abstract class ItemTShirt : RustObject(
    nameRes = R.string.item_t_shirt,
    imageRes = R.drawable.item_t_shirt
)

abstract class ItemVampireStake : RustObject(
    nameRes = R.string.item_vampire_stake,
    imageRes = R.drawable.item_vampire_stake
)

@Blueprint
@StorageAdaptorAttachable(slotAmount = 1)
@StorageMonitorAttachable
abstract class ItemVendingMachine : RustObject(
    nameRes = R.string.item_vending_machine,
    imageRes = R.drawable.item_vending_machine
)

abstract class ItemVioletBoomer : RustObject(
    nameRes = R.string.item_violet_boomer,
    imageRes = R.drawable.item_violet_boomer
)

abstract class ItemVioletRomanCandle : RustObject(
    nameRes = R.string.item_violet_roman_candle,
    imageRes = R.drawable.item_violet_roman_candle
)

abstract class ItemVioletVolcanoFirework : RustObject(
    nameRes = R.string.item_violet_volcano_firework,
    imageRes = R.drawable.item_violet_volcano_firework
)

abstract class ItemVodkaBottle : RustObject(
    nameRes = R.string.item_vodka_bottle,
    imageRes = R.drawable.item_vodka_bottle
)

@Blueprint
abstract class ItemWallpaper : RustObject(
    nameRes = R.string.item_wallpaper,
    imageRes = R.drawable.item_wallpaper
)

abstract class ItemWantedPoster : RustObject(
    nameRes = R.string.item_wanted_poster,
    imageRes = R.drawable.item_wanted_poster
)

@Blueprint
abstract class ItemWatchTower : RustObject(
    nameRes = R.string.item_watch_tower,
    imageRes = R.drawable.item_watch_tower
)

abstract class ItemWater : RustObject(
    nameRes = R.string.item_water,
    imageRes = R.drawable.item_water
)

@Blueprint
abstract class ItemWaterpipeShotgun : RustObject(
    nameRes = R.string.item_waterpipe_shotgun,
    imageRes = R.drawable.item_waterpipe_shotgun
)

abstract class ItemWaterwellNpcJumpsuit : RustObject(
    nameRes = R.string.item_waterwell_npc_jumpsuit,
    imageRes = R.drawable.item_waterwell_npc_jumpsuit
)

@Blueprint
@Deployable
@WaterComponent(
    waterInputs = [
        PlugWaterIn::class
    ],
    waterOutputs = [
        PlugWaterOut::class
    ]
)
abstract class ItemWaterBarrel : RustObject(
    nameRes = R.string.item_water_barrel,
    imageRes = R.drawable.item_water_barrel
)

@Blueprint
abstract class ItemWaterBucket : RustObject(
    nameRes = R.string.item_water_bucket,
    imageRes = R.drawable.item_water_bucket
)

@Blueprint
abstract class ItemWaterGun : RustObject(
    nameRes = R.string.item_water_gun,
    imageRes = R.drawable.item_water_gun
)

abstract class ItemWaterJug : RustObject(
    nameRes = R.string.item_water_jug,
    imageRes = R.drawable.item_water_jug
)

@Blueprint
abstract class ItemWaterPistol : RustObject(
    nameRes = R.string.item_water_pistol,
    imageRes = R.drawable.item_water_pistol
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerIn::class
    ],
    electricalOutputs = []
)
@WaterComponent(
    waterInputs = [],
    waterOutputs = [
        PlugWaterOutput::class
    ]
)
abstract class ItemWaterPump : RustObject(
    nameRes = R.string.item_water_pump,
    imageRes = R.drawable.item_water_pump
)

@Blueprint
abstract class ItemWaterPurifier : RustObject(
    nameRes = R.string.item_water_purifier,
    imageRes = R.drawable.item_water_purifier
)

@Blueprint
abstract class ItemWeaponFlashlight : RustObject(
    nameRes = R.string.item_weapon_flashlight,
    imageRes = R.drawable.item_weapon_flashlight
)

@Blueprint
abstract class ItemWeaponLasersight : RustObject(
    nameRes = R.string.item_weapon_lasersight,
    imageRes = R.drawable.item_weapon_lasersight
)

abstract class ItemWeaponRackStand : RustObject(
    nameRes = R.string.item_weapon_rack_stand,
    imageRes = R.drawable.item_weapon_rack_stand
)

abstract class ItemWetsuit : RustObject(
    nameRes = R.string.item_wetsuit,
    imageRes = R.drawable.item_wetsuit
)

@Blueprint
abstract class ItemWheelbarrowPiano : RustObject(
    nameRes = R.string.item_wheelbarrow_piano,
    imageRes = R.drawable.item_wheelbarrow_piano
)

abstract class ItemWhiteBerry : RustObject(
    nameRes = R.string.item_white_berry,
    imageRes = R.drawable.item_white_berry
)

abstract class ItemWhiteBerryClone : RustObject(
    nameRes = R.string.item_white_berry_clone,
    imageRes = R.drawable.item_white_berry_clone
)

abstract class ItemWhiteBerrySeed : RustObject(
    nameRes = R.string.item_white_berry_seed,
    imageRes = R.drawable.item_white_berry_seed
)

abstract class ItemWhiteVolcanoFirework : RustObject(
    nameRes = R.string.item_white_volcano_firework,
    imageRes = R.drawable.item_white_volcano_firework
)

abstract class ItemWideWeaponRack : RustObject(
    nameRes = R.string.item_wide_weapon_rack,
    imageRes = R.drawable.item_wide_weapon_rack
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugPowerOut::class
    ],
    electricalOutputs = []
)
abstract class ItemWindTurbine : RustObject(
    nameRes = R.string.item_wind_turbine,
    imageRes = R.drawable.item_wind_turbine
)

@Blueprint
@ElectricalTool
abstract class ItemWireTool : RustObject(
    nameRes = R.string.item_wire_tool,
    imageRes = R.drawable.item_wire_tool
)

@Blueprint
abstract class ItemWolfHeaddress : RustObject(
    nameRes = R.string.item_wolf_headdress,
    imageRes = R.drawable.item_wolf_headdress
)

abstract class ItemWolfSkull : RustObject(
    nameRes = R.string.item_wolf_skull,
    imageRes = R.drawable.item_wolf_skull
)

abstract class ItemWood : RustObject(
    nameRes = R.string.item_wood,
    imageRes = R.drawable.item_wood
)

@Blueprint
abstract class ItemWoodenArrow : RustObject(
    nameRes = R.string.item_wooden_arrow,
    imageRes = R.drawable.item_wooden_arrow
)

@Blueprint
abstract class ItemWoodenBarricade : RustObject(
    nameRes = R.string.item_wooden_barricade,
    imageRes = R.drawable.item_wooden_barricade
)

@Blueprint
abstract class ItemWoodenBarricadeCover : RustObject(
    nameRes = R.string.item_wooden_barricade_cover,
    imageRes = R.drawable.item_wooden_barricade_cover
)

abstract class ItemWoodenCross : RustObject(
    nameRes = R.string.item_wooden_cross,
    imageRes = R.drawable.item_wooden_cross
)

@Blueprint
@DoorControllerAttachable
abstract class ItemWoodenDoor : RustObject(
    nameRes = R.string.item_wooden_door,
    imageRes = R.drawable.item_wooden_door
)

@Blueprint
abstract class ItemWoodenFloorSpikes : RustObject(
    nameRes = R.string.item_wooden_floor_spikes,
    imageRes = R.drawable.item_wooden_floor_spikes
)

@DoorControllerAttachable
abstract class ItemWoodenFrontierBarDoors : RustObject(
    nameRes = R.string.item_wooden_frontier_bar_doors,
    imageRes = R.drawable.item_wooden_frontier_bar_doors
)

@Blueprint
abstract class ItemWoodenHorseArmor : RustObject(
    nameRes = R.string.item_wooden_horse_armor,
    imageRes = R.drawable.item_wooden_horse_armor
)

@Blueprint
abstract class ItemWoodenLadder : RustObject(
    nameRes = R.string.item_wooden_ladder,
    imageRes = R.drawable.item_wooden_ladder
)

@Blueprint
abstract class ItemWoodenSpear : RustObject(
    nameRes = R.string.item_wooden_spear,
    imageRes = R.drawable.item_wooden_spear
)

@Blueprint
abstract class ItemWoodenWindowBars : RustObject(
    nameRes = R.string.item_wooden_window_bars,
    imageRes = R.drawable.item_wooden_window_bars
)

@Blueprint
abstract class ItemWoodArmorHelmet : RustObject(
    nameRes = R.string.item_wood_armor_helmet,
    imageRes = R.drawable.item_wood_armor_helmet
)

@Blueprint
abstract class ItemWoodArmorPants : RustObject(
    nameRes = R.string.item_wood_armor_pants,
    imageRes = R.drawable.item_wood_armor_pants
)

@Blueprint
abstract class ItemWoodChestplate : RustObject(
    nameRes = R.string.item_wood_chestplate,
    imageRes = R.drawable.item_wood_chestplate
)

@Blueprint
@DoorControllerAttachable
abstract class ItemWoodDoubleDoor : RustObject(
    nameRes = R.string.item_wood_double_door,
    imageRes = R.drawable.item_wood_double_door
)

@Blueprint
@DoorControllerAttachable
abstract class ItemWoodShutters : RustObject(
    nameRes = R.string.item_wood_shutters,
    imageRes = R.drawable.item_wood_shutters
)

@Blueprint
@StorageAdaptorAttachable(slotAmount = 2)
abstract class ItemWoodStorageBox : RustObject(
    nameRes = R.string.item_wood_storage_box,
    imageRes = R.drawable.item_wood_storage_box
)

@Blueprint
abstract class ItemWorkbenchLevel1 : RustObject(
    nameRes = R.string.item_workbench_level_1,
    imageRes = R.drawable.item_workbench_level_1
)

@Blueprint
abstract class ItemWorkbenchLevel2 : RustObject(
    nameRes = R.string.item_workbench_level_2,
    imageRes = R.drawable.item_workbench_level_2
)

@Blueprint
abstract class ItemWorkbenchLevel3 : RustObject(
    nameRes = R.string.item_workbench_level_3,
    imageRes = R.drawable.item_workbench_level_3
)

abstract class ItemWorm : RustObject(
    nameRes = R.string.item_worm,
    imageRes = R.drawable.item_worm
)

abstract class ItemWrappedGift : RustObject(
    nameRes = R.string.item_wrapped_gift,
    imageRes = R.drawable.item_wrapped_gift
)

abstract class ItemWrappingPaper : RustObject(
    nameRes = R.string.item_wrapping_paper,
    imageRes = R.drawable.item_wrapping_paper
)

abstract class ItemXlPictureFrame : RustObject(
    nameRes = R.string.item_xl_picture_frame,
    imageRes = R.drawable.item_xl_picture_frame
)

@Blueprint
@Deployable
@ElectricalComponent(
    electricalInputs = [
        PlugInputA::class,
        PlugInputB::class
    ],
    electricalOutputs = [
        PlugPowerOut::class
    ]
)
abstract class ItemXorSwitch : RustObject(
    nameRes = R.string.item_xor_switch,
    imageRes = R.drawable.item_xor_switch
)

abstract class ItemXxlPictureFrame : RustObject(
    nameRes = R.string.item_xxl_picture_frame,
    imageRes = R.drawable.item_xxl_picture_frame
)

@Blueprint
abstract class ItemXylobone : RustObject(
    nameRes = R.string.item_xylobone,
    imageRes = R.drawable.item_xylobone
)

abstract class ItemYellowBerry : RustObject(
    nameRes = R.string.item_yellow_berry,
    imageRes = R.drawable.item_yellow_berry
)

abstract class ItemYellowBerryClone : RustObject(
    nameRes = R.string.item_yellow_berry_clone,
    imageRes = R.drawable.item_yellow_berry_clone
)

abstract class ItemYellowBerrySeed : RustObject(
    nameRes = R.string.item_yellow_berry_seed,
    imageRes = R.drawable.item_yellow_berry_seed
)

abstract class ItemYellowPerch : RustObject(
    nameRes = R.string.item_yellow_perch,
    imageRes = R.drawable.item_yellow_perch
)