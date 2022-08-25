package ir.bitokss.bitokapp.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import ir.bitokss.bitokapp.data.repository.EventRepository
import ir.bitokss.bitokapp.data.repository.EventRepositoryImpl
import ir.bitokss.bitokapp.data.repository.FakeEventRepositoryImpl

@Module
@InstallIn(ViewModelComponent::class)
class RepositoryModule {

    //todo replace backend is ready
//    @Provides
//    @ViewModelScoped
//    fun provideEventRepository(impl: EventRepositoryImpl): EventRepository = impl

    @Provides
    @ViewModelScoped
    fun provideEventRepository(impl: FakeEventRepositoryImpl): EventRepository = impl
}