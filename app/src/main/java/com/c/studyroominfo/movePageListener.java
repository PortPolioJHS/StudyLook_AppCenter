package com.c.studyroominfo;

import android.view.View;
import android.widget.LinearLayout;

import androidx.viewpager.widget.ViewPager;

public class movePageListener implements View.OnClickListener {

    LinearLayout ll_main;
    ViewPager viewPager_main;
    Main main;

    @Override
    public void onClick(View view) {
        ll_main = main.findViewById(R.id.ll);
        viewPager_main = main.findViewById(R.id.viewPager);

        viewPager_main.setCurrentItem(2);
    }
}
