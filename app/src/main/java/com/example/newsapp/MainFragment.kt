package com.example.newsapp

import android.content.Context
import android.util.Log
import androidx.fragment.app.Fragment
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class MainFragment : Fragment() {

    @Inject
    lateinit var wizard: Unit

    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
        Log.d("InjectionTest", wizard.type)
    }

}