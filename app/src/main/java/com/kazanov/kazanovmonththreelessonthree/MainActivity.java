package com.kazanov.kazanovmonththreelessonthree;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.kazanov.kazanovmonththreelessonthree.recycler.State;
import com.kazanov.kazanovmonththreelessonthree.recycler.StateAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList <State> states = new ArrayList<State>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setCreateStates();
        RecyclerView recyclerView = findViewById(R.id.rv_view);
        StateAdapter adapter = new StateAdapter(this, states);
        recyclerView.setAdapter(adapter);
    }

    private void setCreateStates() {

        states.add(new State("Argentina", "Buenos Aires", R.drawable.ar));
        states.add(new State("Canada", "Ottawa", R.drawable.ca));
        states.add(new State("Kyrgyzstan", "Bishkek", R.drawable.kg));
        states.add(new State("Spain", "Madrid", R.drawable.sp));
    }
}