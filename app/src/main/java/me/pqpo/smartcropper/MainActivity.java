/*
 * Copyright (c) 2019 by Kouki Badr
 * All rights reserved.
 *
 * https://kbadr.github.io/
 *
 */

package me.pqpo.smartcropper;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    Button btnTake;
    Button btnSelect;
    ImageView ivShow;

    File photoFile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTake = (Button) findViewById(R.id.btn_take);
        btnSelect = (Button) findViewById(R.id.btn_select);
        ivShow = (ImageView) findViewById(R.id.iv_show);

        ivShow.setImageBitmap(CropActivity.imageCroped);
    }

    /*@Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode != RESULT_OK) {
            return;
        }
        if (requestCode == 100 && photoFile.exists()) {
            Bitmap bitmap = BitmapFactory.decodeFile(photoFile.getPath());
            ivShow.setImageBitmap(bitmap);
        }
    }*/
}
