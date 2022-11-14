package com.fox.mynotes.screens.start

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.fox.mynotes.database.room.AppRoomDatabase
import com.fox.mynotes.database.room.AppRoomRepository
import com.fox.mynotes.utilits.REPOSITORY
import com.fox.mynotes.utilits.TYPE_ROOM

class StartFragmentViewModel(application: Application): AndroidViewModel(application) {
    private val mContext = application

    fun initDatabase(type: String, onSuccess: () -> Unit) {
        when(type) {
            TYPE_ROOM -> {
                val dao = AppRoomDatabase.getInstance(mContext).getAppRoomDao()
                REPOSITORY = AppRoomRepository(dao)
                onSuccess()
            }
        }
    }
}