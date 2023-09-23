package f.e.a.r;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ByteBufferUtil.java */
/* loaded from: classes.dex */
public final class a {
    public static final AtomicReference<byte[]> a = new AtomicReference<>();

    /* compiled from: ByteBufferUtil.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final int b;
        public final byte[] c;

        public b(byte[] bArr, int i2, int i3) {
            this.c = bArr;
            this.a = i2;
            this.b = i3;
        }
    }

    public static ByteBuffer a(File file) {
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length <= 2147483647L) {
                if (length != 0) {
                    randomAccessFile = new RandomAccessFile(file, "r");
                    try {
                        fileChannel = randomAccessFile.getChannel();
                        MappedByteBuffer load = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                        try {
                            fileChannel.close();
                        } catch (IOException unused) {
                        }
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused2) {
                        }
                        return load;
                    } catch (Throwable th) {
                        th = th;
                        if (fileChannel != null) {
                            try {
                                fileChannel.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (randomAccessFile != null) {
                            try {
                                randomAccessFile.close();
                            } catch (IOException unused4) {
                            }
                        }
                        throw th;
                    }
                }
                throw new IOException("File unsuitable for memory mapping");
            }
            throw new IOException("File too large to map into memory");
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    public static ByteBuffer b(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = a.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int read = inputStream.read(andSet);
            if (read >= 0) {
                byteArrayOutputStream.write(andSet, 0, read);
            } else {
                a.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return c(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
        }
    }

    public static ByteBuffer c(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    public static void d(ByteBuffer byteBuffer, File file) {
        RandomAccessFile randomAccessFile;
        ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(0);
        FileChannel fileChannel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
        } catch (Throwable th) {
            th = th;
            randomAccessFile = null;
        }
        try {
            fileChannel = randomAccessFile.getChannel();
            fileChannel.write(byteBuffer);
            fileChannel.force(false);
            fileChannel.close();
            randomAccessFile.close();
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (IOException unused3) {
                }
            }
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    /* compiled from: ByteBufferUtil.java */
    /* renamed from: f.e.a.r.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0092a extends InputStream {

        /* renamed from: f  reason: collision with root package name */
        public final ByteBuffer f3598f;

        /* renamed from: g  reason: collision with root package name */
        public int f3599g = -1;

        public C0092a(ByteBuffer byteBuffer) {
            this.f3598f = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f3598f.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i2) {
            this.f3599g = this.f3598f.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f3598f.hasRemaining()) {
                return this.f3598f.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            int i2 = this.f3599g;
            if (i2 != -1) {
                this.f3598f.position(i2);
            } else {
                throw new IOException("Cannot reset to unset mark position");
            }
        }

        @Override // java.io.InputStream
        public long skip(long j2) {
            if (this.f3598f.hasRemaining()) {
                long min = Math.min(j2, available());
                ByteBuffer byteBuffer = this.f3598f;
                byteBuffer.position((int) (byteBuffer.position() + min));
                return min;
            }
            return -1L;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) {
            if (this.f3598f.hasRemaining()) {
                int min = Math.min(i3, available());
                this.f3598f.get(bArr, i2, min);
                return min;
            }
            return -1;
        }
    }
}
