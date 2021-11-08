package com.example.testappexmpl.data.mocklist

import com.example.testappexmpl.R
import com.example.testappexmpl.data.model.HomeHorizontalRecyclerItemModel
import com.example.testappexmpl.data.model.HomeNestedGridRecyclerItemModel
import com.example.testappexmpl.data.model.HomeVerticalRecyclerItemModel
import com.example.testappexmpl.data.model.PostPageReviewItemModel

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
        list.add(
            HomeVerticalRecyclerItemModel(
                "Fitness and run clubs",
                getHomeGridList1(),
                "See all Fitness and run clubs"
            )
        )
        list.add(
            HomeVerticalRecyclerItemModel(
                "Healthy eating",
                getHomeGridList2(),
                "See all healthy eating "
            )
        )
        return list
    }

    private fun getHomeGridList1(): List<HomeNestedGridRecyclerItemModel> {
        val list: ArrayList<HomeNestedGridRecyclerItemModel> = arrayListOf()
        val membersImageList = listOf(
            R.drawable.user_img_1,
            R.drawable.user_img_2,
            R.drawable.user_img_3,
            R.drawable.user_img_4,
            R.drawable.user_img_5,
            R.drawable.user_img_6,
            R.drawable.user_img_7,
        )
        val postPageGridImageList = listOf(
            R.drawable.grid_img_1,
            R.drawable.grid_img_2,
            R.drawable.grid_img_3,
            R.drawable.grid_img_4
        )
        list.add(
            HomeNestedGridRecyclerItemModel(
                R.drawable.vertical_img_1,
                "Beach run club",
                "Run along with waves",
                membersImageList,
                membersImageList.size - 5,
                postPageGridImageList,
                postPageGridImageList.size - 3,
                getReviewList1()
            )
        )
        list.add(
            HomeNestedGridRecyclerItemModel(
                R.drawable.vertical_img_2,
                "Boarding",
                "Skate around your local city",
                membersImageList,
                membersImageList.size - 5,
                postPageGridImageList,
                postPageGridImageList.size - 3,
                getReviewList2()
            )
        )
        list.add(
            HomeNestedGridRecyclerItemModel(
                R.drawable.vertical_img_3,
                "Climb",
                "End of week climb headspace",
                membersImageList,
                membersImageList.size - 5,
                postPageGridImageList,
                postPageGridImageList.size - 3,
                getReviewList3()
            )
        )
        list.add(
            HomeNestedGridRecyclerItemModel(
                R.drawable.vertical_img_4,
                "Body",
                "Train and breathe with Manal",
                membersImageList,
                membersImageList.size - 5,
                postPageGridImageList,
                postPageGridImageList.size - 3,
                getReviewList4()
            )
        )
        return list
    }

    private fun getHomeGridList2(): List<HomeNestedGridRecyclerItemModel> {
        val list: ArrayList<HomeNestedGridRecyclerItemModel> = arrayListOf()
        val membersImageList = listOf(
            R.drawable.user_img_1,
            R.drawable.user_img_2,
            R.drawable.user_img_3,
            R.drawable.user_img_4,
            R.drawable.user_img_5,
            R.drawable.user_img_6,
            R.drawable.user_img_7,
        )
        val postPageGridImageList = listOf(
            R.drawable.grid_img_1,
            R.drawable.grid_img_2,
            R.drawable.grid_img_3,
            R.drawable.grid_img_4
        )
        list.add(
            HomeNestedGridRecyclerItemModel(
                R.drawable.vertical_img_5,
                "Vegan café",
                "Essential Vegan",
                membersImageList,
                membersImageList.size - 5,
                postPageGridImageList,
                postPageGridImageList.size - 3,
                getReviewList5()
            )
        )
        list.add(
            HomeNestedGridRecyclerItemModel(
                R.drawable.vertical_img_6,
                "Food and coffee",
                "Kahalia Roden café",
                membersImageList,
                membersImageList.size - 5,
                postPageGridImageList,
                postPageGridImageList.size - 3,
                getReviewList6()
            )
        )
        list.add(
            HomeNestedGridRecyclerItemModel(
                R.drawable.vertical_img_7,
                "Asian cuisine",
                "On the Bab",
                membersImageList,
                membersImageList.size - 5,
                postPageGridImageList,
                postPageGridImageList.size - 3,
                getReviewList7()
            )
        )
        list.add(
            HomeNestedGridRecyclerItemModel(
                R.drawable.vertical_img_8,
                "Lunch and dinner",
                "Fresh café",
                membersImageList,
                membersImageList.size - 5,
                postPageGridImageList,
                postPageGridImageList.size - 3,
                getReviewList8()
            )
        )
        return list
    }

    private fun getReviewList1(): List<PostPageReviewItemModel> {
        val list: ArrayList<PostPageReviewItemModel> = arrayListOf()
        val reviewCommentList = listOf(
            "Loved the class! Such beautiful",
            "land and collective impact"
        )
        list.add(
            PostPageReviewItemModel(
                R.drawable.user_img_1,
                "Natascha Toros",
                reviewCommentList[0]
            )
        )
        list.add(
            PostPageReviewItemModel(
                R.drawable.user_img_2,
                "Emilia Campfire",
                reviewCommentList[1]
            )
        )
        return list
    }

    private fun getReviewList2(): List<PostPageReviewItemModel> {
        val list: ArrayList<PostPageReviewItemModel> = arrayListOf()
        val reviewCommentList = listOf(
            "infrastructure social",
            "entrepreneurship mass incarceration"
        )
        list.add(
            PostPageReviewItemModel(
                R.drawable.user_img_1,
                "Stefan Daily",
                reviewCommentList[0]
            )
        )
        list.add(
            PostPageReviewItemModel(
                R.drawable.user_img_2,
                "Noelle Cummings",
                reviewCommentList[1]
            )
        )
        return list
    }

    private fun getReviewList3(): List<PostPageReviewItemModel> {
        val list: ArrayList<PostPageReviewItemModel> = arrayListOf()
        val reviewCommentList = listOf(
            "Never run so well and",
            "it’s all thanks to Jordan."
        )
        list.add(
            PostPageReviewItemModel(
                R.drawable.user_img_1,
                "Madeline Ball",
                reviewCommentList[0]
            )
        )
        list.add(
            PostPageReviewItemModel(
                R.drawable.user_img_2,
                "Ida Shortle",
                reviewCommentList[1]
            )
        )
        return list
    }

    private fun getReviewList4(): List<PostPageReviewItemModel> {
        val list: ArrayList<PostPageReviewItemModel> = arrayListOf()
        val reviewCommentList = listOf(
            "Silo framework overcome",
            "justice ideate"
        )
        list.add(
            PostPageReviewItemModel(
                R.drawable.user_img_1,
                "Bruno Stanley",
                reviewCommentList[0]
            )
        )
        list.add(PostPageReviewItemModel(R.drawable.user_img_2, "Bob Rose", reviewCommentList[1]))
        return list
    }

    private fun getReviewList5(): List<PostPageReviewItemModel> {
        val list: ArrayList<PostPageReviewItemModel> = arrayListOf()
        val reviewCommentList = listOf(
            "citizen-centered effective",
            "Big up my running crew"
        )
        list.add(
            PostPageReviewItemModel(
                R.drawable.user_img_1,
                "Harlan Flowers",
                reviewCommentList[0]
            )
        )
        list.add(PostPageReviewItemModel(R.drawable.user_img_2, "Sybil Poe", reviewCommentList[1]))
        return list
    }

    private fun getReviewList6(): List<PostPageReviewItemModel> {
        val list: ArrayList<PostPageReviewItemModel> = arrayListOf()
        val reviewCommentList = listOf(
            "they better not say",
            "running crew who!"
        )
        list.add(
            PostPageReviewItemModel(
                R.drawable.user_img_1,
                "Troy Badman",
                reviewCommentList[0]
            )
        )
        list.add(
            PostPageReviewItemModel(
                R.drawable.user_img_2,
                "Wade Hubbard",
                reviewCommentList[1]
            )
        )
        return list
    }

    private fun getReviewList7(): List<PostPageReviewItemModel> {
        val list: ArrayList<PostPageReviewItemModel> = arrayListOf()
        val reviewCommentList = listOf(
            "Commitment equal",
            "opportunity empower."
        )
        list.add(
            PostPageReviewItemModel(
                R.drawable.user_img_1,
                "Nina Carline",
                reviewCommentList[0]
            )
        )
        list.add(
            PostPageReviewItemModel(
                R.drawable.user_img_2,
                "Margot Holland",
                reviewCommentList[1]
            )
        )
        return list
    }

    private fun getReviewList8(): List<PostPageReviewItemModel> {
        val list: ArrayList<PostPageReviewItemModel> = arrayListOf()
        val reviewCommentList = listOf(
            "First name means: Christmas child.",
            "Feel free to use any of the names"
        )
        list.add(
            PostPageReviewItemModel(
                R.drawable.user_img_1,
                "Salena Andrews",
                reviewCommentList[0]
            )
        )
        list.add(
            PostPageReviewItemModel(
                R.drawable.user_img_2,
                "Pandora Elliott",
                reviewCommentList[1]
            )
        )
        return list
    }


}














