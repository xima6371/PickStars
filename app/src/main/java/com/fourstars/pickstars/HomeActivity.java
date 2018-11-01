package com.fourstars.pickstars;

import android.os.Bundle;

import com.fourstars.pickstars.base.BaseActivity;
import com.gyf.barlibrary.ImmersionBar;

public class HomeActivity extends BaseActivity {


    @Override
    protected void initBar(ImmersionBar mImmersionBar) {
        //设置沉浸栏字体为深色
        mImmersionBar.statusBarDarkFont(true).init();
    }

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_home;
    }

    @Override
    protected void initView(Bundle saveInstanceState) {

    }


}
