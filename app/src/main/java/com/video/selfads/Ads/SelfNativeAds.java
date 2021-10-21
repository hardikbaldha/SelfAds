package com.video.selfads.Ads;

import static com.video.selfads.Ads.SelfeAds.Native;
import static com.video.selfads.Ads.SelfeAds.full_pos;
import static com.video.selfads.Ads.SelfeAds.isSelfNativeLoaded;
import static com.video.selfads.Ads.SelfeAds.native_pos;
import static com.video.selfads.Ads.SelfeAds.nativefail;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.video.selfads.MyApplication;
import com.video.selfads.R;
import com.video.selfads.model.NativeArray;
import com.vincan.medialoader.DefaultConfigFactory;
import com.vincan.medialoader.MediaLoader;
import com.vincan.medialoader.MediaLoaderConfig;
import com.vincan.medialoader.data.file.naming.HashCodeFileNameCreator;
import com.vincan.medialoader.download.DownloadListener;
import com.yqritc.scalablevideoview.ScalableVideoView;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class SelfNativeAds {
    Activity activity;
NativeAdLoadCallback nativeAdLoadCallback;
    boolean isLoaded;
    private MediaLoader mMediaLoader;
    //    ArrayList<NativeArray> nativeArrays = new ArrayList<>();
    private com.video.selfads.Ads.NativeContentCallback nativeContentCallback;


    public SelfNativeAds(Activity activity) {
        this.activity = activity;
    }

    public void load(Activity activity, NativeAdLoadCallback nativeAdLoadCallback) {
        this.activity = activity;
        this.nativeAdLoadCallback = nativeAdLoadCallback;
        if (isSelfNativeLoaded){
            this.nativeAdLoadCallback.onAdLoaded();
        }else {
            this.nativeAdLoadCallback.onAdFailedToLoad("fail : " + nativefail);
        }
    }

    public boolean isLoaded() {
        return isLoaded;
    }



    public NativeContentCallback getNativeContentCallback() {
        return nativeContentCallback;
    }

    public void setNativeContentCallback(NativeContentCallback nativeContentCallback) {
        this.nativeContentCallback = nativeContentCallback;
    }
}
