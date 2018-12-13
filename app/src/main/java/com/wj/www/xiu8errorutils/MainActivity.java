package com.wj.www.xiu8errorutils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wj.base.errorprocess.ErrorUtils;
import com.wj.base.errorprocess.IErrorProcess;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initErrorProcess();
    }

    private void initErrorProcess() {
        //默认处理
        ErrorUtils.getInstance().setDefaultProcess(new IErrorProcess() {
            @Override
            public void error(String errorCode, String errorMsg) {
            }
        });
        //RefreshToken失效
        ErrorUtils.getInstance().registerErrorProcessDef(new IErrorProcess() {
            @Override
            public void error(String errorCode, String errorMsg) {
            }
        }, ServerCode.ERRORCODE_LOGIN_ONOTHERDEVICE);
        //余额不足统一处理
        ErrorUtils.getInstance().registerErrorProcessDef(new IErrorProcess() {
            @Override
            public void error(String errorCode, String errorMsg) {

            }
        }, ServerCode.ERRORCODE_BALANCE_NOTENOUGH);
    }
}
