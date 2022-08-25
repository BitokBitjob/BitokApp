package ir.bitokss.bitokapp.data.local.datastore.user

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.preferencesDataStore
import dagger.hilt.android.qualifiers.ApplicationContext
import ir.bitokss.bitokapp.common.Constants.STORE_NAME
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import java.io.IOException
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserDataStoreImpl @Inject constructor(
    @ApplicationContext val context: Context,
) : UserDataStore {

    private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(
        name = STORE_NAME
    )

    override suspend fun isLoggedIn(): Flow<Boolean> =
        context.dataStore.data.catch { exception ->
            if (exception is IOException) {
                emit(emptyPreferences())
            } else {
                throw exception
            }
        }.map { it[PreferencesKeys.IS_LOGGED_IN_PREF] ?: false }

    override suspend fun setIsLoggedIn(isLoggedIn: Boolean) {
        context.dataStore.edit {
            it[PreferencesKeys.IS_LOGGED_IN_PREF] = isLoggedIn
        }
    }


    private object PreferencesKeys {
        val IS_LOGGED_IN_PREF = booleanPreferencesKey("is_logged_in")
    }

}