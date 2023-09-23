package e.n.a.q;

import java.nio.ByteBuffer;

/* compiled from: Table.java */
/* loaded from: classes.dex */
public class c {
    public int a;
    public ByteBuffer b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f2646d;

    public c() {
        if (d.a == null) {
            d.a = new d();
        }
    }

    public int a(int i2) {
        if (i2 < this.f2646d) {
            return this.b.getShort(this.c + i2);
        }
        return 0;
    }

    public void b(int i2, ByteBuffer byteBuffer) {
        this.b = byteBuffer;
        if (byteBuffer != null) {
            this.a = i2;
            int i3 = i2 - byteBuffer.getInt(i2);
            this.c = i3;
            this.f2646d = this.b.getShort(i3);
            return;
        }
        this.a = 0;
        this.c = 0;
        this.f2646d = 0;
    }
}
