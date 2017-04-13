package br.com.appsflyer.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.appsflyer.AppsFlyerLib;

public class Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        AppsFlyerLib.getInstance().sendDeepLinkData(this);

    }
}
