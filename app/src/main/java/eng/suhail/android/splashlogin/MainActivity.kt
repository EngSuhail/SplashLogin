package eng.suhail.android.splashlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main)
        val splash = object :Thread(){
          override fun run() {
              try {

                     Thread.sleep(5000)
                  val intent =Intent(baseContext,LoginActivity::class.java)
                  startActivity(intent)
              }
              catch (e: Exception){
                  e.printStackTrace()
              }
          }

      }
        splash.start()
    }
}