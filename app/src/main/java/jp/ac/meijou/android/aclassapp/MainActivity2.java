package jp.ac.meijou.android.aclassapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import jp.ac.meijou.android.aclassapp.databinding.ActivityMain2Binding;
import jp.ac.meijou.android.aclassapp.databinding.ActivityMainBinding;

public class MainActivity2 extends AppCompatActivity {

    private ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_main2);
        setContentView(binding.getRoot());


    }
}