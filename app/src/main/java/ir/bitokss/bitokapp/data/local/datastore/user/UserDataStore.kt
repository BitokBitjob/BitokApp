package ir.bitokss.bitokapp.data.local.datastore.user

import kotlinx.coroutines.flow.Flow

interface UserDataStore {

    suspend fun isLoggedIn(): Flow<Boolean>
    suspend fun setIsLoggedIn(isLoggedIn: Boolean)

}