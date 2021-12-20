package com.example.daytonaproject.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [SaveEntity::class],version = 1)
abstract class SaveDatabase : RoomDatabase(){

    abstract fun getSaveDao(): SaveDao

    companion object{
        private var instance: SaveDatabase? = null

        fun getLoginDatabase(context: Context) : SaveDatabase{
            if (instance != null){
                return instance!!
            }else{
                    val builder = Room.databaseBuilder(
                        context.applicationContext,
                        SaveDatabase::class.java,
                        "save_Table"
                    )
                builder.fallbackToDestructiveMigration()
                instance = builder.build()
            }
            return instance!!
        }
    }
}