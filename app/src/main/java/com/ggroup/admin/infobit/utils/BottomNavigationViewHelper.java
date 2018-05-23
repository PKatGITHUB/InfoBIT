package com.ggroup.admin.infobit.utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;

import com.ggroup.admin.infobit.Batch.BatchActivity;
import com.ggroup.admin.infobit.Clubs.ClubsActivity;
import com.ggroup.admin.infobit.General.GeneralActivity;
import com.ggroup.admin.infobit.R;
import com.ggroup.admin.infobit.Tnp.TnpActivity;
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

    public static void enableNavigation(final Context context,BottomNavigationViewEx view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_general : //ACTIVITY_NUM = 0
                        Intent intent1 = new Intent(context, GeneralActivity.class);
                        context.startActivity(intent1);
                        break;
                    case R.id.ic_batch : //ACTIVITY_NUM = 1
                        Intent intent2 = new Intent(context, BatchActivity.class);
                        context.startActivity(intent2);
                        break;
                    case R.id.ic_clubs : //ACTIVITY_NUM = 2
                        Intent intent3 = new Intent(context, ClubsActivity.class);
                        context.startActivity(intent3);
                        break;
                    case R.id.ic_tnp : //ACTIVITY_NUM = 3
                        Intent intent4 = new Intent(context, TnpActivity.class);
                        context.startActivity(intent4);
                        break;
                }
                return false;
            }
        });
    }
}
