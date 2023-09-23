package f.e.a.l.s.d;

import f.e.a.l.p.e;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferRewinder.java */
/* loaded from: classes.dex */
public class a implements e<ByteBuffer> {
    public final ByteBuffer a;

    /* compiled from: ByteBufferRewinder.java */
    /* renamed from: f.e.a.l.s.d.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0086a implements e.a<ByteBuffer> {
        @Override // f.e.a.l.p.e.a
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // f.e.a.l.p.e.a
        public e<ByteBuffer> b(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // f.e.a.l.p.e
    public ByteBuffer a() {
        this.a.position(0);
        return this.a;
    }

    @Override // f.e.a.l.p.e
    public void b() {
    }
}
