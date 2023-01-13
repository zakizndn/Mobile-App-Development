package com.example.myfoe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class FloorPlan extends AppCompatActivity implements TabLayout.OnTabSelectedListener {
private TabLayout tabLayout;
private ViewPager viewpager;
private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floor_plan);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Floor Plan");
        setSupportActionBar(toolbar);

        tabLayout = findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("."));
        tabLayout.addTab(tabLayout.newTab().setText("."));
        tabLayout.addTab(tabLayout.newTab().setText("."));
        tabLayout.addTab(tabLayout.newTab().setText("."));
        tabLayout.addTab(tabLayout.newTab().setText("."));
        tabLayout.addTab(tabLayout.newTab().setText("."));
        tabLayout.addTab(tabLayout.newTab().setText("."));
        tabLayout.addTab(tabLayout.newTab().setText("."));
        tabLayout.addTab(tabLayout.newTab().setText("."));
        tabLayout.addTab(tabLayout.newTab().setText("."));
        tabLayout.addTab(tabLayout.newTab().setText("."));
        tabLayout.addTab(tabLayout.newTab().setText("."));
        tabLayout.addTab(tabLayout.newTab().setText("."));
        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);

        viewpager = findViewById(R.id.viewpager);
        PageAdapter adapter = new PageAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewpager.setAdapter(adapter);
        tabLayout.setOnTabSelectedListener(this);
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewpager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}