package f.h.b.a.i.w.h;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import f.h.b.a.i.w.i.a0;
import f.h.b.a.i.x.a;
import java.util.Objects;

/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ s f3733f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ f.h.b.a.i.l f3734g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f3735h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Runnable f3736i;

    public /* synthetic */ d(s sVar, f.h.b.a.i.l lVar, int i2, Runnable runnable) {
        this.f3733f = sVar;
        this.f3734g = lVar;
        this.f3735h = i2;
        this.f3736i = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final s sVar = this.f3733f;
        final f.h.b.a.i.l lVar = this.f3734g;
        final int i2 = this.f3735h;
        Runnable runnable = this.f3736i;
        Objects.requireNonNull(sVar);
        try {
            try {
                f.h.b.a.i.x.a aVar = sVar.f3741f;
                final a0 a0Var = sVar.c;
                Objects.requireNonNull(a0Var);
                aVar.f(new a.InterfaceC0099a() { // from class: f.h.b.a.i.w.h.b
                    @Override // f.h.b.a.i.x.a.InterfaceC0099a
                    public final Object a() {
                        return Integer.valueOf(a0.this.h());
                    }
                });
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) sVar.a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (!(activeNetworkInfo != null && activeNetworkInfo.isConnected())) {
                    sVar.f3741f.f(new a.InterfaceC0099a() { // from class: f.h.b.a.i.w.h.k
                        @Override // f.h.b.a.i.x.a.InterfaceC0099a
                        public final Object a() {
                            s sVar2 = s.this;
                            sVar2.f3739d.a(lVar, i2 + 1);
                            return null;
                        }
                    });
                } else {
                    sVar.a(lVar, i2);
                }
            } catch (SynchronizationException unused) {
                sVar.f3739d.a(lVar, i2 + 1);
            }
        } finally {
            runnable.run();
        }
    }
}
