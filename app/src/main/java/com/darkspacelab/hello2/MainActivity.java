package com.darkspacelab.hello2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Palladyn palladyn = new Palladyn("Mietek");
        palladyn.setWalczace(new WalczaceMlotem());
        // Tutaj wstawiamy kod z czymsc ciekawym

        palladyn.setZagrozenie(true);

        palladyn.biegaj();
        palladyn.dzialaj();
        // Tutaj wstawiamy kod z czymsc ciekawym

        palladyn.setWalczace(new WalczaceSztyletem());
        // Tutaj wstawiamy kod z czymsc ciekawym

        palladyn.biegaj();
        palladyn.dzialaj();



    }
}
