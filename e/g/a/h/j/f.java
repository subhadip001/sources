package e.g.a.h.j;

import java.util.ArrayList;
import java.util.List;

/* compiled from: DependencyNode.java */
/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d  reason: collision with root package name */
    public o f2069d;

    /* renamed from: f  reason: collision with root package name */
    public int f2071f;

    /* renamed from: g  reason: collision with root package name */
    public int f2072g;
    public d a = null;
    public boolean b = false;
    public boolean c = false;

    /* renamed from: e  reason: collision with root package name */
    public a f2070e = a.UNKNOWN;

    /* renamed from: h  reason: collision with root package name */
    public int f2073h = 1;

    /* renamed from: i  reason: collision with root package name */
    public g f2074i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2075j = false;

    /* renamed from: k  reason: collision with root package name */
    public List<d> f2076k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public List<f> f2077l = new ArrayList();

    /* compiled from: DependencyNode.java */
    /* loaded from: classes.dex */
    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(o oVar) {
        this.f2069d = oVar;
    }

    @Override // e.g.a.h.j.d
    public void a(d dVar) {
        for (f fVar : this.f2077l) {
            if (!fVar.f2075j) {
                return;
            }
        }
        this.c = true;
        d dVar2 = this.a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.b) {
            this.f2069d.a(this);
            return;
        }
        f fVar2 = null;
        int i2 = 0;
        for (f fVar3 : this.f2077l) {
            if (!(fVar3 instanceof g)) {
                i2++;
                fVar2 = fVar3;
            }
        }
        if (fVar2 != null && i2 == 1 && fVar2.f2075j) {
            g gVar = this.f2074i;
            if (gVar != null) {
                if (!gVar.f2075j) {
                    return;
                }
                this.f2071f = this.f2073h * gVar.f2072g;
            }
            c(fVar2.f2072g + this.f2071f);
        }
        d dVar3 = this.a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b() {
        this.f2077l.clear();
        this.f2076k.clear();
        this.f2075j = false;
        this.f2072g = 0;
        this.c = false;
        this.b = false;
    }

    public void c(int i2) {
        if (this.f2075j) {
            return;
        }
        this.f2075j = true;
        this.f2072g = i2;
        for (d dVar : this.f2076k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2069d.b.j0);
        sb.append(":");
        sb.append(this.f2070e);
        sb.append("(");
        sb.append(this.f2075j ? Integer.valueOf(this.f2072g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f2077l.size());
        sb.append(":d=");
        sb.append(this.f2076k.size());
        sb.append(">");
        return sb.toString();
    }
}
