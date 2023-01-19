package com.example.proskillspizza

data class Category(
    val id: Int? = null,
    val name: String? = null,
    var isSelected: Boolean = false

)

object CatData {

    fun setData(selectedIndex: Int? = null): MutableList<Category> {
        val items = mutableListOf(
            Category(0, "Пицца"),
            Category(1, "Комбо"),
            Category(2, "Закуски"),
            Category(3, "Десерты"),
            Category(4, "Напитки"),
            Category(5, "Соусы"),
            Category(6, "Другие товары")
        )
        items.forEachIndexed { index, category ->
            if (selectedIndex == index)
                category.isSelected = true
        }
        return items
    }
}


data class MenuData(
    val id: Int? = null,
    val name: String? = null,
    val image: Int? = null,
    val info: String? = null,
    val price: String? = null,
    val category: String? = null
)

object MenuDataModule {
    fun setData(selectedItem: String? = null): MutableList<MenuData> {
        val items: MutableList<MenuData> = mutableListOf()
        items.add(
            MenuData(
                1,
                "Новогодний цыпленок",
                R.drawable.pizza_001,
                "Смесь сыров чеддер и пармезан, соус альфредо, мандарины, цитрусовый соус, новогодний цыпленок, сыр моцарелла",
                "от 54,00 с",
                "Пицца"
            )
        )
        items.add(
            MenuData(
                1,
                "Новогодний цыпленок",
                R.drawable.pizza_001,
                "Смесь сыров чеддер и пармезан, соус альфредо, мандарины, цитрусовый соус, новогодний цыпленок, сыр моцарелла",
                "от 54,00 с",
                "Пицца"
            )
        )
        items.add(
            MenuData(
                1,
                "Новогодний цыпленок",
                R.drawable.pizza_001,
                "Смесь сыров чеддер и пармезан, соус альфредо, мандарины, цитрусовый соус, новогодний цыпленок, сыр моцарелла",
                "от 54,00 с",
                "Пицца"
            )
        )
        items.add(
            MenuData(
                2,
                "Бургер пицца",
                R.drawable.pizza_002,
                "Красный лук, соленые огурчики, томаты, соус бургер, ветчина халяль, сыр моцарелла",
                "от 54,00 с",
                "Комбо"
            )
        )
        items.add(
            MenuData(
                2,
                "Бургер пицца",
                R.drawable.pizza_002,
                "Красный лук, соленые огурчики, томаты, соус бургер, ветчина халяль, сыр моцарелла",
                "от 54,00 с",
                "Комбо"
            )
        )
        items.add(
            MenuData(
                2,
                "Бургер пицца",
                R.drawable.pizza_002,
                "Красный лук, соленые огурчики, томаты, соус бургер, ветчина халяль, сыр моцарелла",
                "от 54,00 с",
                "Комбо"
            )
        )
        items.add(
            MenuData(
                3,
                "Пицца из половинок",
                R.drawable.pizza_003,
                "Соберите свою пиццу 35 см с двумя разными вкусами",
                "от 74,00 с",
                "Закуски"

            )
        )
        items.add(
            MenuData(
                3,
                "Пицца из половинок",
                R.drawable.pizza_003,
                "Соберите свою пиццу 35 см с двумя разными вкусами",
                "от 74,00 с",
                "Закуски"

            )
        )
        items.add(
            MenuData(
                3,
                "Пицца из половинок",
                R.drawable.pizza_003,
                "Соберите свою пиццу 35 см с двумя разными вкусами",
                "от 74,00 с",
                "Закуски"

            )
        )
        items.add(
            MenuData(
                4,
                "Пицца из половинок",
                R.drawable.pizza_004,
                "Соберите свою пиццу 35 см с двумя разными вкусами",
                "от 74,00 с",
                "Десерты"

            )
        )
        items.add(
            MenuData(
                4,
                "Пицца из половинок",
                R.drawable.pizza_004,
                "Соберите свою пиццу 35 см с двумя разными вкусами",
                "от 74,00 с",
                "Десерты"

            )
        )
        items.add(
            MenuData(
                4,
                "Пицца из половинок",
                R.drawable.pizza_004,
                "Соберите свою пиццу 35 см с двумя разными вкусами",
                "от 74,00 с",
                "Десерты"

            )
        )
        items.add(
            MenuData(
                4,
                "Пицца из половинок",
                R.drawable.pizza_004,
                "Соберите свою пиццу 35 см с двумя разными вкусами",
                "от 74,00 с",
                "Десерты"

            )
        )
        items.add(
            MenuData(
                5,
                "Пицца из половинок",
                R.drawable.pizza_005,
                "Соберите свою пиццу 35 см с двумя разными вкусами",
                "от 74,00 с",
                "Напитки"

            )
        )
        items.add(
            MenuData(
                5,
                "Пицца из половинок",
                R.drawable.pizza_005,
                "Соберите свою пиццу 35 см с двумя разными вкусами",
                "от 74,00 с",
                "Напитки"

            )
        )
        items.add(
            MenuData(
                5,
                "Пицца из половинок",
                R.drawable.pizza_005,
                "Соберите свою пиццу 35 см с двумя разными вкусами",
                "от 74,00 с",
                "Напитки"

            )
        )
        items.add(
            MenuData(
                5,
                "Пицца из половинок",
                R.drawable.pizza_005,
                "Соберите свою пиццу 35 см с двумя разными вкусами",
                "от 74,00 с",
                "Напитки"

            )
        )
        items.add(
            MenuData(
                5,
                "Диабло \uD83C\uDF36️\uD83C\uDF36️",
                R.drawable.pizza_008,
                "Острая чоризо из цыпленка, острый перец халапеньо, соус барбекю, митболы из говядины, томаты, сладкий перец, красный лук, томатный соус, моцарелла",
                "от 58,00 с",
                "Соусы"
            )
        )
        items.add(
            MenuData(
                5,
                "Диабло \uD83C\uDF36️\uD83C\uDF36️",
                R.drawable.pizza_008,
                "Острая чоризо из цыпленка, острый перец халапеньо, соус барбекю, митболы из говядины, томаты, сладкий перец, красный лук, томатный соус, моцарелла",
                "от 58,00 с",
                "Соусы"
            )
        )
        items.add(
            MenuData(
                5,
                "Диабло \uD83C\uDF36️\uD83C\uDF36️",
                R.drawable.pizza_008,
                "Острая чоризо из цыпленка, острый перец халапеньо, соус барбекю, митболы из говядины, томаты, сладкий перец, красный лук, томатный соус, моцарелла",
                "от 58,00 с",
                "Соусы"
            )
        )
        items.add(
            MenuData(
                5,
                "Диабло \uD83C\uDF36️\uD83C\uDF36️",
                R.drawable.pizza_008,
                "Острая чоризо из цыпленка, острый перец халапеньо, соус барбекю, митболы из говядины, томаты, сладкий перец, красный лук, томатный соус, моцарелла",
                "от 58,00 с",
                "Другие товары"
            )
        )

        return if (selectedItem == null) {
            items
        } else {
            items.filter {
                //........
                it.category == selectedItem
            }.toMutableList()
        }
    }
}