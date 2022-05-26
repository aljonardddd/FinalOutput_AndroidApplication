package com.example.finaloutput_androidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class BASE extends AppCompatActivity {
    WebView webV4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_world_wide_science);

        webV4 = findViewById(R.id.webView4);
        webV4.setWebViewClient(new WebViewClient());
        webV4.loadUrl("https://www.base-search.net/");

    }
    public void onBackPressed(){
        if (webV4.canGoBack()){
            webV4.goBack();
            Toast.makeText(this, "Going Back", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Going Back", Toast.LENGTH_SHORT).show();
            super.onBackPressed();
        }


    }
}