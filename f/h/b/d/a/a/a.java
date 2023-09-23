package f.h.b.d.a.a;

import android.app.PendingIntent;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public class a {
    public final int a;
    public final long b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final PendingIntent f5539d;

    /* renamed from: e  reason: collision with root package name */
    public final PendingIntent f5540e;

    /* renamed from: f  reason: collision with root package name */
    public final PendingIntent f5541f;

    /* renamed from: g  reason: collision with root package name */
    public final PendingIntent f5542g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f5543h = false;

    public a(String str, int i2, int i3, int i4, Integer num, int i5, long j2, long j3, long j4, long j5, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        this.a = i3;
        this.b = j4;
        this.c = j5;
        this.f5539d = pendingIntent;
        this.f5540e = pendingIntent2;
        this.f5541f = pendingIntent3;
        this.f5542g = pendingIntent4;
    }

    public final PendingIntent a(c cVar) {
        if (cVar.b() == 0) {
            PendingIntent pendingIntent = this.f5540e;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            if (b(cVar)) {
                return this.f5542g;
            }
            return null;
        }
        if (cVar.b() == 1) {
            PendingIntent pendingIntent2 = this.f5539d;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            if (b(cVar)) {
                return this.f5541f;
            }
        }
        return null;
    }

    public final boolean b(c cVar) {
        return cVar.a() && this.b <= this.c;
    }
}
