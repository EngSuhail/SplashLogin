package eng.suhail.android.splashlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }

    fun back (view: View) {
        try {

            val intent = Intent(baseContext, LoginActivity::class.java)
            startActivity(intent)
    }
    catch (e: Exception){
        e.printStackTrace()
    }
    }
}