package f.h.b.b;

import java.util.UUID;

/* compiled from: C.java */
/* loaded from: classes.dex */
public final class h0 {
    public static final UUID a = new UUID(0, 0);
    public static final UUID b;
    public static final UUID c;

    static {
        new UUID(1186680826959645954L, -5988876978535335093L);
        new UUID(-2129748144642739255L, 8654423357094679310L);
        b = new UUID(-1301668207276963122L, -6645017420763422227L);
        c = new UUID(-7348484286925749626L, -6083546864340672619L);
    }

    public static long a(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 * 1000;
    }

    public static long b(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 / 1000;
    }
}
