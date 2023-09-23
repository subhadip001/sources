package f.h.b.d.a.e;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class g0 extends y implements i0 {
    public g0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f.h.b.d.a.e.i0
    public final void d(String str, Bundle bundle, k0 k0Var) {
        Parcel p = p();
        p.writeString(str);
        int i2 = a0.a;
        p.writeInt(1);
        bundle.writeToParcel(p, 0);
        p.writeStrongBinder(k0Var);
        q(5, p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f.h.b.d.a.e.i0
    public final void f(String str, Bundle bundle, Bundle bundle2, k0 k0Var) {
        Parcel p = p();
        p.writeString(str);
        int i2 = a0.a;
        p.writeInt(1);
        bundle.writeToParcel(p, 0);
        p.writeInt(1);
        bundle2.writeToParcel(p, 0);
        p.writeStrongBinder(k0Var);
        q(11, p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f.h.b.d.a.e.i0
    public final void g(String str, List list, Bundle bundle, k0 k0Var) {
        Parcel p = p();
        p.writeString(str);
        p.writeTypedList(list);
        int i2 = a0.a;
        p.writeInt(1);
        bundle.writeToParcel(p, 0);
        p.writeStrongBinder(k0Var);
        q(14, p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f.h.b.d.a.e.i0
    public final void j(String str, Bundle bundle, Bundle bundle2, k0 k0Var) {
        Parcel p = p();
        p.writeString(str);
        int i2 = a0.a;
        p.writeInt(1);
        bundle.writeToParcel(p, 0);
        p.writeInt(1);
        bundle2.writeToParcel(p, 0);
        p.writeStrongBinder(k0Var);
        q(6, p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f.h.b.d.a.e.i0
    public final void k(String str, Bundle bundle, k0 k0Var) {
        Parcel p = p();
        p.writeString(str);
        int i2 = a0.a;
        p.writeInt(1);
        bundle.writeToParcel(p, 0);
        p.writeStrongBinder(k0Var);
        q(10, p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f.h.b.d.a.e.i0
    public final void l(String str, Bundle bundle, Bundle bundle2, k0 k0Var) {
        Parcel p = p();
        p.writeString(str);
        int i2 = a0.a;
        p.writeInt(1);
        bundle.writeToParcel(p, 0);
        p.writeInt(1);
        bundle2.writeToParcel(p, 0);
        p.writeStrongBinder(k0Var);
        q(9, p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f.h.b.d.a.e.i0
    public final void o(String str, Bundle bundle, Bundle bundle2, k0 k0Var) {
        Parcel p = p();
        p.writeString(str);
        int i2 = a0.a;
        p.writeInt(1);
        bundle.writeToParcel(p, 0);
        p.writeInt(1);
        bundle2.writeToParcel(p, 0);
        p.writeStrongBinder(k0Var);
        q(7, p);
    }
}
