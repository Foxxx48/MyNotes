package com.fox.mynotes.utilits

import com.fox.mynotes.MainActivity
import com.fox.mynotes.database.room.AppRoomRepository

lateinit var APP_ACTIVITY: MainActivity
lateinit var REPOSITORY: AppRoomRepository
const val TYPE_DATABASE = "type_database"
const val TYPE_ROOM = "type_room"