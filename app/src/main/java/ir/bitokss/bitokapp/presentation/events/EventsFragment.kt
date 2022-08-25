package ir.bitokss.bitokapp.presentation.events

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import ir.bitokss.bitokapp.common.utils.CustomResponse
import ir.bitokss.bitokapp.common.utils.CustomResponse.Status.*
import ir.bitokss.bitokapp.databinding.FragmentEventsBinding

@AndroidEntryPoint
class EventsFragment : Fragment() {

    private lateinit var binding: FragmentEventsBinding
    private val viewModel by viewModels<EventsViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEventsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initCollectors()
        viewModel.getAllEvents()
    }

    private fun initCollectors() {
        lifecycleScope.launchWhenResumed {
            viewModel.events.collect {
                when (it?.status) {
                    SUCCESS -> TODO()
                    FAIL -> TODO()
                    ERROR -> TODO()
                    LOADING -> TODO()
                    null -> TODO()
                }
            }
        }

    }


}