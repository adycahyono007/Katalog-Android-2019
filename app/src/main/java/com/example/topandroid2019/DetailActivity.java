package com.example.topandroid2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    TextView nameTxt, usernameTxt;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        nameTxt = findViewById(R.id.tv_item_name);
        usernameTxt = findViewById(R.id.tv_item_Spec);
        img = findViewById(R.id.img_item_photo);

        //DAPETIN INTENT
        Intent i = this.getIntent();

        //MENERIMA DATA
        String images = i.getExtras().getString("IMAGES_KEY");
        String name = i.getExtras().getString("TITLE_KEY");
        String username = i.getExtras().getString("ISI_KEY");

        //BIND DATA
        img.setImageURI(Uri.parse(images));
        nameTxt.setText(name);
        usernameTxt.setText(username);

        Glide.with(this)
                .load(images)
                //.resize(1200, 800)                     // optional
                .into(img);
    }
}

