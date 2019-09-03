package com.redudant.makanmen.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.redudant.makanmen.R;
import com.redudant.makanmen.adapter.ListMakananBetawiAdapter;
import com.redudant.makanmen.model.MenuMakanan;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvMakananBetawi;
    private ArrayList<MenuMakanan> listMakananBetawi = new ArrayList<>();

    private String title = "List Daftar Menu";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMakananBetawi = (RecyclerView) findViewById(R.id.rv_menuTradisionalBetawi);
        rvMakananBetawi.setHasFixedSize(true);

        listMakananBetawi.addAll(MakananBetawi.getListmakanan());

        showRecyclerViewLit();

        setActionbarTile(title);

    }

    private void setActionbarTile(String title){

        if (getSupportActionBar() != null)
        {
            getSupportActionBar().setTitle(title);
        }
    }

    private void showRecyclerViewLit() {

        //this is data horizontall
        //rvMakananBetawi.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false));

        rvMakananBetawi.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        ListMakananBetawiAdapter listMakananBetawiAdapter = new ListMakananBetawiAdapter(listMakananBetawi);
        rvMakananBetawi.setAdapter(listMakananBetawiAdapter);

        listMakananBetawiAdapter.setOnItemClickCallback(new ListMakananBetawiAdapter.OnItemClickCallback() {
            @Override
            public void onItemCallbacked(MenuMakanan menuMakanan) {

                showSelectedMakananBetawi(menuMakanan);
            }
        });

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
                startActivity(new Intent(MainActivity.this, ProfileActivity.class));
                break;
        }
    }

    private void showSelectedMakananBetawi(MenuMakanan menuMakanan) {

        Toast.makeText(this, "Kamu memilih " + menuMakanan.getTitle(), Toast.LENGTH_SHORT).show();
        //getSupportActionBar().setTitle(menuMakanan.getTitle());

        Intent intent = new Intent(getApplicationContext(), DetileMakananActivity.class);
        intent.putExtra("image_url", menuMakanan.getPhoto());
        intent.putExtra("title", menuMakanan.getTitle());
        intent.putExtra("subtitle", menuMakanan.getSubtitle());
        intent.putExtra("description", menuMakanan.getDesription());
        startActivity(intent);
    }

}