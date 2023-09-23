package f.h.h;

import f.h.h.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ListFieldSchema.java */
/* loaded from: classes2.dex */
public abstract class d0 {
    public static final d0 a = new b(null);
    public static final d0 b = new c(null);

    /* compiled from: ListFieldSchema.java */
    /* loaded from: classes2.dex */
    public static final class b extends d0 {
        public static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        public b(a aVar) {
            super(null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <L> List<L> d(Object obj, long j2, int i2) {
            b0 b0Var;
            List<L> arrayList;
            List<L> list = (List) k1.q(obj, j2);
            if (list.isEmpty()) {
                if (list instanceof c0) {
                    arrayList = new b0(i2);
                } else if ((list instanceof v0) && (list instanceof y.i)) {
                    arrayList = ((y.i) list).p(i2);
                } else {
                    arrayList = new ArrayList<>(i2);
                }
                k1.f6405e.s(obj, j2, arrayList);
                return arrayList;
            }
            if (c.isAssignableFrom(list.getClass())) {
                ArrayList arrayList2 = new ArrayList(list.size() + i2);
                arrayList2.addAll(list);
                k1.f6405e.s(obj, j2, arrayList2);
                b0Var = arrayList2;
            } else if (list instanceof j1) {
                b0 b0Var2 = new b0(list.size() + i2);
                b0Var2.addAll(b0Var2.size(), (j1) list);
                k1.f6405e.s(obj, j2, b0Var2);
                b0Var = b0Var2;
            } else if ((list instanceof v0) && (list instanceof y.i)) {
                y.i iVar = (y.i) list;
                if (iVar.m0()) {
                    return list;
                }
                y.i p = iVar.p(list.size() + i2);
                k1.f6405e.s(obj, j2, p);
                return p;
            } else {
                return list;
            }
            return b0Var;
        }

        @Override // f.h.h.d0
        public void a(Object obj, long j2) {
            Object unmodifiableList;
            List list = (List) k1.q(obj, j2);
            if (list instanceof c0) {
                unmodifiableList = ((c0) list).W();
            } else if (c.isAssignableFrom(list.getClass())) {
                return;
            } else {
                if ((list instanceof v0) && (list instanceof y.i)) {
                    y.i iVar = (y.i) list;
                    if (iVar.m0()) {
                        iVar.f();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            k1.f6405e.s(obj, j2, unmodifiableList);
        }

        @Override // f.h.h.d0
        public <E> void b(Object obj, Object obj2, long j2) {
            List list = (List) k1.q(obj2, j2);
            List d2 = d(obj, j2, list.size());
            int size = d2.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                d2.addAll(list);
            }
            if (size > 0) {
                list = d2;
            }
            k1.f6405e.s(obj, j2, list);
        }

        @Override // f.h.h.d0
        public <L> List<L> c(Object obj, long j2) {
            return d(obj, j2, 10);
        }
    }

    /* compiled from: ListFieldSchema.java */
    /* loaded from: classes2.dex */
    public static final class c extends d0 {
        public c(a aVar) {
            super(null);
        }

        public static <E> y.i<E> d(Object obj, long j2) {
            return (y.i) k1.q(obj, j2);
        }

        @Override // f.h.h.d0
        public void a(Object obj, long j2) {
            d(obj, j2).f();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
        @Override // f.h.h.d0
        public <E> void b(Object obj, Object obj2, long j2) {
            y.i<E> d2 = d(obj, j2);
            y.i<E> d3 = d(obj2, j2);
            int size = d2.size();
            int size2 = d3.size();
            y.i<E> iVar = d2;
            iVar = d2;
            if (size > 0 && size2 > 0) {
                boolean m0 = d2.m0();
                y.i<E> iVar2 = d2;
                if (!m0) {
                    iVar2 = d2.p(size2 + size);
                }
                iVar2.addAll(d3);
                iVar = iVar2;
            }
            if (size > 0) {
                d3 = iVar;
            }
            k1.f6405e.s(obj, j2, d3);
        }

        @Override // f.h.h.d0
        public <L> List<L> c(Object obj, long j2) {
            y.i d2 = d(obj, j2);
            if (d2.m0()) {
                return d2;
            }
            int size = d2.size();
            y.i p = d2.p(size == 0 ? 10 : size * 2);
            k1.f6405e.s(obj, j2, p);
            return p;
        }
    }

    public d0(a aVar) {
    }

    public abstract void a(Object obj, long j2);

    public abstract <L> void b(Object obj, Object obj2, long j2);

    public abstract <L> List<L> c(Object obj, long j2);
}
