package f.h.b.d.a.b;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final /* synthetic */ class j1 implements q1 {
    public final /* synthetic */ r1 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f5649d;

    public /* synthetic */ j1(r1 r1Var, String str, int i2, long j2) {
        this.a = r1Var;
        this.b = str;
        this.c = i2;
        this.f5649d = j2;
    }

    @Override // f.h.b.d.a.b.q1
    public final Object zza() {
        final r1 r1Var = this.a;
        String str = this.b;
        int i2 = this.c;
        long j2 = this.f5649d;
        Objects.requireNonNull(r1Var);
        final List asList = Arrays.asList(str);
        o1 o1Var = (o1) ((Map) r1Var.b(new q1() { // from class: f.h.b.d.a.b.k1
            @Override // f.h.b.d.a.b.q1
            public final Object zza() {
                r1 r1Var2 = r1.this;
                List list = asList;
                Objects.requireNonNull(r1Var2);
                HashMap hashMap = new HashMap();
                for (o1 o1Var2 : r1Var2.f5703e.values()) {
                    String str2 = o1Var2.c.a;
                    if (list.contains(str2)) {
                        o1 o1Var3 = (o1) hashMap.get(str2);
                        if ((o1Var3 == null ? -1 : o1Var3.a) < o1Var2.a) {
                            hashMap.put(str2, o1Var2);
                        }
                    }
                }
                return hashMap;
            }
        })).get(str);
        if (o1Var == null || f.h.b.c.a.u1(o1Var.c.f5668d)) {
            r1.f5701g.b(String.format("Could not find pack %s while trying to complete it", str), new Object[0]);
        }
        r1Var.a.c(str, i2, j2);
        o1Var.c.f5668d = 4;
        return null;
    }
}
