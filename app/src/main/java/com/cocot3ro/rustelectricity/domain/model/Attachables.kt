package com.cocot3ro.rustelectricity.domain.model

import com.cocot3ro.rustelectricity.generated.domain.model.ItemDoorController
import com.cocot3ro.rustelectricity.generated.domain.model.ItemStorageAdaptor
import com.cocot3ro.rustelectricity.generated.domain.model.ItemStorageMonitor

interface DoorControllerAttachable {
    var doorController: ItemDoorController?
}

interface StorageMonitorAttachable {
    var storageMonitor: ItemStorageMonitor?
}

interface StorageAdaptorAttachable {
    val adaptors: Array<ItemStorageAdaptor?>
}
