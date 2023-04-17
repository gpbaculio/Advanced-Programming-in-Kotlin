package com.littlelemon.menu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class ProductActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val title = intent.getStringExtra(ProductActivity.KEY_TITLE) ?: ""
        val price = intent.getDoubleExtra(ProductActivity.KEY_PRICE, 0.0)
        val category = intent.getStringExtra(ProductActivity.KEY_CATEGORY)  ?: ""
        val image = intent.getIntExtra(ProductActivity.KEY_IMAGE, -1)

        // Create a ProductItem object from the retrieved data
        val productItem =
            ProductItem(title, price, category, image)//todo replace with the passed values from intent
        setContent { ProductDetails(productItem) }
    }
    companion object {
        const val KEY_TITLE = "title"
        const val KEY_PRICE = "price"
        const val KEY_IMAGE = "image"
        const val KEY_CATEGORY = "category"
    }
}