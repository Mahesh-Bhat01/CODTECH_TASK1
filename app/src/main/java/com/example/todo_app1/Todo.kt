package com.example.todo_app1

import android.service.quicksettings.Tile
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.Instant
import java.util.Date

@Entity
data class Todo(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var title: String,
    var createdAt: Date
)

