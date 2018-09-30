package com.example.yustar.biodata;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openTelpon(View v){
        Intent it = new Intent(Intent.ACTION_DIAL);
        startActivity(it);
    }
    public  void openAlamat(View view){
        Uri webpage = (Uri.parse("https://www.google.com/maps/place/Pilangsari,+Pidodo+Kulon,+Patebon,+Kendal+Regency,+Central+Java/@-6.8775448,110.1675616,16z/data=!3m1!4b1!4m13!1m7!3m6!1s0x2e705b1d5c7cba25:0x160663bd40b23530!2sPidodo+Kulon,+Patebon,+Kendal+Regency,+Central+Java!3b1!8m2!3d-6.8670775!4d110.1730192!3m4!1s0x2e705b111c1a51e3:0xf7a3dce041a2282a!8m2!3d-6.8785668!4d110.1715301"));
        Intent it = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(it);
    }
    public void openEmail(View view){
        Intent it = new Intent(Intent.ACTION_SEND);
        it.setData(Uri.parse("mailto: "));
        it.setType("text/plain");
        it.putExtra(Intent.EXTRA_EMAIL, new String[]{"Recipent"});
        it.putExtra(Intent.EXTRA_SUBJECT, "Recipent");
        it.putExtra(Intent.EXTRA_TEXT, "Recipent");
        startActivity(it);
    }
}
