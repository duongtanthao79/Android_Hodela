package com.example.administrator.facebooklogin

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val stringGetFromPreviousView = intent.getStringExtra("user_name")
        txt_view.setText(stringGetFromPreviousView)

        btn_call.setOnClickListener { val callPhoneIntent = Intent(Intent.ACTION_DIAL)
//        callPhoneIntent.data = Uri.parse("tel:$0935224290")
            startActivity(callPhoneIntent)
        }

        btn_reset.setOnClickListener {
            val sendBackIntent = Intent()
            sendBackIntent.putExtra("send_back", "back back back")
            setResult(1,sendBackIntent)
            finish()

        }
    }




}
