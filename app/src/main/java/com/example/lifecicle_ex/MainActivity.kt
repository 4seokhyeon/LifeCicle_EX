package com.example.lifecicle_ex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.lifecicle_ex.databinding.ActivityMainBinding
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Timber.e("onCreate")
        showToast("onCreate 실행")

        binding.gotoSecond.setOnClickListener {
            Timber.d("Go to Second Activity button clicked")
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        binding.goFragment.setOnClickListener {
            val fragment = LifeFragment()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frameLayout, fragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }
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