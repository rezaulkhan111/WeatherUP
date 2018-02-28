package machine_code.weatherup.webBowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import machine_code.weatherup.R;

public class FENGYUN4RActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fengyun4_r);
        WebView fengyun4rWebView=(WebView) findViewById(R.id.fengyun4rWebView);
        WebSettings webSettings=fengyun4rWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        fengyun4rWebView.loadUrl("https://www.n2yo.com/widgets/widget-tracker.php?s=41882&amp;size=small&amp;all=1&amp;me=10&amp;map=2");
        fengyun4rWebView.setWebViewClient(new WebViewClient());
    }
}
