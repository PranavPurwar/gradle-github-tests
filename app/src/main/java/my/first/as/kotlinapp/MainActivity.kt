package my.first.`as`.kotlinapp

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import my.first.`as`.kotlinapp.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.v("tag", "Verbose")
        binding.button.setOnClickListener {
            Snackbar.make(this, binding.root, "Snackbar text", Snackbar.LENGTH_SHORT).show()
        }
    }
}
