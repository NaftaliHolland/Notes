package com.naftaliholland.notes.domain.use_case

import com.naftaliholland.notes.domain.model.InvalidNoteException
import com.naftaliholland.notes.domain.model.Note
import com.naftaliholland.notes.domain.repository.NoteRepository

class AddNoteUseCase(
    private val repository: NoteRepository
) {



    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("The title cannot be empty")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("The content of the note cannot be empty")
        }
        repository.insertNote(note)
    }
}