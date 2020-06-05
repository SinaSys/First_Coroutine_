package com.example.first_coroutine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch {
            val networkCallAnswer = doNetworkCall()
            Log.d(TAG, networkCallAnswer)
            val networkCallAnswer2 = doNetworkCall2()
            Log.d(TAG, networkCallAnswer2)
        }
    }

    private suspend fun doNetworkCall(): String {
        delay(3000)
        return "This is the Answer from doNetworkCall1"
    }

    private suspend fun doNetworkCall2(): String {
        delay(3000)
        return "This is the Answer from doNetworkCall2"
    }
}
