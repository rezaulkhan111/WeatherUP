package machine_code.weatherup;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import machine_code.weatherup.webBowser.DISASTERActivity;
import machine_code.weatherup.webBowser.FENGYUN4RActivity;
import machine_code.weatherup.webBowser.HIMWARI8Activity;
import machine_code.weatherup.webBowser.INSAT3DRActivity;
import machine_code.weatherup.webBowser.ISSCAM1Activity;
import machine_code.weatherup.webBowser.ISSCAM2Activity;
import machine_code.weatherup.webBowser.ISSMAP3DActivity;
import machine_code.weatherup.webBowser.ISSMAPActivity;
import machine_code.weatherup.webBowser.SHIYUN3Activity;
import machine_code.weatherup.webBowser.YUNHAL1Activity;

public class SatelliteActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satellite);
        //*ImageView id and TextView id call from Method **//
        ImageViewInitialization();
        TextViewInitialization();
    }
    public void ISSCAM1onClick(View view1) {
        Intent intent = new Intent(SatelliteActivity.this, ISSCAM1Activity.class);
        startActivity(intent);
    }
    public void ISSCAM2onClick(View view2) {
        Intent intent = new Intent(SatelliteActivity.this, ISSCAM2Activity.class);
        startActivity(intent);
    }
    public void ISSMAPonClick(View view3) {
        Intent intent = new Intent(SatelliteActivity.this, ISSMAPActivity.class);
        startActivity(intent);
    }

    public void ISSMAP3DonClick(View view4) {
        Intent intent = new Intent(SatelliteActivity.this, ISSMAP3DActivity.class);
        startActivity(intent);
    }
    public void HIMWARI8onClick(View view5) {
        Intent intent = new Intent(SatelliteActivity.this, HIMWARI8Activity.class);
        startActivity(intent);
    }
    public void DISASTERonClick(View view6) {
        Intent intent = new Intent(SatelliteActivity.this, DISASTERActivity.class);
        startActivity(intent);
    }
    public void FENGYUN4RonClick(View view7) {
        Intent intent = new Intent(SatelliteActivity.this, FENGYUN4RActivity.class);
        startActivity(intent);
    }
    public void SHIYUN3onClick(View view8) {
        Intent intent = new Intent(SatelliteActivity.this, SHIYUN3Activity.class);
        startActivity(intent);
    }
    public void YUNHAL1onClick(View view9) {
        Intent intent = new Intent(SatelliteActivity.this, YUNHAL1Activity.class);
        startActivity(intent);
    }
    public void INSAT3DRonClick(View view10) {
        Intent intent = new Intent(SatelliteActivity.this, INSAT3DRActivity.class);
        startActivity(intent);
    }
    public void GPSPOSIonClick(View view11) {
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://satview.bom.gov.au"));
        startActivity(intent);
    }
    public void EARTH2DonClick(View view12) {
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://satview.bom.gov.au"));
        startActivity(intent);
    }
    private void ImageViewInitialization()
    {
        imageView=(ImageView)findViewById(R.id.iss_cam1IV);
        imageView=(ImageView)findViewById(R.id.iss_cam2IV);
        imageView=(ImageView)findViewById(R.id.iss_mapIV);
        imageView=(ImageView)findViewById(R.id.iss_map3dIV);
        imageView=(ImageView)findViewById(R.id.himiwari8IV);
        imageView=(ImageView)findViewById(R.id.disaterIV);
        imageView=(ImageView)findViewById(R.id.fengyun4rIV);
        imageView=(ImageView)findViewById(R.id.shiyun3IV);
        imageView=(ImageView)findViewById(R.id.yunhal1IV);
        imageView=(ImageView)findViewById(R.id.insat3drIV);
        imageView=(ImageView)findViewById(R.id.earth2dIV);
        imageView=(ImageView)findViewById(R.id.gpsposiIV);
    }
    private void TextViewInitialization()
    {
        textView=(TextView)findViewById(R.id.iss_cam1TV);
        textView=(TextView)findViewById(R.id.iss_cam2TV);
        textView=(TextView)findViewById(R.id.iss_mapTV);
        textView=(TextView)findViewById(R.id.iss_map3dTV);
        textView=(TextView)findViewById(R.id.himiwari8TV);
        textView=(TextView)findViewById(R.id.disaterTV);
        textView=(TextView)findViewById(R.id.fengyun4rTV);
        textView=(TextView)findViewById(R.id.shiyun3TV);
        textView=(TextView)findViewById(R.id.yunhal1TV);
        textView=(TextView)findViewById(R.id.insat3drTV);
        textView=(TextView)findViewById(R.id.earth2dTV);
        textView=(TextView)findViewById(R.id.gpsposiTV);
    }

}
