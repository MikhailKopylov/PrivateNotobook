package com.amk.privatenotobook.core

class NotesRepositorySimple : NotesRepository {
    private val privateNotes: MutableList<Note> = initNotes()

    override val notes: List<Note>
        get() {
            return privateNotes.toList()
        }

    private fun initNotes(): MutableList<Note> {
        return mutableListOf(
            Note("TitleFirst", listOf(Subtopic("SubtitleFirst", "TextFirst"))),
            Note("TitleSecond", listOf(Subtopic("SubtitleSecond", "TextSecond"))),
            Note("TitleThird", listOf(Subtopic("SubtitleThird", "TextThird"))),
            Note("TitleFourth", listOf(Subtopic("SubtitleFourth", "TextFourth"))),
            Note("TitleFifth", listOf(Subtopic("SubtitleFifth", "TextFifth"))),
            Note("TitleSixth", listOf(Subtopic("SubtitleSixth", "TextSixth"))),
            Note("TitleSeventh", listOf(Subtopic("SubtitleSeventh", "TextSeventh"))),
            Note("TitleEighth", listOf(Subtopic("SubtitleEighth", "TextEighth"))),
        )
    }

}