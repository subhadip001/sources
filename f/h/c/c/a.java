package f.h.c.c;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;
import java.util.Queue;

/* compiled from: ByteStreams.java */
/* loaded from: classes.dex */
public final class a {
    public static final /* synthetic */ int a = 0;

    /* compiled from: ByteStreams.java */
    /* renamed from: f.h.c.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0137a extends OutputStream {
        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i2) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            Objects.requireNonNull(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) {
            Objects.requireNonNull(bArr);
            f.h.b.c.a.A(i2, i3 + i2, bArr.length);
        }
    }

    static {
        new C0137a();
    }

    public static byte[] a(Queue<byte[]> queue, int i2) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] remove = queue.remove();
        if (remove.length == i2) {
            return remove;
        }
        int length = i2 - remove.length;
        byte[] copyOf = Arrays.copyOf(remove, i2);
        while (length > 0) {
            byte[] remove2 = queue.remove();
            int min = Math.min(length, remove2.length);
            System.arraycopy(remove2, 0, copyOf, i2 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static byte[] b(InputStream inputStream) {
        Objects.requireNonNull(inputStream);
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i2 = 0;
        while (i2 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i2);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i3 = 0;
            while (i3 < min2) {
                int read = inputStream.read(bArr, i3, min2 - i3);
                if (read == -1) {
                    return a(arrayDeque, i2);
                }
                i3 += read;
                i2 += read;
            }
            min = f.h.b.c.a.S0(min * (min < 4096 ? 4 : 2));
        }
        if (inputStream.read() == -1) {
            return a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
