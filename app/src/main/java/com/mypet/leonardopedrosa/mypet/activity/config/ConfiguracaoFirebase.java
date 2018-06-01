package com.mypet.leonardopedrosa.mypet.activity.config;

import android.database.DatabaseErrorHandler;
import android.provider.ContactsContract;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by leonardopedrosa on 22/08/2017.
 */

public final class ConfiguracaoFirebase {

    private static DatabaseReference refereciaFirebase;
    private static FirebaseAuth autenticacao;

    public static DatabaseReference getFirebase(){

        if( refereciaFirebase == null ) {
            refereciaFirebase = FirebaseDatabase.getInstance().getReference();
        }
            return refereciaFirebase;
    }

    public static FirebaseAuth getFirebaseAutenticacao(){

        if( autenticacao == null){
            autenticacao = FirebaseAuth.getInstance();
        }
        return autenticacao;

    }
}


