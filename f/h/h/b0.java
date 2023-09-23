package f.h.h;

import f.h.h.y;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: LazyStringArrayList.java */
/* loaded from: classes2.dex */
public class b0 extends c<String> implements c0, RandomAccess {

    /* renamed from: h  reason: collision with root package name */
    public static final b0 f6323h;

    /* renamed from: g  reason: collision with root package name */
    public final List<Object> f6324g;

    static {
        b0 b0Var = new b0(10);
        f6323h = b0Var;
        b0Var.f6325f = false;
    }

    public b0(int i2) {
        this.f6324g = new ArrayList(i2);
    }

    public static String b(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof j) {
            return ((j) obj).n();
        }
        Charset charset = y.a;
        return new String((byte[]) obj, y.a);
    }

    @Override // f.h.h.c0
    public List<?> C() {
        return Collections.unmodifiableList(this.f6324g);
    }

    @Override // f.h.h.c0
    public c0 W() {
        return this.f6325f ? new j1(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i2, Object obj) {
        a();
        this.f6324g.add(i2, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // f.h.h.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // f.h.h.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        a();
        this.f6324g.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // f.h.h.c0
    public Object d0(int i2) {
        return this.f6324g.get(i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i2) {
        String str;
        Object obj = this.f6324g.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            str = jVar.n();
            if (jVar.i()) {
                this.f6324g.set(i2, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            Charset charset = y.a;
            str = new String(bArr, y.a);
            if (l1.a.e(0, bArr, 0, bArr.length) == 0) {
                this.f6324g.set(i2, str);
            }
        }
        return str;
    }

    @Override // f.h.h.y.i
    public y.i p(int i2) {
        if (i2 >= size()) {
            ArrayList arrayList = new ArrayList(i2);
            arrayList.addAll(this.f6324g);
            return new b0(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // f.h.h.c0
    public void q(j jVar) {
        a();
        this.f6324g.add(jVar);
        ((AbstractList) this).modCount++;
    }

    @Override // f.h.h.c, java.util.AbstractList, java.util.List
    public Object remove(int i2) {
        a();
        Object remove = this.f6324g.remove(i2);
        ((AbstractList) this).modCount++;
        return b(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i2, Object obj) {
        a();
        return b(this.f6324g.set(i2, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f6324g.size();
    }

    @Override // f.h.h.c, java.util.AbstractList, java.util.List
    public boolean addAll(int i2, Collection<? extends String> collection) {
        a();
        if (collection instanceof c0) {
            collection = ((c0) collection).C();
        }
        boolean addAll = this.f6324g.addAll(i2, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    public b0(ArrayList<Object> arrayList) {
        this.f6324g = arrayList;
    }
}
