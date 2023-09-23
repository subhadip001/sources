package f.h.b.d.a.b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class x extends f.h.b.d.a.f.c {

    /* renamed from: g  reason: collision with root package name */
    public final r1 f5751g;

    /* renamed from: h  reason: collision with root package name */
    public final z0 f5752h;

    /* renamed from: i  reason: collision with root package name */
    public final f.h.b.d.a.e.u f5753i;

    /* renamed from: j  reason: collision with root package name */
    public final n0 f5754j;

    /* renamed from: k  reason: collision with root package name */
    public final c1 f5755k;

    /* renamed from: l  reason: collision with root package name */
    public final f.h.b.d.a.e.u f5756l;

    /* renamed from: m  reason: collision with root package name */
    public final f.h.b.d.a.e.u f5757m;
    public final l2 n;
    public final Handler o;

    public x(Context context, r1 r1Var, z0 z0Var, f.h.b.d.a.e.u uVar, c1 c1Var, n0 n0Var, f.h.b.d.a.e.u uVar2, f.h.b.d.a.e.u uVar3, l2 l2Var) {
        super(new f.h.b.d.a.e.f("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.o = new Handler(Looper.getMainLooper());
        this.f5751g = r1Var;
        this.f5752h = z0Var;
        this.f5753i = uVar;
        this.f5755k = c1Var;
        this.f5754j = n0Var;
        this.f5756l = uVar2;
        this.f5757m = uVar3;
        this.n = l2Var;
    }

    @Override // f.h.b.d.a.f.c
    public final void a(Context context, Intent intent) {
        final Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra != null) {
            ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
            if (stringArrayList != null && stringArrayList.size() == 1) {
                final AssetPackState i2 = AssetPackState.i(bundleExtra, stringArrayList.get(0), this.f5755k, this.n, new a0() { // from class: f.h.b.d.a.b.z
                    @Override // f.h.b.d.a.b.a0
                    public final int zza(int i3, String str) {
                        return i3;
                    }
                });
                this.a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", i2);
                if (((PendingIntent) bundleExtra.getParcelable("confirmation_intent")) != null) {
                    Objects.requireNonNull(this.f5754j);
                }
                ((Executor) this.f5757m.zza()).execute(new Runnable() { // from class: f.h.b.d.a.b.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        x xVar = x.this;
                        final Bundle bundle = bundleExtra;
                        AssetPackState assetPackState = i2;
                        final r1 r1Var = xVar.f5751g;
                        if (((Boolean) r1Var.b(new q1() { // from class: f.h.b.d.a.b.h1
                            @Override // f.h.b.d.a.b.q1
                            public final Object zza() {
                                r1 r1Var2 = r1.this;
                                Bundle bundle2 = bundle;
                                Objects.requireNonNull(r1Var2);
                                int i3 = bundle2.getInt("session_id");
                                if (i3 == 0) {
                                    return Boolean.TRUE;
                                }
                                Map map = r1Var2.f5703e;
                                Integer valueOf = Integer.valueOf(i3);
                                if (!map.containsKey(valueOf)) {
                                    return Boolean.TRUE;
                                }
                                o1 o1Var = (o1) r1Var2.f5703e.get(valueOf);
                                if (o1Var.c.f5668d == 6) {
                                    return Boolean.FALSE;
                                }
                                return Boolean.valueOf(!f.h.b.c.a.t1(o1Var.c.f5668d, bundle2.getInt(f.h.b.c.a.j1("status", r1.c(bundle2)))));
                            }
                        })).booleanValue()) {
                            xVar.o.post(new w(xVar, assetPackState));
                            ((u3) xVar.f5753i.zza()).zzf();
                        }
                    }
                });
                ((Executor) this.f5756l.zza()).execute(new Runnable() { // from class: f.h.b.d.a.b.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        x xVar = x.this;
                        final Bundle bundle = bundleExtra;
                        final r1 r1Var = xVar.f5751g;
                        if (!((Boolean) r1Var.b(new q1() { // from class: f.h.b.d.a.b.i1
                            @Override // f.h.b.d.a.b.q1
                            public final Object zza() {
                                p1 p1Var;
                                r1 r1Var2 = r1.this;
                                Bundle bundle2 = bundle;
                                Objects.requireNonNull(r1Var2);
                                int i3 = bundle2.getInt("session_id");
                                if (i3 == 0) {
                                    return Boolean.FALSE;
                                }
                                Map map = r1Var2.f5703e;
                                Integer valueOf = Integer.valueOf(i3);
                                boolean z = false;
                                if (map.containsKey(valueOf)) {
                                    o1 a = r1Var2.a(i3);
                                    int i4 = bundle2.getInt(f.h.b.c.a.j1("status", a.c.a));
                                    n1 n1Var = a.c;
                                    int i5 = n1Var.f5668d;
                                    if (f.h.b.c.a.t1(i5, i4)) {
                                        r1.f5701g.a("Found stale update for session %s with status %d.", valueOf, Integer.valueOf(i5));
                                        n1 n1Var2 = a.c;
                                        String str = n1Var2.a;
                                        int i6 = n1Var2.f5668d;
                                        if (i6 == 4) {
                                            ((u3) r1Var2.b.zza()).a(i3, str);
                                        } else if (i6 == 5) {
                                            ((u3) r1Var2.b.zza()).zzi(i3);
                                        } else if (i6 == 6) {
                                            ((u3) r1Var2.b.zza()).e(Arrays.asList(str));
                                        }
                                    } else {
                                        n1Var.f5668d = i4;
                                        if (f.h.b.c.a.u1(i4)) {
                                            r1Var2.b(new f1(r1Var2, i3));
                                            r1Var2.c.a(a.c.a);
                                        } else {
                                            for (p1 p1Var2 : n1Var.f5670f) {
                                                ArrayList parcelableArrayList = bundle2.getParcelableArrayList(f.h.b.c.a.m1("chunk_intents", a.c.a, p1Var2.a));
                                                if (parcelableArrayList != null) {
                                                    for (int i7 = 0; i7 < parcelableArrayList.size(); i7++) {
                                                        if (parcelableArrayList.get(i7) != null && ((Intent) parcelableArrayList.get(i7)).getData() != null) {
                                                            ((l1) p1Var2.f5675d.get(i7)).a = true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    String c = r1.c(bundle2);
                                    long j2 = bundle2.getLong(f.h.b.c.a.j1("pack_version", c));
                                    String string = bundle2.getString(f.h.b.c.a.j1("pack_version_tag", c), "");
                                    int i8 = bundle2.getInt(f.h.b.c.a.j1("status", c));
                                    long j3 = bundle2.getLong(f.h.b.c.a.j1("total_bytes_to_download", c));
                                    List<String> stringArrayList2 = bundle2.getStringArrayList(f.h.b.c.a.j1("slice_ids", c));
                                    ArrayList arrayList = new ArrayList();
                                    if (stringArrayList2 == null) {
                                        stringArrayList2 = Collections.emptyList();
                                    }
                                    for (String str2 : stringArrayList2) {
                                        List<Intent> parcelableArrayList2 = bundle2.getParcelableArrayList(f.h.b.c.a.m1("chunk_intents", c, str2));
                                        ArrayList arrayList2 = new ArrayList();
                                        if (parcelableArrayList2 == null) {
                                            parcelableArrayList2 = Collections.emptyList();
                                        }
                                        for (Intent intent2 : parcelableArrayList2) {
                                            if (intent2 != null) {
                                                z = true;
                                            }
                                            arrayList2.add(new l1(z));
                                            z = false;
                                        }
                                        String string2 = bundle2.getString(f.h.b.c.a.m1("uncompressed_hash_sha256", c, str2));
                                        long j4 = bundle2.getLong(f.h.b.c.a.m1("uncompressed_size", c, str2));
                                        int i9 = bundle2.getInt(f.h.b.c.a.m1("patch_format", c, str2), 0);
                                        if (i9 != 0) {
                                            p1Var = new p1(str2, string2, j4, arrayList2, 0, i9);
                                            z = false;
                                        } else {
                                            z = false;
                                            p1Var = new p1(str2, string2, j4, arrayList2, bundle2.getInt(f.h.b.c.a.m1("compression_format", c, str2), 0), 0);
                                        }
                                        arrayList.add(p1Var);
                                    }
                                    r1Var2.f5703e.put(Integer.valueOf(i3), new o1(i3, bundle2.getInt("app_version_code"), new n1(c, j2, i8, j3, arrayList, string)));
                                }
                                return Boolean.TRUE;
                            }
                        })).booleanValue()) {
                            return;
                        }
                        z0 z0Var = xVar.f5752h;
                        Objects.requireNonNull(z0Var);
                        f.h.b.d.a.e.f fVar = z0.f5775k;
                        fVar.a("Run extractor loop", new Object[0]);
                        if (!z0Var.f5782j.compareAndSet(false, true)) {
                            fVar.e("runLoop already looping; return", new Object[0]);
                            return;
                        }
                        while (true) {
                            t1 t1Var = null;
                            try {
                                t1Var = z0Var.f5781i.a();
                            } catch (y0 e2) {
                                z0.f5775k.b("Error while getting next extraction task: %s", e2.getMessage());
                                if (e2.f5772f >= 0) {
                                    ((u3) z0Var.f5780h.zza()).zzi(e2.f5772f);
                                    z0Var.a(e2.f5772f, e2);
                                }
                            }
                            if (t1Var != null) {
                                try {
                                    if (t1Var instanceof s0) {
                                        z0Var.b.a((s0) t1Var);
                                    } else if (t1Var instanceof a3) {
                                        z0Var.c.a((a3) t1Var);
                                    } else if (t1Var instanceof d2) {
                                        z0Var.f5776d.a((d2) t1Var);
                                    } else if (t1Var instanceof g2) {
                                        z0Var.f5777e.a((g2) t1Var);
                                    } else if (t1Var instanceof p2) {
                                        z0Var.f5778f.a((p2) t1Var);
                                    } else if (t1Var instanceof s2) {
                                        z0Var.f5779g.a((s2) t1Var);
                                    } else {
                                        z0.f5775k.b("Unknown task type: %s", t1Var.getClass().getName());
                                    }
                                } catch (Exception e3) {
                                    z0.f5775k.b("Error during extraction task: %s", e3.getMessage());
                                    ((u3) z0Var.f5780h.zza()).zzi(t1Var.a);
                                    z0Var.a(t1Var.a, e3);
                                }
                            } else {
                                z0Var.f5782j.set(false);
                                return;
                            }
                        }
                    }
                });
                return;
            }
            this.a.b("Corrupt bundle received from broadcast.", new Object[0]);
            return;
        }
        this.a.b("Empty bundle received from broadcast.", new Object[0]);
    }
}
