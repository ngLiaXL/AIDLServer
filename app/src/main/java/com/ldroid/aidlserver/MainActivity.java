package com.ldroid.aidlserver;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * 1、新建aidl server aidl client 两个工程
 * 2、server 新建 xxx.aidl 文件 rebuild 后app/generated/source/aidl/debug 会生成xxx.java 接口文件
 * 3、client 新建xxx.aidl 包名要和server端包名一致，工程main目录新建aidl目录，aidl目录新建包，包名是server的aidl文件包名
 * 4、编写server端远程service
 * 5、client端调用service
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}
