package com.example.proskillspizza.recyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.proskillspizza.R
import com.example.proskillspizza.StockData

class StockAdapter : ListAdapter<StockData, StockAdapter.StockViewHolder>(StockDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StockViewHolder {
       return StockViewHolder(LayoutInflater.from(parent.context)
           .inflate(R.layout.stock_item_view,parent,false))
    }

    override fun onBindViewHolder(holder: StockViewHolder, position: Int) {
        holder.config(getItem(position))
    }


    class StockViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val stockIMG : ImageView = itemView.findViewById(R.id.stockIMG)
        fun config(stock : StockData){
            stockIMG.setImageResource(stock.image)
        }
    }

}

class StockDiffUtil : DiffUtil.ItemCallback<StockData>(){
    override fun areItemsTheSame(oldItem: StockData, newItem: StockData): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: StockData, newItem: StockData): Boolean {
       return oldItem == newItem
    }


}