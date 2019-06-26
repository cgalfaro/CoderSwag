package com.example.coderswag.controller

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.coderswag.R
import com.example.coderswag.adapters.ProductsAdapter
import com.example.coderswag.services.DataService
import com.example.coderswag.utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter : ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)

        adapter = ProductsAdapter(this, DataService.getProducts(categoryType))

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spanCount = 3
        }

        val screenSize = resources.configuration.screenWidthDp
        if (screenSize > 720) {
            spanCount = 3
        }

        val layoutManager = GridLayoutManager(this, spanCount)
        productListView.layoutManager = layoutManager
        productListView.adapter = adapter
    }
}
