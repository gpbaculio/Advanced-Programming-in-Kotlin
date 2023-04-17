package com.littlelemon.menu

import org.junit.Assert.*

import org.junit.Before
import org.junit.Test

class FilterHelperTest {

    private lateinit var filterHelper: FilterHelper
    private lateinit var productsList: List<ProductItem>

    @Before
    fun setUp() {
        filterHelper = FilterHelper()
        // Initialize productsList with some sample data for testing
        productsList = listOf(
            ProductItem("Bouillabaisse", 20.00, "Food", R.drawable.bouillabaisse),
            ProductItem("Cappuccino", 8.00, "Drinks", R.drawable.cappuccino),
            ProductItem("Quiche Lorraine", 17.00, "Dessert", R.drawable.quiche_lorraine),
            ProductItem("Salmon en papillote", 25.00, "Food", R.drawable.salmon_en_papillote),
            ProductItem("Latte", 8.00, "Drinks", R.drawable.latte),
        )
    }

    @Test
    fun testFilterProducts() {
        val filteredListAll = filterHelper.filterProducts(FilterType.All, productsList)
        val filteredListDessert = filterHelper.filterProducts(FilterType.Dessert, productsList)
        val filteredListDrinks = filterHelper.filterProducts(FilterType.Drinks, productsList)
        val filteredListFood = filterHelper.filterProducts(FilterType.Food, productsList)

        // Assert the filtered lists contain the expected number of items
        assertEquals(productsList.size, filteredListAll.size)
        assertEquals(1, filteredListDessert.size)
        assertEquals(2, filteredListDrinks.size)
        assertEquals(2, filteredListFood.size)

        // Assert the filtered lists contain the expected items
        assertEquals(productsList, filteredListAll)
        assertEquals(listOf(productsList[2]), filteredListDessert)
        assertEquals(listOf(productsList[1], productsList[4]), filteredListDrinks)
        assertEquals(listOf(productsList[0], productsList[3]), filteredListFood)
    }
}