package ir.bitokss.bitokapp.data.remote.api_service.event

import ir.bitokss.bitokapp.data.remote.dto.Event
import retrofit2.Response
import retrofit2.Retrofit
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class EventService @Inject constructor(retrofit: Retrofit) : EventsApi {
    private val eventsApi by lazy { retrofit.create(EventsApi::class.java) }

    override fun getAllEvents(token: String): Response<List<Event>> {
        return eventsApi.getAllEvents(token)
    }
}