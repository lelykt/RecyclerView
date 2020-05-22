package com.dicoding.orangkaya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
        private String title = "Daftar Orang Kaya";
        private RecyclerView rvRich;
        private ArrayList<Rich> list = new ArrayList<>();

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            setActionBarTitle(title);

            rvRich = findViewById(R.id.rich);
            rvRich.setHasFixedSize(true);

            list.addAll(RichData.getListData());
            showRecyclerList();
        }

        private void showRecyclerList() {
            rvRich.setLayoutManager(new LinearLayoutManager(this));
            RichAdapter listAdapter = new RichAdapter(list);
            rvRich.setAdapter(listAdapter);

            listAdapter.setOnItemClickCallback(new RichAdapter.OnItemClickCallback() {
                @Override
                public void onItemClicked(Rich data) {
                    showSelectedHero(data);
                }
            });
        }



//        private void showRecyclerGrid() {
//            rvRich.setLayoutManager(new GridLayoutManager(this, 2));
//            GridAdapter gridAdapter = new GridAdapter(list);
//            rvRich.setAdapter(gridAdapter);
//
//            gridAdapter.setOnItemClickCallback(new GridAdapter.OnItemClickCallback() {
//                @Override
//                public void onItemClicked(Rich data) {
//                    showSelectedHero(data);
//                }
//            });
//        }

        private void showRecyclerCardView() {
            rvRich.setLayoutManager(new LinearLayoutManager(this));
            CardviewAdapter cardViewHeroAdapter = new CardviewAdapter(list);
            rvRich.setAdapter(cardViewHeroAdapter);
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return super.onCreateOptionsMenu(menu);
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            setMode(item.getItemId());
            return super.onOptionsItemSelected(item);
        }

        public void setMode(int selectedMode) {
            switch (selectedMode) {
                case R.id.about:
                    Intent i = new Intent(MainActivity.this, about.class);
                    startActivity(i);
                    break;

//                case R.id.action_grid:
//                    title = "Mode Grid";
//                    showRecyclerGrid();
//                    break;
//
//                case R.id.action_cardview:
//                    title = "Mode CardView";
//                    showRecyclerCardView();
//                    break;
            }
            setActionBarTitle(title);
        }

        private void setActionBarTitle(String title) {
            if (getSupportActionBar() != null) {
                getSupportActionBar().setTitle(title);
            }
        }

        private void showSelectedHero(Rich rich) {
//            Toast.makeText(this, "Kamu memilih " + rich.getName(), Toast.LENGTH_SHORT).show();
//            rich.getName();
            Intent intent = new Intent(MainActivity.this, activity_Detail.class);
            startActivity(intent);
        }

}