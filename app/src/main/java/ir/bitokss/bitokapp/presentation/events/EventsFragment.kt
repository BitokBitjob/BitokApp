package ir.bitokss.bitokapp.presentation.events

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint
import ir.bitokss.bitokapp.common.utils.CustomResponse
import ir.bitokss.bitokapp.common.utils.CustomResponse.Status.*

@AndroidEntryPoint
class EventsFragment : Fragment() {

//    private val viewModel by viewModels<EventsViewModel>()
//    private val eventsAdapter by lazy {
//        EventsAdapter() { item, pos ->
//            Toast.makeText(
//                requireContext(),
//                "Clicked item ${item.title} at $pos",
//                Toast.LENGTH_SHORT
//            ).show()
//        }
//    }
//
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        initView()
//        initCollectors()
//        viewModel.getAllEvents()
//    }
//
//    private fun initView() {
//        initRecyclerView()
//    }
//
//    private fun initRecyclerView() {
//        binding.rvEvents.apply {
//            adapter = eventsAdapter
//        }
//    }
//
//    private fun initCollectors() {
//        lifecycleScope.launchWhenResumed {
//            viewModel.events.collect {
//                it.let { data ->
//                    eventsAdapter.submitList(data)
//                }
//            }
//        }
//
//        lifecycleScope.launchWhenResumed {
//            viewModel.showLoading.collect { isLoading ->
//                if (isLoading == true)
//                    showProgress()
//                else
//                    hideProgress()
//            }
//        }
//
//        lifecycleScope.launchWhenResumed {
//            viewModel.showError.collect {
//                it?.let {
//                    Snackbar.make(requireView(), it, Snackbar.LENGTH_SHORT).show()
//                }
//            }
//        }
//
//    }
//

}