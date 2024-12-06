package com.cocot3ro.rustelectricity.domain.model

import com.cocot3ro.annotations.Deployable
import com.cocot3ro.annotations.ElectricalComponent
import com.cocot3ro.annotations.ElectricalTool
import com.cocot3ro.annotations.IndustrialComponent
import com.cocot3ro.annotations.IndustrialTool
import com.cocot3ro.annotations.Researcheable
import com.cocot3ro.annotations.RustObjectItem as RustObject
import com.cocot3ro.annotations.WaterComponent
import com.cocot3ro.annotations.WaterTool
import com.cocot3ro.annotations.DoorControllerAttachable
import com.cocot3ro.annotations.StorageAdaptorAttachable
import com.cocot3ro.annotations.StorageMonitorAttachable
import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.generated.domain.model.*

enum class RustObjectType(
    private val generationFunction: () -> RustObjectItem,
    val nameRes: Int,
    val imageRes: Int
) {

    @Researcheable
    @RustObject
    ITEM_12_GAUGE_BUCKSHOT(
        generationFunction = ::Item12GaugeBuckshot,
        nameRes = R.string.item_12_gauge_buckshot,
        imageRes = R.drawable.item_12_gauge_buckshot
    ),

    @Researcheable
    @RustObject
    ITEM_12_GAUGE_INCENDIARY_SHELL(
        generationFunction = ::Item12GaugeIncendiaryShell,
        nameRes = R.string.item_12_gauge_incendiary_shell,
        imageRes = R.drawable.item_12_gauge_incendiary_shell
    ),

    @Researcheable
    @RustObject
    ITEM_12_GAUGE_SLUG(
        generationFunction = ::Item12GaugeSlug,
        nameRes = R.string.item_12_gauge_slug,
        imageRes = R.drawable.item_12_gauge_slug
    ),

    @RustObject
    ITEM_16X_ZOOM_SCOPE(
        generationFunction = ::Item16xZoomScope,
        nameRes = R.string.item_16x_zoom_scope,
        imageRes = R.drawable.item_16x_zoom_scope
    ),

    @RustObject
    ITEM_40MM_HE_GRENADE(
        generationFunction = ::Item40mmHeGrenade,
        nameRes = R.string.item_40mm_he_grenade,
        imageRes = R.drawable.item_40mm_he_grenade
    ),

    @RustObject
    ITEM_40MM_SHOTGUN_ROUND(
        generationFunction = ::Item40mmShotgunRound,
        nameRes = R.string.item_40mm_shotgun_round,
        imageRes = R.drawable.item_40mm_shotgun_round
    ),

    @RustObject
    ITEM_40MM_SMOKE_GRENADE(
        generationFunction = ::Item40mmSmokeGrenade,
        nameRes = R.string.item_40mm_smoke_grenade,
        imageRes = R.drawable.item_40mm_smoke_grenade
    ),

    @Researcheable
    @RustObject
    ITEM_5_56_RIFLE_AMMO(
        generationFunction = ::Item556RifleAmmo,
        nameRes = R.string.item_5_56_rifle_ammo,
        imageRes = R.drawable.item_5_56_rifle_ammo
    ),

    @Researcheable
    @RustObject
    ITEM_8X_ZOOM_SCOPE(
        generationFunction = ::Item8xZoomScope,
        nameRes = R.string.item_8x_zoom_scope,
        imageRes = R.drawable.item_8x_zoom_scope
    ),

    @RustObject
    ITEM_ABOVE_GROUND_POOL(
        generationFunction = ::ItemAboveGroundPool,
        nameRes = R.string.item_above_ground_pool,
        imageRes = R.drawable.item_above_ground_pool
    ),

    @Researcheable
    @RustObject
    ITEM_ACOUSTIC_GUITAR(
        generationFunction = ::ItemAcousticGuitar,
        nameRes = R.string.item_acoustic_guitar,
        imageRes = R.drawable.item_acoustic_guitar
    ),

    @RustObject
    ITEM_ADVANCED_HEALING_TEA(
        generationFunction = ::ItemAdvancedHealingTea,
        nameRes = R.string.item_advanced_healing_tea,
        imageRes = R.drawable.item_advanced_healing_tea
    ),

    @RustObject
    ITEM_ADVANCED_MAX_HEALTH_TEA(
        generationFunction = ::ItemAdvancedMaxHealthTea,
        nameRes = R.string.item_advanced_max_health_tea,
        imageRes = R.drawable.item_advanced_max_health_tea
    ),

    @RustObject
    ITEM_ADVANCED_ORE_TEA(
        generationFunction = ::ItemAdvancedOreTea,
        nameRes = R.string.item_advanced_ore_tea,
        imageRes = R.drawable.item_advanced_ore_tea
    ),

    @RustObject
    ITEM_ADVANCED_RAD_REMOVAL_TEA(
        generationFunction = ::ItemAdvancedRadRemovalTea,
        nameRes = R.string.item_advanced_rad_removal_tea,
        imageRes = R.drawable.item_advanced_rad_removal_tea
    ),

    @RustObject
    ITEM_ADVANCED_SCRAP_TEA(
        generationFunction = ::ItemAdvancedScrapTea,
        nameRes = R.string.item_advanced_scrap_tea,
        imageRes = R.drawable.item_advanced_scrap_tea
    ),

    @RustObject
    ITEM_ADVANCED_WOOD_TEA(
        generationFunction = ::ItemAdvancedWoodTea,
        nameRes = R.string.item_advanced_wood_tea,
        imageRes = R.drawable.item_advanced_wood_tea
    ),

    @RustObject
    ITEM_ADVENT_CALENDAR(
        generationFunction = ::ItemAdventCalendar,
        nameRes = R.string.item_advent_calendar,
        imageRes = R.drawable.item_advent_calendar
    ),

    @RustObject
    ITEM_ADV_ANTI_RAD_TEA(
        generationFunction = ::ItemAdvAntiRadTea,
        nameRes = R.string.item_adv_anti_rad_tea,
        imageRes = R.drawable.item_adv_anti_rad_tea
    ),

    @RustObject
    ITEM_ANCHOVY(
        generationFunction = ::ItemAnchovy,
        nameRes = R.string.item_anchovy,
        imageRes = R.drawable.item_anchovy
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "input_a",
            "input_b"
        ],
        outputs = [
            "power_out"
        ]
    )
    @RustObject
    ITEM_AND_SWITCH(
        generationFunction = ::ItemAndSwitch,
        nameRes = R.string.item_and_switch,
        imageRes = R.drawable.item_and_switch
    ),

    @RustObject
    ITEM_ANIMAL_FAT(
        generationFunction = ::ItemAnimalFat,
        nameRes = R.string.item_animal_fat,
        imageRes = R.drawable.item_animal_fat
    ),

    @RustObject
    ITEM_ANTI_RADIATION_PILLS(
        generationFunction = ::ItemAntiRadiationPills,
        nameRes = R.string.item_anti_radiation_pills,
        imageRes = R.drawable.item_anti_radiation_pills
    ),

    @RustObject
    ITEM_ANTI_RAD_TEA(
        generationFunction = ::ItemAntiRadTea,
        nameRes = R.string.item_anti_rad_tea,
        imageRes = R.drawable.item_anti_rad_tea
    ),

    @RustObject
    ITEM_APPLE(
        generationFunction = ::ItemApple,
        nameRes = R.string.item_apple,
        imageRes = R.drawable.item_apple
    ),

    @RustObject
    ITEM_ARCTIC_SCIENTIST_SUIT(
        generationFunction = ::ItemArcticScientistSuit,
        nameRes = R.string.item_arctic_scientist_suit,
        imageRes = R.drawable.item_arctic_scientist_suit
    ),

    @RustObject
    ITEM_ARTIC_SUIT(
        generationFunction = ::ItemArticSuit,
        nameRes = R.string.item_arctic_suit,
        imageRes = R.drawable.item_arctic_suit
    ),

    @Researcheable
    @RustObject
    ITEM_ARMORED_COCKPIT_VEHICLE_MODULE(
        generationFunction = ::ItemArmoredCockpitVehicleModule,
        nameRes = R.string.item_armored_cockpit_vehicle_module,
        imageRes = R.drawable.item_armored_cockpit_vehicle_module
    ),

    @Researcheable
    @DoorControllerAttachable
    @RustObject
    ITEM_ARMORED_DOOR(
        generationFunction = ::ItemArmoredDoor,
        nameRes = R.string.item_armored_door,
        imageRes = R.drawable.item_armored_door
    ),

    @Researcheable
    @DoorControllerAttachable
    @RustObject
    ITEM_ARMORED_DOUBLE_DOOR(
        generationFunction = ::ItemArmoredDoubleDoor,
        nameRes = R.string.item_armored_double_door,
        imageRes = R.drawable.item_armored_double_door
    ),

    @Researcheable
    @RustObject
    ITEM_ARMORED_PASSENGER_VEHICLE_MODULE(
        generationFunction = ::ItemArmoredPassengerVehicleModule,
        nameRes = R.string.item_armored_passenger_vehicle_module,
        imageRes = R.drawable.item_armored_passenger_vehicle_module
    ),

    @Researcheable
    @RustObject
    ITEM_ASSAULT_RIFLE(
        generationFunction = ::ItemAssaultRifle,
        nameRes = R.string.item_assault_rifle,
        imageRes = R.drawable.item_assault_rifle
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ]
    )
    @RustObject
    ITEM_AUDIO_ALARM(
        generationFunction = ::ItemAudioAlarm,
        nameRes = R.string.item_audio_alarm,
        imageRes = R.drawable.item_audio_alarm
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ],
        outputs = [
            "no_ammo",
            "low_ammo",
            "has_target"
        ]
    )
    @RustObject
    ITEM_AUTO_TURRET(
        generationFunction = ::ItemAutoTurret,
        nameRes = R.string.item_auto_turret,
        imageRes = R.drawable.item_auto_turret
    ),

    @RustObject
    ITEM_A_BARREL_COSTUME(
        generationFunction = ::ItemABarrelCostume,
        nameRes = R.string.item_a_barrel_costume,
        imageRes = R.drawable.item_a_barrel_costume
    ),

    @Researcheable
    @RustObject
    ITEM_BANDAGE(
        generationFunction = ::ItemBandage,
        nameRes = R.string.item_bandage,
        imageRes = R.drawable.item_bandage
    ),

    @Researcheable
    @RustObject
    ITEM_BANDANA_MASK(
        generationFunction = ::ItemBandanaMask,
        nameRes = R.string.item_bandana_mask,
        imageRes = R.drawable.item_bandana_mask
    ),

    @RustObject
    ITEM_BANDIT_GUARD_GEAR(
        generationFunction = ::ItemBanditGuardGear,
        nameRes = R.string.item_bandit_guard_gear,
        imageRes = R.drawable.item_bandit_guard_gear
    ),

    @Researcheable
    @RustObject
    ITEM_BARBED_WOODEN_BARRICADE(
        generationFunction = ::ItemBarbedWoodenBarricade,
        nameRes = R.string.item_barbed_wooden_barricade,
        imageRes = R.drawable.item_barbed_wooden_barricade
    ),

    @Researcheable
    @RustObject
    ITEM_BARBEQUE(
        generationFunction = ::ItemBarbeque,
        nameRes = R.string.item_barbeque,
        imageRes = R.drawable.item_barbeque
    ),

    @RustObject
    ITEM_BASEBALL_CAP(
        generationFunction = ::ItemBaseballCap,
        nameRes = R.string.item_baseball_cap,
        imageRes = R.drawable.item_baseball_cap
    ),

    @RustObject
    ITEM_BASIC_HEALING_TEA(
        generationFunction = ::ItemBasicHealingTea,
        nameRes = R.string.item_basic_healing_tea,
        imageRes = R.drawable.item_basic_healing_tea
    ),

    @Researcheable
    @RustObject
    ITEM_BASIC_HORSE_SHOES(
        generationFunction = ::ItemBasicHorseShoes,
        nameRes = R.string.item_basic_horse_shoes,
        imageRes = R.drawable.item_basic_horse_shoes
    ),

    @RustObject
    ITEM_BASIC_MAX_HEALTH_TEA(
        generationFunction = ::ItemBasicMaxHealthTea,
        nameRes = R.string.item_basic_max_health_tea,
        imageRes = R.drawable.item_basic_max_health_tea
    ),

    @RustObject
    ITEM_BASIC_ORE_TEA(
        generationFunction = ::ItemBasicOreTea,
        nameRes = R.string.item_basic_ore_tea,
        imageRes = R.drawable.item_basic_ore_tea
    ),

    @RustObject
    ITEM_BASIC_SCRAP_TEA(
        generationFunction = ::ItemBasicScrapTea,
        nameRes = R.string.item_basic_scrap_tea,
        imageRes = R.drawable.item_basic_scrap_tea
    ),

    @RustObject
    ITEM_BASIC_WOOD_TEA(
        generationFunction = ::ItemBasicWoodTea,
        nameRes = R.string.item_basic_wood_tea,
        imageRes = R.drawable.item_basic_wood_tea
    ),

    @RustObject
    ITEM_BATH_TUB_PLANTER(
        generationFunction = ::ItemBathTubPlanter,
        nameRes = R.string.item_bath_tub_planter,
        imageRes = R.drawable.item_bath_tub_planter
    ),

    @Researcheable
    @RustObject
    ITEM_BATTERY_SMALL(
        generationFunction = ::ItemBatterySmall,
        nameRes = R.string.item_battery_small,
        imageRes = R.drawable.item_battery_small
    ),

    @Researcheable
    @RustObject
    ITEM_BEACH_CHAIR(
        generationFunction = ::ItemBeachChair,
        nameRes = R.string.item_beach_chair,
        imageRes = R.drawable.item_beach_chair
    ),

    @Researcheable
    @RustObject
    ITEM_BEACH_PARASOL(
        generationFunction = ::ItemBeachParasol,
        nameRes = R.string.item_beach_parasol,
        imageRes = R.drawable.item_beach_parasol
    ),

    @RustObject
    ITEM_BEACH_TABLE(
        generationFunction = ::ItemBeachTable,
        nameRes = R.string.item_beach_table,
        imageRes = R.drawable.item_beach_table
    ),

    @Researcheable
    @RustObject
    ITEM_BEACH_TOWEL(
        generationFunction = ::ItemBeachTowel,
        nameRes = R.string.item_beach_towel,
        imageRes = R.drawable.item_beach_towel
    ),

    @Researcheable
    @RustObject
    ITEM_BEANCAN_GRENADE(
        generationFunction = ::ItemBeancanGrenade,
        nameRes = R.string.item_beancan_grenade,
        imageRes = R.drawable.item_beancan_grenade
    ),

    @Researcheable
    @RustObject
    ITEM_BED(
        generationFunction = ::ItemBed,
        nameRes = R.string.item_bed,
        imageRes = R.drawable.item_bed
    ),

    @Researcheable
    @RustObject
    ITEM_BEENIE_HAT(
        generationFunction = ::ItemBeenieHat,
        nameRes = R.string.item_beenie_hat,
        imageRes = R.drawable.item_beenie_hat
    ),

    @Researcheable
    @RustObject
    ITEM_BINOCULARS(
        generationFunction = ::ItemBinoculars,
        nameRes = R.string.item_binoculars,
        imageRes = R.drawable.item_binoculars
    ),

    @RustObject
    ITEM_BIRTHDAY_CAKE(
        generationFunction = ::ItemBirthdayCake,
        nameRes = R.string.item_birthday_cake,
        imageRes = R.drawable.item_birthday_cake
    ),

    @RustObject
    ITEM_BLACK_BERRY(
        generationFunction = ::ItemBlackBerry,
        nameRes = R.string.item_black_berry,
        imageRes = R.drawable.item_black_berry
    ),

    @RustObject
    ITEM_BLACK_BERRY_CLONE(
        generationFunction = ::ItemBlackBerryClone,
        nameRes = R.string.item_black_berry_clone,
        imageRes = R.drawable.item_black_berry_clone
    ),

    @RustObject
    ITEM_BLACK_BERRY_SEED(
        generationFunction = ::ItemBlackBerrySeed,
        nameRes = R.string.item_black_berry_seed,
        imageRes = R.drawable.item_black_berry_seed
    ),

    @RustObject
    ITEM_BLACK_RASPBERRIES(
        generationFunction = ::ItemBlackRaspberries,
        nameRes = R.string.item_black_raspberries,
        imageRes = R.drawable.item_black_raspberries
    ),

    @RustObject
    ITEM_BLEACH(
        generationFunction = ::ItemBleach,
        nameRes = R.string.item_bleach,
        imageRes = R.drawable.item_bleach
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in",
            "block_passthrough"
        ],
        outputs = [
            "power_out"
        ]
    )
    @StorageAdaptorAttachable(slotAmount = 3)
    @RustObject
    ITEM_BLOCKER(
        generationFunction = ::ItemBlocker,
        nameRes = R.string.item_blocker,
        imageRes = R.drawable.item_blocker
    ),

    @RustObject
    ITEM_BLOOD(
        generationFunction = ::ItemBlood,
        nameRes = R.string.item_blood,
        imageRes = R.drawable.item_blood
    ),

    @RustObject
    ITEM_BLUEBERRIES(
        generationFunction = ::ItemBlueberries,
        nameRes = R.string.item_blueberries,
        imageRes = R.drawable.item_blueberries
    ),

    @RustObject
    ITEM_BLUE_BERRY(
        generationFunction = ::ItemBlueBerry,
        nameRes = R.string.item_blue_berry,
        imageRes = R.drawable.item_blue_berry
    ),

    @RustObject
    ITEM_BLUE_BERRY_CLONE(
        generationFunction = ::ItemBlueBerryClone,
        nameRes = R.string.item_blue_berry_clone,
        imageRes = R.drawable.item_blue_berry_clone
    ),

    @RustObject
    ITEM_BLUE_BERRY_SEED(
        generationFunction = ::ItemBlueBerrySeed,
        nameRes = R.string.item_blue_berry_seed,
        imageRes = R.drawable.item_blue_berry_seed
    ),

    @RustObject
    ITEM_BLUE_BOOMER(
        generationFunction = ::ItemBlueBoomer,
        nameRes = R.string.item_blue_boomer,
        imageRes = R.drawable.item_blue_boomer
    ),

    @RustObject
    ITEM_BLUE_JUMPSUIT(
        generationFunction = ::ItemBlueJumpsuit,
        nameRes = R.string.item_blue_jumpsuit,
        imageRes = R.drawable.item_blue_jumpsuit
    ),

    @RustObject
    ITEM_BLUE_KEYCARD(
        generationFunction = ::ItemBlueKeycard,
        nameRes = R.string.item_blue_keycard,
        imageRes = R.drawable.item_blue_keycard
    ),

    @RustObject
    ITEM_BLUE_ROMAN_CANDLE(
        generationFunction = ::ItemBlueRomanCandle,
        nameRes = R.string.item_blue_roman_candle,
        imageRes = R.drawable.item_blue_roman_candle
    ),

    @Researcheable
    @RustObject
    ITEM_BOLT_ACTION_RIFLE(
        generationFunction = ::ItemBoltActionRifle,
        nameRes = R.string.item_bolt_action_rifle,
        imageRes = R.drawable.item_bolt_action_rifle
    ),

    @Researcheable
    @RustObject
    ITEM_BONE_ARMOR(
        generationFunction = ::ItemBoneArmor,
        nameRes = R.string.item_bone_armor,
        imageRes = R.drawable.item_bone_armor
    ),

    @Researcheable
    @RustObject
    ITEM_BONE_ARROW(
        generationFunction = ::ItemBoneArrow,
        nameRes = R.string.item_bone_arrow,
        imageRes = R.drawable.item_bone_arrow
    ),

    @Researcheable
    @RustObject
    ITEM_BONE_CLUB(
        generationFunction = ::ItemBoneClub,
        nameRes = R.string.item_bone_club,
        imageRes = R.drawable.item_bone_club
    ),

    @RustObject
    ITEM_BONE_FRAGMENTS(
        generationFunction = ::ItemBoneFragments,
        nameRes = R.string.item_bone_fragments,
        imageRes = R.drawable.item_bone_fragments
    ),

    @Researcheable
    @RustObject
    ITEM_BONE_HELMET(
        generationFunction = ::ItemBoneHelmet,
        nameRes = R.string.item_bone_helmet,
        imageRes = R.drawable.item_bone_helmet
    ),

    @Researcheable
    @RustObject
    ITEM_BONE_KNIFE(
        generationFunction = ::ItemBoneKnife,
        nameRes = R.string.item_bone_knife,
        imageRes = R.drawable.item_bone_knife
    ),

    @Researcheable
    @RustObject
    ITEM_BOOGIE_BOARD(
        generationFunction = ::ItemBoogieBoard,
        nameRes = R.string.item_boogie_board,
        imageRes = R.drawable.item_boogie_board
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in",
            "toggle_play"
        ],
        outputs = [
            "audio_out"
        ]
    )
    @RustObject
    ITEM_BOOM_BOX(
        generationFunction = ::ItemBoomBox,
        nameRes = R.string.item_boom_box,
        imageRes = R.drawable.item_boom_box
    ),

    @RustObject
    ITEM_BOONIE_HAT(
        generationFunction = ::ItemBoonieHat,
        nameRes = R.string.item_boonie_hat,
        imageRes = R.drawable.item_boonie_hat
    ),

    @Researcheable
    @RustObject
    ITEM_BOOTS(
        generationFunction = ::ItemBoots,
        nameRes = R.string.item_boots,
        imageRes = R.drawable.item_boots
    ),

    @Researcheable
    @RustObject
    ITEM_BOTA_BAG(
        generationFunction = ::ItemBotaBag,
        nameRes = R.string.item_bota_bag,
        imageRes = R.drawable.item_bota_bag
    ),

    @RustObject
    ITEM_BRONCE_EGG(
        generationFunction = ::ItemBronceEgg,
        nameRes = R.string.item_bronze_egg,
        imageRes = R.drawable.item_bronze_egg
    ),

    @Researcheable
    @RustObject
    ITEM_BUCKET_HELMET(
        generationFunction = ::ItemBucketHelmet,
        nameRes = R.string.item_bucket_helmet,
        imageRes = R.drawable.item_bucket_helmet
    ),

    @Researcheable
    @RustObject
    ITEM_BUILDING_PLAN(
        generationFunction = ::ItemBuildingPlan,
        nameRes = R.string.item_building_plan,
        imageRes = R.drawable.item_building_plan
    ),

    @RustObject
    ITEM_BUNNY_EARS(
        generationFunction = ::ItemBunnyEars,
        nameRes = R.string.item_bunny_ears,
        imageRes = R.drawable.item_bunny_ears
    ),

    @RustObject
    ITEM_BUNNY_HAT(
        generationFunction = ::ItemBunnyHat,
        nameRes = R.string.item_bunny_hat,
        imageRes = R.drawable.item_bunny_hat
    ),

    @RustObject
    ITEM_BUNNY_ONESIE(
        generationFunction = ::ItemBunnyOnesie,
        nameRes = R.string.item_bunny_onesie,
        imageRes = R.drawable.item_bunny_onesie
    ),

    @Researcheable
    @RustObject
    ITEM_BURLAP_GLOVES(
        generationFunction = ::ItemBurlapGloves,
        nameRes = R.string.item_burlap_gloves,
        imageRes = R.drawable.item_burlap_gloves
    ),

    @Researcheable
    @RustObject
    ITEM_BURLAP_HEADWRAP(
        generationFunction = ::ItemBurlapHeadwrap,
        nameRes = R.string.item_burlap_headwrap,
        imageRes = R.drawable.item_burlap_headwrap
    ),

    @Researcheable
    @RustObject
    ITEM_BURLAP_SHIRT(
        generationFunction = ::ItemBurlapShirt,
        nameRes = R.string.item_burlap_shirt,
        imageRes = R.drawable.item_burlap_shirt
    ),

    @Researcheable
    @RustObject
    ITEM_BURLAP_SHOES(
        generationFunction = ::ItemBurlapShoes,
        nameRes = R.string.item_burlap_shoes,
        imageRes = R.drawable.item_burlap_shoes
    ),

    @Researcheable
    @RustObject
    ITEM_BURLAP_TROUSERS(
        generationFunction = ::ItemBurlapTrousers,
        nameRes = R.string.item_burlap_trousers,
        imageRes = R.drawable.item_burlap_trousers
    ),

    @RustObject
    ITEM_BURNT_BEAR_MEAT(
        generationFunction = ::ItemBurntBearMeat,
        nameRes = R.string.item_burnt_bear_meat,
        imageRes = R.drawable.item_burnt_bear_meat
    ),

    @RustObject
    ITEM_BURNT_CHICKEN(
        generationFunction = ::ItemBurntChicken,
        nameRes = R.string.item_burnt_chicken,
        imageRes = R.drawable.item_burnt_chicken
    ),

    @RustObject
    ITEM_BURNT_DEER_MEAT(
        generationFunction = ::ItemBurntDeerMeat,
        nameRes = R.string.item_burnt_deer_meat,
        imageRes = R.drawable.item_burnt_deer_meat
    ),

    @RustObject
    ITEM_BURNT_HORSE_MEAT(
        generationFunction = ::ItemBurntHorseMeat,
        nameRes = R.string.item_burnt_horse_meat,
        imageRes = R.drawable.item_burnt_horse_meat
    ),

    @RustObject
    ITEM_BURNT_HUMAN_MEAT(
        generationFunction = ::ItemBurntHumanMeat,
        nameRes = R.string.item_burnt_human_meat,
        imageRes = R.drawable.item_burnt_human_meat
    ),

    @RustObject
    ITEM_BURNT_PORK(
        generationFunction = ::ItemBurntPork,
        nameRes = R.string.item_burnt_pork,
        imageRes = R.drawable.item_burnt_pork
    ),

    @RustObject
    ITEM_BURNT_WOLF_MEAT(
        generationFunction = ::ItemBurntWolfMeat,
        nameRes = R.string.item_burnt_wolf_meat,
        imageRes = R.drawable.item_burnt_wolf_meat
    ),

    @RustObject
    ITEM_BURST_MODULE(
        generationFunction = ::ItemBurstModule,
        nameRes = R.string.item_burst_module,
        imageRes = R.drawable.item_burst_module
    ),

    @RustObject
    ITEM_BUTCHER_KNIFE(
        generationFunction = ::ItemButcherKnife,
        nameRes = R.string.item_butcher_knife,
        imageRes = R.drawable.item_butcher_knife
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ],
        outputs = [
            "power_out"
        ]
    )
    @RustObject
    ITEM_BUTTON(
        generationFunction = ::ItemButton,
        nameRes = R.string.item_button,
        imageRes = R.drawable.item_button
    ),

    @RustObject
    ITEM_CABLE_TUNNEL(
        generationFunction = ::ItemCableTunnel,
        nameRes = R.string.item_cable_tunnel,
        imageRes = R.drawable.item_cable_tunnel
    ),

    @RustObject
    ITEM_CACTUS_FLESH(
        generationFunction = ::ItemCactusFlesh,
        nameRes = R.string.item_cactus_flesh,
        imageRes = R.drawable.item_cactus_flesh
    ),

    @RustObject
    ITEM_CAMERA(
        generationFunction = ::ItemCamera,
        nameRes = R.string.item_camera,
        imageRes = R.drawable.item_camera
    ),

    @Researcheable
    @RustObject
    ITEM_CAMPER_VEHICLE_MODULE(
        generationFunction = ::ItemCamperVehicleModule,
        nameRes = R.string.item_camper_vehicle_module,
        imageRes = R.drawable.item_camper_vehicle_module
    ),

    @Researcheable
    @RustObject
    ITEM_CAMP_FIREE(
        generationFunction = ::ItemCampFiree,
        nameRes = R.string.item_camp_fire,
        imageRes = R.drawable.item_camp_fire
    ),

    @Researcheable
    @RustObject
    ITEM_CANBOURINE(
        generationFunction = ::ItemCanbourine,
        nameRes = R.string.item_canbourine,
        imageRes = R.drawable.item_canbourine
    ),

    @Researcheable
    @RustObject
    ITEM_CANDLE_HAT(
        generationFunction = ::ItemCandleHat,
        nameRes = R.string.item_candle_hat,
        imageRes = R.drawable.item_candle_hat
    ),

    @RustObject
    ITEM_CANDY_CANE(
        generationFunction = ::ItemCandyCane,
        nameRes = R.string.item_candy_cane,
        imageRes = R.drawable.item_candy_cane
    ),

    @RustObject
    ITEM_CANDY_CANE_CLUB(
        generationFunction = ::ItemCandyCaneClub,
        nameRes = R.string.item_candy_cane_club,
        imageRes = R.drawable.item_candy_cane_club
    ),

    @RustObject
    ITEM_CAN_OF_BEANS(
        generationFunction = ::ItemCanOfBeans,
        nameRes = R.string.item_can_of_beans,
        imageRes = R.drawable.item_can_of_beans
    ),

    @RustObject
    ITEM_CAN_OF_TUNA(
        generationFunction = ::ItemCanOfTuna,
        nameRes = R.string.item_can_of_tuna,
        imageRes = R.drawable.item_can_of_tuna
    ),

    @RustObject
    ITEM_CAPTAINS_LOG(
        generationFunction = ::ItemCaptainsLog,
        nameRes = R.string.item_captains_log,
        imageRes = R.drawable.item_captains_log
    ),

    @RustObject
    ITEM_CARD_MOVEMBER_MOUSTACHE(
        generationFunction = ::ItemCardMovemberMoustache,
        nameRes = R.string.item_card_movember_moustache,
        imageRes = R.drawable.item_card_movember_moustache
    ),

    @RustObject
    ITEM_CARVABLE_PUMPKIN(
        generationFunction = ::ItemCarvablePumpkin,
        nameRes = R.string.item_carvable_pumpkin,
        imageRes = R.drawable.item_carvable_pumpkin
    ),

    @Researcheable
    @RustObject
    ITEM_CASSETTE_LONG(
        generationFunction = ::ItemCassetteLong,
        nameRes = R.string.item_cassette_long,
        imageRes = R.drawable.item_cassette_long
    ),

    @Researcheable
    @RustObject
    ITEM_CASSETTE_MEDIUM(
        generationFunction = ::ItemCassetteMedium,
        nameRes = R.string.item_cassette_medium,
        imageRes = R.drawable.item_cassette_medium
    ),

    @Researcheable
    @RustObject
    ITEM_CASSETTE_RECORDER(
        generationFunction = ::ItemCassetteRecorder,
        nameRes = R.string.item_cassette_recorder,
        imageRes = R.drawable.item_cassette_recorder
    ),

    @Researcheable
    @RustObject
    ITEM_CASSETTE_SHORT(
        generationFunction = ::ItemCassetteShort,
        nameRes = R.string.item_cassette_short,
        imageRes = R.drawable.item_cassette_short
    ),

    @RustObject
    ITEM_CATFISH(
        generationFunction = ::ItemCatfish,
        nameRes = R.string.item_catfish,
        imageRes = R.drawable.item_catfish
    ),

    @RustObject
    ITEM_CCTV_CAMERA(
        generationFunction = ::ItemCctvCamera,
        nameRes = R.string.item_cctv_camera,
        imageRes = R.drawable.item_cctv_camera
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ],
        outputs = [
            "passthrough"
        ]
    )
    @RustObject
    ITEM_CEILING_LIGHT(
        generationFunction = ::ItemCeilingLight,
        nameRes = R.string.item_ceiling_light,
        imageRes = R.drawable.item_ceiling_light
    ),

    @Researcheable
    @RustObject
    ITEM_CHAINLINK_FENCE(
        generationFunction = ::ItemChainlinkFence,
        nameRes = R.string.item_chainlink_fence,
        imageRes = R.drawable.item_chainlink_fence
    ),

    @Researcheable
    @DoorControllerAttachable
    @RustObject
    ITEM_CHAINLINK_FENCE_GATE(
        generationFunction = ::ItemChainlinkFenceGate,
        nameRes = R.string.item_chainlink_fence_gate,
        imageRes = R.drawable.item_chainlink_fence_gate
    ),

    @Researcheable
    @RustObject
    ITEM_CHAINSAW(
        generationFunction = ::ItemChainsaw,
        nameRes = R.string.item_chainsaw,
        imageRes = R.drawable.item_chainsaw
    ),

    @Researcheable
    @RustObject
    ITEM_CHAIR(
        generationFunction = ::ItemChair,
        nameRes = R.string.item_chair,
        imageRes = R.drawable.item_chair
    ),

    @RustObject
    ITEM_CHAMPAGNE_BOOMER(
        generationFunction = ::ItemChampagneBoomer,
        nameRes = R.string.item_champagne_boomer,
        imageRes = R.drawable.item_champagne_boomer
    ),

    @RustObject
    ITEM_CHARCOAL(
        generationFunction = ::ItemCharcoal,
        nameRes = R.string.item_charcoal,
        imageRes = R.drawable.item_charcoal
    ),

    @RustObject
    ITEM_CHICKEN_COSTUME(
        generationFunction = ::ItemChickenCostume,
        nameRes = R.string.item_chicken_costume,
        imageRes = R.drawable.item_chicken_costume
    ),

    @RustObject
    ITEM_CHINESE_LANTERN(
        generationFunction = ::ItemChineseLantern,
        nameRes = R.string.item_chinese_lantern,
        imageRes = R.drawable.item_chinese_lantern
    ),

    @RustObject
    ITEM_CHINESE_LANTERN_WHITE(
        generationFunction = ::ItemChineseLanternWhite,
        nameRes = R.string.item_chinese_lantern_white,
        imageRes = R.drawable.item_chinese_lantern_white
    ),

    @RustObject
    ITEM_CHIPPY_ARCADE_GAME(
        generationFunction = ::ItemChippyArcadeGame,
        nameRes = R.string.item_chippy_arcade_game,
        imageRes = R.drawable.item_chippy_arcade_game
    ),

    @RustObject
    ITEM_CHOCOLATE_BAR(
        generationFunction = ::ItemChocolateBar,
        nameRes = R.string.item_chocolate_bar,
        imageRes = R.drawable.item_chocolate_bar
    ),

    @RustObject
    ITEM_CHRISTMAS_DOOR_WREATH(
        generationFunction = ::ItemChristmasDoorWreath,
        nameRes = R.string.item_christmas_door_wreath,
        imageRes = R.drawable.item_christmas_door_wreath
    ),

    @RustObject
    ITEM_CHRISTMAS_LIGHTS(
        generationFunction = ::ItemChristmasLights,
        nameRes = R.string.item_christmas_lights,
        imageRes = R.drawable.item_christmas_lights
    ),

    @RustObject
    ITEM_CHRISTMAS_TREE(
        generationFunction = ::ItemChristmasTree,
        nameRes = R.string.item_christmas_tree,
        imageRes = R.drawable.item_christmas_tree
    ),

    @RustObject
    ITEM_CLAN_TABLE(
        generationFunction = ::ItemClanTable,
        nameRes = R.string.item_clan_table,
        imageRes = R.drawable.item_clan_table
    ),

    @RustObject
    ITEM_CLATTER_HELMET(
        generationFunction = ::ItemClatterHelmet,
        nameRes = R.string.item_clatter_helmet,
        imageRes = R.drawable.item_clatter_helmet
    ),

    @RustObject
    ITEM_CLOTH(
        generationFunction = ::ItemCloth,
        nameRes = R.string.item_cloth,
        imageRes = R.drawable.item_cloth
    ),

    @RustObject
    ITEM_COAL(
        generationFunction = ::ItemCoal,
        nameRes = R.string.item_coal,
        imageRes = R.drawable.item_coal
    ),

    @Researcheable
    @RustObject
    ITEM_COCKPIT_VEHICLE_MODULE(
        generationFunction = ::ItemCockpitVehicleModule,
        nameRes = R.string.item_cockpit_vehicle_module,
        imageRes = R.drawable.item_cockpit_vehicle_module
    ),

    @Researcheable
    @RustObject
    ITEM_COCKPIT_WITH_ENGINE_VEHICLE_MODULE(
        generationFunction = ::ItemCockpitWithEngineVehicleModule,
        nameRes = R.string.item_cockpit_with_engine_vehicle_module,
        imageRes = R.drawable.item_cockpit_with_engine_vehicle_module
    ),

    @Researcheable
    @RustObject
    ITEM_CODE_LOCK(
        generationFunction = ::ItemCodeLock,
        nameRes = R.string.item_code_lock,
        imageRes = R.drawable.item_code_lock
    ),

    @Researcheable
    @RustObject
    ITEM_COFFEE_CAN_HELMET(
        generationFunction = ::ItemCoffeeCanHelmet,
        nameRes = R.string.item_coffee_can_helmet,
        imageRes = R.drawable.item_coffee_can_helmet
    ),

    @StorageAdaptorAttachable(slotAmount = 1)
    @RustObject
    ITEM_COFFIN(
        generationFunction = ::ItemCoffin,
        nameRes = R.string.item_coffin,
        imageRes = R.drawable.item_coffin
    ),

    @Researcheable
    @RustObject
    ITEM_COMBAT_KNIFE(
        generationFunction = ::ItemCombatKnife,
        nameRes = R.string.item_combat_knife,
        imageRes = R.drawable.item_combat_knife
    ),

    @Researcheable
    @RustObject
    ITEM_COMPOSTER(
        generationFunction = ::ItemComposter,
        nameRes = R.string.item_composter,
        imageRes = R.drawable.item_composter
    ),

    @Researcheable
    @RustObject
    ITEM_COMPOUND_BOW(
        generationFunction = ::ItemCompoundBow,
        nameRes = R.string.item_compound_bow,
        imageRes = R.drawable.item_compound_bow
    ),

    @Researcheable
    @RustObject
    ITEM_COMPUTER_STATION(
        generationFunction = ::ItemComputerStation,
        nameRes = R.string.item_computer_station,
        imageRes = R.drawable.item_computer_station
    ),

    @Researcheable
    @RustObject
    ITEM_CONCRETE_BARRICADE(
        generationFunction = ::ItemConcreteBarricade,
        nameRes = R.string.item_concrete_barricade,
        imageRes = R.drawable.item_concrete_barricade
    ),

    @RustObject
    ITEM_CONFETTI_CANNON(
        generationFunction = ::ItemConfettiCannon,
        nameRes = R.string.item_confetti_cannon,
        imageRes = R.drawable.item_confetti_cannon
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_audio_in"
        ],
        outputs = [
            "audio_passthrough"
        ]
    )
    @RustObject
    ITEM_CONNECTED_SPEAKER(
        generationFunction = ::ItemConnectedSpeaker,
        nameRes = R.string.item_connected_speaker,
        imageRes = R.drawable.item_connected_speaker
    ),

    @RustObject
    ITEM_COOKED_BEAR_MEAT(
        generationFunction = ::ItemCookedBearMeat,
        nameRes = R.string.item_cooked_bear_meat,
        imageRes = R.drawable.item_cooked_bear_meat
    ),

    @RustObject
    ITEM_COOKED_CHICKEN(
        generationFunction = ::ItemCookedChicken,
        nameRes = R.string.item_cooked_chicken,
        imageRes = R.drawable.item_cooked_chicken
    ),

    @RustObject
    ITEM_COOKED_DEER_MEAT(
        generationFunction = ::ItemCookedDeerMeat,
        nameRes = R.string.item_cooked_deer_meat,
        imageRes = R.drawable.item_cooked_deer_meat
    ),

    @RustObject
    ITEM_COOKED_FISH(
        generationFunction = ::ItemCookedFish,
        nameRes = R.string.item_cooked_fish,
        imageRes = R.drawable.item_cooked_fish
    ),

    @RustObject
    ITEM_COOKED_HORSE_MEAT(
        generationFunction = ::ItemCookedHorseMeat,
        nameRes = R.string.item_cooked_horse_meat,
        imageRes = R.drawable.item_cooked_horse_meat
    ),

    @RustObject
    ITEM_COOKED_HUMAN_MEAT(
        generationFunction = ::ItemCookedHumanMeat,
        nameRes = R.string.item_cooked_human_meat,
        imageRes = R.drawable.item_cooked_human_meat
    ),

    @RustObject
    ITEM_COOKED_PORK(
        generationFunction = ::ItemCookedPork,
        nameRes = R.string.item_cooked_pork,
        imageRes = R.drawable.item_cooked_pork
    ),

    @RustObject
    ITEM_COOKED_WOLF_MEAT(
        generationFunction = ::ItemCookedWolfMeat,
        nameRes = R.string.item_cooked_wolf_meat,
        imageRes = R.drawable.item_cooked_wolf_meat
    ),

    @RustObject
    ITEM_CORN(
        generationFunction = ::ItemCorn,
        nameRes = R.string.item_corn,
        imageRes = R.drawable.item_corn
    ),

    @RustObject
    ITEM_CORN_CLONE(
        generationFunction = ::ItemCornClone,
        nameRes = R.string.item_corn_clone,
        imageRes = R.drawable.item_corn_clone
    ),

    @RustObject
    ITEM_CORN_SEED(
        generationFunction = ::ItemCornSeed,
        nameRes = R.string.item_corn_seed,
        imageRes = R.drawable.item_corn_seed
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in",
            "clear_counter",
            "increment_counter",
            "decrement_counter"
        ],
        outputs = [
            "passthrough"
        ]
    )
    @RustObject
    ITEM_COUNTER(
        generationFunction = ::ItemCounter,
        nameRes = R.string.item_counter,
        imageRes = R.drawable.item_counter
    ),

    @Researcheable
    @RustObject
    ITEM_COWBEL(
        generationFunction = ::ItemCowbel,
        nameRes = R.string.item_cowbell,
        imageRes = R.drawable.item_cowbell
    ),

    @RustObject
    ITEM_CRATE_COSTUME(
        generationFunction = ::ItemCrateCostume,
        nameRes = R.string.item_crate_costume,
        imageRes = R.drawable.item_crate_costume
    ),

    @Researcheable
    @RustObject
    ITEM_CROSSBOW(
        generationFunction = ::ItemCrossbow,
        nameRes = R.string.item_crossbow,
        imageRes = R.drawable.item_crossbow
    ),

    @RustObject
    ITEM_CRUDE_OIL(
        generationFunction = ::ItemCrudeOil,
        nameRes = R.string.item_crude_oil,
        imageRes = R.drawable.item_crude_oil
    ),

    @RustObject
    ITEM_CURSED_CAULDRON(
        generationFunction = ::ItemCursedCauldron,
        nameRes = R.string.item_cursed_cauldron,
        imageRes = R.drawable.item_cursed_cauldron
    ),

    @Researcheable
    @RustObject
    ITEM_CUSTOM_SMG(
        generationFunction = ::ItemCustomSmg,
        nameRes = R.string.item_custom_smg,
        imageRes = R.drawable.item_custom_smg
    ),

    @RustObject
    ITEM_DECORATIVE_BAUBELS(
        generationFunction = ::ItemDecorativeBaubels,
        nameRes = R.string.item_decorative_baubels,
        imageRes = R.drawable.item_decorative_baubels
    ),

    @RustObject
    ITEM_DECORATIVE_GINGERBREAD_MEN(
        generationFunction = ::ItemDecorativeGingerbreadMen,
        nameRes = R.string.item_decorative_gingerbread_men,
        imageRes = R.drawable.item_decorative_gingerbread_men
    ),

    @RustObject
    ITEM_DECORATIVE_PINECONES(
        generationFunction = ::ItemDecorativePinecones,
        nameRes = R.string.item_decorative_pinecones,
        imageRes = R.drawable.item_decorative_pinecones
    ),

    @RustObject
    ITEM_DECORATIVE_PLASTIC_CANDY_CANES(
        generationFunction = ::ItemDecorativePlasticCandyCanes,
        nameRes = R.string.item_decorative_plastic_candy_canes,
        imageRes = R.drawable.item_decorative_plastic_candy_canes
    ),

    @RustObject
    ITEM_DECORATIVE_TINSEL(
        generationFunction = ::ItemDecorativeTinsel,
        nameRes = R.string.item_decorative_tinsel,
        imageRes = R.drawable.item_decorative_tinsel
    ),

    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ],
        outputs = [
            "passthrough"
        ]
    )
    @RustObject
    ITEM_DELUXE_CHRISTMAS_LIGHTS(
        generationFunction = ::ItemDeluxeChristmasLights,
        nameRes = R.string.item_deluxe_christmas_lights,
        imageRes = R.drawable.item_deluxe_christmas_lights
    ),

    @RustObject
    ITEM_DIESEL_FUEL(
        generationFunction = ::ItemDieselFuel,
        nameRes = R.string.item_diesel_fuel,
        imageRes = R.drawable.item_diesel_fuel
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ],
        outputs = [
            "power_out"
        ]
    )
    @RustObject
    ITEM_DIGITAL_CLOCK(
        generationFunction = ::ItemDigitalClock,
        nameRes = R.string.item_digital_clock,
        imageRes = R.drawable.item_digital_clock
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power"
        ],
        outputs = [
            "passthrough"
        ]
    )
    @RustObject
    ITEM_DISCO_BALL(
        generationFunction = ::ItemDiscoBall,
        nameRes = R.string.item_disco_ball,
        imageRes = R.drawable.item_disco_ball
    ),

    @Researcheable
    @RustObject
    ITEM_DISCO_FLOOR(
        generationFunction = ::ItemDiscoFloor,
        nameRes = R.string.item_disco_floor,
        imageRes = R.drawable.item_disco_floor
    ),

    @Researcheable
    @RustObject
    ITEM_DIVER_PROPULSION_VEHICLE(
        generationFunction = ::ItemDiverPropulsionVehicle,
        nameRes = R.string.item_diver_propulsion_vehicle,
        imageRes = R.drawable.item_diver_propulsion_vehicle
    ),

    @RustObject
    ITEM_DIVING_FINS(
        generationFunction = ::ItemDivingFins,
        nameRes = R.string.item_diving_fins,
        imageRes = R.drawable.item_diving_fins
    ),

    @RustObject
    ITEM_DIVING_MASK(
        generationFunction = ::ItemDivingMask,
        nameRes = R.string.item_diving_mask,
        imageRes = R.drawable.item_diving_mask
    ),

    @RustObject
    ITEM_DIVING_TANK(
        generationFunction = ::ItemDivingTank,
        nameRes = R.string.item_diving_tank,
        imageRes = R.drawable.item_diving_tank
    ),

    @RustObject
    ITEM_DOOR_CLOSER(
        generationFunction = ::ItemDoorCloser,
        nameRes = R.string.item_door_closer,
        imageRes = R.drawable.item_door_closer
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in",
            "open",
            "close"
        ],
        outputs = [
            "passthrough"
        ]
    )
    @RustObject
    ITEM_DOOR_CONTROLLER(
        generationFunction = ::ItemDoorController,
        nameRes = R.string.item_door_controller,
        imageRes = R.drawable.item_door_controller
    ),

    @RustObject
    ITEM_DOOR_KEY(
        generationFunction = ::ItemDoorKey,
        nameRes = R.string.item_door_key,
        imageRes = R.drawable.item_door_key
    ),

    @Researcheable
    @RustObject
    ITEM_DOUBLE_BARREL_SHOTGUN(
        generationFunction = ::ItemDoubleBarrelShotgun,
        nameRes = R.string.item_double_barrel_shotgun,
        imageRes = R.drawable.item_double_barrel_shotgun
    ),

    @RustObject
    ITEM_DOUBLE_HORSE_SADDLE(
        generationFunction = ::ItemDoubleHorseSaddle,
        nameRes = R.string.item_double_horse_saddle,
        imageRes = R.drawable.item_double_horse_saddle
    ),

    @RustObject
    ITEM_DOUBLE_SIGN_POST(
        generationFunction = ::ItemDoubleSignPost,
        nameRes = R.string.item_double_sign_post,
        imageRes = R.drawable.item_double_sign_post
    ),

    @RustObject
    ITEM_DRACULA_CAPE(
        generationFunction = ::ItemDraculaCape,
        nameRes = R.string.item_dracula_cape,
        imageRes = R.drawable.item_dracula_cape
    ),

    @RustObject
    ITEM_DRACULA_MASK(
        generationFunction = ::ItemDraculaMask,
        nameRes = R.string.item_dracula_mask,
        imageRes = R.drawable.item_dracula_mask
    ),

    @RustObject
    ITEM_DRAGON_DOOR_KNOCKER(
        generationFunction = ::ItemDragonDoorKnocker,
        nameRes = R.string.item_dragon_door_knocker,
        imageRes = R.drawable.item_dragon_door_knocker
    ),

    @RustObject
    ITEM_DRAGON_MASK(
        generationFunction = ::ItemDragonMask,
        nameRes = R.string.item_dragon_mask,
        imageRes = R.drawable.item_dragon_mask
    ),

    @Researcheable
    @RustObject
    ITEM_DRONE(
        generationFunction = ::ItemDrone,
        nameRes = R.string.item_drone,
        imageRes = R.drawable.item_drone
    ),

    @Researcheable
    @StorageAdaptorAttachable(slotAmount = 1)
    @RustObject
    ITEM_DROP_BOX(
        generationFunction = ::ItemDropBox,
        nameRes = R.string.item_drop_box,
        imageRes = R.drawable.item_drop_box
    ),

    @RustObject
    ITEM_DUCT_TAPE(
        generationFunction = ::ItemDuctTape,
        nameRes = R.string.item_duct_tape,
        imageRes = R.drawable.item_duct_tape
    ),

    @RustObject
    ITEM_EASTER_DOOR_WREATH(
        generationFunction = ::ItemEasterDoorWreath,
        nameRes = R.string.item_easter_door_wreath,
        imageRes = R.drawable.item_easter_door_wreath
    ),

    @RustObject
    ITEM_EGG_BASKET(
        generationFunction = ::ItemEggBasket,
        nameRes = R.string.item_egg_basket,
        imageRes = R.drawable.item_egg_basket
    ),

    @RustObject
    ITEM_EGG_SUIT(
        generationFunction = ::ItemEggSuit,
        nameRes = R.string.item_egg_suit,
        imageRes = R.drawable.item_egg_suit
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ],
        outputs = [
            "branch_out",
            "power_out"
        ]
    )
    @RustObject
    ITEM_ELECTRICAL_BRANCH(
        generationFunction = ::ItemElectricalBranch,
        nameRes = R.string.item_electrical_branch,
        imageRes = R.drawable.item_electrical_branch
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ]
    )
    @StorageAdaptorAttachable(slotAmount = 2)
    @RustObject
    ITEM_ELECTRIC_FURNACE(
        generationFunction = ::ItemElectricFurnace,
        nameRes = R.string.item_electric_furnace,
        imageRes = R.drawable.item_electric_furnace
    ),

    @RustObject
    ITEM_ELECTRIC_FUSE(
        generationFunction = ::ItemElectricFuse,
        nameRes = R.string.item_electric_fuse,
        imageRes = R.drawable.item_electric_fuse
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ],
        outputs = [
            "passthrough"
        ]
    )
    @RustObject
    ITEM_ELECTRIC_HEATER(
        generationFunction = ::ItemElectricHeater,
        nameRes = R.string.item_electric_heater,
        imageRes = R.drawable.item_electric_heater
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ]
    )
    @RustObject
    ITEM_ELEVATOR(
        generationFunction = ::ItemElevator,
        nameRes = R.string.item_elevator,
        imageRes = R.drawable.item_elevator
    ),

    @RustObject
    ITEM_EMPTY_CAN_OF_BEANS(
        generationFunction = ::ItemEmptyCanOfBeans,
        nameRes = R.string.item_empty_can_of_beans,
        imageRes = R.drawable.item_empty_can_of_beans
    ),

    @Researcheable
    @RustObject
    ITEM_EMPTY_PROPANE_TANK(
        generationFunction = ::ItemEmptyPropaneTank,
        nameRes = R.string.item_empty_propane_tank,
        imageRes = R.drawable.item_empty_propane_tank
    ),

    @RustObject
    ITEM_EMPTY_TUNA_CAN(
        generationFunction = ::ItemEmptyTunaCan,
        nameRes = R.string.item_empty_tuna_can,
        imageRes = R.drawable.item_empty_tuna_can
    ),

    @Researcheable
    @RustObject
    ITEM_ENGINE_VEHICLE_MODULE(
        generationFunction = ::ItemEngineVehicleModule,
        nameRes = R.string.item_engine_vehicle_module,
        imageRes = R.drawable.item_engine_vehicle_module
    ),

    @Researcheable
    @RustObject
    ITEM_EOKA_PISTOL(
        generationFunction = ::ItemEokaPistol,
        nameRes = R.string.item_eoka_pistol,
        imageRes = R.drawable.item_eoka_pistol
    ),

    @Researcheable
    @RustObject
    ITEM_EXPLOSIVES(
        generationFunction = ::ItemExplosives,
        nameRes = R.string.item_explosives,
        imageRes = R.drawable.item_explosives
    ),

    @Researcheable
    @RustObject
    ITEM_EXPLOSIVE_5_56_RIFLE_AMMO(
        generationFunction = ::ItemExplosive556RifleAmmo,
        nameRes = R.string.item_explosive_5_56_rifle_ammo,
        imageRes = R.drawable.item_explosive_5_56_rifle_ammo
    ),

    @Researcheable
    @RustObject
    ITEM_EXTENDED_MAGAZINE(
        generationFunction = ::ItemExtendedMagazine,
        nameRes = R.string.item_extended_magazine,
        imageRes = R.drawable.item_extended_magazine
    ),

    @Researcheable
    @RustObject
    ITEM_F1_GRENADE(
        generationFunction = ::ItemF1Grenade,
        nameRes = R.string.item_f1_grenade,
        imageRes = R.drawable.item_f1_grenade
    ),

    @RustObject
    ITEM_FERTILIZER(
        generationFunction = ::ItemFertilizer,
        nameRes = R.string.item_fertilizer,
        imageRes = R.drawable.item_fertilizer
    ),

    @RustObject
    ITEM_FESTIVE_DOORWAY_GARLAND(
        generationFunction = ::ItemFestiveDoorwayGarland,
        nameRes = R.string.item_festive_doorway_garland,
        imageRes = R.drawable.item_festive_doorway_garland
    ),

    @RustObject
    ITEM_FESTIVE_DOUBLE_DOORWAY_GARLAND(
        generationFunction = ::ItemFestiveDoubleDoorwayGarland,
        nameRes = R.string.item_festive_double_doorway_garland,
        imageRes = R.drawable.item_festive_double_doorway_garland
    ),

    @RustObject
    ITEM_FESTIVE_WINDOW_GARLAND(
        generationFunction = ::ItemFestiveWindowGarland,
        nameRes = R.string.item_festive_window_garland,
        imageRes = R.drawable.item_festive_window_garland
    ),

    @RustObject
    ITEM_FIRECRACKER_STRING(
        generationFunction = ::ItemFirecrackerString,
        nameRes = R.string.item_firecracker_string,
        imageRes = R.drawable.item_firecracker_string
    ),

    @Researcheable
    @RustObject
    ITEM_FIRE_ARROW(
        generationFunction = ::ItemFireArrow,
        nameRes = R.string.item_fire_arrow,
        imageRes = R.drawable.item_fire_arrow
    ),

    @RustObject
    ITEM_FISHING_TACKLE(
        generationFunction = ::ItemFishingTackle,
        nameRes = R.string.item_fishing_tackle,
        imageRes = R.drawable.item_fishing_tackle
    ),

    @RustObject
    ITEM_FISH_TROPHY(
        generationFunction = ::ItemFishTrophy,
        nameRes = R.string.item_fish_trophy,
        imageRes = R.drawable.item_fish_trophy
    ),

    @Researcheable
    @RustObject
    ITEM_FLAME_THROWER(
        generationFunction = ::ItemFlameThrower,
        nameRes = R.string.item_flame_thrower,
        imageRes = R.drawable.item_flame_thrower
    ),

    @Researcheable
    @RustObject
    ITEM_FLAME_TURRET(
        generationFunction = ::ItemFlameTurret,
        nameRes = R.string.item_flame_turret,
        imageRes = R.drawable.item_flame_turret
    ),

    @Researcheable
    @RustObject
    ITEM_FLARE(
        generationFunction = ::ItemFlare,
        nameRes = R.string.item_flare,
        imageRes = R.drawable.item_flare
    ),

    @Researcheable
    @RustObject
    ITEM_FLASHBANG(
        generationFunction = ::ItemFlashbang,
        nameRes = R.string.item_flashbang,
        imageRes = R.drawable.item_flashbang
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ],
        outputs = [
            "passthrough"
        ]
    )
    @RustObject
    ITEM_FLASHER_LIGHT(
        generationFunction = ::ItemFlasherLight,
        nameRes = R.string.item_flasher_light,
        imageRes = R.drawable.item_flasher_light
    ),

    @Researcheable
    @RustObject
    ITEM_FLASHLIGHT(
        generationFunction = ::ItemFlashlight,
        nameRes = R.string.item_flashlight,
        imageRes = R.drawable.item_flashlight
    ),

    @Researcheable
    @RustObject
    ITEM_FLATBED_VEHICLE_MODULE(
        generationFunction = ::ItemFlatbedVehicleModule,
        nameRes = R.string.item_flatbed_vehicle_module,
        imageRes = R.drawable.item_flatbed_vehicle_module
    ),

    @Researcheable
    @RustObject
    ITEM_FLOOR_GRILL(
        generationFunction = ::ItemFloorGrill,
        nameRes = R.string.item_floor_grill,
        imageRes = R.drawable.item_floor_grill
    ),

    @Researcheable
    @RustObject
    ITEM_FLOOR_TRIANGLE_GRILL(
        generationFunction = ::ItemFloorTriangleGrill,
        nameRes = R.string.item_floor_triangle_grill,
        imageRes = R.drawable.item_floor_triangle_grill
    ),

    @Researcheable
    @Deployable
    @WaterComponent(
        inputs = [
            "water_in_1",
            "water_in_2",
            "water_in_3"
        ],
        outputs = [
            "water_out"
        ]
    )
    @RustObject
    ITEM_FLUID_COMBINER(
        generationFunction = ::ItemFluidCombiner,
        nameRes = R.string.item_fluid_combiner,
        imageRes = R.drawable.item_fluid_combiner
    ),

    @Researcheable
    @Deployable
    @WaterComponent(
        inputs = [
            "water_in"
        ],
        outputs = [
            "water_out_1",
            "water_out_2",
            "water_out_3"
        ]
    )
    @RustObject
    ITEM_FLUID_SPLITTER(
        generationFunction = ::ItemFluidSplitter,
        nameRes = R.string.item_fluid_splitter,
        imageRes = R.drawable.item_fluid_splitter
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "pump_power",
            "toggle"
        ]
    )
    @WaterComponent(
        inputs = [
            "fluid_input"
        ],
        outputs = [
            "fluid_output"
        ]
    )
    @RustObject
    ITEM_FLUID_SWITCH_AND_PUMP(
        generationFunction = ::ItemFluidSwitchAndPump,
        nameRes = R.string.item_fluid_switch_and_pump,
        imageRes = R.drawable.item_fluid_switch_and_pump
    ),

    @Deployable
    @ElectricalComponent(
        inputs = [
            "toggle",
            "turn_on",
            "turn_off"
        ]
    )
    @RustObject
    ITEM_FOGGER_3000(
        generationFunction = ::ItemFogger3000,
        nameRes = R.string.item_fogger_3000,
        imageRes = R.drawable.item_fogger_3000
    ),

    @RustObject
    ITEM_FRANKENSTEIN_MASK(
        generationFunction = ::ItemFrankensteinMask,
        nameRes = R.string.item_frankenstein_mask,
        imageRes = R.drawable.item_frankenstein_mask
    ),

    @RustObject
    ITEM_FRANKENSTEIN_TABLE(
        generationFunction = ::ItemFrankensteinTable,
        nameRes = R.string.item_frankenstein_table,
        imageRes = R.drawable.item_frankenstein_table
    ),

    @Researcheable
    @StorageAdaptorAttachable(slotAmount = 1)
    @RustObject
    ITEM_FRIDGE(
        generationFunction = ::ItemFridge,
        nameRes = R.string.item_fridge,
        imageRes = R.drawable.item_fridge
    ),

    @RustObject
    ITEM_FROG_BOOTS(
        generationFunction = ::ItemFrogBoots,
        nameRes = R.string.item_frog_boots,
        imageRes = R.drawable.item_frog_boots
    ),

    @RustObject
    ITEM_FRONTIER_BOLTS_SINGLE_ITEM_RACK(
        generationFunction = ::ItemFrontierBoltsSingleItemRack,
        nameRes = R.string.item_frontier_bolts_single_item_rack,
        imageRes = R.drawable.item_frontier_bolts_single_item_rack
    ),

    @RustObject
    ITEM_FRONTIER_HORNS_SINGLE_ITEM_RACK(
        generationFunction = ::ItemFrontierHornsSingleItemRack,
        nameRes = R.string.item_frontier_horns_single_item_rack,
        imageRes = R.drawable.item_frontier_horns_single_item_rack
    ),

    @RustObject
    ITEM_FRONTIER_HORSESHOE_SINGLE_ITEM_RACK(
        generationFunction = ::ItemFrontierHorseshoeSingleItemRack,
        nameRes = R.string.item_frontier_horseshoe_single_item_rack,
        imageRes = R.drawable.item_frontier_horseshoe_single_item_rack
    ),

    @Researcheable
    @RustObject
    ITEM_FUEL_TANK_VEHICLE_MODULE(
        generationFunction = ::ItemFuelTankVehicleModule,
        nameRes = R.string.item_fuel_tank_vehicle_module,
        imageRes = R.drawable.item_fuel_tank_vehicle_module
    ),

    @Researcheable
    @StorageAdaptorAttachable(slotAmount = 1)
    @RustObject
    ITEM_FURNACE(
        generationFunction = ::ItemFurnace,
        nameRes = R.string.item_furnace,
        imageRes = R.drawable.item_furnace
    ),

    @Researcheable
    @DoorControllerAttachable
    @RustObject
    ITEM_GARAGE_DOOR(
        generationFunction = ::ItemGarageDoor,
        nameRes = R.string.item_garage_door,
        imageRes = R.drawable.item_garage_door
    ),

    @RustObject
    ITEM_GARRYS_MOD_TOOL_GUN(
        generationFunction = ::ItemGarrysModToolGun,
        nameRes = R.string.item_garrys_mod_tool_gun,
        imageRes = R.drawable.item_garrys_mod_tool_gun
    ),

    @Researcheable
    @RustObject
    ITEM_GAS_COMPRESSION_OVERDRIVE(
        generationFunction = ::ItemGasCompressionOverdrive,
        nameRes = R.string.item_gas_compression_overdrive,
        imageRes = R.drawable.item_gas_compression_overdrive
    ),

    @RustObject
    ITEM_GAS_MASK(
        generationFunction = ::ItemGasMask,
        nameRes = R.string.item_gas_mask,
        imageRes = R.drawable.item_gas_mask
    ),

    @Researcheable
    @RustObject
    ITEM_GEARS(
        generationFunction = ::ItemGears,
        nameRes = R.string.item_gears,
        imageRes = R.drawable.item_gears
    ),

    @RustObject
    ITEM_GEIGER_COUNTER(
        generationFunction = ::ItemGeigerCounter,
        nameRes = R.string.item_geiger_counter,
        imageRes = R.drawable.item_geiger_counter
    ),

    @RustObject
    ITEM_GHOST_COSTUME(
        generationFunction = ::ItemGhostCostume,
        nameRes = R.string.item_ghost_costume,
        imageRes = R.drawable.item_ghost_costume
    ),

    @RustObject
    ITEM_GIANT_CANDY_DECOR(
        generationFunction = ::ItemGiantCandyDecor,
        nameRes = R.string.item_giant_candy_decor,
        imageRes = R.drawable.item_giant_candy_decor
    ),

    @RustObject
    ITEM_GIANT_LOLLIPOP_DECOR(
        generationFunction = ::ItemGiantLollipopDecor,
        nameRes = R.string.item_giant_lollipop_decor,
        imageRes = R.drawable.item_giant_lollipop_decor
    ),

    @RustObject
    ITEM_GINGERBREAD_SUIT(
        generationFunction = ::ItemGingerbreadSuit,
        nameRes = R.string.item_gingerbread_suit,
        imageRes = R.drawable.item_gingerbread_suit
    ),

    @RustObject
    ITEM_GLOWING_EYES(
        generationFunction = ::ItemGlowingEyes,
        nameRes = R.string.item_glowing_eyes,
        imageRes = R.drawable.item_glowing_eyes
    ),

    @RustObject
    ITEM_GLUE(
        generationFunction = ::ItemGlue,
        nameRes = R.string.item_glue,
        imageRes = R.drawable.item_glue
    ),

    @RustObject
    ITEM_GOLD_EGG(
        generationFunction = ::ItemGoldEgg,
        nameRes = R.string.item_gold_egg,
        imageRes = R.drawable.item_gold_egg
    ),

    @RustObject
    ITEM_GRANOLA_BAR(
        generationFunction = ::ItemGranolaBar,
        nameRes = R.string.item_granola_bar,
        imageRes = R.drawable.item_granola_bar
    ),

    @RustObject
    ITEM_GRAVESTONE(
        generationFunction = ::ItemGravestone,
        nameRes = R.string.item_gravestone,
        imageRes = R.drawable.item_gravestone
    ),

    @RustObject
    ITEM_GRAVEYARD_FENCE(
        generationFunction = ::ItemGraveyardFence,
        nameRes = R.string.item_graveyard_fence,
        imageRes = R.drawable.item_graveyard_fence
    ),

    @RustObject
    ITEM_GREEN_BERRY(
        generationFunction = ::ItemGreenBerry,
        nameRes = R.string.item_green_berry,
        imageRes = R.drawable.item_green_berry
    ),

    @RustObject
    ITEM_GREEN_BERRY_CLONE(
        generationFunction = ::ItemGreenBerryClone,
        nameRes = R.string.item_green_berry_clone,
        imageRes = R.drawable.item_green_berry_clone
    ),

    @RustObject
    ITEM_GREEN_BERRY_SEED(
        generationFunction = ::ItemGreenBerrySeed,
        nameRes = R.string.item_green_berry_seed,
        imageRes = R.drawable.item_green_berry_seed
    ),

    @RustObject
    ITEM_GREEN_BOOMER(
        generationFunction = ::ItemGreenBoomer,
        nameRes = R.string.item_green_boomer,
        imageRes = R.drawable.item_green_boomer
    ),

    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ],
        outputs = [
            "passthrough"
        ]
    )
    @RustObject
    ITEM_GREEN_INDUSTRIAL_WALL_LIGHT(
        generationFunction = ::ItemGreenIndustrialWallLight,
        nameRes = R.string.item_green_industrial_wall_light,
        imageRes = R.drawable.item_green_industrial_wall_light
    ),

    @RustObject
    ITEM_GREEN_KEYCARD(
        generationFunction = ::ItemGreenKeycard,
        nameRes = R.string.item_green_keycard,
        imageRes = R.drawable.item_green_keycard
    ),

    @RustObject
    ITEM_GREEN_ROMAN_CANDLE(
        generationFunction = ::ItemGreenRomanCandle,
        nameRes = R.string.item_green_roman_candle,
        imageRes = R.drawable.item_green_roman_candle
    ),

    @RustObject
    ITEM_GRUB(
        generationFunction = ::ItemGrub,
        nameRes = R.string.item_grub,
        imageRes = R.drawable.item_grub
    ),

    @Researcheable
    @RustObject
    ITEM_GUN_POWDER(
        generationFunction = ::ItemGunPowder,
        nameRes = R.string.item_gun_powder,
        imageRes = R.drawable.item_gun_powder
    ),

    @RustObject
    ITEM_HALLOWEEN_CANDY(
        generationFunction = ::ItemHalloweenCandy,
        nameRes = R.string.item_halloween_candy,
        imageRes = R.drawable.item_halloween_candy
    ),

    @Researcheable
    @RustObject
    ITEM_HAMMER(
        generationFunction = ::ItemHammer,
        nameRes = R.string.item_hammer,
        imageRes = R.drawable.item_hammer
    ),

    @Researcheable
    @RustObject
    ITEM_HANDCUFFS(
        generationFunction = ::ItemHandcuffs,
        nameRes = R.string.item_handcuffs,
        imageRes = R.drawable.item_handcuffs
    ),

    @Researcheable
    @RustObject
    ITEM_HANDMADE_FISHING_ROD(
        generationFunction = ::ItemHandmadeFishingRod,
        nameRes = R.string.item_handmade_fishing_rod,
        imageRes = R.drawable.item_handmade_fishing_rod
    ),

    @Researcheable
    @RustObject
    ITEM_HANDMADE_SHELL(
        generationFunction = ::ItemHandmadeShell,
        nameRes = R.string.item_handmade_shell,
        imageRes = R.drawable.item_handmade_shell
    ),

    @Researcheable
    @RustObject
    ITEM_HANDMADE_SMG(
        generationFunction = ::ItemHandmadeSmg,
        nameRes = R.string.item_handmade_smg,
        imageRes = R.drawable.item_handmade_smg
    ),

    @Researcheable
    @RustObject
    ITEM_HATCHET(
        generationFunction = ::ItemHatchet,
        nameRes = R.string.item_hatchet,
        imageRes = R.drawable.item_hatchet
    ),

    @Researcheable
    @RustObject
    ITEM_HAZMAT_SUIT(
        generationFunction = ::ItemHazmatSuit,
        nameRes = R.string.item_hazmat_suit,
        imageRes = R.drawable.item_hazmat_suit
    ),

    @RustObject
    ITEM_HAZMAT_YOUTOOZ(
        generationFunction = ::ItemHazmatYoutooz,
        nameRes = R.string.item_hazmat_youtooz,
        imageRes = R.drawable.item_hazmat_youtooz
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ],
        outputs = [
            "power_out"
        ]
    )
    @RustObject
    ITEM_HBHF_SENSOR(
        generationFunction = ::ItemHbhfSensor,
        nameRes = R.string.item_hbhf_sensor,
        imageRes = R.drawable.item_hbhf_sensor
    ),

    @Researcheable
    @RustObject
    ITEM_HEADSET(
        generationFunction = ::ItemHeadset,
        nameRes = R.string.item_headset,
        imageRes = R.drawable.item_headset
    ),

    @RustObject
    ITEM_HEAD_BAG(
        generationFunction = ::ItemHeadBag,
        nameRes = R.string.item_head_bag,
        imageRes = R.drawable.item_head_bag
    ),

    @RustObject
    ITEM_HEAVY_FRANKENSTEIN_HEAD(
        generationFunction = ::ItemHeavyFrankensteinHead,
        nameRes = R.string.item_heavy_frankenstein_head,
        imageRes = R.drawable.item_heavy_frankenstein_head
    ),

    @RustObject
    ITEM_HEAVY_FRANKENSTEIN_LEGS(
        generationFunction = ::ItemHeavyFrankensteinLegs,
        nameRes = R.string.item_heavy_frankenstein_legs,
        imageRes = R.drawable.item_heavy_frankenstein_legs
    ),

    @RustObject
    ITEM_HEAVY_FRANKENSTEIN_TORSO(
        generationFunction = ::ItemHeavyFrankensteinTorso,
        nameRes = R.string.item_heavy_frankenstein_torso,
        imageRes = R.drawable.item_heavy_frankenstein_torso
    ),

    @Researcheable
    @RustObject
    ITEM_HEAVY_PLATE_HELMET(
        generationFunction = ::ItemHeavyPlateHelmet,
        nameRes = R.string.item_heavy_plate_helmet,
        imageRes = R.drawable.item_heavy_plate_helmet
    ),

    @Researcheable
    @RustObject
    ITEM_HEAVY_PLATE_JACKET(
        generationFunction = ::ItemHeavyPlateJacket,
        nameRes = R.string.item_heavy_plate_jacket,
        imageRes = R.drawable.item_heavy_plate_jacket
    ),

    @Researcheable
    @RustObject
    ITEM_HEAVY_PLATE_PANTS(
        generationFunction = ::ItemHeavyPlatePants,
        nameRes = R.string.item_heavy_plate_pants,
        imageRes = R.drawable.item_heavy_plate_pants
    ),

    @RustObject
    ITEM_HEAVY_SCIENTIST_SUIT(
        generationFunction = ::ItemHeavyScientistSuit,
        nameRes = R.string.item_heavy_scientist_suit,
        imageRes = R.drawable.item_heavy_scientist_suit
    ),

    @RustObject
    ITEM_HEAVY_SCIENTIST_YOUTOOZ(
        generationFunction = ::ItemHeavyScientistYoutooz,
        nameRes = R.string.item_heavy_scientist_youtooz,
        imageRes = R.drawable.item_heavy_scientist_youtooz
    ),

    @RustObject
    ITEM_HEMP_CLONE(
        generationFunction = ::ItemHempClone,
        nameRes = R.string.item_hemp_clone,
        imageRes = R.drawable.item_hemp_clone
    ),

    @RustObject
    ITEM_HEMP_SEED(
        generationFunction = ::ItemHempSeed,
        nameRes = R.string.item_hemp_seed,
        imageRes = R.drawable.item_hemp_seed
    ),

    @RustObject
    ITEM_HERRING(
        generationFunction = ::ItemHerring,
        nameRes = R.string.item_herring,
        imageRes = R.drawable.item_herring
    ),

    @Researcheable
    @RustObject
    ITEM_HIDE_BOOTS(
        generationFunction = ::ItemHideBoots,
        nameRes = R.string.item_hide_boots,
        imageRes = R.drawable.item_hide_boots
    ),

    @Researcheable
    @RustObject
    ITEM_HIDE_HALTERNECK(
        generationFunction = ::ItemHideHalterneck,
        nameRes = R.string.item_hide_halterneck,
        imageRes = R.drawable.item_hide_halterneck
    ),

    @Researcheable
    @RustObject
    ITEM_HIDE_PANTS(
        generationFunction = ::ItemHidePants,
        nameRes = R.string.item_hide_pants,
        imageRes = R.drawable.item_hide_pants
    ),

    @Researcheable
    @RustObject
    ITEM_HIDE_PONCHO(
        generationFunction = ::ItemHidePoncho,
        nameRes = R.string.item_hide_poncho,
        imageRes = R.drawable.item_hide_poncho
    ),

    @Researcheable
    @RustObject
    ITEM_HIDE_SKIRT(
        generationFunction = ::ItemHideSkirt,
        nameRes = R.string.item_hide_skirt,
        imageRes = R.drawable.item_hide_skirt
    ),

    @Researcheable
    @RustObject
    ITEM_HIDE_VEST(
        generationFunction = ::ItemHideVest,
        nameRes = R.string.item_hide_vest,
        imageRes = R.drawable.item_hide_vest
    ),

    @Researcheable
    @RustObject
    ITEM_HIGH_CALIBER_REVOLVER(
        generationFunction = ::ItemHighCaliberRevolver,
        nameRes = R.string.item_high_caliber_revolver,
        imageRes = R.drawable.item_high_caliber_revolver
    ),

    @Researcheable
    @DoorControllerAttachable
    @RustObject
    ITEM_HIGH_EXTERNAL_STONE_GATE(
        generationFunction = ::ItemHighExternalStoneGate,
        nameRes = R.string.item_high_external_stone_gate,
        imageRes = R.drawable.item_high_external_stone_gate
    ),

    @Researcheable
    @RustObject
    ITEM_HIGH_EXTERNAL_STONE_WALL(
        generationFunction = ::ItemHighExternalStoneWall,
        nameRes = R.string.item_high_external_stone_wall,
        imageRes = R.drawable.item_high_external_stone_wall
    ),
    
    @Researcheable
    @DoorControllerAttachable
    @RustObject
    ITEM_HIGH_EXTERNAL_WOODEN_GATE(
        generationFunction = ::ItemHighExternalWoodenGate,
        nameRes = R.string.item_high_external_wooden_gate,
        imageRes = R.drawable.item_high_external_wooden_gate
    ),

    @Researcheable
    @RustObject
    ITEM_HIGH_EXTERNAL_WOODEN_WALL(
        generationFunction = ::ItemHighExternalWoodenWall,
        nameRes = R.string.item_high_external_wooden_wall,
        imageRes = R.drawable.item_high_external_wooden_wall
    ),

    @RustObject
    ITEM_HIGH_ICE_WALL(
        generationFunction = ::ItemHighIceWall,
        nameRes = R.string.item_high_ice_wall,
        imageRes = R.drawable.item_high_ice_wall
    ),

    @Researcheable
    @RustObject
    ITEM_HIGH_QUALITY_CARBURETOR(
        generationFunction = ::ItemHighQualityCarburetor,
        nameRes = R.string.item_high_quality_carburetor,
        imageRes = R.drawable.item_high_quality_carburetor
    ),

    @Researcheable
    @RustObject
    ITEM_HIGH_QUALITY_CRANKSHAFT(
        generationFunction = ::ItemHighQualityCrankshaft,
        nameRes = R.string.item_high_quality_crankshaft,
        imageRes = R.drawable.item_high_quality_crankshaft
    ),

    @Researcheable
    @RustObject
    ITEM_HIGH_QUALITY_HORSE_SHOES(
        generationFunction = ::ItemHighQualityHorseShoes,
        nameRes = R.string.item_high_quality_horse_shoes,
        imageRes = R.drawable.item_high_quality_horse_shoes
    ),

    @RustObject
    ITEM_HIGH_QUALITY_METAL(
        generationFunction = ::ItemHighQualityMetal,
        nameRes = R.string.item_high_quality_metal,
        imageRes = R.drawable.item_high_quality_metal
    ),

    @RustObject
    ITEM_HIGH_QUALITY_METAL_ORE(
        generationFunction = ::ItemHighQualityMetalOre,
        nameRes = R.string.item_high_quality_metal_ore,
        imageRes = R.drawable.item_high_quality_metal_ore
    ),

    @Researcheable
    @RustObject
    ITEM_HIGH_QUALITY_PISTONS(
        generationFunction = ::ItemHighQualityPistons,
        nameRes = R.string.item_high_quality_pistons,
        imageRes = R.drawable.item_high_quality_pistons
    ),

    @Researcheable
    @RustObject
    ITEM_HIGH_QUALITY_SPARK_PLUGS(
        generationFunction = ::ItemHighQualitySparkPlugs,
        nameRes = R.string.item_high_quality_spark_plugs,
        imageRes = R.drawable.item_high_quality_spark_plugs
    ),

    @Researcheable
    @RustObject
    ITEM_HIGH_QUALITY_VALVES(
        generationFunction = ::ItemHighQualityValves,
        nameRes = R.string.item_high_quality_valves,
        imageRes = R.drawable.item_high_quality_valves
    ),

    @Researcheable
    @RustObject
    ITEM_HIGH_VELOCITY_ARROW(
        generationFunction = ::ItemHighVelocityArrow,
        nameRes = R.string.item_high_velocity_arrow,
        imageRes = R.drawable.item_high_velocity_arrow
    ),

    @Researcheable
    @RustObject
    ITEM_HIGH_VELOCITY_ROCKET(
        generationFunction = ::ItemHighVelocityRocket,
        nameRes = R.string.item_high_velocity_rocket,
        imageRes = R.drawable.item_high_velocity_rocket
    ),

    @Researcheable
    @RustObject
    ITEM_HITCH_AND_TROUGH(
        generationFunction = ::ItemHitchAndTrough,
        nameRes = R.string.item_hitch_and_trough,
        imageRes = R.drawable.item_hitch_and_trough
    ),

    @Researcheable
    @RustObject
    ITEM_HMLMG(
        generationFunction = ::ItemHmlmg,
        nameRes = R.string.item_hmlmg,
        imageRes = R.drawable.item_hmlmg
    ),

    @RustObject
    ITEM_HOBO_BARREL(
        generationFunction = ::ItemHoboBarrel,
        nameRes = R.string.item_hobo_barrel,
        imageRes = R.drawable.item_hobo_barrel
    ),

    @Researcheable
    @RustObject
    ITEM_HOLOSIGHT(
        generationFunction = ::ItemHolosight,
        nameRes = R.string.item_holosight,
        imageRes = R.drawable.item_holosight
    ),

    @Researcheable
    @RustObject
    ITEM_HOMEMADE_LANDMINE(
        generationFunction = ::ItemHomemadeLandmine,
        nameRes = R.string.item_homemade_landmine,
        imageRes = R.drawable.item_homemade_landmine
    ),

    @Researcheable
    @RustObject
    ITEM_HOMING_MISSILE(
        generationFunction = ::ItemHomingMissile,
        nameRes = R.string.item_homing_missile,
        imageRes = R.drawable.item_homing_missile
    ),

    @Researcheable
    @RustObject
    ITEM_HOMING_MISSILE_LAUNCHER(
        generationFunction = ::ItemHomingMissileLauncher,
        nameRes = R.string.item_homing_missile_launcher,
        imageRes = R.drawable.item_homing_missile_launcher
    ),

    @Researcheable
    @RustObject
    ITEM_HOODIE(
        generationFunction = ::ItemHoodie,
        nameRes = R.string.item_hoodie,
        imageRes = R.drawable.item_hoodie
    ),

    @RustObject
    ITEM_HORIZONTAL_WEAPON_RACK(
        generationFunction = ::ItemHorizontalWeaponRack,
        nameRes = R.string.item_horizontal_weapon_rack,
        imageRes = R.drawable.item_horizontal_weapon_rack
    ),

    @RustObject
    ITEM_HORSE_DUNG(
        generationFunction = ::ItemHorseDung,
        nameRes = R.string.item_horse_dung,
        imageRes = R.drawable.item_horse_dung
    ),

    @RustObject
    ITEM_HORSE_SADDLE(
        generationFunction = ::ItemHorseSaddle,
        nameRes = R.string.item_horse_saddle,
        imageRes = R.drawable.item_horse_saddle
    ),

    @Researcheable
    @WaterTool
    @RustObject
    ITEM_HOSE_TOOL(
        generationFunction = ::ItemHoseTool,
        nameRes = R.string.item_hose_tool,
        imageRes = R.drawable.item_hose_tool
    ),

    @Researcheable
    @RustObject
    ITEM_HOT_AIR_BALLOON_ARMOR(
        generationFunction = ::ItemHotAirBalloonArmor,
        nameRes = R.string.item_hot_air_balloon_armor,
        imageRes = R.drawable.item_hot_air_balloon_armor
    ),

    @Researcheable
    @RustObject
    ITEM_HUGE_WOODEN_SIGN(
        generationFunction = ::ItemHugeWoodenSign,
        nameRes = R.string.item_huge_wooden_sign,
        imageRes = R.drawable.item_huge_wooden_sign
    ),

    @RustObject
    ITEM_HUMAN_SKILL(
        generationFunction = ::ItemHumanSkill,
        nameRes = R.string.item_human_skull,
        imageRes = R.drawable.item_human_skull
    ),

    @Researcheable
    @RustObject
    ITEM_HUNTING_BOW(
        generationFunction = ::ItemHuntingBow,
        nameRes = R.string.item_hunting_bow,
        imageRes = R.drawable.item_hunting_bow
    ),

    @Researcheable
    @RustObject
    ITEM_HV_5_56_RIFLE_AMMO(
        generationFunction = ::ItemHv556RifleAmmo,
        nameRes = R.string.item_hv_5_56_rifle_ammo,
        imageRes = R.drawable.item_hv_5_56_rifle_ammo
    ),

    @Researcheable
    @RustObject
    ITEM_HV_PISTOL_AMMO(
        generationFunction = ::ItemHvPistolAmmo,
        nameRes = R.string.item_hv_pistol_ammo,
        imageRes = R.drawable.item_hv_pistol_ammo
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ]
    )
    @RustObject
    ITEM_IGNITER(
        generationFunction = ::ItemIgniter,
        nameRes = R.string.item_igniter,
        imageRes = R.drawable.item_igniter
    ),

    @Researcheable
    @RustObject
    ITEM_IMPROVISED_BALACLAVA(
        generationFunction = ::ItemImprovisedBalaclava,
        nameRes = R.string.item_improvised_balaclava,
        imageRes = R.drawable.item_improvised_balaclava
    ),

    @Researcheable
    @RustObject
    ITEM_INCENDIARY_5_56_RIFLE_AMMO(
        generationFunction = ::ItemIncendiary556RifleAmmo,
        nameRes = R.string.item_incendiary_5_56_rifle_ammo,
        imageRes = R.drawable.item_incendiary_5_56_rifle_ammo
    ),

    @RustObject
    ITEM_INCENDIARY_PISTOL_BULLET(
        generationFunction = ::ItemIncendiaryPistolBullet,
        nameRes = R.string.item_incendiary_pistol_bullet,
        imageRes = R.drawable.item_incendiary_pistol_bullet
    ),

    @Researcheable
    @RustObject
    ITEM_INCENDIARY_ROCKET(
        generationFunction = ::ItemIncendiaryRocket,
        nameRes = R.string.item_incendiary_rocket,
        imageRes = R.drawable.item_incendiary_rocket
    ),

    @Researcheable
    @Deployable
    @IndustrialComponent(
        inputs = [
            "industrial_in_1",
            "industrial_in_2",
            "industrial_in_3"
        ],
        outputs = [
            "industrial_out"
        ]
    )
    @RustObject
    ITEM_INDUSTRIAL_COMBINER(
        generationFunction = ::ItemIndustrialCombiner,
        nameRes = R.string.item_industrial_combiner,
        imageRes = R.drawable.item_industrial_combiner
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in",
            "turn_on",
            "turn_off"
        ],
        outputs = [
            "passthrough",
            "filter_pass",
            "filter_fail"
        ]
    )
    @RustObject
    ITEM_INDUSTRIAL_CONVEYOR(
        generationFunction = ::ItemIndustrialConveyor,
        nameRes = R.string.item_industrial_conveyor,
        imageRes = R.drawable.item_industrial_conveyor
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "turn_off",
            "turn_on",
            "power_in",
            "toggle"
        ]
    )
    @IndustrialComponent(
        inputs = [
            "industrial_in",
            "blueprints_in"
        ],
        outputs = [
            "industrial_out",
            "blueprint_out"
        ]
    )
    @RustObject
    ITEM_INDUSTRIAL_CRAFTER(
        generationFunction = ::ItemIndustrialCrafter,
        nameRes = R.string.item_industrial_crafter,
        imageRes = R.drawable.item_industrial_crafter
    ),

    @Researcheable
    @Deployable
    @IndustrialComponent(
        inputs = [
            "industrial_in"
        ],
        outputs = [
            "industrial_out_1",
            "industrial_out_2",
            "industrial_out_3"
        ]
    )
    @RustObject
    ITEM_INDUSTRIAL_SPLITTER(
        generationFunction = ::ItemIndustrialSplitter,
        nameRes = R.string.item_industrial_splitter,
        imageRes = R.drawable.item_industrial_splitter
    ),

    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ],
        outputs = [
            "passthrough"
        ]
    )
    @RustObject
    ITEM_INDUSTRIAL_WALL_LIGHT(
        generationFunction = ::ItemIndustrialWallLight,
        nameRes = R.string.item_industrial_wall_light,
        imageRes = R.drawable.item_industrial_wall_light
    ),

    @Researcheable
    @RustObject
    ITEM_INNER_TUBE(
        generationFunction = ::ItemInnerTube,
        nameRes = R.string.item_inner_tube,
        imageRes = R.drawable.item_inner_tube
    ),

    @Researcheable
    @RustObject
    ITEM_INSTANT_CAMERA(
        generationFunction = ::ItemInstantCamera,
        nameRes = R.string.item_instant_camera,
        imageRes = R.drawable.item_instant_camera
    ),

    @Researcheable
    @RustObject
    ITEM_JACKET(
        generationFunction = ::ItemJacket,
        nameRes = R.string.item_jacket,
        imageRes = R.drawable.item_jacket
    ),

    @RustObject
    ITEM_JACKHAMMER(
        generationFunction = ::ItemJackhammer,
        nameRes = R.string.item_jackhammer,
        imageRes = R.drawable.item_jackhammer
    ),

    @RustObject
    ITEM_JACK_O_LANTERN_ANGRY(
        generationFunction = ::ItemJackOLanternAngry,
        nameRes = R.string.item_jack_o_lantern_angry,
        imageRes = R.drawable.item_jack_o_lantern_angry
    ),

    @RustObject
    ITEM_JACK_O_LANTERN_HAPPY(
        generationFunction = ::ItemJackOLanternHappy,
        nameRes = R.string.item_jack_o_lantern_happy,
        imageRes = R.drawable.item_jack_o_lantern_happy
    ),

    @Researcheable
    @RustObject
    ITEM_JERRY_CAN_GUITAR(
        generationFunction = ::ItemJerryCanGuitar,
        nameRes = R.string.item_jerry_can_guitar,
        imageRes = R.drawable.item_jerry_can_guitar
    ),

    @RustObject
    ITEM_JUMPSUIT(
        generationFunction = ::ItemJumpsuit,
        nameRes = R.string.item_jumpsuit,
        imageRes = R.drawable.item_jumpsuit
    ),

    @Researcheable
    @RustObject
    ITEM_JUNKYARD_DRUM_KIT(
        generationFunction = ::ItemJunkyardDrumKit,
        nameRes = R.string.item_junkyard_drum_kit,
        imageRes = R.drawable.item_junkyard_drum_kit
    ),

    @Researcheable
    @RustObject
    ITEM_KAYAK(
        generationFunction = ::ItemKayak,
        nameRes = R.string.item_kayak,
        imageRes = R.drawable.item_kayak
    ),

    @Researcheable
    @RustObject
    ITEM_KEY_LOCK(
        generationFunction = ::ItemKeyLock,
        nameRes = R.string.item_key_lock,
        imageRes = R.drawable.item_key_lock
    ),

    @RustObject
    ITEM_L96_RIFLE(
        generationFunction = ::ItemL96Rifle,
        nameRes = R.string.item_l96_rifle,
        imageRes = R.drawable.item_l96_rifle
    ),

    @Researcheable
    @DoorControllerAttachable
    @RustObject
    ITEM_LADDER_HATCH(
        generationFunction = ::ItemLadderHatch,
        nameRes = R.string.item_ladder_hatch,
        imageRes = R.drawable.item_ladder_hatch
    ),

    @Researcheable
    @RustObject
    ITEM_LANDSCAPE_PHOTO_FRAME(
        generationFunction = ::ItemLandscapePhotoFrame,
        nameRes = R.string.item_landscape_photo_frame,
        imageRes = R.drawable.item_landscape_photo_frame
    ),

    @RustObject
    ITEM_LANDSCAPE_PICTURE_FRAME(
        generationFunction = ::ItemLandscapePictureFrame,
        nameRes = R.string.item_landscape_picture_frame,
        imageRes = R.drawable.item_landscape_picture_frame
    ),

    @Researcheable
    @RustObject
    ITEM_LANTERN(
        generationFunction = ::ItemLantern,
        nameRes = R.string.item_lantern,
        imageRes = R.drawable.item_lantern
    ),

    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ],
        outputs = [
            "passthrough"
        ]
    )
    @RustObject
    ITEM_LARGE_ANIMATED_NEON_SIGN(
        generationFunction = ::ItemLargeAnimatedNeonSign,
        nameRes = R.string.item_large_animated_neon_sign,
        imageRes = R.drawable.item_large_animated_neon_sign
    ),

    @RustObject
    ITEM_LARGE_BACKPACK(
        generationFunction = ::ItemLargeBackpack,
        nameRes = R.string.item_large_backpack,
        imageRes = R.drawable.item_large_backpack
    ),

    @RustObject
    ITEM_LARGE_BANNER_HANGING(
        generationFunction = ::ItemLargeBannerHanging,
        nameRes = R.string.item_large_banner_hanging,
        imageRes = R.drawable.item_large_banner_hanging
    ),

    @RustObject
    ITEM_LARGE_BANNER_ON_POLE(
        generationFunction = ::ItemLargeBannerOnPole,
        nameRes = R.string.item_large_banner_on_pole,
        imageRes = R.drawable.item_large_banner_on_pole
    ),

    @RustObject
    ITEM_LARGE_CANDLE_SET(
        generationFunction = ::ItemLargeCandleSet,
        nameRes = R.string.item_large_candle_set,
        imageRes = R.drawable.item_large_candle_set
    ),

    @Researcheable
    @RustObject
    ITEM_LARGE_FLATBED_VEHICLE_MODULE(
        generationFunction = ::ItemLargeFlatbedVehicleModule,
        nameRes = R.string.item_large_flatbed_vehicle_module,
        imageRes = R.drawable.item_large_flatbed_vehicle_module
    ),

    @Researcheable
    @StorageAdaptorAttachable(slotAmount = 4)
    @RustObject
    ITEM_LARGE_FURNACE(
        generationFunction = ::ItemLargeFurnace,
        nameRes = R.string.item_large_furnace,
        imageRes = R.drawable.item_large_furnace
    ),

    @RustObject
    ITEM_LARGE_HUNTING_TROPHY(
        generationFunction = ::ItemLargeHuntingTrophy,
        nameRes = R.string.item_large_hunting_trophy,
        imageRes = R.drawable.item_large_hunting_trophy
    ),

    @RustObject
    ITEM_LARGE_LOOT_BAG(
        generationFunction = ::ItemLargeLootBag,
        nameRes = R.string.item_large_loot_bag,
        imageRes = R.drawable.item_large_loot_bag
    ),

    @Researcheable
    @RustObject
    ITEM_LARGE_MEDKIT(
        generationFunction = ::ItemLargeMedkit,
        nameRes = R.string.item_large_medkit,
        imageRes = R.drawable.item_large_medkit
    ),

    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ],
        outputs = [
            "passthrough"
        ]
    )
    @RustObject
    ITEM_LARGE_NEON_SIGN(
        generationFunction = ::ItemLargeNeonSign,
        nameRes = R.string.item_large_neon_sign,
        imageRes = R.drawable.item_large_neon_sign
    ),

    @Researcheable
    @RustObject
    ITEM_LARGE_PHOTO_FRAME(
        generationFunction = ::ItemLargePhotoFrame,
        nameRes = R.string.item_large_photo_frame,
        imageRes = R.drawable.item_large_photo_frame
    ),

    @Researcheable
    @RustObject
    ITEM_LARGE_PLANTER_BOX(
        generationFunction = ::ItemLargePlanterBox,
        nameRes = R.string.item_large_planter_box,
        imageRes = R.drawable.item_large_planter_box
    ),

    @RustObject
    ITEM_LARGE_PRESENT(
        generationFunction = ::ItemLargePresent,
        nameRes = R.string.item_large_present,
        imageRes = R.drawable.item_large_present
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ],
        outputs = [
            "power_output"
        ]
    )
    @RustObject
    ITEM_LARGE_RECHARGEABLE_BATTERY(
        generationFunction = ::ItemLargeRechargeableBattery,
        nameRes = R.string.item_large_rechargeable_battery,
        imageRes = R.drawable.item_large_rechargeable_battery
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [],
        outputs = [
            "electric_output"
        ]
    )
    @RustObject
    ITEM_LARGE_SOLAR_PANEL(
        generationFunction = ::ItemLargeSolarPanel,
        nameRes = R.string.item_large_solar_panel,
        imageRes = R.drawable.item_large_solar_panel
    ),

    @Researcheable
    @Deployable
    @WaterComponent(
        inputs = [
            "water_in"
        ],
        outputs = [
            "water_out"
        ]
    )
    @RustObject
    ITEM_LARGE_WATER_CATCHER(
        generationFunction = ::ItemLargeWaterCatcher,
        nameRes = R.string.item_large_water_catcher,
        imageRes = R.drawable.item_large_water_catcher
    ),

    @Researcheable
    @RustObject
    ITEM_LARGE_WOODEN_SIGN(
        generationFunction = ::ItemLargeWoodenSign,
        nameRes = R.string.item_large_wooden_sign,
        imageRes = R.drawable.item_large_wooden_sign
    ),

    @Researcheable
    @Deployable
    @StorageAdaptorAttachable(slotAmount = 4)
    @StorageMonitorAttachable
    @RustObject
    ITEM_LARGE_WOOD_BOX(
        generationFunction = ::ItemLargeWoodBox,
        nameRes = R.string.item_large_wood_box,
        imageRes = R.drawable.item_large_wood_box
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ],
        outputs = [
            "power_out"
        ]
    )
    @RustObject
    ITEM_LASER_DETECTOR(
        generationFunction = ::ItemLaserDetector,
        nameRes = R.string.item_laser_detector,
        imageRes = R.drawable.item_laser_detector
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_audio_in"
        ],
        outputs = [
            "audio_passthrough"
        ]
    )
    @RustObject
    ITEM_LASER_LIGHT(
        generationFunction = ::ItemLaserLight,
        nameRes = R.string.item_laser_light,
        imageRes = R.drawable.item_laser_light
    ),

    @RustObject
    ITEM_LEATHER(
        generationFunction = ::ItemLeather,
        nameRes = R.string.item_leather,
        imageRes = R.drawable.item_leather
    ),

    @Researcheable
    @RustObject
    ITEM_LEATHER_GLOVES(
        generationFunction = ::ItemLeatherGloves,
        nameRes = R.string.item_leather_gloves,
        imageRes = R.drawable.item_leather_gloves
    ),

    @Researcheable
    @RustObject
    ITEM_LEGACY_WOOD_SHELTER(
        generationFunction = ::ItemLegacyWoodShelter,
        nameRes = R.string.item_legacy_wood_shelter,
        imageRes = R.drawable.item_legacy_wood_shelter
    ),

    @RustObject
    ITEM_LIGHT_FRANKENSTEIN_HEAD(
        generationFunction = ::ItemLightFrankensteinHead,
        nameRes = R.string.item_light_frankenstein_head,
        imageRes = R.drawable.item_light_frankenstein_head
    ),

    @RustObject
    ITEM_LIGHT_FRANKENSTEIN_LEGS(
        generationFunction = ::ItemLightFrankensteinLegs,
        nameRes = R.string.item_light_frankenstein_legs,
        imageRes = R.drawable.item_light_frankenstein_legs
    ),

    @RustObject
    ITEM_LIGHT_FRANKENSTEIN_TORSO(
        generationFunction = ::ItemLightFrankensteinTorso,
        nameRes = R.string.item_light_frankenstein_torso,
        imageRes = R.drawable.item_light_frankenstein_torso
    ),

    @Researcheable
    @RustObject
    ITEM_LOCKER(
        generationFunction = ::ItemLocker,
        nameRes = R.string.item_locker,
        imageRes = R.drawable.item_locker
    ),

    @Researcheable
    @RustObject
    ITEM_LONGSLEEVE_T_SHIRT(
        generationFunction = ::ItemLongsleeveTShirt,
        nameRes = R.string.item_longsleeve_t_shirt,
        imageRes = R.drawable.item_longsleeve_t_shirt
    ),

    @Researcheable
    @RustObject
    ITEM_LONGSWORD(
        generationFunction = ::ItemLongsword,
        nameRes = R.string.item_longsword,
        imageRes = R.drawable.item_longsword
    ),

    @Researcheable
    @RustObject
    ITEM_LOW_GRADE_FUEL(
        generationFunction = ::ItemLowGradeFuel,
        nameRes = R.string.item_low_grade_fuel,
        imageRes = R.drawable.item_low_grade_fuel
    ),

    @Researcheable
    @RustObject
    ITEM_LOW_QUALITY_CARBURETOR(
        generationFunction = ::ItemLowQualityCarburetor,
        nameRes = R.string.item_low_quality_carburetor,
        imageRes = R.drawable.item_low_quality_carburetor
    ),

    @Researcheable
    @RustObject
    ITEM_LOW_QUALITY_CRANKSHAFT(
        generationFunction = ::ItemLowQualityCrankshaft,
        nameRes = R.string.item_low_quality_crankshaft,
        imageRes = R.drawable.item_low_quality_crankshaft
    ),

    @Researcheable
    @RustObject
    ITEM_LOW_QUALITY_PISTONS(
        generationFunction = ::ItemLowQualityPistons,
        nameRes = R.string.item_low_quality_pistons,
        imageRes = R.drawable.item_low_quality_pistons
    ),

    @Researcheable
    @RustObject
    ITEM_LOW_QUALITY_SPARK_PLUGS(
        generationFunction = ::ItemLowQualitySparkPlugs,
        nameRes = R.string.item_low_quality_spark_plugs,
        imageRes = R.drawable.item_low_quality_spark_plugs
    ),

    @Researcheable
    @RustObject
    ITEM_LOW_QUALITY_VALVES(
        generationFunction = ::ItemLowQualityValves,
        nameRes = R.string.item_low_quality_valves,
        imageRes = R.drawable.item_low_quality_valves
    ),

    @RustObject
    ITEM_LR_300_ASSAULT_RIFLE(
        generationFunction = ::ItemLr300AssaultRifle,
        nameRes = R.string.item_lr_300_assault_rifle,
        imageRes = R.drawable.item_lr_300_assault_rifle
    ),

    @RustObject
    ITEM_LUMBERJACK_HOODIE(
        generationFunction = ::ItemLumberjackHoodie,
        nameRes = R.string.item_lumberjack_hoodie,
        imageRes = R.drawable.item_lumberjack_hoodie
    ),

    @RustObject
    ITEM_M249(
        generationFunction = ::ItemM249,
        nameRes = R.string.item_m249,
        imageRes = R.drawable.item_m249
    ),

    @RustObject
    ITEM_M39_RIFLE(
        generationFunction = ::ItemM39Rifle,
        nameRes = R.string.item_m39_rifle,
        imageRes = R.drawable.item_m39_rifle
    ),

    @RustObject
    ITEM_M4_SHOTWUN(
        generationFunction = ::ItemM4Shotwun,
        nameRes = R.string.item_m4_shotgun,
        imageRes = R.drawable.item_m4_shotgun
    ),

    @RustObject
    ITEM_M92_PISTOL(
        generationFunction = ::ItemM92Pistol,
        nameRes = R.string.item_m92_pistol,
        imageRes = R.drawable.item_m92_pistol
    ),

    @Researcheable
    @RustObject
    ITEM_MACE(
        generationFunction = ::ItemMace,
        nameRes = R.string.item_mace,
        imageRes = R.drawable.item_mace
    ),

    @Researcheable
    @RustObject
    ITEM_MACHETE(
        generationFunction = ::ItemMachete,
        nameRes = R.string.item_machete,
        imageRes = R.drawable.item_machete
    ),

    @Researcheable
    @RustObject
    ITEM_MAIL_BOX(
        generationFunction = ::ItemMailBox,
        nameRes = R.string.item_mail_box,
        imageRes = R.drawable.item_mail_box
    ),

    @Researcheable
    @RustObject
    ITEM_MEDICAL_SYRINGE(
        generationFunction = ::ItemMedicalSyringe,
        nameRes = R.string.item_medical_syringe,
        imageRes = R.drawable.item_medical_syringe
    ),

    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ],
        outputs = [
            "passthrough"
        ]
    )
    @RustObject
    ITEM_MEDIUM_ANIMATED_NEON_SIGN(
        generationFunction = ::ItemMediumAnimatedNeonSign,
        nameRes = R.string.item_medium_animated_neon_sign,
        imageRes = R.drawable.item_medium_animated_neon_sign
    ),

    @RustObject
    ITEM_MEDIUM_FRANKENSTEIN_HEAD(
        generationFunction = ::ItemMediumFrankensteinHead,
        nameRes = R.string.item_medium_frankenstein_head,
        imageRes = R.drawable.item_medium_frankenstein_head
    ),

    @RustObject
    ITEM_MEDIUM_FRANKENSTEIN_LEGS(
        generationFunction = ::ItemMediumFrankensteinLegs,
        nameRes = R.string.item_medium_frankenstein_legs,
        imageRes = R.drawable.item_medium_frankenstein_legs
    ),

    @RustObject
    ITEM_MEDIUM_FRANKENSTEIN_TORSO(
        generationFunction = ::ItemMediumFrankensteinTorso,
        nameRes = R.string.item_medium_frankenstein_torso,
        imageRes = R.drawable.item_medium_frankenstein_torso
    ),

    @RustObject
    ITEM_MEDIUM_LOOT_BAG(
        generationFunction = ::ItemMediumLootBag,
        nameRes = R.string.item_medium_loot_bag,
        imageRes = R.drawable.item_medium_loot_bag
    ),

    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ],
        outputs = [
            "passthrough"
        ]
    )
    @RustObject
    ITEM_MEDIUM_NEON_SIGN(
        generationFunction = ::ItemMediumNeonSign,
        nameRes = R.string.item_medium_neon_sign,
        imageRes = R.drawable.item_medium_neon_sign
    ),

    @RustObject
    ITEM_MEDIUM_PRESENT(
        generationFunction = ::ItemMediumPresent,
        nameRes = R.string.item_medium_present,
        imageRes = R.drawable.item_medium_present
    ),

    @Researcheable
    @RustObject
    ITEM_MEDIUM_QUALITY_CARBURETOR(
        generationFunction = ::ItemMediumQualityCarburetor,
        nameRes = R.string.item_medium_quality_carburetor,
        imageRes = R.drawable.item_medium_quality_carburetor
    ),

    @Researcheable
    @RustObject
    ITEM_MEDIUM_QUALITY_CRANKSHAFT(
        generationFunction = ::ItemMediumQualityCrankshaft,
        nameRes = R.string.item_medium_quality_crankshaft,
        imageRes = R.drawable.item_medium_quality_crankshaft
    ),

    @Researcheable
    @RustObject
    ITEM_MEDIUM_QUALITY_PISTONS(
        generationFunction = ::ItemMediumQualityPistons,
        nameRes = R.string.item_medium_quality_pistons,
        imageRes = R.drawable.item_medium_quality_pistons
    ),

    @Researcheable
    @RustObject
    ITEM_MEDIUM_QUALITY_SPARK_PLUGS(
        generationFunction = ::ItemMediumQualitySparkPlugs,
        nameRes = R.string.item_medium_quality_spark_plugs,
        imageRes = R.drawable.item_medium_quality_spark_plugs
    ),

    @Researcheable
    @RustObject
    ITEM_MEDIUM_QUALITY_VALVES(
        generationFunction = ::ItemMediumQualityValves,
        nameRes = R.string.item_medium_quality_valves,
        imageRes = R.drawable.item_medium_quality_valves
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ],
        outputs = [
            "power_output"
        ]
    )
    @RustObject
    ITEM_MEDIUM_RECHARGEABLE_BATTERY(
        generationFunction = ::ItemMediumRechargeableBattery,
        nameRes = R.string.item_medium_rechargeable_battery,
        imageRes = R.drawable.item_medium_rechargeable_battery
    ),

    @Researcheable
    @RustObject
    ITEM_MEDIUM_WOODEN_SIGN(
        generationFunction = ::ItemMediumWoodenSign,
        nameRes = R.string.item_medium_wooden_sign,
        imageRes = R.drawable.item_medium_wooden_sign
    ),

    @Researcheable
    @RustObject
    ITEM_MEGAPHONE(
        generationFunction = ::ItemMegaphone,
        nameRes = R.string.item_megaphone,
        imageRes = R.drawable.item_megaphone
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in",
            "set",
            "reset",
            "toggle"
        ],
        outputs = [
            "inverted_output",
            "output"
        ]
    )
    @RustObject
    ITEM_MEMORY_CELL(
        generationFunction = ::ItemMemoryCell,
        nameRes = R.string.item_memory_cell,
        imageRes = R.drawable.item_memory_cell
    ),

    @Researcheable
    @RustObject
    ITEM_METAL_BARRICADE(
        generationFunction = ::ItemMetalBarricade,
        nameRes = R.string.item_metal_barricade,
        imageRes = R.drawable.item_metal_barricade
    ),

    @Researcheable
    @RustObject
    ITEM_METAL_BLADE(
        generationFunction = ::ItemMetalBlade,
        nameRes = R.string.item_metal_blade,
        imageRes = R.drawable.item_metal_blade
    ),

    @Researcheable
    @RustObject
    ITEM_METAL_CHEST_PLATE(
        generationFunction = ::ItemMetalChestPlate,
        nameRes = R.string.item_metal_chest_plate,
        imageRes = R.drawable.item_metal_chest_plate
    ),

    @Researcheable
    @RustObject
    ITEM_METAL_DETECTOR(
        generationFunction = ::ItemMetalDetector,
        nameRes = R.string.item_metal_detector,
        imageRes = R.drawable.item_metal_detector
    ),

    @Researcheable
    @RustObject
    ITEM_METAL_FACEMASK(
        generationFunction = ::ItemMetalFacemask,
        nameRes = R.string.item_metal_facemask,
        imageRes = R.drawable.item_metal_facemask
    ),

    @RustObject
    ITEM_METAL_FRAGMENTS(
        generationFunction = ::ItemMetalFragments,
        nameRes = R.string.item_metal_fragments,
        imageRes = R.drawable.item_metal_fragments
    ),

    @Researcheable
    @RustObject
    ITEM_METAL_HORIZONTAL_EMBRASURE(
        generationFunction = ::ItemMetalHorizontalEmbrasure,
        nameRes = R.string.item_metal_horizontal_embrasure,
        imageRes = R.drawable.item_metal_horizontal_embrasure
    ),

    @RustObject
    ITEM_METAL_ORE(
        generationFunction = ::ItemMetalOre,
        nameRes = R.string.item_metal_ore,
        imageRes = R.drawable.item_metal_ore
    ),

    @Researcheable
    @RustObject
    ITEM_METAL_PIPE(
        generationFunction = ::ItemMetalPipe,
        nameRes = R.string.item_metal_pipe,
        imageRes = R.drawable.item_metal_pipe
    ),

    @Researcheable
    @RustObject
    ITEM_METAL_SHOP_FRONT(
        generationFunction = ::ItemMetalShopFront,
        nameRes = R.string.item_metal_shop_front,
        imageRes = R.drawable.item_metal_shop_front
    ),

    @Researcheable
    @RustObject
    ITEM_METAL_SPRING(
        generationFunction = ::ItemMetalSpring,
        nameRes = R.string.item_metal_spring,
        imageRes = R.drawable.item_metal_spring
    ),

    @Researcheable
    @RustObject
    ITEM_METAL_VERTICAL_EMBRASURE(
        generationFunction = ::ItemMetalVerticalEmbrasure,
        nameRes = R.string.item_metal_vertical_embrasure,
        imageRes = R.drawable.item_metal_vertical_embrasure
    ),

    @Researcheable
    @RustObject
    ITEM_METAL_WINDOW_BARS(
        generationFunction = ::ItemMetalWindowBars,
        nameRes = R.string.item_metal_window_bars,
        imageRes = R.drawable.item_metal_window_bars
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ],
        outputs = [
            "audio_out"
        ]
    )
    @RustObject
    ITEM_MICROPHONE_STAND(
        generationFunction = ::ItemMicrophoneStand,
        nameRes = R.string.item_microphone_stand,
        imageRes = R.drawable.item_microphone_stand
    ),

    @RustObject
    ITEM_MILITARY_FLAME_THROWER(
        generationFunction = ::ItemMilitaryFlameThrower,
        nameRes = R.string.item_military_flame_thrower,
        imageRes = R.drawable.item_military_flame_thrower
    ),

    @RustObject
    ITEM_MINECART_PLANTER(
        generationFunction = ::ItemMinecartPlanter,
        nameRes = R.string.item_minecart_planter,
        imageRes = R.drawable.item_minecart_planter
    ),

    @Researcheable
    @RustObject
    ITEM_MINERS_HAT(
        generationFunction = ::ItemMinersHat,
        nameRes = R.string.item_miners_hat,
        imageRes = R.drawable.item_miners_hat
    ),

    @RustObject
    ITEM_MINIGUN(
        generationFunction = ::ItemMinigun,
        nameRes = R.string.item_minigun,
        imageRes = R.drawable.item_minigun
    ),

    @RustObject
    ITEM_MINING_QUARRY(
        generationFunction = ::ItemMiningQuarry,
        nameRes = R.string.item_mining_quarry,
        imageRes = R.drawable.item_mining_quarry
    ),

    @RustObject
    ITEM_MINNOWS(
        generationFunction = ::ItemMinnows,
        nameRes = R.string.item_minnows,
        imageRes = R.drawable.item_minnows
    ),

    @Researcheable
    @RustObject
    ITEM_MIXING_TABLE(
        generationFunction = ::ItemMixingTable,
        nameRes = R.string.item_mixing_table,
        imageRes = R.drawable.item_mixing_table
    ),

    @RustObject
    ITEM_MLRS_AIMING_MODULE(
        generationFunction = ::ItemMlrsAimingModule,
        nameRes = R.string.item_mlrs_aiming_module,
        imageRes = R.drawable.item_mlrs_aiming_module
    ),

    @RustObject
    ITEM_MLRS_ROCKET(
        generationFunction = ::ItemMlrsRocket,
        nameRes = R.string.item_mlrs_rocket,
        imageRes = R.drawable.item_mlrs_rocket
    ),

    @Researcheable
    @RustObject
    ITEM_MOBILE_PHONE(
        generationFunction = ::ItemMobilePhone,
        nameRes = R.string.item_mobile_phone,
        imageRes = R.drawable.item_mobile_phone
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ]
    )
    @RustObject
    ITEM_MODULAR_CAR_LIFT(
        generationFunction = ::ItemModularCarLift,
        nameRes = R.string.item_modular_car_lift,
        imageRes = R.drawable.item_modular_car_lift
    ),

    @Researcheable
    @RustObject
    ITEM_MOLOTOV_COCKTAIL(
        generationFunction = ::ItemMolotovCocktail,
        nameRes = R.string.item_molotov_cocktail,
        imageRes = R.drawable.item_molotov_cocktail
    ),

    @RustObject
    ITEM_MOVEMBER_MOUSTACHE(
        generationFunction = ::ItemMovemberMoustache,
        nameRes = R.string.item_movember_moustache,
        imageRes = R.drawable.item_movember_moustache
    ),

    @Researcheable
    @RustObject
    ITEM_MP5A4(
        generationFunction = ::ItemMp5a4,
        nameRes = R.string.item_mp5a4,
        imageRes = R.drawable.item_mp5a4
    ),

    @RustObject
    ITEM_MULTIPLE_GRENADE_LAUNCHER(
        generationFunction = ::ItemMultipleGrenadeLauncher,
        nameRes = R.string.item_multiple_grenade_launcher,
        imageRes = R.drawable.item_multiple_grenade_launcher
    ),

    @RustObject
    ITEM_MUMMY_MASK(
        generationFunction = ::ItemMummyMask,
        nameRes = R.string.item_mummy_mask,
        imageRes = R.drawable.item_mummy_mask
    ),

    @RustObject
    ITEM_MUMMY_SUIT(
        generationFunction = ::ItemMummySuit,
        nameRes = R.string.item_mummy_suit,
        imageRes = R.drawable.item_mummy_suit
    ),

    @RustObject
    ITEM_MUSHROOM(
        generationFunction = ::ItemMushroom,
        nameRes = R.string.item_mushroom,
        imageRes = R.drawable.item_mushroom
    ),

    @Researcheable
    @RustObject
    ITEM_MUZZLE_BOOST(
        generationFunction = ::ItemMuzzleBoost,
        nameRes = R.string.item_muzzle_boost,
        imageRes = R.drawable.item_muzzle_boost
    ),

    @Researcheable
    @RustObject
    ITEM_MUZZLE_BRAKE(
        generationFunction = ::ItemMuzzleBrake,
        nameRes = R.string.item_muzzle_brake,
        imageRes = R.drawable.item_muzzle_brake
    ),

    @Researcheable
    @RustObject
    ITEM_NAILGUN(
        generationFunction = ::ItemNailgun,
        nameRes = R.string.item_nailgun,
        imageRes = R.drawable.item_nailgun
    ),

    @Researcheable
    @RustObject
    ITEM_NAILGUN_NAILS(
        generationFunction = ::ItemNailgunNails,
        nameRes = R.string.item_nailgun_nails,
        imageRes = R.drawable.item_nailgun_nails
    ),

    @RustObject
    ITEM_NEST_HAT(
        generationFunction = ::ItemNestHat,
        nameRes = R.string.item_nest_hat,
        imageRes = R.drawable.item_nest_hat
    ),

    @Researcheable
    @RustObject
    ITEM_NETTING(
        generationFunction = ::ItemNetting,
        nameRes = R.string.item_netting,
        imageRes = R.drawable.item_netting
    ),

    @RustObject
    ITEM_NEW_YEAR_GONG(
        generationFunction = ::ItemNewYearGong,
        nameRes = R.string.item_new_year_gong,
        imageRes = R.drawable.item_new_year_gong
    ),

    @Researcheable
    @RustObject
    ITEM_NIGHT_VISION_GOGGLES(
        generationFunction = ::ItemNightVisionGoggles,
        nameRes = R.string.item_night_vision_goggles,
        imageRes = R.drawable.item_night_vision_goggles
    ),

    @RustObject
    ITEM_NINJA_SUIT(
        generationFunction = ::ItemNinjaSuit,
        nameRes = R.string.item_ninja_suit,
        imageRes = R.drawable.item_ninja_suit
    ),

    @Researcheable
    @RustObject
    ITEM_NOTE(
        generationFunction = ::ItemNote,
        nameRes = R.string.item_note,
        imageRes = R.drawable.item_note
    ),

    @RustObject
    ITEM_NVGM_SCIENTIST_SUIT(
        generationFunction = ::ItemNvgmScientistSuit,
        nameRes = R.string.item_nvgm_scientist_suit,
        imageRes = R.drawable.item_nvgm_scientist_suit
    ),

    @RustObject
    ITEM_ONE_SIDED_TOWN_SIGN_POST(
        generationFunction = ::ItemOneSidedTownSignPost,
        nameRes = R.string.item_one_sided_town_sign_post,
        imageRes = R.drawable.item_one_sided_town_sign_post
    ),

    @RustObject
    ITEM_ORANGE_BOOMER(
        generationFunction = ::ItemOrangeBoomer,
        nameRes = R.string.item_orange_boomer,
        imageRes = R.drawable.item_orange_boomer
    ),

    @RustObject
    ITEM_ORANGE_ROUGHY(
        generationFunction = ::ItemOrangeRoughy,
        nameRes = R.string.item_orange_roughy,
        imageRes = R.drawable.item_orange_roughy
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "input_a",
            "input_b"
        ],
        outputs = [
            "power_out"
        ]
    )
    @RustObject
    ITEM_OR_SWITCH(
        generationFunction = ::ItemOrSwitch,
        nameRes = R.string.item_or_switch,
        imageRes = R.drawable.item_or_switch
    ),

    @RustObject
    ITEM_OX_MASK(
        generationFunction = ::ItemOxMask,
        nameRes = R.string.item_ox_mask,
        imageRes = R.drawable.item_ox_mask
    ),

    @Researcheable
    @RustObject
    ITEM_PADDLE(
        generationFunction = ::ItemPaddle,
        nameRes = R.string.item_paddle,
        imageRes = R.drawable.item_paddle
    ),

    @Researcheable
    @RustObject
    ITEM_PADDLING_POOL(
        generationFunction = ::ItemPaddlingPool,
        nameRes = R.string.item_paddling_pool,
        imageRes = R.drawable.item_paddling_pool
    ),

    @RustObject
    ITEM_PAINTED_EGG(
        generationFunction = ::ItemPaintedEgg,
        nameRes = R.string.item_painted_egg,
        imageRes = R.drawable.item_painted_egg
    ),

    @Researcheable
    @RustObject
    ITEM_PANTS(
        generationFunction = ::ItemPants,
        nameRes = R.string.item_pants,
        imageRes = R.drawable.item_pants
    ),

    @Researcheable
    @RustObject
    ITEM_PAN_FLUTE(
        generationFunction = ::ItemPanFlute,
        nameRes = R.string.item_pan_flute,
        imageRes = R.drawable.item_pan_flute
    ),

    @RustObject
    ITEM_PAPER(
        generationFunction = ::ItemPaper,
        nameRes = R.string.item_paper,
        imageRes = R.drawable.item_paper
    ),

    @RustObject
    ITEM_PAPER_MAP(
        generationFunction = ::ItemPaperMap,
        nameRes = R.string.item_paper_map,
        imageRes = R.drawable.item_paper_map
    ),

    @Researcheable
    @RustObject
    ITEM_PARACHUTE(
        generationFunction = ::ItemParachute,
        nameRes = R.string.item_parachute,
        imageRes = R.drawable.item_parachute
    ),

    @Researcheable
    @RustObject
    ITEM_PARTY_HAT(
        generationFunction = ::ItemPartyHat,
        nameRes = R.string.item_party_hat,
        imageRes = R.drawable.item_party_hat
    ),

    @Researcheable
    @RustObject
    ITEM_PASSENGER_VEHICLE_MODULE(
        generationFunction = ::ItemPassengerVehicleModule,
        nameRes = R.string.item_passenger_vehicle_module,
        imageRes = R.drawable.item_passenger_vehicle_module
    ),

    @RustObject
    ITEM_PATTERN_BOOMER(
        generationFunction = ::ItemPatternBoomer,
        nameRes = R.string.item_pattern_boomer,
        imageRes = R.drawable.item_pattern_boomer
    ),

    @RustObject
    ITEM_PHOTOGRAPH(
        generationFunction = ::ItemPhotograph,
        nameRes = R.string.item_photograph,
        imageRes = R.drawable.item_photograph
    ),

    @Researcheable
    @RustObject
    ITEM_PICKAXE(
        generationFunction = ::ItemPickaxe,
        nameRes = R.string.item_pickaxe,
        imageRes = R.drawable.item_pickaxe
    ),

    @RustObject
    ITEM_PICKLES(
        generationFunction = ::ItemPickles,
        nameRes = R.string.item_pickles,
        imageRes = R.drawable.item_pickles
    ),

    @RustObject
    ITEM_PINATA(
        generationFunction = ::ItemPinata,
        nameRes = R.string.item_pinata,
        imageRes = R.drawable.item_pinata
    ),

    @Researcheable
    @IndustrialTool
    @RustObject
    ITEM_PIPE_TOOL(
        generationFunction = ::ItemPipeTool,
        nameRes = R.string.item_pipe_tool,
        imageRes = R.drawable.item_pipe_tool
    ),

    @Researcheable
    @RustObject
    ITEM_PISTOL_BULLET(
        generationFunction = ::ItemPistolBullet,
        nameRes = R.string.item_pistol_bullet,
        imageRes = R.drawable.item_pistol_bullet
    ),

    @RustObject
    ITEM_PITCHFORK(
        generationFunction = ::ItemPitchfork,
        nameRes = R.string.item_pitchfork,
        imageRes = R.drawable.item_pitchfork
    ),

    @RustObject
    ITEM_PLANT_FIBER(
        generationFunction = ::ItemPlantFiber,
        nameRes = R.string.item_plant_fiber,
        imageRes = R.drawable.item_plant_fiber
    ),

    @RustObject
    ITEM_PLUMBERS_TRUMPET(
        generationFunction = ::ItemPlumbersTrumpet,
        nameRes = R.string.item_plumbers_trumpet,
        imageRes = R.drawable.item_plumbers_trumpet
    ),

    @RustObject
    ITEM_POOKIE_BEAR(
        generationFunction = ::ItemPookieBear,
        nameRes = R.string.item_pookie_bear,
        imageRes = R.drawable.item_pookie_bear
    ),

    @Researcheable
    @RustObject
    ITEM_PORTABLE_BOOM_BOX(
        generationFunction = ::ItemPortableBoomBox,
        nameRes = R.string.item_portable_boom_box,
        imageRes = R.drawable.item_portable_boom_box
    ),

    @Researcheable
    @RustObject
    ITEM_PORTRAIT_PHOTO_FRAME(
        generationFunction = ::ItemPortraitPhotoFrame,
        nameRes = R.string.item_portrait_photo_frame,
        imageRes = R.drawable.item_portrait_photo_frame
    ),

    @RustObject
    ITEM_PORTRAIT_PICTURE_FRAME(
        generationFunction = ::ItemPortraitPictureFrame,
        nameRes = R.string.item_portrait_picture_frame,
        imageRes = R.drawable.item_portrait_picture_frame
    ),

    @RustObject
    ITEM_POTATO(
        generationFunction = ::ItemPotato,
        nameRes = R.string.item_potato,
        imageRes = R.drawable.item_potato
    ),

    @RustObject
    ITEM_POTATO_CLONE(
        generationFunction = ::ItemPotatoClone,
        nameRes = R.string.item_potato_clone,
        imageRes = R.drawable.item_potato_clone
    ),

    @RustObject
    ITEM_POTATO_SEED(
        generationFunction = ::ItemPotatoSeed,
        nameRes = R.string.item_potato_seed,
        imageRes = R.drawable.item_potato_seed
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ]
    )
    @WaterComponent(
        inputs = [
            "water_in"
        ],
        outputs = [
            "water_out"
        ]
    )
    @RustObject
    ITEM_POWERED_WATER_PURIFIER(
        generationFunction = ::ItemPoweredWaterPurifier,
        nameRes = R.string.item_powered_water_purifier,
        imageRes = R.drawable.item_powered_water_purifier
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ],
        outputs = [
            "power_out"
        ]
    )
    @RustObject
    ITEM_PRESSURE_PAD(
        generationFunction = ::ItemPressurePad,
        nameRes = R.string.item_pressure_pad,
        imageRes = R.drawable.item_pressure_pad
    ),

    @Researcheable
    @RustObject
    ITEM_PRISONER_HOOD(
        generationFunction = ::ItemPrisonerHood,
        nameRes = R.string.item_prisoner_hood,
        imageRes = R.drawable.item_prisoner_hood
    ),

    @Researcheable
    @DoorControllerAttachable
    @RustObject
    ITEM_PRISON_CELL_GATE(
        generationFunction = ::ItemPrisonCellGate,
        nameRes = R.string.item_prison_cell_gate,
        imageRes = R.drawable.item_prison_cell_gate
    ),

    @Researcheable
    @RustObject
    ITEM_PRISON_CELL_WALL(
        generationFunction = ::ItemPrisonCellWall,
        nameRes = R.string.item_prison_cell_wall,
        imageRes = R.drawable.item_prison_cell_wall
    ),

    @RustObject
    ITEM_PROTOTYPE_17(
        generationFunction = ::ItemPrototype17,
        nameRes = R.string.item_prototype_17,
        imageRes = R.drawable.item_prototype_17
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ]
    )
    @RustObject
    ITEM_PTZ_CCTV_CAMERA(
        generationFunction = ::ItemPtzCctvCamera,
        nameRes = R.string.item_ptz_cctv_camera,
        imageRes = R.drawable.item_ptz_cctv_camera
    ),

    @RustObject
    ITEM_PUMPKIN(
        generationFunction = ::ItemPumpkin,
        nameRes = R.string.item_pumpkin,
        imageRes = R.drawable.item_pumpkin
    ),

    @RustObject
    ITEM_PUMPKIN_BASKET(
        generationFunction = ::ItemPumpkinBasket,
        nameRes = R.string.item_pumpkin_basket,
        imageRes = R.drawable.item_pumpkin_basket
    ),

    @RustObject
    ITEM_PUMPKIN_PLANT_CLONE(
        generationFunction = ::ItemPumpkinPlantClone,
        nameRes = R.string.item_pumpkin_plant_clone,
        imageRes = R.drawable.item_pumpkin_plant_clone
    ),

    @RustObject
    ITEM_PUMPKIN_SEED(
        generationFunction = ::ItemPumpkinSeed,
        nameRes = R.string.item_pumpkin_seed,
        imageRes = R.drawable.item_pumpkin_seed
    ),

    @RustObject
    ITEM_PUMP_JACK(
        generationFunction = ::ItemPumpJack,
        nameRes = R.string.item_pump_jack,
        imageRes = R.drawable.item_pump_jack
    ),

    @Researcheable
    @RustObject
    ITEM_PUMP_SHOTGUN(
        generationFunction = ::ItemPumpShotgun,
        nameRes = R.string.item_pump_shotgun,
        imageRes = R.drawable.item_pump_shotgun
    ),

    @RustObject
    ITEM_PURE_ANTI_RAD_TEA(
        generationFunction = ::ItemPureAntiRadTea,
        nameRes = R.string.item_pure_anti_rad_tea,
        imageRes = R.drawable.item_pure_anti_rad_tea
    ),

    @RustObject
    ITEM_PURE_HEALING_TEA(
        generationFunction = ::ItemPureHealingTea,
        nameRes = R.string.item_pure_healing_tea,
        imageRes = R.drawable.item_pure_healing_tea
    ),

    @RustObject
    ITEM_PURE_MAX_HEALTH_TEA(
        generationFunction = ::ItemPureMaxHealthTea,
        nameRes = R.string.item_pure_max_health_tea,
        imageRes = R.drawable.item_pure_max_health_tea
    ),

    @RustObject
    ITEM_PURE_ORE_TEA(
        generationFunction = ::ItemPureOreTea,
        nameRes = R.string.item_pure_ore_tea,
        imageRes = R.drawable.item_pure_ore_tea
    ),

    @RustObject
    ITEM_PURE_RAD_REMOVAL_TEA(
        generationFunction = ::ItemPureRadRemovalTea,
        nameRes = R.string.item_pure_rad_removal_tea,
        imageRes = R.drawable.item_pure_rad_removal_tea
    ),

    @RustObject
    ITEM_PURE_SCRAP_TEA(
        generationFunction = ::ItemPureScrapTea,
        nameRes = R.string.item_pure_scrap_tea,
        imageRes = R.drawable.item_pure_scrap_tea
    ),

    @RustObject
    ITEM_PURE_WOOD_TEA(
        generationFunction = ::ItemPureWoodTea,
        nameRes = R.string.item_pure_wood_tea,
        imageRes = R.drawable.item_pure_wood_tea
    ),

    @RustObject
    ITEM_PURPLE_SUNGLASSES(
        generationFunction = ::ItemPurpleSunglasses,
        nameRes = R.string.item_purple_sunglasses,
        imageRes = R.drawable.item_purple_sunglasses
    ),

    @Researcheable
    @RustObject
    ITEM_PYTHON_REVOLVER(
        generationFunction = ::ItemPythonRevolver,
        nameRes = R.string.item_python_revolver,
        imageRes = R.drawable.item_python_revolver
    ),

    @RustObject
    ITEM_RABBIT_MASK(
        generationFunction = ::ItemRabbitMask,
        nameRes = R.string.item_rabbit_mask,
        imageRes = R.drawable.item_rabbit_mask
    ),

    @RustObject
    ITEM_RADIOACTIVE_WATER(
        generationFunction = ::ItemRadioactiveWater,
        nameRes = R.string.item_radioactive_water,
        imageRes = R.drawable.item_radioactive_water
    ),

    @RustObject
    ITEM_RAD_REMOVAL_TEA(
        generationFunction = ::ItemRadRemovalTea,
        nameRes = R.string.item_rad_removal_tea,
        imageRes = R.drawable.item_rad_removal_tea
    ),

    @RustObject
    ITEM_RAIL_ROAD_PLANTER(
        generationFunction = ::ItemRailRoadPlanter,
        nameRes = R.string.item_rail_road_planter,
        imageRes = R.drawable.item_rail_road_planter
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in",
            "set",
            "reset"
        ],
        outputs = [
            "power_out"
        ]
    )
    @RustObject
    ITEM_RAND_SWITCH(
        generationFunction = ::ItemRandSwitch,
        nameRes = R.string.item_rand_switch,
        imageRes = R.drawable.item_rand_switch
    ),

    @RustObject
    ITEM_RAT_MASK(
        generationFunction = ::ItemRatMask,
        nameRes = R.string.item_rat_mask,
        imageRes = R.drawable.item_rat_mask
    ),

    @RustObject
    ITEM_RAW_BEAR_MEAT(
        generationFunction = ::ItemRawBearMeat,
        nameRes = R.string.item_raw_bear_meat,
        imageRes = R.drawable.item_raw_bear_meat
    ),

    @RustObject
    ITEM_RAW_CHICKEN_BREAST(
        generationFunction = ::ItemRawChickenBreast,
        nameRes = R.string.item_raw_chicken_breast,
        imageRes = R.drawable.item_raw_chicken_breast
    ),

    @RustObject
    ITEM_RAW_DEER_MEAT(
        generationFunction = ::ItemRawDeerMeat,
        nameRes = R.string.item_raw_deer_meat,
        imageRes = R.drawable.item_raw_deer_meat
    ),

    @RustObject
    ITEM_RAW_FISH(
        generationFunction = ::ItemRawFish,
        nameRes = R.string.item_raw_fish,
        imageRes = R.drawable.item_raw_fish
    ),

    @RustObject
    ITEM_RAW_HORSE_MEAT(
        generationFunction = ::ItemRawHorseMeat,
        nameRes = R.string.item_raw_horse_meat,
        imageRes = R.drawable.item_raw_horse_meat
    ),

    @RustObject
    ITEM_RAW_HUMAN_MEAT(
        generationFunction = ::ItemRawHumanMeat,
        nameRes = R.string.item_raw_human_meat,
        imageRes = R.drawable.item_raw_human_meat
    ),

    @RustObject
    ITEM_RAW_PORK(
        generationFunction = ::ItemRawPork,
        nameRes = R.string.item_raw_pork,
        imageRes = R.drawable.item_raw_pork
    ),

    @RustObject
    ITEM_RAW_WOLF_MEAT(
        generationFunction = ::ItemRawWolfMeat,
        nameRes = R.string.item_raw_wolf_meat,
        imageRes = R.drawable.item_raw_wolf_meat
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in",
            "reset",
            "lower"
        ],
        outputs = [
            "power_out"
        ]
    )
    @RustObject
    ITEM_REACTIVE_TARGET(
        generationFunction = ::ItemReactiveTarget,
        nameRes = R.string.item_reactive_target,
        imageRes = R.drawable.item_reactive_target
    ),

    @Researcheable
    @RustObject
    ITEM_REAR_SEATS_VEHICLE_MODULE(
        generationFunction = ::ItemRearSeatsVehicleModule,
        nameRes = R.string.item_rear_seats_vehicle_module,
        imageRes = R.drawable.item_rear_seats_vehicle_module
    ),

    @RustObject
    ITEM_RED_BERRY(
        generationFunction = ::ItemRedBerry,
        nameRes = R.string.item_red_berry,
        imageRes = R.drawable.item_red_berry
    ),

    @RustObject
    ITEM_RED_BERRY_CLONE(
        generationFunction = ::ItemRedBerryClone,
        nameRes = R.string.item_red_berry_clone,
        imageRes = R.drawable.item_red_berry_clone
    ),

    @RustObject
    ITEM_RED_BERRY_SEED(
        generationFunction = ::ItemRedBerrySeed,
        nameRes = R.string.item_red_berry_seed,
        imageRes = R.drawable.item_red_berry_seed
    ),

    @RustObject
    ITEM_RED_BOOMER(
        generationFunction = ::ItemRedBoomer,
        nameRes = R.string.item_red_boomer,
        imageRes = R.drawable.item_red_boomer
    ),

    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ],
        outputs = [
            "passthrough"
        ]
    )
    @RustObject
    ITEM_RED_INDUSTRIAL_WALL_LIGHT(
        generationFunction = ::ItemRedIndustrialWallLight,
        nameRes = R.string.item_red_industrial_wall_light,
        imageRes = R.drawable.item_red_industrial_wall_light
    ),

    @RustObject
    ITEM_RED_KEYCARD(
        generationFunction = ::ItemRedKeycard,
        nameRes = R.string.item_red_keycard,
        imageRes = R.drawable.item_red_keycard
    ),

    @RustObject
    ITEM_RED_ROMAN_CANDLE(
        generationFunction = ::ItemRedRomanCandle,
        nameRes = R.string.item_red_roman_candle,
        imageRes = R.drawable.item_red_roman_candle
    ),

    @RustObject
    ITEM_RED_VOLCANO_FIREWORK(
        generationFunction = ::ItemRedVolcanoFirework,
        nameRes = R.string.item_red_volcano_firework,
        imageRes = R.drawable.item_red_volcano_firework
    ),

    @RustObject
    ITEM_REINDEER_ANTLERS(
        generationFunction = ::ItemReindeerAntlers,
        nameRes = R.string.item_reindeer_antlers,
        imageRes = R.drawable.item_reindeer_antlers
    ),

    @Researcheable
    @RustObject
    ITEM_REINFORCED_GLASS_WINDOW(
        generationFunction = ::ItemReinforcedGlassWindow,
        nameRes = R.string.item_reinforced_glass_window,
        imageRes = R.drawable.item_reinforced_glass_window
    ),

    @Researcheable
    @RustObject
    ITEM_REPAIR_BENCH(
        generationFunction = ::ItemRepairBench,
        nameRes = R.string.item_repair_bench,
        imageRes = R.drawable.item_repair_bench
    ),

    @RustObject
    ITEM_RESEARCH_PAPER(
        generationFunction = ::ItemResearchPaper,
        nameRes = R.string.item_research_paper,
        imageRes = R.drawable.item_research_paper
    ),

    @Researcheable
    @RustObject
    ITEM_RESEARCH_TABLE(
        generationFunction = ::ItemResearchTable,
        nameRes = R.string.item_research_table,
        imageRes = R.drawable.item_research_table
    ),

    @Researcheable
    @RustObject
    ITEM_REVOLVER(
        generationFunction = ::ItemRevolver,
        nameRes = R.string.item_revolver,
        imageRes = R.drawable.item_revolver
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ]
    )
    @RustObject
    ITEM_RF_BROADCASTER(
        generationFunction = ::ItemRfBroadcaster,
        nameRes = R.string.item_rf_broadcaster,
        imageRes = R.drawable.item_rf_broadcaster
    ),

    @Researcheable
    @RustObject
    ITEM_RF_PAGER(
        generationFunction = ::ItemRfPager,
        nameRes = R.string.item_rf_pager,
        imageRes = R.drawable.item_rf_pager
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ],
        outputs = [
            "power_out"
        ]
    )
    @RustObject
    ITEM_RF_RECEIVER(
        generationFunction = ::ItemRfReceiver,
        nameRes = R.string.item_rf_receiver,
        imageRes = R.drawable.item_rf_receiver
    ),

    @Researcheable
    @RustObject
    ITEM_RF_TRANSMITTER(
        generationFunction = ::ItemRfTransmitter,
        nameRes = R.string.item_rf_transmitter,
        imageRes = R.drawable.item_rf_transmitter
    ),

    @RustObject
    ITEM_RIFLE_BODY(
        generationFunction = ::ItemRifleBody,
        nameRes = R.string.item_rifle_body,
        imageRes = R.drawable.item_rifle_body
    ),

    @Researcheable
    @RustObject
    ITEM_RIOT_HELMET(
        generationFunction = ::ItemRiotHelmet,
        nameRes = R.string.item_riot_helmet,
        imageRes = R.drawable.item_riot_helmet
    ),

    @Researcheable
    @RustObject
    ITEM_ROADSIGN_GLOVES(
        generationFunction = ::ItemRoadsignGloves,
        nameRes = R.string.item_roadsign_gloves,
        imageRes = R.drawable.item_roadsign_gloves
    ),

    @Researcheable
    @RustObject
    ITEM_ROADSIGN_HORSE_ARMOR(
        generationFunction = ::ItemRoadsignHorseArmor,
        nameRes = R.string.item_roadsign_horse_armor,
        imageRes = R.drawable.item_roadsign_horse_armor
    ),

    @Researcheable
    @RustObject
    ITEM_ROAD_SIGNS(
        generationFunction = ::ItemRoadSigns,
        nameRes = R.string.item_road_signs,
        imageRes = R.drawable.item_road_signs
    ),

    @Researcheable
    @RustObject
    ITEM_ROAD_SIGN_JACKET(
        generationFunction = ::ItemRoadSignJacket,
        nameRes = R.string.item_road_sign_jacket,
        imageRes = R.drawable.item_road_sign_jacket
    ),

    @Researcheable
    @RustObject
    ITEM_ROAD_SIGN_KILT(
        generationFunction = ::ItemRoadSignKilt,
        nameRes = R.string.item_road_sign_kilt,
        imageRes = R.drawable.item_road_sign_kilt
    ),

    @Researcheable
    @RustObject
    ITEM_ROCK(
        generationFunction = ::ItemRock,
        nameRes = R.string.item_rock,
        imageRes = R.drawable.item_rock
    ),

    @Researcheable
    @RustObject
    ITEM_ROCKET(
        generationFunction = ::ItemRocket,
        nameRes = R.string.item_rocket,
        imageRes = R.drawable.item_rocket
    ),

    @Researcheable
    @RustObject
    ITEM_ROCKET_LAUNCHER(
        generationFunction = ::ItemRocketLauncher,
        nameRes = R.string.item_rocket_launcher,
        imageRes = R.drawable.item_rocket_launcher
    ),

    @RustObject
    ITEM_ROCKING_CHAIR(
        generationFunction = ::ItemRockingChair,
        nameRes = R.string.item_rocking_chair,
        imageRes = R.drawable.item_rocking_chair
    ),

    @Researcheable
    @ElectricalComponent(
        inputs = [
            "root_power_1",
            "root_power_2"
        ],
        outputs = [
            "combined_power_out"
        ]
    )
    @RustObject
    ITEM_ROOT_COMBINER(
        generationFunction = ::ItemRootCombiner,
        nameRes = R.string.item_root_combiner,
        imageRes = R.drawable.item_root_combiner
    ),

    @RustObject
    ITEM_ROPE(
        generationFunction = ::ItemRope,
        nameRes = R.string.item_rope,
        imageRes = R.drawable.item_rope
    ),

    @RustObject
    ITEM_ROTTEN_APPLE(
        generationFunction = ::ItemRottenApple,
        nameRes = R.string.item_rotten_apple,
        imageRes = R.drawable.item_rotten_apple
    ),

    @Researcheable
    @RustObject
    ITEM_RUG(
        generationFunction = ::ItemRug,
        nameRes = R.string.item_rug,
        imageRes = R.drawable.item_rug
    ),

    @Researcheable
    @RustObject
    ITEM_RUG_BEAR_SKIN(
        generationFunction = ::ItemRugBearSkin,
        nameRes = R.string.item_rug_bear_skin,
        imageRes = R.drawable.item_rug_bear_skin
    ),

    @RustObject
    ITEM_RUSTIGE_EGG_BLUE(
        generationFunction = ::ItemRustigeEggBlue,
        nameRes = R.string.item_rustige_egg_blue,
        imageRes = R.drawable.item_rustige_egg_blue
    ),

    @RustObject
    ITEM_RUSTIGE_EGG_GREEN(
        generationFunction = ::ItemRustigeEggGreen,
        nameRes = R.string.item_rustige_egg_green,
        imageRes = R.drawable.item_rustige_egg_green
    ),

    @RustObject
    ITEM_RUSTIGE_EGG_IVORY(
        generationFunction = ::ItemRustigeEggIvory,
        nameRes = R.string.item_rustige_egg_ivory,
        imageRes = R.drawable.item_rustige_egg_ivory
    ),

    @RustObject
    ITEM_RUSTIGE_EGG_PURPLE(
        generationFunction = ::ItemRustigeEggPurple,
        nameRes = R.string.item_rustige_egg_purple,
        imageRes = R.drawable.item_rustige_egg_purple
    ),

    @RustObject
    ITEM_RUSTIGE_EGG_RED(
        generationFunction = ::ItemRustigeEggRed,
        nameRes = R.string.item_rustige_egg_red,
        imageRes = R.drawable.item_rustige_egg_red
    ),

    @RustObject
    ITEM_RUSTIGE_EGG_WHITE(
        generationFunction = ::ItemRustigeEggWhite,
        nameRes = R.string.item_rustige_egg_white,
        imageRes = R.drawable.item_rustige_egg_white
    ),

    @Researcheable
    @RustObject
    ITEM_SADDLE_BAG(
        generationFunction = ::ItemSaddleBag,
        nameRes = R.string.item_saddle_bag,
        imageRes = R.drawable.item_saddle_bag
    ),

    @RustObject
    ITEM_SALMON(
        generationFunction = ::ItemSalmon,
        nameRes = R.string.item_salmon,
        imageRes = R.drawable.item_salmon
    ),

    @RustObject
    ITEM_SALT_WATER(
        generationFunction = ::ItemSaltWater,
        nameRes = R.string.item_salt_water,
        imageRes = R.drawable.item_salt_water
    ),

    @Researcheable
    @RustObject
    ITEM_SALVAGED_AXE(
        generationFunction = ::ItemSalvagedAxe,
        nameRes = R.string.item_salvaged_axe,
        imageRes = R.drawable.item_salvaged_axe
    ),

    @Researcheable
    @RustObject
    ITEM_SALVAGED_CLEAVER(
        generationFunction = ::ItemSalvagedCleaver,
        nameRes = R.string.item_salvaged_cleaver,
        imageRes = R.drawable.item_salvaged_cleaver
    ),

    @Researcheable
    @RustObject
    ITEM_SALVAGED_HAMMER(
        generationFunction = ::ItemSalvagedHammer,
        nameRes = R.string.item_salvaged_hammer,
        imageRes = R.drawable.item_salvaged_hammer
    ),

    @Researcheable
    @RustObject
    ITEM_SALVAGED_ICEPICK(
        generationFunction = ::ItemSalvagedIcepick,
        nameRes = R.string.item_salvaged_icepick,
        imageRes = R.drawable.item_salvaged_icepick
    ),

    @Researcheable
    @RustObject
    ITEM_SALVAGED_SHELVES(
        generationFunction = ::ItemSalvagedShelves,
        nameRes = R.string.item_salvaged_shelves,
        imageRes = R.drawable.item_salvaged_shelves
    ),

    @Researcheable
    @RustObject
    ITEM_SALVAGED_SWORD(
        generationFunction = ::ItemSalvagedSword,
        nameRes = R.string.item_salvaged_sword,
        imageRes = R.drawable.item_salvaged_sword
    ),

    @Researcheable
    @RustObject
    ITEM_SAM_AMMO(
        generationFunction = ::ItemSamAmmo,
        nameRes = R.string.item_sam_ammo,
        imageRes = R.drawable.item_sam_ammo
    ),

    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in",
            "invert_mode"
        ],
        outputs = [
            "passthrough",
            "has_target",
            "low_ammo",
            "no_ammo"
        ]
    )
    @RustObject
    ITEM_SAM_SITE(
        generationFunction = ::ItemSamSite,
        nameRes = R.string.item_sam_site,
        imageRes = R.drawable.item_sam_site
    ),

    @Researcheable
    @RustObject
    ITEM_SANDBAG_BARRICADE(
        generationFunction = ::ItemSandbagBarricade,
        nameRes = R.string.item_sandbag_barricade,
        imageRes = R.drawable.item_sandbag_barricade
    ),

    @RustObject
    ITEM_SANTA_BEARD(
        generationFunction = ::ItemSantaBeard,
        nameRes = R.string.item_santa_beard,
        imageRes = R.drawable.item_santa_beard
    ),

    @RustObject
    ITEM_SANTA_HAT(
        generationFunction = ::ItemSantaHat,
        nameRes = R.string.item_santa_hat,
        imageRes = R.drawable.item_santa_hat
    ),

    @RustObject
    ITEM_SARDINE(
        generationFunction = ::ItemSardine,
        nameRes = R.string.item_sardine,
        imageRes = R.drawable.item_sardine
    ),

    @Researcheable
    @RustObject
    ITEM_SATCHEL_CHARGE(
        generationFunction = ::ItemSatchelCharge,
        nameRes = R.string.item_satchel_charge,
        imageRes = R.drawable.item_satchel_charge
    ),

    @RustObject
    ITEM_SCARECROW(
        generationFunction = ::ItemScarecrow,
        nameRes = R.string.item_scarecrow,
        imageRes = R.drawable.item_scarecrow
    ),

    @RustObject
    ITEM_SCARECROW_SUIT(
        generationFunction = ::ItemScarecrowSuit,
        nameRes = R.string.item_scarecrow_suit,
        imageRes = R.drawable.item_scarecrow_suit
    ),

    @RustObject
    ITEM_SCARECROW_WRAP(
        generationFunction = ::ItemScarecrowWrap,
        nameRes = R.string.item_scarecrow_wrap,
        imageRes = R.drawable.item_scarecrow_wrap
    ),

    @RustObject
    ITEM_SCIENTIST_SUIT(
        generationFunction = ::ItemScientistSuit,
        nameRes = R.string.item_scientist_suit,
        imageRes = R.drawable.item_scientist_suit
    ),

    @RustObject
    ITEM_SCRAP(
        generationFunction = ::ItemScrap,
        nameRes = R.string.item_scrap,
        imageRes = R.drawable.item_scrap
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ],
        outputs = [
            "passthrough"
        ]
    )
    @RustObject
    ITEM_SEARCH_LIGHT(
        generationFunction = ::ItemSearchLight,
        nameRes = R.string.item_search_light,
        imageRes = R.drawable.item_search_light
    ),

    @Researcheable
    @RustObject
    ITEM_SECRETLAB_CHAIR(
        generationFunction = ::ItemSecretlabChair,
        nameRes = R.string.item_secretlab_chair,
        imageRes = R.drawable.item_secretlab_chair
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ],
        outputs = [
            "power_out"
        ]
    )
    @RustObject
    ITEM_SEISMIC_SENSOR(
        generationFunction = ::ItemSeismicSensor,
        nameRes = R.string.item_seismic_sensor,
        imageRes = R.drawable.item_seismic_sensor
    ),

    @RustObject
    ITEM_SEMI_AUTOMATIC_BODY(
        generationFunction = ::ItemSemiAutomaticBody,
        nameRes = R.string.item_semi_automatic_body,
        imageRes = R.drawable.item_semi_automatic_body
    ),

    @Researcheable
    @RustObject
    ITEM_SEMI_AUTOMATIC_PISTOL(
        generationFunction = ::ItemSemiAutomaticPistol,
        nameRes = R.string.item_semi_automatic_pistol,
        imageRes = R.drawable.item_semi_automatic_pistol
    ),

    @Researcheable
    @RustObject
    ITEM_SEMI_AUTOMATIC_RIFLE(
        generationFunction = ::ItemSemiAutomaticRifle,
        nameRes = R.string.item_semi_automatic_rifle,
        imageRes = R.drawable.item_semi_automatic_rifle
    ),

    @Researcheable
    @RustObject
    ITEM_SEWING_KIT(
        generationFunction = ::ItemSewingKit,
        nameRes = R.string.item_sewing_kit,
        imageRes = R.drawable.item_sewing_kit
    ),

    @RustObject
    ITEM_SHEET_METAL(
        generationFunction = ::ItemSheetMetal,
        nameRes = R.string.item_sheet_metal,
        imageRes = R.drawable.item_sheet_metal
    ),

    @Researcheable
    @DoorControllerAttachable
    @RustObject
    ITEM_SHEET_METAL_DOOR(
        generationFunction = ::ItemSheetMetalDoor,
        nameRes = R.string.item_sheet_metal_door,
        imageRes = R.drawable.item_sheet_metal_door
    ),

    @Researcheable
    @DoorControllerAttachable
    @RustObject
    ITEM_SHEET_METAL_DOUBLE_DOOR(
        generationFunction = ::ItemSheetMetalDoubleDoor,
        nameRes = R.string.item_sheet_metal_double_door,
        imageRes = R.drawable.item_sheet_metal_double_door
    ),

    @Researcheable
    @RustObject
    ITEM_SHIRT(
        generationFunction = ::ItemShirt,
        nameRes = R.string.item_shirt,
        imageRes = R.drawable.item_shirt
    ),

    @Researcheable
    @DoorControllerAttachable
    @RustObject
    ITEM_SHOP_FRONT(
        generationFunction = ::ItemShopFront,
        nameRes = R.string.item_shop_front,
        imageRes = R.drawable.item_shop_front
    ),

    @Researcheable
    @RustObject
    ITEM_SHORTS(
        generationFunction = ::ItemShorts,
        nameRes = R.string.item_shorts,
        imageRes = R.drawable.item_shorts
    ),

    @RustObject
    ITEM_SHORT_ICE_WALL(
        generationFunction = ::ItemShortIceWall,
        nameRes = R.string.item_short_ice_wall,
        imageRes = R.drawable.item_short_ice_wall
    ),

    @Researcheable
    @RustObject
    ITEM_SHOTGUN_TRAP(
        generationFunction = ::ItemShotgunTrap,
        nameRes = R.string.item_shotgun_trap,
        imageRes = R.drawable.item_shotgun_trap
    ),

    @RustObject
    ITEM_SHOVEL(
        generationFunction = ::ItemShovel,
        nameRes = R.string.item_shovel,
        imageRes = R.drawable.item_shovel
    ),

    @Researcheable
    @RustObject
    ITEM_SHOVEL_BASS(
        generationFunction = ::ItemShovelBass,
        nameRes = R.string.item_shovel_bass,
        imageRes = R.drawable.item_shovel_bass
    ),

    @RustObject
    ITEM_SICKLE(
        generationFunction = ::ItemSickle,
        nameRes = R.string.item_sickle,
        imageRes = R.drawable.item_sickle
    ),

    @Researcheable
    @RustObject
    ITEM_SILENCER(
        generationFunction = ::ItemSilencer,
        nameRes = R.string.item_silencer,
        imageRes = R.drawable.item_silencer
    ),

    @RustObject
    ITEM_SILVER_EGG(
        generationFunction = ::ItemSilverEgg,
        nameRes = R.string.item_silver_egg,
        imageRes = R.drawable.item_silver_egg
    ),

    @Researcheable
    @RustObject
    ITEM_SIMPLE_HANDMADE_SIGHT(
        generationFunction = ::ItemSimpleHandmadeSight,
        nameRes = R.string.item_simple_handmade_sight,
        imageRes = R.drawable.item_simple_handmade_sight
    ),

    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ],
        outputs = [
            "passthrough"
        ]
    )
    @RustObject
    ITEM_SIMPLE_LIGHT(
        generationFunction = ::ItemSimpleLight,
        nameRes = R.string.item_simple_light,
        imageRes = R.drawable.item_simple_light
    ),

    @RustObject
    ITEM_SINGLE_HORSE_SADDLE(
        generationFunction = ::ItemSingleHorseSaddle,
        nameRes = R.string.item_single_horse_saddle,
        imageRes = R.drawable.item_single_horse_saddle
    ),

    @RustObject
    ITEM_SINGLE_SIGN_POST(
        generationFunction = ::ItemSingleSignPost,
        nameRes = R.string.item_single_sign_post,
        imageRes = R.drawable.item_single_sign_post
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ],
        outputs = [
            "passthrough"
        ]
    )
    @RustObject
    ITEM_SIREN_LIGHT(
        generationFunction = ::ItemSirenLight,
        nameRes = R.string.item_siren_light,
        imageRes = R.drawable.item_siren_light
    ),

    @RustObject
    ITEM_SKINNING_KNIFE(
        generationFunction = ::ItemSkinningKnife,
        nameRes = R.string.item_skinning_knife,
        imageRes = R.drawable.item_skinning_knife
    ),

    @Researcheable
    @RustObject
    ITEM_SKS(
        generationFunction = ::ItemSks,
        nameRes = R.string.item_sks,
        imageRes = R.drawable.item_sks
    ),

    @RustObject
    ITEM_SKULL_DOOR_KNOCKER(
        generationFunction = ::ItemSkullDoorKnocker,
        nameRes = R.string.item_skull_door_knocker,
        imageRes = R.drawable.item_skull_door_knocker
    ),

    @RustObject
    ITEM_SKULL_FIRE_PIT(
        generationFunction = ::ItemSkullFirePit,
        nameRes = R.string.item_skull_fire_pit,
        imageRes = R.drawable.item_skull_fire_pit
    ),

    @RustObject
    ITEM_SKULL_SPIKES(
        generationFunction = ::ItemSkullSpikes,
        nameRes = R.string.item_skull_spikes,
        imageRes = R.drawable.item_skull_spikes
    ),

    @RustObject
    ITEM_SKULL_TROPHY(
        generationFunction = ::ItemSkullTrophy,
        nameRes = R.string.item_skull_trophy,
        imageRes = R.drawable.item_skull_trophy
    ),

    @RustObject
    ITEM_SKY_LANTERN(
        generationFunction = ::ItemSkyLantern,
        nameRes = R.string.item_sky_lantern,
        imageRes = R.drawable.item_sky_lantern
    ),

    @RustObject
    ITEM_SLED(
        generationFunction = ::ItemSled,
        nameRes = R.string.item_sled,
        imageRes = R.drawable.item_sled
    ),

    @Researcheable
    @RustObject
    ITEM_SLEEPING_BAG(
        generationFunction = ::ItemSleepingBag,
        nameRes = R.string.item_sleeping_bag,
        imageRes = R.drawable.item_sleeping_bag
    ),

    @Researcheable
    @RustObject
    ITEM_SMALL_BACKPACK(
        generationFunction = ::ItemSmallBackpack,
        nameRes = R.string.item_small_backpack,
        imageRes = R.drawable.item_small_backpack
    ),

    @RustObject
    ITEM_SMALL_CANDLE_SET(
        generationFunction = ::ItemSmallCandleSet,
        nameRes = R.string.item_small_candle_set,
        imageRes = R.drawable.item_small_candle_set
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "force_start",
            "force_stop"
        ],
        outputs = [
            "power_out"
        ]
    )
    @RustObject
    ITEM_SMALL_GENERATOR(
        generationFunction = ::ItemSmallGenerator,
        nameRes = R.string.item_small_generator,
        imageRes = R.drawable.item_small_generator
    ),

    @RustObject
    ITEM_SMALL_HUNTING_TROPHY(
        generationFunction = ::ItemSmallHuntingTrophy,
        nameRes = R.string.item_small_hunting_trophy,
        imageRes = R.drawable.item_small_hunting_trophy
    ),

    @RustObject
    ITEM_SMALL_LOOT_BAG(
        generationFunction = ::ItemSmallLootBag,
        nameRes = R.string.item_small_loot_bag,
        imageRes = R.drawable.item_small_loot_bag
    ),

    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ],
        outputs = [
            "passthrough"
        ]
    )
    @RustObject
    ITEM_SMALL_NEON_SIGN(
        generationFunction = ::ItemSmallNeonSign,
        nameRes = R.string.item_small_neon_sign,
        imageRes = R.drawable.item_small_neon_sign
    ),

    @Researcheable
    @StorageAdaptorAttachable(slotAmount = 1)
    @RustObject
    ITEM_SMALL_OIL_REFINERY(
        generationFunction = ::ItemSmallOilRefinery,
        nameRes = R.string.item_small_oil_refinery,
        imageRes = R.drawable.item_small_oil_refinery
    ),

    @Researcheable
    @RustObject
    ITEM_SMALL_PLANTER_BOX(
        generationFunction = ::ItemSmallPlanterBox,
        nameRes = R.string.item_small_planter_box,
        imageRes = R.drawable.item_small_planter_box
    ),

    @RustObject
    ITEM_SMALL_PRESENT(
        generationFunction = ::ItemSmallPresent,
        nameRes = R.string.item_small_present,
        imageRes = R.drawable.item_small_present
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ],
        outputs = [
            "power_output"
        ]
    )
    @RustObject
    ITEM_SMALL_RECHARGEABLE_BATTERY(
        generationFunction = ::ItemSmallRechargeableBattery,
        nameRes = R.string.item_small_rechargeable_battery,
        imageRes = R.drawable.item_small_rechargeable_battery
    ),

    @RustObject
    ITEM_SHARK(
        generationFunction = ::ItemShark,
        nameRes = R.string.item_small_shark,
        imageRes = R.drawable.item_small_shark
    ),

    @Researcheable
    @RustObject
    ITEM_SMALL_STASH(
        generationFunction = ::ItemSmallStash,
        nameRes = R.string.item_small_stash,
        imageRes = R.drawable.item_small_stash
    ),

    @RustObject
    ITEM_SMALL_STOCKING(
        generationFunction = ::ItemSmallStocking,
        nameRes = R.string.item_small_stocking,
        imageRes = R.drawable.item_small_stocking
    ),

    @RustObject
    ITEM_SMALL_TROUT(
        generationFunction = ::ItemSmallTrout,
        nameRes = R.string.item_small_trout,
        imageRes = R.drawable.item_small_trout
    ),

    @RustObject
    ITEM_SMALL_WATER_BOTTLE(
        generationFunction = ::ItemSmallWaterBottle,
        nameRes = R.string.item_small_water_bottle,
        imageRes = R.drawable.item_small_water_bottle
    ),

    @Researcheable
    @Deployable
    @WaterComponent(
        inputs = [
            "water_in"
        ],
        outputs = [
            "water_out"
        ]
    )
    @RustObject
    ITEM_SMALL_WATER_CATCHER(
        generationFunction = ::ItemSmallWaterCatcher,
        nameRes = R.string.item_small_water_catcher,
        imageRes = R.drawable.item_small_water_catcher
    ),

    @Researcheable
    @RustObject
    ITEM_SMALL_WOODEN_SIGN(
        generationFunction = ::ItemSmallWoodenSign,
        nameRes = R.string.item_small_wooden_sign,
        imageRes = R.drawable.item_small_wooden_sign
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ],
        outputs = [
            "power_out"
        ]
    )
    @RustObject
    ITEM_SMART_ALARM(
        generationFunction = ::ItemSmartAlarm,
        nameRes = R.string.item_smart_alarm,
        imageRes = R.drawable.item_smart_alarm
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in",
            "switch_on",
            "switch_off"
        ],
        outputs = [
            "power_out"
        ]
    )
    @RustObject
    ITEM_SMART_SWITCH(
        generationFunction = ::ItemSmartSwitch,
        nameRes = R.string.item_smart_switch,
        imageRes = R.drawable.item_smart_switch
    ),

    @RustObject
    ITEM_SMG_BODY(
        generationFunction = ::ItemSmgBody,
        nameRes = R.string.item_smg_body,
        imageRes = R.drawable.item_smg_body
    ),

    @Researcheable
    @RustObject
    ITEM_SMOKE_GRENADE(
        generationFunction = ::ItemSmokeGrenade,
        nameRes = R.string.item_smoke_grenade,
        imageRes = R.drawable.item_smoke_grenade
    ),

    @RustObject
    ITEM_SMOKE_ROCKET_WIP(
        generationFunction = ::ItemSmokeRocketWip,
        nameRes = R.string.item_smoke_rocket_wip,
        imageRes = R.drawable.item_smoke_rocket_wip
    ),

    @Researcheable
    @RustObject
    ITEM_SNAP_TRAP(
        generationFunction = ::ItemSnapTrap,
        nameRes = R.string.item_snap_trap,
        imageRes = R.drawable.item_snap_trap
    ),

    @RustObject
    ITEM_SNOWBALL(
        generationFunction = ::ItemSnowball,
        nameRes = R.string.item_snowball,
        imageRes = R.drawable.item_snowball
    ),

    @RustObject
    ITEM_SNOWBALL_GUN(
        generationFunction = ::ItemSnowballGun,
        nameRes = R.string.item_snowball_gun,
        imageRes = R.drawable.item_snowball_gun
    ),

    @RustObject
    ITEM_SNOWMAN(
        generationFunction = ::ItemSnowman,
        nameRes = R.string.item_snowman,
        imageRes = R.drawable.item_snowman
    ),

    @RustObject
    ITEM_SNOWMAN_HELMET(
        generationFunction = ::ItemSnowmanHelmet,
        nameRes = R.string.item_snowman_helmet,
        imageRes = R.drawable.item_snowman_helmet
    ),

    @Researcheable
    @RustObject
    ITEM_SNOW_JACKET(
        generationFunction = ::ItemSnowJacket,
        nameRes = R.string.item_snow_jacket,
        imageRes = R.drawable.item_snow_jacket
    ),

    @Deployable
    @ElectricalComponent(
        inputs = [
            "toggle",
            "turn_on",
            "turn_off"
        ]
    )
    @RustObject
    ITEM_SNOW_MACHINE(
        generationFunction = ::ItemSnowMachine,
        nameRes = R.string.item_snow_machine,
        imageRes = R.drawable.item_snow_machine
    ),

    @RustObject
    ITEM_SOFA(
        generationFunction = ::ItemSofa,
        nameRes = R.string.item_sofa,
        imageRes = R.drawable.item_sofa
    ),

    @RustObject
    ITEM_SOFA_PATTERN(
        generationFunction = ::ItemSofaPattern,
        nameRes = R.string.item_sofa_pattern,
        imageRes = R.drawable.item_sofa_pattern
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_audio_in"
        ],
        outputs = [
            "audio_passthrough"
        ]
    )
    @RustObject
    ITEM_SOUND_LIGHT(
        generationFunction = ::ItemSoundLight,
        nameRes = R.string.item_sound_light,
        imageRes = R.drawable.item_sound_light
    ),

    @Researcheable
    @RustObject
    ITEM_SOUSAPHONE(
        generationFunction = ::ItemSousaphone,
        nameRes = R.string.item_sousaphone,
        imageRes = R.drawable.item_sousaphone
    ),

    @RustObject
    ITEM_SPAS_12_SHOTGUN(
        generationFunction = ::ItemSpas12Shotgun,
        nameRes = R.string.item_spas_12_shotgun,
        imageRes = R.drawable.item_spas_12_shotgun
    ),

    @Researcheable
    @RustObject
    ITEM_SPEARGUN(
        generationFunction = ::ItemSpeargun,
        nameRes = R.string.item_speargun,
        imageRes = R.drawable.item_speargun
    ),

    @Researcheable
    @RustObject
    ITEM_SPEARGUN_SPEAR(
        generationFunction = ::ItemSpeargunSpear,
        nameRes = R.string.item_speargun_spear,
        imageRes = R.drawable.item_speargun_spear
    ),

    @RustObject
    ITEM_SPIDER_WEBS(
        generationFunction = ::ItemSpiderWebs,
        nameRes = R.string.item_spider_webs,
        imageRes = R.drawable.item_spider_webs
    ),

    @Researcheable
    @RustObject
    ITEM_SPINNING_WHEEL(
        generationFunction = ::ItemSpinningWheel,
        nameRes = R.string.item_spinning_wheel,
        imageRes = R.drawable.item_spinning_wheel
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ],
        outputs = [
            "power_out_1",
            "power_out_2",
            "power_out_3"
        ]
    )
    @RustObject
    ITEM_SPLITTER(
        generationFunction = ::ItemSplitter,
        nameRes = R.string.item_splitter,
        imageRes = R.drawable.item_splitter
    ),

    @RustObject
    ITEM_SPOILED_CHICKEN(
        generationFunction = ::ItemSpoiledChicken,
        nameRes = R.string.item_spoiled_chicken,
        imageRes = R.drawable.item_spoiled_chicken
    ),

    @RustObject
    ITEM_SPOILED_HUMAN_MEAT(
        generationFunction = ::ItemSpoiledHumanMeat,
        nameRes = R.string.item_spoiled_human_meat,
        imageRes = R.drawable.item_spoiled_human_meat
    ),

    @RustObject
    ITEM_SPOILED_WOLF_MEAT(
        generationFunction = ::ItemSpoiledWolfMeat,
        nameRes = R.string.item_spoiled_wolf_meat,
        imageRes = R.drawable.item_spoiled_wolf_meat
    ),

    @Deployable
    @ElectricalComponent(
        inputs = [
            "turn_on",
            "turn_off"
        ]
    )
    @RustObject
    ITEM_SPOOKY_SPEAKER(
        generationFunction = ::ItemSpookySpeaker,
        nameRes = R.string.item_spooky_speaker,
        imageRes = R.drawable.item_spooky_speaker
    ),

    @Researcheable
    @RustObject
    ITEM_SPRAY_CAN(
        generationFunction = ::ItemSprayCan,
        nameRes = R.string.item_spray_can,
        imageRes = R.drawable.item_spray_can
    ),

    @Researcheable
    @Deployable
    @WaterComponent(
        inputs = [
            "water_in"
        ],
        outputs = [
            "passthrough"
        ]
    )
    @RustObject
    ITEM_SPRINKLER(
        generationFunction = ::ItemSprinkler,
        nameRes = R.string.item_sprinkler,
        imageRes = R.drawable.item_sprinkler
    ),

    @RustObject
    ITEM_STAR_TREE_TOPPER(
        generationFunction = ::ItemStarTreeTopper,
        nameRes = R.string.item_star_tree_topper,
        imageRes = R.drawable.item_star_tree_topper
    ),

    @RustObject
    ITEM_STICKS(
        generationFunction = ::ItemSticks,
        nameRes = R.string.item_sticks,
        imageRes = R.drawable.item_sticks
    ),

    @RustObject
    ITEM_STONES(
        generationFunction = ::ItemStones,
        nameRes = R.string.item_stones,
        imageRes = R.drawable.item_stones
    ),

    @Researcheable
    @RustObject
    ITEM_STONE_BARRICADE(
        generationFunction = ::ItemStoneBarricade,
        nameRes = R.string.item_stone_barricade,
        imageRes = R.drawable.item_stone_barricade
    ),

    @Researcheable
    @RustObject
    ITEM_STONE_FIREPLACE(
        generationFunction = ::ItemStoneFireplace,
        nameRes = R.string.item_stone_fireplace,
        imageRes = R.drawable.item_stone_fireplace
    ),

    @Researcheable
    @RustObject
    ITEM_STONE_HATCHET(
        generationFunction = ::ItemStoneHatchet,
        nameRes = R.string.item_stone_hatchet,
        imageRes = R.drawable.item_stone_hatchet
    ),

    @Researcheable
    @RustObject
    ITEM_STONE_PICKAXE(
        generationFunction = ::ItemStonePickaxe,
        nameRes = R.string.item_stone_pickaxe,
        imageRes = R.drawable.item_stone_pickaxe
    ),

    @Researcheable
    @RustObject
    ITEM_STONE_SPEAR(
        generationFunction = ::ItemStoneSpear,
        nameRes = R.string.item_stone_spear,
        imageRes = R.drawable.item_stone_spear
    ),

    @Researcheable
    @Deployable
    @IndustrialComponent(
        inputs = [
            "industrial_in"
        ],
        outputs = [
            "industrial_out"
        ]
    )
    @RustObject
    ITEM_STORAGE_ADAPTOR(
        generationFunction = ::ItemStorageAdaptor,
        nameRes = R.string.item_storage_adaptor,
        imageRes = R.drawable.item_storage_adaptor
    ),

    @StorageAdaptorAttachable(slotAmount = 4)
    @StorageMonitorAttachable
    @RustObject
    ITEM_STORAGE_BARREL_HORIZONTAL(
        generationFunction = ::ItemStorageBarrelHorizontal,
        nameRes = R.string.item_storage_barrel_horizontal,
        imageRes = R.drawable.item_storage_barrel_horizontal
    ),

    @StorageAdaptorAttachable(slotAmount = 4)
    @StorageMonitorAttachable
    @RustObject
    ITEM_STORAGE_BARREL_VERTICAL(
        generationFunction = ::ItemStorageBarrelVertical,
        nameRes = R.string.item_storage_barrel_vertical,
        imageRes = R.drawable.item_storage_barrel_vertical
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ],
        outputs = [
            "power_out"
        ]
    )
    @RustObject
    ITEM_STORAGE_MONITOR(
        generationFunction = ::ItemStorageMonitor,
        nameRes = R.string.item_storage_monitor,
        imageRes = R.drawable.item_storage_monitor
    ),

    @Researcheable
    @RustObject
    ITEM_STORAGE_VEHICLE_MODULE(
        generationFunction = ::ItemStorageVehicleModule,
        nameRes = R.string.item_storage_vehicle_module,
        imageRes = R.drawable.item_storage_vehicle_module
    ),

    @Researcheable
    @RustObject
    ITEM_STRENGTHENED_GLASS_WINDOW(
        generationFunction = ::ItemStrengthenedGlassWindow,
        nameRes = R.string.item_strengthened_glass_window,
        imageRes = R.drawable.item_strengthened_glass_window
    ),

    @RustObject
    ITEM_STROBE_LIGHT(
        generationFunction = ::ItemStrobeLight,
        nameRes = R.string.item_strobe_light,
        imageRes = R.drawable.item_strobe_light
    ),

    @RustObject
    ITEM_SULFUR(
        generationFunction = ::ItemSulfur,
        nameRes = R.string.item_sulfur,
        imageRes = R.drawable.item_sulfur
    ),

    @RustObject
    ITEM_SULFUR_ORE(
        generationFunction = ::ItemSulfurOre,
        nameRes = R.string.item_sulfur_ore,
        imageRes = R.drawable.item_sulfur_ore
    ),

    @Researcheable
    @RustObject
    ITEM_SUNGLASSES(
        generationFunction = ::ItemSunglasses,
        nameRes = R.string.item_sunglasses,
        imageRes = R.drawable.item_sunglasses
    ),

    @RustObject
    ITEM_SUPER_SERUM(
        generationFunction = ::ItemSuperSerum,
        nameRes = R.string.item_super_serum,
        imageRes = R.drawable.item_super_serum
    ),

    @RustObject
    ITEM_SUPER_STOCKING(
        generationFunction = ::ItemSuperStocking,
        nameRes = R.string.item_super_stocking,
        imageRes = R.drawable.item_super_stocking
    ),

    @RustObject
    ITEM_SUPPLY_SIGNAL(
        generationFunction = ::ItemSupplySignal,
        nameRes = R.string.item_supply_signal,
        imageRes = R.drawable.item_supply_signal
    ),

    @RustObject
    ITEM_SURGEON_SCRUBS(
        generationFunction = ::ItemSurgeonScrubs,
        nameRes = R.string.item_surgeon_scrubs,
        imageRes = R.drawable.item_surgeon_scrubs
    ),

    @Researcheable
    @RustObject
    ITEM_SURVEY_CHARGE(
        generationFunction = ::ItemSurveyCharge,
        nameRes = R.string.item_survey_charge,
        imageRes = R.drawable.item_survey_charge
    ),

    @Researcheable
    @RustObject
    ITEM_SURVIVAL_FISH_TRAP(
        generationFunction = ::ItemSurvivalFishTrap,
        nameRes = R.string.item_survival_fish_trap,
        imageRes = R.drawable.item_survival_fish_trap
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in",
            "switch_on",
            "switch_off"
        ],
        outputs = [
            "power_out"
        ]
    )
    @RustObject
    ITEM_SWITCH(
        generationFunction = ::ItemSwitch,
        nameRes = R.string.item_switch,
        imageRes = R.drawable.item_switch
    ),

    @Researcheable
    @RustObject
    ITEM_TABLE(
        generationFunction = ::ItemTable,
        nameRes = R.string.item_table,
        imageRes = R.drawable.item_table
    ),

    @RustObject
    ITEM_TACTICAL_GLOVES(
        generationFunction = ::ItemTacticalGloves,
        nameRes = R.string.item_tactical_gloves,
        imageRes = R.drawable.item_tactical_gloves
    ),

    @RustObject
    ITEM_TALL_PICTURE_FRAME(
        generationFunction = ::ItemTallPictureFrame,
        nameRes = R.string.item_tall_picture_frame,
        imageRes = R.drawable.item_tall_picture_frame
    ),

    @RustObject
    ITEM_TALL_WEAPON_RACK(
        generationFunction = ::ItemTallWeaponRack,
        nameRes = R.string.item_tall_weapon_rack,
        imageRes = R.drawable.item_tall_weapon_rack
    ),

    @Researcheable
    @RustObject
    ITEM_TANK_TOP(
        generationFunction = ::ItemTankTop,
        nameRes = R.string.item_tank_top,
        imageRes = R.drawable.item_tank_top
    ),

    @RustObject
    ITEM_TARGETING_COMPUTER(
        generationFunction = ::ItemTargetingComputer,
        nameRes = R.string.item_targeting_computer,
        imageRes = R.drawable.item_targeting_computer
    ),

    @RustObject
    ITEM_TARP(
        generationFunction = ::ItemTarp,
        nameRes = R.string.item_tarp,
        imageRes = R.drawable.item_tarp
    ),

    @Researcheable
    @RustObject
    ITEM_TAXI_VEHICLE_MODULE(
        generationFunction = ::ItemTaxiVehicleModule,
        nameRes = R.string.item_taxi_vehicle_module,
        imageRes = R.drawable.item_taxi_vehicle_module
    ),

    @RustObject
    ITEM_TECH_TRASH(
        generationFunction = ::ItemTechTrash,
        nameRes = R.string.item_tech_trash,
        imageRes = R.drawable.item_tech_trash
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ],
        outputs = [
            "call_passthrough"
        ]
    )
    @RustObject
    ITEM_TELEPHONE(
        generationFunction = ::ItemTelephone,
        nameRes = R.string.item_telephone,
        imageRes = R.drawable.item_telephone
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ]
    )
    @RustObject
    ITEM_TESLA_COIL(
        generationFunction = ::ItemTeslaCoil,
        nameRes = R.string.item_tesla_coil,
        imageRes = R.drawable.item_tesla_coil
    ),

    @Deployable
    @ElectricalComponent(
        inputs = [],
        outputs = [
            "power_output_1",
            "power_output_2",
            "power_output_3"
        ]
    )
    @RustObject
    ITEM_TEST_GENERATOR(
        generationFunction = ::ItemTestGenerator,
        nameRes = R.string.item_test_generator,
        imageRes = R.drawable.item_test_generator
    ),

    @Researcheable
    @RustObject
    ITEM_THOMPSON(
        generationFunction = ::ItemThompson,
        nameRes = R.string.item_thompson,
        imageRes = R.drawable.item_thompson
    ),

    @RustObject
    ITEM_TIGER_MASK(
        generationFunction = ::ItemTigerMask,
        nameRes = R.string.item_tiger_mask,
        imageRes = R.drawable.item_tiger_mask
    ),

    @Researcheable
    @RustObject
    ITEM_TIMED_EXPLOSIVE_CHARGE(
        generationFunction = ::ItemTimedExplosiveCharge,
        nameRes = R.string.item_timed_explosive_charge,
        imageRes = R.drawable.item_timed_explosive_charge
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in",
            "toggle_on"
        ],
        outputs = [
            "power_out"
        ]
    )
    @RustObject
    ITEM_TIMER(
        generationFunction = ::ItemTimer,
        nameRes = R.string.item_timer,
        imageRes = R.drawable.item_timer
    ),

    @Researcheable
    @RustObject
    ITEM_TIN_CAN_ALARM(
        generationFunction = ::ItemTinCanAlarm,
        nameRes = R.string.item_tin_can_alarm,
        imageRes = R.drawable.item_tin_can_alarm
    ),

    @Researcheable
    @Deployable
    @StorageAdaptorAttachable(slotAmount = 2)
    @StorageMonitorAttachable
    @RustObject
    ITEM_TOOL_CUPBOARD(
        generationFunction = ::ItemToolCupboard,
        nameRes = R.string.item_tool_cupboard,
        imageRes = R.drawable.item_tool_cupboard
    ),

    @Researcheable
    @RustObject
    ITEM_TORCH(
        generationFunction = ::ItemTorch,
        nameRes = R.string.item_torch,
        imageRes = R.drawable.item_torch
    ),

    @RustObject
    ITEM_TORCH_HOLDER(
        generationFunction = ::ItemTorchHolder,
        nameRes = R.string.item_torch_holder,
        imageRes = R.drawable.item_torch_holder
    ),

    @Researcheable
    @RustObject
    ITEM_TORPEDO(
        generationFunction = ::ItemTorpedo,
        nameRes = R.string.item_torpedo,
        imageRes = R.drawable.item_torpedo
    ),

    @RustObject
    ITEM_TREE_LIGHTS(
        generationFunction = ::ItemTreeLights,
        nameRes = R.string.item_tree_lights,
        imageRes = R.drawable.item_tree_lights
    ),

    @Researcheable
    @DoorControllerAttachable
    @RustObject
    ITEM_TRIANGLE_LADDER_HATCH(
        generationFunction = ::ItemTriangleLadderHatch,
        nameRes = R.string.item_triangle_ladder_hatch,
        imageRes = R.drawable.item_triangle_ladder_hatch
    ),

    @RustObject
    ITEM_TUNA_CAN_LAMP(
        generationFunction = ::ItemTunaCanLamp,
        nameRes = R.string.item_tuna_can_lamp,
        imageRes = R.drawable.item_tuna_can_lamp
    ),

    @RustObject
    ITEM_TWITCH_RIVALS_TROPHY(
        generationFunction = ::ItemTwitchRivalsTrophy,
        nameRes = R.string.item_twitch_rivals_trophy,
        imageRes = R.drawable.item_twitch_rivals_trophy
    ),

    @RustObject
    ITEM_TWITCH_RIVALS_TROPHY_2023(
        generationFunction = ::ItemTwitchRivalsTrophy2023,
        nameRes = R.string.item_twitch_rivals_trophy_2023,
        imageRes = R.drawable.item_twitch_rivals_trophy_2023
    ),

    @RustObject
    ITEM_TWO_SIDED_HANGING_SIGN(
        generationFunction = ::ItemTwoSidedHangingSign,
        nameRes = R.string.item_two_sided_hanging_sign,
        imageRes = R.drawable.item_two_sided_hanging_sign
    ),

    @RustObject
    ITEM_TWO_SIDED_ORNATE_HANGING_SIGN(
        generationFunction = ::ItemTwoSidedOrnateHangingSign,
        nameRes = R.string.item_two_sided_ornate_hanging_sign,
        imageRes = R.drawable.item_two_sided_ornate_hanging_sign
    ),

    @RustObject
    ITEM_TWO_SIDED_TOWN_SIGN_POST(
        generationFunction = ::ItemTwoSidedTownSignPost,
        nameRes = R.string.item_two_sided_town_sign_post,
        imageRes = R.drawable.item_two_sided_town_sign_post
    ),

    @Researcheable
    @RustObject
    ITEM_T_SHIRT(
        generationFunction = ::ItemTShirt,
        nameRes = R.string.item_t_shirt,
        imageRes = R.drawable.item_t_shirt
    ),

    @RustObject
    ITEM_VAMPIRE_STAKE(
        generationFunction = ::ItemVampireStake,
        nameRes = R.string.item_vampire_stake,
        imageRes = R.drawable.item_vampire_stake
    ),

    @Researcheable
    @StorageAdaptorAttachable(slotAmount = 1)
    @StorageMonitorAttachable
    @RustObject
    ITEM_VENDING_MACHINE(
        generationFunction = ::ItemVendingMachine,
        nameRes = R.string.item_vending_machine,
        imageRes = R.drawable.item_vending_machine
    ),

    @RustObject
    ITEM_VIOLET_BOOMER(
        generationFunction = ::ItemVioletBoomer,
        nameRes = R.string.item_violet_boomer,
        imageRes = R.drawable.item_violet_boomer
    ),

    @RustObject
    ITEM_VIOLET_ROMAN_CANDLE(
        generationFunction = ::ItemVioletRomanCandle,
        nameRes = R.string.item_violet_roman_candle,
        imageRes = R.drawable.item_violet_roman_candle
    ),

    @RustObject
    ITEM_VIOLET_VOLCANO_FIREWORK(
        generationFunction = ::ItemVioletVolcanoFirework,
        nameRes = R.string.item_violet_volcano_firework,
        imageRes = R.drawable.item_violet_volcano_firework
    ),

    @RustObject
    ITEM_VODKA_BOTTLE(
        generationFunction = ::ItemVodkaBottle,
        nameRes = R.string.item_vodka_bottle,
        imageRes = R.drawable.item_vodka_bottle
    ),

    @Researcheable
    @RustObject
    ITEM_WALLPAPER(
        generationFunction = ::ItemWallpaper,
        nameRes = R.string.item_wallpaper,
        imageRes = R.drawable.item_wallpaper
    ),

    @RustObject
    ITEM_WANTED_POSTER(
        generationFunction = ::ItemWantedPoster,
        nameRes = R.string.item_wanted_poster,
        imageRes = R.drawable.item_wanted_poster
    ),

    @Researcheable
    @RustObject
    ITEM_WATCH_TOWER(
        generationFunction = ::ItemWatchTower,
        nameRes = R.string.item_watch_tower,
        imageRes = R.drawable.item_watch_tower
    ),

    @RustObject
    ITEM_WATER(
        generationFunction = ::ItemWater,
        nameRes = R.string.item_water,
        imageRes = R.drawable.item_water
    ),

    @Researcheable
    @RustObject
    ITEM_WATERPIPE_SHOTGUN(
        generationFunction = ::ItemWaterpipeShotgun,
        nameRes = R.string.item_waterpipe_shotgun,
        imageRes = R.drawable.item_waterpipe_shotgun
    ),

    @RustObject
    ITEM_WATERWELL_NPC_JUMPSUIT(
        generationFunction = ::ItemWaterwellNpcJumpsuit,
        nameRes = R.string.item_waterwell_npc_jumpsuit,
        imageRes = R.drawable.item_waterwell_npc_jumpsuit
    ),

    @Researcheable
    @Deployable
    @WaterComponent(
        inputs = [
            "water_in"
        ],
        outputs = [
            "water_out"
        ]
    )
    @RustObject
    ITEM_WATER_BARREL(
        generationFunction = ::ItemWaterBarrel,
        nameRes = R.string.item_water_barrel,
        imageRes = R.drawable.item_water_barrel
    ),

    @Researcheable
    @RustObject
    ITEM_WATER_BUCKET(
        generationFunction = ::ItemWaterBucket,
        nameRes = R.string.item_water_bucket,
        imageRes = R.drawable.item_water_bucket
    ),

    @Researcheable
    @RustObject
    ITEM_WATER_GUN(
        generationFunction = ::ItemWaterGun,
        nameRes = R.string.item_water_gun,
        imageRes = R.drawable.item_water_gun
    ),

    @RustObject
    ITEM_WATER_JUG(
        generationFunction = ::ItemWaterJug,
        nameRes = R.string.item_water_jug,
        imageRes = R.drawable.item_water_jug
    ),

    @Researcheable
    @RustObject
    ITEM_WATER_PISTOL(
        generationFunction = ::ItemWaterPistol,
        nameRes = R.string.item_water_pistol,
        imageRes = R.drawable.item_water_pistol
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_in"
        ]
    )
    @WaterComponent(
        inputs = [],
        outputs = [
            "water_output"
        ]
    )
    @RustObject
    ITEM_WATER_PUMP(
        generationFunction = ::ItemWaterPump,
        nameRes = R.string.item_water_pump,
        imageRes = R.drawable.item_water_pump
    ),

    @Researcheable
    @RustObject
    ITEM_WATER_PURIFIER(
        generationFunction = ::ItemWaterPurifier,
        nameRes = R.string.item_water_purifier,
        imageRes = R.drawable.item_water_purifier
    ),

    @Researcheable
    @RustObject
    ITEM_WEAPON_FLASHLIGHT(
        generationFunction = ::ItemWeaponFlashlight,
        nameRes = R.string.item_weapon_flashlight,
        imageRes = R.drawable.item_weapon_flashlight
    ),

    @Researcheable
    @RustObject
    ITEM_WEAPON_LASERSIGHT(
        generationFunction = ::ItemWeaponLasersight,
        nameRes = R.string.item_weapon_lasersight,
        imageRes = R.drawable.item_weapon_lasersight
    ),

    @RustObject
    ITEM_WEAPON_RACK_STAND(
        generationFunction = ::ItemWeaponRackStand,
        nameRes = R.string.item_weapon_rack_stand,
        imageRes = R.drawable.item_weapon_rack_stand
    ),

    @RustObject
    ITEM_WETSUIT(
        generationFunction = ::ItemWetsuit,
        nameRes = R.string.item_wetsuit,
        imageRes = R.drawable.item_wetsuit
    ),

    @Researcheable
    @RustObject
    ITEM_WHEELBARROW_PIANO(
        generationFunction = ::ItemWheelbarrowPiano,
        nameRes = R.string.item_wheelbarrow_piano,
        imageRes = R.drawable.item_wheelbarrow_piano
    ),

    @RustObject
    ITEM_WHITE_BERRY(
        generationFunction = ::ItemWhiteBerry,
        nameRes = R.string.item_white_berry,
        imageRes = R.drawable.item_white_berry
    ),

    @RustObject
    ITEM_WHITE_BERRY_CLONE(
        generationFunction = ::ItemWhiteBerryClone,
        nameRes = R.string.item_white_berry_clone,
        imageRes = R.drawable.item_white_berry_clone
    ),

    @RustObject
    ITEM_WHITE_BERRY_SEED(
        generationFunction = ::ItemWhiteBerrySeed,
        nameRes = R.string.item_white_berry_seed,
        imageRes = R.drawable.item_white_berry_seed
    ),

    @RustObject
    ITEM_WHITE_VOLCANO_FIREWORK(
        generationFunction = ::ItemWhiteVolcanoFirework,
        nameRes = R.string.item_white_volcano_firework,
        imageRes = R.drawable.item_white_volcano_firework
    ),

    @RustObject
    ITEM_WIDE_WEAPON_RACK(
        generationFunction = ::ItemWideWeaponRack,
        nameRes = R.string.item_wide_weapon_rack,
        imageRes = R.drawable.item_wide_weapon_rack
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "power_out"
        ]
    )
    @RustObject
    ITEM_WIND_TURBINE(
        generationFunction = ::ItemWindTurbine,
        nameRes = R.string.item_wind_turbine,
        imageRes = R.drawable.item_wind_turbine
    ),

    @Researcheable
    @ElectricalTool
    @RustObject
    ITEM_WIRE_TOOL(
        generationFunction = ::ItemWireTool,
        nameRes = R.string.item_wire_tool,
        imageRes = R.drawable.item_wire_tool
    ),

    @Researcheable
    @RustObject
    ITEM_WOLF_HEADDRESS(
        generationFunction = ::ItemWolfHeaddress,
        nameRes = R.string.item_wolf_headdress,
        imageRes = R.drawable.item_wolf_headdress
    ),

    @RustObject
    ITEM_WOLF_SKULL(
        generationFunction = ::ItemWolfSkull,
        nameRes = R.string.item_wolf_skull,
        imageRes = R.drawable.item_wolf_skull
    ),

    @RustObject
    ITEM_WOOD(
        generationFunction = ::ItemWood,
        nameRes = R.string.item_wood,
        imageRes = R.drawable.item_wood
    ),

    @Researcheable
    @RustObject
    ITEM_WOODEN_ARROW(
        generationFunction = ::ItemWoodenArrow,
        nameRes = R.string.item_wooden_arrow,
        imageRes = R.drawable.item_wooden_arrow
    ),

    @Researcheable
    @RustObject
    ITEM_WOODEN_BARRICADE(
        generationFunction = ::ItemWoodenBarricade,
        nameRes = R.string.item_wooden_barricade,
        imageRes = R.drawable.item_wooden_barricade
    ),

    @Researcheable
    @RustObject
    ITEM_WOODEN_BARRICADE_COVER(
        generationFunction = ::ItemWoodenBarricadeCover,
        nameRes = R.string.item_wooden_barricade_cover,
        imageRes = R.drawable.item_wooden_barricade_cover
    ),

    @RustObject
    ITEM_WOODEN_CROSS(
        generationFunction = ::ItemWoodenCross,
        nameRes = R.string.item_wooden_cross,
        imageRes = R.drawable.item_wooden_cross
    ),

    @Researcheable
    @DoorControllerAttachable
    @RustObject
    ITEM_WOODEN_DOOR(
        generationFunction = ::ItemWoodenDoor,
        nameRes = R.string.item_wooden_door,
        imageRes = R.drawable.item_wooden_door
    ),

    @Researcheable
    @RustObject
    ITEM_WOODEN_FLOOR_SPIKES(
        generationFunction = ::ItemWoodenFloorSpikes,
        nameRes = R.string.item_wooden_floor_spikes,
        imageRes = R.drawable.item_wooden_floor_spikes
    ),

    @DoorControllerAttachable
    @RustObject
    ITEM_WOODEN_FRONTIER_BAR_DOORS(
        generationFunction = ::ItemWoodenFrontierBarDoors,
        nameRes = R.string.item_wooden_frontier_bar_doors,
        imageRes = R.drawable.item_wooden_frontier_bar_doors
    ),

    @Researcheable
    @RustObject
    ITEM_WOODEN_HORSE_ARMOR(
        generationFunction = ::ItemWoodenHorseArmor,
        nameRes = R.string.item_wooden_horse_armor,
        imageRes = R.drawable.item_wooden_horse_armor
    ),

    @Researcheable
    @RustObject
    ITEM_WOODEN_LADDER(
        generationFunction = ::ItemWoodenLadder,
        nameRes = R.string.item_wooden_ladder,
        imageRes = R.drawable.item_wooden_ladder
    ),

    @Researcheable
    @RustObject
    ITEM_WOODEN_SPEAR(
        generationFunction = ::ItemWoodenSpear,
        nameRes = R.string.item_wooden_spear,
        imageRes = R.drawable.item_wooden_spear
    ),

    @Researcheable
    @RustObject
    ITEM_WOODEN_WINDOW_BARS(
        generationFunction = ::ItemWoodenWindowBars,
        nameRes = R.string.item_wooden_window_bars,
        imageRes = R.drawable.item_wooden_window_bars
    ),

    @Researcheable
    @RustObject
    ITEM_WOOD_ARMOR_HELMET(
        generationFunction = ::ItemWoodArmorHelmet,
        nameRes = R.string.item_wood_armor_helmet,
        imageRes = R.drawable.item_wood_armor_helmet
    ),

    @Researcheable
    @RustObject
    ITEM_WOOD_ARMOR_PANTS(
        generationFunction = ::ItemWoodArmorPants,
        nameRes = R.string.item_wood_armor_pants,
        imageRes = R.drawable.item_wood_armor_pants
    ),

    @Researcheable
    @RustObject
    ITEM_WOOD_CHESTPLATE(
        generationFunction = ::ItemWoodChestplate,
        nameRes = R.string.item_wood_chestplate,
        imageRes = R.drawable.item_wood_chestplate
    ),

    @Researcheable
    @DoorControllerAttachable
    @RustObject
    ITEM_WOOD_DOUBLE_DOOR(
        generationFunction = ::ItemWoodDoubleDoor,
        nameRes = R.string.item_wood_double_door,
        imageRes = R.drawable.item_wood_double_door
    ),

    @Researcheable
    @DoorControllerAttachable
    @RustObject
    ITEM_WOOD_SHUTTERS(
        generationFunction = ::ItemWoodShutters,
        nameRes = R.string.item_wood_shutters,
        imageRes = R.drawable.item_wood_shutters
    ),

    @Researcheable
    @StorageAdaptorAttachable(slotAmount = 2)
    @RustObject
    ITEM_WOOD_STORAGE_BOX(
        generationFunction = ::ItemWoodStorageBox,
        nameRes = R.string.item_wood_storage_box,
        imageRes = R.drawable.item_wood_storage_box
    ),

    @Researcheable
    @RustObject
    ITEM_WORKBENCH_LEVEL_1(
        generationFunction = ::ItemWorkbenchLevel1,
        nameRes = R.string.item_workbench_level_1,
        imageRes = R.drawable.item_workbench_level_1
    ),

    @Researcheable
    @RustObject
    ITEM_WORKBENCH_LEVEL_2(
        generationFunction = ::ItemWorkbenchLevel2,
        nameRes = R.string.item_workbench_level_2,
        imageRes = R.drawable.item_workbench_level_2
    ),

    @Researcheable
    @RustObject
    ITEM_WORKBENCH_LEVEL_3(
        generationFunction = ::ItemWorkbenchLevel3,
        nameRes = R.string.item_workbench_level_3,
        imageRes = R.drawable.item_workbench_level_3
    ),

    @RustObject
    ITEM_WORM(
        generationFunction = ::ItemWorm,
        nameRes = R.string.item_worm,
        imageRes = R.drawable.item_worm
    ),

    @RustObject
    ITEM_WRAPPED_GIFT(
        generationFunction = ::ItemWrappedGift,
        nameRes = R.string.item_wrapped_gift,
        imageRes = R.drawable.item_wrapped_gift
    ),

    @RustObject
    ITEM_WRAPPING_PAPER(
        generationFunction = ::ItemWrappingPaper,
        nameRes = R.string.item_wrapping_paper,
        imageRes = R.drawable.item_wrapping_paper
    ),

    @RustObject
    ITEM_XL_PICTURE_FRAME(
        generationFunction = ::ItemXlPictureFrame,
        nameRes = R.string.item_xl_picture_frame,
        imageRes = R.drawable.item_xl_picture_frame
    ),

    @Researcheable
    @Deployable
    @ElectricalComponent(
        inputs = [
            "input_a",
            "input_b"
        ],
        outputs = [
            "power_out"
        ]
    )
    @RustObject
    ITEM_XOR_SWITCH(
        generationFunction = ::ItemXorSwitch,
        nameRes = R.string.item_xor_switch,
        imageRes = R.drawable.item_xor_switch
    ),

    @RustObject
    ITEM_XXL_PICTURE_FRAME(
        generationFunction = ::ItemXxlPictureFrame,
        nameRes = R.string.item_xxl_picture_frame,
        imageRes = R.drawable.item_xxl_picture_frame
    ),

    @Researcheable
    @RustObject
    ITEM_XYLOBONE(
        generationFunction = ::ItemXylobone,
        nameRes = R.string.item_xylobone,
        imageRes = R.drawable.item_xylobone
    ),

    @RustObject
    ITEM_YELLOW_BERRY(
        generationFunction = ::ItemYellowBerry,
        nameRes = R.string.item_yellow_berry,
        imageRes = R.drawable.item_yellow_berry
    ),

    @RustObject
    ITEM_YELLOW_BERRY_CLONE(
        generationFunction = ::ItemYellowBerryClone,
        nameRes = R.string.item_yellow_berry_clone,
        imageRes = R.drawable.item_yellow_berry_clone
    ),

    @RustObject
    ITEM_YELLOW_BERRY_SEED(
        generationFunction = ::ItemYellowBerrySeed,
        nameRes = R.string.item_yellow_berry_seed,
        imageRes = R.drawable.item_yellow_berry_seed
    ),

    @RustObject
    ITEM_YELLOW_PERCH(
        generationFunction = ::ItemYellowPerch,
        nameRes = R.string.item_yellow_perch,
        imageRes = R.drawable.item_yellow_perch
    );

    fun RustObjectType.toRustObject(): RustObjectItem = this.generationFunction.invoke()
}
