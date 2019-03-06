package com.surajsundarv.coderswag.Services

import com.surajsundarv.coderswag.Models.Category
import com.surajsundarv.coderswag.Models.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL GOODS", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL GOODS", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL GOODS", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Graphic Beanie", "$18", "hat1"),
        Product("Hat Black", "$20", "hat2"),
        Product("Hat White", "$18", "hat3"),
        Product("Hat Snapback", "$22", "hat4")
    )

    val hoodies = listOf(
        Product("Hoodie Grey", "$28", "hoddie1"),
        Product("Hoodie Red", "$32", "hoodie2"),
        Product("Gray Hoodie", "$28", "hoodie3"),
        Product("Black Hoodie", "$22", "hoodie4")
    )

    val shirts = listOf(
        Product("Shirt Black", "$18", "shirt1"),
        Product("Badge Light Gray", "$20", "shirt2"),
        Product("Logo Shirt Red", "$22", "shirt3"),
        Product("Hustle", "$18", "shirt4"),
        Product("Kickflip Studios", "$18", "shirt5")
    )

}