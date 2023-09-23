package f.h.b.d.a.b;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.play.core.assetpacks.ExtractionForegroundService;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class w0 implements ServiceConnection {

    /* renamed from: f  reason: collision with root package name */
    public final f.h.b.d.a.e.f f5746f = new f.h.b.d.a.e.f("ExtractionForegroundServiceConnection");

    /* renamed from: g  reason: collision with root package name */
    public final List f5747g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final Context f5748h;

    /* renamed from: i  reason: collision with root package name */
    public ExtractionForegroundService f5749i;

    /* renamed from: j  reason: collision with root package name */
    public Notification f5750j;

    public w0(Context context) {
        this.f5748h = context;
    }

    public final void a() {
        ArrayList arrayList;
        synchronized (this.f5747g) {
            arrayList = new ArrayList(this.f5747g);
            this.f5747g.clear();
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            f.h.b.d.a.e.m0 m0Var = (f.h.b.d.a.e.m0) arrayList.get(i2);
            try {
                Bundle bundle = new Bundle();
                Bundle bundle2 = new Bundle();
                Parcel p = m0Var.p();
                int i3 = f.h.b.d.a.e.a0.a;
                p.writeInt(1);
                bundle.writeToParcel(p, 0);
                p.writeInt(1);
                bundle2.writeToParcel(p, 0);
                m0Var.q(2, p);
            } catch (RemoteException unused) {
                this.f5746f.b("Could not resolve Play Store service state update callback.", new Object[0]);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f5746f.a("Starting foreground installation service.", new Object[0]);
        ExtractionForegroundService extractionForegroundService = ((v0) iBinder).f5740f;
        this.f5749i = extractionForegroundService;
        extractionForegroundService.startForeground(-1883842196, this.f5750j);
        a();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
