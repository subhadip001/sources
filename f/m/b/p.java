package f.m.b;

import android.content.Context;
import android.net.Uri;
import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: MediaStoreRequestHandler.java */
/* loaded from: classes2.dex */
public class p extends g {
    public static final String[] b = {"orientation"};

    /* compiled from: MediaStoreRequestHandler.java */
    /* loaded from: classes2.dex */
    public enum a {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);
        

        /* renamed from: f  reason: collision with root package name */
        public final int f6868f;

        /* renamed from: g  reason: collision with root package name */
        public final int f6869g;

        /* renamed from: h  reason: collision with root package name */
        public final int f6870h;

        a(int i2, int i3, int i4) {
            this.f6868f = i2;
            this.f6869g = i3;
            this.f6870h = i4;
        }
    }

    public p(Context context) {
        super(context);
    }

    @Override // f.m.b.g, f.m.b.x
    public boolean c(v vVar) {
        Uri uri = vVar.c;
        return FirebaseAnalytics.Param.CONTENT.equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r3 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
        if (r3 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
        r9 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c9  */
    @Override // f.m.b.g, f.m.b.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f.m.b.x.a f(f.m.b.v r17, int r18) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.m.b.p.f(f.m.b.v, int):f.m.b.x$a");
    }
}
