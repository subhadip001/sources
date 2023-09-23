package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import e.g0.k;
import e.g0.l;
import e.g0.t.l;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String a = k.e("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        k.c().a(a, "Requesting diagnostics", new Throwable[0]);
        try {
            l.b(context).a(new l.a(DiagnosticsWorker.class).a());
        } catch (IllegalStateException e2) {
            k.c().b(a, "WorkManager is not initialized", e2);
        }
    }
}
