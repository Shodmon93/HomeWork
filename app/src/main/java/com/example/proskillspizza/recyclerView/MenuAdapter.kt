package com.example.proskillspizza.recyclerView

import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.proskillspizza.CatData
import com.example.proskillspizza.MenuData
import com.example.proskillspizza.R

class MenuAdapter : ListAdapter<MenuData, MenuAdapter.MenuViewHolder>(OnItemDiffUtil()) {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
      return MenuViewHolder(LayoutInflater.from(parent.context)
          .inflate(R.layout.manu_item_list,parent,false))
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
       holder.config(getItem(position))
    }

    inner class MenuViewHolder(view:View): RecyclerView.ViewHolder(view){

        val itemIMG : ImageView = view.findViewById(R.id.pizzaIMG)
        val pizzaName : TextView = view.findViewById(R.id.pizzaName)
        val pizzaInfo: TextView = view.findViewById(R.id.pizzaInfo)
        val pizzaPrice : TextView = view.findViewById(R.id.price)

        fun config (menuData: MenuData){
            itemIMG.setImageResource(menuData.image!!)
            pizzaName.text = menuData.name
            pizzaInfo.text = menuData.info
            pizzaPrice.text = menuData.price
        }



    }
}

class OnItemDiffUtil : DiffUtil.ItemCallback<MenuData>(){
    override fun areItemsTheSame(oldItem: MenuData, newItem: MenuData): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: MenuData, newItem: MenuData): Boolean {
       return oldItem == newItem
    }

}