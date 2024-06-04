package de.hdmstuttgart.coolcam.Model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate

@Entity
data class Item(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val expiryDate: LocalDate,
    val quantity: Int = 1, //default quantity
    val barcode: String
)