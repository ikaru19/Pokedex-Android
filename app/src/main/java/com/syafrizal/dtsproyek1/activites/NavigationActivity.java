package com.syafrizal.dtsproyek1.activites;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.syafrizal.dtsproyek1.R;
import com.syafrizal.dtsproyek1.fragments.ItemsFragment;
import com.syafrizal.dtsproyek1.fragments.PokemonsFragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.MenuItem;
import android.widget.TextView;

public class NavigationActivity extends AppCompatActivity {
    private TextView mTextMessage;
    private TextView textViewTitle;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_pokemon:
                    loadFragment(new PokemonsFragment());
                    textViewTitle.setText("Pokemon");
                    return true;
                case R.id.navigation_items:
                    loadFragment(new ItemsFragment());
                    textViewTitle.setText("Items");
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        BottomNavigationView navView = findViewById(R.id.nav_view);

        textViewTitle = findViewById(R.id.textViewTitle);

        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navView.setSelectedItemId(R.id.navigation_pokemon);
    }

    private void loadFragment(Fragment fragment){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,fragment);
        fragmentTransaction.commit();
    }

}
