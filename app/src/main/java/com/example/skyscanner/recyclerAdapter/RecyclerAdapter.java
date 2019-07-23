package com.example.skyscanner.recyclerAdapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.skyscanner.R;
import com.example.skyscanner.databinding.FlightDetailsBinding;
import com.example.skyscanner.databinding.RecyclerViewBinding;
import com.example.skyscanner.viewModel.ItemViewModel;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    public List<ItemViewModel> itemViewModelList;

    public RecyclerAdapter(List<ItemViewModel> itemViewModelList) {
        this.itemViewModelList = itemViewModelList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        FlightDetailsBinding flightDetailsBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.flight_details, parent, false);
        return new ViewHolder(flightDetailsBinding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ItemViewModel itemViewModel = itemViewModelList.get(position);
        holder.bind(itemViewModel);
    }

    @Override
    public int getItemCount() {
        return itemViewModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        FlightDetailsBinding flightDetailsBinding;

        public ViewHolder(FlightDetailsBinding flightDetailsBinding) {
            super(flightDetailsBinding.getRoot());
            this.flightDetailsBinding = flightDetailsBinding;

        }

        public void bind(ItemViewModel itemViewModel) {
            flightDetailsBinding.setViewModel(itemViewModel);
        }
    }
}
