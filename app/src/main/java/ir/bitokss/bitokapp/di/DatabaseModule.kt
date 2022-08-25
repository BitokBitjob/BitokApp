package ir.bitokss.bitokapp.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import ir.bitokss.bitokapp.common.Constants
import ir.bitokss.bitokapp.data.local.database.AppDatabase
import ir.bitokss.bitokapp.data.local.database.dao.EventsDao
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object DatabaseModule {

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext appContext: Context): AppDatabase {
        return Room.databaseBuilder(
            appContext,
            AppDatabase::class.java,
            Constants.APP_DATABASE
        )
            .fallbackToDestructiveMigrationOnDowngrade()
            .build()
    }



    @Provides
    fun provideUserDao(appDatabase: AppDatabase): EventsDao {
        return appDatabase.eventsDao()
    }

}