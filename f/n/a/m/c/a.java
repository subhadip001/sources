package f.n.a.m.c;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: InputInformation.java */
/* loaded from: classes2.dex */
public class a implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    public String f7020h;

    /* renamed from: i  reason: collision with root package name */
    public String f7021i;

    /* renamed from: j  reason: collision with root package name */
    public String f7022j;

    /* renamed from: k  reason: collision with root package name */
    public String f7023k;

    /* renamed from: l  reason: collision with root package name */
    public int f7024l;

    /* renamed from: m  reason: collision with root package name */
    public int f7025m;
    public int n;
    public int o;
    public ArrayList<f.n.a.m.d.b> p;
    public ArrayList<f.n.a.m.d.b> q;
    public ArrayList<f.n.a.m.d.b> r;
    public String s;
    public long t;
    public boolean v;
    public String w;

    /* renamed from: f  reason: collision with root package name */
    public float f7018f = 0.0f;

    /* renamed from: g  reason: collision with root package name */
    public float f7019g = 100.0f;
    public long u = 0;
    public int x = 1;

    public a(String str) {
    }

    public ArrayList<f.n.a.m.d.b> a() {
        if (this.p == null) {
            this.p = new ArrayList<>();
        }
        return this.p;
    }

    public String b() {
        ArrayList<f.n.a.m.d.b> arrayList = this.p;
        if (arrayList == null || arrayList.size() == 0) {
            return null;
        }
        return this.p.get(0).f7031g;
    }

    public String c() {
        return String.format(Locale.US, "%dx%d", Integer.valueOf(this.o), Integer.valueOf(this.n));
    }

    public ArrayList<f.n.a.m.d.b> d() {
        if (this.q == null) {
            this.q = new ArrayList<>();
        }
        return this.q;
    }
}
