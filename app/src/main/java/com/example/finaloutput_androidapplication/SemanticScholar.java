package com.example.finaloutput_androidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class SemanticScholar extends AppCompatActivity {

    WebView webV1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semantic_scholar);

        webV1 = findViewById(R.id.webView1);
        webV1.setWebViewClient(new WebViewClient());
        webV1.loadUrl("https://www.semanticscholar.org/");

    }
    public void onBackPressed(){
        if (webV1.canGoBack()){
            webV1.goBack();
            Toast.makeText(this, "Going Back", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Going Back", Toast.LENGTH_SHORT).show();
            super.onBackPressed();
        }


    }
}
