package com.pr7.kotlin_dagger2_field_injection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pr7.kotlin_dagger2_constructor_injection.Google
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var firebase: Firebase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      val component=Injector.component.inject(this@MainActivity)
      firebase.realtimeDatabase()
        val google=Google()
    }
}