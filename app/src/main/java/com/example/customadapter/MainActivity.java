package com.example.customadapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<SanPham > listSanPham;
    SanPhamAdapter sanPhamAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
        listSanPham=new ArrayList<>();
        listSanPham.add(new SanPham("Iphone 4",12000000,R.drawable.iphone4));
        listSanPham.add(new SanPham("Iphone 6",19000000,R.drawable.iphone6));
        listSanPham.add(new SanPham("Iphone 7 Plus",23000000,R.drawable.iphone7pl));
        listSanPham.add(new SanPham("Iphone XS Max",14000000,R.drawable.iphonexsmax));
        listSanPham.add(new SanPham("Iphone 11 Pro Max",14000000,R.drawable.iphone11promax));
        listSanPham.add(new SanPham("Oppo reno 3",10000000,R.drawable.oppo));
        listSanPham.add(new SanPham("Samsung note 10",14000000,R.drawable.samsung));
        listSanPham.add(new SanPham("Xiaomi",14000000,R.drawable.xiaomi));

        sanPhamAdapter=new SanPhamAdapter(getApplicationContext(),listSanPham);
        recyclerView.setAdapter(sanPhamAdapter);
    }
}