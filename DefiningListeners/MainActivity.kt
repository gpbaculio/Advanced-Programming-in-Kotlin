import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val saveDataButton = findViewById<Button>(R.id.saveDataButton)

        saveDataButton.setOnClickListener {
            Toast.makeText(this, "Data saved", Toast.LENGTH_SHORT).show()
        }
    }
}
