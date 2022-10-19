package com.geektech.taskmanager_botnav.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.geektech.taskmanager_botnav.databinding.ItemTaskBinding
import com.geektech.taskmanager_botnav.ui.placeholder.PlaceholderContent.PlaceholderItem


class MyItemRecyclerViewAdapter(
    private val values: List<PlaceholderItem>,
) : RecyclerView.Adapter<MyItemRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(ItemTaskBinding.inflate(LayoutInflater.from(parent.context),
            parent,
            false))

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.idView.text = item.id
        holder.contentView.text = item.content
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: ItemTaskBinding) : RecyclerView.ViewHolder(binding.root) {
        val idView: TextView = binding.tvTitle
        val contentView: TextView = binding.tvDescription

        override fun toString(): String {
            return super.toString() + " '" + contentView.text + "'"
        }
    }

}