package jp.ac.meijou.android.aclassapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Optional;

import jp.ac.meijou.android.aclassapp.databinding.ActivityMain3Binding;
import jp.ac.meijou.android.aclassapp.databinding.ActivitySubBinding;

public class SubActivity extends AppCompatActivity {

    private ActivitySubBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySubBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Optional.ofNullable(getIntent().getStringExtra("text")).ifPresent(text -> binding.editTextSub.setText(text));

        binding.buttonOk.setOnClickListener(view ->{
            var intent = new Intent();
            intent.putExtra("ret","meijo");
            setResult(RESULT_OK,intent);
            finish();
        });

        binding.buttonCansel.setOnClickListener(view ->{
            setResult(RESULT_CANCELED);
            finish();
        });
    }
}