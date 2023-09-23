package f.h.b.c;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Base64;
import android.util.Property;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewParent;
import com.google.android.gms.common.api.Api;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.play.core.internal.zzck;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.WireFormat$FieldType;
import e.b.h.z0;
import e.i.j.z;
import f.h.b.c.m.c;
import f.h.b.c.y.e;
import f.h.b.c.y.g;
import f.h.b.c.y.i;
import f.h.b.d.a.a.d;
import f.h.b.d.a.e.s;
import f.h.b.d.a.e.t;
import f.h.b.d.a.i.h;
import f.h.b.d.a.i.p;
import f.h.b.d.a.i.q;
import f.h.c.a.j;
import f.h.h.a1;
import f.h.h.c1;
import f.h.h.e0;
import f.h.h.g;
import f.h.h.g1;
import f.h.h.h1;
import f.h.h.k;
import f.h.h.l1;
import f.h.h.n;
import f.h.h.p0;
import f.h.h.u;
import f.h.h.v;
import f.h.h.w0;
import f.h.h.x;
import f.h.h.y;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class a {
    public static d a;

    public static void A(int i2, int i3, int i4) {
        String j2;
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            if (i2 >= 0 && i2 <= i4) {
                j2 = (i3 < 0 || i3 > i4) ? j(i3, i4, "end index") : E0("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
            } else {
                j2 = j(i2, i4, "start index");
            }
            throw new IndexOutOfBoundsException(j2);
        }
    }

    public static boolean A0(byte b) {
        return b > -65;
    }

    public static void B(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static boolean B0(String str) {
        int i2 = j.a;
        return str == null || str.isEmpty();
    }

    public static void C(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static boolean C0(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static void D(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(E0(str, obj));
        }
    }

    public static int D0(int i2, int i3, float f2) {
        return e.i.d.a.b(e.i.d.a.e(i3, Math.round(Color.alpha(i3) * f2)), i2);
    }

    public static int E(long j2) {
        int i2 = (int) j2;
        p(((long) i2) == j2, "Out of range: %s", j2);
        return i2;
    }

    public static String E0(String str, Object... objArr) {
        int indexOf;
        String sb;
        String valueOf = String.valueOf(str);
        int i2 = 0;
        for (int i3 = 0; i3 < objArr.length; i3++) {
            Object obj = objArr[i3];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e2) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb2 = new StringBuilder(f.a.b.a.a.x(hexString, name.length() + 1));
                    sb2.append(name);
                    sb2.append('@');
                    sb2.append(hexString);
                    String sb3 = sb2.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String valueOf2 = String.valueOf(sb3);
                    logger.log(level, valueOf2.length() != 0 ? "Exception during lenientFormat for ".concat(valueOf2) : new String("Exception during lenientFormat for "), (Throwable) e2);
                    String name2 = e2.getClass().getName();
                    StringBuilder z = f.a.b.a.a.z(name2.length() + f.a.b.a.a.x(sb3, 9), "<", sb3, " threw ", name2);
                    z.append(">");
                    sb = z.toString();
                }
            }
            objArr[i3] = sb;
        }
        StringBuilder sb4 = new StringBuilder((objArr.length * 16) + valueOf.length());
        int i4 = 0;
        while (i2 < objArr.length && (indexOf = valueOf.indexOf("%s", i4)) != -1) {
            sb4.append((CharSequence) valueOf, i4, indexOf);
            sb4.append(objArr[i2]);
            i4 = indexOf + 2;
            i2++;
        }
        sb4.append((CharSequence) valueOf, i4, valueOf.length());
        if (i2 < objArr.length) {
            sb4.append(" [");
            sb4.append(objArr[i2]);
            for (int i5 = i2 + 1; i5 < objArr.length; i5++) {
                sb4.append(", ");
                sb4.append(objArr[i5]);
            }
            sb4.append(']');
        }
        return sb4.toString();
    }

    public static int F(int i2, int i3, int i4) {
        if (i3 <= i4) {
            return Math.min(Math.max(i2, i3), i4);
        }
        throw new IllegalArgumentException(E0("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i3), Integer.valueOf(i4)));
    }

    public static float F0(float f2, float f3, float f4) {
        return (f4 * f3) + ((1.0f - f4) * f2);
    }

    public static Animator G(c cVar, float f2, float f3, float f4) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(cVar, (Property<c, V>) c.C0122c.a, (TypeEvaluator) c.b.b, (Object[]) new c.e[]{new c.e(f2, f3, f4)});
        c.e revealInfo = cVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) cVar, (int) f2, (int) f3, revealInfo.c, f4);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofObject, createCircularReveal);
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    public static int G0(int i2, int i3, int i4) {
        return (i2 & (~i4)) | (i3 & i4);
    }

    public static f.h.b.c.y.d H(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                return new i();
            }
            return new e();
        }
        return new i();
    }

    public static Typeface H0(Configuration configuration, Typeface typeface) {
        int i2;
        if (Build.VERSION.SDK_INT < 31 || (i2 = configuration.fontWeightAdjustment) == Integer.MAX_VALUE || i2 == 0) {
            return null;
        }
        return Typeface.create(typeface, e.i.a.l(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }

    public static Object I(int i2) {
        if (i2 < 2 || i2 > 1073741824 || Integer.highestOneBit(i2) != i2) {
            throw new IllegalArgumentException(f.a.b.a.a.d(52, "must be power of 2 between 2^1 and 2^30: ", i2));
        }
        if (i2 <= 256) {
            return new byte[i2];
        }
        if (i2 <= 65536) {
            return new short[i2];
        }
        return new int[i2];
    }

    public static int[] I0(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    public static int J(byte[] bArr, int i2, f.h.h.e eVar) {
        int d0 = d0(bArr, i2, eVar);
        int i3 = eVar.a;
        if (i3 >= 0) {
            if (i3 <= bArr.length - d0) {
                if (i3 == 0) {
                    eVar.c = f.h.h.j.f6366g;
                    return d0;
                }
                eVar.c = f.h.h.j.c(bArr, d0, i3);
                return d0 + i3;
            }
            throw InvalidProtocolBufferException.h();
        }
        throw InvalidProtocolBufferException.f();
    }

    public static PorterDuff.Mode J0(int i2, PorterDuff.Mode mode) {
        if (i2 != 3) {
            if (i2 != 5) {
                if (i2 != 9) {
                    switch (i2) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static int K(int i2, byte[] bArr, int i3, int i4, GeneratedMessageLite.c<?, ?> cVar, GeneratedMessageLite.e<?, ?> eVar, g1<h1, h1> g1Var, f.h.h.e eVar2) {
        Object valueOf;
        Object valueOf2;
        Object g2;
        u<GeneratedMessageLite.d> uVar = cVar.extensions;
        int i5 = i2 >>> 3;
        GeneratedMessageLite.d dVar = eVar.f1302d;
        if (dVar.f1300i && dVar.f1301j) {
            switch (dVar.f1299h.ordinal()) {
                case 0:
                    n nVar = new n();
                    int R = R(bArr, i3, nVar, eVar2);
                    uVar.p(eVar.f1302d, nVar);
                    return R;
                case 1:
                    v vVar = new v();
                    int U = U(bArr, i3, vVar, eVar2);
                    uVar.p(eVar.f1302d, vVar);
                    return U;
                case 2:
                case 3:
                    e0 e0Var = new e0();
                    int Y = Y(bArr, i3, e0Var, eVar2);
                    uVar.p(eVar.f1302d, e0Var);
                    return Y;
                case 4:
                case 12:
                    x xVar = new x();
                    int X = X(bArr, i3, xVar, eVar2);
                    uVar.p(eVar.f1302d, xVar);
                    return X;
                case 5:
                case 15:
                    e0 e0Var2 = new e0();
                    int T = T(bArr, i3, e0Var2, eVar2);
                    uVar.p(eVar.f1302d, e0Var2);
                    return T;
                case 6:
                case 14:
                    x xVar2 = new x();
                    int S = S(bArr, i3, xVar2, eVar2);
                    uVar.p(eVar.f1302d, xVar2);
                    return S;
                case 7:
                    g gVar = new g();
                    int Q = Q(bArr, i3, gVar, eVar2);
                    uVar.p(eVar.f1302d, gVar);
                    return Q;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    StringBuilder A = f.a.b.a.a.A("Type cannot be packed: ");
                    A.append(eVar.f1302d.f1299h);
                    throw new IllegalStateException(A.toString());
                case 13:
                    x xVar3 = new x();
                    int X2 = X(bArr, i3, xVar3, eVar2);
                    h1 h1Var = cVar.unknownFields;
                    h1 h1Var2 = (h1) c1.y(i5, xVar3, eVar.f1302d.f1297f, h1Var != h1.f6360f ? h1Var : null, g1Var);
                    if (h1Var2 != null) {
                        cVar.unknownFields = h1Var2;
                    }
                    uVar.p(eVar.f1302d, xVar3);
                    return X2;
                case 16:
                    x xVar4 = new x();
                    int V = V(bArr, i3, xVar4, eVar2);
                    uVar.p(eVar.f1302d, xVar4);
                    return V;
                case 17:
                    e0 e0Var3 = new e0();
                    int W = W(bArr, i3, e0Var3, eVar2);
                    uVar.p(eVar.f1302d, e0Var3);
                    return W;
            }
        }
        WireFormat$FieldType wireFormat$FieldType = dVar.f1299h;
        if (wireFormat$FieldType == WireFormat$FieldType.ENUM) {
            i3 = d0(bArr, i3, eVar2);
            if (eVar.f1302d.f1297f.findValueByNumber(eVar2.a) == null) {
                h1 h1Var3 = cVar.unknownFields;
                h1 h1Var4 = h1Var3;
                if (h1Var3 == h1.f6360f) {
                    h1 e2 = h1.e();
                    cVar.unknownFields = e2;
                    h1Var4 = e2;
                }
                int i6 = eVar2.a;
                Class<?> cls = c1.a;
                h1 h1Var5 = h1Var4;
                if (h1Var4 == null) {
                    h1Var5 = g1Var.m();
                }
                g1Var.e(h1Var5, i5, i6);
                return i3;
            }
            r3 = Integer.valueOf(eVar2.a);
        } else {
            switch (wireFormat$FieldType.ordinal()) {
                case 0:
                    valueOf = Double.valueOf(Double.longBitsToDouble(M(bArr, i3)));
                    r3 = valueOf;
                    i3 += 8;
                    break;
                case 1:
                    valueOf2 = Float.valueOf(Float.intBitsToFloat(L(bArr, i3)));
                    r3 = valueOf2;
                    i3 += 4;
                    break;
                case 2:
                case 3:
                    i3 = f0(bArr, i3, eVar2);
                    r3 = Long.valueOf(eVar2.b);
                    break;
                case 4:
                case 12:
                    i3 = d0(bArr, i3, eVar2);
                    r3 = Integer.valueOf(eVar2.a);
                    break;
                case 5:
                case 15:
                    valueOf = Long.valueOf(M(bArr, i3));
                    r3 = valueOf;
                    i3 += 8;
                    break;
                case 6:
                case 14:
                    valueOf2 = Integer.valueOf(L(bArr, i3));
                    r3 = valueOf2;
                    i3 += 4;
                    break;
                case 7:
                    i3 = f0(bArr, i3, eVar2);
                    r3 = Boolean.valueOf(eVar2.b != 0);
                    break;
                case 8:
                    i3 = Z(bArr, i3, eVar2);
                    r3 = eVar2.c;
                    break;
                case 9:
                    i3 = N(w0.c.a(eVar.c.getClass()), bArr, i3, i4, (i5 << 3) | 4, eVar2);
                    r3 = eVar2.c;
                    break;
                case 10:
                    i3 = O(w0.c.a(eVar.c.getClass()), bArr, i3, i4, eVar2);
                    r3 = eVar2.c;
                    break;
                case 11:
                    i3 = J(bArr, i3, eVar2);
                    r3 = eVar2.c;
                    break;
                case 13:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 16:
                    i3 = d0(bArr, i3, eVar2);
                    r3 = Integer.valueOf(k.b(eVar2.a));
                    break;
                case 17:
                    i3 = f0(bArr, i3, eVar2);
                    r3 = Long.valueOf(k.c(eVar2.b));
                    break;
            }
        }
        GeneratedMessageLite.d dVar2 = eVar.f1302d;
        if (dVar2.f1300i) {
            uVar.a(dVar2, r3);
        } else {
            int ordinal = dVar2.f1299h.ordinal();
            if ((ordinal == 9 || ordinal == 10) && (g2 = uVar.g(eVar.f1302d)) != null) {
                r3 = y.c(g2, r3);
            }
            uVar.p(eVar.f1302d, r3);
        }
        return i3;
    }

    public static void K0(AnimatorSet animatorSet, List<Animator> list) {
        int size = list.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = list.get(i2);
            j2 = Math.max(j2, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j2);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }

    public static int L(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public static final void L0(StringBuilder sb, int i2, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                L0(sb, i2, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                L0(sb, i2, str, entry);
            }
        } else {
            sb.append('\n');
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(j0(f.h.h.j.d((String) obj)));
                sb.append('\"');
            } else if (obj instanceof f.h.h.j) {
                sb.append(": \"");
                sb.append(j0((f.h.h.j) obj));
                sb.append('\"');
            } else if (obj instanceof GeneratedMessageLite) {
                sb.append(" {");
                M0((GeneratedMessageLite) obj, sb, i2 + 2);
                sb.append("\n");
                while (i3 < i2) {
                    sb.append(' ');
                    i3++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i5 = i2 + 2;
                L0(sb, i5, "key", entry2.getKey());
                L0(sb, i5, "value", entry2.getValue());
                sb.append("\n");
                while (i3 < i2) {
                    sb.append(' ');
                    i3++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    public static long M(byte[] bArr, int i2) {
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x01cd, code lost:
        if (((java.lang.Integer) r4).intValue() == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01df, code lost:
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r4).floatValue()) == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f5, code lost:
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r4).doubleValue()) == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0229, code lost:
        r6 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void M0(f.h.h.n0 r13, java.lang.StringBuilder r14, int r15) {
        /*
            Method dump skipped, instructions count: 667
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.c.a.M0(f.h.h.n0, java.lang.StringBuilder, int):void");
    }

    public static int N(a1 a1Var, byte[] bArr, int i2, int i3, int i4, f.h.h.e eVar) {
        p0 p0Var = (p0) a1Var;
        Object i5 = p0Var.i();
        int L = p0Var.L(i5, bArr, i2, i3, i4, eVar);
        p0Var.c(i5);
        eVar.c = i5;
        return L;
    }

    public static void N0(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(I0(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
        Drawable mutate = e.i.a.l0(drawable).mutate();
        mutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    public static int O(a1 a1Var, byte[] bArr, int i2, int i3, f.h.h.e eVar) {
        int i4 = i2 + 1;
        int i5 = bArr[i2];
        if (i5 < 0) {
            i4 = c0(i5, bArr, i4, eVar);
            i5 = eVar.a;
        }
        int i6 = i4;
        if (i5 >= 0 && i5 <= i3 - i6) {
            Object i7 = a1Var.i();
            int i8 = i5 + i6;
            a1Var.f(i7, bArr, i6, i8, eVar);
            a1Var.c(i7);
            eVar.c = i7;
            return i8;
        }
        throw InvalidProtocolBufferException.h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r5 != (-1)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
        a1(r12, r1, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
        r13[r5] = G0(r13[r5], r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int O0(java.lang.Object r9, java.lang.Object r10, int r11, java.lang.Object r12, int[] r13, java.lang.Object[] r14, java.lang.Object[] r15) {
        /*
            int r0 = Y0(r9)
            r1 = r0 & r11
            int r2 = Z0(r12, r1)
            r3 = -1
            if (r2 != 0) goto Le
            return r3
        Le:
            int r4 = ~r11
            r0 = r0 & r4
            r5 = -1
        L11:
            int r2 = r2 + r3
            r6 = r13[r2]
            r7 = r6 & r4
            if (r7 != r0) goto L3b
            r7 = r14[r2]
            boolean r7 = i0(r9, r7)
            if (r7 == 0) goto L3b
            if (r15 == 0) goto L2a
            r7 = r15[r2]
            boolean r7 = i0(r10, r7)
            if (r7 == 0) goto L3b
        L2a:
            r9 = r6 & r11
            if (r5 != r3) goto L32
            a1(r12, r1, r9)
            goto L3a
        L32:
            r10 = r13[r5]
            int r9 = G0(r10, r9, r11)
            r13[r5] = r9
        L3a:
            return r2
        L3b:
            r5 = r6 & r11
            if (r5 != 0) goto L40
            return r3
        L40:
            r8 = r5
            r5 = r2
            r2 = r8
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.c.a.O0(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    public static int P(a1<?> a1Var, int i2, byte[] bArr, int i3, int i4, y.i<?> iVar, f.h.h.e eVar) {
        int O = O(a1Var, bArr, i3, i4, eVar);
        iVar.add(eVar.c);
        while (O < i4) {
            int d0 = d0(bArr, O, eVar);
            if (i2 != eVar.a) {
                break;
            }
            O = O(a1Var, bArr, d0, i4, eVar);
            iVar.add(eVar.c);
        }
        return O;
    }

    public static TypedValue P0(Context context, int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static int Q(byte[] bArr, int i2, y.i<?> iVar, f.h.h.e eVar) {
        g gVar = (g) iVar;
        int d0 = d0(bArr, i2, eVar);
        int i3 = eVar.a + d0;
        while (d0 < i3) {
            d0 = f0(bArr, d0, eVar);
            gVar.b(eVar.b != 0);
        }
        if (d0 == i3) {
            return d0;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static boolean Q0(Context context, int i2, boolean z) {
        TypedValue P0 = P0(context, i2);
        return (P0 == null || P0.type != 18) ? z : P0.data != 0;
    }

    public static int R(byte[] bArr, int i2, y.i<?> iVar, f.h.h.e eVar) {
        n nVar = (n) iVar;
        int d0 = d0(bArr, i2, eVar);
        int i3 = eVar.a + d0;
        while (d0 < i3) {
            nVar.b(Double.longBitsToDouble(M(bArr, d0)));
            d0 += 8;
        }
        if (d0 == i3) {
            return d0;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int R0(Context context, int i2, String str) {
        TypedValue P0 = P0(context, i2);
        if (P0 != null) {
            return P0.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i2)));
    }

    public static int S(byte[] bArr, int i2, y.i<?> iVar, f.h.h.e eVar) {
        x xVar = (x) iVar;
        int d0 = d0(bArr, i2, eVar);
        int i3 = eVar.a + d0;
        while (d0 < i3) {
            xVar.b(L(bArr, d0));
            d0 += 4;
        }
        if (d0 == i3) {
            return d0;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int S0(long j2) {
        if (j2 > 2147483647L) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        if (j2 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j2;
    }

    public static int T(byte[] bArr, int i2, y.i<?> iVar, f.h.h.e eVar) {
        e0 e0Var = (e0) iVar;
        int d0 = d0(bArr, i2, eVar);
        int i3 = eVar.a + d0;
        while (d0 < i3) {
            e0Var.b(M(bArr, d0));
            d0 += 8;
        }
        if (d0 == i3) {
            return d0;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static void T0(View view, float f2) {
        Drawable background = view.getBackground();
        if (background instanceof f.h.b.c.y.g) {
            f.h.b.c.y.g gVar = (f.h.b.c.y.g) background;
            g.b bVar = gVar.f5480f;
            if (bVar.o != f2) {
                bVar.o = f2;
                gVar.z();
            }
        }
    }

    public static int U(byte[] bArr, int i2, y.i<?> iVar, f.h.h.e eVar) {
        v vVar = (v) iVar;
        int d0 = d0(bArr, i2, eVar);
        int i3 = eVar.a + d0;
        while (d0 < i3) {
            vVar.b(Float.intBitsToFloat(L(bArr, d0)));
            d0 += 4;
        }
        if (d0 == i3) {
            return d0;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static void U0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        AtomicInteger atomicInteger = z.a;
        boolean a2 = z.c.a(checkableImageButton);
        boolean z = false;
        boolean z2 = onLongClickListener != null;
        z = (a2 || z2) ? true : true;
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(a2);
        checkableImageButton.setPressable(a2);
        checkableImageButton.setLongClickable(z2);
        z.d.s(checkableImageButton, z ? 1 : 2);
    }

    public static int V(byte[] bArr, int i2, y.i<?> iVar, f.h.h.e eVar) {
        x xVar = (x) iVar;
        int d0 = d0(bArr, i2, eVar);
        int i3 = eVar.a + d0;
        while (d0 < i3) {
            d0 = d0(bArr, d0, eVar);
            xVar.b(k.b(eVar.a));
        }
        if (d0 == i3) {
            return d0;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static void V0(View view, f.h.b.c.y.g gVar) {
        f.h.b.c.p.a aVar = gVar.f5480f.b;
        if (aVar != null && aVar.a) {
            float f2 = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                AtomicInteger atomicInteger = z.a;
                f2 += z.i.i((View) parent);
            }
            g.b bVar = gVar.f5480f;
            if (bVar.n != f2) {
                bVar.n = f2;
                gVar.z();
            }
        }
    }

    public static int W(byte[] bArr, int i2, y.i<?> iVar, f.h.h.e eVar) {
        e0 e0Var = (e0) iVar;
        int d0 = d0(bArr, i2, eVar);
        int i3 = eVar.a + d0;
        while (d0 < i3) {
            d0 = f0(bArr, d0, eVar);
            e0Var.b(k.c(eVar.b));
        }
        if (d0 == i3) {
            return d0;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int W0(int i2, byte[] bArr, int i3, int i4, f.h.h.e eVar) {
        if ((i2 >>> 3) != 0) {
            int i5 = i2 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            if (i5 == 5) {
                                return i3 + 4;
                            }
                            throw InvalidProtocolBufferException.b();
                        }
                        int i6 = (i2 & (-8)) | 4;
                        int i7 = 0;
                        while (i3 < i4) {
                            i3 = d0(bArr, i3, eVar);
                            i7 = eVar.a;
                            if (i7 == i6) {
                                break;
                            }
                            i3 = W0(i7, bArr, i3, i4, eVar);
                        }
                        if (i3 > i4 || i7 != i6) {
                            throw InvalidProtocolBufferException.g();
                        }
                        return i3;
                    }
                    return d0(bArr, i3, eVar) + eVar.a;
                }
                return i3 + 8;
            }
            return f0(bArr, i3, eVar);
        }
        throw InvalidProtocolBufferException.b();
    }

    public static int X(byte[] bArr, int i2, y.i<?> iVar, f.h.h.e eVar) {
        x xVar = (x) iVar;
        int d0 = d0(bArr, i2, eVar);
        int i3 = eVar.a + d0;
        while (d0 < i3) {
            d0 = d0(bArr, d0, eVar);
            xVar.b(eVar.a);
        }
        if (d0 == i3) {
            return d0;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int X0(int i2) {
        return (int) (Integer.rotateLeft((int) (i2 * (-862048943)), 15) * 461845907);
    }

    public static int Y(byte[] bArr, int i2, y.i<?> iVar, f.h.h.e eVar) {
        e0 e0Var = (e0) iVar;
        int d0 = d0(bArr, i2, eVar);
        int i3 = eVar.a + d0;
        while (d0 < i3) {
            d0 = f0(bArr, d0, eVar);
            e0Var.b(eVar.b);
        }
        if (d0 == i3) {
            return d0;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int Y0(Object obj) {
        return X0(obj == null ? 0 : obj.hashCode());
    }

    public static int Z(byte[] bArr, int i2, f.h.h.e eVar) {
        int d0 = d0(bArr, i2, eVar);
        int i3 = eVar.a;
        if (i3 >= 0) {
            if (i3 == 0) {
                eVar.c = "";
                return d0;
            }
            eVar.c = new String(bArr, d0, i3, y.a);
            return d0 + i3;
        }
        throw InvalidProtocolBufferException.f();
    }

    public static int Z0(Object obj, int i2) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i2] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i2] & 65535;
        }
        return ((int[]) obj)[i2];
    }

    public static void a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i2) {
        if (!A0(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !A0(b3) && !A0(b4)) {
                int i3 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i2] = (char) ((i3 >>> 10) + 55232);
                cArr[i2 + 1] = (char) ((i3 & 1023) + 56320);
                return;
            }
        }
        throw InvalidProtocolBufferException.c();
    }

    public static int a0(byte[] bArr, int i2, f.h.h.e eVar) {
        int d0 = d0(bArr, i2, eVar);
        int i3 = eVar.a;
        if (i3 >= 0) {
            if (i3 == 0) {
                eVar.c = "";
                return d0;
            }
            eVar.c = l1.b(bArr, d0, i3);
            return d0 + i3;
        }
        throw InvalidProtocolBufferException.f();
    }

    public static void a1(Object obj, int i2, int i3) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i2] = (byte) i3;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i2] = (short) i3;
        } else {
            ((int[]) obj)[i2] = i3;
        }
    }

    public static boolean b(byte b) {
        return b >= 0;
    }

    public static int b0(int i2, byte[] bArr, int i3, int i4, h1 h1Var, f.h.h.e eVar) {
        if ((i2 >>> 3) != 0) {
            int i5 = i2 & 7;
            if (i5 == 0) {
                int f0 = f0(bArr, i3, eVar);
                h1Var.f(i2, Long.valueOf(eVar.b));
                return f0;
            } else if (i5 == 1) {
                h1Var.f(i2, Long.valueOf(M(bArr, i3)));
                return i3 + 8;
            } else if (i5 == 2) {
                int d0 = d0(bArr, i3, eVar);
                int i6 = eVar.a;
                if (i6 >= 0) {
                    if (i6 <= bArr.length - d0) {
                        if (i6 == 0) {
                            h1Var.f(i2, f.h.h.j.f6366g);
                        } else {
                            h1Var.f(i2, f.h.h.j.c(bArr, d0, i6));
                        }
                        return d0 + i6;
                    }
                    throw InvalidProtocolBufferException.h();
                }
                throw InvalidProtocolBufferException.f();
            } else if (i5 != 3) {
                if (i5 == 5) {
                    h1Var.f(i2, Integer.valueOf(L(bArr, i3)));
                    return i3 + 4;
                }
                throw InvalidProtocolBufferException.b();
            } else {
                h1 e2 = h1.e();
                int i7 = (i2 & (-8)) | 4;
                int i8 = 0;
                while (true) {
                    if (i3 >= i4) {
                        break;
                    }
                    int d02 = d0(bArr, i3, eVar);
                    int i9 = eVar.a;
                    if (i9 == i7) {
                        i8 = i9;
                        i3 = d02;
                        break;
                    }
                    i8 = i9;
                    i3 = b0(i9, bArr, d02, i4, e2, eVar);
                }
                if (i3 <= i4 && i8 == i7) {
                    h1Var.f(i2, e2);
                    return i3;
                }
                throw InvalidProtocolBufferException.g();
            }
        }
        throw InvalidProtocolBufferException.b();
    }

    public static String b1(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            if (C0(str.charAt(i2))) {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c = charArray[i2];
                    if (C0(c)) {
                        charArray[i2] = (char) (c ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static boolean c(byte b) {
        return b < -32;
    }

    public static int c0(int i2, byte[] bArr, int i3, f.h.h.e eVar) {
        int i4 = i2 & 127;
        int i5 = i3 + 1;
        byte b = bArr[i3];
        if (b >= 0) {
            eVar.a = i4 | (b << 7);
            return i5;
        }
        int i6 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i7 = i5 + 1;
        byte b2 = bArr[i5];
        if (b2 >= 0) {
            eVar.a = i6 | (b2 << 14);
            return i7;
        }
        int i8 = i6 | ((b2 & Byte.MAX_VALUE) << 14);
        int i9 = i7 + 1;
        byte b3 = bArr[i7];
        if (b3 >= 0) {
            eVar.a = i8 | (b3 << 21);
            return i9;
        }
        int i10 = i8 | ((b3 & Byte.MAX_VALUE) << 21);
        int i11 = i9 + 1;
        byte b4 = bArr[i9];
        if (b4 >= 0) {
            eVar.a = i10 | (b4 << 28);
            return i11;
        }
        int i12 = i10 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                eVar.a = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    public static f.h.c.a.i c1(Object obj) {
        return new f.h.c.a.i(obj.getClass().getSimpleName(), null);
    }

    public static void d(byte b, byte b2, char[] cArr, int i2) {
        if (b >= -62 && !A0(b2)) {
            cArr[i2] = (char) (((b & 31) << 6) | (b2 & 63));
            return;
        }
        throw InvalidProtocolBufferException.c();
    }

    public static int d0(byte[] bArr, int i2, f.h.h.e eVar) {
        int i3 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            eVar.a = b;
            return i3;
        }
        return c0(b, bArr, i3, eVar);
    }

    public static String d1(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            if (z0(str.charAt(i2))) {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c = charArray[i2];
                    if (z0(c)) {
                        charArray[i2] = (char) (c ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static boolean e(byte b) {
        return b < -16;
    }

    public static int e0(int i2, byte[] bArr, int i3, int i4, y.i<?> iVar, f.h.h.e eVar) {
        x xVar = (x) iVar;
        int d0 = d0(bArr, i3, eVar);
        xVar.b(eVar.a);
        while (d0 < i4) {
            int d02 = d0(bArr, d0, eVar);
            if (i2 != eVar.a) {
                break;
            }
            d0 = d0(bArr, d02, eVar);
            xVar.b(eVar.a);
        }
        return d0;
    }

    public static PorterDuffColorFilter e1(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }

    public static void f(byte b, byte b2, byte b3, char[] cArr, int i2) {
        if (!A0(b2) && ((b != -32 || b2 >= -96) && ((b != -19 || b2 < -96) && !A0(b3)))) {
            cArr[i2] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
            return;
        }
        throw InvalidProtocolBufferException.c();
    }

    public static int f0(byte[] bArr, int i2, f.h.h.e eVar) {
        byte b;
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        if (j2 >= 0) {
            eVar.b = j2;
            return i3;
        }
        int i4 = i3 + 1;
        byte b2 = bArr[i3];
        long j3 = (j2 & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i5 = 7;
        while (b2 < 0) {
            int i6 = i4 + 1;
            i5 += 7;
            j3 |= (b & Byte.MAX_VALUE) << i5;
            b2 = bArr[i4];
            i4 = i6;
        }
        eVar.b = j3;
        return i4;
    }

    public static int f1(byte[] bArr, int i2) {
        return ((bArr[i2 + 1] & 255) << 8) | (bArr[i2] & 255);
    }

    public static <T> boolean g(Collection<T> collection, Iterator<? extends T> it) {
        Objects.requireNonNull(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    public static float g0(float f2, float f3, float f4, float f5) {
        return (float) Math.hypot(f4 - f2, f5 - f3);
    }

    public static long g1(s sVar, InputStream inputStream, OutputStream outputStream, long j2) {
        byte[] bArr = new byte[16384];
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream, 4096));
        int readInt = dataInputStream.readInt();
        if (readInt != -771763713) {
            String valueOf = String.valueOf(String.format("%x", Integer.valueOf(readInt)));
            throw new zzck(valueOf.length() != 0 ? "Unexpected magic=".concat(valueOf) : new String("Unexpected magic="));
        }
        int read = dataInputStream.read();
        if (read != 4) {
            throw new zzck(f.a.b.a.a.d(30, "Unexpected version=", read));
        }
        long j3 = 0;
        while (true) {
            long j4 = j2 - j3;
            try {
                int read2 = dataInputStream.read();
                if (read2 == -1) {
                    throw new IOException("Patch file overrun");
                }
                if (read2 == 0) {
                    return j3;
                }
                switch (read2) {
                    case 247:
                        read2 = dataInputStream.readUnsignedShort();
                        s1(bArr, dataInputStream, outputStream, read2, j4);
                        break;
                    case 248:
                        read2 = dataInputStream.readInt();
                        s1(bArr, dataInputStream, outputStream, read2, j4);
                        break;
                    case 249:
                        long readUnsignedShort = dataInputStream.readUnsignedShort();
                        read2 = dataInputStream.read();
                        if (read2 != -1) {
                            o1(bArr, sVar, outputStream, readUnsignedShort, read2, j4);
                            break;
                        } else {
                            throw new IOException("Unexpected end of patch");
                        }
                    case 250:
                        read2 = dataInputStream.readUnsignedShort();
                        o1(bArr, sVar, outputStream, dataInputStream.readUnsignedShort(), read2, j4);
                        break;
                    case 251:
                        read2 = dataInputStream.readInt();
                        o1(bArr, sVar, outputStream, dataInputStream.readUnsignedShort(), read2, j4);
                        break;
                    case 252:
                        long readInt2 = dataInputStream.readInt();
                        read2 = dataInputStream.read();
                        if (read2 != -1) {
                            o1(bArr, sVar, outputStream, readInt2, read2, j4);
                            break;
                        } else {
                            throw new IOException("Unexpected end of patch");
                        }
                    case 253:
                        read2 = dataInputStream.readUnsignedShort();
                        o1(bArr, sVar, outputStream, dataInputStream.readInt(), read2, j4);
                        break;
                    case 254:
                        read2 = dataInputStream.readInt();
                        o1(bArr, sVar, outputStream, dataInputStream.readInt(), read2, j4);
                        break;
                    case 255:
                        long readLong = dataInputStream.readLong();
                        read2 = dataInputStream.readInt();
                        o1(bArr, sVar, outputStream, readLong, read2, j4);
                        break;
                    default:
                        s1(bArr, dataInputStream, outputStream, read2, j4);
                        break;
                }
                j3 += read2;
            } finally {
                outputStream.flush();
            }
        }
    }

    public static void h(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = e.i.a.l0(drawable).mutate();
            if (colorStateList != null && colorStateList.isStateful()) {
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(I0(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            } else {
                drawable.setTintList(colorStateList);
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static float h0(Context context, int i2) {
        return TypedValue.applyDimension(1, i2, context.getResources().getDisplayMetrics());
    }

    public static p h1(Exception exc) {
        p pVar = new p();
        pVar.e(exc);
        return pVar;
    }

    public static <ResultT> ResultT i(p<ResultT> pVar) {
        boolean z;
        Objects.requireNonNull(pVar, "Task must not be null");
        synchronized (pVar.a) {
            z = pVar.c;
        }
        if (z) {
            return (ResultT) r1(pVar);
        }
        q qVar = new q();
        Executor executor = f.h.b.d.a.i.d.b;
        pVar.b(executor, qVar);
        pVar.b.a(new h(executor, qVar));
        pVar.g();
        qVar.a.await();
        return (ResultT) r1(pVar);
    }

    public static boolean i0(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static String i1(File file) {
        if (file.getName().endsWith(".apk")) {
            String replaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", "");
            if (replaceFirst.equals("base-master") || replaceFirst.equals("base-main")) {
                return "";
            }
            if (replaceFirst.startsWith("base-")) {
                return replaceFirst.replace("base-", "config.");
            }
            return replaceFirst.replace("-", ".config.").replace(".config.master", "").replace(".config.main", "");
        }
        throw new IllegalArgumentException("Non-apk found in splits directory.");
    }

    public static String j(int i2, int i3, String str) {
        if (i2 < 0) {
            return E0("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return E0("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IllegalArgumentException(f.a.b.a.a.d(26, "negative size: ", i3));
    }

    public static String j0(f.h.h.j jVar) {
        StringBuilder sb = new StringBuilder(jVar.size());
        for (int i2 = 0; i2 < jVar.size(); i2++) {
            byte a2 = jVar.a(i2);
            if (a2 == 34) {
                sb.append("\\\"");
            } else if (a2 == 39) {
                sb.append("\\'");
            } else if (a2 != 92) {
                switch (a2) {
                    case 7:
                        sb.append("\\a");
                        continue;
                    case 8:
                        sb.append("\\b");
                        continue;
                    case 9:
                        sb.append("\\t");
                        continue;
                    case 10:
                        sb.append("\\n");
                        continue;
                    case 11:
                        sb.append("\\v");
                        continue;
                    case 12:
                        sb.append("\\f");
                        continue;
                    case 13:
                        sb.append("\\r");
                        continue;
                    default:
                        if (a2 >= 32 && a2 <= 126) {
                            sb.append((char) a2);
                            continue;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((a2 >>> 6) & 3) + 48));
                            sb.append((char) (((a2 >>> 3) & 7) + 48));
                            sb.append((char) ((a2 & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static String j1(String str, String str2) {
        return f.a.b.a.a.v(new StringBuilder(str.length() + 1 + String.valueOf(str2).length()), str, ":", str2);
    }

    public static final String k(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    public static <T> T k0(T t, T t2) {
        if (t != null) {
            return t;
        }
        Objects.requireNonNull(t2, "Both parameters are null");
        return t2;
    }

    public static String k1(List list) {
        int read;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        byte[] bArr = new byte[8192];
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FileInputStream fileInputStream = new FileInputStream((File) it.next());
            do {
                try {
                    read = fileInputStream.read(bArr);
                    if (read > 0) {
                        messageDigest.update(bArr, 0, read);
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } while (read != -1);
            fileInputStream.close();
        }
        return Base64.encodeToString(messageDigest.digest(), 11);
    }

    public static void l(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static int l0(Context context, int i2, int i3) {
        TypedValue P0 = P0(context, i2);
        return P0 != null ? P0.data : i3;
    }

    public static void l1(PackageManager packageManager, ComponentName componentName, int i2) {
        ComponentInfo componentInfo;
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
        if (componentEnabledSetting != 1) {
            if (componentEnabledSetting != 2) {
                String packageName = componentName.getPackageName();
                String className = componentName.getClassName();
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 516);
                    ComponentInfo[][] componentInfoArr = {packageInfo.activities, packageInfo.services, packageInfo.providers};
                    int i3 = 0;
                    loop0: while (true) {
                        if (i3 >= 3) {
                            componentInfo = null;
                            break;
                        }
                        ComponentInfo[] componentInfoArr2 = componentInfoArr[i3];
                        if (componentInfoArr2 != null) {
                            int length = componentInfoArr2.length;
                            for (int i4 = 0; i4 < length; i4++) {
                                componentInfo = componentInfoArr2[i4];
                                if (componentInfo.name.equals(className)) {
                                    break loop0;
                                }
                            }
                            continue;
                        }
                        i3++;
                    }
                    if (componentInfo != null) {
                        if (componentInfo.isEnabled()) {
                            return;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        }
    }

    public static void m(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int m0(View view, int i2) {
        return R0(view.getContext(), i2, view.getClass().getCanonicalName());
    }

    public static String m1(String str, String str2, String str3) {
        int length = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(str.length() + 2 + length + String.valueOf(str3).length());
        f.a.b.a.a.R(sb, str, ":", str2, ":");
        sb.append(str3);
        return sb.toString();
    }

    public static void n(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(E0(str, Character.valueOf(c)));
        }
    }

    public static ColorStateList n0(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        ColorStateList colorStateList;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateList = e.i.c.a.getColorStateList(context, resourceId)) == null) ? typedArray.getColorStateList(i2) : colorStateList;
    }

    public static void n1(Object obj, Class cls) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }

    public static void o(boolean z, String str, int i2) {
        if (!z) {
            throw new IllegalArgumentException(E0(str, Integer.valueOf(i2)));
        }
    }

    public static ColorStateList o0(Context context, z0 z0Var, int i2) {
        int resourceId;
        ColorStateList colorStateList;
        return (!z0Var.b.hasValue(i2) || (resourceId = z0Var.b.getResourceId(i2, 0)) == 0 || (colorStateList = e.i.c.a.getColorStateList(context, resourceId)) == null) ? z0Var.c(i2) : colorStateList;
    }

    public static void o1(byte[] bArr, s sVar, OutputStream outputStream, long j2, int i2, long j3) {
        InputStream f2;
        int i3 = i2;
        if (i3 < 0) {
            throw new IOException("copyLength negative");
        }
        if (j2 < 0) {
            throw new IOException("inputOffset negative");
        }
        long j4 = i3;
        if (j4 <= j3) {
            try {
                t tVar = new t(sVar, j2, j4);
                synchronized (tVar) {
                    f2 = tVar.f(0L, tVar.a());
                }
                while (i3 > 0) {
                    int min = Math.min(i3, 16384);
                    int i4 = 0;
                    while (i4 < min) {
                        int read = f2.read(bArr, i4, min - i4);
                        if (read == -1) {
                            throw new IOException("truncated input stream");
                        }
                        i4 += read;
                    }
                    outputStream.write(bArr, 0, min);
                    i3 -= min;
                }
                f2.close();
                return;
            } catch (EOFException e2) {
                throw new IOException("patch underrun", e2);
            }
        }
        throw new IOException("Output length overrun");
    }

    public static void p(boolean z, String str, long j2) {
        if (!z) {
            throw new IllegalArgumentException(E0(str, Long.valueOf(j2)));
        }
    }

    public static float p0(String[] strArr, int i2) {
        float parseFloat = Float.parseFloat(strArr[i2]);
        if (parseFloat < 0.0f || parseFloat > 1.0f) {
            throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
        }
        return parseFloat;
    }

    public static boolean p1(int i2) {
        return i2 == 2 || i2 == 7 || i2 == 3;
    }

    public static void q(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(E0(str, obj));
        }
    }

    public static Drawable q0(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        Drawable b;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (b = e.b.a.b(context, resourceId)) == null) ? typedArray.getDrawable(i2) : b;
    }

    public static long q1(byte[] bArr, int i2) {
        return ((f1(bArr, i2 + 2) << 16) | f1(bArr, i2)) & 4294967295L;
    }

    public static void r(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(E0(str, obj, obj2));
        }
    }

    public static <T> T r0(Iterable<T> iterable) {
        T next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return (T) list.get(list.size() - 1);
            }
            throw new NoSuchElementException();
        }
        Iterator<T> it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object r1(p pVar) {
        Exception exc;
        if (pVar.d()) {
            return pVar.c();
        }
        synchronized (pVar.a) {
            exc = pVar.f5831e;
        }
        throw new ExecutionException(exc);
    }

    public static void s(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static DateFormat s0(int i2, int i3) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (i2 == 0) {
            str = "EEEE, MMMM d, yyyy";
        } else if (i2 == 1) {
            str = "MMMM d, yyyy";
        } else if (i2 == 2) {
            str = "MMM d, yyyy";
        } else if (i2 != 3) {
            throw new IllegalArgumentException(f.a.b.a.a.i("Unknown DateFormat style: ", i2));
        } else {
            str = "M/d/yy";
        }
        sb.append(str);
        sb.append(" ");
        if (i3 == 0 || i3 == 1) {
            str2 = "h:mm:ss a z";
        } else if (i3 == 2) {
            str2 = "h:mm:ss a";
        } else if (i3 != 3) {
            throw new IllegalArgumentException(f.a.b.a.a.i("Unknown DateFormat style: ", i3));
        } else {
            str2 = "h:mm a";
        }
        sb.append(str2);
        return new SimpleDateFormat(sb.toString(), Locale.US);
    }

    public static void s1(byte[] bArr, DataInputStream dataInputStream, OutputStream outputStream, int i2, long j2) {
        if (i2 < 0) {
            throw new IOException("copyLength negative");
        }
        if (i2 > j2) {
            throw new IOException("Output length overrun");
        }
        while (i2 > 0) {
            try {
                int min = Math.min(i2, 16384);
                dataInputStream.readFully(bArr, 0, min);
                outputStream.write(bArr, 0, min);
                i2 -= min;
            } catch (EOFException unused) {
                throw new IOException("patch underrun");
            }
        }
    }

    public static int t(int i2, int i3) {
        String E0;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                E0 = E0("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else if (i3 < 0) {
                throw new IllegalArgumentException(f.a.b.a.a.d(26, "negative size: ", i3));
            } else {
                E0 = E0("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(E0);
        }
        return i2;
    }

    public static int t0(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static boolean t1(int i2, int i3) {
        if (i2 == 5) {
            if (i3 != 5) {
                return true;
            }
            i2 = 5;
        }
        if (i2 == 6) {
            if (i3 != 6 && i3 != 5) {
                return true;
            }
            i2 = 6;
        }
        if (i2 != 4 || i3 == 4) {
            if (i2 == 3 && (i3 == 2 || i3 == 7 || i3 == 1 || i3 == 8)) {
                return true;
            }
            if (i2 == 2) {
                return i3 == 1 || i3 == 8;
            }
            return false;
        }
        return true;
    }

    public static Object u(Object obj, int i2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(f.a.b.a.a.d(20, "at index ", i2));
    }

    public static boolean u0(int i2) {
        if (i2 != 0) {
            ThreadLocal<double[]> threadLocal = e.i.d.a.a;
            double[] dArr = threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i2);
            int green = Color.green(i2);
            int blue = Color.blue(i2);
            if (dArr.length == 3) {
                double d2 = red / 255.0d;
                double pow = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
                double d3 = green / 255.0d;
                double pow2 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
                double[] dArr2 = dArr;
                double d4 = blue / 255.0d;
                double pow3 = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
                dArr2[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
                dArr2[1] = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
                dArr2[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
                if (dArr2[1] / 100.0d > 0.5d) {
                    return true;
                }
            } else {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
        }
        return false;
    }

    public static boolean u1(int i2) {
        return i2 == 5 || i2 == 6 || i2 == 4;
    }

    public static void v(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            String valueOf = String.valueOf(obj);
            throw new NullPointerException(f.a.b.a.a.g(valueOf.length() + 26, "null value in entry: ", valueOf, "=null"));
        }
        String valueOf2 = String.valueOf(obj2);
        StringBuilder sb = new StringBuilder(valueOf2.length() + 24);
        sb.append("null key in entry: null=");
        sb.append(valueOf2);
        throw new NullPointerException(sb.toString());
    }

    public static boolean v0(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("(");
        return str.startsWith(sb.toString()) && str.endsWith(")");
    }

    public static int w(int i2, String str) {
        if (i2 >= 0) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(str.length() + 40);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static boolean w0(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static <T> T x(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static boolean x0(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }

    public static <T> T y(T t, String str, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(E0(str, obj));
    }

    public static boolean y0(View view) {
        AtomicInteger atomicInteger = z.a;
        return z.e.d(view) == 1;
    }

    public static int z(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(j(i2, i3, "index"));
        }
        return i2;
    }

    public static boolean z0(char c) {
        return c >= 'a' && c <= 'z';
    }
}
