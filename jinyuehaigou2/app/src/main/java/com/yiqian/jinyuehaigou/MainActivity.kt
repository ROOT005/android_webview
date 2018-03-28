package com.yiqian.jinyuehaigou

import android.app.Activity
import android.os.Bundle
import android.view.KeyEvent
import kotlinx.android.synthetic.main.activity_main.*
import android.webkit.WebView
import android.webkit.WebSettings
import android.view.KeyEvent.KEYCODE_BACK
import android.view.View
import android.webkit.WebViewClient






class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webview.loadUrl("http://www.rxjypt.com/")
        val webSettings = webview.getSettings()
        webSettings.setJavaScriptEnabled(true)
        webSettings.setUseWideViewPort(true)
        webSettings.setLoadWithOverviewMode(true)
        webSettings.setSupportZoom(false)
        webSettings.setBuiltInZoomControls(false)
        webSettings.setDisplayZoomControls(false)

        webSettings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK)
        webSettings.setAllowFileAccess(true)
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true)
        webSettings.setLoadsImagesAutomatically(true)
        webSettings.setDefaultTextEncodingName("utf-8")

        webview.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                view.loadUrl(url)
                return super.shouldOverrideUrlLoading(view, url)
            }
        }
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent): Boolean {
        if (keyCode == KEYCODE_BACK && webview.canGoBack()) {
            webview.goBack()
            return true
        }
        return super.onKeyDown(keyCode, event)
    }



}
