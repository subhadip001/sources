package e.o.a;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import com.google.android.gms.common.api.Api;
import com.google.logging.type.LogSeverity;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* compiled from: ExifInterface.java */
/* loaded from: classes.dex */
public class a {
    public static SimpleDateFormat G;
    public static SimpleDateFormat H;
    public static final String[] I;
    public static final int[] J;
    public static final byte[] K;
    public static final d[] L;
    public static final d[] M;
    public static final d[] N;
    public static final d[] O;
    public static final d[] P;
    public static final d Q;
    public static final d[] R;
    public static final d[] S;
    public static final d[] T;
    public static final d[] U;
    public static final d[][] V;
    public static final d[] W;
    public static final HashMap<Integer, d>[] X;
    public static final HashMap<String, d>[] Y;
    public static final HashSet<String> Z;
    public static final HashMap<Integer, Integer> a0;
    public static final Charset b0;
    public static final byte[] c0;
    public static final byte[] d0;
    public String a;
    public FileDescriptor b;
    public AssetManager.AssetInputStream c;

    /* renamed from: d  reason: collision with root package name */
    public int f2652d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2653e;

    /* renamed from: f  reason: collision with root package name */
    public final HashMap<String, c>[] f2654f;

    /* renamed from: g  reason: collision with root package name */
    public Set<Integer> f2655g;

    /* renamed from: h  reason: collision with root package name */
    public ByteOrder f2656h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2657i;

    /* renamed from: j  reason: collision with root package name */
    public int f2658j;

    /* renamed from: k  reason: collision with root package name */
    public int f2659k;

    /* renamed from: l  reason: collision with root package name */
    public int f2660l;

