package f.h.b.b.v1;

import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import f.h.b.b.e2.j;
import java.util.Objects;

/* compiled from: DecoderReuseEvaluation.java */
/* loaded from: classes.dex */
public final class e {
    public final String a;
    public final Format b;
    public final Format c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4626d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4627e;

    public e(String str, Format format, Format format2, int i2, int i3) {
        j.c(i2 == 0 || i3 == 0);
        if (!TextUtils.isEmpty(str)) {
            this.a = str;
            Objects.requireNonNull(format);
            this.b = format;
            this.c = format2;
            this.f4626d = i2;
            this.f4627e = i3;
            return;
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f4626d == eVar.f4626d && this.f4627e == eVar.f4627e && this.a.equals(eVar.a) && this.b.equals(eVar.b) && this.c.equals(eVar.c);
    }

    public int hashCode() {
        int I = f.a.b.a.a.I(this.a, (((this.f4626d + 527) * 31) + this.f4627e) * 31, 31);
        return this.c.hashCode() + ((this.b.hashCode() + I) * 31);
    }
}
