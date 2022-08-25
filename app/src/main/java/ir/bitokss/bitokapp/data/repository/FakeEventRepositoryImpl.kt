package ir.bitokss.bitokapp.data.repository

import ir.bitokss.bitokapp.common.utils.CustomResponse
import ir.bitokss.bitokapp.data.remote.api_service.event.EventService
import ir.bitokss.bitokapp.data.remote.dto.Event
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class FakeEventRepositoryImpl @Inject constructor(
    private val eventService: EventService
) : EventRepository {

    private val eventsList = mutableListOf(
        Event(0, "test0"),
        Event(1, "test1"),
        Event(2, "test2"),
        Event(3, "test3"),
        Event(4, "test4"),
        Event(5, "test5"),
    )

    override fun getAllEvents(token: String): Flow<CustomResponse<List<Event>>> {
        return flow {
            emit(CustomResponse.loading())
            delay(1000)
            emit(CustomResponse.success(eventsList))
        }
    }

}