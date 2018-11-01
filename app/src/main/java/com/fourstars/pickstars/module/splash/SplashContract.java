package com.fourstars.pickstars.module.splash;

import com.fourstars.pickstars.base.BasePresenter;
import com.fourstars.pickstars.base.BaseView;

public class SplashContract {

    public interface View extends BaseView<Presenter> {
        void showSplashPic();

        void showHome();
    }

    public interface Presenter extends BasePresenter {
        void loadSplashPic();

        void turnToHome();
    }
}
