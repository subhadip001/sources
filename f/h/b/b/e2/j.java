package f.h.b.b.e2;

import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Trace;
import android.util.Log;
import f.h.b.b.g2.b0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class j {
    public static void a(int i2, String str, int i3) {
        int glCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
            StringBuilder sb = new StringBuilder(f.a.b.a.a.x(str, f.a.b.a.a.x(glGetShaderInfoLog, 10)));
            sb.append(glGetShaderInfoLog);
            sb.append(", source: ");
            sb.append(str);
            Log.e("GlUtil", sb.toString());
        }
        GLES20.glAttachShader(i3, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        e();
    }

    public static void b(String str) {
        if (b0.a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void c(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void d(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void e() {
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                return;
            }
            String valueOf = String.valueOf(GLU.gluErrorString(glGetError));
            Log.e("GlUtil", valueOf.length() != 0 ? "glError ".concat(valueOf) : new String("glError "));
        }
    }

    public static int f(int i2, int i3, int i4) {
        if (i2 < i3 || i2 >= i4) {
            throw new IndexOutOfBoundsException();
        }
        return i2;
    }

    public static void g(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void h(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static <T> T i(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException();
    }

    public static <T> T j(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    public static int k(String str, String str2) {
        int glCreateProgram = GLES20.glCreateProgram();
        e();
        a(35633, str, glCreateProgram);
        a(35632, str2, glCreateProgram);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            String valueOf = String.valueOf(GLES20.glGetProgramInfoLog(glCreateProgram));
            Log.e("GlUtil", valueOf.length() != 0 ? "Unable to link shader program: \n".concat(valueOf) : new String("Unable to link shader program: \n"));
        }
        e();
        return glCreateProgram;
    }

    public static FloatBuffer l(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static void m() {
        if (b0.a >= 18) {
            Trace.endSection();
        }
    }

    public static String n(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if (xmlPullParser.getAttributeName(i2).equals(str)) {
                return xmlPullParser.getAttributeValue(i2);
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x019c, code lost:
        if (r0.equals("video/mp2t") == false) goto L112;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01bb A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01bd A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01bf A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c2 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c5 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c7 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c9 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01cc A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01cf A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d2 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d4 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d6 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d9 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01dc A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int o(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r17) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.e2.j.o(java.util.Map):int");
    }

    public static int p(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        return (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) ? 14 : -1;
    }

    public static boolean q(XmlPullParser xmlPullParser, String str) {
        return (xmlPullParser.getEventType() == 3) && xmlPullParser.getName().equals(str);
    }

    public static boolean r(XmlPullParser xmlPullParser, String str) {
        return (xmlPullParser.getEventType() == 2) && xmlPullParser.getName().equals(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01bc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList<f.h.b.b.h2.x.d.a> s(f.h.b.b.g2.t r27) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.e2.j.s(f.h.b.b.g2.t):java.util.ArrayList");
    }

    public static float t(int i2, float f2, int i3, int i4) {
        float f3;
        if (f2 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i2 == 0) {
            f3 = i4;
        } else if (i2 != 1) {
            if (i2 != 2) {
                return -3.4028235E38f;
            }
            return f2;
        } else {
            f3 = i3;
        }
        return f2 * f3;
    }
}
