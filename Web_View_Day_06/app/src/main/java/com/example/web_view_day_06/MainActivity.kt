package com.example.web_view_day_06

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView = findViewById<WebView>(R.id.webView) // variable
        webViewSetUp(webView) // calling function

    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetUp(a: WebView){ // function has variableName and Type
        a.webViewClient= WebViewClient()

        a.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://github.com/SurajScoe")
        }
    }
}