package com.ldroid.aidlserver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class MyService extends Service {

    private MyBinder mMyBinder;

    public MyService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mMyBinder = new MyBinder();
        System.out.println("myservice onCreate");
    }

    @Override
    public IBinder onBind(Intent intent) {
        System.out.println("myservice onBind");
        return mMyBinder;
    }


    public class MyBinder extends IMyAidlInterface.Stub {

        @Override
        public String getMyName() throws RemoteException {
            System.out.println("someone connect me");
            return "ngliaxl";
        }
    }
}
