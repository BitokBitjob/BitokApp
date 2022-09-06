package ir.bitokss.bitokapp.presentation.events

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.*
import ir.bitokss.bitokapp.data.remote.dto.Event

//class EventsAdapter(
//    private val onClick: (item: EventView, pos: Int) -> Unit
//) :
//    ListAdapter<EventView, EventsAdapter.EventViewHolder>(EventDiffCallback) {
//
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder {
//        val binding = ItemEventBinding
//            .inflate(LayoutInflater.from(parent.context), parent, false)
//        return EventViewHolder(binding)
//    }
//
//    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
//        with(holder.binding) {
//            tvTitle.text = currentList[position].title
//        }
//    }
//
//    inner class EventViewHolder(val binding: ItemEventBinding) :
//        RecyclerView.ViewHolder(binding.root) {
//
//        init {
//            binding.root.setOnClickListener {
//                onClick(currentList[bindingAdapterPosition], bindingAdapterPosition)
//            }
//        }
//    }
//
//    object EventDiffCallback : DiffUtil.ItemCallback<EventView>() {
//        override fun areItemsTheSame(oldItem: EventView, newItem: EventView): Boolean {
//            return oldItem.id == newItem.id
//        }
//
//        override fun areContentsTheSame(oldItem: EventView, newItem: EventView): Boolean {
//            return oldItem.hashCode() == newItem.hashCode()
//        }
//
//    }
//}
