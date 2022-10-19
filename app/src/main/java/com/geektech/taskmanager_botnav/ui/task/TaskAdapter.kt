package com.geektech.taskmanager_botnav.ui.task

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.geektech.taskmanager_botnav.data.Task
import com.geektech.taskmanager_botnav.databinding.ItemTaskBinding


class TaskAdapter: Adapter<TaskAdapter.TaskViewHolder>() {

    private val tasks= arrayListOf<Task>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
       return TaskViewHolder(ItemTaskBinding.inflate
           (LayoutInflater.from(parent.context),
           parent,
           false))
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int = tasks.size


    inner class  TaskViewHolder(private val binding: ItemTaskBinding) :
        ViewHolder(binding.root) {
    fun bind(){
      var item = tasks[adapterPosition]
        binding.tvTitle.text= item.title
        binding.tvDescription.text= item.descr
    }
    }
}