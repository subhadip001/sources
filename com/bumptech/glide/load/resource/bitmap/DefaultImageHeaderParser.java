package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Objects;

/* loaded from: classes.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {
    public static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    public static final int[] b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* loaded from: classes.dex */
    public interface Reader {

        /* loaded from: classes.dex */
        public static final class EndOfFileException extends IOException {
            public EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        long e(long j2);

        int f();

        int g(byte[] bArr, int i2);

        short h();
    }

    /* loaded from: classes.dex */
    public static final class a implements Reader {
        public final ByteBuffer a;

        public a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long e(long j2) {
            int min = (int) Math.min(this.a.remaining(), j2);
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int f() {
            return (h() << 8) | h();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int g(byte[] bArr, int i2) {
            int min = Math.min(i2, this.a.remaining());
            if (min == 0) {
                return -1;
            }
            this.a.get(bArr, 0, min);
            return min;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short h() {
            if (this.a.remaining() >= 1) {
                return (short) (this.a.get() & 255);
            }
            throw new Reader.EndOfFileException();
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final ByteBuffer a;

        public b(byte[] bArr, int i2) {
            this.a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i2);
        }

        public short a(int i2) {
            if (this.a.remaining() - i2 >= 2) {
                return this.a.getShort(i2);
            }
            return (short) -1;
        }

        public int b(int i2) {
            if (this.a.remaining() - i2 >= 4) {
                return this.a.getInt(i2);
            }
            return -1;
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements Reader {
        public final InputStream a;

        public c(InputStream inputStream) {
            this.a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long e(long j2) {
            if (j2 < 0) {
                return 0L;
            }
            long j3 = j2;
            while (j3 > 0) {
                long skip = this.a.skip(j3);
                if (skip <= 0) {
                    if (this.a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j3 -= skip;
            }
            return j2 - j3;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int f() {
            return (h() << 8) | h();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int g(byte[] bArr, int i2) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2 && (i4 = this.a.read(bArr, i3, i2 - i3)) != -1) {
                i3 += i4;
            }
            if (i3 == 0 && i4 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i3;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short h() {
            int read = this.a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new Reader.EndOfFileException();
        }
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        Objects.requireNonNull(byteBuffer, "Argument must not be null");
        return f(new a(byteBuffer));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int b(ByteBuffer byteBuffer, f.e.a.l.q.b0.b bVar) {
        Objects.requireNonNull(byteBuffer, "Argument must not be null");
        a aVar = new a(byteBuffer);
        Objects.requireNonNull(bVar, "Argument must not be null");
        return e(aVar, bVar);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType c(InputStream inputStream) {
        Objects.requireNonNull(inputStream, "Argument must not be null");
        return f(new c(inputStream));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int d(InputStream inputStream, f.e.a.l.q.b0.b bVar) {
        Objects.requireNonNull(inputStream, "Argument must not be null");
        c cVar = new c(inputStream);
        Objects.requireNonNull(bVar, "Argument must not be null");
        return e(cVar, bVar);
    }

    public final int e(Reader reader, f.e.a.l.q.b0.b bVar) {
        try {
            int f2 = reader.f();
            if (!((f2 & 65496) == 65496 || f2 == 19789 || f2 == 18761)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + f2);
                }
                return -1;
            }
            int g2 = g(reader);
            if (g2 == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) bVar.e(g2, byte[].class);
            int h2 = h(reader, bArr, g2);
            bVar.d(bArr);
            return h2;
        } catch (Reader.EndOfFileException unused) {
            return -1;
        }
    }

    public final ImageHeaderParser.ImageType f(Reader reader) {
        try {
            int f2 = reader.f();
            if (f2 == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int h2 = (f2 << 8) | reader.h();
            if (h2 == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int h3 = (h2 << 8) | reader.h();
            if (h3 == -1991225785) {
                reader.e(21L);
                try {
                    return reader.h() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            } else if (h3 != 1380533830) {
                boolean z = false;
                if (((reader.f() << 16) | reader.f()) == 1718909296) {
                    int f3 = (reader.f() << 16) | reader.f();
                    if (f3 != 1635150182 && f3 != 1635150195) {
                        reader.e(4L);
                        int i2 = h3 - 16;
                        if (i2 % 4 == 0) {
                            int i3 = 0;
                            while (i3 < 5 && i2 > 0) {
                                int f4 = (reader.f() << 16) | reader.f();
                                if (f4 != 1635150182 && f4 != 1635150195) {
                                    i3++;
                                    i2 -= 4;
                                }
                            }
                        }
                    }
                    z = true;
                    break;
                }
                return z ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
            } else {
                reader.e(4L);
                if (((reader.f() << 16) | reader.f()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int f5 = (reader.f() << 16) | reader.f();
                if ((f5 & (-256)) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i4 = f5 & 255;
                if (i4 != 88) {
                    if (i4 == 76) {
                        reader.e(4L);
                        return (reader.h() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                    }
                    return ImageHeaderParser.ImageType.WEBP;
                }
                reader.e(4L);
                short h4 = reader.h();
                if ((h4 & 2) != 0) {
                    return ImageHeaderParser.ImageType.ANIMATED_WEBP;
                }
                if ((h4 & 16) != 0) {
                    return ImageHeaderParser.ImageType.WEBP_A;
                }
                return ImageHeaderParser.ImageType.WEBP;
            }
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    public final int g(Reader reader) {
        short h2;
        int f2;
        long j2;
        long e2;
        do {
            short h3 = reader.h();
            if (h3 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    f.a.b.a.a.N("Unknown segmentId=", h3, "DfltImageHeaderParser");
                }
                return -1;
            }
            h2 = reader.h();
            if (h2 == 218) {
                return -1;
            }
            if (h2 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            f2 = reader.f() - 2;
            if (h2 == 225) {
                return f2;
            }
            j2 = f2;
            e2 = reader.e(j2);
        } while (e2 == j2);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder C = f.a.b.a.a.C("Unable to skip enough data, type: ", h2, ", wanted to skip: ", f2, ", but actually skipped: ");
            C.append(e2);
            Log.d("DfltImageHeaderParser", C.toString());
        }
        return -1;
    }

    public final int h(Reader reader, byte[] bArr, int i2) {
        ByteOrder byteOrder;
        int g2 = reader.g(bArr, i2);
        if (g2 != i2) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i2 + ", actually read: " + g2);
            }
            return -1;
        }
        boolean z = bArr != null && i2 > a.length;
        if (z) {
            int i3 = 0;
            while (true) {
                byte[] bArr2 = a;
                if (i3 >= bArr2.length) {
                    break;
                } else if (bArr[i3] != bArr2[i3]) {
                    z = false;
                    break;
                } else {
                    i3++;
                }
            }
        }
        if (z) {
            b bVar = new b(bArr, i2);
            short a2 = bVar.a(6);
            if (a2 == 18761) {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            } else if (a2 != 19789) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    f.a.b.a.a.N("Unknown endianness = ", a2, "DfltImageHeaderParser");
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.BIG_ENDIAN;
            }
            bVar.a.order(byteOrder);
            int b2 = bVar.b(10) + 6;
            short a3 = bVar.a(b2);
            for (int i4 = 0; i4 < a3; i4++) {
                int i5 = (i4 * 12) + b2 + 2;
                short a4 = bVar.a(i5);
                if (a4 == 274) {
                    short a5 = bVar.a(i5 + 2);
                    if (a5 >= 1 && a5 <= 12) {
                        int b3 = bVar.b(i5 + 4);
                        if (b3 < 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Negative tiff component count");
                            }
                        } else {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                StringBuilder C = f.a.b.a.a.C("Got tagIndex=", i4, " tagType=", a4, " formatCode=");
                                C.append((int) a5);
                                C.append(" componentCount=");
                                C.append(b3);
                                Log.d("DfltImageHeaderParser", C.toString());
                            }
                            int i6 = b3 + b[a5];
                            if (i6 > 4) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    f.a.b.a.a.N("Got byte count > 4, not orientation, continuing, formatCode=", a5, "DfltImageHeaderParser");
                                }
                            } else {
                                int i7 = i5 + 8;
                                if (i7 >= 0 && i7 <= bVar.a.remaining()) {
                                    if (i6 >= 0 && i6 + i7 <= bVar.a.remaining()) {
                                        return bVar.a(i7);
                                    }
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        f.a.b.a.a.N("Illegal number of bytes for TI tag data tagType=", a4, "DfltImageHeaderParser");
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i7 + " tagType=" + ((int) a4));
                                }
                            }
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        f.a.b.a.a.N("Got invalid format code = ", a5, "DfltImageHeaderParser");
                    }
                }
            }
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }
}
