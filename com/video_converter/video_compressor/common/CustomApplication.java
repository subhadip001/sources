package com.video_converter.video_compressor.common;

import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.FirebaseMessaging;
import com.video_converter.video_compressor.constants.User;
import e.b.c.m;
import f.a.b.a.a;
import f.i.a.d;
import f.l.b.c;
import f.n.a.l.b;
import i.l.b.i;
import java.io.File;
import java.util.Objects;

/* loaded from: classes2.dex */
public class CustomApplication extends CustomAppOpenAd {
    @Override // com.video_converter.video_compressor.common.CustomAppOpenAd, android.app.Application
    public void onCreate() {
        super.onCreate();
        b.c().f(this);
        try {
            FirebaseMessaging.getInstance().setAutoInitEnabled(true);
            i.e(this, "context");
            FirebaseApp.initializeApp(this);
            d.a = 265;
            f.n.a.n.i.X("all");
            Log.d("CustomApplication", "initInAppMessageTopic: Initialized ");
        } catch (Exception e2) {
            StringBuilder A = a.A("initInAppMessageTopic: exception: ");
            A.append(e2.getMessage());
            Log.d("CustomApplication", A.toString());
        }
        if (((Boolean) c.b(this, Boolean.class, "premium_user")).booleanValue()) {
            User.a.i(User.Type.SUBSCRIBED);
        } else {
            User.a.i(User.Type.FREE);
        }
        f.n.a.n.i.a = this;
        String str = f.n.a.i.b.a;
        f.n.a.i.b.b = getFilesDir().getAbsolutePath();
        f.n.a.i.b.c = a.u(new StringBuilder(), f.n.a.i.b.b, "/processingInfoTracker.json");
        f.n.a.i.b.f6954d = a.u(new StringBuilder(), f.n.a.i.b.b, "/selectedFiles.json");
        f.n.a.i.b.f6955e = a.u(new StringBuilder(), f.n.a.i.b.b, "/batch_processor.json");
        StringBuilder sb = new StringBuilder();
        sb.append(f.n.a.i.b.b);
        f.n.a.i.b.f6956f = a.u(sb, File.separator, "preview");
        if (((Boolean) c.b(this, Boolean.class, "dark_mode")).booleanValue()) {
            m.z(2);
        } else {
            m.z(1);
        }
        try {
            FirebaseApp.initializeApp(this);
            FirebaseMessaging.getInstance().setAutoInitEnabled(true);
            FirebaseMessaging.getInstance().subscribeToTopic("offers");
            Log.d("NotificationService", "Initialized");
        } catch (Exception e3) {
            StringBuilder A2 = a.A("onCreate: ");
            A2.append(e3.getMessage());
            Log.d("NotificationService", A2.toString());
        }
        Objects.requireNonNull(f.n.a.z.b.a());
        if (c.b(this, String.class, "video_compressor") == null) {
            c.l(this, "video_compressor", String.valueOf(System.currentTimeMillis()));
        }
        String str2 = (String) c.b(this, String.class, "video_compressor");
    }
}
