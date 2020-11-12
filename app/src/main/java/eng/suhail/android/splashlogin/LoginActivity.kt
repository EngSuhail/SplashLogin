package eng.suhail.android.splashlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    lateinit var login:Button
    lateinit var register: Button
    lateinit var phone: EditText
    lateinit var password:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login)
        login = findViewById<Button>(R.id.login)
        register = findViewById<Button>(R.id.register)
        phone = findViewById<EditText>(R.id.phone)
        password = findViewById<EditText>(R.id.password)


    }

    fun start(view: View) {
        try{
            if (phone.length() == 11 && password.text != null) {
                val intent = Intent(baseContext, Register::class.java)
                startActivity(intent)
            } else {
                val error: String = "Try again".toString().trim()
                Toast.makeText(this, error, Toast.LENGTH_LONG).show()

            }
    }
    catch (e: Exception){
        e.printStackTrace()
    }

        }
    }

