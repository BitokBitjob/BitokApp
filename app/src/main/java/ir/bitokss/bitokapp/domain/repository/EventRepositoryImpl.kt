package ir.bitokss.bitokapp.domain.repository

import ir.bitokss.bitokapp.common.utils.CustomResponse
import ir.bitokss.bitokapp.common.utils.getResult
import ir.bitokss.bitokapp.data.remote.api_service.event.EventsApi
import ir.bitokss.bitokapp.data.remote.dto.Event
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class EventRepositoryImpl @Inject constructor(
    private val eventsApi: EventsApi
) : EventRepository {
    override fun getAllEvents(token: String): Flow<CustomResponse<List<Event>>> {
        return flow {
            emit(getResult { eventsApi.getAllEvents(token) })
        }
    }

}