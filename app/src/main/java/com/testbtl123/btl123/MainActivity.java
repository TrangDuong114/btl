package com.testbtl123.btl123;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;
import com.testbtl123.btl123.Adapter.ChiTieuAdapter;
import com.testbtl123.btl123.Model.ChiTieuModel;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;

    ChiTieuAdapter chiTieuAdapter;
    ImageButton btn_chitieu, btn_hanmuc, btn_baocao, btn_out;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_chitieu =findViewById(R.id.btn_chi_tieu);
        btn_baocao =findViewById(R.id.btn_bao_cao);
        btn_hanmuc = findViewById(R.id.btn_han_muc);
        btn_out = findViewById(R.id.btn_out);

        btn_baocao.setOnClickListener(this::clickBaocao);


       /* recyclerView = recyclerView.findViewById(R.id.ls_chitieu);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<ChiTieuModel> options =
                new FirebaseRecyclerOptions.Builder<ChiTieuModel>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("ChiTieu"), ChiTieuModel.class)
                        .build();

        chiTieuAdapter = new ChiTieuAdapter(options);
        recyclerView.setAdapter(chiTieuAdapter);*/

    }
    private void clickBaocao(View view) {
        Intent intent = new Intent(MainActivity.this,tr_thong_ke.class);
        startActivity(intent);



        //thau dổi 123
    }


}