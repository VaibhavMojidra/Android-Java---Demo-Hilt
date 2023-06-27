package com.vaibhavmojidra.androidjavademohilt;

import android.util.Log;

import javax.inject.Inject;

public class SmartPhone {
    @Inject
    public SmartPhone() {
        Log.i("MyTag","SmartPhone class initialized.");
    }

    void isSmartPhoneAvailable(){
        Log.i("MyTag","SmartPhone is available.");
    }
}
