package com.example.finaloutput_androidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class ScienceOrg extends AppCompatActivity {
    WebView webV5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_org);

        webV5 = findViewById(R.id.webView5);
        webV5.setWebViewClient(new WebViewClient());
        webV5.loadUrl("https://www.science.gov/");

    }
    public void onBackPressed(){
        if (webV5.canGoBack()){
            webV5.goBack();
            Toast.makeText(this, "Going Back", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Going Back", Toast.LENGTH_SHORT).show();
            super.onBackPressed();
        }


    }
}