package com.fox.mynotes.database

import androidx.lifecycle.LiveData
import com.fox.mynotes.models.AppNote

interface DatabaseRepository {
    val allNotes: LiveData<List<AppNote>>
    suspend fun insert(note:AppNote, onSuccess: () -> UInt)
    suspend fun delete(note:AppNote, onSuccess: () -> UInt)
}