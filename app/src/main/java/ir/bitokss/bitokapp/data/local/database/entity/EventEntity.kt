package ir.bitokss.bitokapp.data.local.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class EventEntity(
    @PrimaryKey val id: Int,
    val title: String
) {
}