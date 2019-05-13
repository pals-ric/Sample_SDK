package com.example.sdk;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Pallavi on 13/05/19.
 */

public class Message {

    public static void s(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }

}
