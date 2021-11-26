package com.example.testappexmpl.data.mocklist

import com.example.testappexmpl.R
import com.example.testappexmpl.data.model.*

object MockData {

    fun getHomeList(): List<HomeModel> {
        val list: ArrayList<HomeModel> = arrayListOf()
        list.add(HomeModel(R.drawable.horizontal_img_1, "People", "Fitness and run clubs", getHomeGridList1(), "See all Fitness and run clubs"))
        list.add(HomeModel(R.drawable.horizontal_img_2, "Places to eat", "Healthy eating", getHomeGridList2(), "See all healthy eating "))
        list.add(HomeModel(R.drawable.horizontal_img_3, "Yoga", null, null, null))
        return list
    }

    private fun getMembersImageList(): List<PostPageMembersModel> {
        val list: ArrayList<PostPageMembersModel> = arrayListOf()
        list.add(PostPageMembersModel(R.drawable.user_img_1))
        list.add(PostPageMembersModel(R.drawable.user_img_2))
        list.add(PostPageMembersModel(R.drawable.user_img_3))
        list.add(PostPageMembersModel(R.drawable.user_img_4))
        list.add(PostPageMembersModel(R.drawable.user_img_5))
        list.add(PostPageMembersModel(R.drawable.user_img_6))
        list.add(PostPageMembersModel(R.drawable.user_img_7))
        return list
    }

