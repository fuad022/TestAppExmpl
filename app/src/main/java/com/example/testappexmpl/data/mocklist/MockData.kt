package com.example.testappexmpl.data.mocklist

import com.example.testappexmpl.R
import com.example.testappexmpl.data.model.HomeHorizontalRecyclerItemModel
import com.example.testappexmpl.data.model.HomeNestedGridRecyclerItemModel
import com.example.testappexmpl.data.model.HomeVerticalRecyclerItemModel

object MockData {

    fun getHomeHorizontalList(): List<HomeHorizontalRecyclerItemModel> {
        val list: ArrayList<HomeHorizontalRecyclerItemModel> = arrayListOf()
        list.add(HomeHorizontalRecyclerItemModel(R.drawable.horizontal_img_1, "People"))
        list.add(HomeHorizontalRecyclerItemModel(R.drawable.horizontal_img_2, "Places to eat"))
        list.add(HomeHorizontalRecyclerItemModel(R.drawable.horizontal_img_3, "Yoga"))
        return list
    }

    fun getHomeVerticalList(): List<HomeVerticalRecyclerItemModel> {
        val list: ArrayList<HomeVerticalRecyclerItemModel> = arrayListOf()
        list.add(HomeVerticalRecyclerItemModel("Child", getHomeGridList1(), "Quickly stabilize your baby’s emotions"))
        list.add(HomeVerticalRecyclerItemModel("Nature", getHomeGridList2(), "Quickly stabilize your baby’s emotions"))
        return list
    }

    private fun getHomeGridList1(): List<HomeNestedGridRecyclerItemModel> {
        val list: ArrayList<HomeNestedGridRecyclerItemModel> = arrayListOf()
        list.add(HomeNestedGridRecyclerItemModel(1, "Female voice",""))
        list.add(HomeNestedGridRecyclerItemModel(2, "Female voice",""))
        list.add(HomeNestedGridRecyclerItemModel(3, "Female voice",""))
        list.add(HomeNestedGridRecyclerItemModel(4, "Female voice",""))
        return list
    }

    private fun getHomeGridList2(): List<HomeNestedGridRecyclerItemModel> {
        val list: ArrayList<HomeNestedGridRecyclerItemModel> = arrayListOf()
        list.add(HomeNestedGridRecyclerItemModel(5, "Female voice",""))
        list.add(HomeNestedGridRecyclerItemModel(6, "Female voice",""))
        list.add(HomeNestedGridRecyclerItemModel(7, "Female voice",""))
        list.add(HomeNestedGridRecyclerItemModel(8, "Female voice",""))
        return list
    }


}