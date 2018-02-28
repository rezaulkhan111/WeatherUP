package machine_code.weatherup.webBowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import machine_code.weatherup.R;

public class HIMWARI8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_himwari8);
        WebView himwari8WebView=(WebView)findViewById(R.id.himiwari8WebView);
        WebSettings webSettings=himwari8WebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        himwari8WebView.loadUrl("https://himawari8.nict.go.jp");
        himwari8WebView.setWebViewClient(new WebViewClient());
    }
}
