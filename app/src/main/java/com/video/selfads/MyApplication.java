package com.video.selfads;

import static android.Manifest.permission.READ_EXTERNAL_STORAGE;
import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.multidex.MultiDexApplication;

import com.video.selfads.model.InterTitialArray;
import com.video.selfads.model.NativeArray;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class MyApplication extends MultiDexApplication {
    public static String fileN = null;
    private static final int PERMISSION_REQUEST_CODE = 200;
    private static final String TAG = MyApplication.class.getSimpleName();
    public static Context context;
    private static MyApplication mInstance;
    public static String question;
    public static String Answers;
    public static String question_id;
    public static String Native_url;
    public static String Full_Url;
    public static String old_Url;
    public static int Pos;
    public static File MainFolder;
    public static boolean native_aBoolean = false;
    public static boolean full_aBoolean = false;




    public static String Full_new = "";





    public static Context getContext() {
        return context;
    }

    public MyApplication() {
    }

    public static synchronized MyApplication getInstance() {
        MyApplication myApplication;
        Class<MyApplication> cls = MyApplication.class;
        synchronized (cls) {
            synchronized (cls) {
                myApplication = mInstance;
            }
        }
        return myApplication;
    }

    public void onCreate() {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        context = getApplicationContext();
        super.onCreate();
        mInstance = this;
    }

    public static int randomItemFull(ArrayList<InterTitialArray> arr_data) {
        Random random = new Random();
        int index = random.nextInt(arr_data.size());
        return index;
    }

    public static int randomItemNative(ArrayList<NativeArray> arr_data) {
        Random random = new Random();
        int index = random.nextInt(arr_data.size());
        return index;
    }
}