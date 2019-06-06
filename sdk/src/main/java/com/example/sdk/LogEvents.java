package com.example.sdk;

import android.content.Context;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.Map;

/**
 * Created by Pallavi on 13/05/19.
 */

public class LogEvents {

    public void setEvent(Context c, String s) {
        Toast.makeText(c, "", Toast.LENGTH_SHORT).show();
    }

    public static void sendCustomeEvents(Context c, final Map<String, String> MyData, String url, final Map<String, String> headers) {
        RequestQueue MyRequestQueue = Volley.newRequestQueue(c);
        StringRequest MyStringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                //This code is executed if the server responds, whether or not the response contains data.
                //The String 'response' contains the server's response.
            }
        }, new Response.ErrorListener() { //Create an error listener to handle errors appropriately.
            @Override
            public void onErrorResponse(VolleyError error) {
                //This code is executed if there is an error.
            }
        }) {
            protected Map<String, String> getParams() {
                return MyData;
            }

            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                return headers;
            }
        };
        MyRequestQueue.add(MyStringRequest);

    }
}
