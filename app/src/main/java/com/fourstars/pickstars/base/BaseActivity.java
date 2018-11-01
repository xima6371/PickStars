package com.fourstars.pickstars.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.gyf.barlibrary.ImmersionBar;

public abstract class BaseActivity extends AppCompatActivity {

    private ImmersionBar mImmersionBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mImmersionBar = ImmersionBar.with(this);
        initBar(mImmersionBar);

        if (getLayoutResID() != 0) {
            setContentView(getLayoutResID());
            initView(savedInstanceState);
        }

    }

    /**
     * 配置状态栏属性
     * @param mImmersionBar 
     */
    protected abstract void initBar(ImmersionBar mImmersionBar);

    /**
     * @return 返回布局ID
     */
    protected abstract int getLayoutResID();

    /**
     * 初始化View,处理Bundle
     *
     * @param saveInstanceState
     */
    protected abstract void initView(Bundle saveInstanceState);

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mImmersionBar != null)
            mImmersionBar.destroy();
    }
}
