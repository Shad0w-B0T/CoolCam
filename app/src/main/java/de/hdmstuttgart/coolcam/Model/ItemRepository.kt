package de.hdmstuttgart.coolcam.Model

import androidx.annotation.WorkerThread

class ItemRepository(private val itemDao: ItemDao) {

    fun getAllItems(): List<Item> {
        return itemDao.getAllItems()
    }

    @WorkerThread
    suspend fun insert(item: Item) {
        itemDao.insert(item)
    }

    @WorkerThread
    suspend fun delete(item: Item) {
        itemDao.delete(item)
    }
}