package ir.bitokss.bitokapp.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import ir.bitokss.bitokapp.data.repository.EventRepository
import ir.bitokss.bitokapp.data.repository.EventRepositoryImpl

@Module
@InstallIn(ViewModelComponent::class)
class RepositoryModule {

    @Provides
    @ViewModelScoped
    fun provideEventRepository(impl: EventRepositoryImpl): EventRepository = impl

}