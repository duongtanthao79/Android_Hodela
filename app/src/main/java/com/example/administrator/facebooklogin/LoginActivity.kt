package com.example.administrator.facebooklogin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        checkLegalUserAccount()
    }

    fun checkLegalUserAccount() {
        btn_submit.setOnClickListener {
            if (et_user_name.text.isBlank() || et_password.text.isBlank()) {
                Toast.makeText(this, "Please in put correct username/password", Toast.LENGTH_SHORT).show()
            } else {
                var intent = Intent(this, ListViewActivity::class.java)
                intent.putExtra("user_name",et_user_name.text.toString())
               startActivityForResult(intent, 0)
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
//        if (requestCode == 1) {
            val value = data?.getIntExtra("send_back", 0)

            Toast.makeText(this, data?.getStringExtra("send_back"), Toast.LENGTH_SHORT).show()
//        }
    }
}
