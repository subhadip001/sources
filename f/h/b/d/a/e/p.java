package f.h.b.d.a.e;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class p implements ServiceConnection {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ q f5799f;

    public /* synthetic */ p(q qVar) {
        this.f5799f = qVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f5799f.b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f5799f.a().post(new n(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f5799f.b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f5799f.a().post(new o(this));
    }
}
