package f.e.a.l.s.g;

import f.e.a.k.a;

/* compiled from: GifBitmapProvider.java */
/* loaded from: classes.dex */
public final class b implements a.InterfaceC0069a {
    public final f.e.a.l.q.b0.d a;
    public final f.e.a.l.q.b0.b b;

    public b(f.e.a.l.q.b0.d dVar, f.e.a.l.q.b0.b bVar) {
        this.a = dVar;
        this.b = bVar;
    }

    public byte[] a(int i2) {
        f.e.a.l.q.b0.b bVar = this.b;
        if (bVar == null) {
            return new byte[i2];
        }
        return (byte[]) bVar.e(i2, byte[].class);
    }
}
