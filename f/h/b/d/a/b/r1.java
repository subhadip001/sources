package f.h.b.d.a.b;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: g  reason: collision with root package name */
    public static final f.h.b.d.a.e.f f5701g = new f.h.b.d.a.e.f("ExtractorSessionStoreView");
    public final c0 a;
    public final f.h.b.d.a.e.u b;
    public final c1 c;

    /* renamed from: d  reason: collision with root package name */
    public final f.h.b.d.a.e.u f5702d;

    /* renamed from: e  reason: collision with root package name */
    public final Map f5703e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public final ReentrantLock f5704f = new ReentrantLock();

    public r1(c0 c0Var, f.h.b.d.a.e.u uVar, c1 c1Var, f.h.b.d.a.e.u uVar2) {
        this.a = c0Var;
        this.b = uVar;
        this.c = c1Var;
        this.f5702d = uVar2;
    }

    public static String c(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList != null && !stringArrayList.isEmpty()) {
            return stringArrayList.get(0);
        }
        throw new y0("Session without pack received.");
    }

    public final o1 a(int i2) {
        Map map = this.f5703e;
        Integer valueOf = Integer.valueOf(i2);
        o1 o1Var = (o1) map.get(valueOf);
        if (o1Var != null) {
            return o1Var;
        }
        throw new y0(String.format("Could not find session %d while trying to get it", valueOf), i2);
    }

    public final Object b(q1 q1Var) {
        try {
            this.f5704f.lock();
            return q1Var.zza();
        } finally {
            this.f5704f.unlock();
        }
    }
}
