package com.testbtl123.btl123;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class tr_thong_ke extends AppCompatActivity {

    ImageButton btn_chitieu, btn_hanmuc, btn_baocao, btn_out;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tr_thong_ke);

        btn_chitieu =findViewById(R.id.btn_chi_tieu);
        btn_baocao =findViewById(R.id.btn_bao_cao);
        btn_hanmuc = findViewById(R.id.btn_han_muc);
        btn_out = findViewById(R.id.btn_out);

        btn_chitieu.setOnClickListener(this::clickChitieu);
    }

    private void clickChitieu(View view) {
        Intent intent = new Intent(tr_thong_ke.this,MainActivity.class);
        startActivity(intent);
    }
}