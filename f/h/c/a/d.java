package f.h.c.a;

import com.google.common.base.CaseFormat;
import java.util.Objects;

/* compiled from: Converter.java */
/* loaded from: classes.dex */
public abstract class d<A, B> implements f<A, B> {

    /* renamed from: f  reason: collision with root package name */
    public final boolean f5840f = true;

    @Override // f.h.c.a.f
    @Deprecated
    public final B apply(A a) {
        if (!this.f5840f) {
            CaseFormat.f fVar = (CaseFormat.f) this;
            return (B) fVar.f1270g.to(fVar.f1271h, (String) a);
        } else if (a == null) {
            return null;
        } else {
            CaseFormat.f fVar2 = (CaseFormat.f) this;
            B b = (B) fVar2.f1270g.to(fVar2.f1271h, (String) a);
            Objects.requireNonNull(b);
            return b;
        }
    }
}
