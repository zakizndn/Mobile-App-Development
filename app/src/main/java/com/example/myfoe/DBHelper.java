package com.example.myfoe;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DBNAME = "Login.db";
    public DBHelper(Context context) {
        super(context, "Login.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table members(StudentID TEXT primary key, Password TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists members");
    }

    public Boolean insertData(Integer StudentID, String Password) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("StudentID", StudentID);
        values.put("Password", Password);

        long result = db.insert("members", null, values);
        if(result == -1) return false;
        else
            return true;
    }

    public Boolean checkStudentID(String StudentID) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from members where StudentID=?", new String[] {StudentID});
        if(cursor.getCount() > 0)
            return true;
        else
            return false;
    }

    public Boolean checkStudentIDPassword(String StudentID, String Password) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from members where StudentID=? and Password=?", new String[] {StudentID, Password});
        if(cursor.getCount() > 0)
            return true;
        else
            return false;
    }

}
