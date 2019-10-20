package com.example.listviewicon.model

import com.example.listviewicon.R

object IconData {
        private val iconName = arrayOf(
            "Ruby",
            "Rails",
            "Python",
            "Java Script",
            "PHP"
        )

    private val detail = arrayOf(
        "Ruby is an open source and full object oriented programming languange",
        "Rails on rails is a server side web application development framwork written language",
        "Python is interpreted scripting and object oriented programming language",
        "Java Script is an object based scripting language",
        "PHP is an interpreted language i.e., there is no need for compilation"
    )
    private val iconPoster = intArrayOf(
        R.drawable.ic1,
        R.drawable.ic2,
        R.drawable.ic3,
        R.drawable.ic4,
        R.drawable.ic5
    )
    val listIcon: ArrayList<Icon>
        get() {
            val list = arrayListOf<Icon>()
            for (position in iconName.indices) {
                val icon = Icon()
                icon.name = iconName[position]
                icon.detail = detail[position]
                icon.poster = iconPoster[position]
                list.add(icon)
            }
            return list
        }
}