package f.h.c.b;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MultimapBuilder.java */
/* loaded from: classes.dex */
public final class h0<V> implements f.h.c.a.p<List<V>>, Serializable {

    /* renamed from: f  reason: collision with root package name */
    public final int f5929f;

    public h0(int i2) {
        f.h.b.c.a.w(i2, "expectedValuesPerKey");
        this.f5929f = i2;
    }

    @Override // f.h.c.a.p
    public Object get() {
        return new ArrayList(this.f5929f);
    }
}
