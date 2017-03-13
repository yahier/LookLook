package com.looklook.xinghongfei.looklook.fragment;

import android.support.v4.app.Fragment;
import android.util.Log;

/**
 * Created by xinghongfei on 16/8/17.
 */
public class BaseFragment extends Fragment {
    // TODO: 16/9/1


    void logCache(String methodName) {
        Runtime runtime = Runtime.getRuntime();
        long freeMemory = runtime.freeMemory();
        Log.e("logCache-" + methodName, "freeMemory:" + freeMemory);

    }
}
