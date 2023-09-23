package g.a.w0.p.i;

import l.i;

/* compiled from: Header.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final i f8081d = i.j(":status");

    /* renamed from: e  reason: collision with root package name */
    public static final i f8082e = i.j(":method");

    /* renamed from: f  reason: collision with root package name */
    public static final i f8083f = i.j(":path");

    /* renamed from: g  reason: collision with root package name */
    public static final i f8084g = i.j(":scheme");

    /* renamed from: h  reason: collision with root package name */
    public static final i f8085h = i.j(":authority");
    public final i a;
    public final i b;
    public final int c;

    static {
        i.j(":host");
        i.j(":version");
    }

    public c(String str, String str2) {
        this(i.j(str), i.j(str2));
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && this.b.equals(cVar.b);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + 527) * 31);
    }

    public String toString() {
        return String.format("%s: %s", this.a.t(), this.b.t());
    }

    public c(i iVar, String str) {
        this(iVar, i.j(str));
    }

    public c(i iVar, i iVar2) {
        this.a = iVar;
        this.b = iVar2;
        this.c = iVar2.p() + iVar.p() + 32;
    }
}
