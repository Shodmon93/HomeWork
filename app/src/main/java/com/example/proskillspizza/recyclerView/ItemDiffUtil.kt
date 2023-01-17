package com.example.proskillspizza.recyclerView

import androidx.recyclerview.widget.DiffUtil
import com.example.proskillspizza.Category

class ItemDiffUtil : DiffUtil.ItemCallback<Category>() {
    override fun areItemsTheSame(oldItem: Category, newItem: Category): Boolean {
      return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Category, newItem: Category): Boolean {
       return oldItem == newItem
    }

}