package ir.bitokss.bitokapp.common.utils

import org.json.JSONObject
import retrofit2.Response

suspend fun <T> getResult(call: suspend () -> Response<T>): CustomResponse<T> {
    try {
        val response = call()
        if (response.isSuccessful || response.code() == 201) {
            val body = response.body()
            return if (body != null) CustomResponse.success(body)
            else return CustomResponse.error(response.message())
        }
        val json = JSONObject(response.errorBody()?.string()!!)

        return when { //todo
//            json.has("Title") -> CustomResponse.error(json.get("Message") as String, json.get("Title") as String)
//            json.has("error") -> CustomResponse.error(json.get("error") as String, null)
            else -> CustomResponse.error(json.get("Message") as String, null)
        }
    } catch (e: Exception) {
        return CustomResponse.fail(e.message ?: e.toString())
    }
}
