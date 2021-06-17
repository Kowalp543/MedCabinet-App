package com.pl.agh.kowalp.medcabinetapp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TaskViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val taskTextView = itemView.findViewById(R.id.task_textview) as TextView
}