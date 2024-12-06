package com.cocot3ro.rustelectricity.domain.model

import com.cocot3ro.rustelectricity.generated.domain.model.ItemDoorController
import com.cocot3ro.rustelectricity.generated.domain.model.ItemStorageAdaptor
import com.cocot3ro.rustelectricity.generated.domain.model.ItemStorageMonitor

interface IDoorControllerAttachable {
    var doorController: ItemDoorController?
}

interface IStorageMonitorAttachable {
    var storageMonitor: ItemStorageMonitor?
}

interface IStorageAdaptorAttachable {
    val adaptors: Array<ItemStorageAdaptor?>
}
