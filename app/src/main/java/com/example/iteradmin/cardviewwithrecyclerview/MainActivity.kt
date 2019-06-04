package com.example.iteradmin.cardviewwithrecyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recycleListView = findViewById<RecyclerView>(R.id.recyclerview)
        val lm:RecyclerView.LayoutManager=LinearLayoutManager(this)
        recyclerview.layoutManager = lm
        val data = arrayOf(
                card("one","two","three"),
                card("xyz","abc","mno")
        )
        recyclerview.adapter = MyAdapter(this)
    }
}
