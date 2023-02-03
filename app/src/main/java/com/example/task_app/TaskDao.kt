package com.example.task_app

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface TaskDao {
    @Insert
    fun insert(task: Task)
    @Update
    fun update(task: Task)
    @Delete
    fun delete(task: Task)
    @Query("SELECT * FROM task_table WHERE taskId = :taskId")
    fun get(taskId: Long) : LiveData<Task>
    @Query("SELECT * FROM task_table ORDER BBY taskId DESC")
    fun getAll(): LiveData<List<Task>>
}