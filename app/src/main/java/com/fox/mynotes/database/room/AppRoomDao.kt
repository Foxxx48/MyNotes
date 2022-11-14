package com.fox.mynotes.database.room

import androidx.lifecycle.LiveData
import androidx.room.*
import com.fox.mynotes.models.AppNote

@Dao
interface AppRoomDao {
    @Query("SELECT * from table_notes")
    fun getAllNotes(): LiveData<List<AppNote>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(note: AppNote)

    @Delete
    suspend fun delete(note: AppNote)
}