    private fun getPostPageGridImageList(): List<PostPageGridModel> {
        val list: ArrayList<PostPageGridModel> = arrayListOf()
        list.add(PostPageGridModel(R.drawable.grid_img_1))
        list.add(PostPageGridModel(R.drawable.grid_img_2))
        list.add(PostPageGridModel(R.drawable.grid_img_3))
        list.add(PostPageGridModel(R.drawable.grid_img_4))
        list.add(PostPageGridModel(R.drawable.horizontal_img_1))
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

    private fun getReviewList1(): List<PostPageReviewModel> {
        val list: ArrayList<PostPageReviewModel> = arrayListOf()
        val reviewCommentList = listOf(
            "Loved the class! Such beautiful land and collective impact infrastructure social entrepreneurship mass incarceration \uD83D\uDC4C",
            "Never run so well and it’s all thanks to Jordan. Silo framework overcome justice ideate, citizen-centered effective"
        )
        list.add(PostPageReviewModel(R.drawable.user_img_1, "Natascha Toros", reviewCommentList[0]))
        list.add(PostPageReviewModel(R.drawable.user_img_2, "Emilia Campfire", reviewCommentList[1]))
        return list
    }

    private fun getReviewList2(): List<PostPageReviewModel> {
        val list: ArrayList<PostPageReviewModel> = arrayListOf()
        val reviewCommentList = listOf(
            "Big up my running crew, they better not say running crew who! Commitment equal opportunity empower.",
            "So far, everything has going smooth & ease, but for one deal. I order a product from a China factory."
        )
        list.add(PostPageReviewModel(R.drawable.user_img_1, "Stefan Daily", reviewCommentList[0]))
        list.add(PostPageReviewModel(R.drawable.user_img_2, "Noelle Cummings", reviewCommentList[1]))
        return list
    }

    private fun getReviewList3(): List<PostPageReviewModel> {
        val list: ArrayList<PostPageReviewModel> = arrayListOf()
        val reviewCommentList = listOf(
            "Item was NOT as described and looks used. I request a refund or change product as described",
            "I send it TO CHINA, not locally as it was delivered. Cost more to send it than the value, so I kept item.  "
        )
        list.add(PostPageReviewModel(R.drawable.user_img_1, "Madeline Ball", reviewCommentList[0]))
        list.add(PostPageReviewModel(R.drawable.user_img_2, "Ida Shortle", reviewCommentList[1]))
        return list
    }

    private fun getReviewList4(): List<PostPageReviewModel> {
        val list: ArrayList<PostPageReviewModel> = arrayListOf()
        val reviewCommentList = listOf(
            "Refund to sender should be as delivered, not at seller convinience. Site in Aliexpress didn´t allows me",
            "If I pay less and wait longer for product because it´s from China, no problem."
        )
        list.add(PostPageReviewModel(R.drawable.user_img_1, "Bruno Stanley", reviewCommentList[0]))
        list.add(PostPageReviewModel(R.drawable.user_img_2, "Bob Rose", reviewCommentList[1]))
        return list
    }

    private fun getReviewList5(): List<PostPageReviewModel> {
        val list: ArrayList<PostPageReviewModel> = arrayListOf()
        val reviewCommentList = listOf(
            "I buy from ali express for years now usually there is always small problems which ccan be solved",
            "Aliexpress platform could be nice but the fact is around 25% of my orders are problematic."
        )
        list.add(PostPageReviewModel(R.drawable.user_img_1, "Harlan Flowers", reviewCommentList[0]))
        list.add(PostPageReviewModel(R.drawable.user_img_2, "Sybil Poe", reviewCommentList[1]))
        return list
    }

    private fun getReviewList6(): List<PostPageReviewModel> {
        val list: ArrayList<PostPageReviewModel> = arrayListOf()
        val reviewCommentList = listOf(
            "Some of the sellers try to trick you into stealing your money pretending they have sent the item out.",
            "If you pay through PPal(which I recommend) they will freeze the orders straight away leaving you"
        )
        list.add(PostPageReviewModel(R.drawable.user_img_1, "Troy Badman", reviewCommentList[0]))
        list.add(PostPageReviewModel(R.drawable.user_img_2, "Wade Hubbard", reviewCommentList[1]))
        return list
    }

    private fun getReviewList7(): List<PostPageReviewModel> {
        val list: ArrayList<PostPageReviewModel> = arrayListOf()
        val reviewCommentList = listOf(
            "Chinese customer services will not match with western business practises.Leaving negative feedback is practical here",
            "We can learn from our mistakes to improve our services but not in \"there\" which can impact their business in their theory."
        )
        list.add(PostPageReviewModel(R.drawable.user_img_1, "Nina Carline", reviewCommentList[0]))
        list.add(PostPageReviewModel(R.drawable.user_img_2, "Margot Holland", reviewCommentList[1]))
        return list
    }

    private fun getReviewList8(): List<PostPageReviewModel> {
        val list: ArrayList<PostPageReviewModel> = arrayListOf()
        val reviewCommentList = listOf(
            "I ordered some items from them and paid extra to have them delivered within 7 to 15 days.",
            "It took 31 days to be delivered, even though I'm only in Vietnam. If a customer pays extra to have items delivered within a certain time"
        )
        list.add(PostPageReviewModel(R.drawable.user_img_1, "Salena Andrews", reviewCommentList[0]))
        list.add(PostPageReviewModel(R.drawable.user_img_2, "Pandora Elliott", reviewCommentList[1]))
        return list
    }

    // Notifications
    /*fun getNotificationsList(): List<NotificationsModel> {
        val list: ArrayList<NotificationsModel> = arrayListOf()
        list.add(NotificationsModel(R.drawable.user_img_3, "Olivia Sweyne was at Vegan essential in Shoreditch", true))
        list.add(NotificationsModel(R.drawable.user_img_6, "Miranda Hollister like The Natrual Vegan shop near you",true))
        list.add(NotificationsModel(R.drawable.user_img_12, "Tim Hendrix liked a location you were at recently",true))
        list.add(NotificationsModel(R.drawable.user_img_8, "Abigal Gates is going to Nike run club with 80 others",false))
        list.add(NotificationsModel(R.drawable.user_img_9, "Natascha toros wants to invite you to go to thier yoga class",false))
        list.add(NotificationsModel(R.drawable.user_img_10, "Olivia Sweyne was at Vegan essential in Shoreditch",false))
        list.add(NotificationsModel(R.drawable.user_img_11, "Miranda Hollister like The Natrual Vegan shop near you",false))
        list.add(NotificationsModel(R.drawable.user_img_12, "Tim Hendrix liked a location you were at recently",false))
        return list
    }*/

    fun getNotifFollowigList(): List<NotificationsModel> {
        val list: ArrayList<NotificationsModel> = arrayListOf()
        list.add(NotificationsModel(R.drawable.user_img_3, "Olivia Sweyne was at Vegan essential in Shoreditch"))
        list.add(NotificationsModel(R.drawable.user_img_6, "Miranda Hollister like The Natrual Vegan shop near you"))
        list.add(NotificationsModel(R.drawable.user_img_12, "Tim Hendrix liked a location you were at recently"))
        return list
    }

    fun getNotifYouList(): List<NotificationsModel> {
        val list: ArrayList<NotificationsModel> = arrayListOf()
        list.add(NotificationsModel(R.drawable.user_img_8, "Abigal Gates is going to Nike run club with 80 others"))
        list.add(NotificationsModel(R.drawable.user_img_9, "Natascha toros wants to invite you to go to thier yoga class"))
        list.add(NotificationsModel(R.drawable.user_img_10, "Olivia Sweyne was at Vegan essential in Shoreditch"))
        list.add(NotificationsModel(R.drawable.user_img_11, "Miranda Hollister like The Natrual Vegan shop near you"))
        list.add(NotificationsModel(R.drawable.user_img_12, "Tim Hendrix liked a location you were at recently"))
        return list
    }

    //Profile
    fun getProfileList(): List<ProfileMainRVModel> {
        val list: ArrayList<ProfileMainRVModel> = arrayListOf()
        list.add(ProfileMainRVModel("Going to", getNestedItemList1()))
        list.add(ProfileMainRVModel("Recent experiences", getNestedItemList2()))
        return list
    }

    private fun getNestedItemList1(): List<ProfileNestedRVModel> {
        val list: ArrayList<ProfileNestedRVModel> = arrayListOf()
        list.add(ProfileNestedRVModel(R.drawable.user_img_13, "Joe's yoga", "Agile catalyze but scalable innovate silo.", "Yoga"))
        list.add(ProfileNestedRVModel(R.drawable.grid_img_1, "Between the lines", "Scale and impact shared unit.", "Running club"))
        return list
    }

//    private fun getNestedItemList1(): List<ProfileNestedRecyclerItemModel> {
//        val list: ArrayList<ProfileNestedRecyclerItemModel> = arrayListOf()
//        list.add(ProfileNestedRecyclerItemModel(R.drawable.user_img_13, "Joe's yoga", "Agile catalyze but scalable innovate silo.", "Yoga"))
//        return list
//    }

    private fun getNestedItemList2(): List<ProfileNestedRVModel> {
        val list: ArrayList<ProfileNestedRVModel> = arrayListOf()
        list.add(ProfileNestedRVModel(R.drawable.grid_img_2, "Vegan health", "Analysis society global rubric think tank ideate.", "Vegan"))
        list.add(ProfileNestedRVModel(R.drawable.grid_img_3, "Swordfish", "Overcome save the world changemaker.", "Swimming club"))
        return list
    }
}














