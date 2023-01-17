package com.example.proskillspizza

data class Category(
    val id: Int? = null,
    val name: String? = null,
    var isSelected: Boolean = false

)

object CatData {

    fun setData(selectedIndex : Int? = null): MutableList<Category> {
        val items = mutableListOf(
            Category(1, "Пицца"),
            Category(2, "Комбо"),
            Category(3, "Закуски"),
            Category(4, "Десерты"),
            Category(5, "Напитки"),
            Category(5, "Соусы"),
            Category(5, "Другие товары")
        )
        items.forEachIndexed { index, category ->
            if (selectedIndex == index)
                category.isSelected = true

            return items
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
                    R.drawable.pizza_004,
                    "Соберите свою пиццу 35 см с двумя разными вкусами",
                    "от 74,00 с",
                    "Десерты"

                )
            )
            items.add(
                MenuData(
                    3,
                    "Пицца из половинок",
                    R.drawable.pizza_005,
                    "Соберите свою пиццу 35 см с двумя разными вкусами",
                    "от 74,00 с",
                    "Напитки"

                )
            )
            items.forEach { menuData ->
                if (selectedItem == menuData.category)
                    return items
            }
            return items

        }
    }
//
//    fun setPizzaData(selectedElement: Int? = null): MutableList<Category> {
//        val items = mutableListOf(
//            Category(
//                1, null,
//                Pizza(
//                    1,
//
//                    "Новогодний цыпленок",
//                    "от 60,00 с"
//                ),
//                Drink(
//                    2,
//
//
//                    Combo(
//                        3,
//
//
//                        ),
//                    Snacks(
//                        5,
//                        R.drawable.pizza_005,
//                        "Пепперони",
//                        "Пепперони из цыпленка, томатный соус, увеличенная порция моцареллы",
//                        "от 54,00 с"
//                    ), null
//                ),
//                Category(
//                    1, null, Pizza(
//                        1,
//                        R.drawable.pizza_001,
//                        "Новогодний цыпленок",
//                        "Смесь сыров чеддер и пармезан, соус альфредо, мандарины, цитрусовый соус, новогодний цыпленок, сыр моцарелла",
//                        "от 60,00 с"
//                    ),
//                    Drink(
//                        2,
//                        R.drawable.pizza_002,
//                        "Бургер пицца",
//                        "Красный лук, соленые огурчики, томаты, соус бургер, ветчина халяль, сыр моцарелла",
//                        "от 54,00 с"
//                    ),
//                    Combo(
//                        3,
//                        R.drawable.pizza_003,
//                        "Пицца из половинок",
//                        "Соберите свою пиццу 35 см с двумя разными вкусами",
//                        "от 74,00 с"
//                    ),
//                    Snacks(
//                        5,
//                        R.drawable.pizza_005,
//                        "Пепперони",
//                        "Пепперони из цыпленка, томатный соус, увеличенная порция моцареллы",
//                        "от 54,00 с"
//                    ), null
//                )
//            )
//
//
//                    items . forEachIndexed { index, category ->
//                if (index == selectedElement) {
//                    category.isSelected = true
//                }
//            }
//            return items
//    }
//}
//
//object PizzaModule {
//    fun setPizzaData(): MutableList<Pizza> {
//        val items = mutableListOf(
//            Pizza(
//                1,
//                R.drawable.pizza_001,
//                "Новогодний цыпленок",
//                "Смесь сыров чеддер и пармезан, соус альфредо, мандарины, цитрусовый соус, новогодний цыпленок, сыр моцарелла",
//                "от 60,00 с"
//            ),
//            Pizza(
//                2,
//                R.drawable.pizza_002,
//                "Бургер пицца",
//                "Красный лук, соленые огурчики, томаты, соус бургер, ветчина халяль, сыр моцарелла",
//                "от 54,00 с"
//            ),
//            Pizza(
//                3,
//                R.drawable.pizza_003,
//                "Пицца из половинок",
//                "Соберите свою пиццу 35 см с двумя разными вкусами",
//                "от 74,00 с"
//            ),
//            Pizza(
//                4,
//                R.drawable.pizza_004,
//                "Аррива!",
//                "Сыр моцарелла, соус бургер, цыпленок, соус ранч, острая чоризо из цыпленка, сладкий перец, красный лук, томаты, чеснок",
//                "от 54,00 с"
//            ),
//            Pizza(
//                5,
//                R.drawable.pizza_005,
//                "Пепперони",
//                "Пепперони из цыпленка, томатный соус, увеличенная порция моцареллы",
//                "от 54,00 с"
//            ),
//            Pizza(
//                6,
//                R.drawable.pizza_006,
//                "Додо",
//                "Ветчина из цыпленка, митболы из говядины, пикантная пепперони из цыпленка, томаты, шампиньоны, сладкий перец, красный лук, чеснок, томатный соус, моцарелла",
//                "от 60,00 с"
//            ),
//            Pizza(
//                7,
//                R.drawable.pizza_007,
//                "Новогодний цыпленок",
//                "Смесь сыров чеддер и пармезан, соус альфредо, мандарины, цитрусовый соус, новогодний цыпленок, сыр моцарелла",
//                "от 60,00 с"
//            ),
//            Pizza(
//                8,
//                R.drawable.pizza_008,
//                "Диабло \uD83C\uDF36️\uD83C\uDF36️",
//                "Острая чоризо из цыпленка, острый перец халапеньо, соус барбекю, митболы из говядины, томаты, сладкий перец, красный лук, томатный соус, моцарелла",
//                "от 58,00 с"
//            ),
//        )
//        return items
//    }
//}
