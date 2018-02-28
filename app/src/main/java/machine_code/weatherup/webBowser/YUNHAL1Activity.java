package machine_code.weatherup.webBowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import machine_code.weatherup.R;

public class YUNHAL1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yunhal1);
        WebView yunhal1WebView=(WebView)findViewById(R.id.yunhal1WebView);
        WebSettings webSettings=yunhal1WebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        yunhal1WebView.loadUrl("https://www.n2yo.com/widgets/widget-tracker.php?s=41857&amp;size=small&amp;all=1&amp;me=10&amp;map=2");
        yunhal1WebView.setWebViewClient(new WebViewClient());
    }
}
