package f.e.a.l.s.d;

import f.e.a.l.q.v;
import java.util.Objects;

/* compiled from: BytesResource.java */
/* loaded from: classes.dex */
public class b implements v<byte[]> {

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f3488f;

    public b(byte[] bArr) {
        Objects.requireNonNull(bArr, "Argument must not be null");
        this.f3488f = bArr;
    }

    @Override // f.e.a.l.q.v
    public void a() {
    }

    @Override // f.e.a.l.q.v
    public int b() {
        return this.f3488f.length;
    }

    @Override // f.e.a.l.q.v
    public Class<byte[]> c() {
        return byte[].class;
    }

    @Override // f.e.a.l.q.v
    public byte[] get() {
        return this.f3488f;
    }
}
