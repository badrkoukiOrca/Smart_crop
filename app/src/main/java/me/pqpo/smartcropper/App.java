/*
 * Copyright (c) 2019 by Kouki Badr
 * All rights reserved.
 *
 * https://kbadr.github.io/
 *
 */

package me.pqpo.smartcropper;

import android.app.Application;

import me.pqpo.smartcropperlib.SmartCropper;


public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SmartCropper.buildImageDetector(this);
    }
}
