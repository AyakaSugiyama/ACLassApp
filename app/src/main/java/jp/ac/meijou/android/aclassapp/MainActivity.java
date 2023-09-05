package jp.ac.meijou.android.aclassapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import jp.ac.meijou.android.aclassapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;
    private PrefDataStore prefDataStore;
    private int imageRes = R.drawable.ic_android;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        prefDataStore = prefDataStore.getInstance(this);



        binding.saveButton.setOnClickListener(view ->{
            var text = binding.editText.getText().toString();
            prefDataStore.setString("name",text);
            Log.d("Saved","save:"+binding.editText);
        });



      //  binding.text.setText(R.string.my_name);

        binding.buttonText.setOnClickListener(View ->{
            var text = binding.editText.getText().toString();
            binding.textField.setText(text);
        });

        binding.editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                binding.textField.setText(s.toString());
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
    @Override
    protected void onStart() {
        super.onStart();
        prefDataStore.getString("name")
                .ifPresent(name -> binding.textField.setText(name));
    }

}