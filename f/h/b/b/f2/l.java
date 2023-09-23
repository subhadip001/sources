package f.h.b.b.f2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.RequestConfiguration;
import f.h.b.b.b2.z;
import f.h.b.b.f2.d;
import f.h.b.b.f2.l;
import f.h.b.b.g2.b0;
import f.h.b.b.g2.l;
import f.h.b.b.g2.v;
import f.h.b.b.t1.w0;
import f.h.b.b.t1.x0;
import f.h.c.b.n0;
import f.h.c.b.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: DefaultBandwidthMeter.java */
/* loaded from: classes.dex */
public final class l implements d, t {
    public static final f.h.c.b.r<String, Integer> n = h();
    public static final f.h.c.b.q<Long> o = f.h.c.b.q.s(6100000L, 3800000L, 2100000L, 1300000L, 590000L);
    public static final f.h.c.b.q<Long> p = f.h.c.b.q.s(218000L, 159000L, 145000L, 130000L, 112000L);
    public static final f.h.c.b.q<Long> q = f.h.c.b.q.s(2200000L, 1300000L, 930000L, 730000L, 530000L);
    public static final f.h.c.b.q<Long> r = f.h.c.b.q.s(4800000L, 2700000L, 1800000L, 1200000L, 630000L);
    public static final f.h.c.b.q<Long> s = f.h.c.b.q.s(12000000L, 8800000L, 5900000L, 3500000L, 1800000L);
    public static l t;
    public final Context a;
    public final f.h.c.b.s<Integer, Long> b;
    public final d.a.C0107a c;

    /* renamed from: d  reason: collision with root package name */
    public final v f4219d;

    /* renamed from: e  reason: collision with root package name */
    public final f.h.b.b.g2.f f4220e;

    /* renamed from: f  reason: collision with root package name */
    public int f4221f;

    /* renamed from: g  reason: collision with root package name */
    public long f4222g;

    /* renamed from: h  reason: collision with root package name */
    public long f4223h;

    /* renamed from: i  reason: collision with root package name */
    public int f4224i;

    /* renamed from: j  reason: collision with root package name */
    public long f4225j;

    /* renamed from: k  reason: collision with root package name */
    public long f4226k;

    /* renamed from: l  reason: collision with root package name */
    public long f4227l;

    /* renamed from: m  reason: collision with root package name */
    public long f4228m;

    /* compiled from: DefaultBandwidthMeter.java */
    /* loaded from: classes.dex */
    public static class a extends BroadcastReceiver {
        public static a c;
        public final Handler a = new Handler(Looper.getMainLooper());
        public final ArrayList<WeakReference<l>> b = new ArrayList<>();

        public final void a() {
            for (int size = this.b.size() - 1; size >= 0; size--) {
                if (this.b.get(size).get() == null) {
                    this.b.remove(size);
                }
            }
        }

        public final void b(l lVar) {
            f.h.c.b.r<String, Integer> rVar = l.n;
            synchronized (lVar) {
                Context context = lVar.a;
                int p = context == null ? 0 : b0.p(context);
                if (lVar.f4224i == p) {
                    return;
                }
                lVar.f4224i = p;
                if (p != 1 && p != 0 && p != 8) {
                    lVar.f4227l = lVar.i(p);
                    long elapsedRealtime = lVar.f4220e.elapsedRealtime();
                    lVar.k(lVar.f4221f > 0 ? (int) (elapsedRealtime - lVar.f4222g) : 0, lVar.f4223h, lVar.f4227l);
                    lVar.f4222g = elapsedRealtime;
                    lVar.f4223h = 0L;
                    lVar.f4226k = 0L;
                    lVar.f4225j = 0L;
                    v vVar = lVar.f4219d;
                    vVar.b.clear();
                    vVar.f4303d = -1;
                    vVar.f4304e = 0;
                    vVar.f4305f = 0;
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            a();
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                l lVar = this.b.get(i2).get();
                if (lVar != null) {
                    b(lVar);
                }
            }
        }
    }

