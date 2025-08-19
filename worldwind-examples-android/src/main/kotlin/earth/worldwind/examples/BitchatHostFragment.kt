package com.example.worldwindkotlin.bitchat

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.example.worldwindkotlin.R

class BiTChatFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_bitchat, container, false)

        val webView: WebView = view.findViewById(R.id.webViewBiTChat)
        webView.webViewClient = WebViewClient()
        webView.settings.javaScriptEnabled = true

        // Yahan pe BiTChat ka local URL daalna hoga
        webView.loadUrl("http://localhost:3000/")  // baad me correct karenge

        return view
    }
}
