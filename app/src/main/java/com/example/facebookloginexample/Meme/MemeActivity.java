package com.example.facebookloginexample.Meme;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.inputmethod.InputMethodManager;


public class MemeActivity extends AppCompatActivity implements TopSectionFragment.TopSectionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meme);
    }

    //Called in the Top fragment when the user clicks button
    @Override
    public void createMeme(String top, String bottom) {
        hideSoftKeyboard();
        System.out.print("Inside Meme Activity after top fragment click");
        BottomSectionFragment bottomSectionFragment = (BottomSectionFragment)getSupportFragmentManager().findFragmentById(R.id.fragment2);
        bottomSectionFragment.setMeme(top, bottom);

    }

    private void hideSoftKeyboard() {
        InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
    }

}
