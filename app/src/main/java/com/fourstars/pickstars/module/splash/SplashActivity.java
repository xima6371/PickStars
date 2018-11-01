package com.fourstars.pickstars.module.splash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.fourstars.pickstars.HomeActivity;
import com.fourstars.pickstars.R;
import com.fourstars.pickstars.base.BaseActivity;
import com.gyf.barlibrary.ImmersionBar;

import static com.fourstars.pickstars.util.Preconditions.checkNotNull;

public class SplashActivity extends BaseActivity implements SplashContract.View {

    private SplashContract.Presenter mPresenter;
    private Context mContext;

    private ImageView mIvSplashPic;


    @Override
    protected void initBar(ImmersionBar mImmersionBar) {
        //初始化沉浸状态栏
        mImmersionBar.init();
    }

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_splash;
    }

    @Override
    protected void initView(Bundle saveInstanceState) {
        mContext = this;
        mIvSplashPic = findViewById(R.id.iv_splash_pic);
        mPresenter = new SplashPresenter(this);
        mPresenter.subscribe();

    }

    @Override
    public void showSplashPic() {
        Glide.with(this).load(getResources().getDrawable(R.drawable.splash_pic, getTheme())).into(mIvSplashPic);
    }

    @Override
    public void showHome() {
        Intent intent = new Intent(mContext, HomeActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void setPresenter(SplashContract.Presenter presenter) {
        mPresenter = checkNotNull(presenter);
    }

    @Override
    public void onBackPressed() {
        return;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.unSubscribe();
    }
}
