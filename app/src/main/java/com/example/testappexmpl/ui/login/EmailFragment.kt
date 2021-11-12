package com.example.testappexmpl.ui.login

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import com.example.testappexmpl.databinding.FragmentEmailBinding
import com.google.android.material.textfield.TextInputLayout

class EmailFragment : Fragment() {
    private val binding by lazy { FragmentEmailBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        initToolbar()
        init()
        return binding.root
    }

    private fun initToolbar() {
//        setHasOptionsMenu(true)
//        (activity as AppCompatActivity).setSupportActionBar(binding.toolbarEmail)

        binding.toolbarEmail.setNavigationOnClickListener {
            activity?.onBackPressed()
            val imm = context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view?.windowToken, 0)
        }
    }

    private fun init() {
        binding.continueToPassBtn.setOnClickListener {
            putEmail()
        }
    }

    private fun putEmail() {
        binding.apply {
            val email = emailEditText.text.toString()
            if (validateInput(email, emailInputLayout)
            ) {
                val action = EmailFragmentDirections.actionEmailFragmentToPasswordFragment()
                findNavController().navigate(action)
            }
        }
    }

    private fun validateInput(inputText: String, textInputLayout: TextInputLayout): Boolean {
        return if (inputText.length <= 7) {
            textInputLayout.isErrorEnabled = true
            textInputLayout.error = "* Minimum 8 Characters Allowed"
            false
        } else {
            textInputLayout.isErrorEnabled = false
            textInputLayout.error = null
            true
        }
    }
}