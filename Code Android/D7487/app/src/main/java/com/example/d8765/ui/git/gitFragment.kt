package com.example.d8765.ui.git

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.d8765.R
import kotlinx.android.synthetic.main.fragment_git.*
import kotlinx.android.synthetic.main.fragment_git.view.*

class gitFragment : Fragment() {

    private lateinit var GitViewModel: gitViewModel
    private lateinit var webView1: WebView

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        GitViewModel =
                ViewModelProviders.of(this).get(gitViewModel::class.java)
       val root = inflater.inflate(R.layout.fragment_git, container, false)



        webView1 = root.findViewById(R.id.webview7653)
        webView1.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url)
                return true
            }
        }
//        webview.settings.javaScriptEnabled = true
        webView1.loadUrl("https://github.com/IvanMalinin-0876/DEMO-Android-KOTLIN-PHP-MYSQL-HTML")

        webView1.getSettings().setJavaScriptEnabled(true);
        webView1.getSettings().setBuiltInZoomControls(true);
        webView1.setInitialScale(100)



        root.button2564.setOnClickListener {
            openlink();
        }



       return root
    }



    fun openlink(){

        openNewTabWindow("https://github.com/IvanMalinin-0876/DEMO-Android-KOTLIN-PHP-MYSQL-HTML", view!!.context)
    }


    fun openNewTabWindow(urls: String, context: Context) {
        val uris = Uri.parse(urls)
        val intents = Intent(Intent.ACTION_VIEW, uris)
        val b = Bundle()
        b.putBoolean("new_window", true)
        intents.putExtras(b)
        context.startActivity(intents)
    }


}
