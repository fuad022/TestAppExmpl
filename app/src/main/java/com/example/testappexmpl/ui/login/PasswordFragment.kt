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
import com.example.testappexmpl.databinding.FragmentPasswordBinding
import com.google.android.material.textfield.TextInputLayout

class PasswordFragment : Fragment() {
    private val binding by lazy { FragmentPasswordBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        initToolbar()
        init()
        return binding.root
    }

    private fun initToolbar() {
        setHasOptionsMenu(true)
        (activity as AppCompatActivity).setSupportActionBar(binding.toolbarPassword)

        binding.toolbarPassword.setNavigationOnClickListener {
            activity?.onBackPressed()
            val imm = context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view?.windowToken, 0)
        }
    }

    private fun init() {
        binding.continueToLoginBtn.setOnClickListener {
            putPass()
        }
    }

    private fun putPass() {
        binding.apply {
            val pass = passwordEditText.text.toString()
            if (validateInput(pass, passwordInputLayout)
            ) {
                val action = PasswordFragmentDirections.actionPasswordFragmentToLoginFragment()
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