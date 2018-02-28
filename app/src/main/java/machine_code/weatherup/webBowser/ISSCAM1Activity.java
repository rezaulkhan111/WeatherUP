package machine_code.weatherup.webBowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import machine_code.weatherup.R;

public class ISSCAM1Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isscam1);
        WebView isscam1WebView=(WebView)findViewById(R.id.isscam1WebView);
        WebSettings webSettings=isscam1WebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        isscam1WebView.loadUrl("");
        isscam1WebView.setWebViewClient(new WebViewClient());

    }
}
