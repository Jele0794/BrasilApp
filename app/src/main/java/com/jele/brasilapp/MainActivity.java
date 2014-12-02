package com.jele.brasilapp;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;

import com.jele.brasilapp.adapters.ViewPagerAdapter;
import com.jele.brasilapp.view.SlidingTabLayout;


public class MainActivity extends ActionBarActivity {

    private ViewPager pager;
    private ViewPagerAdapter adapter;
    private SlidingTabLayout slidingTab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.my_awesome_toolbar);
        setSupportActionBar(toolbar);

        pager = (ViewPager) findViewById(R.id.pager);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);

        slidingTab = (SlidingTabLayout) findViewById(R.id.sliding_tabs);
        slidingTab.setViewPager(pager);

    }


}
