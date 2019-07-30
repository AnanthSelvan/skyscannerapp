package com.example.skyscanner;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.Button;

import com.example.skyscanner.databinding.ActivityMainBinding;
import com.example.skyscanner.databinding.RecyclerViewBinding;
import com.example.skyscanner.viewModel.AppViewModel;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity implements LifecycleOwner {

    Button submit;

    @Inject
    AppViewModel appViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidInjection.inject(this);
        setContentView(R.layout.activity_main);

        submit = findViewById(R.id.submit);
    }

    public void nextPage(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
//        intent.putExtra("source","SFO-sky");
//        intent.putExtra("destination","ORD-sky");
//        intent.putExtra("date","2019-09-01");
        startActivity(intent);
    }
}
