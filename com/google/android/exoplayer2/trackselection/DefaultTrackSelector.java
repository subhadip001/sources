package com.google.android.exoplayer2.trackselection;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.gms.common.api.Api;
import f.h.b.b.d2.d;
import f.h.b.b.d2.g;
import f.h.b.b.d2.i;
import f.h.b.b.g2.b0;
import f.h.c.b.k0;
import f.h.c.b.l0;
import f.h.c.b.m;
import f.h.c.b.m0;
import f.h.c.b.p0;
import f.h.c.b.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class DefaultTrackSelector extends i {

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f882e = new int[0];

    /* renamed from: f  reason: collision with root package name */
    public static final l0<Integer> f883f = l0.a(new Comparator() { // from class: f.h.b.b.d2.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int[] iArr = DefaultTrackSelector.f882e;
            if (num.intValue() == -1) {
                return num2.intValue() == -1 ? 0 : -1;
            } else if (num2.intValue() == -1) {
                return 1;
            } else {
                return num.intValue() - num2.intValue();
            }
        }
    });

    /* renamed from: g  reason: collision with root package name */
    public static final l0<Integer> f884g = l0.a(new Comparator() { // from class: f.h.b.b.d2.b
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int[] iArr = DefaultTrackSelector.f882e;
            return 0;
        }
    });
    public final g.b c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference<Parameters> f885d;

    /* loaded from: classes.dex */
    public static final class SelectionOverride implements Parcelable {
        public static final Parcelable.Creator<SelectionOverride> CREATOR = new a();

        /* renamed from: f  reason: collision with root package name */
        public final int f887f;

        /* renamed from: g  reason: collision with root package name */
        public final int[] f888g;

        /* renamed from: h  reason: collision with root package name */
        public final int f889h;

        /* renamed from: i  reason: collision with root package name */
        public final int f890i;

        /* renamed from: j  reason: collision with root package name */
        public final int f891j;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<SelectionOverride> {
            @Override // android.os.Parcelable.Creator
            public SelectionOverride createFromParcel(Parcel parcel) {
                return new SelectionOverride(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public SelectionOverride[] newArray(int i2) {
                return new SelectionOverride[i2];
            }
        }

        public SelectionOverride(Parcel parcel) {
            this.f887f = parcel.readInt();
            int readByte = parcel.readByte();
            this.f889h = readByte;
            int[] iArr = new int[readByte];
            this.f888g = iArr;
            parcel.readIntArray(iArr);
            this.f890i = parcel.readInt();
            this.f891j = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SelectionOverride.class != obj.getClass()) {
                return false;
            }
            SelectionOverride selectionOverride = (SelectionOverride) obj;
            return this.f887f == selectionOverride.f887f && Arrays.equals(this.f888g, selectionOverride.f888g) && this.f890i == selectionOverride.f890i && this.f891j == selectionOverride.f891j;
        }

        public int hashCode() {
            return ((((Arrays.hashCode(this.f888g) + (this.f887f * 31)) * 31) + this.f890i) * 31) + this.f891j;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f887f);
            parcel.writeInt(this.f888g.length);
            parcel.writeIntArray(this.f888g);
            parcel.writeInt(this.f890i);
            parcel.writeInt(this.f891j);
        }
    }

    /* loaded from: classes.dex */
    public static final class a implements Comparable<a> {

        /* renamed from: f  reason: collision with root package name */
        public final boolean f892f;

        /* renamed from: g  reason: collision with root package name */
        public final String f893g;

        /* renamed from: h  reason: collision with root package name */
        public final Parameters f894h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f895i;

        /* renamed from: j  reason: collision with root package name */
        public final int f896j;

        /* renamed from: k  reason: collision with root package name */
        public final int f897k;

        /* renamed from: l  reason: collision with root package name */
        public final int f898l;

        /* renamed from: m  reason: collision with root package name */
        public final int f899m;
        public final int n;
        public final boolean o;
        public final int p;
        public final int q;
        public final int r;
        public final int s;

        public a(Format format, Parameters parameters, int i2) {
            int i3;
            int i4;
            String locale;
            String[] strArr;
            int i5;
            this.f894h = parameters;
            this.f893g = DefaultTrackSelector.g(format.f709h);
            int i6 = 0;
            this.f895i = DefaultTrackSelector.e(i2, false);
            int i7 = 0;
            while (true) {
                int size = parameters.f928f.size();
                i3 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                if (i7 >= size) {
                    i7 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    i4 = 0;
                    break;
                }
                i4 = DefaultTrackSelector.c(format, parameters.f928f.get(i7), false);
                if (i4 > 0) {
                    break;
                }
                i7++;
            }
            this.f897k = i7;
            this.f896j = i4;
            this.f898l = Integer.bitCount(format.f711j & parameters.f929g);
            this.o = (format.f710i & 1) != 0;
            int i8 = format.D;
            this.p = i8;
            this.q = format.E;
            int i9 = format.f714m;
            this.r = i9;
            this.f892f = (i9 == -1 || i9 <= parameters.C) && (i8 == -1 || i8 <= parameters.B);
            int i10 = b0.a;
            Configuration configuration = Resources.getSystem().getConfiguration();
            int i11 = b0.a;
            if (i11 >= 24) {
                strArr = b0.G(configuration.getLocales().toLanguageTags(), ",");
            } else {
                String[] strArr2 = new String[1];
                Locale locale2 = configuration.locale;
                if (i11 >= 21) {
                    locale = locale2.toLanguageTag();
                } else {
                    locale = locale2.toString();
                }
                strArr2[0] = locale;
                strArr = strArr2;
            }
            for (int i12 = 0; i12 < strArr.length; i12++) {
                strArr[i12] = b0.B(strArr[i12]);
            }
            int i13 = 0;
            while (true) {
                if (i13 >= strArr.length) {
                    i13 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    i5 = 0;
                    break;
                }
                i5 = DefaultTrackSelector.c(format, strArr[i13], false);
                if (i5 > 0) {
                    break;
                }
                i13++;
            }
            this.f899m = i13;
            this.n = i5;
            while (true) {
                if (i6 >= parameters.H.size()) {
                    break;
                }
                String str = format.q;
                if (str != null && str.equals(parameters.H.get(i6))) {
                    i3 = i6;
                    break;
                }
                i6++;
            }
            this.s = i3;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(a aVar) {
            Object b;
            l0<Integer> l0Var;
            if (this.f892f && this.f895i) {
                b = DefaultTrackSelector.f883f;
            } else {
                b = DefaultTrackSelector.f883f.b();
            }
            m c = m.a.c(this.f895i, aVar.f895i);
            Integer valueOf = Integer.valueOf(this.f897k);
            Integer valueOf2 = Integer.valueOf(aVar.f897k);
            p0 p0Var = p0.f5980f;
            m b2 = c.b(valueOf, valueOf2, p0Var).a(this.f896j, aVar.f896j).a(this.f898l, aVar.f898l).c(this.f892f, aVar.f892f).b(Integer.valueOf(this.s), Integer.valueOf(aVar.s), p0Var);
            Integer valueOf3 = Integer.valueOf(this.r);
            Integer valueOf4 = Integer.valueOf(aVar.r);
            if (this.f894h.I) {
                l0Var = DefaultTrackSelector.f883f.b();
            } else {
                l0Var = DefaultTrackSelector.f884g;
            }
            m b3 = b2.b(valueOf3, valueOf4, l0Var).c(this.o, aVar.o).b(Integer.valueOf(this.f899m), Integer.valueOf(aVar.f899m), p0Var).a(this.n, aVar.n).b(Integer.valueOf(this.p), Integer.valueOf(aVar.p), b).b(Integer.valueOf(this.q), Integer.valueOf(aVar.q), b);
            Integer valueOf5 = Integer.valueOf(this.r);
            Integer valueOf6 = Integer.valueOf(aVar.r);
            if (!b0.a(this.f893g, aVar.f893g)) {
                b = DefaultTrackSelector.f884g;
            }
            return b3.b(valueOf5, valueOf6, b).e();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Comparable<b> {

        /* renamed from: f  reason: collision with root package name */
        public final boolean f900f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f901g;

        public b(Format format, int i2) {
            this.f900f = (format.f710i & 1) != 0;
            this.f901g = DefaultTrackSelector.e(i2, false);
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(b bVar) {
            return m.a.c(this.f901g, bVar.f901g).c(this.f900f, bVar.f900f).e();
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements Comparable<d> {

        /* renamed from: f  reason: collision with root package name */
        public final boolean f912f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f913g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f914h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f915i;

        /* renamed from: j  reason: collision with root package name */
        public final int f916j;

        /* renamed from: k  reason: collision with root package name */
        public final int f917k;

        /* renamed from: l  reason: collision with root package name */
        public final int f918l;

        /* renamed from: m  reason: collision with root package name */
        public final int f919m;
        public final boolean n;

        public d(Format format, Parameters parameters, int i2, String str) {
            q<String> qVar;
            int i3;
            boolean z = false;
            this.f913g = DefaultTrackSelector.e(i2, false);
            int i4 = format.f710i & (~parameters.f933k);
            this.f914h = (i4 & 1) != 0;
            this.f915i = (i4 & 2) != 0;
            int i5 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            if (parameters.f930h.isEmpty()) {
                qVar = q.r("");
            } else {
                qVar = parameters.f930h;
            }
            int i6 = 0;
            while (true) {
                if (i6 >= qVar.size()) {
                    i3 = 0;
                    break;
                }
                i3 = DefaultTrackSelector.c(format, qVar.get(i6), parameters.f932j);
                if (i3 > 0) {
                    i5 = i6;
                    break;
                }
                i6++;
            }
            this.f916j = i5;
            this.f917k = i3;
            int bitCount = Integer.bitCount(format.f711j & parameters.f931i);
            this.f918l = bitCount;
            this.n = (format.f711j & 1088) != 0;
            int c = DefaultTrackSelector.c(format, str, DefaultTrackSelector.g(str) == null);
            this.f919m = c;
            if (i3 > 0 || ((parameters.f930h.isEmpty() && bitCount > 0) || this.f914h || (this.f915i && c > 0))) {
                z = true;
            }
            this.f912f = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [f.h.c.b.p0, java.util.Comparator] */
        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(d dVar) {
            m c = m.a.c(this.f913g, dVar.f913g);
            Integer valueOf = Integer.valueOf(this.f916j);
            Integer valueOf2 = Integer.valueOf(dVar.f916j);
            k0 k0Var = k0.f5951f;
            ?? r4 = p0.f5980f;
            m c2 = c.b(valueOf, valueOf2, r4).a(this.f917k, dVar.f917k).a(this.f918l, dVar.f918l).c(this.f914h, dVar.f914h);
            Boolean valueOf3 = Boolean.valueOf(this.f915i);
            Boolean valueOf4 = Boolean.valueOf(dVar.f915i);
            if (this.f917k != 0) {
                k0Var = r4;
            }
            m a = c2.b(valueOf3, valueOf4, k0Var).a(this.f919m, dVar.f919m);
            if (this.f918l == 0) {
                a = a.d(this.n, dVar.n);
            }
            return a.e();
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements Comparable<e> {

        /* renamed from: f  reason: collision with root package name */
        public final boolean f920f;

        /* renamed from: g  reason: collision with root package name */
        public final Parameters f921g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f922h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f923i;

        /* renamed from: j  reason: collision with root package name */
        public final int f924j;

        /* renamed from: k  reason: collision with root package name */
        public final int f925k;

        /* renamed from: l  reason: collision with root package name */
        public final int f926l;

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
            if (r10 < r8.s) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x005b, code lost:
            if (r10 < r8.t) goto L59;
         */
        /* JADX WARN: Removed duplicated region for block: B:34:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0098 A[EDGE_INSN: B:59:0x0098->B:57:0x0098 ?: BREAK  , SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public e(com.google.android.exoplayer2.Format r7, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters r8, int r9, boolean r10) {
            /*
                r6 = this;
                r6.<init>()
                r6.f921g = r8
                r0 = 0
                r1 = 1
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                r3 = -1
                if (r10 == 0) goto L33
                int r4 = r7.v
                if (r4 == r3) goto L14
                int r5 = r8.f886m
                if (r4 > r5) goto L33
            L14:
                int r4 = r7.w
                if (r4 == r3) goto L1c
                int r5 = r8.n
                if (r4 > r5) goto L33
            L1c:
                float r4 = r7.x
                int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r5 == 0) goto L29
                int r5 = r8.o
                float r5 = (float) r5
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 > 0) goto L33
            L29:
                int r4 = r7.f714m
                if (r4 == r3) goto L31
                int r5 = r8.p
                if (r4 > r5) goto L33
            L31:
                r4 = 1
                goto L34
            L33:
                r4 = 0
            L34:
                r6.f920f = r4
                if (r10 == 0) goto L5e
                int r10 = r7.v
                if (r10 == r3) goto L40
                int r4 = r8.q
                if (r10 < r4) goto L5e
            L40:
                int r10 = r7.w
                if (r10 == r3) goto L48
                int r4 = r8.r
                if (r10 < r4) goto L5e
            L48:
                float r10 = r7.x
                int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r2 == 0) goto L55
                int r2 = r8.s
                float r2 = (float) r2
                int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r10 < 0) goto L5e
            L55:
                int r10 = r7.f714m
                if (r10 == r3) goto L5f
                int r2 = r8.t
                if (r10 < r2) goto L5e
                goto L5f
            L5e:
                r1 = 0
            L5f:
                r6.f922h = r1
                boolean r9 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.e(r9, r0)
                r6.f923i = r9
                int r9 = r7.f714m
                r6.f924j = r9
                int r9 = r7.v
                if (r9 == r3) goto L76
                int r10 = r7.w
                if (r10 != r3) goto L74
                goto L76
            L74:
                int r3 = r9 * r10
            L76:
                r6.f925k = r3
                r9 = 2147483647(0x7fffffff, float:NaN)
            L7b:
                f.h.c.b.q<java.lang.String> r10 = r8.A
                int r10 = r10.size()
                if (r0 >= r10) goto L98
                java.lang.String r10 = r7.q
                if (r10 == 0) goto L95
                f.h.c.b.q<java.lang.String> r1 = r8.A
                java.lang.Object r1 = r1.get(r0)
                boolean r10 = r10.equals(r1)
                if (r10 == 0) goto L95
                r9 = r0
                goto L98
            L95:
                int r0 = r0 + 1
                goto L7b
            L98:
                r6.f926l = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.e.<init>(com.google.android.exoplayer2.Format, com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters, int, boolean):void");
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(e eVar) {
            Object b;
            l0<Integer> l0Var;
            if (this.f920f && this.f923i) {
                b = DefaultTrackSelector.f883f;
            } else {
                b = DefaultTrackSelector.f883f.b();
            }
            m b2 = m.a.c(this.f923i, eVar.f923i).c(this.f920f, eVar.f920f).c(this.f922h, eVar.f922h).b(Integer.valueOf(this.f926l), Integer.valueOf(eVar.f926l), p0.f5980f);
            Integer valueOf = Integer.valueOf(this.f924j);
            Integer valueOf2 = Integer.valueOf(eVar.f924j);
            if (this.f921g.I) {
                l0Var = DefaultTrackSelector.f883f.b();
            } else {
                l0Var = DefaultTrackSelector.f884g;
            }
            return b2.b(valueOf, valueOf2, l0Var).b(Integer.valueOf(this.f925k), Integer.valueOf(eVar.f925k), b).b(Integer.valueOf(this.f924j), Integer.valueOf(eVar.f924j), b).e();
        }
    }

    @Deprecated
    public DefaultTrackSelector() {
        Parameters parameters = Parameters.P;
        this.c = new d.b();
        this.f885d = new AtomicReference<>(parameters);
    }

    public static int c(Format format, String str, boolean z) {
        if (TextUtils.isEmpty(str) || !str.equals(format.f709h)) {
            String g2 = g(str);
            String g3 = g(format.f709h);
            if (g3 == null || g2 == null) {
                return (z && g3 == null) ? 1 : 0;
            } else if (g3.startsWith(g2) || g2.startsWith(g3)) {
                return 3;
            } else {
                int i2 = b0.a;
                return g3.split("-", 2)[0].equals(g2.split("-", 2)[0]) ? 2 : 0;
            }
        }
        return 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<java.lang.Integer> d(com.google.android.exoplayer2.source.TrackGroup r12, int r13, int r14, boolean r15) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r12.f875f
            r0.<init>(r1)
            r1 = 0
            r2 = 0
        L9:
            int r3 = r12.f875f
            if (r2 >= r3) goto L17
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.add(r3)
            int r2 = r2 + 1
            goto L9
        L17:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r2) goto Laf
            if (r14 != r2) goto L20
            goto Laf
        L20:
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
        L24:
            int r5 = r12.f875f
            r6 = 1
            if (r3 >= r5) goto L80
            com.google.android.exoplayer2.Format[] r5 = r12.f876g
            r5 = r5[r3]
            int r7 = r5.v
            if (r7 <= 0) goto L7d
            int r8 = r5.w
            if (r8 <= 0) goto L7d
            if (r15 == 0) goto L45
            if (r7 <= r8) goto L3b
            r9 = 1
            goto L3c
        L3b:
            r9 = 0
        L3c:
            if (r13 <= r14) goto L3f
            goto L40
        L3f:
            r6 = 0
        L40:
            if (r9 == r6) goto L45
            r6 = r13
            r9 = r14
            goto L47
        L45:
            r9 = r13
            r6 = r14
        L47:
            int r10 = r7 * r6
            int r11 = r8 * r9
            if (r10 < r11) goto L57
            android.graphics.Point r6 = new android.graphics.Point
            int r7 = f.h.b.b.g2.b0.f(r11, r7)
            r6.<init>(r9, r7)
            goto L61
        L57:
            android.graphics.Point r7 = new android.graphics.Point
            int r8 = f.h.b.b.g2.b0.f(r10, r8)
            r7.<init>(r8, r6)
            r6 = r7
        L61:
            int r7 = r5.v
            int r5 = r5.w
            int r8 = r7 * r5
            int r9 = r6.x
            float r9 = (float) r9
            r10 = 1065017672(0x3f7ae148, float:0.98)
            float r9 = r9 * r10
            int r9 = (int) r9
            if (r7 < r9) goto L7d
            int r6 = r6.y
            float r6 = (float) r6
            float r6 = r6 * r10
            int r6 = (int) r6
            if (r5 < r6) goto L7d
            if (r8 >= r4) goto L7d
            r4 = r8
        L7d:
            int r3 = r3 + 1
            goto L24
        L80:
            if (r4 == r2) goto Laf
            int r13 = r0.size()
            int r13 = r13 - r6
        L87:
            if (r13 < 0) goto Laf
            java.lang.Object r14 = r0.get(r13)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            com.google.android.exoplayer2.Format[] r15 = r12.f876g
            r14 = r15[r14]
            int r15 = r14.v
            r1 = -1
            if (r15 == r1) goto La4
            int r14 = r14.w
            if (r14 != r1) goto La1
            goto La4
        La1:
            int r15 = r15 * r14
            goto La5
        La4:
            r15 = -1
        La5:
            if (r15 == r1) goto La9
            if (r15 <= r4) goto Lac
        La9:
            r0.remove(r13)
        Lac:
            int r13 = r13 + (-1)
            goto L87
        Laf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.d(com.google.android.exoplayer2.source.TrackGroup, int, int, boolean):java.util.List");
    }

    public static boolean e(int i2, boolean z) {
        int i3 = i2 & 7;
        return i3 == 4 || (z && i3 == 3);
    }

    public static boolean f(Format format, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        if ((format.f711j & 16384) == 0 && e(i2, false) && (i2 & i3) != 0) {
            if (str == null || b0.a(format.q, str)) {
                int i12 = format.v;
                if (i12 == -1 || (i8 <= i12 && i12 <= i4)) {
                    int i13 = format.w;
                    if (i13 == -1 || (i9 <= i13 && i13 <= i5)) {
                        float f2 = format.x;
                        if (f2 == -1.0f || (i10 <= f2 && f2 <= i6)) {
                            int i14 = format.f714m;
                            return i14 == -1 || (i11 <= i14 && i14 <= i7);
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static String g(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public DefaultTrackSelector(Context context) {
        d.b bVar = new d.b();
        Parameters parameters = Parameters.P;
        Parameters b2 = new c(context).b();
        this.c = bVar;
        this.f885d = new AtomicReference<>(b2);
    }

    /* loaded from: classes.dex */
    public static final class Parameters extends TrackSelectionParameters {
        public final q<String> A;
        public final int B;
        public final int C;
        public final boolean D;
        public final boolean E;
        public final boolean F;
        public final boolean G;
        public final q<String> H;
        public final boolean I;
        public final boolean J;
        public final boolean K;
        public final boolean L;
        public final boolean M;
        public final SparseArray<Map<TrackGroupArray, SelectionOverride>> N;
        public final SparseBooleanArray O;

        /* renamed from: m  reason: collision with root package name */
        public final int f886m;
        public final int n;
        public final int o;
        public final int p;
        public final int q;
        public final int r;
        public final int s;
        public final int t;
        public final boolean u;
        public final boolean v;
        public final boolean w;
        public final int x;
        public final int y;
        public final boolean z;
        public static final Parameters P = new c().b();
        public static final Parcelable.Creator<Parameters> CREATOR = new a();

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<Parameters> {
            @Override // android.os.Parcelable.Creator
            public Parameters createFromParcel(Parcel parcel) {
                return new Parameters(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public Parameters[] newArray(int i2) {
                return new Parameters[i2];
            }
        }

        public Parameters(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, boolean z2, boolean z3, int i10, int i11, boolean z4, q<String> qVar, q<String> qVar2, int i12, int i13, int i14, boolean z5, boolean z6, boolean z7, boolean z8, q<String> qVar3, q<String> qVar4, int i15, boolean z9, int i16, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseBooleanArray sparseBooleanArray) {
            super(qVar2, i12, qVar4, i15, z9, i16);
            this.f886m = i2;
            this.n = i3;
            this.o = i4;
            this.p = i5;
            this.q = i6;
            this.r = i7;
            this.s = i8;
            this.t = i9;
            this.u = z;
            this.v = z2;
            this.w = z3;
            this.x = i10;
            this.y = i11;
            this.z = z4;
            this.A = qVar;
            this.B = i13;
            this.C = i14;
            this.D = z5;
            this.E = z6;
            this.F = z7;
            this.G = z8;
            this.H = qVar3;
            this.I = z10;
            this.J = z11;
            this.K = z12;
            this.L = z13;
            this.M = z14;
            this.N = sparseArray;
            this.O = sparseBooleanArray;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:106:0x00f6 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:77:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0150 A[LOOP:0: B:81:0x00f9->B:98:0x0150, LOOP_END] */
        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean equals(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 346
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.equals(java.lang.Object):boolean");
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public int hashCode() {
            int hashCode = this.A.hashCode();
            return ((((((((((this.H.hashCode() + ((((((((((((((hashCode + (((((((((((((((((((((((((((((super.hashCode() * 31) + this.f886m) * 31) + this.n) * 31) + this.o) * 31) + this.p) * 31) + this.q) * 31) + this.r) * 31) + this.s) * 31) + this.t) * 31) + (this.u ? 1 : 0)) * 31) + (this.v ? 1 : 0)) * 31) + (this.w ? 1 : 0)) * 31) + (this.z ? 1 : 0)) * 31) + this.x) * 31) + this.y) * 31)) * 31) + this.B) * 31) + this.C) * 31) + (this.D ? 1 : 0)) * 31) + (this.E ? 1 : 0)) * 31) + (this.F ? 1 : 0)) * 31) + (this.G ? 1 : 0)) * 31)) * 31) + (this.I ? 1 : 0)) * 31) + (this.J ? 1 : 0)) * 31) + (this.K ? 1 : 0)) * 31) + (this.L ? 1 : 0)) * 31) + (this.M ? 1 : 0);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f886m);
            parcel.writeInt(this.n);
            parcel.writeInt(this.o);
            parcel.writeInt(this.p);
            parcel.writeInt(this.q);
            parcel.writeInt(this.r);
            parcel.writeInt(this.s);
            parcel.writeInt(this.t);
            boolean z = this.u;
            int i3 = b0.a;
            parcel.writeInt(z ? 1 : 0);
            parcel.writeInt(this.v ? 1 : 0);
            parcel.writeInt(this.w ? 1 : 0);
            parcel.writeInt(this.x);
            parcel.writeInt(this.y);
            parcel.writeInt(this.z ? 1 : 0);
            parcel.writeList(this.A);
            parcel.writeInt(this.B);
            parcel.writeInt(this.C);
            parcel.writeInt(this.D ? 1 : 0);
            parcel.writeInt(this.E ? 1 : 0);
            parcel.writeInt(this.F ? 1 : 0);
            parcel.writeInt(this.G ? 1 : 0);
            parcel.writeList(this.H);
            parcel.writeInt(this.I ? 1 : 0);
            parcel.writeInt(this.J ? 1 : 0);
            parcel.writeInt(this.K ? 1 : 0);
            parcel.writeInt(this.L ? 1 : 0);
            parcel.writeInt(this.M ? 1 : 0);
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray = this.N;
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i4 = 0; i4 < size; i4++) {
                int keyAt = sparseArray.keyAt(i4);
                Map<TrackGroupArray, SelectionOverride> valueAt = sparseArray.valueAt(i4);
                int size2 = valueAt.size();
                parcel.writeInt(keyAt);
                parcel.writeInt(size2);
                for (Map.Entry<TrackGroupArray, SelectionOverride> entry : valueAt.entrySet()) {
                    parcel.writeParcelable(entry.getKey(), 0);
                    parcel.writeParcelable(entry.getValue(), 0);
                }
            }
            parcel.writeSparseBooleanArray(this.O);
        }

        public Parameters(Parcel parcel) {
            super(parcel);
            this.f886m = parcel.readInt();
            this.n = parcel.readInt();
            this.o = parcel.readInt();
            this.p = parcel.readInt();
            this.q = parcel.readInt();
            this.r = parcel.readInt();
            this.s = parcel.readInt();
            this.t = parcel.readInt();
            int i2 = b0.a;
            this.u = parcel.readInt() != 0;
            this.v = parcel.readInt() != 0;
            this.w = parcel.readInt() != 0;
            this.x = parcel.readInt();
            this.y = parcel.readInt();
            this.z = parcel.readInt() != 0;
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, null);
            this.A = q.m(arrayList);
            this.B = parcel.readInt();
            this.C = parcel.readInt();
            this.D = parcel.readInt() != 0;
            this.E = parcel.readInt() != 0;
            this.F = parcel.readInt() != 0;
            this.G = parcel.readInt() != 0;
            ArrayList arrayList2 = new ArrayList();
            parcel.readList(arrayList2, null);
            this.H = q.m(arrayList2);
            this.I = parcel.readInt() != 0;
            this.J = parcel.readInt() != 0;
            this.K = parcel.readInt() != 0;
            this.L = parcel.readInt() != 0;
            this.M = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray = new SparseArray<>(readInt);
            for (int i3 = 0; i3 < readInt; i3++) {
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                HashMap hashMap = new HashMap(readInt3);
                for (int i4 = 0; i4 < readInt3; i4++) {
                    TrackGroupArray trackGroupArray = (TrackGroupArray) parcel.readParcelable(TrackGroupArray.class.getClassLoader());
                    Objects.requireNonNull(trackGroupArray);
                    hashMap.put(trackGroupArray, (SelectionOverride) parcel.readParcelable(SelectionOverride.class.getClassLoader()));
                }
                sparseArray.put(readInt2, hashMap);
            }
            this.N = sparseArray;
            this.O = parcel.readSparseBooleanArray();
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends TrackSelectionParameters.b {

        /* renamed from: d  reason: collision with root package name */
        public int f902d;

        /* renamed from: e  reason: collision with root package name */
        public int f903e;

        /* renamed from: f  reason: collision with root package name */
        public int f904f;

        /* renamed from: g  reason: collision with root package name */
        public int f905g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f906h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f907i;

        /* renamed from: j  reason: collision with root package name */
        public int f908j;

        /* renamed from: k  reason: collision with root package name */
        public int f909k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f910l;

        /* renamed from: m  reason: collision with root package name */
        public q<String> f911m;
        public int n;
        public int o;
        public boolean p;
        public q<String> q;
        public boolean r;
        public boolean s;
        public final SparseArray<Map<TrackGroupArray, SelectionOverride>> t;
        public final SparseBooleanArray u;

        public c(Context context) {
            Point point;
            String u;
            a(context);
            c();
            this.t = new SparseArray<>();
            this.u = new SparseBooleanArray();
            int i2 = b0.a;
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            Objects.requireNonNull(windowManager);
            Display defaultDisplay = windowManager.getDefaultDisplay();
            int i3 = b0.a;
            if (i3 <= 29 && defaultDisplay.getDisplayId() == 0 && b0.A(context)) {
                if ("Sony".equals(b0.c) && b0.f4268d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                    point = new Point(3840, 2160);
                } else {
                    if (i3 < 28) {
                        u = b0.u("sys.display-size");
                    } else {
                        u = b0.u("vendor.display-size");
                    }
                    if (!TextUtils.isEmpty(u)) {
                        try {
                            String[] G = b0.G(u.trim(), "x");
                            if (G.length == 2) {
                                int parseInt = Integer.parseInt(G[0]);
                                int parseInt2 = Integer.parseInt(G[1]);
                                if (parseInt > 0 && parseInt2 > 0) {
                                    point = new Point(parseInt, parseInt2);
                                }
                            }
                        } catch (NumberFormatException unused) {
                        }
                        String valueOf = String.valueOf(u);
                        Log.e("Util", valueOf.length() != 0 ? "Invalid display size: ".concat(valueOf) : new String("Invalid display size: "));
                    }
                }
                int i4 = point.x;
                int i5 = point.y;
                this.f908j = i4;
                this.f909k = i5;
                this.f910l = true;
            }
            point = new Point();
            int i6 = b0.a;
            if (i6 >= 23) {
                Display.Mode mode = defaultDisplay.getMode();
                point.x = mode.getPhysicalWidth();
                point.y = mode.getPhysicalHeight();
            } else if (i6 >= 17) {
                defaultDisplay.getRealSize(point);
            } else {
                defaultDisplay.getSize(point);
            }
            int i42 = point.x;
            int i52 = point.y;
            this.f908j = i42;
            this.f909k = i52;
            this.f910l = true;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.b
        public TrackSelectionParameters.b a(Context context) {
            super.a(context);
            return this;
        }

        public Parameters b() {
            return new Parameters(this.f902d, this.f903e, this.f904f, this.f905g, 0, 0, 0, 0, this.f906h, false, this.f907i, this.f908j, this.f909k, this.f910l, this.f911m, this.a, 0, this.n, this.o, this.p, false, false, false, this.q, this.b, this.c, false, 0, false, false, this.r, false, this.s, this.t, this.u);
        }

        public final void c() {
            this.f902d = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f903e = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f904f = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f905g = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f906h = true;
            this.f907i = true;
            this.f908j = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f909k = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f910l = true;
            f.h.c.b.a<Object> aVar = q.f5981g;
            q qVar = m0.f5954j;
            this.f911m = qVar;
            this.n = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.o = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.p = true;
            this.q = qVar;
            this.r = true;
            this.s = true;
        }

        @Deprecated
        public c() {
            c();
            this.t = new SparseArray<>();
            this.u = new SparseBooleanArray();
        }
    }
}
