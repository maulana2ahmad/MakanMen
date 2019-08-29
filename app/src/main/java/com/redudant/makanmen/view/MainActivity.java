package com.redudant.makanmen.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.redudant.makanmen.R;
import com.redudant.makanmen.adapter.ListMakananBetawiAdapter;
import com.redudant.makanmen.fragment.ProfileFragment;
import com.redudant.makanmen.model.MenuMakanan;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvMakananBetawi;
    private ArrayList<MenuMakanan> listMakananBetawi = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMakananBetawi = (RecyclerView) findViewById(R.id.rv_menuTradisionalBetawi);
        rvMakananBetawi.setHasFixedSize(true);

        listMakananBetawi.addAll(MakananBetawi.getListmakanan());
        showRecyclerViewLit();

    }

    private void showRecyclerViewLit() {

        rvMakananBetawi.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        ListMakananBetawiAdapter listMakananBetawiAdapter = new ListMakananBetawiAdapter(listMakananBetawi);
        rvMakananBetawi.setAdapter(listMakananBetawiAdapter);
    }

    //get layout menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        setMode(item.getItemId());

        return super.onOptionsItemSelected(item);
    }

    private void setMode(int itemId) {
        switch (itemId)
        {
            case R.id.prifile:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frame, new ProfileFragment())
                        .addToBackStack(null)
                        .commit();

                break;
        }
    }

}
