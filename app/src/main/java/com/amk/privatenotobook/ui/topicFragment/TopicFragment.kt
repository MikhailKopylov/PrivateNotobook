package com.amk.privatenotobook.ui.topicFragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.amk.privatenotobook.R
import com.amk.privatenotobook.presentation.TopicViewModel
import com.amk.privatenotobook.presentation.TopicViewState
import kotlinx.android.synthetic.main.fragment_topic.*


class TopicFragment : Fragment(R.layout.fragment_topic) {

    private val viewMode by lazy(LazyThreadSafetyMode.NONE) {
        ViewModelProvider(this).get(TopicViewModel::class.java)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = TopicAdapter()

        topic_view.adapter = adapter

        viewMode.observableTopicViewState().observe(viewLifecycleOwner) {
            when (it) {
                is
                TopicViewState.NotesList -> {
                    adapter.submitList(it.notes)
                }
                TopicViewState.EMPTY -> Unit
            }
        }
    }

//    companion object {
//        @JvmStatic
//        fun newInstance() = TopicFragment()
//    }
}