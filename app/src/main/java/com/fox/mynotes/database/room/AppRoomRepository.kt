package com.fox.mynotes.database.room

import androidx.lifecycle.LiveData
import com.fox.mynotes.database.DatabaseRepository
import com.fox.mynotes.models.AppNote

class AppRoomRepository(private val appRoomDao: AppRoomDao): DatabaseRepository {

    override val allNotes: LiveData<List<AppNote>>
        get() = appRoomDao.getAllNotes()

    override suspend fun insert(note: AppNote, onSuccess: () -> UInt) {
        appRoomDao.insert(note)
    }

    override suspend fun delete(note: AppNote, onSuccess: () -> UInt) {
        appRoomDao.delete(note)
    }


}