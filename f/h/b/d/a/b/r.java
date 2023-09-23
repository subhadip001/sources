package f.h.b.d.a.b;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import com.google.android.play.core.assetpacks.AssetPackException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class r implements u3 {

    /* renamed from: g  reason: collision with root package name */
    public static final f.h.b.d.a.e.f f5686g = new f.h.b.d.a.e.f("AssetPackServiceImpl");

    /* renamed from: h  reason: collision with root package name */
    public static final Intent f5687h = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");
    public final String a;
    public final c1 b;
    public final l2 c;

    /* renamed from: d  reason: collision with root package name */
    public f.h.b.d.a.e.q f5688d;

    /* renamed from: e  reason: collision with root package name */
    public f.h.b.d.a.e.q f5689e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f5690f = new AtomicBoolean();

    public r(Context context, c1 c1Var, l2 l2Var) {
        this.a = context.getPackageName();
        this.b = c1Var;
        this.c = l2Var;
        if (f.h.b.d.a.e.r.b(context)) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = applicationContext != null ? applicationContext : context;
            f.h.b.d.a.e.f fVar = f5686g;
            Intent intent = f5687h;
            v3 v3Var = new f.h.b.d.a.e.m() { // from class: f.h.b.d.a.b.v3
                @Override // f.h.b.d.a.e.m
                public final Object a(IBinder iBinder) {
                    int i2 = f.h.b.d.a.e.h0.f5792f;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
                    return queryLocalInterface instanceof f.h.b.d.a.e.i0 ? (f.h.b.d.a.e.i0) queryLocalInterface : new f.h.b.d.a.e.g0(iBinder);
                }
            };
            this.f5688d = new f.h.b.d.a.e.q(context2, fVar, "AssetPackService", intent, v3Var, null);
            Context applicationContext2 = context.getApplicationContext();
            this.f5689e = new f.h.b.d.a.e.q(applicationContext2 != null ? applicationContext2 : context, fVar, "AssetPackService-keepAlive", intent, v3Var, null);
        }
        f5686g.a("AssetPackService initiated.", new Object[0]);
    }

    public static Bundle f() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 11003);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(1);
        arrayList2.add(2);
        bundle.putIntegerArrayList("supported_patch_formats", arrayList2);
        return bundle;
    }

    public static f.h.b.d.a.i.p g() {
        f5686g.b("onError(%d)", -11);
        return f.h.b.c.a.h1(new AssetPackException(-11));
    }

    public static Bundle i(int i2, String str, String str2, int i3) {
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", i2);
        bundle.putString("module_name", str);
        bundle.putString("slice_id", str2);
        bundle.putInt("chunk_number", i3);
        return bundle;
    }

    public static /* bridge */ /* synthetic */ Bundle j(Map map) {
        Bundle f2 = f();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        f2.putParcelableArrayList("installed_asset_module", arrayList);
        return f2;
    }

    @Override // f.h.b.d.a.b.u3
    public final void a(int i2, String str) {
        h(i2, str, 10);
    }

    @Override // f.h.b.d.a.b.u3
    public final f.h.b.d.a.i.p b(int i2, String str, String str2, int i3) {
        if (this.f5688d == null) {
            return g();
        }
        f5686g.d("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i3), Integer.valueOf(i2));
        f.h.b.d.a.i.m mVar = new f.h.b.d.a.i.m();
        this.f5688d.b(new h(this, mVar, i2, str, str2, i3, mVar), mVar);
        return mVar.a;
    }

    @Override // f.h.b.d.a.b.u3
    public final void c(int i2, String str, String str2, int i3) {
        if (this.f5688d != null) {
            f5686g.d("notifyChunkTransferred", new Object[0]);
            f.h.b.d.a.i.m mVar = new f.h.b.d.a.i.m();
            this.f5688d.b(new e(this, mVar, i2, str, str2, i3, mVar), mVar);
            return;
        }
        throw new y0("The Play Store app is not installed or is an unofficial version.", i2);
    }

    @Override // f.h.b.d.a.b.u3
    public final f.h.b.d.a.i.p d(Map map) {
        if (this.f5688d == null) {
            return g();
        }
        f5686g.d("syncPacks", new Object[0]);
        f.h.b.d.a.i.m mVar = new f.h.b.d.a.i.m();
        this.f5688d.b(new d(this, mVar, map, mVar), mVar);
        return mVar.a;
    }

    @Override // f.h.b.d.a.b.u3
    public final void e(List list) {
        if (this.f5688d == null) {
            return;
        }
        f5686g.d("cancelDownloads(%s)", list);
        f.h.b.d.a.i.m mVar = new f.h.b.d.a.i.m();
        this.f5688d.b(new c(this, mVar, list, mVar), mVar);
    }

    public final void h(int i2, String str, int i3) {
        if (this.f5688d != null) {
            f5686g.d("notifyModuleCompleted", new Object[0]);
            f.h.b.d.a.i.m mVar = new f.h.b.d.a.i.m();
            this.f5688d.b(new f(this, mVar, i2, str, mVar, i3), mVar);
            return;
        }
        throw new y0("The Play Store app is not installed or is an unofficial version.", i2);
    }

    @Override // f.h.b.d.a.b.u3
    public final synchronized void zzf() {
        if (this.f5689e == null) {
            f5686g.e("Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        f.h.b.d.a.e.f fVar = f5686g;
        fVar.d("keepAlive", new Object[0]);
        if (!this.f5690f.compareAndSet(false, true)) {
            fVar.d("Service is already kept alive.", new Object[0]);
            return;
        }
        f.h.b.d.a.i.m mVar = new f.h.b.d.a.i.m();
        this.f5689e.b(new i(this, mVar, mVar), mVar);
    }

    @Override // f.h.b.d.a.b.u3
    public final void zzi(int i2) {
        if (this.f5688d != null) {
            f5686g.d("notifySessionFailed", new Object[0]);
            f.h.b.d.a.i.m mVar = new f.h.b.d.a.i.m();
            this.f5688d.b(new g(this, mVar, i2, mVar), mVar);
            return;
        }
        throw new y0("The Play Store app is not installed or is an unofficial version.", i2);
    }
}
