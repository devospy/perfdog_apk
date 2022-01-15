package com.ytl.perfdog;

import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.ytl.perfdog.bean.AppInfoBean;
import com.ytl.perfdog.utils.AppUtils;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private final String TAG = this.getClass().getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "create...");
        AppUtils appUtils = new AppUtils(this);
        List<AppInfoBean> appInfoBeanList = appUtils.getAllInstalledAppInfo();
        for (AppInfoBean appInfoBean : appInfoBeanList){
            Log.d(TAG, appInfoBean.getAppName());
        }
    }
}