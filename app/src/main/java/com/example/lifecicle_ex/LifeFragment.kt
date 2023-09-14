package com.example.lifecicle_ex

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.lifecicle_ex.databinding.FragmentLifeBinding
import timber.log.Timber

class LifeFragment : Fragment() {
    lateinit var binding: FragmentLifeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.e("onCreate")
        showToast("onCreate 실행")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Timber.e("onCreateView 짠~")
        showToast("onCreaView 짠 하이")

       binding = FragmentLifeBinding.inflate(inflater,container,false)


        binding.button.setOnClickListener {
            val intent = Intent(activity, MainActivity::class.java)
            startActivity(intent)
        }




        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Timber.e("onViewCrreated HI")
        showToast("나는 onViewCreate")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Timber.e("onViewStateRestored")
        showToast("나는 onViewStateRestored")
    }

    override fun onStart() {
        super.onStart()
        Timber.e("onStart HI")
        showToast("나는 onstart 야")
    }

    override fun onResume() {
        super.onResume()
        Timber.e("onResume")
        showToast("나는 onResume 야")
    }

    override fun onPause() {
        super.onPause()
        Timber.e("onPause HIO")
        showToast("나는 on paause아 안넝")
    }

    override fun onStop() {
        super.onStop()
        Timber.e("onStop HIO")
        showToast("나는 onstop 멈춰 나 ")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Timber.e("onSaveInstanceState")
        showToast("하이요 나는 onSaveInstancesState")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Timber.e("onDestroyView di")
        showToast("나는 onDestoryView ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.e("onDestory")
        showToast("나는 onDestory 다!")
    }

    private fun showToast(message: String) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
    }

}