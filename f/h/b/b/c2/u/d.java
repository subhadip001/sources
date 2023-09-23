package f.h.b.b.c2.u;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
import f.h.b.b.c2.c;
import f.h.b.b.c2.u.h;
import f.h.b.b.g2.b0;
import f.h.b.b.g2.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* compiled from: Mp4WebvttDecoder.java */
/* loaded from: classes.dex */
public final class d extends f.h.b.b.c2.d {
    public final t n;

    public d() {
        super("Mp4WebvttDecoder");
        this.n = new t();
    }

    @Override // f.h.b.b.c2.d
    public f.h.b.b.c2.f j(byte[] bArr, int i2, boolean z) {
        f.h.b.b.c2.c a;
        t tVar = this.n;
        tVar.a = bArr;
        tVar.c = i2;
        tVar.b = 0;
        ArrayList arrayList = new ArrayList();
        while (this.n.a() > 0) {
            if (this.n.a() >= 8) {
                int f2 = this.n.f();
                if (this.n.f() == 1987343459) {
                    t tVar2 = this.n;
                    int i3 = f2 - 8;
                    CharSequence charSequence = null;
                    c.b bVar = null;
                    while (i3 > 0) {
                        if (i3 >= 8) {
                            int f3 = tVar2.f();
                            int f4 = tVar2.f();
                            int i4 = f3 - 8;
                            String l2 = b0.l(tVar2.a, tVar2.b, i4);
                            tVar2.D(i4);
                            i3 = (i3 - 8) - i4;
                            if (f4 == 1937011815) {
                                h.e eVar = new h.e();
                                h.e(l2, eVar);
                                bVar = eVar.a();
                            } else if (f4 == 1885436268) {
                                charSequence = h.f(null, l2.trim(), Collections.emptyList());
                            }
                        } else {
                            throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
                        }
                    }
                    if (charSequence == null) {
                        charSequence = "";
                    }
                    if (bVar != null) {
                        bVar.a = charSequence;
                        a = bVar.a();
                    } else {
                        Pattern pattern = h.a;
                        h.e eVar2 = new h.e();
                        eVar2.c = charSequence;
                        a = eVar2.a().a();
                    }
                    arrayList.add(a);
                } else {
                    this.n.D(f2 - 8);
                }
            } else {
                throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new e(arrayList);
    }
}