    @Deprecated
    public l() {
        this(null, n0.f5958l, 2000, f.h.b.b.g2.f.a, false);
    }

    public static f.h.c.b.r<String, Integer> h() {
        r.a f2 = f.h.c.b.r.f();
        f2.b("AD", 1, 2, 0, 0, 2);
        f2.b("AE", 1, 4, 4, 4, 1);
        f2.b("AF", 4, 4, 3, 4, 2);
        f2.b("AG", 2, 2, 1, 1, 2);
        f2.b("AI", 1, 2, 2, 2, 2);
        f2.b("AL", 1, 1, 0, 1, 2);
        f2.b("AM", 2, 2, 1, 2, 2);
        f2.b("AO", 3, 4, 4, 2, 2);
        f2.b("AR", 2, 4, 2, 2, 2);
        f2.b("AS", 2, 2, 4, 3, 2);
        f2.b("AT", 0, 3, 0, 0, 2);
        f2.b("AU", 0, 2, 0, 1, 1);
        f2.b("AW", 1, 2, 0, 4, 2);
        f2.b("AX", 0, 2, 2, 2, 2);
        f2.b("AZ", 3, 3, 3, 4, 2);
        f2.b("BA", 1, 1, 0, 1, 2);
        f2.b("BB", 0, 2, 0, 0, 2);
        f2.b("BD", 2, 0, 3, 3, 2);
        f2.b("BE", 0, 1, 2, 3, 2);
        f2.b("BF", 4, 4, 4, 2, 2);
        f2.b("BG", 0, 1, 0, 0, 2);
        f2.b("BH", 1, 0, 2, 4, 2);
        f2.b("BI", 4, 4, 4, 4, 2);
        f2.b("BJ", 4, 4, 3, 4, 2);
        f2.b("BL", 1, 2, 2, 2, 2);
        f2.b("BM", 1, 2, 0, 0, 2);
        f2.b("BN", 4, 0, 1, 1, 2);
        f2.b("BO", 2, 3, 3, 2, 2);
        f2.b("BQ", 1, 2, 1, 2, 2);
        f2.b("BR", 2, 4, 2, 1, 2);
        f2.b("BS", 3, 2, 2, 3, 2);
        f2.b("BT", 3, 0, 3, 2, 2);
        f2.b("BW", 3, 4, 2, 2, 2);
        f2.b("BY", 1, 0, 2, 1, 2);
        f2.b("BZ", 2, 2, 2, 1, 2);
        f2.b("CA", 0, 3, 1, 2, 3);
        f2.b("CD", 4, 3, 2, 2, 2);
        f2.b("CF", 4, 2, 2, 2, 2);
        f2.b("CG", 3, 4, 1, 1, 2);
        f2.b("CH", 0, 1, 0, 0, 0);
        f2.b("CI", 3, 3, 3, 3, 2);
        f2.b("CK", 3, 2, 1, 0, 2);
        f2.b("CL", 1, 1, 2, 3, 2);
        f2.b("CM", 3, 4, 3, 2, 2);
        f2.b("CN", 2, 2, 2, 1, 3);
        f2.b("CO", 2, 4, 3, 2, 2);
        f2.b("CR", 2, 3, 4, 4, 2);
        f2.b("CU", 4, 4, 2, 1, 2);
        f2.b("CV", 2, 3, 3, 3, 2);
        f2.b("CW", 1, 2, 0, 0, 2);
        f2.b("CY", 1, 2, 0, 0, 2);
        f2.b("CZ", 0, 1, 0, 0, 2);
        f2.b("DE", 0, 1, 1, 2, 0);
        f2.b("DJ", 4, 1, 4, 4, 2);
        f2.b("DK", 0, 0, 1, 0, 2);
        f2.b("DM", 1, 2, 2, 2, 2);
        f2.b("DO", 3, 4, 4, 4, 2);
        f2.b("DZ", 3, 2, 4, 4, 2);
        f2.b("EC", 2, 4, 3, 2, 2);
        f2.b("EE", 0, 0, 0, 0, 2);
        f2.b("EG", 3, 4, 2, 1, 2);
        f2.b("EH", 2, 2, 2, 2, 2);
        f2.b("ER", 4, 2, 2, 2, 2);
        f2.b("ES", 0, 1, 2, 1, 2);
        f2.b("ET", 4, 4, 4, 1, 2);
        f2.b("FI", 0, 0, 1, 0, 0);
        f2.b("FJ", 3, 0, 3, 3, 2);
        f2.b("FK", 2, 2, 2, 2, 2);
        f2.b("FM", 4, 2, 4, 3, 2);
        f2.b("FO", 0, 2, 0, 0, 2);
        f2.b("FR", 1, 0, 2, 1, 2);
        f2.b("GA", 3, 3, 1, 0, 2);
        f2.b("GB", 0, 0, 1, 2, 2);
        f2.b("GD", 1, 2, 2, 2, 2);
        f2.b("GE", 1, 0, 1, 3, 2);
        f2.b("GF", 2, 2, 2, 4, 2);
        f2.b("GG", 0, 2, 0, 0, 2);
        f2.b("GH", 3, 2, 3, 2, 2);
        f2.b("GI", 0, 2, 0, 0, 2);
        f2.b("GL", 1, 2, 2, 1, 2);
        f2.b("GM", 4, 3, 2, 4, 2);
        f2.b("GN", 4, 3, 4, 2, 2);
        f2.b("GP", 2, 2, 3, 4, 2);
        f2.b("GQ", 4, 2, 3, 4, 2);
        f2.b("GR", 1, 1, 0, 1, 2);
        f2.b("GT", 3, 2, 3, 2, 2);
        f2.b("GU", 1, 2, 4, 4, 2);
        f2.b("GW", 3, 4, 4, 3, 2);
        f2.b("GY", 3, 3, 1, 0, 2);
        f2.b("HK", 0, 2, 3, 4, 2);
        f2.b("HN", 3, 0, 3, 3, 2);
        f2.b("HR", 1, 1, 0, 1, 2);
        f2.b("HT", 4, 3, 4, 4, 2);
        f2.b("HU", 0, 1, 0, 0, 2);
        f2.b("ID", 3, 2, 2, 3, 2);
        f2.b("IE", 0, 0, 1, 1, 2);
        f2.b("IL", 1, 0, 2, 3, 2);
        f2.b("IM", 0, 2, 0, 1, 2);
        f2.b("IN", 2, 1, 3, 3, 2);
        f2.b("IO", 4, 2, 2, 4, 2);
        f2.b("IQ", 3, 2, 4, 3, 2);
        f2.b("IR", 4, 2, 3, 4, 2);
        f2.b("IS", 0, 2, 0, 0, 2);
        f2.b("IT", 0, 0, 1, 1, 2);
        f2.b("JE", 2, 2, 0, 2, 2);
        f2.b("JM", 3, 3, 4, 4, 2);
        f2.b("JO", 1, 2, 1, 1, 2);
        f2.b("JP", 0, 2, 0, 1, 3);
        f2.b("KE", 3, 4, 2, 2, 2);
        f2.b("KG", 1, 0, 2, 2, 2);
        f2.b("KH", 2, 0, 4, 3, 2);
        f2.b("KI", 4, 2, 3, 1, 2);
        f2.b("KM", 4, 2, 2, 3, 2);
        f2.b("KN", 1, 2, 2, 2, 2);
        f2.b("KP", 4, 2, 2, 2, 2);
        f2.b("KR", 0, 2, 1, 1, 1);
        f2.b("KW", 2, 3, 1, 1, 1);
        f2.b("KY", 1, 2, 0, 0, 2);
        f2.b("KZ", 1, 2, 2, 3, 2);
        f2.b("LA", 2, 2, 1, 1, 2);
        f2.b("LB", 3, 2, 0, 0, 2);
        f2.b("LC", 1, 1, 0, 0, 2);
        f2.b("LI", 0, 2, 2, 2, 2);
        f2.b("LK", 2, 0, 2, 3, 2);
        f2.b("LR", 3, 4, 3, 2, 2);
        f2.b("LS", 3, 3, 2, 3, 2);
        f2.b("LT", 0, 0, 0, 0, 2);
        f2.b("LU", 0, 0, 0, 0, 2);
        f2.b("LV", 0, 0, 0, 0, 2);
        f2.b("LY", 4, 2, 4, 3, 2);
        f2.b(RequestConfiguration.MAX_AD_CONTENT_RATING_MA, 2, 1, 2, 1, 2);
        f2.b("MC", 0, 2, 2, 2, 2);
        f2.b("MD", 1, 2, 0, 0, 2);
        f2.b("ME", 1, 2, 1, 2, 2);
        f2.b("MF", 1, 2, 1, 0, 2);
        f2.b("MG", 3, 4, 3, 3, 2);
        f2.b("MH", 4, 2, 2, 4, 2);
        f2.b("MK", 1, 0, 0, 0, 2);
        f2.b("ML", 4, 4, 1, 1, 2);
        f2.b("MM", 2, 3, 2, 2, 2);
        f2.b("MN", 2, 4, 1, 1, 2);
        f2.b("MO", 0, 2, 4, 4, 2);
        f2.b("MP", 0, 2, 2, 2, 2);
        f2.b("MQ", 2, 2, 2, 3, 2);
        f2.b("MR", 3, 0, 4, 2, 2);
        f2.b("MS", 1, 2, 2, 2, 2);
        f2.b("MT", 0, 2, 0, 1, 2);
        f2.b("MU", 3, 1, 2, 3, 2);
        f2.b("MV", 4, 3, 1, 4, 2);
        f2.b("MW", 4, 1, 1, 0, 2);
        f2.b("MX", 2, 4, 3, 3, 2);
        f2.b("MY", 2, 0, 3, 3, 2);
        f2.b("MZ", 3, 3, 2, 3, 2);
        f2.b("NA", 4, 3, 2, 2, 2);
        f2.b("NC", 2, 0, 4, 4, 2);
        f2.b("NE", 4, 4, 4, 4, 2);
        f2.b("NF", 2, 2, 2, 2, 2);
        f2.b("NG", 3, 3, 2, 2, 2);
        f2.b("NI", 3, 1, 4, 4, 2);
        f2.b("NL", 0, 2, 4, 2, 0);
        f2.b("NO", 0, 1, 1, 0, 2);
        f2.b("NP", 2, 0, 4, 3, 2);
        f2.b("NR", 4, 2, 3, 1, 2);
        f2.b("NU", 4, 2, 2, 2, 2);
        f2.b("NZ", 0, 2, 1, 2, 4);
        f2.b("OM", 2, 2, 0, 2, 2);
        f2.b("PA", 1, 3, 3, 4, 2);
        f2.b("PE", 2, 4, 4, 4, 2);
        f2.b("PF", 2, 2, 1, 1, 2);
        f2.b(RequestConfiguration.MAX_AD_CONTENT_RATING_PG, 4, 3, 3, 2, 2);
        f2.b("PH", 3, 0, 3, 4, 4);
        f2.b("PK", 3, 2, 3, 3, 2);
        f2.b("PL", 1, 0, 2, 2, 2);
        f2.b("PM", 0, 2, 2, 2, 2);
        f2.b("PR", 1, 2, 2, 3, 4);
        f2.b("PS", 3, 3, 2, 2, 2);
        f2.b("PT", 1, 1, 0, 0, 2);
        f2.b("PW", 1, 2, 3, 0, 2);
        f2.b("PY", 2, 0, 3, 3, 2);
        f2.b("QA", 2, 3, 1, 2, 2);
        f2.b("RE", 1, 0, 2, 1, 2);
        f2.b("RO", 1, 1, 1, 2, 2);
        f2.b("RS", 1, 2, 0, 0, 2);
        f2.b("RU", 0, 1, 0, 1, 2);
        f2.b("RW", 4, 3, 3, 4, 2);
        f2.b("SA", 2, 2, 2, 1, 2);
        f2.b("SB", 4, 2, 4, 2, 2);
        f2.b("SC", 4, 2, 0, 1, 2);
        f2.b("SD", 4, 4, 4, 3, 2);
        f2.b("SE", 0, 0, 0, 0, 2);
        f2.b("SG", 0, 0, 3, 3, 4);
        f2.b("SH", 4, 2, 2, 2, 2);
        f2.b("SI", 0, 1, 0, 0, 2);
        f2.b("SJ", 2, 2, 2, 2, 2);
        f2.b("SK", 0, 1, 0, 0, 2);
        f2.b("SL", 4, 3, 3, 1, 2);
        f2.b("SM", 0, 2, 2, 2, 2);
        f2.b("SN", 4, 4, 4, 3, 2);
        f2.b("SO", 3, 4, 4, 4, 2);
        f2.b("SR", 3, 2, 3, 1, 2);
        f2.b("SS", 4, 1, 4, 2, 2);
        f2.b("ST", 2, 2, 1, 2, 2);
        f2.b("SV", 2, 1, 4, 4, 2);
        f2.b("SX", 2, 2, 1, 0, 2);
        f2.b("SY", 4, 3, 2, 2, 2);
        f2.b("SZ", 3, 4, 3, 4, 2);
        f2.b("TC", 1, 2, 1, 0, 2);
        f2.b("TD", 4, 4, 4, 4, 2);
        f2.b("TG", 3, 2, 1, 0, 2);
        f2.b("TH", 1, 3, 4, 3, 0);
        f2.b("TJ", 4, 4, 4, 4, 2);
        f2.b("TL", 4, 1, 4, 4, 2);
        f2.b("TM", 4, 2, 1, 2, 2);
        f2.b("TN", 2, 1, 1, 1, 2);
        f2.b("TO", 3, 3, 4, 2, 2);
        f2.b("TR", 1, 2, 1, 1, 2);
        f2.b("TT", 1, 3, 1, 3, 2);
        f2.b("TV", 3, 2, 2, 4, 2);
        f2.b("TW", 0, 0, 0, 0, 1);
        f2.b("TZ", 3, 3, 3, 2, 2);
        f2.b("UA", 0, 3, 0, 0, 2);
        f2.b("UG", 3, 2, 2, 3, 2);
        f2.b("US", 0, 1, 3, 3, 3);
        f2.b("UY", 2, 1, 1, 1, 2);
        f2.b("UZ", 2, 0, 3, 2, 2);
        f2.b("VC", 2, 2, 2, 2, 2);
        f2.b("VE", 4, 4, 4, 4, 2);
        f2.b("VG", 2, 2, 1, 2, 2);
        f2.b("VI", 1, 2, 2, 4, 2);
        f2.b("VN", 0, 1, 4, 4, 2);
        f2.b("VU", 4, 1, 3, 1, 2);
        f2.b("WS", 3, 1, 4, 2, 2);
        f2.b("XK", 1, 1, 1, 0, 2);
        f2.b("YE", 4, 4, 4, 4, 2);
        f2.b("YT", 3, 2, 1, 3, 2);
        f2.b("ZA", 2, 3, 2, 2, 2);
        f2.b("ZM", 3, 2, 2, 3, 2);
        f2.b("ZW", 3, 3, 3, 3, 2);
        return f2.a();
    }

