package com.amk.privatenotobook.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.amk.privatenotobook.R
import com.amk.privatenotobook.ui.topicFragment.TopicFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, TopicFragment())
            .commit()
    }
}