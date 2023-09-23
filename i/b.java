package i;

import i.l.b.i;

/* compiled from: KotlinVersion.kt */
/* loaded from: classes2.dex */
public final class b implements Comparable<b> {

    /* renamed from: j  reason: collision with root package name */
    public static final b f8601j = new b(1, 7, 10);

    /* renamed from: f  reason: collision with root package name */
    public final int f8602f;

    /* renamed from: g  reason: collision with root package name */
    public final int f8603g;

    /* renamed from: h  reason: collision with root package name */
    public final int f8604h;

    /* renamed from: i  reason: collision with root package name */
    public final int f8605i;

    public b(int i2, int i3, int i4) {
        this.f8602f = i2;
        this.f8603g = i3;
        this.f8604h = i4;
        boolean z = false;
        if (new i.n.c(0, 255).a(i2) && new i.n.c(0, 255).a(i3) && new i.n.c(0, 255).a(i4)) {
            z = true;
        }
        if (z) {
            this.f8605i = (i2 << 16) + (i3 << 8) + i4;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i2 + '.' + i3 + '.' + i4).toString());
    }

    @Override // java.lang.Comparable
    public int compareTo(b bVar) {
        b bVar2 = bVar;
        i.e(bVar2, "other");
        return this.f8605i - bVar2.f8605i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        b bVar = obj instanceof b ? (b) obj : null;
        return bVar != null && this.f8605i == bVar.f8605i;
    }

    public int hashCode() {
        return this.f8605i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8602f);
        sb.append('.');
        sb.append(this.f8603g);
        sb.append('.');
        sb.append(this.f8604h);
        return sb.toString();
    }
}
