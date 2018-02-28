package machine_code.weatherup.webBowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import machine_code.weatherup.R;

public class SHIYUN3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shiyun3);
        WebView shiyun3WebView=(WebView)findViewById(R.id.shiyun3WebView);
        WebSettings webSettings=shiyun3WebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        shiyun3WebView.loadUrl("https://www.n2yo.com/widgets/widget-tracker.php?s=33433&amp;size=small&amp;all=1&amp;me=10&amp;map=2");
        shiyun3WebView.setWebViewClient(new WebViewClient());
    }
}
