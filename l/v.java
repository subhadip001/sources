package l;

/* compiled from: SegmentPool.java */
/* loaded from: classes2.dex */
public final class v {
    public static u a;
    public static long b;

    public static void a(u uVar) {
        if (uVar.f9262f == null && uVar.f9263g == null) {
            if (uVar.f9260d) {
                return;
            }
            synchronized (v.class) {
                long j2 = b + 8192;
                if (j2 > 65536) {
                    return;
                }
                b = j2;
                uVar.f9262f = a;
                uVar.c = 0;
                uVar.b = 0;
                a = uVar;
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    public static u b() {
        synchronized (v.class) {
            u uVar = a;
            if (uVar != null) {
                a = uVar.f9262f;
                uVar.f9262f = null;
                b -= 8192;
                return uVar;
            }
            return new u();
        }
    }
}
