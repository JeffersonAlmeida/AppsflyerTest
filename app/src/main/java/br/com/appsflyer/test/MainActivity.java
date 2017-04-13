package br.com.appsflyer.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.appsflyer.AppsFlyerLib;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Please, don't forget to insert dev key
        AppsFlyerLib.getInstance().startTracking(this.getApplication(), "DEV-KEY-HERE");

    }

    public void onClickTela1(View view) {
        startActivity(new Intent(this, Tela1.class));
    }


    public void onClickTela2(View view) {
        startActivity(new Intent(this, Tela2.class));
    }
}
