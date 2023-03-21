package com.kazanov.kazanovmonththreelessonthree.recycler;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kazanov.kazanovmonththreelessonthree.R;

import java.util.List;

public class StateAdapter extends RecyclerView.Adapter<StateAdapter.CountryViewHolder> {

    private final LayoutInflater inflater;
    private final List<State> states;

    public StateAdapter (Context context, List<State> states) {
        this.states = states;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public StateAdapter.CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_countries, parent, false);
        return new CountryViewHolder (view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {

        State state = states.get(position);
        holder.flagView.setImageResource(state.getFlag());
        holder.countryView.setText(state.getCountry());
        holder.capitalView.setText(state.getCapital());
    }

    @Override
    public int getItemCount() {
        return states.size();
    }
    public static class CountryViewHolder extends RecyclerView.ViewHolder {
        final ImageView flagView;
        final TextView countryView, capitalView;
        CountryViewHolder(View view){
            super(view);
            flagView = view.findViewById(R.id.iv_flag);
            countryView = view.findViewById(R.id.tv_country);
            capitalView = view.findViewById(R.id.tv_capital);
        }

    }
}
