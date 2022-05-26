package com.example.finaloutput_androidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class ResearchGate extends AppCompatActivity {
    WebView webV2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research_gate);

        webV2 = findViewById(R.id.webView2);
        webV2.setWebViewClient(new WebViewClient());
        webV2.loadUrl("https://www.researchgate.net/");

    }
    public void onBackPressed(){
        if (webV2.canGoBack()){
            webV2.goBack();
            Toast.makeText(this, "Going Back", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Going Back", Toast.LENGTH_SHORT).show();
            super.onBackPressed();
        }



    }
}