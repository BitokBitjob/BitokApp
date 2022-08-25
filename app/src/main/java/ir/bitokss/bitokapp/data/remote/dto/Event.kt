package ir.bitokss.bitokapp.data.remote.dto

import ir.bitokss.bitokapp.presentation.events.EventView

data class Event(
    val id: Int,
    val title: String,
) {
    fun toEventView() = EventView(id, title)
}