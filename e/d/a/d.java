package e.d.a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import d.a.a.b;

/* compiled from: CustomTabsServiceConnection.java */
/* loaded from: classes.dex */
public abstract class d implements ServiceConnection {

    /* compiled from: CustomTabsServiceConnection.java */
    /* loaded from: classes.dex */
    public class a extends b {
        public a(d dVar, d.a.a.b bVar, ComponentName componentName) {
            super(bVar, componentName);
        }
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, b bVar);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        d.a.a.b c0013a;
        int i2 = b.a.f1413f;
        if (iBinder == null) {
            c0013a = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof d.a.a.b)) {
                c0013a = (d.a.a.b) queryLocalInterface;
            } else {
                c0013a = new b.a.C0013a(iBinder);
            }
        }
        onCustomTabsServiceConnected(componentName, new a(this, c0013a, componentName));
    }
}
