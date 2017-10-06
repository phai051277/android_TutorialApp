package com.example.phai0512.tutorialapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private ViewPager pager;

    private FragmentPagerAdapter adapter;

    private int currentPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ツールバーをアクションバーとしてセット
        Toolbar toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.mipmap.ic_launcher);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Navigation click", Toast.LENGTH_SHORT).show();
            }
        });
        toolbar.setLogo(R.mipmap.ic_launcher_round);
        toolbar.setTitle("This is title");
        toolbar.setSubtitle("sub-title");

        // pagerオブジェクト作成
        pager = (ViewPager) findViewById(R.id.pager);
        adapter = new HelloInfoViewPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);
        currentPage = 0;
    }

    public void onClickNext(View view) {
        currentPage ++;
        pager.setCurrentItem(currentPage);
    }

    public void onClickGoToTop(View view) {
        currentPage = 0;
        pager.setCurrentItem(currentPage);
    }
}
