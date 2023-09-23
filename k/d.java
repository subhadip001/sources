package k;

import com.google.android.gms.common.api.Api;
import java.util.concurrent.TimeUnit;

/* compiled from: CacheControl.java */
/* loaded from: classes2.dex */
public final class d {
    public static final d n;
    public final boolean a;
    public final boolean b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9090d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f9091e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f9092f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f9093g;

    /* renamed from: h  reason: collision with root package name */
    public final int f9094h;

    /* renamed from: i  reason: collision with root package name */
    public final int f9095i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f9096j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f9097k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f9098l;

    /* renamed from: m  reason: collision with root package name */
    public String f9099m;

    /* compiled from: CacheControl.java */
    /* loaded from: classes2.dex */
    public static final class a {
        public boolean a;
        public boolean b;
        public int c = -1;

        /* renamed from: d  reason: collision with root package name */
        public boolean f9100d;
    }

    static {
        a aVar = new a();
        aVar.a = true;
        new d(aVar);
        a aVar2 = new a();
        aVar2.f9100d = true;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        int i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        long seconds = timeUnit.toSeconds((long) Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (seconds <= 2147483647L) {
            i2 = (int) seconds;
        }
        aVar2.c = i2;
        n = new d(aVar2);
    }

    public d(boolean z, boolean z2, int i2, int i3, boolean z3, boolean z4, boolean z5, int i4, int i5, boolean z6, boolean z7, boolean z8, String str) {
        this.a = z;
        this.b = z2;
        this.c = i2;
        this.f9090d = i3;
        this.f9091e = z3;
        this.f9092f = z4;
        this.f9093g = z5;
        this.f9094h = i4;
        this.f9095i = i5;
        this.f9096j = z6;
        this.f9097k = z7;
        this.f9098l = z8;
        this.f9099m = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static k.d a(k.q r22) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.d.a(k.q):k.d");
    }

    public String toString() {
        String str = this.f9099m;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a) {
                sb.append("no-cache, ");
            }
            if (this.b) {
                sb.append("no-store, ");
            }
            if (this.c != -1) {
                sb.append("max-age=");
                sb.append(this.c);
                sb.append(", ");
            }
            if (this.f9090d != -1) {
                sb.append("s-maxage=");
                sb.append(this.f9090d);
                sb.append(", ");
            }
            if (this.f9091e) {
                sb.append("private, ");
            }
            if (this.f9092f) {
                sb.append("public, ");
            }
            if (this.f9093g) {
                sb.append("must-revalidate, ");
            }
            if (this.f9094h != -1) {
                sb.append("max-stale=");
                sb.append(this.f9094h);
                sb.append(", ");
            }
            if (this.f9095i != -1) {
                sb.append("min-fresh=");
                sb.append(this.f9095i);
                sb.append(", ");
            }
            if (this.f9096j) {
                sb.append("only-if-cached, ");
            }
            if (this.f9097k) {
                sb.append("no-transform, ");
            }
            if (this.f9098l) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                str = "";
            } else {
                sb.delete(sb.length() - 2, sb.length());
                str = sb.toString();
            }
            this.f9099m = str;
        }
        return str;
    }

    public d(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = -1;
        this.f9090d = -1;
        this.f9091e = false;
        this.f9092f = false;
        this.f9093g = false;
        this.f9094h = aVar.c;
        this.f9095i = -1;
        this.f9096j = aVar.f9100d;
        this.f9097k = false;
        this.f9098l = false;
    }
}
