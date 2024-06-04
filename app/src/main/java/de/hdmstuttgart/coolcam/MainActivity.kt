package de.hdmstuttgart.coolcam

import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.mlkit.vision.barcode.BarcodeScanner
import com.google.mlkit.vision.barcode.BarcodeScanning
import com.google.mlkit.vision.common.InputImage

class MainActivity : AppCompatActivity() {
    private lateinit var btnScan: Button
    private lateinit var barCodeImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.detail_layout)





//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
//        btnScan = findViewById(R.id.btnScan)
//        barCodeImage = findViewById(R.id.imageViewBarCode)
//        val drawable = barCodeImage.drawable as BitmapDrawable
//        val bitmap = drawable.bitmap
//        val image: InputImage = InputImage.fromBitmap(bitmap, 0)
//
//        btnScan.setOnClickListener {
//            val barcodeScanner: BarcodeScanner = BarcodeScanning.getClient()
//            barcodeScanner.process(image)
//                .addOnSuccessListener { barcodes ->
//                    for (barcode in barcodes) {
//                        val barcodeData = barcode.rawValue
//                        Toast.makeText(this@MainActivity, barcodeData, Toast.LENGTH_SHORT).show()
//                    }
//                }
//                .addOnFailureListener { e ->
//                    // Handle the error
//                }
//        }


    }
}