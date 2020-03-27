package com.example.d8765.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.fragment_dashboard.*
import org.json.JSONObject
import kotlin.coroutines.coroutineContext

class DashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is dashboard Fragment"
    }

    var _liveData : MutableLiveData<JSONObject> = MutableLiveData<JSONObject>()

    val text: LiveData<String> = _text
    val JsonData: MutableLiveData<JSONObject> = _liveData







}