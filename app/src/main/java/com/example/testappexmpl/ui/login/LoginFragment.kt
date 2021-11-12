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
import com.example.testappexmpl.R
import com.example.testappexmpl.databinding.FragmentLoginBinding
import com.google.android.material.textfield.TextInputLayout

class LoginFragment : Fragment() {
    private val binding by lazy { FragmentLoginBinding.inflate(layoutInflater) }

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
//        (activity as AppCompatActivity).setSupportActionBar(binding.toolbarLogin)

        binding.toolbarLogin.setNavigationOnClickListener {
            activity?.onBackPressed()
            val imm = context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view?.windowToken, 0)
        }
    }

    private fun init() {
        binding.loginBtn.setOnClickListener {
            authenticateUser()
        }

        binding.forgotPassword.setOnClickListener {
            val action = LoginFragmentDirections.actionLoginFragmentToEmailFragment()
            findNavController().navigate(action)
        }
    }

    private fun authenticateUser() {
        binding.apply {
            val email = emailEditText.text.toString()
            val pass = passEditText.text.toString()
            if (validateInput(email, emailInputLayout) &&
                validateInput(pass, passInputLayout)
            ) {
                val action =
                    LoginFragmentDirections.actionLoginFragmentToRootFragment(R.drawable.profile_img_1)
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