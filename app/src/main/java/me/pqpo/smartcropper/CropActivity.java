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
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import me.pqpo.smartcropperlib.view.CropImageView;

public class CropActivity extends AppCompatActivity{


    CropImageView ivCrop;
    Button btnCancel;
    Button btnOk;
    public static Bitmap imageCroped;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crop);
        ivCrop = findViewById(R.id.iv_crop);
        btnCancel = findViewById(R.id.btn_cancel);
        btnOk = findViewById(R.id.btn_ok);
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(RESULT_CANCELED);
                finish();
            }
        });
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                if (ivCrop.canRightCrop()) {
                    Bitmap crop = ivCrop.crop();
                    if (crop != null) {
                        imageCroped = crop;
                        startActivity(new Intent(CropActivity.this, MainActivity.class));
                    } else {
                        Toast.makeText(CropActivity.this, "cannot crop correctly", Toast.LENGTH_SHORT).show();
                    }
                    finish();
                } else {
                    Toast.makeText(CropActivity.this, "cannot crop correctly", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Bitmap selectedBitmap = Camera_capture.bitmap;
        ivCrop.setImageToCrop(selectedBitmap);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

}
