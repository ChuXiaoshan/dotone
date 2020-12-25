package com.cxsplay.dotone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.blankj.utilcode.util.AppUtils
import com.blankj.utilcode.util.LogUtils

class InstallerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_installer)
        init()
    }

    private fun init() {
        val uri = intent?.data
        LogUtils.d("---uri--->$uri")
        uri?.run { AppUtils.installApp(uri) }
    }
}