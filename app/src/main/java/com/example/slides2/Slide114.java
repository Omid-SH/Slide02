package com.example.slides2;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Slide114 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slide114);
    }

    public void showDialogFragment (View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        FireMissileDialogFragment fragment = new FireMissileDialogFragment();
        fragmentTransaction.add(R.id.missile_frame_layout, fragment);
        fragmentTransaction.commit();
    }
}
