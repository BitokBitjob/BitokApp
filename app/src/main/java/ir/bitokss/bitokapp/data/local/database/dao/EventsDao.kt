package ir.bitokss.bitokapp.data.local.database.dao

import android.media.metrics.Event
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import ir.bitokss.bitokapp.data.local.database.entity.EventEntity

@Dao
interface EventsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertEvents(events: List<EventEntity>)

}