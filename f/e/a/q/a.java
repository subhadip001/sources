package f.e.a.q;

import f.e.a.l.j;
import f.e.a.r.l;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: AndroidResourceSignature.java */
/* loaded from: classes.dex */
public final class a implements j {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f3597d = 0;
    public final int b;
    public final j c;

    public a(int i2, j jVar) {
        this.b = i2;
        this.c = jVar;
    }

    @Override // f.e.a.l.j
    public void a(MessageDigest messageDigest) {
        this.c.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.b).array());
    }

    @Override // f.e.a.l.j
    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.b == aVar.b && this.c.equals(aVar.c);
        }
        return false;
    }

    @Override // f.e.a.l.j
    public int hashCode() {
        return l.g(this.c, this.b);
    }
}
