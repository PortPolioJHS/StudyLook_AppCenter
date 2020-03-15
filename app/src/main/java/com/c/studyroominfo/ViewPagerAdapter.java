package com.c.studyroominfo;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:{
                return new StudyRoomMap();
            }
            case 1:{
                return new StudyRoomList();
            }
            case 2:{
                return new StudyRoomLibReserv();
            }
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }


}
