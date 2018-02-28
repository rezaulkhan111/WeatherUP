package machine_code.weatherup.webBowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import machine_code.weatherup.R;

public class ISSMAPActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_issmap);
        WebView issmapWebView=(WebView) findViewById(R.id.issmapWebView);
        WebSettings webSettings=issmapWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        issmapWebView.loadUrl("https://www.n2yo.com/widgets/widget-tracker.php?s=25544&amp;size=small&amp;all=1&amp;me=10&amp;map=2");
        issmapWebView.setWebViewClient(new WebViewClient());
    }
}