    /* renamed from: m  reason: collision with root package name */
    public int f2661m;
    public int n;
    public static final boolean o = Log.isLoggable("ExifInterface", 3);
    public static final List<Integer> p = Arrays.asList(1, 6, 3, 8);
    public static final List<Integer> q = Arrays.asList(2, 7, 4, 5);
    public static final int[] r = {8, 8, 8};
    public static final int[] s = {8};
    public static final byte[] t = {-1, -40, -1};
    public static final byte[] u = {102, 116, 121, 112};
    public static final byte[] v = {109, 105, 102, 49};
    public static final byte[] w = {104, 101, 105, 99};
    public static final byte[] x = {79, 76, 89, 77, 80, 0};
    public static final byte[] y = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] z = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] A = {101, 88, 73, 102};
    public static final byte[] B = {73, 72, 68, 82};
    public static final byte[] C = {73, 69, 78, 68};
    public static final byte[] D = {82, 73, 70, 70};
    public static final byte[] E = {87, 69, 66, 80};
    public static final byte[] F = {69, 88, 73, 70};

    /* compiled from: ExifInterface.java */
    /* renamed from: e.o.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0052a extends MediaDataSource {

        /* renamed from: f  reason: collision with root package name */
        public long f2662f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f f2663g;

        public C0052a(a aVar, f fVar) {
            this.f2663g = fVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j2, byte[] bArr, int i2, int i3) {
            if (i3 == 0) {
                return 0;
            }
            if (j2 < 0) {
                return -1;
            }
            try {
                long j3 = this.f2662f;
                if (j3 != j2) {
                    if (j3 >= 0 && j2 >= j3 + this.f2663g.available()) {
                        return -1;
                    }
                    this.f2663g.g(j2);
                    this.f2662f = j2;
                }
                if (i3 > this.f2663g.available()) {
                    i3 = this.f2663g.available();
                }
                f fVar = this.f2663g;
                int read = fVar.f2666f.read(bArr, i2, i3);
                fVar.f2668h += read;
                if (read >= 0) {
                    this.f2662f += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f2662f = -1L;
            return -1;
        }
    }

    /* compiled from: ExifInterface.java */
    /* loaded from: classes.dex */
    public static class b extends InputStream implements DataInput {

        /* renamed from: j  reason: collision with root package name */
        public static final ByteOrder f2664j = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: k  reason: collision with root package name */
        public static final ByteOrder f2665k = ByteOrder.BIG_ENDIAN;

        /* renamed from: f  reason: collision with root package name */
        public final DataInputStream f2666f;

        /* renamed from: g  reason: collision with root package name */
        public ByteOrder f2667g;

        /* renamed from: h  reason: collision with root package name */
        public int f2668h;

        /* renamed from: i  reason: collision with root package name */
        public byte[] f2669i;

        public b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        public long a() {
            return readInt() & 4294967295L;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f2666f.available();
        }

        public void f(int i2) {
            int i3 = 0;
            while (i3 < i2) {
                int i4 = i2 - i3;
                int skip = (int) this.f2666f.skip(i4);
                if (skip <= 0) {
                    if (this.f2669i == null) {
                        this.f2669i = new byte[8192];
                    }
                    skip = this.f2666f.read(this.f2669i, 0, Math.min(8192, i4));
                    if (skip == -1) {
                        throw new EOFException(f.a.b.a.a.j("Reached EOF while skipping ", i2, " bytes."));
                    }
                }
                i3 += skip;
            }
            this.f2668h += i3;
        }

        @Override // java.io.InputStream
        public void mark(int i2) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public int read() {
            this.f2668h++;
            return this.f2666f.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f2668h++;
            return this.f2666f.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() {
            this.f2668h++;
            int read = this.f2666f.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f2668h += 2;
            return this.f2666f.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i2, int i3) {
            this.f2668h += i3;
            this.f2666f.readFully(bArr, i2, i3);
        }

        @Override // java.io.DataInput
        public int readInt() {
            this.f2668h += 4;
            int read = this.f2666f.read();
            int read2 = this.f2666f.read();
            int read3 = this.f2666f.read();
            int read4 = this.f2666f.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.f2667g;
                if (byteOrder == f2664j) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f2665k) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                StringBuilder A = f.a.b.a.a.A("Invalid byte order: ");
                A.append(this.f2667g);
                throw new IOException(A.toString());
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() {
            this.f2668h += 8;
            int read = this.f2666f.read();
            int read2 = this.f2666f.read();
            int read3 = this.f2666f.read();
            int read4 = this.f2666f.read();
            int read5 = this.f2666f.read();
            int read6 = this.f2666f.read();
            int read7 = this.f2666f.read();
            int read8 = this.f2666f.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.f2667g;
                if (byteOrder == f2664j) {
                    return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f2665k) {
                    return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
                }
                StringBuilder A = f.a.b.a.a.A("Invalid byte order: ");
                A.append(this.f2667g);
                throw new IOException(A.toString());
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public short readShort() {
            this.f2668h += 2;
            int read = this.f2666f.read();
            int read2 = this.f2666f.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f2667g;
                if (byteOrder == f2664j) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == f2665k) {
                    return (short) ((read << 8) + read2);
                }
                StringBuilder A = f.a.b.a.a.A("Invalid byte order: ");
                A.append(this.f2667g);
                throw new IOException(A.toString());
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f2668h += 2;
            return this.f2666f.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f2668h++;
            return this.f2666f.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() {
            this.f2668h += 2;
            int read = this.f2666f.read();
            int read2 = this.f2666f.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f2667g;
                if (byteOrder == f2664j) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == f2665k) {
                    return (read << 8) + read2;
                }
                StringBuilder A = f.a.b.a.a.A("Invalid byte order: ");
                A.append(this.f2667g);
                throw new IOException(A.toString());
            }
            throw new EOFException();
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i2) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public b(InputStream inputStream, ByteOrder byteOrder) {
            this.f2667g = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f2666f = dataInputStream;
            dataInputStream.mark(0);
            this.f2668h = 0;
            this.f2667g = byteOrder;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) {
            int read = this.f2666f.read(bArr, i2, i3);
            this.f2668h += read;
            return read;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) {
            this.f2668h += bArr.length;
            this.f2666f.readFully(bArr);
        }
    }

    /* compiled from: ExifInterface.java */
    /* loaded from: classes.dex */
    public static class e {
        public final long a;
        public final long b;

        public e(long j2, long j3) {
            if (j3 == 0) {
                this.a = 0L;
                this.b = 1L;
                return;
            }
            this.a = j2;
            this.b = j3;
        }

        public String toString() {
            return this.a + "/" + this.b;
        }
    }

    static {
        d[] dVarArr;
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        I = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        J = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        K = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        d[] dVarArr2 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", LogSeverity.ALERT_VALUE, 1)};
        L = dVarArr2;
        d[] dVarArr3 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        M = dVarArr3;
        d[] dVarArr4 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        N = dVarArr4;
        d[] dVarArr5 = {new d("InteroperabilityIndex", 1, 2)};
        O = dVarArr5;
        d[] dVarArr6 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Xmp", LogSeverity.ALERT_VALUE, 1), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        P = dVarArr6;
        Q = new d("StripOffsets", 273, 3);
        d[] dVarArr7 = {new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)};
        R = dVarArr7;
        d[] dVarArr8 = {new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)};
        S = dVarArr8;
        d[] dVarArr9 = {new d("AspectFrame", 4371, 3)};
        T = dVarArr9;
        d[] dVarArr10 = {new d("ColorSpace", 55, 3)};
        U = dVarArr10;
        d[][] dVarArr11 = {dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr6, dVarArr2, dVarArr7, dVarArr8, dVarArr9, dVarArr10};
        V = dVarArr11;
        W = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        X = new HashMap[dVarArr11.length];
        Y = new HashMap[dVarArr11.length];
        Z = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        a0 = new HashMap<>();
        Charset forName = Charset.forName("US-ASCII");
        b0 = forName;
        c0 = "Exif\u0000\u0000".getBytes(forName);
        d0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        G = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        H = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            d[][] dVarArr12 = V;
            if (i2 < dVarArr12.length) {
                X[i2] = new HashMap<>();
                Y[i2] = new HashMap<>();
                for (d dVar : dVarArr12[i2]) {
                    X[i2].put(Integer.valueOf(dVar.a), dVar);
                    Y[i2].put(dVar.b, dVar);
                }
                i2++;
            } else {
                HashMap<Integer, Integer> hashMap = a0;
                d[] dVarArr13 = W;
                hashMap.put(Integer.valueOf(dVarArr13[0].a), 5);
                hashMap.put(Integer.valueOf(dVarArr13[1].a), 1);
                hashMap.put(Integer.valueOf(dVarArr13[2].a), 2);
                hashMap.put(Integer.valueOf(dVarArr13[3].a), 3);
                hashMap.put(Integer.valueOf(dVarArr13[4].a), 7);
                hashMap.put(Integer.valueOf(dVarArr13[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    public a(String str) {
        FileInputStream fileInputStream;
        d[][] dVarArr = V;
        this.f2654f = new HashMap[dVarArr.length];
        this.f2655g = new HashSet(dVarArr.length);
        this.f2656h = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(str, "filename cannot be null");
        FileInputStream fileInputStream2 = null;
        this.c = null;
        this.a = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (p(fileInputStream.getFD())) {
                this.b = fileInputStream.getFD();
            } else {
                this.b = null;
            }
            r(fileInputStream);
            try {
                fileInputStream.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (RuntimeException e3) {
                    throw e3;
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    public static boolean p(FileDescriptor fileDescriptor) {
        try {
            e.o.a.b.c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (o) {
                Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                return false;
            }
            return false;
        }
    }

    public final void A(f fVar, int i2) {
        c d2;
        c d3;
        c cVar = this.f2654f[i2].get("DefaultCropSize");
        c cVar2 = this.f2654f[i2].get("SensorTopBorder");
        c cVar3 = this.f2654f[i2].get("SensorLeftBorder");
        c cVar4 = this.f2654f[i2].get("SensorBottomBorder");
        c cVar5 = this.f2654f[i2].get("SensorRightBorder");
        if (cVar != null) {
            if (cVar.a == 5) {
                e[] eVarArr = (e[]) cVar.h(this.f2656h);
                if (eVarArr != null && eVarArr.length == 2) {
                    d2 = c.c(eVarArr[0], this.f2656h);
                    d3 = c.c(eVarArr[1], this.f2656h);
                } else {
                    StringBuilder A2 = f.a.b.a.a.A("Invalid crop size values. cropSize=");
                    A2.append(Arrays.toString(eVarArr));
                    Log.w("ExifInterface", A2.toString());
                    return;
                }
            } else {
                int[] iArr = (int[]) cVar.h(this.f2656h);
                if (iArr != null && iArr.length == 2) {
                    d2 = c.d(iArr[0], this.f2656h);
                    d3 = c.d(iArr[1], this.f2656h);
                } else {
                    StringBuilder A3 = f.a.b.a.a.A("Invalid crop size values. cropSize=");
                    A3.append(Arrays.toString(iArr));
                    Log.w("ExifInterface", A3.toString());
                    return;
                }
            }
            this.f2654f[i2].put("ImageWidth", d2);
            this.f2654f[i2].put("ImageLength", d3);
        } else if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int f2 = cVar2.f(this.f2656h);
            int f3 = cVar4.f(this.f2656h);
            int f4 = cVar5.f(this.f2656h);
            int f5 = cVar3.f(this.f2656h);
            if (f3 <= f2 || f4 <= f5) {
                return;
            }
            c d4 = c.d(f3 - f2, this.f2656h);
            c d5 = c.d(f4 - f5, this.f2656h);
            this.f2654f[i2].put("ImageLength", d4);
            this.f2654f[i2].put("ImageWidth", d5);
        } else {
            c cVar6 = this.f2654f[i2].get("ImageLength");
            c cVar7 = this.f2654f[i2].get("ImageWidth");
            if (cVar6 == null || cVar7 == null) {
                c cVar8 = this.f2654f[i2].get("JPEGInterchangeFormat");
                c cVar9 = this.f2654f[i2].get("JPEGInterchangeFormatLength");
                if (cVar8 == null || cVar9 == null) {
                    return;
                }
                int f6 = cVar8.f(this.f2656h);
                int f7 = cVar8.f(this.f2656h);
                fVar.g(f6);
                byte[] bArr = new byte[f7];
                fVar.read(bArr);
                f(new b(bArr), f6, i2);
            }
        }
    }

    public final void B() {
        z(0, 5);
        z(0, 4);
        z(5, 4);
        c cVar = this.f2654f[1].get("PixelXDimension");
        c cVar2 = this.f2654f[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            this.f2654f[0].put("ImageWidth", cVar);
            this.f2654f[0].put("ImageLength", cVar2);
        }
        if (this.f2654f[4].isEmpty() && q(this.f2654f[5])) {
            HashMap<String, c>[] hashMapArr = this.f2654f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!q(this.f2654f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        x(0, "ThumbnailOrientation", "Orientation");
        x(0, "ThumbnailImageLength", "ImageLength");
        x(0, "ThumbnailImageWidth", "ImageWidth");
        x(5, "ThumbnailOrientation", "Orientation");
        x(5, "ThumbnailImageLength", "ImageLength");
        x(5, "ThumbnailImageWidth", "ImageWidth");
        x(4, "Orientation", "ThumbnailOrientation");
        x(4, "ImageLength", "ThumbnailImageLength");
        x(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void a() {
        String b2 = b("DateTimeOriginal");
        if (b2 != null && b("DateTime") == null) {
            this.f2654f[0].put("DateTime", c.a(b2));
        }
        if (b("ImageWidth") == null) {
            this.f2654f[0].put("ImageWidth", c.b(0L, this.f2656h));
        }
        if (b("ImageLength") == null) {
            this.f2654f[0].put("ImageLength", c.b(0L, this.f2656h));
        }
        if (b("Orientation") == null) {
            this.f2654f[0].put("Orientation", c.b(0L, this.f2656h));
        }
        if (b("LightSource") == null) {
            this.f2654f[1].put("LightSource", c.b(0L, this.f2656h));
        }
    }

    public String b(String str) {
        c d2 = d(str);
        if (d2 != null) {
            if (!Z.contains(str)) {
                return d2.g(this.f2656h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i2 = d2.a;
                if (i2 != 5 && i2 != 10) {
                    StringBuilder A2 = f.a.b.a.a.A("GPS Timestamp format is not rational. format=");
                    A2.append(d2.a);
                    Log.w("ExifInterface", A2.toString());
                    return null;
                }
                e[] eVarArr = (e[]) d2.h(this.f2656h);
                if (eVarArr != null && eVarArr.length == 3) {
                    return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) eVarArr[0].a) / ((float) eVarArr[0].b))), Integer.valueOf((int) (((float) eVarArr[1].a) / ((float) eVarArr[1].b))), Integer.valueOf((int) (((float) eVarArr[2].a) / ((float) eVarArr[2].b))));
                }
                StringBuilder A3 = f.a.b.a.a.A("Invalid GPS Timestamp array. array=");
                A3.append(Arrays.toString(eVarArr));
                Log.w("ExifInterface", A3.toString());
                return null;
            }
            try {
                return Double.toString(d2.e(this.f2656h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public int c(String str, int i2) {
        c d2 = d(str);
        if (d2 == null) {
            return i2;
        }
        try {
            return d2.f(this.f2656h);
        } catch (NumberFormatException unused) {
            return i2;
        }
    }

    public final c d(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (o) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i2 = 0; i2 < V.length; i2++) {
            c cVar = this.f2654f[i2].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    public final void e(f fVar) {
        String str;
        String str2;
        if (Build.VERSION.SDK_INT >= 28) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    e.o.a.c.a(mediaMetadataRetriever, new C0052a(this, fVar));
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                    String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                    String str3 = null;
                    if ("yes".equals(extractMetadata3)) {
                        str3 = mediaMetadataRetriever.extractMetadata(29);
                        str = mediaMetadataRetriever.extractMetadata(30);
                        str2 = mediaMetadataRetriever.extractMetadata(31);
                    } else if ("yes".equals(extractMetadata4)) {
                        str3 = mediaMetadataRetriever.extractMetadata(18);
                        str = mediaMetadataRetriever.extractMetadata(19);
                        str2 = mediaMetadataRetriever.extractMetadata(24);
                    } else {
                        str = null;
                        str2 = null;
                    }
                    if (str3 != null) {
                        this.f2654f[0].put("ImageWidth", c.d(Integer.parseInt(str3), this.f2656h));
                    }
                    if (str != null) {
                        this.f2654f[0].put("ImageLength", c.d(Integer.parseInt(str), this.f2656h));
                    }
                    if (str2 != null) {
                        int i2 = 1;
                        int parseInt = Integer.parseInt(str2);
                        if (parseInt == 90) {
                            i2 = 6;
                        } else if (parseInt == 180) {
                            i2 = 3;
                        } else if (parseInt == 270) {
                            i2 = 8;
                        }
                        this.f2654f[0].put("Orientation", c.d(i2, this.f2656h));
                    }
                    if (extractMetadata != null && extractMetadata2 != null) {
                        int parseInt2 = Integer.parseInt(extractMetadata);
                        int parseInt3 = Integer.parseInt(extractMetadata2);
                        if (parseInt3 > 6) {
                            fVar.g(parseInt2);
                            byte[] bArr = new byte[6];
                            if (fVar.read(bArr) == 6) {
                                int i3 = parseInt2 + 6;
                                int i4 = parseInt3 - 6;
                                if (Arrays.equals(bArr, c0)) {
                                    byte[] bArr2 = new byte[i4];
                                    if (fVar.read(bArr2) == i4) {
                                        this.f2659k = i3;
                                        v(bArr2, 0);
                                    } else {
                                        throw new IOException("Can't read exif");
                                    }
                                } else {
                                    throw new IOException("Invalid identifier");
                                }
                            } else {
                                throw new IOException("Can't read identifier");
                            }
                        } else {
                            throw new IOException("Invalid exif length");
                        }
                    }
                    if (o) {
                        Log.d("ExifInterface", "Heif meta: " + str3 + "x" + str + ", rotation " + str2);
                    }
                    return;
                } catch (RuntimeException unused) {
                    throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
                }
            } finally {
                mediaMetadataRetriever.release();
            }
        }
        throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x018f, code lost:
        r19.f2667g = r18.f2656h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0193, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(e.o.a.a.b r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.o.a.a.f(e.o.a.a$b, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ce, code lost:
        if (r8 != null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0144 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0112 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0110 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(java.io.BufferedInputStream r18) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.o.a.a.g(java.io.BufferedInputStream):int");
    }

    public final void h(f fVar) {
        k(fVar);
        c cVar = this.f2654f[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f2670d);
            fVar2.f2667g = this.f2656h;
            byte[] bArr = x;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            fVar2.f2668h += length;
            fVar2.f2666f.readFully(bArr2);
            fVar2.g(0L);
            byte[] bArr3 = y;
            int length2 = bArr3.length;
            byte[] bArr4 = new byte[length2];
            fVar2.f2668h += length2;
            fVar2.f2666f.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.g(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.g(12L);
            }
            w(fVar2, 6);
            c cVar2 = this.f2654f[7].get("PreviewImageStart");
            c cVar3 = this.f2654f[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                this.f2654f[5].put("JPEGInterchangeFormat", cVar2);
                this.f2654f[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = this.f2654f[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.h(this.f2656h);
                if (iArr != null && iArr.length == 4) {
                    if (iArr[2] <= iArr[0] || iArr[3] <= iArr[1]) {
                        return;
                    }
                    int i2 = (iArr[2] - iArr[0]) + 1;
                    int i3 = (iArr[3] - iArr[1]) + 1;
                    if (i2 < i3) {
                        int i4 = i2 + i3;
                        i3 = i4 - i3;
                        i2 = i4 - i3;
                    }
                    c d2 = c.d(i2, this.f2656h);
                    c d3 = c.d(i3, this.f2656h);
                    this.f2654f[0].put("ImageWidth", d2);
                    this.f2654f[0].put("ImageLength", d3);
                    return;
                }
                StringBuilder A2 = f.a.b.a.a.A("Invalid aspect frame values. frame=");
                A2.append(Arrays.toString(iArr));
                Log.w("ExifInterface", A2.toString());
            }
        }
    }

    public final void i(b bVar) {
        if (o) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f2667g = ByteOrder.BIG_ENDIAN;
        byte[] bArr = z;
        bVar.f(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i2 = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i3 = i2 + 4;
                    if (i3 == 16 && !Arrays.equals(bArr2, B)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    if (Arrays.equals(bArr2, C)) {
                        return;
                    }
                    if (Arrays.equals(bArr2, A)) {
                        byte[] bArr3 = new byte[readInt];
                        if (bVar.read(bArr3) == readInt) {
                            int readInt2 = bVar.readInt();
                            CRC32 crc32 = new CRC32();
                            crc32.update(bArr2);
                            crc32.update(bArr3);
                            if (((int) crc32.getValue()) == readInt2) {
                                this.f2659k = i3;
                                v(bArr3, 0);
                                B();
                                y(new b(bArr3));
                                return;
                            }
                            throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + e.i.a.d(bArr2));
                    }
                    int i4 = readInt + 4;
                    bVar.f(i4);
                    length = i3 + i4;
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void j(b bVar) {
        boolean z2 = o;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.f(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i2 = ByteBuffer.wrap(bArr).getInt();
        int i3 = ByteBuffer.wrap(bArr2).getInt();
        int i4 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i3];
        bVar.f(i2 - bVar.f2668h);
        bVar.read(bArr4);
        f(new b(bArr4), i2, 5);
        bVar.f(i4 - bVar.f2668h);
        bVar.f2667g = ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        if (z2) {
            f.a.b.a.a.N("numberOfDirectoryEntry: ", readInt, "ExifInterface");
        }
        for (int i5 = 0; i5 < readInt; i5++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == Q.a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c d2 = c.d(readShort, this.f2656h);
                c d3 = c.d(readShort2, this.f2656h);
                this.f2654f[0].put("ImageLength", d2);
                this.f2654f[0].put("ImageWidth", d3);
                if (o) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.f(readUnsignedShort2);
        }
    }

    public final void k(f fVar) {
        c cVar;
        s(fVar);
        w(fVar, 0);
        A(fVar, 0);
        A(fVar, 5);
        A(fVar, 4);
        B();
        if (this.f2652d != 8 || (cVar = this.f2654f[1].get("MakerNote")) == null) {
            return;
        }
        f fVar2 = new f(cVar.f2670d);
        fVar2.f2667g = this.f2656h;
        fVar2.f(6);
        w(fVar2, 9);
        c cVar2 = this.f2654f[9].get("ColorSpace");
        if (cVar2 != null) {
            this.f2654f[1].put("ColorSpace", cVar2);
        }
    }

    public final void l(f fVar) {
        if (o) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        k(fVar);
        c cVar = this.f2654f[0].get("JpgFromRaw");
        if (cVar != null) {
            f(new b(cVar.f2670d), (int) cVar.c, 5);
        }
        c cVar2 = this.f2654f[0].get("ISO");
        c cVar3 = this.f2654f[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        this.f2654f[1].put("PhotographicSensitivity", cVar2);
    }

    public final void m(f fVar) {
        byte[] bArr = c0;
        fVar.f(bArr.length);
        int available = fVar.available();
        byte[] bArr2 = new byte[available];
        fVar.f2668h += available;
        fVar.f2666f.readFully(bArr2);
        this.f2659k = bArr.length;
        v(bArr2, 0);
    }

    public final void n(b bVar) {
        if (o) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f2667g = ByteOrder.LITTLE_ENDIAN;
        bVar.f(D.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = E;
        bVar.f(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int readInt2 = bVar.readInt();
                    int i2 = length + 4 + 4;
                    if (Arrays.equals(F, bArr2)) {
                        byte[] bArr3 = new byte[readInt2];
                        if (bVar.read(bArr3) == readInt2) {
                            this.f2659k = i2;
                            v(bArr3, 0);
                            y(new b(bArr3));
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + e.i.a.d(bArr2));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    length = i2 + readInt2;
                    if (length == readInt) {
                        return;
                    }
                    if (length <= readInt) {
                        bVar.f(readInt2);
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void o(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int f2 = cVar.f(this.f2656h);
        int f3 = cVar2.f(this.f2656h);
        if (this.f2652d == 7) {
            f2 += this.f2660l;
        }
        if (f2 > 0 && f3 > 0 && this.a == null && this.c == null && this.b == null) {
            bVar.skip(f2);
            bVar.read(new byte[f3]);
        }
        if (o) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + f2 + ", length: " + f3);
        }
    }

    public final boolean q(HashMap hashMap) {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.f(this.f2656h) <= 512 && cVar2.f(this.f2656h) <= 512;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c A[Catch: all -> 0x0097, UnsupportedOperationException -> 0x0099, IOException | UnsupportedOperationException -> 0x009b, TryCatch #0 {all -> 0x0097, blocks: (B:3:0x0002, B:5:0x0007, B:6:0x0013, B:8:0x0017, B:9:0x0025, B:18:0x003c, B:20:0x0045, B:31:0x0065, B:21:0x0049, B:23:0x004f, B:26:0x0056, B:29:0x005e, B:30:0x0062, B:32:0x006f, B:34:0x007a, B:36:0x0080, B:38:0x0086, B:40:0x008c, B:49:0x009c, B:51:0x00a0), top: B:60:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f A[Catch: all -> 0x0097, UnsupportedOperationException -> 0x0099, IOException | UnsupportedOperationException -> 0x009b, TryCatch #0 {all -> 0x0097, blocks: (B:3:0x0002, B:5:0x0007, B:6:0x0013, B:8:0x0017, B:9:0x0025, B:18:0x003c, B:20:0x0045, B:31:0x0065, B:21:0x0049, B:23:0x004f, B:26:0x0056, B:29:0x005e, B:30:0x0062, B:32:0x006f, B:34:0x007a, B:36:0x0080, B:38:0x0086, B:40:0x008c, B:49:0x009c, B:51:0x00a0), top: B:60:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(java.io.InputStream r8) {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            e.o.a.a$d[][] r2 = e.o.a.a.V     // Catch: java.lang.Throwable -> L97 java.lang.UnsupportedOperationException -> L99 java.io.IOException -> L9b
            int r2 = r2.length     // Catch: java.lang.Throwable -> L97 java.lang.UnsupportedOperationException -> L99 java.io.IOException -> L9b
            if (r1 >= r2) goto L13
            java.util.HashMap<java.lang.String, e.o.a.a$c>[] r2 = r7.f2654f     // Catch: java.lang.Throwable -> L97 java.lang.UnsupportedOperationException -> L99 java.io.IOException -> L9b
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> L97 java.lang.UnsupportedOperationException -> L99 java.io.IOException -> L9b
            r3.<init>()     // Catch: java.lang.Throwable -> L97 java.lang.UnsupportedOperationException -> L99 java.io.IOException -> L9b
            r2[r1] = r3     // Catch: java.lang.Throwable -> L97 java.lang.UnsupportedOperationException -> L99 java.io.IOException -> L9b
            int r1 = r1 + 1
            goto L2
        L13:
            boolean r1 = r7.f2653e     // Catch: java.lang.Throwable -> L97 java.lang.UnsupportedOperationException -> L99 java.io.IOException -> L9b
            if (r1 != 0) goto L25
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L97 java.lang.UnsupportedOperationException -> L99 java.io.IOException -> L9b
            r2 = 5000(0x1388, float:7.006E-42)
            r1.<init>(r8, r2)     // Catch: java.lang.Throwable -> L97 java.lang.UnsupportedOperationException -> L99 java.io.IOException -> L9b
            int r8 = r7.g(r1)     // Catch: java.lang.Throwable -> L97 java.lang.UnsupportedOperationException -> L99 java.io.IOException -> L9b
            r7.f2652d = r8     // Catch: java.lang.Throwable -> L97 java.lang.UnsupportedOperationException -> L99 java.io.IOException -> L9b
            r8 = r1
        L25:
            int r1 = r7.f2652d     // Catch: java.lang.Throwable -> L97 java.lang.UnsupportedOperationException -> L99 java.io.IOException -> L9b
            r2 = 14
            r3 = 13
            r4 = 9
            r5 = 4
            if (r1 == r5) goto L39
            if (r1 == r4) goto L39
            if (r1 == r3) goto L39
            if (r1 != r2) goto L37
            goto L39
        L37:
            r1 = 1
            goto L3a
        L39:
            r1 = 0
        L3a:
            if (r1 == 0) goto L6f
            e.o.a.a$f r0 = new e.o.a.a$f     // Catch: java.lang.Throwable -> L97 java.lang.UnsupportedOperationException -> L99 java.io.IOException -> L9b
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L97 java.lang.UnsupportedOperationException -> L99 java.io.IOException -> L9b
            boolean r8 = r7.f2653e     // Catch: java.lang.Throwable -> L97 java.lang.UnsupportedOperationException -> L99 java.io.IOException -> L9b
            if (r8 == 0) goto L49
            r7.m(r0)     // Catch: java.lang.Throwable -> L97 java.lang.UnsupportedOperationException -> L99 java.io.IOException -> L9b
            goto L65
        L49:
            int r8 = r7.f2652d     // Catch: java.lang.Throwable -> L97 java.lang.UnsupportedOperationException -> L99 java.io.IOException -> L9b
            r1 = 12
            if (r8 != r1) goto L53
            r7.e(r0)     // Catch: java.lang.Throwable -> L97 java.lang.UnsupportedOperationException -> L99 java.io.IOException -> L9b
            goto L65
        L53:
            r1 = 7
            if (r8 != r1) goto L5a
            r7.h(r0)     // Catch: java.lang.Throwable -> L97 java.lang.UnsupportedOperationException -> L99 java.io.IOException -> L9b
            goto L65
        L5a:
            r1 = 10
            if (r8 != r1) goto L62
            r7.l(r0)     // Catch: java.lang.Throwable -> L97 java.lang.UnsupportedOperationException -> L99 java.io.IOException -> L9b
            goto L65
        L62:
            r7.k(r0)     // Catch: java.lang.Throwable -> L97 java.lang.UnsupportedOperationException -> L99 java.io.IOException -> L9b
        L65:
            int r8 = r7.f2659k     // Catch: java.lang.Throwable -> L97 java.lang.UnsupportedOperationException -> L99 java.io.IOException -> L9b
            long r1 = (long) r8     // Catch: java.lang.Throwable -> L97 java.lang.UnsupportedOperationException -> L99 java.io.IOException -> L9b
            r0.g(r1)     // Catch: java.lang.Throwable -> L97 java.lang.UnsupportedOperationException -> L99 java.io.IOException -> L9b
            r7.y(r0)     // Catch: java.lang.Throwable -> L97 java.lang.UnsupportedOperationException -> L99 java.io.IOException -> L9b
            goto L8f
        L6f:
            e.o.a.a$b r1 = new e.o.a.a$b     // Catch: java.lang.Throwable -> L97 java.lang.UnsupportedOperationException -> L99 java.io.IOException -> L9b
            java.nio.ByteOrder r6 = java.nio.ByteOrder.BIG_ENDIAN     // Catch: java.lang.Throwable -> L97 java.lang.UnsupportedOperationException -> L99 java.io.IOException -> L9b
            r1.<init>(r8, r6)     // Catch: java.lang.Throwable -> L97 java.lang.UnsupportedOperationException -> L99 java.io.IOException -> L9b
            int r8 = r7.f2652d     // Catch: java.lang.Throwable -> L97 java.lang.UnsupportedOperationException -> L99 java.io.IOException -> L9b
            if (r8 != r5) goto L7e
            r7.f(r1, r0, r0)     // Catch: java.lang.Throwable -> L97 java.lang.UnsupportedOperationException -> L99 java.io.IOException -> L9b
            goto L8f
        L7e:
            if (r8 != r3) goto L84
            r7.i(r1)     // Catch: java.lang.Throwable -> L97 java.lang.UnsupportedOperationException -> L99 java.io.IOException -> L9b
            goto L8f
        L84:
            if (r8 != r4) goto L8a
            r7.j(r1)     // Catch: java.lang.Throwable -> L97 java.lang.UnsupportedOperationException -> L99 java.io.IOException -> L9b
            goto L8f
        L8a:
            if (r8 != r2) goto L8f
            r7.n(r1)     // Catch: java.lang.Throwable -> L97 java.lang.UnsupportedOperationException -> L99 java.io.IOException -> L9b
        L8f:
            r7.a()
            boolean r8 = e.o.a.a.o
            if (r8 == 0) goto Laf
            goto Lac
        L97:
            r8 = move-exception
            goto Lb0
        L99:
            r8 = move-exception
            goto L9c
        L9b:
            r8 = move-exception
        L9c:
            boolean r0 = e.o.a.a.o     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto La7
            java.lang.String r1 = "ExifInterface"
            java.lang.String r2 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r2, r8)     // Catch: java.lang.Throwable -> L97
        La7:
            r7.a()
            if (r0 == 0) goto Laf
        Lac:
            r7.t()
        Laf:
            return
        Lb0:
            r7.a()
            boolean r0 = e.o.a.a.o
            if (r0 == 0) goto Lba
            r7.t()
        Lba:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e.o.a.a.r(java.io.InputStream):void");
    }

    public final void s(b bVar) {
        ByteOrder u2 = u(bVar);
        this.f2656h = u2;
        bVar.f2667g = u2;
        int readUnsignedShort = bVar.readUnsignedShort();
        int i2 = this.f2652d;
        if (i2 != 7 && i2 != 10 && readUnsignedShort != 42) {
            StringBuilder A2 = f.a.b.a.a.A("Invalid start code: ");
            A2.append(Integer.toHexString(readUnsignedShort));
            throw new IOException(A2.toString());
        }
        int readInt = bVar.readInt();
        if (readInt < 8) {
            throw new IOException(f.a.b.a.a.i("Invalid first Ifd offset: ", readInt));
        }
        int i3 = readInt - 8;
        if (i3 > 0) {
            bVar.f(i3);
        }
    }

    public final void t() {
        for (int i2 = 0; i2 < this.f2654f.length; i2++) {
            StringBuilder B2 = f.a.b.a.a.B("The size of tag group[", i2, "]: ");
            B2.append(this.f2654f[i2].size());
            Log.d("ExifInterface", B2.toString());
            for (Map.Entry<String, c> entry : this.f2654f[i2].entrySet()) {
                c value = entry.getValue();
                StringBuilder A2 = f.a.b.a.a.A("tagName: ");
                A2.append(entry.getKey());
                A2.append(", tagType: ");
                A2.append(value.toString());
                A2.append(", tagValue: '");
                A2.append(value.g(this.f2656h));
                A2.append("'");
                Log.d("ExifInterface", A2.toString());
            }
        }
    }

    public final ByteOrder u(b bVar) {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            if (o) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (o) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            StringBuilder A2 = f.a.b.a.a.A("Invalid byte order: ");
            A2.append(Integer.toHexString(readShort));
            throw new IOException(A2.toString());
        }
    }

    public final void v(byte[] bArr, int i2) {
        f fVar = new f(bArr);
        s(fVar);
        w(fVar, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(e.o.a.a.f r22, int r23) {
        /*
            Method dump skipped, instructions count: 847
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.o.a.a.w(e.o.a.a$f, int):void");
    }

    public final void x(int i2, String str, String str2) {
        if (this.f2654f[i2].isEmpty() || this.f2654f[i2].get(str) == null) {
            return;
        }
        HashMap<String, c>[] hashMapArr = this.f2654f;
        hashMapArr[i2].put(str2, hashMapArr[i2].get(str));
        this.f2654f[i2].remove(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(e.o.a.a.b r20) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.o.a.a.y(e.o.a.a$b):void");
    }

    public final void z(int i2, int i3) {
        if (!this.f2654f[i2].isEmpty() && !this.f2654f[i3].isEmpty()) {
            c cVar = this.f2654f[i2].get("ImageLength");
            c cVar2 = this.f2654f[i2].get("ImageWidth");
            c cVar3 = this.f2654f[i3].get("ImageLength");
            c cVar4 = this.f2654f[i3].get("ImageWidth");
            if (cVar == null || cVar2 == null) {
                if (o) {
                    Log.d("ExifInterface", "First image does not contain valid size information");
                }
            } else if (cVar3 != null && cVar4 != null) {
                int f2 = cVar.f(this.f2656h);
                int f3 = cVar2.f(this.f2656h);
                int f4 = cVar3.f(this.f2656h);
                int f5 = cVar4.f(this.f2656h);
                if (f2 >= f4 || f3 >= f5) {
                    return;
                }
                HashMap<String, c>[] hashMapArr = this.f2654f;
                HashMap<String, c> hashMap = hashMapArr[i2];
                hashMapArr[i2] = hashMapArr[i3];
                hashMapArr[i3] = hashMap;
            } else if (o) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
            }
        } else if (o) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    /* compiled from: ExifInterface.java */
    /* loaded from: classes.dex */
    public static class f extends b {
        public f(byte[] bArr) {
            super(bArr);
            this.f2666f.mark(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }

        public void g(long j2) {
            int i2 = this.f2668h;
            if (i2 > j2) {
                this.f2668h = 0;
                this.f2666f.reset();
            } else {
                j2 -= i2;
            }
            f((int) j2);
        }

        public f(InputStream inputStream) {
            super(inputStream, ByteOrder.BIG_ENDIAN);
            if (inputStream.markSupported()) {
                this.f2666f.mark(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    /* compiled from: ExifInterface.java */
    /* loaded from: classes.dex */
    public static class c {
        public final int a;
        public final int b;
        public final long c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f2670d;

        public c(int i2, int i3, long j2, byte[] bArr) {
            this.a = i2;
            this.b = i3;
            this.c = j2;
            this.f2670d = bArr;
        }

        public static c a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.b0);
            return new c(2, bytes.length, bytes);
        }

        public static c b(long j2, ByteOrder byteOrder) {
            long[] jArr = {j2};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.J[4] * 1]);
            wrap.order(byteOrder);
            for (int i2 = 0; i2 < 1; i2++) {
                wrap.putInt((int) jArr[i2]);
            }
            return new c(4, 1, wrap.array());
        }

        public static c c(e eVar, ByteOrder byteOrder) {
            e[] eVarArr = {eVar};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.J[5] * 1]);
            wrap.order(byteOrder);
            for (int i2 = 0; i2 < 1; i2++) {
                e eVar2 = eVarArr[i2];
                wrap.putInt((int) eVar2.a);
                wrap.putInt((int) eVar2.b);
            }
            return new c(5, 1, wrap.array());
        }

        public static c d(int i2, ByteOrder byteOrder) {
            int[] iArr = {i2};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.J[3] * 1]);
            wrap.order(byteOrder);
            for (int i3 = 0; i3 < 1; i3++) {
                wrap.putShort((short) iArr[i3]);
            }
            return new c(3, 1, wrap.array());
        }

        public double e(ByteOrder byteOrder) {
            Object h2 = h(byteOrder);
            if (h2 != null) {
                if (h2 instanceof String) {
                    return Double.parseDouble((String) h2);
                }
                if (h2 instanceof long[]) {
                    long[] jArr = (long[]) h2;
                    if (jArr.length == 1) {
                        return jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h2 instanceof int[]) {
                    int[] iArr = (int[]) h2;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h2 instanceof double[]) {
                    double[] dArr = (double[]) h2;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h2 instanceof e[]) {
                    e[] eVarArr = (e[]) h2;
                    if (eVarArr.length == 1) {
                        e eVar = eVarArr[0];
                        return eVar.a / eVar.b;
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        }

        public int f(ByteOrder byteOrder) {
            Object h2 = h(byteOrder);
            if (h2 != null) {
                if (h2 instanceof String) {
                    return Integer.parseInt((String) h2);
                }
                if (h2 instanceof long[]) {
                    long[] jArr = (long[]) h2;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h2 instanceof int[]) {
                    int[] iArr = (int[]) h2;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }

        public String g(ByteOrder byteOrder) {
            Object h2 = h(byteOrder);
            if (h2 == null) {
                return null;
            }
            if (h2 instanceof String) {
                return (String) h2;
            }
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            if (h2 instanceof long[]) {
                long[] jArr = (long[]) h2;
                while (i2 < jArr.length) {
                    sb.append(jArr[i2]);
                    i2++;
                    if (i2 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (h2 instanceof int[]) {
                int[] iArr = (int[]) h2;
                while (i2 < iArr.length) {
                    sb.append(iArr[i2]);
                    i2++;
                    if (i2 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (h2 instanceof double[]) {
                double[] dArr = (double[]) h2;
                while (i2 < dArr.length) {
                    sb.append(dArr[i2]);
                    i2++;
                    if (i2 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (h2 instanceof e[]) {
                e[] eVarArr = (e[]) h2;
                while (i2 < eVarArr.length) {
                    sb.append(eVarArr[i2].a);
                    sb.append('/');
                    sb.append(eVarArr[i2].b);
                    i2++;
                    if (i2 != eVarArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else {
                return null;
            }
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x019f: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:152:0x019f */
        /* JADX WARN: Removed duplicated region for block: B:174:0x01a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object h(java.nio.ByteOrder r11) {
            /*
                Method dump skipped, instructions count: 456
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: e.o.a.a.c.h(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            StringBuilder A = f.a.b.a.a.A("(");
            A.append(a.I[this.a]);
            A.append(", data length:");
            return f.a.b.a.a.t(A, this.f2670d.length, ")");
        }

        public c(int i2, int i3, byte[] bArr) {
            this.a = i2;
            this.b = i3;
            this.c = -1L;
            this.f2670d = bArr;
        }
    }

    /* compiled from: ExifInterface.java */
    /* loaded from: classes.dex */
    public static class d {
        public final int a;
        public final String b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final int f2671d;

        public d(String str, int i2, int i3) {
            this.b = str;
            this.a = i2;
            this.c = i3;
            this.f2671d = -1;
        }

        public d(String str, int i2, int i3, int i4) {
            this.b = str;
            this.a = i2;
            this.c = i3;
            this.f2671d = i4;
        }
    }

    public a(InputStream inputStream) {
        d[][] dVarArr = V;
        this.f2654f = new HashMap[dVarArr.length];
        this.f2655g = new HashSet(dVarArr.length);
        this.f2656h = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(inputStream, "inputStream cannot be null");
        this.a = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.c = (AssetManager.AssetInputStream) inputStream;
            this.b = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                if (p(fileInputStream.getFD())) {
                    this.c = null;
                    this.b = fileInputStream.getFD();
                }
            }
            this.c = null;
            this.b = null;
        }
        r(inputStream);
    }
}
