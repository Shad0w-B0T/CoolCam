package de.hdmstuttgart.coolcam.Model

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ItemDao {

    @Query("SELECT * FROM item")
    fun getAllItems(): List<Item>

    @Insert
    fun insert(item: Item)

    @Delete
    fun delete(item: Item)
}