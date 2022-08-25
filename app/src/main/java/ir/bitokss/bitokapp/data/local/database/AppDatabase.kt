package ir.bitokss.bitokapp.data.local.database

import androidx.room.*
import ir.bitokss.bitokapp.data.local.database.dao.EventsDao
import ir.bitokss.bitokapp.data.local.database.entity.EventEntity


@Database(
    entities = [
        EventEntity::class,
    ],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun eventsDao(): EventsDao

}