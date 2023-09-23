package f.e.a;

import f.e.a.i;
import f.e.a.r.l;
import java.util.Objects;

/* compiled from: TransitionOptions.java */
/* loaded from: classes.dex */
public abstract class i<CHILD extends i<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    public final CHILD a() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public Object clone() {
        try {
            return (i) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            f.e.a.p.k.c<?> cVar = f.e.a.p.k.a.b;
            Objects.requireNonNull((i) obj);
            return l.b(cVar, cVar);
        }
        return false;
    }

    public int hashCode() {
        return f.e.a.p.k.a.b.hashCode();
    }
}
