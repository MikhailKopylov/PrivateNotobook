package com.amk.privatenotobook.core


data class Note(
    val topicName: String,
    val subTopicList: List<Subtopic>,
)

data class Subtopic(
    val subtopicName: String,
    val text: String
)