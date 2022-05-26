package com.example.finaloutput_androidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class RefSeek extends AppCompatActivity {
    WebView webV3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ref_seek);

        webV3 = findViewById(R.id.webView3);
        webV3.setWebViewClient(new WebViewClient());
        webV3.loadUrl("https://www.refseek.com/");

    }
    public void onBackPressed(){
        if (webV3.canGoBack()){
            webV3.goBack();
            Toast.makeText(this, "Going Back", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Going Back", Toast.LENGTH_SHORT).show();
            super.onBackPressed();
        }


    }

}