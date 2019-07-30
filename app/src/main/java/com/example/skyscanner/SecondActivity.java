package com.example.skyscanner;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.example.skyscanner.databinding.RecyclerViewBinding;
import com.example.skyscanner.viewModel.AppViewModel;
import com.example.skyscanner.viewModel.ItemViewModel;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class SecondActivity extends AppCompatActivity {

    @Inject
    AppViewModel appViewModel;

    @Inject
    ItemViewModel itemViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidInjection.inject(this);
        RecyclerViewBinding recyclerViewBinding = DataBindingUtil.setContentView(this,R.layout.recycler_view);
        this.getLifecycle().addObserver(appViewModel);
        recyclerViewBinding.setViewModel(appViewModel);
        recyclerViewBinding.recyclerView.setAdapter(appViewModel.getRecyclerAdapter());
        recyclerViewBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
}
