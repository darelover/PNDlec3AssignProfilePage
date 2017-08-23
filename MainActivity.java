package com.example.atulsachdeva.pndlec3assignprofilepage;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    ImageView btnFacebook, btnTwitter, btnLinkedin, btnGithub;

    String URL_FACEBOOK = "https://www.facebook.com/atul.sachdeva.1998";
    String URL_TWITTER = "https://twitter.com/AtulS0108";
    String URL_LINKEDIN = "https://www.linkedin.com/in/atul-sachdeva-230177132/";
    String URL_GITHUB = "https://github.com/darelover";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFacebook = (ImageView) findViewById(R.id.btnFacebook);
        btnTwitter = (ImageView) findViewById(R.id.btnTwitter);
        btnLinkedin = (ImageView) findViewById(R.id.btnLinkedin);
        btnGithub = (ImageView) findViewById(R.id.btnGithub);

        btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browseIntent =new Intent(Intent.ACTION_VIEW);
                browseIntent.setData(Uri.parse(URL_FACEBOOK));
                startActivity(browseIntent);
            }
        });
        btnTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browseIntent =new Intent(Intent.ACTION_VIEW);
                browseIntent.setData(Uri.parse(URL_TWITTER));
                startActivity(browseIntent);
            }
        });
        btnLinkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browseIntent =new Intent(Intent.ACTION_VIEW);
                browseIntent.setData(Uri.parse(URL_LINKEDIN));
                startActivity(browseIntent);
            }
        });
        btnGithub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browseIntent =new Intent(Intent.ACTION_VIEW);
                browseIntent.setData(Uri.parse(URL_GITHUB));
                startActivity(browseIntent);
            }
        });

    }
}
