package com.vaibhavmojidra.androidjavademohilt;

import android.util.Log;

import javax.inject.Inject;

public class PlayGame {
    SmartPhone smartPhone;
    Game game;
    @Inject
    public PlayGame(SmartPhone smartPhone, Game game) {
        this.smartPhone = smartPhone;
        this.game = game;
        Log.i("MyTag","SmartPhone class initialized.");
        smartPhone.isSmartPhoneAvailable();
        game.isGameDownloaded();
    }

    void playGame(){
        Log.i("MyTag","Start playing....");
    }
}