    public static boolean j(j jVar, boolean z) {
        if (z) {
            return !((jVar.f4214h & 8) == 8);
        }
        return false;
    }

    @Override // f.h.b.b.f2.t
    public synchronized void a(i iVar, j jVar, boolean z) {
        if (j(jVar, z)) {
            f.h.b.b.e2.j.g(this.f4221f > 0);
            long elapsedRealtime = this.f4220e.elapsedRealtime();
            int i2 = (int) (elapsedRealtime - this.f4222g);
            this.f4225j += i2;
            long j2 = this.f4226k;
            long j3 = this.f4223h;
            this.f4226k = j2 + j3;
            if (i2 > 0) {
                this.f4219d.a((int) Math.sqrt(j3), (((float) j3) * 8000.0f) / i2);
                if (this.f4225j >= 2000 || this.f4226k >= 524288) {
                    this.f4227l = this.f4219d.b(0.5f);
                }
                k(i2, this.f4223h, this.f4227l);
                this.f4222g = elapsedRealtime;
                this.f4223h = 0L;
            }
            this.f4221f--;
        }
    }

    @Override // f.h.b.b.f2.t
    public synchronized void b(i iVar, j jVar, boolean z) {
        if (j(jVar, z)) {
            if (this.f4221f == 0) {
                this.f4222g = this.f4220e.elapsedRealtime();
            }
            this.f4221f++;
        }
    }

