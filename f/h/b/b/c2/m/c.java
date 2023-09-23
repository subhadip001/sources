package f.h.b.b.c2.m;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import com.google.logging.type.LogSeverity;
import f.h.b.b.c2.j;
import f.h.b.b.g2.b0;
import f.h.b.b.g2.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: Cea608Decoder.java */
/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: h  reason: collision with root package name */
    public final int f3947h;

    /* renamed from: i  reason: collision with root package name */
    public final int f3948i;

    /* renamed from: j  reason: collision with root package name */
    public final int f3949j;

    /* renamed from: k  reason: collision with root package name */
    public final long f3950k;
    public List<f.h.b.b.c2.c> n;
    public List<f.h.b.b.c2.c> o;
    public int p;
    public int q;
    public boolean r;
    public boolean s;
    public byte t;
    public byte u;
    public boolean w;
    public long x;
    public static final int[] y = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] z = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, LogSeverity.INFO_VALUE, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: g  reason: collision with root package name */
    public final t f3946g = new t();

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList<a> f3951l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public a f3952m = new a(0, 4);
    public int v = 0;

    /* compiled from: Cea608Decoder.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final List<C0103a> a = new ArrayList();
        public final List<SpannableString> b = new ArrayList();
        public final StringBuilder c = new StringBuilder();

        /* renamed from: d  reason: collision with root package name */
        public int f3953d;

        /* renamed from: e  reason: collision with root package name */
        public int f3954e;

        /* renamed from: f  reason: collision with root package name */
        public int f3955f;

        /* renamed from: g  reason: collision with root package name */
        public int f3956g;

        /* renamed from: h  reason: collision with root package name */
        public int f3957h;

        /* compiled from: Cea608Decoder.java */
        /* renamed from: f.h.b.b.c2.m.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0103a {
            public final int a;
            public final boolean b;
            public int c;

            public C0103a(int i2, boolean z, int i3) {
                this.a = i2;
                this.b = z;
                this.c = i3;
            }
        }

        public a(int i2, int i3) {
            f(i2);
            this.f3957h = i3;
        }

        public void a(char c) {
            if (this.c.length() < 32) {
                this.c.append(c);
            }
        }

        public void b() {
            int length = this.c.length();
            if (length > 0) {
                this.c.delete(length - 1, length);
                for (int size = this.a.size() - 1; size >= 0; size--) {
                    C0103a c0103a = this.a.get(size);
                    int i2 = c0103a.c;
                    if (i2 != length) {
                        return;
                    }
                    c0103a.c = i2 - 1;
                }
            }
        }

        public f.h.b.b.c2.c c(int i2) {
            int i3;
            float f2;
            int i4 = this.f3954e + this.f3955f;
            int i5 = 32 - i4;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i6 = 0; i6 < this.b.size(); i6++) {
                SpannableString spannableString = this.b.get(i6);
                int i7 = b0.a;
                if (spannableString.length() > i5) {
                    spannableString = spannableString.subSequence(0, i5);
                }
                spannableStringBuilder.append(spannableString);
                spannableStringBuilder.append('\n');
            }
            SpannableString d2 = d();
            int i8 = b0.a;
            int length = d2.length();
            CharSequence charSequence = d2;
            if (length > i5) {
                charSequence = d2.subSequence(0, i5);
            }
            spannableStringBuilder.append(charSequence);
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length2 = i5 - spannableStringBuilder.length();
            int i9 = i4 - length2;
            if (i2 != Integer.MIN_VALUE) {
                i3 = i2;
            } else if (this.f3956g != 2 || (Math.abs(i9) >= 3 && length2 >= 0)) {
                i3 = (this.f3956g != 2 || i9 <= 0) ? 0 : 2;
            } else {
                i3 = 1;
            }
            if (i3 != 1) {
                if (i3 == 2) {
                    i4 = 32 - length2;
                }
                f2 = ((i4 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f2 = 0.5f;
            }
            int i10 = this.f3953d;
            if (i10 > 7) {
                i10 = (i10 - 15) - 2;
            } else if (this.f3956g == 1) {
                i10 -= this.f3957h - 1;
            }
            return new f.h.b.b.c2.c(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, i10, 1, Integer.MIN_VALUE, f2, i3, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, null);
        }

        public final SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.c);
            int length = spannableStringBuilder.length();
            int i2 = 0;
            int i3 = -1;
            int i4 = -1;
            int i5 = 0;
            int i6 = -1;
            boolean z = false;
            int i7 = -1;
            while (i2 < this.a.size()) {
                C0103a c0103a = this.a.get(i2);
                boolean z2 = c0103a.b;
                int i8 = c0103a.a;
                if (i8 != 8) {
                    boolean z3 = i8 == 7;
                    if (i8 != 7) {
                        i7 = c.A[i8];
                    }
                    z = z3;
                }
                int i9 = c0103a.c;
                i2++;
                if (i9 != (i2 < this.a.size() ? this.a.get(i2).c : length)) {
                    if (i3 != -1 && !z2) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i9, 33);
                        i3 = -1;
                    } else if (i3 == -1 && z2) {
                        i3 = i9;
                    }
                    if (i4 != -1 && !z) {
                        spannableStringBuilder.setSpan(new StyleSpan(2), i4, i9, 33);
                        i4 = -1;
                    } else if (i4 == -1 && z) {
                        i4 = i9;
                    }
                    if (i7 != i6) {
                        if (i6 != -1) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(i6), i5, i9, 33);
                        }
                        i5 = i9;
                        i6 = i7;
                    }
                }
            }
            if (i3 != -1 && i3 != length) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, length, 33);
            }
            if (i4 != -1 && i4 != length) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i4, length, 33);
            }
            if (i5 != length && i6 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i6), i5, length, 33);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public boolean e() {
            return this.a.isEmpty() && this.b.isEmpty() && this.c.length() == 0;
        }

        public void f(int i2) {
            this.f3956g = i2;
            this.a.clear();
            this.b.clear();
            this.c.setLength(0);
            this.f3953d = 15;
            this.f3954e = 0;
            this.f3955f = 0;
        }
    }

    public c(String str, int i2, long j2) {
        this.f3950k = j2 > 0 ? j2 * 1000 : -9223372036854775807L;
        this.f3947h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i2 == 1) {
            this.f3949j = 0;
            this.f3948i = 0;
        } else if (i2 == 2) {
            this.f3949j = 1;
            this.f3948i = 0;
        } else if (i2 == 3) {
            this.f3949j = 0;
            this.f3948i = 1;
        } else if (i2 != 4) {
            Log.w("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f3949j = 0;
            this.f3948i = 0;
        } else {
            this.f3949j = 1;
            this.f3948i = 1;
        }
        l(0);
        k();
        this.w = true;
        this.x = -9223372036854775807L;
    }

    @Override // f.h.b.b.c2.m.e
    public f.h.b.b.c2.f e() {
        List<f.h.b.b.c2.c> list = this.n;
        this.o = list;
        Objects.requireNonNull(list);
        return new f(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:215:0x008f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    @Override // f.h.b.b.c2.m.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(f.h.b.b.c2.i r14) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.c2.m.c.f(f.h.b.b.c2.i):void");
    }

    @Override // f.h.b.b.c2.m.e, f.h.b.b.v1.c
    public void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        l(0);
        m(4);
        k();
        this.r = false;
        this.s = false;
        this.t = (byte) 0;
        this.u = (byte) 0;
        this.v = 0;
        this.w = true;
        this.x = -9223372036854775807L;
    }

    @Override // f.h.b.b.c2.m.e, f.h.b.b.v1.c
    /* renamed from: g */
    public j b() {
        j pollFirst;
        j b = super.b();
        if (b != null) {
            return b;
        }
        long j2 = this.f3950k;
        boolean z2 = false;
        if (j2 != -9223372036854775807L) {
            long j3 = this.x;
            if (j3 != -9223372036854775807L && this.f3977e - j3 >= j2) {
                z2 = true;
            }
        }
        if (!z2 || (pollFirst = this.b.pollFirst()) == null) {
            return null;
        }
        List<f.h.b.b.c2.c> emptyList = Collections.emptyList();
        this.n = emptyList;
        this.x = -9223372036854775807L;
        this.o = emptyList;
        Objects.requireNonNull(emptyList);
        pollFirst.q(this.f3977e, new f(emptyList), Long.MAX_VALUE);
        return pollFirst;
    }

    @Override // f.h.b.b.c2.m.e
    public boolean h() {
        return this.n != this.o;
    }

    public final List<f.h.b.b.c2.c> j() {
        int size = this.f3951l.size();
        ArrayList arrayList = new ArrayList(size);
        int i2 = 2;
        for (int i3 = 0; i3 < size; i3++) {
            f.h.b.b.c2.c c = this.f3951l.get(i3).c(Integer.MIN_VALUE);
            arrayList.add(c);
            if (c != null) {
                i2 = Math.min(i2, c.f3926h);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            f.h.b.b.c2.c cVar = (f.h.b.b.c2.c) arrayList.get(i4);
            if (cVar != null) {
                if (cVar.f3926h != i2) {
                    cVar = this.f3951l.get(i4).c(i2);
                    Objects.requireNonNull(cVar);
                }
                arrayList2.add(cVar);
            }
        }
        return arrayList2;
    }

    public final void k() {
        this.f3952m.f(this.p);
        this.f3951l.clear();
        this.f3951l.add(this.f3952m);
    }

    public final void l(int i2) {
        int i3 = this.p;
        if (i3 == i2) {
            return;
        }
        this.p = i2;
        if (i2 == 3) {
            for (int i4 = 0; i4 < this.f3951l.size(); i4++) {
                this.f3951l.get(i4).f3956g = i2;
            }
            return;
        }
        k();
        if (i3 == 3 || i2 == 1 || i2 == 0) {
            this.n = Collections.emptyList();
        }
    }

    public final void m(int i2) {
        this.q = i2;
        this.f3952m.f3957h = i2;
    }

    @Override // f.h.b.b.c2.m.e, f.h.b.b.v1.c
    public void release() {
    }
}
