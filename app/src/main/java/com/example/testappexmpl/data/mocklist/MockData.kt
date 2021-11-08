package com.example.testappexmpl.data.mocklist

import com.example.testappexmpl.R
import com.example.testappexmpl.data.model.HomeHorizontalRecyclerItemModel

object MockData {

    fun getHomeHorizontalList(): List<HomeHorizontalRecyclerItemModel> {
        val list: ArrayList<HomeHorizontalRecyclerItemModel> = arrayListOf()
        list.add(HomeHorizontalRecyclerItemModel(R.drawable.horizontal_img_1, "People"))
        list.add(HomeHorizontalRecyclerItemModel(R.drawable.horizontal_img_2, "Places to eat"))
        list.add(HomeHorizontalRecyclerItemModel(R.drawable.horizontal_img_3, "Yoga"))
        return list
    }



}