    @Override // f.h.b.b.f2.d
    public t c() {
        return this;
    }

    @Override // f.h.b.b.f2.d
    public void d(d.a aVar) {
        this.c.a(aVar);
    }

    @Override // f.h.b.b.f2.t
    public synchronized void e(i iVar, j jVar, boolean z, int i2) {
        if (j(jVar, z)) {
            this.f4223h += i2;
        }
    }

    @Override // f.h.b.b.f2.d
    public void f(Handler handler, d.a aVar) {
        d.a.C0107a c0107a = this.c;
        Objects.requireNonNull(c0107a);
        c0107a.a(aVar);
        c0107a.a.add(new d.a.C0107a.C0108a(handler, aVar));
    }

    @Override // f.h.b.b.f2.t
    public void g(i iVar, j jVar, boolean z) {
    }

    public final long i(int i2) {
        Long l2 = this.b.get(Integer.valueOf(i2));
        if (l2 == null) {
            l2 = this.b.get(0);
        }
        if (l2 == null) {
            l2 = 1000000L;
        }
        return l2.longValue();
    }

    public final void k(final int i2, final long j2, final long j3) {
        if (i2 == 0 && j2 == 0 && j3 == this.f4228m) {
            return;
        }
        this.f4228m = j3;
        Iterator<d.a.C0107a.C0108a> it = this.c.a.iterator();
        while (it.hasNext()) {
            final d.a.C0107a.C0108a next = it.next();
            if (!next.c) {
                next.a.post(new Runnable() { // from class: f.h.b.b.f2.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.a.C0107a.C0108a c0108a = d.a.C0107a.C0108a.this;
                        final int i3 = i2;
                        final long j4 = j2;
                        final long j5 = j3;
                        w0 w0Var = (w0) c0108a.b;
                        w0.a aVar = w0Var.f4492i;
                        final x0.a R = w0Var.R(aVar.b.isEmpty() ? null : (z.a) f.h.b.c.a.r0(aVar.b));
                        l.a<x0> aVar2 = new l.a() { // from class: f.h.b.b.t1.k
                            @Override // f.h.b.b.g2.l.a
                            public final void b(Object obj) {
                                ((x0) obj).V();
                            }
                        };
                        w0Var.f4493j.put(1006, R);
                        f.h.b.b.g2.l<x0, x0.b> lVar = w0Var.f4494k;
                        lVar.b(1006, aVar2);
                        lVar.a();
                    }
                });
            }
        }
    }

    public l(Context context, Map<Integer, Long> map, int i2, f.h.b.b.g2.f fVar, boolean z) {
        final a aVar;
        this.a = context == null ? null : context.getApplicationContext();
        this.b = f.h.c.b.s.a(map);
        this.c = new d.a.C0107a();
        this.f4219d = new v(i2);
        this.f4220e = fVar;
        int p2 = context == null ? 0 : b0.p(context);
        this.f4224i = p2;
        this.f4227l = i(p2);
        if (context == null || !z) {
            return;
        }
        a aVar2 = a.c;
        synchronized (a.class) {
            if (a.c == null) {
                a.c = new a();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(a.c, intentFilter);
            }
            aVar = a.c;
        }
        synchronized (aVar) {
            aVar.a();
            aVar.b.add(new WeakReference<>(this));
            aVar.a.post(new Runnable() { // from class: f.h.b.b.f2.b
                @Override // java.lang.Runnable
                public final void run() {
                    l.a.this.b(this);
                }
            });
        }
    }
}
