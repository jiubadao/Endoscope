package pl.hypeapp.endoscope.view;

import net.grandcentrix.thirtyinch.TiView;
import net.grandcentrix.thirtyinch.callonmainthread.CallOnMainThread;

public interface InputIpView extends TiView {

    @CallOnMainThread
    void intentToPlayStreamActivity(String ipAddress);

    @CallOnMainThread
    void onWrongIpAddress();
}
