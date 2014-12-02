package com.jele.brasilapp.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.jele.brasilapp.fragments.AntesDePartirFrag;
import com.jele.brasilapp.fragments.NegociosFrag;

/**
 * Created by Edmundo on 12/1/14.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {
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
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Antes de Partir";
            case 1:
                return "Negocios En Brasil";

        }

        return "not posible";
    }
}
