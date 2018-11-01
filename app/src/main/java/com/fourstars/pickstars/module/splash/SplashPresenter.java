package com.fourstars.pickstars.module.splash;

import android.os.Handler;

import com.fourstars.pickstars.util.Preconditions;

public class SplashPresenter implements SplashContract.Presenter {

    private SplashContract.View mSplashView;

    public SplashPresenter(SplashContract.View splashView) {
        mSplashView = Preconditions.checkNotNull(splashView, "splashView 不能为Null");
        mSplashView.setPresenter(this);
    }

    @Override
    public void loadSplashPic() {
        mSplashView.showSplashPic();
    }

    @Override
    public void turnToHome() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mSplashView.showHome();
            }
        }, 2500);

    }

    @Override
    public void subscribe() {
        loadSplashPic();
        turnToHome();
    }

    @Override
    public void unSubscribe() {
        mSplashView = null;
    }
}
