package com.cocot3ro.rustelectricity.interfaces

interface IDoorControllerAttachable {
    var doorController: IItemDoorController?
}

interface IStorageMonitorAttachable {
    var storageMonitor: IItemStorageMonitor?
}

interface IStorageAdaptorAttachable {
    var adaptors: Array<IItemStorageAdaptor?>
}

interface IItemDoorController

interface IItemStorageMonitor

interface IItemStorageAdaptor