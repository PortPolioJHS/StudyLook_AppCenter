package com.c.studyroominfo;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

//도서관 스터디룸 예약페이지 - webview, html

public class StudyRoomLibReserv extends Fragment {

    private View view;

    public StudyRoomLibReserv () {
        }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
            view = inflater.inflate(R.layout.activity_study_room_lib_reserv, null);

            final WebView mWebView = (WebView) view.findViewById(R.id.webView);

              WebSettings webSettings = mWebView.getSettings();
              webSettings.setJavaScriptEnabled(true);

              mWebView.clearCache(true);
              mWebView.clearHistory();



              mWebView.getSettings().setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);

        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        cookieManager.setAcceptThirdPartyCookies(mWebView, true);
        cookieManager.removeAllCookie();

        if (savedInstanceState == null) {
            mWebView.post(new Runnable() {
                @Override
                public void run() {
                    mWebView.loadUrl("file:///android_asset/StudyRoomLibRes.html");
                }
            });
        }
        mWebView.setWebChromeClient(new WebChromeClient());
        return view;
        }

}