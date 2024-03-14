package com.example.tabbedvkladki.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.tabbedvkladki.FirstActivity;
import com.example.tabbedvkladki.FourthActivity;
import com.example.tabbedvkladki.R;
import com.example.tabbedvkladki.SecondActivity;
import com.example.tabbedvkladki.ThirdActivity;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3, R.string.tab_text_4};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                FirstActivity Tab1 = new FirstActivity();
                return Tab1;
            case 1:
                SecondActivity Tab2 = new SecondActivity();
                return Tab2;
            case 2:
                ThirdActivity Tab3 = new ThirdActivity();
                return Tab3;
            case 3:
                FourthActivity Tab4 = new FourthActivity();
                return Tab4;
        }
        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 4 total pages.
        return 4;
    }
}