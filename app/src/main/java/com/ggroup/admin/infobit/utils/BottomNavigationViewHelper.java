package com.ggroup.admin.infobit.utils;

import android.util.Log;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

/**
 * Created by admin on 22-05-2018.
 */

public class BottomNavigationViewHelper {
    private static final String TAG = "BottomNavigationViewHel";

    public static void setupBottomNavigationViewObject(BottomNavigationViewEx bottomNavigationViewEx){
        Log.d(TAG, "setupBottomNavigationViewObject: setting up BottomNavigationView");
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);
    }
}
