package com.example.testappexmpl.ui.login

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.navigation.fragment.findNavController
import com.example.testappexmpl.databinding.FragmentLoginBinding
import com.google.android.material.textfield.TextInputLayout

class LoginFragment : Fragment() {
    private val binding by lazy { FragmentLoginBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        init()
        return binding.root
    }

    private fun init() {
        binding.loginBtn.setOnClickListener {
            binding.apply {
                val email = emailEditText.text.toString()
                val pass = passEditText.text.toString()
                if (validateEmail(email, emailInputLayout) &&
                    validatePass(pass, passInputLayout)
                ) {
                    val action =
                        LoginFragmentDirections.actionLoginFragmentToFaceIdFragment()
                    findNavController().navigate(action)
                }
            }
        }

        binding.forgotPassword.setOnClickListener {
            val action = LoginFragmentDirections.actionLoginFragmentToEmailFragment()
            findNavController().navigate(action)
        }

        binding.mainLayout.setOnTouchListener { view, motionEvent ->
            val imm = context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view?.windowToken, 0)
        }
    }

    private fun validatePass(inputText: String, textInputLayout: TextInputLayout): Boolean {
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

    private fun validateEmail(inputText: String, textInputLayout: TextInputLayout): Boolean {
        return if (inputText.length <= 4) {
            textInputLayout.isErrorEnabled = true
            textInputLayout.error = "* Minimum 5 Characters Allowed"
            false
        } else {
            textInputLayout.isErrorEnabled = false
            textInputLayout.error = null
            true
        }
    }
}