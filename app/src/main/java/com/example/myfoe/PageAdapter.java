package com.example.myfoe;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {
    int numCount;

    public PageAdapter(@NonNull FragmentManager fm, int numCount) {
        super(fm);
        this.numCount = numCount;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    LGFA lgfa = new LGFA();
                    return lgfa;
                case 1:
                    GFA gfa = new GFA();
                    return gfa;
                case 2:
                    GFB gfb = new GFB();
                    return gfb;
                case 3:
                    GFC gfc = new GFC();
                    return gfc;
                case 4:
                    FFA ffa = new FFA();
                    return ffa;
                case 5:
                    FFB ffb = new FFB();
                    return ffb;
                case 6:
                    FFC ffc = new FFC();
                    return ffc;
                case 7:
                    SFA sfa = new SFA();
                    return sfa;
                case 8:
                    SFB sfb = new SFB();
                    return sfb;
                case 9:
                    SFC sfc = new SFC();
                    return sfc;
                case 10:
                    TFA tfa = new TFA();
                    return tfa;
                case 11:
                    TFB tfb = new TFB();
                    return tfb;
                case 12:
                    TFC tfc = new TFC();
                    return tfc;
            }
        return null;
    }

    @Override
    public int getCount() {
        return numCount;
    }
}
