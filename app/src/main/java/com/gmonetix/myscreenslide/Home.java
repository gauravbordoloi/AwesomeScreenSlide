package com.gmonetix.myscreenslide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import me.relex.circleindicator.CircleIndicator;

public class Home extends AppCompatActivity {

    private ViewPager viewPager;

    private PagerAdapter adapter;
    private CircleIndicator circleIndicator;

    private int[] imageIds;
    private String[] texts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        circleIndicator =(CircleIndicator) findViewById(R.id.slide_indicator);

        imageIds = new int[] {R.drawable.slide1,R.drawable.slide2,R.drawable.slide3};
        texts = new String[]{"This time\nLet's do it in a different way\n\nWalk more.Ride more\nDrive less\n\nShare more\nConsume less",
                "We provide bike sharing services\n\nMake your short trips\nMore convenient than ever\n\nGet on a ride\nAnytime. Anywhere",
                "No docking stations\n\nYou may park the bike anywhere allowed by law\n\nMake sure it can be easily found\nby others for future use\n\nHAVE A NICE RIDE"};

        adapter = new MyFragmentPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        circleIndicator.setViewPager(viewPager);

    }

    class MyFragmentPagerAdapter extends FragmentStatePagerAdapter{

        public MyFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Demo demo = new Demo();
            demo.getData(imageIds[position],texts[position]);
            return demo;
        }

        @Override
        public int getCount() {
            return 3;
        }

    }

}
