package f.h.b.b.c2.t;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import f.h.b.b.c2.d;
import f.h.b.b.c2.f;
import f.h.b.b.g2.b0;
import f.h.b.b.g2.t;
import f.h.c.a.c;
import java.util.List;

/* compiled from: Tx3gDecoder.java */
/* loaded from: classes.dex */
public final class a extends d {
    public final t n;
    public final boolean o;
    public final int p;
    public final int q;
    public final String r;
    public final float s;
    public final int t;

    public a(List<byte[]> list) {
        super("Tx3gDecoder");
        this.n = new t();
        if (list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.p = bArr[24];
            this.q = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.r = "Serif".equals(b0.l(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
            int i2 = bArr[25] * 20;
            this.t = i2;
            boolean z = (bArr[0] & 32) != 0;
            this.o = z;
            if (z) {
                this.s = b0.g(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i2, 0.0f, 0.95f);
                return;
            } else {
                this.s = 0.85f;
                return;
            }
        }
        this.p = 0;
        this.q = -1;
        this.r = "sans-serif";
        this.o = false;
        this.s = 0.85f;
        this.t = -1;
    }

    public static void k(boolean z) {
        if (!z) {
            throw new SubtitleDecoderException("Unexpected subtitle format.");
        }
    }

    public static void l(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4, int i5, int i6) {
        if (i2 != i3) {
            int i7 = i6 | 33;
            boolean z = (i2 & 1) != 0;
            boolean z2 = (i2 & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i4, i5, i7);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i4, i5, i7);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i4, i5, i7);
            }
            boolean z3 = (i2 & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, i5, i7);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i4, i5, i7);
        }
    }

    @Override // f.h.b.b.c2.d
    public f j(byte[] bArr, int i2, boolean z) {
        String p;
        int i3;
        t tVar = this.n;
        tVar.a = bArr;
        tVar.c = i2;
        tVar.b = 0;
        int i4 = 2;
        int i5 = 1;
        k(tVar.a() >= 2);
        int w = tVar.w();
        if (w == 0) {
            p = "";
        } else {
            if (tVar.a() >= 2) {
                byte[] bArr2 = tVar.a;
                int i6 = tVar.b;
                char c = (char) ((bArr2[i6 + 1] & 255) | ((bArr2[i6] & 255) << 8));
                if (c == 65279 || c == 65534) {
                    p = tVar.p(w, c.f5839d);
                }
            }
            p = tVar.p(w, c.c);
        }
        if (p.isEmpty()) {
            return b.f4058g;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(p);
        l(spannableStringBuilder, this.p, 0, 0, spannableStringBuilder.length(), 16711680);
        int i7 = this.q;
        int length = spannableStringBuilder.length();
        if (i7 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i7 >>> 8) | ((i7 & 255) << 24)), 0, length, 16711713);
        }
        String str = this.r;
        int length2 = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length2, 16711713);
        }
        float f2 = this.s;
        for (int i8 = 8; this.n.a() >= i8; i8 = 8) {
            t tVar2 = this.n;
            int i9 = tVar2.b;
            int f3 = tVar2.f();
            int f4 = this.n.f();
            if (f4 == 1937013100) {
                k(this.n.a() >= i4);
                int w2 = this.n.w();
                int i10 = 0;
                while (i10 < w2) {
                    t tVar3 = this.n;
                    k(tVar3.a() >= 12);
                    int w3 = tVar3.w();
                    int w4 = tVar3.w();
                    tVar3.D(i4);
                    int r = tVar3.r();
                    tVar3.D(i5);
                    int f5 = tVar3.f();
                    if (w4 > spannableStringBuilder.length()) {
                        int length3 = spannableStringBuilder.length();
                        StringBuilder sb = new StringBuilder(68);
                        sb.append("Truncating styl end (");
                        sb.append(w4);
                        sb.append(") to cueText.length() (");
                        sb.append(length3);
                        sb.append(").");
                        Log.w("Tx3gDecoder", sb.toString());
                        w4 = spannableStringBuilder.length();
                    }
                    int i11 = w4;
                    if (w3 >= i11) {
                        StringBuilder sb2 = new StringBuilder(60);
                        sb2.append("Ignoring styl with start (");
                        sb2.append(w3);
                        sb2.append(") >= end (");
                        sb2.append(i11);
                        sb2.append(").");
                        Log.w("Tx3gDecoder", sb2.toString());
                        i3 = i10;
                    } else {
                        i3 = i10;
                        l(spannableStringBuilder, r, this.p, w3, i11, 0);
                        if (f5 != this.q) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan((f5 >>> 8) | ((f5 & 255) << 24)), w3, i11, 33);
                        }
                    }
                    i10 = i3 + 1;
                    i4 = 2;
                    i5 = 1;
                }
            } else if (f4 == 1952608120 && this.o) {
                k(this.n.a() >= 2);
                f2 = b0.g(this.n.w() / this.t, 0.0f, 0.95f);
                this.n.C(i9 + f3);
                i4 = 2;
                i5 = 1;
            }
            this.n.C(i9 + f3);
            i4 = 2;
            i5 = 1;
        }
        return new b(new f.h.b.b.c2.c(spannableStringBuilder, null, null, f2, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, null));
    }
}
