package com.example.proskillspizza.recyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.proskillspizza.Category
import com.example.proskillspizza.MenuData
import com.example.proskillspizza.R

class CategoryAdapter(private val onClick:((Int)-> Unit)) : ListAdapter<Category, CategoryAdapter.CategoryViewHolder>(ItemDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
       return CategoryViewHolder(LayoutInflater.from(parent.context)
               .inflate(R.layout.category_item_view,parent,false))
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
      holder.config(getItem(position))
    }

    inner class CategoryViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val categoryTXT :TextView = itemView.findViewById(R.id.text_view)

        init {
            onClick.invoke(adapterPosition)
        }
        fun config(category: Category){

            categoryTXT.text = category.name
            if (category.isSelected){

                categoryTXT.setBackgroundColor(itemView.context.getColor(R.color.purple_200))
            }else{
                categoryTXT.setBackgroundColor(itemView.context.getColor(R.color.black))
            }

        }

    }

}