package com.kazanov.kazanovmonththreelessonthree.recycler;

import static android.os.Build.VERSION_CODES.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StateAdapter extends RecyclerView.Adapter<StateAdapter.CountryViewHolder> {

    private final LayoutInflater inflater;
    private final List <State> states;

    public StateAdapter (Context context, List<State> states) {
        this.states = states;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public StateAdapter.CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_countries, parent, false);
        return new CountryViewHolder (view);
    }

    @Override
    public void onBindViewHolder(@NonNull StateAdapter.CountryViewHolder holder, int position) {

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
            countryView = view.findViewById(R.id.name);
            capitalView = view.findViewById(R.id.capital);
        }

    }
}
