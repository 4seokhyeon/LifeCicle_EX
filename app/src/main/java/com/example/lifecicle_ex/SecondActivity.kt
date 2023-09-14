package com.example.lifecicle_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.lifecicle_ex.databinding.ActivitySecondBinding
import timber.log.Timber

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Timber.e("onCreate")
        showToast("onCreate 실행")
    }

    override fun onStart() {
        super.onStart()
        Timber.e("onStart")
        showToast("onStart 실행")
    }

    override fun onResume() {
        super.onResume()
        Timber.e("onResume")
        showToast("onResume 실행")
    }

    override fun onPause() {
        super.onPause()
        Timber.e("onPause")
        showToast("onPause 실행")
    }

    override fun onStop() {
        super.onStop()
        Timber.e("onStop")
        showToast("onStop 실행")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.e("onStop")
        showToast("onStop 실행")
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}