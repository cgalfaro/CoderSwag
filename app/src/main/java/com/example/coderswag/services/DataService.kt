package com.example.coderswag.services

import com.example.coderswag.model.Category
import com.example.coderswag.model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "$18", "hat01"),
        Product("Devslopes Hat Black", "$20", "hat02"),
        Product("Devslopes Hat White", "$25", "hat03"),
        Product("Devslopes Hat Snapback", "$22", "hat04")
    )

    val hoddies = listOf(
        Product("Devslopes Hoodie Black", "$28", "hoodie01"),
        Product("Devslopes Hoodie Red", "$32", "hoodie02"),
        Product("Devslopes Gray Hoodie", "$45", "hoodie03"),
        Product("Devslopes Black Hoodie", "$35", "hoodie04")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black", "$18", "shirt01"),
        Product("Devslopes Badge Light Gray", "$15", "shirt02"),
        Product("Devslopes Logo Shirt red", "$22", "shirt03"),
        Product("Devslopes Hustle", "$22", "shirt04"),
        Product("Kickflip Studios", "$18", "shirt05")
    )
}