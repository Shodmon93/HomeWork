package com.example.proskillspizza.recyclerView

import android.graphics.Color.red
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.proskillspizza.Category
import com.example.proskillspizza.MenuData
import com.example.proskillspizza.R

class CategoryAdapter(private val onClick:((Int,Category)-> Unit)) : ListAdapter<Category, CategoryAdapter.CategoryViewHolder>(ItemDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
       return CategoryViewHolder(LayoutInflater.from(parent.context)
               .inflate(R.layout.category_item_view,parent,false))
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
      holder.config(getItem(position))
    }

    inner class CategoryViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val categoryTXT :TextView = itemView.findViewById(R.id.text_view)
        val carView : CardView = itemView.findViewById(R.id.cardView)


        init {
            itemView.setOnClickListener {
                onClick.invoke(adapterPosition,getItem(adapterPosition))
            }

        }
        fun config(category: Category){
            categoryTXT.text = category.name
            carView.setBackgroundColor(itemView.context.getColor(android.R.color.darker_gray))
            if (category.isSelected){
                carView.setBackgroundColor(itemView.context.getColor(android.R.color.holo_red_dark))
            }

        }

    }

}