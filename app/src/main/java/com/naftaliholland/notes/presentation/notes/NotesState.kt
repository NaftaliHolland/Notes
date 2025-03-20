package com.naftaliholland.notes.presentation.notes

import com.naftaliholland.notes.domain.model.Note
import com.naftaliholland.notes.domain.util.NoteOrder
import com.naftaliholland.notes.domain.util.OrderType

data class NotesState (
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)