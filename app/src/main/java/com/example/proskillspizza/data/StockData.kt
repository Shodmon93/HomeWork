package com.example.proskillspizza

data class StockData(
    val id : Int,
    val image: Int
)
object StockModule{
    fun setData() : MutableList<StockData>{
        val items = mutableListOf(
            StockData(1,R.drawable.img_001),
            StockData(1,R.drawable.img_001),
            StockData(1,R.drawable.img_001),
            StockData(1,R.drawable.img_001)
        )
        return items
    }
}
