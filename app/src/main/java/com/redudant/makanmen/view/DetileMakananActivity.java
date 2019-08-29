package com.redudant.makanmen.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.redudant.makanmen.R;
import com.redudant.makanmen.model.MenuMakanan;

public class DetileMakananActivity extends AppCompatActivity {

    private ImageView ivImageCover;
    private TextView tv_title, tv_submenu, tv_description;

    private static final String TAG = "DetileMakananActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detile_makanan);

        Log.d(TAG, "onCreate: started");

        ivImageCover =(ImageView) findViewById(R.id.iv_imageCover);
        tv_title = (TextView) findViewById(R.id.tv_title);
        tv_submenu = (TextView) findViewById(R.id.tv_submenu);
        tv_description = (TextView) findViewById(R.id.tv_description);


        MenuMakanan menuMakanan = new MenuMakanan();


    }
}
