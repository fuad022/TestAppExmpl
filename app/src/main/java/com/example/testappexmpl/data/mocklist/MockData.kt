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
        list.add(HomeVerticalRecyclerItemModel("Fitness and run clubs", getHomeGridList1(), "See all Fitness and run clubs"))
        list.add(HomeVerticalRecyclerItemModel("Healthy eating", getHomeGridList2(), "See all healthy eating "))
        return list
    }

    private fun getHomeGridList1(): List<HomeNestedGridRecyclerItemModel> {
        val list: ArrayList<HomeNestedGridRecyclerItemModel> = arrayListOf()
        list.add(HomeNestedGridRecyclerItemModel(R.drawable.vertical_img_1, "Beach run club","Run along with waves"))
        list.add(HomeNestedGridRecyclerItemModel(R.drawable.vertical_img_2, "Boarding","Skate around your local city"))
        list.add(HomeNestedGridRecyclerItemModel(R.drawable.vertical_img_3, "Climb","End of week climb headspace"))
        list.add(HomeNestedGridRecyclerItemModel(R.drawable.vertical_img_4, "Body","Train and breathe with Manal"))
        return list
    }

    private fun getHomeGridList2(): List<HomeNestedGridRecyclerItemModel> {
        val list: ArrayList<HomeNestedGridRecyclerItemModel> = arrayListOf()
        list.add(HomeNestedGridRecyclerItemModel(R.drawable.vertical_img_5, "Vegan café","Essential Vegan"))
        list.add(HomeNestedGridRecyclerItemModel(R.drawable.vertical_img_6, "Food and coffee","Kahalia Roden café"))
        list.add(HomeNestedGridRecyclerItemModel(R.drawable.vertical_img_7, "Asian cuisine","On the Bab"))
        list.add(HomeNestedGridRecyclerItemModel(R.drawable.vertical_img_8, "Lunch and dinner","Fresh café"))
        return list
    }


}