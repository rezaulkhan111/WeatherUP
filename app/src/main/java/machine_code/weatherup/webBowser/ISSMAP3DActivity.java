package machine_code.weatherup.webBowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import machine_code.weatherup.R;

public class ISSMAP3DActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_issmap3_d);
        WebView issmap3dWebView=(WebView)findViewById(R.id.issmap3dWebView);
        WebSettings webSettings=issmap3dWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        issmap3dWebView.loadUrl("http://www.n2yo.com/webtracker3d.php?s=25544&amp;size=small");
        issmap3dWebView.setWebViewClient(new WebViewClient());
    }
}
