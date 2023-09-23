package com.google.firebase.ktx;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import i.l.b.i;

/* compiled from: Firebase.kt */
/* loaded from: classes2.dex */
public final class FirebaseKt {
    public static final String LIBRARY_NAME = "fire-core-ktx";

    public static final FirebaseApp app(Firebase firebase, String str) {
        i.e(firebase, "<this>");
        i.e(str, "name");
        FirebaseApp firebaseApp = FirebaseApp.getInstance(str);
        i.d(firebaseApp, "getInstance(name)");
        return firebaseApp;
    }

    public static final FirebaseApp getApp(Firebase firebase) {
        i.e(firebase, "<this>");
        FirebaseApp firebaseApp = FirebaseApp.getInstance();
        i.d(firebaseApp, "getInstance()");
        return firebaseApp;
    }

    public static final FirebaseOptions getOptions(Firebase firebase) {
        i.e(firebase, "<this>");
        FirebaseOptions options = getApp(Firebase.INSTANCE).getOptions();
        i.d(options, "Firebase.app.options");
        return options;
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context) {
        i.e(firebase, "<this>");
        i.e(context, "context");
        return FirebaseApp.initializeApp(context);
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context, FirebaseOptions firebaseOptions) {
        i.e(firebase, "<this>");
        i.e(context, "context");
        i.e(firebaseOptions, "options");
        FirebaseApp initializeApp = FirebaseApp.initializeApp(context, firebaseOptions);
        i.d(initializeApp, "initializeApp(context, options)");
        return initializeApp;
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context, FirebaseOptions firebaseOptions, String str) {
        i.e(firebase, "<this>");
        i.e(context, "context");
        i.e(firebaseOptions, "options");
        i.e(str, "name");
        FirebaseApp initializeApp = FirebaseApp.initializeApp(context, firebaseOptions, str);
        i.d(initializeApp, "initializeApp(context, options, name)");
        return initializeApp;
    }
}
