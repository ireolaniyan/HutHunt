package com.ire.huthunt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mCardRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCardRecyclerView = findViewById(R.id.card_recycler_view);

        Houses houses = new Houses();

        mAdapter = new CardAdapter(this, houses.houseCard);

        mLayoutManager = new LinearLayoutManager(this);
        mCardRecyclerView.setLayoutManager(mLayoutManager);
        mCardRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mCardRecyclerView.setAdapter(mAdapter);
    }
}
