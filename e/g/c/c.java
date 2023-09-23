package e.g.c;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.arthenica.ffmpegkit.Chapter;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import e.g.c.d;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ConstraintSet.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f2127d = {0, 4, 8};

    /* renamed from: e  reason: collision with root package name */
    public static SparseIntArray f2128e = new SparseIntArray();

    /* renamed from: f  reason: collision with root package name */
    public static SparseIntArray f2129f = new SparseIntArray();
    public HashMap<String, ConstraintAttribute> a = new HashMap<>();
    public boolean b = true;
    public HashMap<Integer, a> c = new HashMap<>();

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class a {
        public int a;
        public final d b = new d();
        public final C0037c c = new C0037c();

        /* renamed from: d  reason: collision with root package name */
        public final b f2130d = new b();

        /* renamed from: e  reason: collision with root package name */
        public final e f2131e = new e();

        /* renamed from: f  reason: collision with root package name */
        public HashMap<String, ConstraintAttribute> f2132f = new HashMap<>();

        /* renamed from: g  reason: collision with root package name */
        public C0036a f2133g;

        /* compiled from: ConstraintSet.java */
        /* renamed from: e.g.c.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0036a {
            public int[] a = new int[10];
            public int[] b = new int[10];
            public int c = 0;

            /* renamed from: d  reason: collision with root package name */
            public int[] f2134d = new int[10];

            /* renamed from: e  reason: collision with root package name */
            public float[] f2135e = new float[10];

            /* renamed from: f  reason: collision with root package name */
            public int f2136f = 0;

            /* renamed from: g  reason: collision with root package name */
            public int[] f2137g = new int[5];

            /* renamed from: h  reason: collision with root package name */
            public String[] f2138h = new String[5];

            /* renamed from: i  reason: collision with root package name */
            public int f2139i = 0;

            /* renamed from: j  reason: collision with root package name */
            public int[] f2140j = new int[4];

            /* renamed from: k  reason: collision with root package name */
            public boolean[] f2141k = new boolean[4];

            /* renamed from: l  reason: collision with root package name */
            public int f2142l = 0;

            public void a(int i2, float f2) {
                int i3 = this.f2136f;
                int[] iArr = this.f2134d;
                if (i3 >= iArr.length) {
                    this.f2134d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f2135e;
                    this.f2135e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f2134d;
                int i4 = this.f2136f;
                iArr2[i4] = i2;
                float[] fArr2 = this.f2135e;
                this.f2136f = i4 + 1;
                fArr2[i4] = f2;
            }

            public void b(int i2, int i3) {
                int i4 = this.c;
                int[] iArr = this.a;
                if (i4 >= iArr.length) {
                    this.a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.b;
                    this.b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.a;
                int i5 = this.c;
                iArr3[i5] = i2;
                int[] iArr4 = this.b;
                this.c = i5 + 1;
                iArr4[i5] = i3;
            }

            public void c(int i2, String str) {
                int i3 = this.f2139i;
                int[] iArr = this.f2137g;
                if (i3 >= iArr.length) {
                    this.f2137g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f2138h;
                    this.f2138h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f2137g;
                int i4 = this.f2139i;
                iArr2[i4] = i2;
                String[] strArr2 = this.f2138h;
                this.f2139i = i4 + 1;
                strArr2[i4] = str;
            }

            public void d(int i2, boolean z) {
                int i3 = this.f2142l;
                int[] iArr = this.f2140j;
                if (i3 >= iArr.length) {
                    this.f2140j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f2141k;
                    this.f2141k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f2140j;
                int i4 = this.f2142l;
                iArr2[i4] = i2;
                boolean[] zArr2 = this.f2141k;
                this.f2142l = i4 + 1;
                zArr2[i4] = z;
            }
        }

        public void a(ConstraintLayout.a aVar) {
            b bVar = this.f2130d;
            aVar.f291e = bVar.f2148i;
            aVar.f292f = bVar.f2149j;
            aVar.f293g = bVar.f2150k;
            aVar.f294h = bVar.f2151l;
            aVar.f295i = bVar.f2152m;
            aVar.f296j = bVar.n;
            aVar.f297k = bVar.o;
            aVar.f298l = bVar.p;
            aVar.f299m = bVar.q;
            aVar.n = bVar.r;
            aVar.o = bVar.s;
            aVar.s = bVar.t;
            aVar.t = bVar.u;
            aVar.u = bVar.v;
            aVar.v = bVar.w;
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = bVar.G;
            ((ViewGroup.MarginLayoutParams) aVar).rightMargin = bVar.H;
            ((ViewGroup.MarginLayoutParams) aVar).topMargin = bVar.I;
            ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = bVar.J;
            aVar.A = bVar.S;
            aVar.B = bVar.R;
            aVar.x = bVar.O;
            aVar.z = bVar.Q;
            aVar.E = bVar.x;
            aVar.F = bVar.y;
            b bVar2 = this.f2130d;
            aVar.p = bVar2.A;
            aVar.q = bVar2.B;
            aVar.r = bVar2.C;
            aVar.G = bVar2.z;
            aVar.T = bVar2.D;
            aVar.U = bVar2.E;
            aVar.I = bVar2.U;
            aVar.H = bVar2.V;
            aVar.K = bVar2.X;
            aVar.J = bVar2.W;
            aVar.W = bVar2.m0;
            aVar.X = bVar2.n0;
            aVar.L = bVar2.Y;
            aVar.M = bVar2.Z;
            aVar.P = bVar2.a0;
            aVar.Q = bVar2.b0;
            aVar.N = bVar2.c0;
            aVar.O = bVar2.d0;
            aVar.R = bVar2.e0;
            aVar.S = bVar2.f0;
            aVar.V = bVar2.F;
            aVar.c = bVar2.f2146g;
            aVar.a = bVar2.f2144e;
            aVar.b = bVar2.f2145f;
            ((ViewGroup.MarginLayoutParams) aVar).width = bVar2.c;
            b bVar3 = this.f2130d;
            ((ViewGroup.MarginLayoutParams) aVar).height = bVar3.f2143d;
            String str = bVar3.l0;
            if (str != null) {
                aVar.Y = str;
            }
            aVar.Z = bVar3.p0;
            aVar.setMarginStart(bVar3.L);
            aVar.setMarginEnd(this.f2130d.K);
            aVar.a();
        }

        public final void b(int i2, ConstraintLayout.a aVar) {
            this.a = i2;
            b bVar = this.f2130d;
            bVar.f2148i = aVar.f291e;
            bVar.f2149j = aVar.f292f;
            bVar.f2150k = aVar.f293g;
            bVar.f2151l = aVar.f294h;
            bVar.f2152m = aVar.f295i;
            bVar.n = aVar.f296j;
            bVar.o = aVar.f297k;
            bVar.p = aVar.f298l;
            bVar.q = aVar.f299m;
            bVar.r = aVar.n;
            bVar.s = aVar.o;
            bVar.t = aVar.s;
            bVar.u = aVar.t;
            bVar.v = aVar.u;
            bVar.w = aVar.v;
            bVar.x = aVar.E;
            bVar.y = aVar.F;
            bVar.z = aVar.G;
            bVar.A = aVar.p;
            bVar.B = aVar.q;
            bVar.C = aVar.r;
            bVar.D = aVar.T;
            bVar.E = aVar.U;
            bVar.F = aVar.V;
            bVar.f2146g = aVar.c;
            b bVar2 = this.f2130d;
            bVar2.f2144e = aVar.a;
            bVar2.f2145f = aVar.b;
            bVar2.c = ((ViewGroup.MarginLayoutParams) aVar).width;
            bVar2.f2143d = ((ViewGroup.MarginLayoutParams) aVar).height;
            bVar2.G = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
            bVar2.H = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
            bVar2.I = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
            bVar2.J = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
            bVar2.M = aVar.D;
            bVar2.U = aVar.I;
            bVar2.V = aVar.H;
            bVar2.X = aVar.K;
            bVar2.W = aVar.J;
            bVar2.m0 = aVar.W;
            bVar2.n0 = aVar.X;
            bVar2.Y = aVar.L;
            bVar2.Z = aVar.M;
            bVar2.a0 = aVar.P;
            bVar2.b0 = aVar.Q;
            bVar2.c0 = aVar.N;
            bVar2.d0 = aVar.O;
            bVar2.e0 = aVar.R;
            bVar2.f0 = aVar.S;
            bVar2.l0 = aVar.Y;
            bVar2.O = aVar.x;
            b bVar3 = this.f2130d;
            bVar3.Q = aVar.z;
            bVar3.N = aVar.w;
            bVar3.P = aVar.y;
            bVar3.S = aVar.A;
            bVar3.R = aVar.B;
            bVar3.T = aVar.C;
            bVar3.p0 = aVar.Z;
            bVar3.K = aVar.getMarginEnd();
            this.f2130d.L = aVar.getMarginStart();
        }

        public final void c(int i2, d.a aVar) {
            b(i2, aVar);
            this.b.f2163d = aVar.r0;
            e eVar = this.f2131e;
            eVar.b = aVar.u0;
            eVar.c = aVar.v0;
            eVar.f2165d = aVar.w0;
            eVar.f2166e = aVar.x0;
            eVar.f2167f = aVar.y0;
            eVar.f2168g = aVar.z0;
            eVar.f2169h = aVar.A0;
            eVar.f2171j = aVar.B0;
            eVar.f2172k = aVar.C0;
            eVar.f2173l = aVar.D0;
            eVar.n = aVar.t0;
            eVar.f2174m = aVar.s0;
        }

        public Object clone() {
            a aVar = new a();
            b bVar = aVar.f2130d;
            b bVar2 = this.f2130d;
            Objects.requireNonNull(bVar);
            bVar.a = bVar2.a;
            bVar.c = bVar2.c;
            bVar.b = bVar2.b;
            bVar.f2143d = bVar2.f2143d;
            bVar.f2144e = bVar2.f2144e;
            bVar.f2145f = bVar2.f2145f;
            bVar.f2146g = bVar2.f2146g;
            bVar.f2147h = bVar2.f2147h;
            bVar.f2148i = bVar2.f2148i;
            bVar.f2149j = bVar2.f2149j;
            bVar.f2150k = bVar2.f2150k;
            bVar.f2151l = bVar2.f2151l;
            bVar.f2152m = bVar2.f2152m;
            bVar.n = bVar2.n;
            bVar.o = bVar2.o;
            bVar.p = bVar2.p;
            bVar.q = bVar2.q;
            bVar.r = bVar2.r;
            bVar.s = bVar2.s;
            bVar.t = bVar2.t;
            bVar.u = bVar2.u;
            bVar.v = bVar2.v;
            bVar.w = bVar2.w;
            bVar.x = bVar2.x;
            bVar.y = bVar2.y;
            bVar.z = bVar2.z;
            bVar.A = bVar2.A;
            bVar.B = bVar2.B;
            bVar.C = bVar2.C;
            bVar.D = bVar2.D;
            bVar.E = bVar2.E;
            bVar.F = bVar2.F;
            bVar.G = bVar2.G;
            bVar.H = bVar2.H;
            bVar.I = bVar2.I;
            bVar.J = bVar2.J;
            bVar.K = bVar2.K;
            bVar.L = bVar2.L;
            bVar.M = bVar2.M;
            bVar.N = bVar2.N;
            bVar.O = bVar2.O;
            bVar.P = bVar2.P;
            bVar.Q = bVar2.Q;
            bVar.R = bVar2.R;
            bVar.S = bVar2.S;
            bVar.T = bVar2.T;
            bVar.U = bVar2.U;
            bVar.V = bVar2.V;
            bVar.W = bVar2.W;
            bVar.X = bVar2.X;
            bVar.Y = bVar2.Y;
            bVar.Z = bVar2.Z;
            bVar.a0 = bVar2.a0;
            bVar.b0 = bVar2.b0;
            bVar.c0 = bVar2.c0;
            bVar.d0 = bVar2.d0;
            bVar.e0 = bVar2.e0;
            bVar.f0 = bVar2.f0;
            bVar.g0 = bVar2.g0;
            bVar.h0 = bVar2.h0;
            bVar.i0 = bVar2.i0;
            bVar.l0 = bVar2.l0;
            int[] iArr = bVar2.j0;
            if (iArr != null && bVar2.k0 == null) {
                bVar.j0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                bVar.j0 = null;
            }
            bVar.k0 = bVar2.k0;
            bVar.m0 = bVar2.m0;
            bVar.n0 = bVar2.n0;
            bVar.o0 = bVar2.o0;
            bVar.p0 = bVar2.p0;
            C0037c c0037c = aVar.c;
            C0037c c0037c2 = this.c;
            Objects.requireNonNull(c0037c);
            c0037c.a = c0037c2.a;
            c0037c.b = c0037c2.b;
            c0037c.f2153d = c0037c2.f2153d;
            c0037c.f2154e = c0037c2.f2154e;
            c0037c.f2155f = c0037c2.f2155f;
            c0037c.f2158i = c0037c2.f2158i;
            c0037c.f2156g = c0037c2.f2156g;
            c0037c.f2157h = c0037c2.f2157h;
            d dVar = aVar.b;
            d dVar2 = this.b;
            Objects.requireNonNull(dVar);
            dVar.a = dVar2.a;
            dVar.b = dVar2.b;
            dVar.f2163d = dVar2.f2163d;
            dVar.f2164e = dVar2.f2164e;
            dVar.c = dVar2.c;
            e eVar = aVar.f2131e;
            e eVar2 = this.f2131e;
            Objects.requireNonNull(eVar);
            eVar.a = eVar2.a;
            eVar.b = eVar2.b;
            eVar.c = eVar2.c;
            eVar.f2165d = eVar2.f2165d;
            eVar.f2166e = eVar2.f2166e;
            eVar.f2167f = eVar2.f2167f;
            eVar.f2168g = eVar2.f2168g;
            eVar.f2169h = eVar2.f2169h;
            eVar.f2170i = eVar2.f2170i;
            eVar.f2171j = eVar2.f2171j;
            eVar.f2172k = eVar2.f2172k;
            eVar.f2173l = eVar2.f2173l;
            eVar.f2174m = eVar2.f2174m;
            eVar.n = eVar2.n;
            aVar.a = this.a;
            aVar.f2133g = this.f2133g;
            return aVar;
        }
    }

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class b {
        public static SparseIntArray q0;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f2143d;
        public int[] j0;
        public String k0;
        public String l0;
        public boolean a = false;
        public boolean b = false;

        /* renamed from: e  reason: collision with root package name */
        public int f2144e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f2145f = -1;

        /* renamed from: g  reason: collision with root package name */
        public float f2146g = -1.0f;

        /* renamed from: h  reason: collision with root package name */
        public boolean f2147h = true;

        /* renamed from: i  reason: collision with root package name */
        public int f2148i = -1;

        /* renamed from: j  reason: collision with root package name */
        public int f2149j = -1;

        /* renamed from: k  reason: collision with root package name */
        public int f2150k = -1;

        /* renamed from: l  reason: collision with root package name */
        public int f2151l = -1;

        /* renamed from: m  reason: collision with root package name */
        public int f2152m = -1;
        public int n = -1;
        public int o = -1;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public int u = -1;
        public int v = -1;
        public int w = -1;
        public float x = 0.5f;
        public float y = 0.5f;
        public String z = null;
        public int A = -1;
        public int B = 0;
        public float C = 0.0f;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = Integer.MIN_VALUE;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public int T = Integer.MIN_VALUE;
        public float U = -1.0f;
        public float V = -1.0f;
        public int W = 0;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;
        public int a0 = 0;
        public int b0 = 0;
        public int c0 = 0;
        public int d0 = 0;
        public float e0 = 1.0f;
        public float f0 = 1.0f;
        public int g0 = -1;
        public int h0 = 0;
        public int i0 = -1;
        public boolean m0 = false;
        public boolean n0 = false;
        public boolean o0 = true;
        public int p0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            q0 = sparseIntArray;
            sparseIntArray.append(43, 24);
            q0.append(44, 25);
            q0.append(46, 28);
            q0.append(47, 29);
            q0.append(52, 35);
            q0.append(51, 34);
            q0.append(24, 4);
            q0.append(23, 3);
            q0.append(19, 1);
            q0.append(61, 6);
            q0.append(62, 7);
            q0.append(31, 17);
            q0.append(32, 18);
            q0.append(33, 19);
            q0.append(15, 90);
            q0.append(0, 26);
            q0.append(48, 31);
            q0.append(49, 32);
            q0.append(30, 10);
            q0.append(29, 9);
            q0.append(66, 13);
            q0.append(69, 16);
            q0.append(67, 14);
            q0.append(64, 11);
            q0.append(68, 15);
            q0.append(65, 12);
            q0.append(55, 38);
            q0.append(41, 37);
            q0.append(40, 39);
            q0.append(54, 40);
            q0.append(39, 20);
            q0.append(53, 36);
            q0.append(28, 5);
            q0.append(42, 91);
            q0.append(50, 91);
            q0.append(45, 91);
            q0.append(22, 91);
            q0.append(18, 91);
            q0.append(3, 23);
            q0.append(5, 27);
            q0.append(7, 30);
            q0.append(8, 8);
            q0.append(4, 33);
            q0.append(6, 2);
            q0.append(1, 22);
            q0.append(2, 21);
            q0.append(56, 41);
            q0.append(34, 42);
            q0.append(17, 41);
            q0.append(16, 42);
            q0.append(71, 76);
            q0.append(25, 61);
            q0.append(27, 62);
            q0.append(26, 63);
            q0.append(60, 69);
            q0.append(38, 70);
            q0.append(12, 71);
            q0.append(10, 72);
            q0.append(11, 73);
            q0.append(13, 74);
            q0.append(9, 75);
        }

        public void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.f2181f);
            this.b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = q0.get(index);
                switch (i3) {
                    case 1:
                        int i4 = this.q;
                        int[] iArr = c.f2127d;
                        int resourceId = obtainStyledAttributes.getResourceId(index, i4);
                        if (resourceId == -1) {
                            resourceId = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.q = resourceId;
                        break;
                    case 2:
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 3:
                        int i5 = this.p;
                        int[] iArr2 = c.f2127d;
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, i5);
                        if (resourceId2 == -1) {
                            resourceId2 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.p = resourceId2;
                        break;
                    case 4:
                        int i6 = this.o;
                        int[] iArr3 = c.f2127d;
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, i6);
                        if (resourceId3 == -1) {
                            resourceId3 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.o = resourceId3;
                        break;
                    case 5:
                        this.z = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.D = obtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                        break;
                    case 7:
                        this.E = obtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 8:
                        this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 9:
                        int i7 = this.w;
                        int[] iArr4 = c.f2127d;
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, i7);
                        if (resourceId4 == -1) {
                            resourceId4 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.w = resourceId4;
                        break;
                    case 10:
                        int i8 = this.v;
                        int[] iArr5 = c.f2127d;
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, i8);
                        if (resourceId5 == -1) {
                            resourceId5 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.v = resourceId5;
                        break;
                    case 11:
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 12:
                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 13:
                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    case 14:
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 15:
                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 16:
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 17:
                        this.f2144e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2144e);
                        break;
                    case 18:
                        this.f2145f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2145f);
                        break;
                    case 19:
                        this.f2146g = obtainStyledAttributes.getFloat(index, this.f2146g);
                        break;
                    case 20:
                        this.x = obtainStyledAttributes.getFloat(index, this.x);
                        break;
                    case 21:
                        this.f2143d = obtainStyledAttributes.getLayoutDimension(index, this.f2143d);
                        break;
                    case 22:
                        this.c = obtainStyledAttributes.getLayoutDimension(index, this.c);
                        break;
                    case 23:
                        this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                        break;
                    case 24:
                        int i9 = this.f2148i;
                        int[] iArr6 = c.f2127d;
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, i9);
                        if (resourceId6 == -1) {
                            resourceId6 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f2148i = resourceId6;
                        break;
                    case 25:
                        int i10 = this.f2149j;
                        int[] iArr7 = c.f2127d;
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, i10);
                        if (resourceId7 == -1) {
                            resourceId7 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f2149j = resourceId7;
                        break;
                    case 26:
                        this.F = obtainStyledAttributes.getInt(index, this.F);
                        break;
                    case 27:
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 28:
                        int i11 = this.f2150k;
                        int[] iArr8 = c.f2127d;
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, i11);
                        if (resourceId8 == -1) {
                            resourceId8 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f2150k = resourceId8;
                        break;
                    case 29:
                        int i12 = this.f2151l;
                        int[] iArr9 = c.f2127d;
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, i12);
                        if (resourceId9 == -1) {
                            resourceId9 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f2151l = resourceId9;
                        break;
                    case 30:
                        this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 31:
                        int i13 = this.t;
                        int[] iArr10 = c.f2127d;
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, i13);
                        if (resourceId10 == -1) {
                            resourceId10 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.t = resourceId10;
                        break;
                    case 32:
                        int i14 = this.u;
                        int[] iArr11 = c.f2127d;
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, i14);
                        if (resourceId11 == -1) {
                            resourceId11 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.u = resourceId11;
                        break;
                    case 33:
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 34:
                        int i15 = this.n;
                        int[] iArr12 = c.f2127d;
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, i15);
                        if (resourceId12 == -1) {
                            resourceId12 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.n = resourceId12;
                        break;
                    case 35:
                        int i16 = this.f2152m;
                        int[] iArr13 = c.f2127d;
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, i16);
                        if (resourceId13 == -1) {
                            resourceId13 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f2152m = resourceId13;
                        break;
                    case 36:
                        this.y = obtainStyledAttributes.getFloat(index, this.y);
                        break;
                    case 37:
                        this.V = obtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 38:
                        this.U = obtainStyledAttributes.getFloat(index, this.U);
                        break;
                    case 39:
                        this.W = obtainStyledAttributes.getInt(index, this.W);
                        break;
                    case 40:
                        this.X = obtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 41:
                        c.g(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        c.g(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i3) {
                            case 61:
                                int i17 = this.A;
                                int[] iArr14 = c.f2127d;
                                int resourceId14 = obtainStyledAttributes.getResourceId(index, i17);
                                if (resourceId14 == -1) {
                                    resourceId14 = obtainStyledAttributes.getInt(index, -1);
                                }
                                this.A = resourceId14;
                                continue;
                            case 62:
                                this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                                continue;
                            case 63:
                                this.C = obtainStyledAttributes.getFloat(index, this.C);
                                continue;
                            default:
                                switch (i3) {
                                    case 69:
                                        this.e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                        continue;
                                    case 70:
                                        this.f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        continue;
                                    case 72:
                                        this.g0 = obtainStyledAttributes.getInt(index, this.g0);
                                        continue;
                                    case 73:
                                        this.h0 = obtainStyledAttributes.getDimensionPixelSize(index, this.h0);
                                        continue;
                                    case 74:
                                        this.k0 = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 75:
                                        this.o0 = obtainStyledAttributes.getBoolean(index, this.o0);
                                        continue;
                                    case 76:
                                        this.p0 = obtainStyledAttributes.getInt(index, this.p0);
                                        continue;
                                    case 77:
                                        int i18 = this.r;
                                        int[] iArr15 = c.f2127d;
                                        int resourceId15 = obtainStyledAttributes.getResourceId(index, i18);
                                        if (resourceId15 == -1) {
                                            resourceId15 = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        this.r = resourceId15;
                                        continue;
                                    case 78:
                                        int i19 = this.s;
                                        int[] iArr16 = c.f2127d;
                                        int resourceId16 = obtainStyledAttributes.getResourceId(index, i19);
                                        if (resourceId16 == -1) {
                                            resourceId16 = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        this.s = resourceId16;
                                        continue;
                                    case 79:
                                        this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                                        continue;
                                    case 80:
                                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                                        continue;
                                    case 81:
                                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                                        continue;
                                    case 82:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        continue;
                                    case 83:
                                        this.b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                        continue;
                                    case 84:
                                        this.a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.a0);
                                        continue;
                                    case 85:
                                        this.d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.d0);
                                        continue;
                                    case 86:
                                        this.c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                        continue;
                                    case 87:
                                        this.m0 = obtainStyledAttributes.getBoolean(index, this.m0);
                                        continue;
                                    case 88:
                                        this.n0 = obtainStyledAttributes.getBoolean(index, this.n0);
                                        continue;
                                    case 89:
                                        this.l0 = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 90:
                                        this.f2147h = obtainStyledAttributes.getBoolean(index, this.f2147h);
                                        continue;
                                    case 91:
                                        StringBuilder A = f.a.b.a.a.A("unused attribute 0x");
                                        A.append(Integer.toHexString(index));
                                        A.append("   ");
                                        A.append(q0.get(index));
                                        Log.w("ConstraintSet", A.toString());
                                        continue;
                                    default:
                                        StringBuilder A2 = f.a.b.a.a.A("Unknown attribute 0x");
                                        A2.append(Integer.toHexString(index));
                                        A2.append("   ");
                                        A2.append(q0.get(index));
                                        Log.w("ConstraintSet", A2.toString());
                                        continue;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* renamed from: e.g.c.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0037c {
        public static SparseIntArray o;
        public boolean a = false;
        public int b = -1;
        public int c = 0;

        /* renamed from: d  reason: collision with root package name */
        public String f2153d = null;

        /* renamed from: e  reason: collision with root package name */
        public int f2154e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f2155f = 0;

        /* renamed from: g  reason: collision with root package name */
        public float f2156g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public int f2157h = -1;

        /* renamed from: i  reason: collision with root package name */
        public float f2158i = Float.NaN;

        /* renamed from: j  reason: collision with root package name */
        public float f2159j = Float.NaN;

        /* renamed from: k  reason: collision with root package name */
        public int f2160k = -1;

        /* renamed from: l  reason: collision with root package name */
        public String f2161l = null;

        /* renamed from: m  reason: collision with root package name */
        public int f2162m = -3;
        public int n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            o = sparseIntArray;
            sparseIntArray.append(3, 1);
            o.append(5, 2);
            o.append(9, 3);
            o.append(2, 4);
            o.append(1, 5);
            o.append(0, 6);
            o.append(4, 7);
            o.append(8, 8);
            o.append(7, 9);
            o.append(6, 10);
        }

        public void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.f2182g);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                switch (o.get(index)) {
                    case 1:
                        this.f2158i = obtainStyledAttributes.getFloat(index, this.f2158i);
                        break;
                    case 2:
                        this.f2154e = obtainStyledAttributes.getInt(index, this.f2154e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.f2153d = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f2153d = e.g.a.g.a.a.c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f2155f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        int i3 = this.b;
                        int[] iArr = c.f2127d;
                        int resourceId = obtainStyledAttributes.getResourceId(index, i3);
                        if (resourceId == -1) {
                            resourceId = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.b = resourceId;
                        break;
                    case 6:
                        this.c = obtainStyledAttributes.getInteger(index, this.c);
                        break;
                    case 7:
                        this.f2156g = obtainStyledAttributes.getFloat(index, this.f2156g);
                        break;
                    case 8:
                        this.f2160k = obtainStyledAttributes.getInteger(index, this.f2160k);
                        break;
                    case 9:
                        this.f2159j = obtainStyledAttributes.getFloat(index, this.f2159j);
                        break;
                    case 10:
                        int i4 = obtainStyledAttributes.peekValue(index).type;
                        if (i4 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            this.n = resourceId2;
                            if (resourceId2 != -1) {
                                this.f2162m = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i4 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            this.f2161l = string;
                            if (string.indexOf("/") > 0) {
                                this.n = obtainStyledAttributes.getResourceId(index, -1);
                                this.f2162m = -2;
                                break;
                            } else {
                                this.f2162m = -1;
                                break;
                            }
                        } else {
                            this.f2162m = obtainStyledAttributes.getInteger(index, this.n);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class d {
        public boolean a = false;
        public int b = 0;
        public int c = 0;

        /* renamed from: d  reason: collision with root package name */
        public float f2163d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f2164e = Float.NaN;

        public void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.f2184i);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 1) {
                    this.f2163d = obtainStyledAttributes.getFloat(index, this.f2163d);
                } else if (index == 0) {
                    int i3 = obtainStyledAttributes.getInt(index, this.b);
                    this.b = i3;
                    int[] iArr = c.f2127d;
                    this.b = c.f2127d[i3];
                } else if (index == 4) {
                    this.c = obtainStyledAttributes.getInt(index, this.c);
                } else if (index == 3) {
                    this.f2164e = obtainStyledAttributes.getFloat(index, this.f2164e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class e {
        public static SparseIntArray o;
        public boolean a = false;
        public float b = 0.0f;
        public float c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f2165d = 0.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f2166e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f2167f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f2168g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public float f2169h = Float.NaN;

        /* renamed from: i  reason: collision with root package name */
        public int f2170i = -1;

        /* renamed from: j  reason: collision with root package name */
        public float f2171j = 0.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f2172k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f2173l = 0.0f;

        /* renamed from: m  reason: collision with root package name */
        public boolean f2174m = false;
        public float n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            o = sparseIntArray;
            sparseIntArray.append(6, 1);
            o.append(7, 2);
            o.append(8, 3);
            o.append(4, 4);
            o.append(5, 5);
            o.append(0, 6);
            o.append(1, 7);
            o.append(2, 8);
            o.append(3, 9);
            o.append(9, 10);
            o.append(10, 11);
            o.append(11, 12);
        }

        public void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.f2186k);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                switch (o.get(index)) {
                    case 1:
                        this.b = obtainStyledAttributes.getFloat(index, this.b);
                        break;
                    case 2:
                        this.c = obtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 3:
                        this.f2165d = obtainStyledAttributes.getFloat(index, this.f2165d);
                        break;
                    case 4:
                        this.f2166e = obtainStyledAttributes.getFloat(index, this.f2166e);
                        break;
                    case 5:
                        this.f2167f = obtainStyledAttributes.getFloat(index, this.f2167f);
                        break;
                    case 6:
                        this.f2168g = obtainStyledAttributes.getDimension(index, this.f2168g);
                        break;
                    case 7:
                        this.f2169h = obtainStyledAttributes.getDimension(index, this.f2169h);
                        break;
                    case 8:
                        this.f2171j = obtainStyledAttributes.getDimension(index, this.f2171j);
                        break;
                    case 9:
                        this.f2172k = obtainStyledAttributes.getDimension(index, this.f2172k);
                        break;
                    case 10:
                        this.f2173l = obtainStyledAttributes.getDimension(index, this.f2173l);
                        break;
                    case 11:
                        this.f2174m = true;
                        this.n = obtainStyledAttributes.getDimension(index, this.n);
                        break;
                    case 12:
                        int i3 = this.f2170i;
                        int[] iArr = c.f2127d;
                        int resourceId = obtainStyledAttributes.getResourceId(index, i3);
                        if (resourceId == -1) {
                            resourceId = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f2170i = resourceId;
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        f2128e.append(82, 25);
        f2128e.append(83, 26);
        f2128e.append(85, 29);
        f2128e.append(86, 30);
        f2128e.append(92, 36);
        f2128e.append(91, 35);
        f2128e.append(63, 4);
        f2128e.append(62, 3);
        f2128e.append(58, 1);
        f2128e.append(60, 91);
        f2128e.append(59, 92);
        f2128e.append(101, 6);
        f2128e.append(102, 7);
        f2128e.append(70, 17);
        f2128e.append(71, 18);
        f2128e.append(72, 19);
        f2128e.append(54, 99);
        f2128e.append(0, 27);
        f2128e.append(87, 32);
        f2128e.append(88, 33);
        f2128e.append(69, 10);
        f2128e.append(68, 9);
        f2128e.append(106, 13);
        f2128e.append(109, 16);
        f2128e.append(107, 14);
        f2128e.append(104, 11);
        f2128e.append(108, 15);
        f2128e.append(105, 12);
        f2128e.append(95, 40);
        f2128e.append(80, 39);
        f2128e.append(79, 41);
        f2128e.append(94, 42);
        f2128e.append(78, 20);
        f2128e.append(93, 37);
        f2128e.append(67, 5);
        f2128e.append(81, 87);
        f2128e.append(90, 87);
        f2128e.append(84, 87);
        f2128e.append(61, 87);
        f2128e.append(57, 87);
        f2128e.append(5, 24);
        f2128e.append(7, 28);
        f2128e.append(23, 31);
        f2128e.append(24, 8);
        f2128e.append(6, 34);
        f2128e.append(8, 2);
        f2128e.append(3, 23);
        f2128e.append(4, 21);
        f2128e.append(96, 95);
        f2128e.append(73, 96);
        f2128e.append(2, 22);
        f2128e.append(13, 43);
        f2128e.append(26, 44);
        f2128e.append(21, 45);
        f2128e.append(22, 46);
        f2128e.append(20, 60);
        f2128e.append(18, 47);
        f2128e.append(19, 48);
        f2128e.append(14, 49);
        f2128e.append(15, 50);
        f2128e.append(16, 51);
        f2128e.append(17, 52);
        f2128e.append(25, 53);
        f2128e.append(97, 54);
        f2128e.append(74, 55);
        f2128e.append(98, 56);
        f2128e.append(75, 57);
        f2128e.append(99, 58);
        f2128e.append(76, 59);
        f2128e.append(64, 61);
        f2128e.append(66, 62);
        f2128e.append(65, 63);
        f2128e.append(28, 64);
        f2128e.append(121, 65);
        f2128e.append(35, 66);
        f2128e.append(122, 67);
        f2128e.append(113, 79);
        f2128e.append(1, 38);
        f2128e.append(112, 68);
        f2128e.append(100, 69);
        f2128e.append(77, 70);
        f2128e.append(111, 97);
        f2128e.append(32, 71);
        f2128e.append(30, 72);
        f2128e.append(31, 73);
        f2128e.append(33, 74);
        f2128e.append(29, 75);
        f2128e.append(114, 76);
        f2128e.append(89, 77);
        f2128e.append(123, 78);
        f2128e.append(56, 80);
        f2128e.append(55, 81);
        f2128e.append(116, 82);
        f2128e.append(120, 83);
        f2128e.append(119, 84);
        f2128e.append(118, 85);
        f2128e.append(117, 86);
        f2129f.append(85, 6);
        f2129f.append(85, 7);
        f2129f.append(0, 27);
        f2129f.append(89, 13);
        f2129f.append(92, 16);
        f2129f.append(90, 14);
        f2129f.append(87, 11);
        f2129f.append(91, 15);
        f2129f.append(88, 12);
        f2129f.append(78, 40);
        f2129f.append(71, 39);
        f2129f.append(70, 41);
        f2129f.append(77, 42);
        f2129f.append(69, 20);
        f2129f.append(76, 37);
        f2129f.append(60, 5);
        f2129f.append(72, 87);
        f2129f.append(75, 87);
        f2129f.append(73, 87);
        f2129f.append(57, 87);
        f2129f.append(56, 87);
        f2129f.append(5, 24);
        f2129f.append(7, 28);
        f2129f.append(23, 31);
        f2129f.append(24, 8);
        f2129f.append(6, 34);
        f2129f.append(8, 2);
        f2129f.append(3, 23);
        f2129f.append(4, 21);
        f2129f.append(79, 95);
        f2129f.append(64, 96);
        f2129f.append(2, 22);
        f2129f.append(13, 43);
        f2129f.append(26, 44);
        f2129f.append(21, 45);
        f2129f.append(22, 46);
        f2129f.append(20, 60);
        f2129f.append(18, 47);
        f2129f.append(19, 48);
        f2129f.append(14, 49);
        f2129f.append(15, 50);
        f2129f.append(16, 51);
        f2129f.append(17, 52);
        f2129f.append(25, 53);
        f2129f.append(80, 54);
        f2129f.append(65, 55);
        f2129f.append(81, 56);
        f2129f.append(66, 57);
        f2129f.append(82, 58);
        f2129f.append(67, 59);
        f2129f.append(59, 62);
        f2129f.append(58, 63);
        f2129f.append(28, 64);
        f2129f.append(105, 65);
        f2129f.append(34, 66);
        f2129f.append(106, 67);
        f2129f.append(96, 79);
        f2129f.append(1, 38);
        f2129f.append(97, 98);
        f2129f.append(95, 68);
        f2129f.append(83, 69);
        f2129f.append(68, 70);
        f2129f.append(32, 71);
        f2129f.append(30, 72);
        f2129f.append(31, 73);
        f2129f.append(33, 74);
        f2129f.append(29, 75);
        f2129f.append(98, 76);
        f2129f.append(74, 77);
        f2129f.append(107, 78);
        f2129f.append(55, 80);
        f2129f.append(54, 81);
        f2129f.append(100, 82);
        f2129f.append(104, 83);
        f2129f.append(103, 84);
        f2129f.append(102, 85);
        f2129f.append(101, 86);
        f2129f.append(94, 97);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.g.c.c.g(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void h(ConstraintLayout.a aVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i2 = 0;
            int i3 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    i2 = substring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i3 = i2;
                i2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                    String substring2 = str.substring(i2, indexOf2);
                    String substring3 = str.substring(indexOf2 + 1);
                    if (substring2.length() > 0 && substring3.length() > 0) {
                        float parseFloat = Float.parseFloat(substring2);
                        float parseFloat2 = Float.parseFloat(substring3);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i3 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                } else {
                    String substring4 = str.substring(i2);
                    if (substring4.length() > 0) {
                        Float.parseFloat(substring4);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        aVar.G = str;
    }

    public void a(ConstraintLayout constraintLayout) {
        b(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public void b(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.c.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!this.c.containsKey(Integer.valueOf(id))) {
                StringBuilder A = f.a.b.a.a.A("id unknown ");
                A.append(e.e.a.e(childAt));
                Log.w("ConstraintSet", A.toString());
            } else if (this.b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (id != -1) {
                    if (this.c.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = this.c.get(Integer.valueOf(id));
                        if (aVar != null) {
                            if (childAt instanceof Barrier) {
                                aVar.f2130d.i0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(aVar.f2130d.g0);
                                barrier.setMargin(aVar.f2130d.h0);
                                barrier.setAllowsGoneWidget(aVar.f2130d.o0);
                                b bVar = aVar.f2130d;
                                int[] iArr = bVar.j0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.k0;
                                    if (str != null) {
                                        bVar.j0 = d(barrier, str);
                                        barrier.setReferencedIds(aVar.f2130d.j0);
                                    }
                                }
                            }
                            ConstraintLayout.a aVar2 = (ConstraintLayout.a) childAt.getLayoutParams();
                            aVar2.a();
                            aVar.a(aVar2);
                            if (z) {
                                ConstraintAttribute.b(childAt, aVar.f2132f);
                            }
                            childAt.setLayoutParams(aVar2);
                            d dVar = aVar.b;
                            if (dVar.c == 0) {
                                childAt.setVisibility(dVar.b);
                            }
                            childAt.setAlpha(aVar.b.f2163d);
                            childAt.setRotation(aVar.f2131e.b);
                            childAt.setRotationX(aVar.f2131e.c);
                            childAt.setRotationY(aVar.f2131e.f2165d);
                            childAt.setScaleX(aVar.f2131e.f2166e);
                            childAt.setScaleY(aVar.f2131e.f2167f);
                            e eVar = aVar.f2131e;
                            if (eVar.f2170i != -1) {
                                View findViewById = ((View) childAt.getParent()).findViewById(aVar.f2131e.f2170i);
                                if (findViewById != null) {
                                    float bottom = (findViewById.getBottom() + findViewById.getTop()) / 2.0f;
                                    float right = (findViewById.getRight() + findViewById.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.f2168g)) {
                                    childAt.setPivotX(aVar.f2131e.f2168g);
                                }
                                if (!Float.isNaN(aVar.f2131e.f2169h)) {
                                    childAt.setPivotY(aVar.f2131e.f2169h);
                                }
                            }
                            childAt.setTranslationX(aVar.f2131e.f2171j);
                            childAt.setTranslationY(aVar.f2131e.f2172k);
                            childAt.setTranslationZ(aVar.f2131e.f2173l);
                            e eVar2 = aVar.f2131e;
                            if (eVar2.f2174m) {
                                childAt.setElevation(eVar2.n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar3 = this.c.get(num);
            if (aVar3 != null) {
                if (aVar3.f2130d.i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar2 = aVar3.f2130d;
                    int[] iArr2 = bVar2.j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar2.k0;
                        if (str2 != null) {
                            bVar2.j0 = d(barrier2, str2);
                            barrier2.setReferencedIds(aVar3.f2130d.j0);
                        }
                    }
                    barrier2.setType(aVar3.f2130d.g0);
                    barrier2.setMargin(aVar3.f2130d.h0);
                    ConstraintLayout.a generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.o();
                    aVar3.a(generateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, generateDefaultLayoutParams);
                }
                if (aVar3.f2130d.a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.a generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar3.a(generateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = constraintLayout.getChildAt(i3);
            if (childAt2 instanceof e.g.c.a) {
                ((e.g.c.a) childAt2).h(constraintLayout);
            }
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        c cVar = this;
        int childCount = constraintLayout.getChildCount();
        cVar.c.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.a aVar = (ConstraintLayout.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (cVar.b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!cVar.c.containsKey(Integer.valueOf(id))) {
                cVar.c.put(Integer.valueOf(id), new a());
            }
            a aVar2 = cVar.c.get(Integer.valueOf(id));
            if (aVar2 != null) {
                HashMap<String, ConstraintAttribute> hashMap = cVar.a;
                HashMap<String, ConstraintAttribute> hashMap2 = new HashMap<>();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap.keySet()) {
                    ConstraintAttribute constraintAttribute = hashMap.get(str);
                    try {
                    } catch (IllegalAccessException e2) {
                        e = e2;
                    } catch (NoSuchMethodException e3) {
                        e = e3;
                    } catch (InvocationTargetException e4) {
                        e = e4;
                    }
                    if (str.equals("BackgroundColor")) {
                        hashMap2.put(str, new ConstraintAttribute(constraintAttribute, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                    } else {
                        try {
                            hashMap2.put(str, new ConstraintAttribute(constraintAttribute, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                        } catch (IllegalAccessException e5) {
                            e = e5;
                            e.printStackTrace();
                        } catch (NoSuchMethodException e6) {
                            e = e6;
                            e.printStackTrace();
                        } catch (InvocationTargetException e7) {
                            e = e7;
                            e.printStackTrace();
                        }
                    }
                }
                aVar2.f2132f = hashMap2;
                aVar2.b(id, aVar);
                aVar2.b.b = childAt.getVisibility();
                aVar2.b.f2163d = childAt.getAlpha();
                aVar2.f2131e.b = childAt.getRotation();
                aVar2.f2131e.c = childAt.getRotationX();
                aVar2.f2131e.f2165d = childAt.getRotationY();
                aVar2.f2131e.f2166e = childAt.getScaleX();
                aVar2.f2131e.f2167f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || pivotY != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    e eVar = aVar2.f2131e;
                    eVar.f2168g = pivotX;
                    eVar.f2169h = pivotY;
                }
                aVar2.f2131e.f2171j = childAt.getTranslationX();
                aVar2.f2131e.f2172k = childAt.getTranslationY();
                aVar2.f2131e.f2173l = childAt.getTranslationZ();
                e eVar2 = aVar2.f2131e;
                if (eVar2.f2174m) {
                    eVar2.n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar2.f2130d.o0 = barrier.getAllowsGoneWidget();
                    aVar2.f2130d.j0 = barrier.getReferencedIds();
                    aVar2.f2130d.g0 = barrier.getType();
                    aVar2.f2130d.h0 = barrier.getMargin();
                }
            }
            i2++;
            cVar = this;
        }
    }

    public final int[] d(View view, String str) {
        int i2;
        Object c;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i3 = 0;
        int i4 = 0;
        while (i3 < split.length) {
            String trim = split[i3].trim();
            try {
                i2 = g.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i2 = 0;
            }
            if (i2 == 0) {
                i2 = context.getResources().getIdentifier(trim, Chapter.KEY_ID, context.getPackageName());
            }
            if (i2 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (c = ((ConstraintLayout) view.getParent()).c(0, trim)) != null && (c instanceof Integer)) {
                i2 = ((Integer) c).intValue();
            }
            iArr[i4] = i2;
            i3++;
            i4++;
        }
        return i4 != split.length ? Arrays.copyOf(iArr, i4) : iArr;
    }

    public final a e(Context context, AttributeSet attributeSet, boolean z) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? h.c : h.a);
        int i2 = 3;
        int i3 = 1;
        int i4 = 0;
        if (z) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            a.C0036a c0036a = new a.C0036a();
            aVar.f2133g = c0036a;
            aVar.c.a = false;
            aVar.f2130d.b = false;
            aVar.b.a = false;
            aVar.f2131e.a = false;
            int i5 = 0;
            while (i5 < indexCount) {
                int index = obtainStyledAttributes.getIndex(i5);
                switch (f2129f.get(index)) {
                    case 2:
                        c0036a.b(2, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f2130d.J));
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder A = f.a.b.a.a.A("Unknown attribute 0x");
                        A.append(Integer.toHexString(index));
                        A.append("   ");
                        A.append(f2128e.get(index));
                        Log.w("ConstraintSet", A.toString());
                        break;
                    case 5:
                        c0036a.c(5, obtainStyledAttributes.getString(index));
                        break;
                    case 6:
                        c0036a.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, aVar.f2130d.D));
                        break;
                    case 7:
                        c0036a.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, aVar.f2130d.E));
                        break;
                    case 8:
                        c0036a.b(8, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f2130d.K));
                        break;
                    case 11:
                        c0036a.b(11, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f2130d.Q));
                        break;
                    case 12:
                        c0036a.b(12, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f2130d.R));
                        break;
                    case 13:
                        c0036a.b(13, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f2130d.N));
                        break;
                    case 14:
                        c0036a.b(14, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f2130d.P));
                        break;
                    case 15:
                        c0036a.b(15, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f2130d.S));
                        break;
                    case 16:
                        c0036a.b(16, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f2130d.O));
                        break;
                    case 17:
                        c0036a.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, aVar.f2130d.f2144e));
                        break;
                    case 18:
                        c0036a.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, aVar.f2130d.f2145f));
                        break;
                    case 19:
                        c0036a.a(19, obtainStyledAttributes.getFloat(index, aVar.f2130d.f2146g));
                        break;
                    case 20:
                        c0036a.a(20, obtainStyledAttributes.getFloat(index, aVar.f2130d.x));
                        break;
                    case 21:
                        c0036a.b(21, obtainStyledAttributes.getLayoutDimension(index, aVar.f2130d.f2143d));
                        break;
                    case 22:
                        c0036a.b(22, f2127d[obtainStyledAttributes.getInt(index, aVar.b.b)]);
                        break;
                    case 23:
                        c0036a.b(23, obtainStyledAttributes.getLayoutDimension(index, aVar.f2130d.c));
                        break;
                    case 24:
                        c0036a.b(24, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f2130d.G));
                        break;
                    case 27:
                        c0036a.b(27, obtainStyledAttributes.getInt(index, aVar.f2130d.F));
                        break;
                    case 28:
                        c0036a.b(28, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f2130d.H));
                        break;
                    case 31:
                        c0036a.b(31, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f2130d.L));
                        break;
                    case 34:
                        c0036a.b(34, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f2130d.I));
                        break;
                    case 37:
                        c0036a.a(37, obtainStyledAttributes.getFloat(index, aVar.f2130d.y));
                        break;
                    case 38:
                        int resourceId = obtainStyledAttributes.getResourceId(index, aVar.a);
                        aVar.a = resourceId;
                        c0036a.b(38, resourceId);
                        break;
                    case 39:
                        c0036a.a(39, obtainStyledAttributes.getFloat(index, aVar.f2130d.V));
                        break;
                    case 40:
                        c0036a.a(40, obtainStyledAttributes.getFloat(index, aVar.f2130d.U));
                        break;
                    case 41:
                        c0036a.b(41, obtainStyledAttributes.getInt(index, aVar.f2130d.W));
                        break;
                    case 42:
                        c0036a.b(42, obtainStyledAttributes.getInt(index, aVar.f2130d.X));
                        break;
                    case 43:
                        c0036a.a(43, obtainStyledAttributes.getFloat(index, aVar.b.f2163d));
                        break;
                    case 44:
                        c0036a.d(44, true);
                        c0036a.a(44, obtainStyledAttributes.getDimension(index, aVar.f2131e.n));
                        break;
                    case 45:
                        c0036a.a(45, obtainStyledAttributes.getFloat(index, aVar.f2131e.c));
                        break;
                    case 46:
                        c0036a.a(46, obtainStyledAttributes.getFloat(index, aVar.f2131e.f2165d));
                        break;
                    case 47:
                        c0036a.a(47, obtainStyledAttributes.getFloat(index, aVar.f2131e.f2166e));
                        break;
                    case 48:
                        c0036a.a(48, obtainStyledAttributes.getFloat(index, aVar.f2131e.f2167f));
                        break;
                    case 49:
                        c0036a.a(49, obtainStyledAttributes.getDimension(index, aVar.f2131e.f2168g));
                        break;
                    case 50:
                        c0036a.a(50, obtainStyledAttributes.getDimension(index, aVar.f2131e.f2169h));
                        break;
                    case 51:
                        c0036a.a(51, obtainStyledAttributes.getDimension(index, aVar.f2131e.f2171j));
                        break;
                    case 52:
                        c0036a.a(52, obtainStyledAttributes.getDimension(index, aVar.f2131e.f2172k));
                        break;
                    case 53:
                        c0036a.a(53, obtainStyledAttributes.getDimension(index, aVar.f2131e.f2173l));
                        break;
                    case 54:
                        c0036a.b(54, obtainStyledAttributes.getInt(index, aVar.f2130d.Y));
                        break;
                    case 55:
                        c0036a.b(55, obtainStyledAttributes.getInt(index, aVar.f2130d.Z));
                        break;
                    case 56:
                        c0036a.b(56, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f2130d.a0));
                        break;
                    case 57:
                        c0036a.b(57, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f2130d.b0));
                        break;
                    case 58:
                        c0036a.b(58, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f2130d.c0));
                        break;
                    case 59:
                        c0036a.b(59, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f2130d.d0));
                        break;
                    case 60:
                        c0036a.a(60, obtainStyledAttributes.getFloat(index, aVar.f2131e.b));
                        break;
                    case 62:
                        c0036a.b(62, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f2130d.B));
                        break;
                    case 63:
                        c0036a.a(63, obtainStyledAttributes.getFloat(index, aVar.f2130d.C));
                        break;
                    case 64:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, aVar.c.b);
                        if (resourceId2 == -1) {
                            resourceId2 = obtainStyledAttributes.getInt(index, -1);
                        }
                        c0036a.b(64, resourceId2);
                        break;
                    case 65:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            c0036a.c(65, obtainStyledAttributes.getString(index));
                            break;
                        } else {
                            c0036a.c(65, e.g.a.g.a.a.c[obtainStyledAttributes.getInteger(index, 0)]);
                            break;
                        }
                    case 66:
                        c0036a.b(66, obtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        c0036a.a(67, obtainStyledAttributes.getFloat(index, aVar.c.f2158i));
                        break;
                    case 68:
                        c0036a.a(68, obtainStyledAttributes.getFloat(index, aVar.b.f2164e));
                        break;
                    case 69:
                        c0036a.a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        c0036a.a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        c0036a.b(72, obtainStyledAttributes.getInt(index, aVar.f2130d.g0));
                        break;
                    case 73:
                        c0036a.b(73, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f2130d.h0));
                        break;
                    case 74:
                        c0036a.c(74, obtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        c0036a.d(75, obtainStyledAttributes.getBoolean(index, aVar.f2130d.o0));
                        break;
                    case 76:
                        c0036a.b(76, obtainStyledAttributes.getInt(index, aVar.c.f2154e));
                        break;
                    case 77:
                        c0036a.c(77, obtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        c0036a.b(78, obtainStyledAttributes.getInt(index, aVar.b.c));
                        break;
                    case 79:
                        c0036a.a(79, obtainStyledAttributes.getFloat(index, aVar.c.f2156g));
                        break;
                    case 80:
                        c0036a.d(80, obtainStyledAttributes.getBoolean(index, aVar.f2130d.m0));
                        break;
                    case 81:
                        c0036a.d(81, obtainStyledAttributes.getBoolean(index, aVar.f2130d.n0));
                        break;
                    case 82:
                        c0036a.b(82, obtainStyledAttributes.getInteger(index, aVar.c.c));
                        break;
                    case 83:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, aVar.f2131e.f2170i);
                        if (resourceId3 == -1) {
                            resourceId3 = obtainStyledAttributes.getInt(index, -1);
                        }
                        c0036a.b(83, resourceId3);
                        break;
                    case 84:
                        c0036a.b(84, obtainStyledAttributes.getInteger(index, aVar.c.f2160k));
                        break;
                    case 85:
                        c0036a.a(85, obtainStyledAttributes.getFloat(index, aVar.c.f2159j));
                        break;
                    case 86:
                        int i6 = obtainStyledAttributes.peekValue(index).type;
                        if (i6 == i3) {
                            aVar.c.n = obtainStyledAttributes.getResourceId(index, -1);
                            c0036a.b(89, aVar.c.n);
                            C0037c c0037c = aVar.c;
                            if (c0037c.n != -1) {
                                c0037c.f2162m = -2;
                                c0036a.b(88, -2);
                                break;
                            } else {
                                break;
                            }
                        } else if (i6 == 3) {
                            aVar.c.f2161l = obtainStyledAttributes.getString(index);
                            c0036a.c(90, aVar.c.f2161l);
                            if (aVar.c.f2161l.indexOf("/") > 0) {
                                aVar.c.n = obtainStyledAttributes.getResourceId(index, -1);
                                c0036a.b(89, aVar.c.n);
                                aVar.c.f2162m = -2;
                                c0036a.b(88, -2);
                                break;
                            } else {
                                aVar.c.f2162m = -1;
                                c0036a.b(88, -1);
                                break;
                            }
                        } else {
                            C0037c c0037c2 = aVar.c;
                            c0037c2.f2162m = obtainStyledAttributes.getInteger(index, c0037c2.n);
                            c0036a.b(88, aVar.c.f2162m);
                            break;
                        }
                    case 87:
                        StringBuilder A2 = f.a.b.a.a.A("unused attribute 0x");
                        A2.append(Integer.toHexString(index));
                        A2.append("   ");
                        A2.append(f2128e.get(index));
                        Log.w("ConstraintSet", A2.toString());
                        break;
                    case 93:
                        c0036a.b(93, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f2130d.M));
                        break;
                    case 94:
                        c0036a.b(94, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f2130d.T));
                        break;
                    case 95:
                        g(c0036a, obtainStyledAttributes, index, i4);
                        break;
                    case 96:
                        g(c0036a, obtainStyledAttributes, index, i3);
                        break;
                    case 97:
                        c0036a.b(97, obtainStyledAttributes.getInt(index, aVar.f2130d.p0));
                        break;
                    case 98:
                        int i7 = e.g.b.a.c.d0;
                        if (obtainStyledAttributes.peekValue(index).type == i2) {
                            obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            aVar.a = obtainStyledAttributes.getResourceId(index, aVar.a);
                            break;
                        }
                    case 99:
                        c0036a.d(99, obtainStyledAttributes.getBoolean(index, aVar.f2130d.f2147h));
                        break;
                }
                i5++;
                i2 = 3;
                i3 = 1;
                i4 = 0;
            }
        } else {
            int indexCount2 = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount2; i8++) {
                int index2 = obtainStyledAttributes.getIndex(i8);
                if (index2 != 1 && 23 != index2 && 24 != index2) {
                    aVar.c.a = true;
                    aVar.f2130d.b = true;
                    aVar.b.a = true;
                    aVar.f2131e.a = true;
                }
                switch (f2128e.get(index2)) {
                    case 1:
                        b bVar = aVar.f2130d;
                        int resourceId4 = obtainStyledAttributes.getResourceId(index2, bVar.q);
                        if (resourceId4 == -1) {
                            resourceId4 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar.q = resourceId4;
                        break;
                    case 2:
                        b bVar2 = aVar.f2130d;
                        bVar2.J = obtainStyledAttributes.getDimensionPixelSize(index2, bVar2.J);
                        break;
                    case 3:
                        b bVar3 = aVar.f2130d;
                        int resourceId5 = obtainStyledAttributes.getResourceId(index2, bVar3.p);
                        if (resourceId5 == -1) {
                            resourceId5 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar3.p = resourceId5;
                        break;
                    case 4:
                        b bVar4 = aVar.f2130d;
                        int resourceId6 = obtainStyledAttributes.getResourceId(index2, bVar4.o);
                        if (resourceId6 == -1) {
                            resourceId6 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar4.o = resourceId6;
                        break;
                    case 5:
                        aVar.f2130d.z = obtainStyledAttributes.getString(index2);
                        break;
                    case 6:
                        b bVar5 = aVar.f2130d;
                        bVar5.D = obtainStyledAttributes.getDimensionPixelOffset(index2, bVar5.D);
                        break;
                    case 7:
                        b bVar6 = aVar.f2130d;
                        bVar6.E = obtainStyledAttributes.getDimensionPixelOffset(index2, bVar6.E);
                        break;
                    case 8:
                        b bVar7 = aVar.f2130d;
                        bVar7.K = obtainStyledAttributes.getDimensionPixelSize(index2, bVar7.K);
                        break;
                    case 9:
                        b bVar8 = aVar.f2130d;
                        int resourceId7 = obtainStyledAttributes.getResourceId(index2, bVar8.w);
                        if (resourceId7 == -1) {
                            resourceId7 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar8.w = resourceId7;
                        break;
                    case 10:
                        b bVar9 = aVar.f2130d;
                        int resourceId8 = obtainStyledAttributes.getResourceId(index2, bVar9.v);
                        if (resourceId8 == -1) {
                            resourceId8 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar9.v = resourceId8;
                        break;
                    case 11:
                        b bVar10 = aVar.f2130d;
                        bVar10.Q = obtainStyledAttributes.getDimensionPixelSize(index2, bVar10.Q);
                        break;
                    case 12:
                        b bVar11 = aVar.f2130d;
                        bVar11.R = obtainStyledAttributes.getDimensionPixelSize(index2, bVar11.R);
                        break;
                    case 13:
                        b bVar12 = aVar.f2130d;
                        bVar12.N = obtainStyledAttributes.getDimensionPixelSize(index2, bVar12.N);
                        break;
                    case 14:
                        b bVar13 = aVar.f2130d;
                        bVar13.P = obtainStyledAttributes.getDimensionPixelSize(index2, bVar13.P);
                        break;
                    case 15:
                        b bVar14 = aVar.f2130d;
                        bVar14.S = obtainStyledAttributes.getDimensionPixelSize(index2, bVar14.S);
                        break;
                    case 16:
                        b bVar15 = aVar.f2130d;
                        bVar15.O = obtainStyledAttributes.getDimensionPixelSize(index2, bVar15.O);
                        break;
                    case 17:
                        b bVar16 = aVar.f2130d;
                        bVar16.f2144e = obtainStyledAttributes.getDimensionPixelOffset(index2, bVar16.f2144e);
                        break;
                    case 18:
                        b bVar17 = aVar.f2130d;
                        bVar17.f2145f = obtainStyledAttributes.getDimensionPixelOffset(index2, bVar17.f2145f);
                        break;
                    case 19:
                        b bVar18 = aVar.f2130d;
                        bVar18.f2146g = obtainStyledAttributes.getFloat(index2, bVar18.f2146g);
                        break;
                    case 20:
                        b bVar19 = aVar.f2130d;
                        bVar19.x = obtainStyledAttributes.getFloat(index2, bVar19.x);
                        break;
                    case 21:
                        b bVar20 = aVar.f2130d;
                        bVar20.f2143d = obtainStyledAttributes.getLayoutDimension(index2, bVar20.f2143d);
                        break;
                    case 22:
                        d dVar = aVar.b;
                        dVar.b = obtainStyledAttributes.getInt(index2, dVar.b);
                        d dVar2 = aVar.b;
                        dVar2.b = f2127d[dVar2.b];
                        break;
                    case 23:
                        b bVar21 = aVar.f2130d;
                        bVar21.c = obtainStyledAttributes.getLayoutDimension(index2, bVar21.c);
                        break;
                    case 24:
                        b bVar22 = aVar.f2130d;
                        bVar22.G = obtainStyledAttributes.getDimensionPixelSize(index2, bVar22.G);
                        break;
                    case 25:
                        b bVar23 = aVar.f2130d;
                        int resourceId9 = obtainStyledAttributes.getResourceId(index2, bVar23.f2148i);
                        if (resourceId9 == -1) {
                            resourceId9 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar23.f2148i = resourceId9;
                        break;
                    case 26:
                        b bVar24 = aVar.f2130d;
                        int resourceId10 = obtainStyledAttributes.getResourceId(index2, bVar24.f2149j);
                        if (resourceId10 == -1) {
                            resourceId10 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar24.f2149j = resourceId10;
                        break;
                    case 27:
                        b bVar25 = aVar.f2130d;
                        bVar25.F = obtainStyledAttributes.getInt(index2, bVar25.F);
                        break;
                    case 28:
                        b bVar26 = aVar.f2130d;
                        bVar26.H = obtainStyledAttributes.getDimensionPixelSize(index2, bVar26.H);
                        break;
                    case 29:
                        b bVar27 = aVar.f2130d;
                        int resourceId11 = obtainStyledAttributes.getResourceId(index2, bVar27.f2150k);
                        if (resourceId11 == -1) {
                            resourceId11 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar27.f2150k = resourceId11;
                        break;
                    case 30:
                        b bVar28 = aVar.f2130d;
                        int resourceId12 = obtainStyledAttributes.getResourceId(index2, bVar28.f2151l);
                        if (resourceId12 == -1) {
                            resourceId12 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar28.f2151l = resourceId12;
                        break;
                    case 31:
                        b bVar29 = aVar.f2130d;
                        bVar29.L = obtainStyledAttributes.getDimensionPixelSize(index2, bVar29.L);
                        break;
                    case 32:
                        b bVar30 = aVar.f2130d;
                        int resourceId13 = obtainStyledAttributes.getResourceId(index2, bVar30.t);
                        if (resourceId13 == -1) {
                            resourceId13 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar30.t = resourceId13;
                        break;
                    case 33:
                        b bVar31 = aVar.f2130d;
                        int resourceId14 = obtainStyledAttributes.getResourceId(index2, bVar31.u);
                        if (resourceId14 == -1) {
                            resourceId14 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar31.u = resourceId14;
                        break;
                    case 34:
                        b bVar32 = aVar.f2130d;
                        bVar32.I = obtainStyledAttributes.getDimensionPixelSize(index2, bVar32.I);
                        break;
                    case 35:
                        b bVar33 = aVar.f2130d;
                        int resourceId15 = obtainStyledAttributes.getResourceId(index2, bVar33.n);
                        if (resourceId15 == -1) {
                            resourceId15 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar33.n = resourceId15;
                        break;
                    case 36:
                        b bVar34 = aVar.f2130d;
                        int resourceId16 = obtainStyledAttributes.getResourceId(index2, bVar34.f2152m);
                        if (resourceId16 == -1) {
                            resourceId16 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar34.f2152m = resourceId16;
                        break;
                    case 37:
                        b bVar35 = aVar.f2130d;
                        bVar35.y = obtainStyledAttributes.getFloat(index2, bVar35.y);
                        break;
                    case 38:
                        aVar.a = obtainStyledAttributes.getResourceId(index2, aVar.a);
                        break;
                    case 39:
                        b bVar36 = aVar.f2130d;
                        bVar36.V = obtainStyledAttributes.getFloat(index2, bVar36.V);
                        break;
                    case 40:
                        b bVar37 = aVar.f2130d;
                        bVar37.U = obtainStyledAttributes.getFloat(index2, bVar37.U);
                        break;
                    case 41:
                        b bVar38 = aVar.f2130d;
                        bVar38.W = obtainStyledAttributes.getInt(index2, bVar38.W);
                        break;
                    case 42:
                        b bVar39 = aVar.f2130d;
                        bVar39.X = obtainStyledAttributes.getInt(index2, bVar39.X);
                        break;
                    case 43:
                        d dVar3 = aVar.b;
                        dVar3.f2163d = obtainStyledAttributes.getFloat(index2, dVar3.f2163d);
                        break;
                    case 44:
                        e eVar = aVar.f2131e;
                        eVar.f2174m = true;
                        eVar.n = obtainStyledAttributes.getDimension(index2, eVar.n);
                        break;
                    case 45:
                        e eVar2 = aVar.f2131e;
                        eVar2.c = obtainStyledAttributes.getFloat(index2, eVar2.c);
                        break;
                    case 46:
                        e eVar3 = aVar.f2131e;
                        eVar3.f2165d = obtainStyledAttributes.getFloat(index2, eVar3.f2165d);
                        break;
                    case 47:
                        e eVar4 = aVar.f2131e;
                        eVar4.f2166e = obtainStyledAttributes.getFloat(index2, eVar4.f2166e);
                        break;
                    case 48:
                        e eVar5 = aVar.f2131e;
                        eVar5.f2167f = obtainStyledAttributes.getFloat(index2, eVar5.f2167f);
                        break;
                    case 49:
                        e eVar6 = aVar.f2131e;
                        eVar6.f2168g = obtainStyledAttributes.getDimension(index2, eVar6.f2168g);
                        break;
                    case 50:
                        e eVar7 = aVar.f2131e;
                        eVar7.f2169h = obtainStyledAttributes.getDimension(index2, eVar7.f2169h);
                        break;
                    case 51:
                        e eVar8 = aVar.f2131e;
                        eVar8.f2171j = obtainStyledAttributes.getDimension(index2, eVar8.f2171j);
                        break;
                    case 52:
                        e eVar9 = aVar.f2131e;
                        eVar9.f2172k = obtainStyledAttributes.getDimension(index2, eVar9.f2172k);
                        break;
                    case 53:
                        e eVar10 = aVar.f2131e;
                        eVar10.f2173l = obtainStyledAttributes.getDimension(index2, eVar10.f2173l);
                        break;
                    case 54:
                        b bVar40 = aVar.f2130d;
                        bVar40.Y = obtainStyledAttributes.getInt(index2, bVar40.Y);
                        break;
                    case 55:
                        b bVar41 = aVar.f2130d;
                        bVar41.Z = obtainStyledAttributes.getInt(index2, bVar41.Z);
                        break;
                    case 56:
                        b bVar42 = aVar.f2130d;
                        bVar42.a0 = obtainStyledAttributes.getDimensionPixelSize(index2, bVar42.a0);
                        break;
                    case 57:
                        b bVar43 = aVar.f2130d;
                        bVar43.b0 = obtainStyledAttributes.getDimensionPixelSize(index2, bVar43.b0);
                        break;
                    case 58:
                        b bVar44 = aVar.f2130d;
                        bVar44.c0 = obtainStyledAttributes.getDimensionPixelSize(index2, bVar44.c0);
                        break;
                    case 59:
                        b bVar45 = aVar.f2130d;
                        bVar45.d0 = obtainStyledAttributes.getDimensionPixelSize(index2, bVar45.d0);
                        break;
                    case 60:
                        e eVar11 = aVar.f2131e;
                        eVar11.b = obtainStyledAttributes.getFloat(index2, eVar11.b);
                        break;
                    case 61:
                        b bVar46 = aVar.f2130d;
                        int resourceId17 = obtainStyledAttributes.getResourceId(index2, bVar46.A);
                        if (resourceId17 == -1) {
                            resourceId17 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar46.A = resourceId17;
                        break;
                    case 62:
                        b bVar47 = aVar.f2130d;
                        bVar47.B = obtainStyledAttributes.getDimensionPixelSize(index2, bVar47.B);
                        break;
                    case 63:
                        b bVar48 = aVar.f2130d;
                        bVar48.C = obtainStyledAttributes.getFloat(index2, bVar48.C);
                        break;
                    case 64:
                        C0037c c0037c3 = aVar.c;
                        int resourceId18 = obtainStyledAttributes.getResourceId(index2, c0037c3.b);
                        if (resourceId18 == -1) {
                            resourceId18 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        c0037c3.b = resourceId18;
                        break;
                    case 65:
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            aVar.c.f2153d = obtainStyledAttributes.getString(index2);
                            break;
                        } else {
                            aVar.c.f2153d = e.g.a.g.a.a.c[obtainStyledAttributes.getInteger(index2, 0)];
                            break;
                        }
                    case 66:
                        aVar.c.f2155f = obtainStyledAttributes.getInt(index2, 0);
                        break;
                    case 67:
                        C0037c c0037c4 = aVar.c;
                        c0037c4.f2158i = obtainStyledAttributes.getFloat(index2, c0037c4.f2158i);
                        break;
                    case 68:
                        d dVar4 = aVar.b;
                        dVar4.f2164e = obtainStyledAttributes.getFloat(index2, dVar4.f2164e);
                        break;
                    case 69:
                        aVar.f2130d.e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        aVar.f2130d.f0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        b bVar49 = aVar.f2130d;
                        bVar49.g0 = obtainStyledAttributes.getInt(index2, bVar49.g0);
                        break;
                    case 73:
                        b bVar50 = aVar.f2130d;
                        bVar50.h0 = obtainStyledAttributes.getDimensionPixelSize(index2, bVar50.h0);
                        break;
                    case 74:
                        aVar.f2130d.k0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        b bVar51 = aVar.f2130d;
                        bVar51.o0 = obtainStyledAttributes.getBoolean(index2, bVar51.o0);
                        break;
                    case 76:
                        C0037c c0037c5 = aVar.c;
                        c0037c5.f2154e = obtainStyledAttributes.getInt(index2, c0037c5.f2154e);
                        break;
                    case 77:
                        aVar.f2130d.l0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        d dVar5 = aVar.b;
                        dVar5.c = obtainStyledAttributes.getInt(index2, dVar5.c);
                        break;
                    case 79:
                        C0037c c0037c6 = aVar.c;
                        c0037c6.f2156g = obtainStyledAttributes.getFloat(index2, c0037c6.f2156g);
                        break;
                    case 80:
                        b bVar52 = aVar.f2130d;
                        bVar52.m0 = obtainStyledAttributes.getBoolean(index2, bVar52.m0);
                        break;
                    case 81:
                        b bVar53 = aVar.f2130d;
                        bVar53.n0 = obtainStyledAttributes.getBoolean(index2, bVar53.n0);
                        break;
                    case 82:
                        C0037c c0037c7 = aVar.c;
                        c0037c7.c = obtainStyledAttributes.getInteger(index2, c0037c7.c);
                        break;
                    case 83:
                        e eVar12 = aVar.f2131e;
                        int resourceId19 = obtainStyledAttributes.getResourceId(index2, eVar12.f2170i);
                        if (resourceId19 == -1) {
                            resourceId19 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        eVar12.f2170i = resourceId19;
                        break;
                    case 84:
                        C0037c c0037c8 = aVar.c;
                        c0037c8.f2160k = obtainStyledAttributes.getInteger(index2, c0037c8.f2160k);
                        break;
                    case 85:
                        C0037c c0037c9 = aVar.c;
                        c0037c9.f2159j = obtainStyledAttributes.getFloat(index2, c0037c9.f2159j);
                        break;
                    case 86:
                        int i9 = obtainStyledAttributes.peekValue(index2).type;
                        if (i9 == 1) {
                            aVar.c.n = obtainStyledAttributes.getResourceId(index2, -1);
                            C0037c c0037c10 = aVar.c;
                            if (c0037c10.n != -1) {
                                c0037c10.f2162m = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i9 == 3) {
                            aVar.c.f2161l = obtainStyledAttributes.getString(index2);
                            if (aVar.c.f2161l.indexOf("/") > 0) {
                                aVar.c.n = obtainStyledAttributes.getResourceId(index2, -1);
                                aVar.c.f2162m = -2;
                                break;
                            } else {
                                aVar.c.f2162m = -1;
                                break;
                            }
                        } else {
                            C0037c c0037c11 = aVar.c;
                            c0037c11.f2162m = obtainStyledAttributes.getInteger(index2, c0037c11.n);
                            break;
                        }
                    case 87:
                        StringBuilder A3 = f.a.b.a.a.A("unused attribute 0x");
                        A3.append(Integer.toHexString(index2));
                        A3.append("   ");
                        A3.append(f2128e.get(index2));
                        Log.w("ConstraintSet", A3.toString());
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder A4 = f.a.b.a.a.A("Unknown attribute 0x");
                        A4.append(Integer.toHexString(index2));
                        A4.append("   ");
                        A4.append(f2128e.get(index2));
                        Log.w("ConstraintSet", A4.toString());
                        break;
                    case 91:
                        b bVar54 = aVar.f2130d;
                        int resourceId20 = obtainStyledAttributes.getResourceId(index2, bVar54.r);
                        if (resourceId20 == -1) {
                            resourceId20 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar54.r = resourceId20;
                        break;
                    case 92:
                        b bVar55 = aVar.f2130d;
                        int resourceId21 = obtainStyledAttributes.getResourceId(index2, bVar55.s);
                        if (resourceId21 == -1) {
                            resourceId21 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar55.s = resourceId21;
                        break;
                    case 93:
                        b bVar56 = aVar.f2130d;
                        bVar56.M = obtainStyledAttributes.getDimensionPixelSize(index2, bVar56.M);
                        break;
                    case 94:
                        b bVar57 = aVar.f2130d;
                        bVar57.T = obtainStyledAttributes.getDimensionPixelSize(index2, bVar57.T);
                        break;
                    case 95:
                        g(aVar.f2130d, obtainStyledAttributes, index2, 0);
                        break;
                    case 96:
                        g(aVar.f2130d, obtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        b bVar58 = aVar.f2130d;
                        bVar58.p0 = obtainStyledAttributes.getInt(index2, bVar58.p0);
                        break;
                }
            }
            b bVar59 = aVar.f2130d;
            if (bVar59.k0 != null) {
                bVar59.j0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public void f(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    a e2 = e(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        e2.f2130d.a = true;
                    }
                    this.c.put(Integer.valueOf(e2.a), e2);
                    continue;
                }
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        } catch (XmlPullParserException e4) {
            e4.printStackTrace();
        }
    }
}
