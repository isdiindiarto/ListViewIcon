package com.example.listviewicon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listviewicon.Adapter.ListIconAdapter
import com.example.listviewicon.model.Icon
import com.example.listviewicon.model.IconData
import com.example.listviewicon.R.id.rv_icon
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var rvIcon: RecyclerView
    private var list: ArrayList<Icon> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvIcon = this.findViewById(R.id.rv_icon)
        rvIcon.setHasFixedSize(true)
        list.addAll(IconData.listIcon)
        showIconList()
    }

    private fun showIconList() {
        rvIcon.layoutManager = LinearLayoutManager(this)
        val listIconAdapter = ListIconAdapter(list)
        rvIcon.adapter = listIconAdapter
    }

}
