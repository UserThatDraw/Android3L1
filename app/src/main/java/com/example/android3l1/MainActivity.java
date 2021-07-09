
package com.example.android3l1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        FragmentTransaction manager = getSupportFragmentManager().beginTransaction();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                manager.replace(R.id.frame_lay, new ListFragment()).commit();
                btn.setVisibility(View.INVISIBLE);
            }
        });
    }
}