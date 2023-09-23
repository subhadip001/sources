package f.h.h;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: Internal.java */
/* loaded from: classes2.dex */
public final class y {
    public static final Charset a;
    public static final byte[] b;

    /* compiled from: Internal.java */
    /* loaded from: classes2.dex */
    public interface a extends i<Boolean> {
    }

    /* compiled from: Internal.java */
    /* loaded from: classes2.dex */
    public interface b extends i<Double> {
    }

    /* compiled from: Internal.java */
    /* loaded from: classes2.dex */
    public interface c {
        int getNumber();
    }

    /* compiled from: Internal.java */
    /* loaded from: classes2.dex */
    public interface d<T extends c> {
        T findValueByNumber(int i2);
    }

    /* compiled from: Internal.java */
    /* loaded from: classes2.dex */
    public interface e {
        boolean isInRange(int i2);
    }

    /* compiled from: Internal.java */
    /* loaded from: classes2.dex */
    public interface f extends i<Float> {
    }

    /* compiled from: Internal.java */
    /* loaded from: classes2.dex */
    public interface g extends i<Integer> {
    }

    /* compiled from: Internal.java */
    /* loaded from: classes2.dex */
    public interface h extends i<Long> {
    }

    /* compiled from: Internal.java */
    /* loaded from: classes2.dex */
    public interface i<E> extends List<E>, RandomAccess {
        void f();

        boolean m0();

        i<E> p(int i2);
    }

    static {
        Charset.forName("US-ASCII");
        a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        k.h(bArr, 0, 0, false);
    }

    public static int a(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int b(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static Object c(Object obj, Object obj2) {
        return ((n0) obj).toBuilder().mergeFrom((n0) obj2).buildPartial();
    }
}
