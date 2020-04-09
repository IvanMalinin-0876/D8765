package com.d8765.d8765.ui.notifications

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
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProviders
import com.d8765.d8765.R

class NotificationsFragment : Fragment() {

    var closeAlert1 : MutableLiveData<Boolean> = MutableLiveData<Boolean>()
    private lateinit var notificationsViewModel: NotificationsViewModel
    private lateinit var webView1: WebView
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        notificationsViewModel =
                ViewModelProviders.of(this).get(NotificationsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_notifications, container, false)

        webView1 = root.findViewById(R.id.webview)
        webView1.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url)
                return true
            }
        }
//        webview.settings.javaScriptEnabled = true
        webView1.loadUrl("http://yujbs.com/prj/D8765/index.html")

        webView1.getSettings().setJavaScriptEnabled(true);
        webView1.getSettings().setBuiltInZoomControls(true);
        webView1.setInitialScale(100)
        return root
    }


    fun openlink(){

        openNewTabWindow("http://yujbs.com/prj/D8765/index.html", view!!.context)
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
