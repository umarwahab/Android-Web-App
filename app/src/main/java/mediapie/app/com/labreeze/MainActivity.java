package mediapie.app.com.labreeze;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.net.Inet4Address;

public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView= (WebView)findViewById(R.id.webview1);
        WebSettings webSettings= webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl("http://labreeze.co.uk/");
        webView.setWebViewClient(new WebViewClient());
    }
        public void OnBackPressed()
        {
            if(webView.canGoBack())
            {
                webView.goBack();


            }
            else
            {
                super.onBackPressed();


            }



        }

}