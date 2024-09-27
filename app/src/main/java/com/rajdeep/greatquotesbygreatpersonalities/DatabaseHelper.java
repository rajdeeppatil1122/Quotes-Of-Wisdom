package com.rajdeep.greatquotesbygreatpersonalities;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.util.Log;

import androidx.annotation.Nullable;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DB_NAME = "QuotesDatabase";
    public static final int DB_VERSION = 1;
    public static final String TABLE_LIKE = "LikeTable";
    public static final String LIKE_ID = "id";
    public static final String RDM_IMAGE_NO = "rdm_img_no";
    public static final String RDM_TEXTVIEW_NO = "rdm_textview_no";
    public static final String ARRAY_FLAG_NO = "array_flag_no";

    public static final String TABLE_STYLE = "StyleTable";
    public static final String STYLE_ID = "id";
    public static final String FONT_STYLE = "fontstyle";
    public static final String BACKGROUND_IMAGE_OF_QUOTE_ACTIVITY = "back_image_quote_act";


    public DatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    // Executes only once in the life cycle of an android application...
    @Override
    public void onCreate(SQLiteDatabase db) {

//        CREATE TABLE LikeTable (id INTEGER PRIMARY KEY AUTOINCREMENT, rdm_img_no INTEGER, rdm_textview_no INTEGER, array_flag_no INTEGER)
        db.execSQL("CREATE TABLE " + TABLE_LIKE + " (" + LIKE_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + RDM_IMAGE_NO + " INTEGER, " + RDM_TEXTVIEW_NO + " INTEGER, " + ARRAY_FLAG_NO + " INTEGER" + ")");
        Log.d(">>>>>>>>>>>>>>>>>>", "Table created!!!!!!!!!!!!!");

        db.execSQL("CREATE TABLE " + TABLE_STYLE + " (" + STYLE_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + FONT_STYLE + " TEXT, " + BACKGROUND_IMAGE_OF_QUOTE_ACTIVITY + " TEXT" + ")");


        // Adding FONT-STYLE when the database is created (with default image and font style)
        ContentValues cv = new ContentValues();

        cv.put(FONT_STYLE, 1);
        cv.put(BACKGROUND_IMAGE_OF_QUOTE_ACTIVITY, 10);
        db.insert(TABLE_STYLE, null, cv);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // db.execSQL("DROP TABLE IF EXISTS " + TABLE_LIKE);    // This will remove the old table
        // onCreate(db);      // This method is used to make a newer version of a table.

    }



    public boolean isPresent(int rdm_textview_no, int array_flag_no) {
        SQLiteDatabase database = this.getWritableDatabase();

        Cursor cursor = database.rawQuery("SELECT * FROM " + TABLE_LIKE, null);

        // Ensuring that the random textview number and array flag number is already present in the database or not. If present, then don't add again.
        while (cursor.moveToNext()) {

            int rdm_textview_no_inner = cursor.getInt(2);         // i  <--- means column index.
            int array_flag_no_inner = cursor.getInt(3);

            if (rdm_textview_no_inner == rdm_textview_no && array_flag_no_inner == array_flag_no) {
                return true;
            }
        }       // while loop ends

        return false;
    }


    public ArrayList<PostModel> makeArrayList(){
        SQLiteDatabase database = this.getWritableDatabase();

        ArrayList<PostModel> arrayList = new ArrayList<>();  // initialized

        Cursor cursor = database.rawQuery("SELECT * FROM " + TABLE_LIKE, null);

        while(cursor.moveToNext()){
            int rdm_imageview_no_inner = cursor.getInt(1);
            int rdm_textview_no_inner = cursor.getInt(2);         // i  <--- means column index.
            int array_flag_no_inner = cursor.getInt(3);

            arrayList.add(new PostModel("bg" + rdm_imageview_no_inner, rdm_textview_no_inner, array_flag_no_inner));
        }

        Log.d("SIZEEEEEEEEEEEEEEEEE", String.valueOf(arrayList.size()));
        return arrayList;
    };;




    public void insertLike(int rdm_img_no, int rdm_textview_no, int array_flag_no) {

        SQLiteDatabase database = this.getWritableDatabase();


        ContentValues contentValues = new ContentValues();
        contentValues.put(RDM_IMAGE_NO, rdm_img_no);
        contentValues.put(RDM_TEXTVIEW_NO, rdm_textview_no);
        contentValues.put(ARRAY_FLAG_NO, array_flag_no);

        database.insert(TABLE_LIKE, null, contentValues);

    }


    public void deleteLike(int rdm_textview_no, int array_flag_no){
        SQLiteDatabase database = this.getWritableDatabase();

        database.delete(TABLE_LIKE, RDM_TEXTVIEW_NO + " = " + rdm_textview_no + " AND "  + ARRAY_FLAG_NO + " = " + array_flag_no, null);
    }

    // updating styling info
    public void styleInfoUpdate(String font_style_no, String outer_back_quote_no){
        SQLiteDatabase database = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(FONT_STYLE, font_style_no);
        contentValues.put(BACKGROUND_IMAGE_OF_QUOTE_ACTIVITY, outer_back_quote_no);

        database.update(TABLE_STYLE, contentValues, "id=?", new String[]{"1"});     // this will update the row where id = 1
    }

    // returning style info (returning 2 values so returning integer array)
    public int[] getStyleInfo(){
        SQLiteDatabase database = getWritableDatabase();
        int fontNo = 0;
        int imageNo = 0;

        Cursor cursor = database.rawQuery("SELECT * FROM " + TABLE_STYLE, null);

        if (cursor.moveToFirst()) { // Check if the cursor has any rows
            fontNo = cursor.getInt(cursor.getColumnIndexOrThrow("fontstyle"));
            imageNo = cursor.getInt(cursor.getColumnIndexOrThrow("back_image_quote_act"));
        }

        // integer array
        int[] info = new int[2];        // int info[] : C-style array declaration
        info[0] = fontNo;
        info[1] = imageNo;

        return info;
    }


}
