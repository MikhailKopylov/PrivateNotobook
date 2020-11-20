package com.amk.privatenotobook.presentation

import com.amk.privatenotobook.core.Note

sealed class TopicViewState {
    data class NotesList(val notes: List<Note>) : TopicViewState()
    object EMPTY : TopicViewState()
}