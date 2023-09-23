package f.e.a.l.q.b0;

/* compiled from: ByteArrayAdapter.java */
/* loaded from: classes.dex */
public final class f implements a<byte[]> {
    @Override // f.e.a.l.q.b0.a
    public String a() {
        return "ByteArrayPool";
    }

    @Override // f.e.a.l.q.b0.a
    public int b() {
        return 1;
    }

    @Override // f.e.a.l.q.b0.a
    public int c(byte[] bArr) {
        return bArr.length;
    }

    @Override // f.e.a.l.q.b0.a
    public byte[] newArray(int i2) {
        return new byte[i2];
    }
}
