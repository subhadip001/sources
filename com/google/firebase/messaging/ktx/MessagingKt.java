package com.google.firebase.messaging.ktx;

import com.google.firebase.ktx.Firebase;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.RemoteMessage;
import i.h;
import i.l.a.l;
import i.l.b.i;

/* compiled from: Messaging.kt */
/* loaded from: classes2.dex */
public final class MessagingKt {
    public static final String LIBRARY_NAME = "fire-fcm-ktx";

    public static final FirebaseMessaging getMessaging(Firebase firebase) {
        i.e(firebase, "<this>");
        FirebaseMessaging firebaseMessaging = FirebaseMessaging.getInstance();
        i.d(firebaseMessaging, "getInstance()");
        return firebaseMessaging;
    }

    public static final RemoteMessage remoteMessage(String str, l<? super RemoteMessage.Builder, h> lVar) {
        i.e(str, "to");
        i.e(lVar, "init");
        RemoteMessage.Builder builder = new RemoteMessage.Builder(str);
        lVar.b(builder);
        RemoteMessage build = builder.build();
        i.d(build, "builder.build()");
        return build;
    }
}
