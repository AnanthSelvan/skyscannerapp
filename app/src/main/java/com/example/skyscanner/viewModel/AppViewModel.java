package com.example.skyscanner.viewModel;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.ClipData;
import android.util.Log;

import com.example.skyscanner.databinding.RecyclerViewBinding;
import com.example.skyscanner.model.Example;
import com.example.skyscanner.recyclerAdapter.RecyclerAdapter;
import com.example.skyscanner.service_layer.ServiceLayer;
import com.example.skyscanner.service_layer.ServiceManager;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import static android.content.ContentValues.TAG;

public class AppViewModel implements LifecycleObserver {

    ServiceLayer serviceLayer;
    ServiceManager serviceManager;
    ItemViewModel itemViewModel;
    public List<ItemViewModel> itemViewModelList = new ArrayList<>();
    RecyclerAdapter recyclerAdapter = new RecyclerAdapter(itemViewModelList);

    private static final String TAG = "AppViewModel";

    @Inject
    public AppViewModel(ServiceManager serviceManager, ItemViewModel itemViewModel) {
        this.serviceManager = serviceManager;
        this.itemViewModel = itemViewModel;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void init() {
        serviceManager.getFlightInformation("US", "USD", "en-US", "SFO-sky", "ORD-sky", "2019-09-01")
                .subscribe(this::flightDetails, this::errorMessage,this::completed);
    }

    private void completed() {
        System.out.println("call finished");
    }

    public void flightDetails(Example example) {
//           itemViewModel.setAmount(String.valueOf(example.getQuotes().get(0).getMinPrice()));
        itemViewModel.setDirectFlight(String.valueOf(example.getQuotes().get(0).getDirect()));
        itemViewModel.setPrice(String.valueOf(example.getQuotes().get(0).getMinPrice()));
        itemViewModel.setTime(String.valueOf(example.getCarriers().get(0).getName()));
        itemViewModelList.add(itemViewModel);

        recyclerAdapter.notifyDataSetChanged();
    }

    public void errorMessage(Throwable throwable) {
            Log.e(TAG, "errorMessage: " + throwable.getLocalizedMessage());
    }

    public RecyclerAdapter getRecyclerAdapter() {
        return recyclerAdapter ;
    }
}
