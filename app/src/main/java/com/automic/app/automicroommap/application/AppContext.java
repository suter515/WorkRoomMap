package com.automic.app.automicroommap.application;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.automic.app.automicroommap.DaoMaster;
import com.automic.app.automicroommap.DaoSession;

/**
 * 类注释：
 * Created by sujingtai on 2017/6/30 0030 上午 11:29
 */

public class AppContext extends Application {
    private static DaoSession daoSession;
    @Override
    public void onCreate() {
        super.onCreate();
        setupDatabase();


    }

    private void setupDatabase() {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "employees.db", null);
        SQLiteDatabase db = helper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();
    }
    public static DaoSession getDaoInstant() {
        return daoSession;
    }
}
