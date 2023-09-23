package f.h.b.d.a.a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class e extends f.h.b.d.a.f.c {
    public e(Context context) {
        super(new f.h.b.d.a.e.f("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    @Override // f.h.b.d.a.f.c
    public final void a(Context context, Intent intent) {
        if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
            this.a.a("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
            return;
        }
        this.a.a("List of extras in received intent:", new Object[0]);
        for (String str : intent.getExtras().keySet()) {
            this.a.a("Key: %s; value: %s", str, intent.getExtras().get(str));
        }
        f.h.b.d.a.e.f fVar = this.a;
        fVar.a("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        fVar.a("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
        fVar.a("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
        f.h.b.d.a.d.b bVar = new f.h.b.d.a.d.b(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name"));
        this.a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", bVar);
        c(bVar);
    }
}
