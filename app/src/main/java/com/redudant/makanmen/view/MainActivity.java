package com.redudant.makanmen.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.redudant.makanmen.R;
import com.redudant.makanmen.fragment.ProfileFragment;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



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
