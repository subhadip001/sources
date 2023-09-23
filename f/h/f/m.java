package f.h.f;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: JsonArray.java */
/* loaded from: classes2.dex */
public final class m extends p implements Iterable<p> {

    /* renamed from: f  reason: collision with root package name */
    public final List<p> f6238f = new ArrayList();

    @Override // f.h.f.p
    public String c() {
        if (this.f6238f.size() == 1) {
            return this.f6238f.get(0).c();
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof m) && ((m) obj).f6238f.equals(this.f6238f));
    }

    public int hashCode() {
        return this.f6238f.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<p> iterator() {
        return this.f6238f.iterator();
    }
}
