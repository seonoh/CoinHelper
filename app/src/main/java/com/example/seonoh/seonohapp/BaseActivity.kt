package com.example.seonoh.seonohapp

import android.os.Bundle
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.seonoh.seonohapp.model.BaseViewModel

// 추상 클래스
// 제네릭, databinding
// layout 인자로 받는다.
abstract class BaseActivity<B : ViewDataBinding>(
    @LayoutRes
    private val layoutRes: Int
) : AppCompatActivity() {

    private lateinit var toast: Toast
    protected lateinit var binding: B
    abstract val viewModel: BaseViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layoutRes)
        binding.lifecycleOwner = this
        toast = Toast.makeText(this, resources.getString(R.string.back_text), Toast.LENGTH_LONG)
    }

    private fun showToast() {
        if (toast.view.isShown) {
            finish()
        } else {
            toast.show()
        }
    }

    override fun onBackPressed() {
        showToast()
    }
}