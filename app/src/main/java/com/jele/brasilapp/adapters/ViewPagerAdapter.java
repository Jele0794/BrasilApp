package com.jele.brasilapp.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.jele.brasilapp.fragments.AntesDePartirFrag;
import com.jele.brasilapp.fragments.NegociosFrag;
import com.jele.brasilapp.model.TabsNames;

/**
 * Created by Edmundo on 12/1/14.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    TabsNames tabsNames = new TabsNames();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new AntesDePartirFrag();
            case 1:
                return new NegociosFrag();

        }

        return null;

    }

    @Override
    public int getCount() {
        return tabsNames.tabsNames.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return tabsNames.tabsNames[position];

    }
}
