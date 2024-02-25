package com.myapp.navgraphdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.myapp.navgraphdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

//    private lateinit var notificationAdapter: Adapter

//    var page = 1
//    private var hasMore = false
//    private var isLoading = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
//
//    private fun init() {
//        initClickListener()
//        binding.llToolbarAuth.txtTitle.text = "Notification"
//
//        notificationAdapter = NotificationAdapter()
//        binding.rvNotification.adapter = notificationAdapter
//
//
//        binding.rvNotification.addOnScrollListener(object : com.android.opinion365.utility.EndlessPaginationScrollListener() {
//            override fun requestNewPage() {
//                super.requestNewPage()
//                if (!isLoading && hasMore) {
//                    page++
//                    getAPIData()
//                }
//            }
//        })
//        getAPIData()
//    }
//
//    private fun getAPIData() {
//        showProgress()
//        isLoading = true
//        homeViewModel.getNotificationHistory(page, AppConstant.limitSize)
//    }
//    private fun attachObserver() {
//        homeViewModel.notificationHistoryResponseLiveData.value = null
//        homeViewModel.notificationHistoryResponseLiveData.observe(this) {
//            it?.apply {
//                hideProgress()
//                if (this.isSuccess()) {
//                    isLoading = false
//
//                    hasMore = notificationResponse?.page!! < notificationResponse?.totalPages!!
//
//                    if (page == 1) {
//                        notificationAdapter.clear()
//                        if (notificationResponse?.findNotifications?.isNullOrEmpty() == true) {
//                            binding.tvNoDataFound.visible()
//                            binding.rvNotification.gone()
//                        } else {
//                            binding.rvNotification.visible()
//                            binding.tvNoDataFound.invisible()
//                        }
//                    }
//
//                    if (notificationResponse?.findNotifications?.isNullOrEmpty() == false) {
//                        notificationAdapter.addData(
//                            notificationResponse?.findNotifications!!
//                        )
//                    }
//                } else {
//                    toastError(this.message.toString())
//                }
//            }
//        }
//    }
}