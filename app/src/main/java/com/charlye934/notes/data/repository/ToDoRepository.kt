package com.charlye934.notes.data.repository

import androidx.lifecycle.LiveData
import com.charlye934.notes.data.ToDoDao
import com.charlye934.notes.data.models.ToDoData

class ToDoRepository(private val toDoDao: ToDoDao) {

    val getAllData: LiveData<List<ToDoData>> = toDoDao.getAllData()

    suspend fun insertData(toDoData: ToDoData){
        toDoDao.insertData(toDoData)
    }
}