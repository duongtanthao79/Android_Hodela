package com.example.administrator.facebooklogin

import android.content.ClipData
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import kotlinx.android.synthetic.main.list_item.view.*

class ListViewAdapter(val context: Context, val items: ArrayList<ListObject>) : BaseAdapter() {
//    , val listener: (ClipData.Item) -> Unit

    override fun getCount(): Int {
        return items.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
//        val rowView = inflater.inflate(R.layout.list_item, parent, false)
        val rowView = LayoutInflater.from(parent?.context).inflate(R.layout.list_item, parent,false)
        rowView.txtView.setText(items[position].title)
        rowView.txtView1.setText(items[position].url)
        return rowView
    }

    override fun getItem(position: Int): Any {
        var any = Any()
        return any
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
}