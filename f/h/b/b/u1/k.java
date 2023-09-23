package f.h.b.b.u1;

import android.util.Log;
import com.google.android.exoplayer2.ParserException;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* compiled from: AacUtil.java */
/* loaded from: classes.dex */
public final class k {
    public static final int[] a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* compiled from: AacUtil.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final int b;
        public final String c;

        public b(int i2, int i3, String str, a aVar) {
            this.a = i2;
            this.b = i3;
            this.c = str;
        }
    }

    public static int a(int i2) {
        if (i2 != 2) {
            if (i2 != 5) {
                if (i2 != 29) {
                    if (i2 != 42) {
                        return i2 != 22 ? i2 != 23 ? 0 : 15 : CommonUtils.BYTES_IN_A_GIGABYTE;
                    }
                    return 16;
                }
                return 12;
            }
            return 11;
        }
        return 10;
    }

    public static int b(f.h.b.b.g2.s sVar) {
        int g2 = sVar.g(4);
        if (g2 == 15) {
            return sVar.g(24);
        }
        if (g2 < 13) {
            return a[g2];
        }
        throw new ParserException();
    }

    public static b c(f.h.b.b.g2.s sVar, boolean z) {
        int g2 = sVar.g(5);
        if (g2 == 31) {
            g2 = sVar.g(6) + 32;
        }
        int b2 = b(sVar);
        int g3 = sVar.g(4);
        String d2 = f.a.b.a.a.d(19, "mp4a.40.", g2);
        if (g2 == 5 || g2 == 29) {
            b2 = b(sVar);
            int g4 = sVar.g(5);
            if (g4 == 31) {
                g4 = sVar.g(6) + 32;
            }
            g2 = g4;
            if (g2 == 22) {
                g3 = sVar.g(4);
            }
        }
        if (z) {
            if (g2 != 1 && g2 != 2 && g2 != 3 && g2 != 4 && g2 != 6 && g2 != 7 && g2 != 17) {
                switch (g2) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw new ParserException(f.a.b.a.a.d(42, "Unsupported audio object type: ", g2));
                }
            }
            if (sVar.f()) {
                Log.w("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (sVar.f()) {
                sVar.m(14);
            }
            boolean f2 = sVar.f();
            if (g3 != 0) {
                if (g2 == 6 || g2 == 20) {
                    sVar.m(3);
                }
                if (f2) {
                    if (g2 == 22) {
                        sVar.m(16);
                    }
                    if (g2 == 17 || g2 == 19 || g2 == 20 || g2 == 23) {
                        sVar.m(3);
                    }
                    sVar.m(1);
                }
                switch (g2) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int g5 = sVar.g(2);
                        if (g5 == 2 || g5 == 3) {
                            throw new ParserException(f.a.b.a.a.d(33, "Unsupported epConfig: ", g5));
                        }
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i2 = b[g3];
        if (i2 != -1) {
            return new b(b2, i2, d2, null);
        }
        throw new ParserException();
    }

    public static b d(byte[] bArr) {
        return c(new f.h.b.b.g2.s(bArr), false);
    }
}
