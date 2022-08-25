package ir.bitokss.bitokapp.domain.repository

import ir.bitokss.bitokapp.common.utils.CustomResponse
import ir.bitokss.bitokapp.data.remote.dto.Event
import kotlinx.coroutines.flow.Flow

interface EventRepository {
    fun getAllEvents(token: String): Flow<CustomResponse<List<Event>>>
}