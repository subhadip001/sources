package f.h.b.d.a.b;

import android.content.Context;
import java.io.File;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class a2 implements f.h.b.d.a.e.x {
    public final f.h.b.d.a.e.x a;
    public final f.h.b.d.a.e.x b;
    public final f.h.b.d.a.e.x c;

    /* renamed from: d  reason: collision with root package name */
    public final f.h.b.d.a.e.x f5564d;

    /* renamed from: e  reason: collision with root package name */
    public final f.h.b.d.a.e.x f5565e;

    /* renamed from: f  reason: collision with root package name */
    public final f.h.b.d.a.e.x f5566f;

    /* renamed from: g  reason: collision with root package name */
    public final f.h.b.d.a.e.x f5567g;

    public a2(f.h.b.d.a.e.x xVar, f.h.b.d.a.e.x xVar2, f.h.b.d.a.e.x xVar3, f.h.b.d.a.e.x xVar4, f.h.b.d.a.e.x xVar5, f.h.b.d.a.e.x xVar6, f.h.b.d.a.e.x xVar7) {
        this.a = xVar;
        this.b = xVar2;
        this.c = xVar3;
        this.f5564d = xVar4;
        this.f5565e = xVar5;
        this.f5566f = xVar6;
        this.f5567g = xVar7;
    }

    @Override // f.h.b.d.a.e.x
    public final /* bridge */ /* synthetic */ Object zza() {
        File externalFilesDir;
        String str = (String) this.a.zza();
        Object zza = this.b.zza();
        Object zza2 = this.c.zza();
        Context a = ((q3) this.f5564d).a();
        Object zza3 = this.f5565e.zza();
        f.h.b.d.a.e.u a2 = f.h.b.d.a.e.w.a(this.f5566f);
        x xVar = (x) zza;
        c1 c1Var = (c1) zza2;
        n2 n2Var = (n2) zza3;
        l2 l2Var = (l2) this.f5567g.zza();
        if (str != null) {
            externalFilesDir = new File(a.getExternalFilesDir(null), str);
        } else {
            externalFilesDir = a.getExternalFilesDir(null);
        }
        return new z1(externalFilesDir, xVar, c1Var, a, n2Var, a2, l2Var);
    }
}
