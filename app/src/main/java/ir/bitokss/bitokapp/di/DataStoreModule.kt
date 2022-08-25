package ir.bitokss.bitokapp.di


import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ir.bitokss.bitokapp.data.local.datastore.user.UserDataStore
import ir.bitokss.bitokapp.data.local.datastore.user.UserDataStoreImpl


@Module
@InstallIn(SingletonComponent::class)
abstract class DataStoreModule {

    @Binds
    abstract fun bindUserDataStore(prefsStoreImpl: UserDataStoreImpl): UserDataStore

}