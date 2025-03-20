package com.naftaliholland.notes.domain.use_case

import com.naftaliholland.notes.domain.model.Note
import com.naftaliholland.notes.domain.repository.NoteRepository

class DeleteNoteUseCase(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}