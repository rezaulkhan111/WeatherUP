package machine_code.weatherup.webBowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import machine_code.weatherup.R;

public class INSAT3DRActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insat3_dr);
        WebView insat3drWebView=(WebView)findViewById(R.id.insat3drWebView);
        WebSettings webSettings=insat3drWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        insat3drWebView.loadUrl("https://www.n2yo.com/widgets/widget-tracker.php?s=41752&amp;size=small&amp;all=1&amp;me=10&amp;map=2");
        insat3drWebView.setWebViewClient(new WebViewClient());
    }
}
