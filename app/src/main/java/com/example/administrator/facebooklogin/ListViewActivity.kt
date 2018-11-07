package com.example.administrator.facebooklogin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_list_view.*

class ListViewActivity : AppCompatActivity() {

    val a : () -> Int = {
        10
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)
        initListView()
        }


    fun initListView() {
        var listItems = arrayOf("abc", "xyz")
        val row1 = ListObject("hello", "Google.com/url1")
        val row2 = ListObject("hello2", "Google.com/url2")

        var listItemsObject = arrayListOf<ListObject>(row1, row2)

//        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems)
        val adapter = ListViewAdapter(this,listItemsObject)
        list_view.adapter = adapter
    }

}
