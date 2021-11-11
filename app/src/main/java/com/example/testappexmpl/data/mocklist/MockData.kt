package com.example.testappexmpl.data.mocklist

import com.example.testappexmpl.R
import com.example.testappexmpl.data.model.*

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

    private fun getMembersImageList(): List<PostPageHorizontalRecyclerItemModel> {
        val list: ArrayList<PostPageHorizontalRecyclerItemModel> = arrayListOf()
        list.add(PostPageHorizontalRecyclerItemModel(R.drawable.user_img_1))
        list.add(PostPageHorizontalRecyclerItemModel(R.drawable.user_img_2))
        list.add(PostPageHorizontalRecyclerItemModel(R.drawable.user_img_3))
        list.add(PostPageHorizontalRecyclerItemModel(R.drawable.user_img_4))
        list.add(PostPageHorizontalRecyclerItemModel(R.drawable.user_img_5))
        list.add(PostPageHorizontalRecyclerItemModel(R.drawable.user_img_6))
        list.add(PostPageHorizontalRecyclerItemModel(R.drawable.user_img_7))
        return list
    }

    private fun getPostPageGridImageList(): List<PostPageGridRecyclerItemModel> {
        val list: ArrayList<PostPageGridRecyclerItemModel> = arrayListOf()
        list.add(PostPageGridRecyclerItemModel(R.drawable.grid_img_1))
        list.add(PostPageGridRecyclerItemModel(R.drawable.grid_img_2))
        list.add(PostPageGridRecyclerItemModel(R.drawable.grid_img_3))
        list.add(PostPageGridRecyclerItemModel(R.drawable.grid_img_4))
        return list
    }

    private fun getHomeGridList1(): List<PostPageModel> {
        val list: ArrayList<PostPageModel> = arrayListOf()
        list.add(
            PostPageModel(
                R.drawable.vertical_img_1,
                "Beach run club",
                "Run along with waves",
                getMembersImageList(),
                getMembersImageList().size - 5,
                getPostPageGridImageList(),
                getPostPageGridImageList().size - 3,
                getReviewList1()
            )
        )
        list.add(
            PostPageModel(
                R.drawable.vertical_img_2,
                "Boarding",
                "Skate around your local city",
                getMembersImageList(),
                getMembersImageList().size - 5,
                getPostPageGridImageList(),
                getPostPageGridImageList().size - 3,
                getReviewList2()
            )
        )
        list.add(
            PostPageModel(
                R.drawable.vertical_img_3,
                "Climb",
                "End of week climb headspace",
                getMembersImageList(),
                getMembersImageList().size - 5,
                getPostPageGridImageList(),
                getPostPageGridImageList().size - 3,
                getReviewList3()
            )
        )
        list.add(
            PostPageModel(
                R.drawable.vertical_img_4,
                "Body",
                "Train and breathe with Manal",
                getMembersImageList(),
                getMembersImageList().size - 5,
                getPostPageGridImageList(),
                getPostPageGridImageList().size - 3,
                getReviewList4()
            )
        )
        return list
    }

    private fun getHomeGridList2(): List<PostPageModel> {
        val list: ArrayList<PostPageModel> = arrayListOf()

        list.add(
            PostPageModel(
                R.drawable.vertical_img_5,
                "Vegan café",
                "Essential Vegan",
                getMembersImageList(),
                getMembersImageList().size - 5,
                getPostPageGridImageList(),
                getPostPageGridImageList().size - 3,
                getReviewList5()
            )
        )
        list.add(
            PostPageModel(
                R.drawable.vertical_img_6,
                "Food and coffee",
                "Kahalia Roden café",
                getMembersImageList(),
                getMembersImageList().size - 5,
                getPostPageGridImageList(),
                getPostPageGridImageList().size - 3,
                getReviewList6()
            )
        )
        list.add(
            PostPageModel(
                R.drawable.vertical_img_7,
                "Asian cuisine",
                "On the Bab",
                getMembersImageList(),
                getMembersImageList().size - 5,
                getPostPageGridImageList(),
                getPostPageGridImageList().size - 3,
                getReviewList7()
            )
        )
        list.add(
            PostPageModel(
                R.drawable.vertical_img_8,
                "Lunch and dinner",
                "Fresh café",
                getMembersImageList(),
                getMembersImageList().size - 5,
                getPostPageGridImageList(),
                getPostPageGridImageList().size - 3,
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
        list.add(PostPageReviewItemModel(R.drawable.user_img_1, "Natascha Toros", reviewCommentList[0]))
        list.add(PostPageReviewItemModel(R.drawable.user_img_2, "Emilia Campfire", reviewCommentList[1]))
        return list
    }

    private fun getReviewList2(): List<PostPageReviewItemModel> {
        val list: ArrayList<PostPageReviewItemModel> = arrayListOf()
        val reviewCommentList = listOf(
            "infrastructure social",
            "entrepreneurship mass incarceration"
        )
        list.add(PostPageReviewItemModel(R.drawable.user_img_1, "Stefan Daily", reviewCommentList[0]))
        list.add(PostPageReviewItemModel(R.drawable.user_img_2, "Noelle Cummings", reviewCommentList[1]))
        return list
    }

    private fun getReviewList3(): List<PostPageReviewItemModel> {
        val list: ArrayList<PostPageReviewItemModel> = arrayListOf()
        val reviewCommentList = listOf(
            "Never run so well and",
            "it’s all thanks to Jordan."
        )
        list.add(PostPageReviewItemModel(R.drawable.user_img_1, "Madeline Ball", reviewCommentList[0]))
        list.add(PostPageReviewItemModel(R.drawable.user_img_2, "Ida Shortle", reviewCommentList[1]))
        return list
    }

    private fun getReviewList4(): List<PostPageReviewItemModel> {
        val list: ArrayList<PostPageReviewItemModel> = arrayListOf()
        val reviewCommentList = listOf(
            "Silo framework overcome",
            "justice ideate"
        )
        list.add(PostPageReviewItemModel(R.drawable.user_img_1, "Bruno Stanley", reviewCommentList[0]))
        list.add(PostPageReviewItemModel(R.drawable.user_img_2, "Bob Rose", reviewCommentList[1]))
        return list
    }

    private fun getReviewList5(): List<PostPageReviewItemModel> {
        val list: ArrayList<PostPageReviewItemModel> = arrayListOf()
        val reviewCommentList = listOf(
            "citizen-centered effective",
            "Big up my running crew"
        )
        list.add(PostPageReviewItemModel(R.drawable.user_img_1, "Harlan Flowers", reviewCommentList[0]))
        list.add(PostPageReviewItemModel(R.drawable.user_img_2, "Sybil Poe", reviewCommentList[1]))
        return list
    }

    private fun getReviewList6(): List<PostPageReviewItemModel> {
        val list: ArrayList<PostPageReviewItemModel> = arrayListOf()
        val reviewCommentList = listOf(
            "they better not say",
            "running crew who!"
        )
        list.add(PostPageReviewItemModel(R.drawable.user_img_1, "Troy Badman", reviewCommentList[0]))
        list.add(PostPageReviewItemModel(R.drawable.user_img_2, "Wade Hubbard", reviewCommentList[1]))
        return list
    }

    private fun getReviewList7(): List<PostPageReviewItemModel> {
        val list: ArrayList<PostPageReviewItemModel> = arrayListOf()
        val reviewCommentList = listOf(
            "Commitment equal",
            "opportunity empower."
        )
        list.add(PostPageReviewItemModel(R.drawable.user_img_1, "Nina Carline", reviewCommentList[0]))
        list.add(PostPageReviewItemModel(R.drawable.user_img_2, "Margot Holland", reviewCommentList[1]))
        return list
    }

    private fun getReviewList8(): List<PostPageReviewItemModel> {
        val list: ArrayList<PostPageReviewItemModel> = arrayListOf()
        val reviewCommentList = listOf(
            "First name means: Christmas child.",
            "Feel free to use any of the names"
        )
        list.add(PostPageReviewItemModel(R.drawable.user_img_1, "Salena Andrews", reviewCommentList[0]))
        list.add(PostPageReviewItemModel(R.drawable.user_img_2, "Pandora Elliott", reviewCommentList[1]))
        return list
    }

    // Notifications
    fun getNotifFollowigList(): List<NotificationsRecycleItemModel> {
        val list: ArrayList<NotificationsRecycleItemModel> = arrayListOf()
        list.add(NotificationsRecycleItemModel(R.drawable.user_img_3, "Olivia Sweyne was at Vegan essential in Shoreditch"))
        list.add(NotificationsRecycleItemModel(R.drawable.user_img_6, "Miranda Hollister like The Natrual Vegan shop near you"))
        list.add(NotificationsRecycleItemModel(R.drawable.user_img_12, "Tim Hendrix liked a location you were at recently"))
        return list
    }

    fun getNotifYouList(): List<NotificationsRecycleItemModel> {
        val list: ArrayList<NotificationsRecycleItemModel> = arrayListOf()
        list.add(NotificationsRecycleItemModel(R.drawable.user_img_8, "Abigal Gates is going to Nike run club with 80 others"))
        list.add(NotificationsRecycleItemModel(R.drawable.user_img_9, "Natascha toros wants to invite you to go to thier yoga class"))
        list.add(NotificationsRecycleItemModel(R.drawable.user_img_10, "Olivia Sweyne was at Vegan essential in Shoreditch"))
        list.add(NotificationsRecycleItemModel(R.drawable.user_img_11, "Miranda Hollister like The Natrual Vegan shop near you"))
        list.add(NotificationsRecycleItemModel(R.drawable.user_img_12, "Tim Hendrix liked a location you were at recently"))
        return list
    }

    //Profile
    fun getProfileList(): List<ProfileMainRecyclerItemModel> {
        val list: ArrayList<ProfileMainRecyclerItemModel> = arrayListOf()
        list.add(ProfileMainRecyclerItemModel("Going to", getNestedItemList1()))
        list.add(ProfileMainRecyclerItemModel("Recent experiences", getNestedItemList2()))
        return list
    }

    private fun getNestedItemList1(): List<ProfileNestedRecyclerItemModel> {
        val list: ArrayList<ProfileNestedRecyclerItemModel> = arrayListOf()
        list.add(ProfileNestedRecyclerItemModel(R.drawable.user_img_13, "Joe's yoga", "Agile catalyze but scalable innovate silo.", "Yoga"))
        list.add(ProfileNestedRecyclerItemModel(R.drawable.grid_img_1, "Between the lines", "Scale and impact shared unit.", "Running club"))
        return list
    }

    private fun getNestedItemList2(): List<ProfileNestedRecyclerItemModel> {
        val list: ArrayList<ProfileNestedRecyclerItemModel> = arrayListOf()
        list.add(ProfileNestedRecyclerItemModel(R.drawable.grid_img_2, "Vegan health", "Analysis society global rubric think tank ideate.", "Vegan"))
        list.add(ProfileNestedRecyclerItemModel(R.drawable.grid_img_3, "Swordfish", "Overcome save the world changemaker.", "Swimming club"))
        return list
    }
}














