package com.example.lutfi.menuprogram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Menu extends AppCompatActivity {
    Button bt_perkembangan;
    Button bt_infogizi;
    Button bt_daftarmakanan;
    Button bt_kembali;
    Button bt_bantuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        bt_perkembangan = (Button) findViewById(R.id.btnperkembangan);
        bt_infogizi = (Button) findViewById(R.id.btninfo);
        bt_daftarmakanan = (Button) findViewById(R.id.btndaftarmakanan);
        bt_kembali = (Button) findViewById(R.id.btnkembali);
        bt_bantuan = (Button) findViewById(R.id.btnbantuan);
        bt_kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Keluar dari Aplikasi", Toast.LENGTH_LONG).show();
                System.exit(1);
            }
        });


    }
}