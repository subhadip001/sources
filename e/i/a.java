package e.i;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.os.UserManager;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.ActionMode;
import android.widget.CompoundButton;
import android.widget.EdgeEffect;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.app.AppOpsManagerCompat;
import com.google.logging.type.LogSeverity;
import e.i.c.d.d;
import e.i.c.d.e;
import e.i.c.d.f;
import e.i.c.d.g;
import e.i.c.d.h;
import e.i.h.b;
import e.i.k.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class a {
    public static Method a;
    public static boolean b;
    public static Method c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f2421d;

    /* renamed from: e  reason: collision with root package name */
    public static Field f2422e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f2423f;

    /* renamed from: g  reason: collision with root package name */
    public static Method f2424g;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f2425h;

    /* renamed from: i  reason: collision with root package name */
    public static Field f2426i;

    /* renamed from: j  reason: collision with root package name */
    public static boolean f2427j;

    public static int A(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.getLayoutDirection();
        }
        if (!f2421d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e2);
            }
            f2421d = true;
        }
        Method method = c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e3) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e3);
                c = null;
            }
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static String B(Context context, Uri uri) {
        Cursor cursor;
        AutoCloseable autoCloseable = null;
        r7 = null;
        r7 = null;
        String str = null;
        try {
            try {
                cursor = context.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
            } catch (Exception e2) {
                e = e2;
                cursor = null;
            } catch (Throwable th) {
                th = th;
                n(autoCloseable);
                throw th;
            }
            try {
                boolean moveToFirst = cursor.moveToFirst();
                uri = cursor;
                if (moveToFirst) {
                    boolean isNull = cursor.isNull(0);
                    uri = cursor;
                    if (!isNull) {
                        str = cursor.getString(0);
                        uri = cursor;
                    }
                }
            } catch (Exception e3) {
                e = e3;
                Log.w("DocumentFile", "Failed query: " + e);
                uri = cursor;
                n(uri);
                return str;
            }
            n(uri);
            return str;
        } catch (Throwable th2) {
            th = th2;
            autoCloseable = uri;
            n(autoCloseable);
            throw th;
        }
    }

    public static d C(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i2, int i3) {
        d dVar;
        if (G(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i2, typedValue);
            int i4 = typedValue.type;
            if (i4 >= 28 && i4 <= 31) {
                return new d(null, null, typedValue.data);
            }
            try {
                dVar = d.a(typedArray.getResources(), typedArray.getResourceId(i2, 0), theme);
            } catch (Exception e2) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e2);
                dVar = null;
            }
            if (dVar != null) {
                return dVar;
            }
        }
        return new d(null, null, i3);
    }

    public static String D(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2) {
        if (G(xmlPullParser, str)) {
            return typedArray.getString(i2);
        }
        return null;
    }

    public static File E(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        StringBuilder A = f.a.b.a.a.A(".font");
        A.append(Process.myPid());
        A.append("-");
        A.append(Process.myTid());
        A.append("-");
        String sb = A.toString();
        for (int i2 = 0; i2 < 100; i2++) {
            File file = new File(cacheDir, f.a.b.a.a.i(sb, i2));
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static b.a F(TextView textView) {
        int i2;
        int i3;
        TextDirectionHeuristic textDirectionHeuristic;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            return new b.a(textView.getTextMetricsParams());
        }
        TextPaint textPaint = new TextPaint(textView.getPaint());
        if (Build.VERSION.SDK_INT >= 23) {
            i2 = 1;
            i3 = 1;
        } else {
            i2 = 0;
            i3 = 0;
        }
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        if (i4 >= 23) {
            i2 = textView.getBreakStrategy();
            i3 = textView.getHyphenationFrequency();
        }
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i4 >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            if (directionality != 1 && directionality != 2) {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            } else {
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
            }
        } else {
            boolean z = textView.getLayoutDirection() == 1;
            switch (textView.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    } else {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                        break;
                    }
            }
        }
        return new b.a(textPaint, textDirectionHeuristic, i2, i3);
    }

    public static boolean G(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static int H(int i2) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 4) {
                    if (i2 != 8) {
                        if (i2 != 16) {
                            if (i2 != 32) {
                                if (i2 != 64) {
                                    if (i2 != 128) {
                                        if (i2 == 256) {
                                            return 8;
                                        }
                                        throw new IllegalArgumentException(f.a.b.a.a.i("type needs to be >= FIRST and <= LAST, type=", i2));
                                    }
                                    return 7;
                                }
                                return 6;
                            }
                            return 5;
                        }
                        return 4;
                    }
                    return 3;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public static boolean I() {
        if (Build.VERSION.SDK_INT < 31) {
            String str = Build.VERSION.CODENAME;
            if (!(!"REL".equals(str) && str.compareTo("S") >= 0)) {
                return false;
            }
        }
        return true;
    }

    public static boolean J(Rect rect, Rect rect2, int i2) {
        if (i2 == 17) {
            int i3 = rect.right;
            int i4 = rect2.right;
            return (i3 > i4 || rect.left >= i4) && rect.left > rect2.left;
        } else if (i2 == 33) {
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            return (i5 > i6 || rect.top >= i6) && rect.top > rect2.top;
        } else if (i2 == 66) {
            int i7 = rect.left;
            int i8 = rect2.left;
            return (i7 < i8 || rect.right <= i8) && rect.right < rect2.right;
        } else if (i2 == 130) {
            int i9 = rect.top;
            int i10 = rect2.top;
            return (i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    public static boolean K(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
        return true;
    }

    public static long L(Context context, Uri uri) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        long j2 = 0;
        try {
            try {
                cursor = contentResolver.query(uri, new String[]{"_size"}, null, null, null);
                if (cursor.moveToFirst() && !cursor.isNull(0)) {
                    j2 = cursor.getLong(0);
                }
            } catch (Exception e2) {
                Log.w("DocumentFile", "Failed query: " + e2);
            }
            return j2;
        } finally {
            n(cursor);
        }
    }

    public static Handler M() {
        if (Build.VERSION.SDK_INT >= 28) {
            return e.n.a.d.a(Looper.getMainLooper());
        }
        return new Handler(Looper.getMainLooper());
    }

    public static int N(int i2, Rect rect, Rect rect2) {
        int i3;
        int i4;
        if (i2 == 17) {
            i3 = rect.left;
            i4 = rect2.right;
        } else if (i2 == 33) {
            i3 = rect.top;
            i4 = rect2.bottom;
        } else if (i2 == 66) {
            i3 = rect2.left;
            i4 = rect.right;
        } else if (i2 == 130) {
            i3 = rect2.top;
            i4 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return Math.max(0, i3 - i4);
    }

    public static int O(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static ByteBuffer P(Context context, CancellationSignal cancellationSignal, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static TypedArray Q(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static float R(EdgeEffect edgeEffect, float f2, float f3) {
        if (I()) {
            return c.c(edgeEffect, f2, f3);
        }
        edgeEffect.onPull(f2, f3);
        return f2;
    }

    public static e S(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlPullParser.require(2, null, "font-family");
            if (xmlPullParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), b.b);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(4);
                String string3 = obtainAttributes.getString(5);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int integer = obtainAttributes.getInteger(2, 1);
                int integer2 = obtainAttributes.getInteger(3, 500);
                String string4 = obtainAttributes.getString(6);
                obtainAttributes.recycle();
                if (string != null && string2 != null && string3 != null) {
                    while (xmlPullParser.next() != 3) {
                        g0(xmlPullParser);
                    }
                    return new h(new e.i.g.e(string, string2, string3, U(resources, resourceId)), integer, integer2, string4);
                }
                ArrayList arrayList = new ArrayList();
                while (xmlPullParser.next() != 3) {
                    if (xmlPullParser.getEventType() == 2) {
                        if (xmlPullParser.getName().equals("font")) {
                            TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), b.c);
                            int i2 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, LogSeverity.WARNING_VALUE);
                            boolean z = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                            int i3 = obtainAttributes2.hasValue(9) ? 9 : 3;
                            String string5 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                            int i4 = obtainAttributes2.getInt(i3, 0);
                            int i5 = obtainAttributes2.hasValue(5) ? 5 : 0;
                            int resourceId2 = obtainAttributes2.getResourceId(i5, 0);
                            String string6 = obtainAttributes2.getString(i5);
                            obtainAttributes2.recycle();
                            while (xmlPullParser.next() != 3) {
                                g0(xmlPullParser);
                            }
                            arrayList.add(new g(string6, i2, z, string5, i4, resourceId2));
                        } else {
                            g0(xmlPullParser);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    return new f((g[]) arrayList.toArray(new g[arrayList.size()]));
                }
            } else {
                g0(xmlPullParser);
            }
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static e.n.a.q.b T(ByteBuffer byteBuffer) {
        long j2;
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i2 = duplicate.getShort() & 65535;
        if (i2 <= 100) {
            duplicate.position(duplicate.position() + 6);
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    j2 = -1;
                    break;
                }
                int i4 = duplicate.getInt();
                duplicate.position(duplicate.position() + 4);
                j2 = duplicate.getInt() & 4294967295L;
                duplicate.position(duplicate.position() + 4);
                if (1835365473 == i4) {
                    break;
                }
                i3++;
            }
            if (j2 != -1) {
                duplicate.position(duplicate.position() + ((int) (j2 - duplicate.position())));
                duplicate.position(duplicate.position() + 12);
                long j3 = duplicate.getInt() & 4294967295L;
                for (int i5 = 0; i5 < j3; i5++) {
                    int i6 = duplicate.getInt();
                    long j4 = duplicate.getInt() & 4294967295L;
                    duplicate.getInt();
                    if (1164798569 == i6 || 1701669481 == i6) {
                        duplicate.position((int) (j4 + j2));
                        e.n.a.q.b bVar = new e.n.a.q.b();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        bVar.b(duplicate.position() + duplicate.getInt(duplicate.position()), duplicate);
                        return bVar;
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    public static List<List<byte[]>> U(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        arrayList.add(i0(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(i0(resources.getStringArray(i2)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void V(TextView textView, int i2) {
        int i3;
        g(i2);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i3 = fontMetricsInt.top;
        } else {
            i3 = fontMetricsInt.ascent;
        }
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void W(TextView textView, int i2) {
        int i3;
        g(i2);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i3 = fontMetricsInt.bottom;
        } else {
            i3 = fontMetricsInt.descent;
        }
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    public static boolean X(Drawable drawable, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.setLayoutDirection(i2);
        }
        if (!b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e2);
            }
            b = true;
        }
        Method method = a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i2));
                return true;
            } catch (Exception e3) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e3);
                a = null;
            }
        }
        return false;
    }

    public static void Y(TextView textView, int i2) {
        g(i2);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i2 != fontMetricsInt) {
            textView.setLineSpacing(i2 - fontMetricsInt, 1.0f);
        }
    }

    public static void Z(PopupWindow popupWindow, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            e.i.k.f.c(popupWindow, z);
            return;
        }
        if (!f2427j) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f2426i = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e2);
            }
            f2427j = true;
        }
        Field field = f2426i;
        if (field != null) {
            try {
                field.set(popupWindow, Boolean.valueOf(z));
            } catch (IllegalAccessException e3) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e3);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r10.bottom <= r12.top) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
        if (r10.right <= r12.left) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        if (r10.top >= r12.bottom) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
        if (r10.left >= r12.right) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
        r7 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = b(r9, r10, r11)
            boolean r1 = b(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L7d
            if (r0 != 0) goto Lf
            goto L7d
        Lf:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L3d
            if (r9 == r3) goto L36
            if (r9 == r4) goto L2f
            if (r9 != r1) goto L29
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L45
            goto L43
        L29:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L2f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L45
            goto L43
        L36:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L45
            goto L43
        L3d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L45
        L43:
            r7 = 1
            goto L46
        L45:
            r7 = 0
        L46:
            if (r7 != 0) goto L49
            return r6
        L49:
            if (r9 == r5) goto L7c
            if (r9 != r4) goto L4e
            goto L7c
        L4e:
            int r11 = N(r9, r10, r11)
            if (r9 == r5) goto L6f
            if (r9 == r3) goto L6a
            if (r9 == r4) goto L65
            if (r9 != r1) goto L5f
            int r9 = r12.bottom
            int r10 = r10.bottom
            goto L73
        L5f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L65:
            int r9 = r12.right
            int r10 = r10.right
            goto L73
        L6a:
            int r9 = r10.top
            int r10 = r12.top
            goto L73
        L6f:
            int r9 = r10.left
            int r10 = r12.left
        L73:
            int r9 = r9 - r10
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L7b
            r2 = 1
        L7b:
            return r2
        L7c:
            return r6
        L7d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.a.a(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static void a0(TextView textView, e.i.h.b bVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            Objects.requireNonNull(bVar);
            textView.setText((CharSequence) null);
            return;
        }
        b.a F = F(textView);
        Objects.requireNonNull(bVar);
        if (F.a(null)) {
            textView.setText(bVar);
            return;
        }
        throw new IllegalArgumentException("Given text can not be applied to TextView.");
    }

    public static boolean b(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static void b0(TextView textView, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i2);
        } else {
            textView.setTextAppearance(textView.getContext(), i2);
        }
    }

    public static void c(Object obj, StringBuilder sb) {
        int lastIndexOf;
        if (obj == null) {
            sb.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static void c0(Drawable drawable, int i2) {
        drawable.setTint(i2);
    }

    public static String d(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            sb.append(String.format("%02x", Byte.valueOf(bArr[i2])));
        }
        return sb.toString();
    }

    public static void d0(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static boolean e(e.i.d.d[] dVarArr, e.i.d.d[] dVarArr2) {
        if (dVarArr == null || dVarArr2 == null || dVarArr.length != dVarArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < dVarArr.length; i2++) {
            if (dVarArr[i2].a != dVarArr2[i2].a || dVarArr[i2].b.length != dVarArr2[i2].b.length) {
                return false;
            }
        }
        return true;
    }

    public static void e0(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    public static void f(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void f0(PopupWindow popupWindow, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            e.i.k.f.d(popupWindow, i2);
            return;
        }
        if (!f2425h) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f2424g = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f2425h = true;
        }
        Method method = f2424g;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i2));
            } catch (Exception unused2) {
            }
        }
    }

    public static int g(int i2) {
        if (i2 >= 0) {
            return i2;
        }
        throw new IllegalArgumentException();
    }

    public static void g0(XmlPullParser xmlPullParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static int h(int i2, String str) {
        if (i2 >= 0) {
            return i2;
        }
        throw new IllegalArgumentException(str);
    }

    public static boolean h0(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2] != bArr2[i2]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static <T> T i(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static List<byte[]> i0(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    public static int j(Context context, String str) {
        int noteProxyOpNoThrow;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            String permissionToOp = AppOpsManagerCompat.permissionToOp(str);
            if (permissionToOp == null) {
                return 0;
            }
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid != null && packagesForUid.length > 0) {
                    packageName = packagesForUid[0];
                }
            }
            if (Process.myUid() == myUid && Objects.equals(context.getPackageName(), packageName)) {
                noteProxyOpNoThrow = AppOpsManagerCompat.checkOrNoteProxyOp(context, myUid, permissionToOp, packageName);
            } else {
                noteProxyOpNoThrow = AppOpsManagerCompat.noteProxyOpNoThrow(context, permissionToOp, packageName);
            }
            return noteProxyOpNoThrow == 0 ? 0 : -2;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T j0(Drawable drawable) {
        return drawable instanceof e.i.d.m.b ? (T) ((e.i.d.m.b) drawable).b() : drawable;
    }

    public static void k(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static ActionMode.Callback k0(ActionMode.Callback callback) {
        return (!(callback instanceof e.i.k.g) || Build.VERSION.SDK_INT < 26) ? callback : ((e.i.k.g) callback).a;
    }

    public static int l(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    public static Drawable l0(Drawable drawable) {
        return (Build.VERSION.SDK_INT < 23 && !(drawable instanceof e.i.d.m.a)) ? new e.i.d.m.d(drawable) : drawable;
    }

    public static void m(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            m(((InsetDrawable) drawable).getDrawable());
        } else if (drawable instanceof e.i.d.m.b) {
            m(((e.i.d.m.b) drawable).b());
        } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
            int childCount = drawableContainerState.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                Drawable child = drawableContainerState.getChild(i2);
                if (child != null) {
                    m(child);
                }
            }
        }
    }

    public static ActionMode.Callback m0(TextView textView, ActionMode.Callback callback) {
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 26 || i2 > 27 || (callback instanceof e.i.k.g) || callback == null) ? callback : new e.i.k.g(callback, textView);
    }

    public static void n(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static long[] o(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                jArr[i2] = iArr[i2];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    public static float[] p(float[] fArr, int i2, int i3) {
        if (i2 <= i3) {
            int length = fArr.length;
            if (i2 >= 0 && i2 <= length) {
                int i4 = i3 - i2;
                int min = Math.min(i4, length - i2);
                float[] fArr2 = new float[i4];
                System.arraycopy(fArr, i2, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    public static boolean q(File file, Resources resources, int i2) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i2);
            try {
                boolean r = r(file, inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return r;
            } catch (Throwable th) {
                th = th;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean r(File file, InputStream inputStream) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    }
                    try {
                        fileOutputStream2.close();
                    } catch (IOException unused) {
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            e = e3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static e.n.a.m s(android.content.Context r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lc
            e.n.a.g r0 = new e.n.a.g
            r0.<init>()
            goto L11
        Lc:
            e.n.a.f r0 = new e.n.a.f
            r0.<init>()
        L11:
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            java.lang.String r2 = "Package manager required to locate emoji font provider"
            i(r1, r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.content.action.LOAD_EMOJI_FONT"
            r2.<init>(r3)
            r3 = 0
            java.util.List r2 = r0.c(r1, r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L2a:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L4c
            java.lang.Object r4 = r2.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ProviderInfo r4 = r0.a(r4)
            r6 = 1
            if (r4 == 0) goto L48
            android.content.pm.ApplicationInfo r7 = r4.applicationInfo
            if (r7 == 0) goto L48
            int r7 = r7.flags
            r7 = r7 & r6
            if (r7 != r6) goto L48
            goto L49
        L48:
            r6 = 0
        L49:
            if (r6 == 0) goto L2a
            goto L4d
        L4c:
            r4 = r5
        L4d:
            if (r4 != 0) goto L50
            goto L7e
        L50:
            java.lang.String r2 = r4.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L78
            java.lang.String r4 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L78
            android.content.pm.Signature[] r0 = r0.b(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L78
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L78
            r1.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L78
            int r6 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L78
        L5e:
            if (r3 >= r6) goto L6c
            r7 = r0[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L78
            byte[] r7 = r7.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L78
            r1.add(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L78
            int r3 = r3 + 1
            goto L5e
        L6c:
            java.util.List r0 = java.util.Collections.singletonList(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L78
            e.i.g.e r1 = new e.i.g.e     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L78
            java.lang.String r3 = "emojicompat-emoji-font"
            r1.<init>(r2, r4, r3, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L78
            goto L7f
        L78:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
        L7e:
            r1 = r5
        L7f:
            if (r1 != 0) goto L82
            goto L87
        L82:
            e.n.a.m r5 = new e.n.a.m
            r5.<init>(r8, r1)
        L87:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.a.s(android.content.Context):e.n.a.m");
    }

    public static ThreadPoolExecutor t(final String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: e.n.a.b
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, str);
                thread.setPriority(10);
                return thread;
            }
        });
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008b, code lost:
        if (r13 == false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0098 A[Catch: NumberFormatException -> 0x00ba, LOOP:3: B:29:0x006d->B:49:0x0098, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00ba, blocks: (B:26:0x005a, B:29:0x006d, B:31:0x0073, B:36:0x0081, B:49:0x0098, B:51:0x009d, B:54:0x00ad, B:56:0x00b2), top: B:71:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009d A[Catch: NumberFormatException -> 0x00ba, TryCatch #0 {NumberFormatException -> 0x00ba, blocks: (B:26:0x005a, B:29:0x006d, B:31:0x0073, B:36:0x0081, B:49:0x0098, B:51:0x009d, B:54:0x00ad, B:56:0x00b2), top: B:71:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ad A[Catch: NumberFormatException -> 0x00ba, TryCatch #0 {NumberFormatException -> 0x00ba, blocks: (B:26:0x005a, B:29:0x006d, B:31:0x0073, B:36:0x0081, B:49:0x0098, B:51:0x009d, B:54:0x00ad, B:56:0x00b2), top: B:71:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0097 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static e.i.d.d[] u(java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.a.u(java.lang.String):e.i.d.d[]");
    }

    public static Path v(String str) {
        Path path = new Path();
        e.i.d.d[] u = u(str);
        if (u != null) {
            try {
                e.i.d.d.b(u, path);
                return path;
            } catch (RuntimeException e2) {
                throw new RuntimeException(f.a.b.a.a.p("Error in parsing ", str), e2);
            }
        }
        return null;
    }

    public static e.i.d.d[] w(e.i.d.d[] dVarArr) {
        if (dVarArr == null) {
            return null;
        }
        e.i.d.d[] dVarArr2 = new e.i.d.d[dVarArr.length];
        for (int i2 = 0; i2 < dVarArr.length; i2++) {
            dVarArr2[i2] = new e.i.d.d(dVarArr[i2]);
        }
        return dVarArr2;
    }

    public static boolean x(Context context, Uri uri) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{"document_id"}, null, null, null);
            return cursor.getCount() > 0;
        } catch (Exception e2) {
            Log.w("DocumentFile", "Failed query: " + e2);
            return false;
        } finally {
            n(cursor);
        }
    }

    public static Drawable y(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        if (!f2423f) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f2422e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e2);
            }
            f2423f = true;
        }
        Field field = f2422e;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e3) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e3);
                f2422e = null;
            }
        }
        return null;
    }

    public static float z(EdgeEffect edgeEffect) {
        if (I()) {
            return c.b(edgeEffect);
        }
        return 0.0f;
    }
}
