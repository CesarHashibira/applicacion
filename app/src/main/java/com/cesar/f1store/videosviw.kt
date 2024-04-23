package com.cesar.f1store

import android.net.Uri
import android.os.Bundle
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class videosviw : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_videosviw)

        val videoView = findViewById<VideoView>(R.id.videoView)

        // Obtener la URI del archivo de video desde la carpeta res/raw
        val uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.premiomx)

        // Asignar la URI al VideoView
        videoView.setVideoURI(uri)

        // Iniciar la reproducción del video
        videoView.start()
    }
}
