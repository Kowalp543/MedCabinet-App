package com.pl.agh.kowalp.medcabinetapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

interface SelectionRecyclerViewClickListener {
    fun listItemClicked(list: TaskList)
}


class ListSelectionRecyclerViewAdapter(private val lists: ArrayList<TaskList>,
                                       val clickListener: SelectionRecyclerViewClickListener):
    RecyclerView.Adapter<SelectionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SelectionViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_selection_view_holder,
            parent,
            false)

        return SelectionViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: SelectionViewHolder, position: Int) {
        holder.listPosition.text = (position + 1).toString()
        holder.listTitle.text = lists.get(position).name

        holder.itemView.setOnClickListener {
            clickListener.listItemClicked(lists[position])
        }
    }

    override fun getItemCount(): Int {
        return lists.size
    }

    fun addList(list: TaskList) {
        lists.add(list)
        notifyItemInserted(lists.size - 1)
    }
}