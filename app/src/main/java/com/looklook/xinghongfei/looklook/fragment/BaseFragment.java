package com.looklook.xinghongfei.looklook.fragment;

import android.support.v4.app.Fragment;
import android.util.Log;

/**
 * Created by xinghongfei on 16/8/17.
 */
public class BaseFragment extends Fragment {


    void logCache(String methodName) {
        Runtime runtime = Runtime.getRuntime();
        float totalMemory = runtime.totalMemory() / 1024.0f / 1024.0f;
        Log.e("logCache-" + methodName, "totalMemory:" + totalMemory);

    }
}
