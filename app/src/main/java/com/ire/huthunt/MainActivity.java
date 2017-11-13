package com.ire.huthunt;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mCardRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private BottomBar mBottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*SearchManager searchManager = (SearchManager)
                getSystemService(this.SEARCH_SERVICE);
        Menu searchMenuItem = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) searchMenuItem.getActionView();

        searchView.setSearchableInfo(searchManager.
                getSearchableInfo(getComponentName()));
        searchView.setSubmitButtonEnabled(true);
        searchView.setOnQueryTextListener(this);*/

        mBottomBar = findViewById(R.id.bottomBar);
        mBottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                switch (tabId) {
                    /*case R.id.bb_bottom_bar_title
//                        do something
                        break;
                    case R.id.tab_profile:
//                        do something
                        break;*/
                    default:
                        mCardRecyclerView = findViewById(R.id.card_recycler_view);

                        Houses houses = new Houses();

                        mAdapter = new CardAdapter(getApplicationContext(), houses.houseCard);

                        mLayoutManager = new LinearLayoutManager(getApplicationContext());
                        mCardRecyclerView.setLayoutManager(mLayoutManager);
                        mCardRecyclerView.setItemAnimator(new DefaultItemAnimator());
                        mCardRecyclerView.setAdapter(mAdapter);

                        mCardRecyclerView.addOnItemTouchListener(
                                new RecyclerItemClickListener(getApplicationContext(), new RecyclerItemClickListener.OnItemClickListener() {
                                    @Override
                                    public void onItemClick(View view, int position) {
                                        Intent scheduleIntent = new Intent(getApplicationContext(), ScheduleVisitActivity.class);
                                        startActivity(scheduleIntent);
                                    }
                                })
                        );

                }

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.search_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        int id = item.getItemId();

        switch (id) {
            case R.id.search:
//                oya search
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
