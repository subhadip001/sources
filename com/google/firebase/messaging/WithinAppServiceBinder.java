package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.WithinAppServiceBinder;
import com.google.firebase.messaging.WithinAppServiceConnection;
import f.h.e.p.w;

/* loaded from: classes2.dex */
public class WithinAppServiceBinder extends Binder {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f1282f = 0;
    private final IntentHandler intentHandler;

    /* loaded from: classes2.dex */
    public interface IntentHandler {
        Task<Void> handle(Intent intent);
    }

    public WithinAppServiceBinder(IntentHandler intentHandler) {
        this.intentHandler = intentHandler;
    }

    public void send(final WithinAppServiceConnection.BindRequest bindRequest) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            this.intentHandler.handle(bindRequest.intent).addOnCompleteListener(w.f6188f, new OnCompleteListener() { // from class: f.h.e.p.c0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    WithinAppServiceConnection.BindRequest bindRequest2 = WithinAppServiceConnection.BindRequest.this;
                    int i2 = WithinAppServiceBinder.f1282f;
                    bindRequest2.finish();
                }
            });
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
