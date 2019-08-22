package com.padcmyanmar.padc9.end_module1_assignment.activities;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.view.View;

import com.padcmyanmar.padc9.end_module1_assignment.R;
import com.padcmyanmar.padc9.end_module1_assignment.fragments.NavigationSearchFragment;
import com.padcmyanmar.padc9.end_module1_assignment.fragments.NearbyFragment;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            ConstraintLayout constraintLayout = findViewById(R.id.constraintLayout);
            AppBarLayout appBarLayout = findViewById(R.id.appBarLayout);

            switch (item.getItemId()) {
                case R.id.navigation_home:

                    constraintLayout.setVisibility(View.VISIBLE);
                    appBarLayout.setVisibility(View.VISIBLE);

                    goToFragment(new NearbyFragment());
                    break;

                case R.id.navigation_search:

                    constraintLayout.setVisibility(View.GONE);
                    appBarLayout.setVisibility(View.GONE);

                    goToFragment(new NavigationSearchFragment());
                    break;

                case R.id.navigation_note:

                    constraintLayout.setVisibility(View.VISIBLE);
                    appBarLayout.setVisibility(View.VISIBLE);

                    goToFragment(new NearbyFragment());
                    break;

                case R.id.navigation_save:

                    constraintLayout.setVisibility(View.VISIBLE);
                    appBarLayout.setVisibility(View.VISIBLE);

                    goToFragment(new NearbyFragment());
                    break;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        goToFragment(new NearbyFragment());

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            Fragment fragment = null;
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch(tab.getPosition()){
                    case 0:
                        fragment = new NearbyFragment();
                        break;

                    case 1:
                        fragment = new NearbyFragment();
                        break;

                    case 2:
                        fragment = new NearbyFragment();
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void goToFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_Layout, fragment)
                .commit();
    }
}
