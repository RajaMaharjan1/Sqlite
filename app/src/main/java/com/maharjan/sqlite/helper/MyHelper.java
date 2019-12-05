package com.maharjan.sqlite.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyHelper extends SQLiteOpenHelper {
    private static final String db_name = "Dictionary";
    private static final int db_version = 1;

    //Table name
    private static final String tblName = "tblWord";

    //Column
    private static final String wordId = "wordId";
    private static final String wordName = "wordName";
    private static final String meaning = "meaning";

    public MyHelper(@Nullable Context context) {
        super(context, db_name, null, db_version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}