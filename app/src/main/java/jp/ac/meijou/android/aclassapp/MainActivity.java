package jp.ac.meijou.android.aclassapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import jp.ac.meijou.android.aclassapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private int textRes = R.string.my_name;
    private int imageRes = R.drawable.ic_android;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.text.setText(R.string.my_name);

        binding.buttonText.setOnClickListener(View ->{
            binding.text.setText(textRes);
            if(textRes == R.string.my_name){
                textRes=R.string.meijou;
            }else{
                textRes=R.string.my_name;
            }
        });

        binding.buttonImage.setOnClickListener(view ->{
            binding.imageView.setImageResource(imageRes);
            if (imageRes == R.drawable.ic_android){
                imageRes=R.drawable.baseline_star;
            }else{
                imageRes=R.drawable.ic_android;
            }
        });
    }
}