package machine_code.weatherup.webBowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import machine_code.weatherup.R;

public class ISSCAM2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isscam2);
        WebView isscam2WebView=(WebView)findViewById(R.id.isscam2WebView);
        WebSettings webSettings=isscam2WebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        isscam2WebView.loadUrl("");
        isscam2WebView.setWebViewClient(new WebViewClient());
    }
}
