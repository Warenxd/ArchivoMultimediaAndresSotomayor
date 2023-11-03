package com.example.archivomultimedia16;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.MediaController;
import android.widget.VideoView;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    private VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView minecraft = findViewById(R.id.videoView); // Referencia del video por ID

        String video = "android.resource://"+getPackageName()+"/"+R.raw.minecraftrailer;

        Uri uri = Uri.parse(video); // Se crea un objeto a partir de la cadena.
        minecraft.setVideoURI(uri); // Se establece la fuente del video.

        // Se crea un objeto que proporciona los controles de reproducción
        MediaController mediaController = new MediaController(this);
        minecraft.setMediaController(mediaController); // Se le asignan los controles de reproducción sean visibles y funcionales.
        mediaController.setAnchorView(minecraft); // Se especifica la vista a la que se anclará los controles.


    }
}