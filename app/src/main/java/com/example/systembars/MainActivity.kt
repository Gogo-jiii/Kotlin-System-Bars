package com.example.systembars

import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowInsets
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowStatusbar.setOnClickListener(this)
        btnShowNavigationbar.setOnClickListener(this)
        btnHideStatusbar.setOnClickListener(this)
        btnHideNavigationbar.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val decorView = this.window.decorView

        when (v.id) {
            R.id.btnShowStatusbar -> {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                    decorView.windowInsetsController?.show(WindowInsets.Type.statusBars())
                }
            }
            R.id.btnHideStatusbar -> {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                    decorView.windowInsetsController?.hide(WindowInsets.Type.statusBars())
                }
            }
            R.id.btnShowNavigationbar -> {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                    decorView.windowInsetsController?.show(WindowInsets.Type.navigationBars())
                }
            }
            R.id.btnHideNavigationbar -> {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                    decorView.windowInsetsController?.hide(WindowInsets.Type.navigationBars())
                }
            }
        }
    }
}