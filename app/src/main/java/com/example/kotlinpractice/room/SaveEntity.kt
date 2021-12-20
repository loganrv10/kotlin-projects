package com.example.daytonaproject.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "save_Table")
data class SaveEntity(
    @ColumnInfo(name = "name")var name: String,
    @ColumnInfo(name = "Place")var place :String,
    @ColumnInfo(name = "age")var age: Int,
    @ColumnInfo(name = "Password")var Password: String
){
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") var id : Int = 0

}