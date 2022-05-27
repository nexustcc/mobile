package com.example.nexustcc;

import android.content.Context;
import android.widget.Toast;

public class Message {

    public static void message (FormularioFragment context, String msg){

        Toast.makeText(context.getContext(), msg, Toast.LENGTH_SHORT).show();
    }
    
}
