package com.example.devendratadiyal.tabfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Devendra Tadiyal on 2/1/2018.
 */

public class TabPagerAdapter extends FragmentStatePagerAdapter {

    String array[] = new String[]{"One","Two","Three"};
    Integer integer =3;

    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
    }
@Override
    public CharSequence getPageTitle(int position)
    {
return array[position];
    }

    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0:
                One o = new One();
                return o;
            case 1:
                Two o1 = new Two();
                return o1;
            case 2:
                Three o2 = new Three();
                return o2;


        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
