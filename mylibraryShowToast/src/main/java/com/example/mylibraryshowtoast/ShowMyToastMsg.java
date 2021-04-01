package com.example.mylibraryshowtoast;

import android.content.Context;
import android.widget.Toast;

import com.example.mylibrary.ToasterMessage;

public class ShowMyToastMsg {

    public static void showMsg(Context c, String message){
        Toast.makeText(c,"ShowMyToastMsg toast", Toast.LENGTH_SHORT).show();
    }

    public static void showParentMsg(Context c, String message){
        ToasterMessage.s(c,"my dummy msg");
    }
}