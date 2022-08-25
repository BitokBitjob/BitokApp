package ir.bitokss.bitokapp.presentation.events

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import ir.bitokss.bitokapp.common.utils.CustomResponse.Status.*
import ir.bitokss.bitokapp.data.repository.EventRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class EventsViewModel @Inject constructor(
    private val eventRepository: EventRepository
) : ViewModel() {

    private val _events: MutableStateFlow<List<EventView>?> = MutableStateFlow(null)
    val events = _events.asStateFlow()

    private val _showLoading: MutableStateFlow<Boolean?> = MutableStateFlow(null)
    val showLoading = _showLoading.asStateFlow()

    private val _showError: MutableStateFlow<String?> = MutableStateFlow(null)
    val showError = _showError.asStateFlow()

    fun getAllEvents() {
        viewModelScope.launch {
            eventRepository.getAllEvents("").collect {
                when (it.status) {
                    SUCCESS -> {
                        _showLoading.emit(false)
                        _events.value = it.data?.map { it.toEventView() }
                    }
                    FAIL -> {
                        _showLoading.emit(false)
                        _showError.emit(it.message)
                    }
                    ERROR -> {
                        _showLoading.emit(false)
                        _showError.emit(it.message)
                    }
                    LOADING -> {
                        _showLoading.emit(true)
                    }
                }

            }
        }
    }
}