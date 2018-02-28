package machine_code.weatherup.webBowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import machine_code.weatherup.R;

public class DISASTERActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disaster);
        WebView disasterWebView =(WebView)findViewById(R.id.disasterWebView);
        WebSettings webSettings=disasterWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        disasterWebView.loadUrl("https://earth.nullschool.net/#current/wind/surface/level/orthographic=-231.38,8.87,499");
        disasterWebView.setWebViewClient(new WebViewClient());
    }
}
