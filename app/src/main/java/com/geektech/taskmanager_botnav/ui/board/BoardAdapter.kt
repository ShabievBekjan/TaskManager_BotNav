package com.geektech.taskmanager_botnav.ui.board

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geektech.taskmanager_botnav.R
import com.geektech.taskmanager_botnav.databinding.ItemBoardBinding

class BoardAdapter: RecyclerView.Adapter<BoardAdapter.BoardViewHolder>() {
    private var lotti = arrayListOf(R.raw.lotti_1,R.raw.lotti_2,R.raw.lotti_3)
   inner class BoardViewHolder(var binding: ItemBoardBinding) :RecyclerView.ViewHolder(binding.root){
       fun bind(position: Int) {
           binding.lottie.setAnimation(lotti[position])

       }

   }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BoardViewHolder {
        return BoardViewHolder(ItemBoardBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: BoardViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount()=3
}