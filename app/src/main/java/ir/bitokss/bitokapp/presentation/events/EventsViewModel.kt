package ir.bitokss.bitokapp.presentation.events

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import ir.bitokss.bitokapp.common.utils.CustomResponse
import ir.bitokss.bitokapp.data.remote.dto.Event
import ir.bitokss.bitokapp.data.repository.EventRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class EventsViewModel @Inject constructor(
    private val eventRepository: EventRepository
) : ViewModel() {

    private val _events: MutableStateFlow<CustomResponse<List<Event>>?> = MutableStateFlow(null)
    val events = _events.asStateFlow()

    fun getAllEvents() {
        viewModelScope.launch {
            eventRepository.getAllEvents("").collect {
                _events.value = it
            }
        }
    }
}