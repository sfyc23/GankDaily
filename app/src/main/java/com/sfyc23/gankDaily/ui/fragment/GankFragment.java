package com.sfyc23.gankDaily.ui.fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
//import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sfyc23.gankDaily.R;
import com.sfyc23.gankDaily.android.BaseFragment;
import com.sfyc23.gankDaily.logic.network.Apis;
import com.sfyc23.gankDaily.ui.adapter.GankFragmentPagerAdapter;
import com.sfyc23.gankDaily.ui.model.GankModel;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by leilei on 2016/8/16.
 * 技术类页面
 */
public class GankFragment extends BaseFragment {


    @BindView(R.id.tablayout_gank)
    TabLayout tabLayout;
    @BindView(R.id.view_pager_gank)
    ViewPager viewPager;

    private GankFragmentPagerAdapter pagerAdapter;

//    private List<GankModel> gankModels ;

    public static GankFragment newInstance() {
        GankFragment fragment = new GankFragment();
        return fragment;
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_gank;
    }

    @Override
    protected void initViews(Bundle savedInstanceState) {
//        ViewCompat
        pagerAdapter = new GankFragmentPagerAdapter(mContext.getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);
        viewPager.setOffscreenPageLimit(Apis.getGanHuoCateGory().size());
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    protected void getData() {

    }
}
