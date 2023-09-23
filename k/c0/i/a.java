package k.c0.i;

/* compiled from: Header.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final l.i f8969d = l.i.j(":");

    /* renamed from: e  reason: collision with root package name */
    public static final l.i f8970e = l.i.j(":status");

    /* renamed from: f  reason: collision with root package name */
    public static final l.i f8971f = l.i.j(":method");

    /* renamed from: g  reason: collision with root package name */
    public static final l.i f8972g = l.i.j(":path");

    /* renamed from: h  reason: collision with root package name */
    public static final l.i f8973h = l.i.j(":scheme");

    /* renamed from: i  reason: collision with root package name */
    public static final l.i f8974i = l.i.j(":authority");
    public final l.i a;
    public final l.i b;
    public final int c;

    public a(String str, String str2) {
        this(l.i.j(str), l.i.j(str2));
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + 527) * 31);
    }

    public String toString() {
        return k.c0.c.l("%s: %s", this.a.t(), this.b.t());
    }

    public a(l.i iVar, String str) {
        this(iVar, l.i.j(str));
    }

    public a(l.i iVar, l.i iVar2) {
        this.a = iVar;
        this.b = iVar2;
        this.c = iVar2.p() + iVar.p() + 32;
    }
}
