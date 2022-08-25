package ir.bitokss.bitokapp.data.remote.api_service.event

import ir.bitokss.bitokapp.data.remote.dto.Event
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface EventsApi {

    @GET("v1/api/events/")
    fun getAllEvents(@Query("api_key") token: String): Response<List<Event>>
}