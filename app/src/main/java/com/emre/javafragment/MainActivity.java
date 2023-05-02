package com.emre.javafragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoFirst(View view) {

        FragmentManager fragmentManager = getSupportFragmentManager();   //Fragmanlarla çalışabilmek için gerekli
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction(); // Fragmanlar ile yapılacak işlemler için

        FirstFragment firstFragment = new FirstFragment(); //Oluşturduğumuz fragment ı seçiyoruz
        //fragmentTransaction.add(R.id.frame_layout,firstFragment).commit();
        fragmentTransaction.replace(R.id.frame_layout,firstFragment).commit(); // replace -> Bunun yerine "add" kullanırsak diğer fragmanı kaldırmaz üst üste biner

    }

    public void gotoSecond(View view) {

        FragmentManager fragmentManager = getSupportFragmentManager();   //Fragmanlarla çalışabilmek için gerekli
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction(); // Fragmanlar ile yapılacak işlemler için

        SecondFragment secondFragment = new SecondFragment(); //Oluşturduğumuz fragment ı seçiyoruz
        fragmentTransaction.replace(R.id.frame_layout,secondFragment).commit();

    }
}