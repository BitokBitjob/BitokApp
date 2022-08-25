package ir.bitokss.bitokapp.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ir.bitokss.bitokapp.data.remote.api_service.event.EventService
import ir.bitokss.bitokapp.data.remote.api_service.event.EventsApi
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ServiceModule {

    @Provides
    @Singleton
    fun provideEventsService(retrofit: Retrofit): EventService {
        return EventService(retrofit)
    }
}