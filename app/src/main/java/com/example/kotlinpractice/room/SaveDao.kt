package com.example.daytonaproject.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface SaveDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun register(saveEntity: SaveEntity)

    @Query( "select * from save_Table where name = :name and password = :password")
    fun getUser(name: String, password: String) : SaveEntity


}