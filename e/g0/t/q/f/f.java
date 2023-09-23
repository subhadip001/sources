package e.g0.t.q.f;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import e.g0.k;

/* compiled from: StorageNotLowTracker.java */
/* loaded from: classes.dex */
public class f extends c<Boolean> {

    /* renamed from: i  reason: collision with root package name */
    public static final String f2316i = k.e("StorageNotLowTracker");

    public f(Context context, e.g0.t.t.t.a aVar) {
        super(context, aVar);
    }

    @Override // e.g0.t.q.f.d
    public Object a() {
        Context context = this.b;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        Intent registerReceiver = context.registerReceiver(null, intentFilter);
        if (registerReceiver != null && registerReceiver.getAction() != null) {
            String action = registerReceiver.getAction();
            action.hashCode();
            if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                return Boolean.FALSE;
            }
            if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                return Boolean.TRUE;
            }
            return null;
        }
        return Boolean.TRUE;
    }

    @Override // e.g0.t.q.f.c
    public IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // e.g0.t.q.f.c
    public void g(Context context, Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        k.c().a(f2316i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            c(Boolean.FALSE);
        } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            c(Boolean.TRUE);
        }
    }
}
