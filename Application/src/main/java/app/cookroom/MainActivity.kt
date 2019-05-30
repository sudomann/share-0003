package app.cookroom

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.cookroom.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)
        savedInstanceState ?: supportFragmentManager.beginTransaction()
                    .replace(R.id.container, CameraFragment.newInstance())
                    .commit()
    }

}
