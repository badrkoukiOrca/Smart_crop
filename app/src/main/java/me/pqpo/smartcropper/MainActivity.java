/*
 * Copyright (c) 2019 by Kouki Badr
 * All rights reserved.
 *
 * https://kbadr.github.io/
 *
 */

package me.pqpo.smartcropper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    ImageView ivShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivShow = findViewById(R.id.iv_show);
        ivShow.setImageBitmap(CropActivity.imageCroped);
    }

}
