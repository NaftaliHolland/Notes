package com.naftaliholland.notes.domain.model

import androidx.compose.ui.graphics.Color
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(
            Color.Red.copy(0.3F),
            Color.Blue.copy(0.3F),
            Color.Cyan.copy(0.3F),
            Color.Yellow.copy(0.3F)
            )
    }
}

class InvalidNoteException(message: String): Exception(message)