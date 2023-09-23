package g.a.w0;

import g.a.g0;
import io.grpc.ManagedChannelProvider;

/* compiled from: OkHttpChannelProvider.java */
/* loaded from: classes2.dex */
public final class e extends ManagedChannelProvider {
    @Override // io.grpc.ManagedChannelProvider
    public g0 a(String str) {
        return new d(str);
    }

    @Override // io.grpc.ManagedChannelProvider
    public boolean b() {
        return true;
    }

    @Override // io.grpc.ManagedChannelProvider
    public int c() {
        boolean z = false;
        try {
            Class.forName("android.app.Application", false, e.class.getClassLoader());
            z = true;
        } catch (Exception unused) {
        }
        return z ? 8 : 3;
    }
}
