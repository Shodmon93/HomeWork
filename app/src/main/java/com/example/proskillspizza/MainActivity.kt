package com.example.proskillspizza

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proskillspizza.recyclerView.CategoryAdapter
import com.example.proskillspizza.recyclerView.MenuAdapter
import com.example.proskillspizza.recyclerView.StockAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var myAdapter: CategoryAdapter
    private lateinit var stockAdapter: StockAdapter
    private lateinit var categoryRV : RecyclerView
    private lateinit var menuAdapter : MenuAdapter




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initCategoryRV()
        iniStockRV()
        initMenuRV()


    }
    fun initCategoryRV(){
        categoryRV = findViewById(R.id.rv_horizontal)

        myAdapter = CategoryAdapter{index, category ->

            val newList = CatData.setData(index).map {
                Category(it.id, it.name, it.isSelected)
            }

            menuAdapter.submitList(MenuDataModule.setData(category.name))
            myAdapter.submitList(CatData.setData(index))

            Toast.makeText(this, "$index", Toast.LENGTH_SHORT).show()
        }
        myAdapter.submitList(CatData.setData())

        val layoutManager = LinearLayoutManager(this@MainActivity,LinearLayoutManager.HORIZONTAL,false)
        categoryRV.layoutManager = layoutManager
        categoryRV.adapter = myAdapter
    }
    fun iniStockRV(){
        stockAdapter = StockAdapter()
        stockAdapter.submitList(StockModule.setData())
        val stockRV = findViewById<RecyclerView>(R.id.stockRV)
        val layoutManager = GridLayoutManager(this@MainActivity,1,GridLayoutManager.HORIZONTAL,false)
        stockRV.layoutManager = layoutManager
        stockRV.adapter = stockAdapter

    }
    fun initMenuRV(){
        menuAdapter = MenuAdapter()
        categoryRV = findViewById(R.id.manuItemList)
        menuAdapter.submitList(MenuDataModule.setData())
        categoryRV.layoutManager = LinearLayoutManager(this@MainActivity,LinearLayoutManager.VERTICAL,false)
        categoryRV.adapter = menuAdapter
    }
}