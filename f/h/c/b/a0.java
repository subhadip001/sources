package f.h.c.b;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import f.h.c.a.e;
import f.h.c.b.a0.h;
import f.h.c.b.a0.m;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: MapMakerInternalMap.java */
/* loaded from: classes.dex */
public class a0<K, V, E extends h<K, V, E>, S extends m<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
    public static final z<Object, Object, d> o = new a();

    /* renamed from: f  reason: collision with root package name */
    public final transient int f5853f;

    /* renamed from: g  reason: collision with root package name */
    public final transient int f5854g;

    /* renamed from: h  reason: collision with root package name */
    public final transient m<K, V, E, S>[] f5855h;

    /* renamed from: i  reason: collision with root package name */
    public final int f5856i = Math.min(4, (int) LogFileManager.MAX_LOG_SIZE);

    /* renamed from: j  reason: collision with root package name */
    public final f.h.c.a.e<Object> f5857j;

    /* renamed from: k  reason: collision with root package name */
    public final transient i<K, V, E, S> f5858k;

    /* renamed from: l  reason: collision with root package name */
    public transient Set<K> f5859l;

    /* renamed from: m  reason: collision with root package name */
    public transient Collection<V> f5860m;
    public transient Set<Map.Entry<K, V>> n;

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public class a implements z<Object, Object, d> {
        @Override // f.h.c.b.a0.z
        public /* bridge */ /* synthetic */ d a() {
            return null;
        }

        @Override // f.h.c.b.a0.z
        public z<Object, Object, d> b(ReferenceQueue<Object> referenceQueue, d dVar) {
            return this;
        }

        @Override // f.h.c.b.a0.z
        public void clear() {
        }

        @Override // f.h.c.b.a0.z
        public Object get() {
            return null;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: f.h.c.b.a0$a0  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0132a0<K, V, E extends h<K, V, E>> extends WeakReference<V> implements z<K, V, E> {
        public final E a;

        public C0132a0(ReferenceQueue<V> referenceQueue, V v, E e2) {
            super(v, referenceQueue);
            this.a = e2;
        }

        @Override // f.h.c.b.a0.z
        public E a() {
            return this.a;
        }

        @Override // f.h.c.b.a0.z
        public z<K, V, E> b(ReferenceQueue<V> referenceQueue, E e2) {
            return new C0132a0(referenceQueue, get(), e2);
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public static abstract class b<K, V, E extends h<K, V, E>> implements h<K, V, E> {
        public final K a;
        public final int b;
        public final E c;

        public b(K k2, int i2, E e2) {
            this.a = k2;
            this.b = i2;
            this.c = e2;
        }

        @Override // f.h.c.b.a0.h
        public E a() {
            return this.c;
        }

        @Override // f.h.c.b.a0.h
        public int getHash() {
            return this.b;
        }

        @Override // f.h.c.b.a0.h
        public K getKey() {
            return this.a;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public final class b0 extends f.h.c.b.d<K, V> {

        /* renamed from: f  reason: collision with root package name */
        public final K f5861f;

        /* renamed from: g  reason: collision with root package name */
        public V f5862g;

        public b0(K k2, V v) {
            this.f5861f = k2;
            this.f5862g = v;
        }

        @Override // f.h.c.b.d, java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return this.f5861f.equals(entry.getKey()) && this.f5862g.equals(entry.getValue());
            }
            return false;
        }

        @Override // f.h.c.b.d, java.util.Map.Entry
        public K getKey() {
            return this.f5861f;
        }

        @Override // f.h.c.b.d, java.util.Map.Entry
        public V getValue() {
            return this.f5862g;
        }

        @Override // f.h.c.b.d, java.util.Map.Entry
        public int hashCode() {
            return this.f5861f.hashCode() ^ this.f5862g.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = (V) a0.this.put(this.f5861f, v);
            this.f5862g = v;
            return v2;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public static abstract class c<K, V, E extends h<K, V, E>> extends WeakReference<K> implements h<K, V, E> {
        public final int a;
        public final E b;

        public c(ReferenceQueue<K> referenceQueue, K k2, int i2, E e2) {
            super(k2, referenceQueue);
            this.a = i2;
            this.b = e2;
        }

        @Override // f.h.c.b.a0.h
        public E a() {
            return this.b;
        }

        @Override // f.h.c.b.a0.h
        public int getHash() {
            return this.a;
        }

        @Override // f.h.c.b.a0.h
        public K getKey() {
            return get();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public static final class d implements h<Object, Object, d> {
        public d() {
            throw new AssertionError();
        }

        @Override // f.h.c.b.a0.h
        public d a() {
            throw new AssertionError();
        }

        @Override // f.h.c.b.a0.h
        public int getHash() {
            throw new AssertionError();
        }

        @Override // f.h.c.b.a0.h
        public Object getKey() {
            throw new AssertionError();
        }

        @Override // f.h.c.b.a0.h
        public Object getValue() {
            throw new AssertionError();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public final class e extends a0<K, V, E, S>.g<Map.Entry<K, V>> {
        public e(a0 a0Var) {
            super();
        }

        @Override // java.util.Iterator
        public Object next() {
            return c();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public final class f extends l<Map.Entry<K, V>> {
        public f() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            a0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = a0.this.get(key)) != null && a0.this.d().c(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return a0.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new e(a0.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && a0.this.remove(key, entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a0.this.size();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public abstract class g<T> implements Iterator<T> {

        /* renamed from: f  reason: collision with root package name */
        public int f5865f;

        /* renamed from: g  reason: collision with root package name */
        public int f5866g = -1;

        /* renamed from: h  reason: collision with root package name */
        public m<K, V, E, S> f5867h;

        /* renamed from: i  reason: collision with root package name */
        public AtomicReferenceArray<E> f5868i;

        /* renamed from: j  reason: collision with root package name */
        public E f5869j;

        /* renamed from: k  reason: collision with root package name */
        public a0<K, V, E, S>.b0 f5870k;

        /* renamed from: l  reason: collision with root package name */
        public a0<K, V, E, S>.b0 f5871l;

        public g() {
            this.f5865f = a0.this.f5855h.length - 1;
            a();
        }

        public final void a() {
            this.f5870k = null;
            if (d() || e()) {
                return;
            }
            while (true) {
                int i2 = this.f5865f;
                if (i2 < 0) {
                    return;
                }
                m<K, V, E, S>[] mVarArr = a0.this.f5855h;
                this.f5865f = i2 - 1;
                m<K, V, E, S> mVar = mVarArr[i2];
                this.f5867h = mVar;
                if (mVar.f5876g != 0) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f5867h.f5879j;
                    this.f5868i = atomicReferenceArray;
                    this.f5866g = atomicReferenceArray.length() - 1;
                    if (e()) {
                        return;
                    }
                }
            }
        }

        public boolean b(E e2) {
            boolean z;
            try {
                Object key = e2.getKey();
                Objects.requireNonNull(a0.this);
                Object value = e2.getKey() == null ? null : e2.getValue();
                if (value != null) {
                    this.f5870k = new b0(key, value);
                    z = true;
                } else {
                    z = false;
                }
                return z;
            } finally {
                this.f5867h.h();
            }
        }

        public a0<K, V, E, S>.b0 c() {
            a0<K, V, E, S>.b0 b0Var = this.f5870k;
            if (b0Var != null) {
                this.f5871l = b0Var;
                a();
                return this.f5871l;
            }
            throw new NoSuchElementException();
        }

        public boolean d() {
            E e2 = this.f5869j;
            if (e2 == null) {
                return false;
            }
            while (true) {
                this.f5869j = (E) e2.a();
                E e3 = this.f5869j;
                if (e3 == null) {
                    return false;
                }
                if (b(e3)) {
                    return true;
                }
                e2 = this.f5869j;
            }
        }

        public boolean e() {
            while (true) {
                int i2 = this.f5866g;
                if (i2 < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f5868i;
                this.f5866g = i2 - 1;
                E e2 = atomicReferenceArray.get(i2);
                this.f5869j = e2;
                if (e2 != null && (b(e2) || d())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f5870k != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            f.h.b.c.a.C(this.f5871l != null, "no calls to next() since the last call to remove()");
            a0.this.remove(this.f5871l.f5861f);
            this.f5871l = null;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public interface h<K, V, E extends h<K, V, E>> {
        E a();

        int getHash();

        K getKey();

        V getValue();
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public interface i<K, V, E extends h<K, V, E>, S extends m<K, V, E, S>> {
        E a(S s, E e2, E e3);

        n b();

        void c(S s, E e2, V v);

        S d(a0<K, V, E, S> a0Var, int i2, int i3);

        E e(S s, K k2, int i2, E e2);
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public final class j extends a0<K, V, E, S>.g<K> {
        public j(a0 a0Var) {
            super();
        }

        @Override // java.util.Iterator
        public K next() {
            return c().f5861f;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public final class k extends l<K> {
        public k() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            a0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return a0.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return a0.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new j(a0.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return a0.this.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a0.this.size();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public static abstract class l<E> extends AbstractSet<E> {
        public l(a aVar) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return a0.a(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) a0.a(this).toArray(tArr);
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public static abstract class m<K, V, E extends h<K, V, E>, S extends m<K, V, E, S>> extends ReentrantLock {

        /* renamed from: m  reason: collision with root package name */
        public static final /* synthetic */ int f5874m = 0;

        /* renamed from: f  reason: collision with root package name */
        public final a0<K, V, E, S> f5875f;

        /* renamed from: g  reason: collision with root package name */
        public volatile int f5876g;

        /* renamed from: h  reason: collision with root package name */
        public int f5877h;

        /* renamed from: i  reason: collision with root package name */
        public int f5878i;

        /* renamed from: j  reason: collision with root package name */
        public volatile AtomicReferenceArray<E> f5879j;

        /* renamed from: k  reason: collision with root package name */
        public final int f5880k;

        /* renamed from: l  reason: collision with root package name */
        public final AtomicInteger f5881l = new AtomicInteger();

        public m(a0<K, V, E, S> a0Var, int i2, int i3) {
            this.f5875f = a0Var;
            this.f5880k = i3;
            AtomicReferenceArray<E> atomicReferenceArray = new AtomicReferenceArray<>(i2);
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.f5878i = length;
            if (length == i3) {
                this.f5878i = length + 1;
            }
            this.f5879j = atomicReferenceArray;
        }

        public <T> void a(ReferenceQueue<T> referenceQueue) {
            do {
            } while (referenceQueue.poll() != null);
        }

        public void b(ReferenceQueue<K> referenceQueue) {
            int i2 = 0;
            do {
                Reference<? extends K> poll = referenceQueue.poll();
                if (poll == null) {
                    return;
                }
                h hVar = (h) poll;
                a0<K, V, E, S> a0Var = this.f5875f;
                Objects.requireNonNull(a0Var);
                int hash = hVar.getHash();
                m<K, V, E, S> c = a0Var.c(hash);
                c.lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = c.f5879j;
                    int length = hash & (atomicReferenceArray.length() - 1);
                    E e2 = atomicReferenceArray.get(length);
                    h hVar2 = e2;
                    while (true) {
                        if (hVar2 == null) {
                            break;
                        } else if (hVar2 == hVar) {
                            c.f5877h++;
                            atomicReferenceArray.set(length, c.j(e2, hVar2));
                            c.f5876g--;
                            break;
                        } else {
                            hVar2 = hVar2.a();
                        }
                    }
                    c.unlock();
                    i2++;
                } catch (Throwable th) {
                    c.unlock();
                    throw th;
                }
            } while (i2 != 16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v7 */
        public void c(ReferenceQueue<V> referenceQueue) {
            int i2 = 0;
            do {
                Reference<? extends V> poll = referenceQueue.poll();
                if (poll == null) {
                    return;
                }
                z<K, V, E> zVar = (z) poll;
                a0<K, V, E, S> a0Var = this.f5875f;
                Objects.requireNonNull(a0Var);
                E a = zVar.a();
                int hash = a.getHash();
                m<K, V, E, S> c = a0Var.c(hash);
                Object key = a.getKey();
                c.lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = c.f5879j;
                    int length = (atomicReferenceArray.length() - 1) & hash;
                    E e2 = atomicReferenceArray.get(length);
                    E e3 = e2;
                    while (true) {
                        if (e3 == null) {
                            break;
                        }
                        Object key2 = e3.getKey();
                        if (e3.getHash() == hash && key2 != null && c.f5875f.f5857j.c(key, key2)) {
                            if (e3.b() == zVar) {
                                c.f5877h++;
                                atomicReferenceArray.set(length, c.j(e2, e3));
                                c.f5876g--;
                            }
                        } else {
                            e3 = (E) e3.a();
                        }
                    }
                    c.unlock();
                    i2++;
                } catch (Throwable th) {
                    c.unlock();
                    throw th;
                }
            } while (i2 != 16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void d() {
            AtomicReferenceArray<E> atomicReferenceArray = this.f5879j;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i2 = this.f5876g;
            AtomicReferenceArray<E> atomicReferenceArray2 = (AtomicReferenceArray<E>) new AtomicReferenceArray(length << 1);
            this.f5878i = (atomicReferenceArray2.length() * 3) / 4;
            int length2 = atomicReferenceArray2.length() - 1;
            for (int i3 = 0; i3 < length; i3++) {
                E e2 = atomicReferenceArray.get(i3);
                if (e2 != null) {
                    h a = e2.a();
                    int hash = e2.getHash() & length2;
                    if (a == null) {
                        atomicReferenceArray2.set(hash, e2);
                    } else {
                        h hVar = e2;
                        while (a != null) {
                            int hash2 = a.getHash() & length2;
                            if (hash2 != hash) {
                                hVar = a;
                                hash = hash2;
                            }
                            a = a.a();
                        }
                        atomicReferenceArray2.set(hash, hVar);
                        while (e2 != hVar) {
                            int hash3 = e2.getHash() & length2;
                            h a2 = this.f5875f.f5858k.a(l(), e2, (h) atomicReferenceArray2.get(hash3));
                            if (a2 != null) {
                                atomicReferenceArray2.set(hash3, a2);
                            } else {
                                i2--;
                            }
                            e2 = e2.a();
                        }
                    }
                }
            }
            this.f5879j = atomicReferenceArray2;
            this.f5876g = i2;
        }

        public E e(Object obj, int i2) {
            if (this.f5876g != 0) {
                AtomicReferenceArray<E> atomicReferenceArray = this.f5879j;
                for (E e2 = atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i2); e2 != null; e2 = (E) e2.a()) {
                    if (e2.getHash() == i2) {
                        Object key = e2.getKey();
                        if (key == null) {
                            n();
                        } else if (this.f5875f.f5857j.c(obj, key)) {
                            return e2;
                        }
                    }
                }
            }
            return null;
        }

        public void f() {
        }

        public void g() {
        }

        public void h() {
            if ((this.f5881l.incrementAndGet() & 63) == 0) {
                k();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public V i(K k2, int i2, V v, boolean z) {
            lock();
            try {
                k();
                int i3 = this.f5876g + 1;
                if (i3 > this.f5878i) {
                    d();
                    i3 = this.f5876g + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f5879j;
                int length = (atomicReferenceArray.length() - 1) & i2;
                E e2 = atomicReferenceArray.get(length);
                for (h hVar = e2; hVar != null; hVar = hVar.a()) {
                    Object key = hVar.getKey();
                    if (hVar.getHash() == i2 && key != null && this.f5875f.f5857j.c(k2, key)) {
                        V v2 = (V) hVar.getValue();
                        if (v2 == null) {
                            this.f5877h++;
                            this.f5875f.f5858k.c(l(), hVar, v);
                            this.f5876g = this.f5876g;
                            return null;
                        } else if (z) {
                            return v2;
                        } else {
                            this.f5877h++;
                            this.f5875f.f5858k.c(l(), hVar, v);
                            return v2;
                        }
                    }
                }
                this.f5877h++;
                E e3 = this.f5875f.f5858k.e(l(), k2, i2, e2);
                m(e3, v);
                atomicReferenceArray.set(length, e3);
                this.f5876g = i3;
                return null;
            } finally {
                unlock();
            }
        }

        public E j(E e2, E e3) {
            int i2 = this.f5876g;
            E e4 = (E) e3.a();
            while (e2 != e3) {
                E a = this.f5875f.f5858k.a(l(), e2, e4);
                if (a != null) {
                    e4 = a;
                } else {
                    i2--;
                }
                e2 = (E) e2.a();
            }
            this.f5876g = i2;
            return e4;
        }

        public void k() {
            if (tryLock()) {
                try {
                    g();
                    this.f5881l.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public abstract S l();

        public void m(E e2, V v) {
            this.f5875f.f5858k.c(l(), e2, v);
        }

        public void n() {
            if (tryLock()) {
                try {
                    g();
                } finally {
                    unlock();
                }
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public static abstract class n {

        /* renamed from: f  reason: collision with root package name */
        public static final n f5882f;

        /* renamed from: g  reason: collision with root package name */
        public static final n f5883g;

        /* renamed from: h  reason: collision with root package name */
        public static final /* synthetic */ n[] f5884h;

        /* compiled from: MapMakerInternalMap.java */
        /* loaded from: classes.dex */
        public enum a extends n {
            public a(String str, int i2) {
                super(str, i2, null);
            }

            @Override // f.h.c.b.a0.n
            public f.h.c.a.e<Object> a() {
                return e.a.f5841f;
            }
        }

        /* compiled from: MapMakerInternalMap.java */
        /* loaded from: classes.dex */
        public enum b extends n {
            public b(String str, int i2) {
                super(str, i2, null);
            }

            @Override // f.h.c.b.a0.n
            public f.h.c.a.e<Object> a() {
                return e.b.f5842f;
            }
        }

        static {
            a aVar = new a("STRONG", 0);
            f5882f = aVar;
            b bVar = new b("WEAK", 1);
            f5883g = bVar;
            f5884h = new n[]{aVar, bVar};
        }

        public n(String str, int i2, a aVar) {
        }

        public static n valueOf(String str) {
            return (n) Enum.valueOf(n.class, str);
        }

        public static n[] values() {
            return (n[]) f5884h.clone();
        }

        public abstract f.h.c.a.e<Object> a();
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public static final class o<K, V> extends b<K, V, o<K, V>> implements Object<K, V, o<K, V>> {

        /* renamed from: d  reason: collision with root package name */
        public volatile V f5885d;

        /* compiled from: MapMakerInternalMap.java */
        /* loaded from: classes.dex */
        public static final class a<K, V> implements i<K, V, o<K, V>, p<K, V>> {
            public static final a<?, ?> a = new a<>();

            @Override // f.h.c.b.a0.i
            public h a(m mVar, h hVar, h hVar2) {
                p pVar = (p) mVar;
                o oVar = (o) hVar;
                o oVar2 = new o(oVar.a, oVar.b, (o) hVar2);
                oVar2.f5885d = oVar.f5885d;
                return oVar2;
            }

            @Override // f.h.c.b.a0.i
            public n b() {
                return n.f5882f;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // f.h.c.b.a0.i
            public void c(m mVar, h hVar, Object obj) {
                p pVar = (p) mVar;
                ((o) hVar).f5885d = obj;
            }

            @Override // f.h.c.b.a0.i
            public m d(a0 a0Var, int i2, int i3) {
                return new p(a0Var, i2, i3);
            }

            @Override // f.h.c.b.a0.i
            public h e(m mVar, Object obj, int i2, h hVar) {
                p pVar = (p) mVar;
                return new o(obj, i2, (o) hVar);
            }
        }

        public o(K k2, int i2, o<K, V> oVar) {
            super(k2, i2, oVar);
            this.f5885d = null;
        }

        @Override // f.h.c.b.a0.h
        public V getValue() {
            return this.f5885d;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public static final class p<K, V> extends m<K, V, o<K, V>, p<K, V>> {
        public p(a0<K, V, o<K, V>, p<K, V>> a0Var, int i2, int i3) {
            super(a0Var, i2, i3);
        }

        @Override // f.h.c.b.a0.m
        public m l() {
            return this;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public static final class q<K, V> extends b<K, V, q<K, V>> implements y<K, V, q<K, V>> {

        /* renamed from: d  reason: collision with root package name */
        public volatile z<K, V, q<K, V>> f5886d;

        /* compiled from: MapMakerInternalMap.java */
        /* loaded from: classes.dex */
        public static final class a<K, V> implements i<K, V, q<K, V>, r<K, V>> {
            public static final a<?, ?> a = new a<>();

            @Override // f.h.c.b.a0.i
            public h a(m mVar, h hVar, h hVar2) {
                r rVar = (r) mVar;
                q qVar = (q) hVar;
                q qVar2 = (q) hVar2;
                int i2 = m.f5874m;
                if (qVar.getValue() == null) {
                    return null;
                }
                ReferenceQueue<V> referenceQueue = rVar.n;
                q<K, V> qVar3 = new q<>(qVar.a, qVar.b, qVar2);
                qVar3.f5886d = qVar.f5886d.b(referenceQueue, qVar3);
                return qVar3;
            }

            @Override // f.h.c.b.a0.i
            public n b() {
                return n.f5883g;
            }

            @Override // f.h.c.b.a0.i
            public void c(m mVar, h hVar, Object obj) {
                q qVar = (q) hVar;
                ReferenceQueue<V> referenceQueue = ((r) mVar).n;
                z<K, V, q<K, V>> zVar = qVar.f5886d;
                qVar.f5886d = new C0132a0(referenceQueue, obj, qVar);
                zVar.clear();
            }

            @Override // f.h.c.b.a0.i
            public m d(a0 a0Var, int i2, int i3) {
                return new r(a0Var, i2, i3);
            }

            @Override // f.h.c.b.a0.i
            public h e(m mVar, Object obj, int i2, h hVar) {
                r rVar = (r) mVar;
                return new q(obj, i2, (q) hVar);
            }
        }

        public q(K k2, int i2, q<K, V> qVar) {
            super(k2, i2, qVar);
            z<Object, Object, d> zVar = a0.o;
            this.f5886d = (z<K, V, q<K, V>>) a0.o;
        }

        @Override // f.h.c.b.a0.y
        public z<K, V, q<K, V>> b() {
            return this.f5886d;
        }

        @Override // f.h.c.b.a0.h
        public V getValue() {
            return this.f5886d.get();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public static final class r<K, V> extends m<K, V, q<K, V>, r<K, V>> {
        public final ReferenceQueue<V> n;

        public r(a0<K, V, q<K, V>, r<K, V>> a0Var, int i2, int i3) {
            super(a0Var, i2, i3);
            this.n = new ReferenceQueue<>();
        }

        @Override // f.h.c.b.a0.m
        public void f() {
            a((ReferenceQueue<V>) this.n);
        }

        @Override // f.h.c.b.a0.m
        public void g() {
            c(this.n);
        }

        @Override // f.h.c.b.a0.m
        public m l() {
            return this;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public final class s extends a0<K, V, E, S>.g<V> {
        public s(a0 a0Var) {
            super();
        }

        @Override // java.util.Iterator
        public V next() {
            return c().f5862g;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public final class t extends AbstractCollection<V> {
        public t() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            a0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return a0.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return a0.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new s(a0.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a0.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return a0.a(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) a0.a(this).toArray(tArr);
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public static final class u<K, V> extends c<K, V, u<K, V>> implements Object<K, V, u<K, V>> {
        public volatile V c;

        /* compiled from: MapMakerInternalMap.java */
        /* loaded from: classes.dex */
        public static final class a<K, V> implements i<K, V, u<K, V>, v<K, V>> {
            public static final a<?, ?> a = new a<>();

            @Override // f.h.c.b.a0.i
            public h a(m mVar, h hVar, h hVar2) {
                v vVar = (v) mVar;
                u uVar = (u) hVar;
                u uVar2 = (u) hVar2;
                if (uVar.get() == null) {
                    return null;
                }
                u uVar3 = new u(vVar.n, uVar.get(), uVar.a, uVar2);
                uVar3.c = uVar.c;
                return uVar3;
            }

            @Override // f.h.c.b.a0.i
            public n b() {
                return n.f5882f;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // f.h.c.b.a0.i
            public void c(m mVar, h hVar, Object obj) {
                v vVar = (v) mVar;
                ((u) hVar).c = obj;
            }

            @Override // f.h.c.b.a0.i
            public m d(a0 a0Var, int i2, int i3) {
                return new v(a0Var, i2, i3);
            }

            @Override // f.h.c.b.a0.i
            public h e(m mVar, Object obj, int i2, h hVar) {
                return new u(((v) mVar).n, obj, i2, (u) hVar);
            }
        }

        public u(ReferenceQueue<K> referenceQueue, K k2, int i2, u<K, V> uVar) {
            super(referenceQueue, k2, i2, uVar);
            this.c = null;
        }

        @Override // f.h.c.b.a0.h
        public V getValue() {
            return this.c;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public static final class v<K, V> extends m<K, V, u<K, V>, v<K, V>> {
        public final ReferenceQueue<K> n;

        public v(a0<K, V, u<K, V>, v<K, V>> a0Var, int i2, int i3) {
            super(a0Var, i2, i3);
            this.n = new ReferenceQueue<>();
        }

        @Override // f.h.c.b.a0.m
        public void f() {
            a((ReferenceQueue<K>) this.n);
        }

        @Override // f.h.c.b.a0.m
        public void g() {
            b(this.n);
        }

        @Override // f.h.c.b.a0.m
        public m l() {
            return this;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public static final class w<K, V> extends c<K, V, w<K, V>> implements y<K, V, w<K, V>> {
        public volatile z<K, V, w<K, V>> c;

        /* compiled from: MapMakerInternalMap.java */
        /* loaded from: classes.dex */
        public static final class a<K, V> implements i<K, V, w<K, V>, x<K, V>> {
            public static final a<?, ?> a = new a<>();

            @Override // f.h.c.b.a0.i
            public h a(m mVar, h hVar, h hVar2) {
                x xVar = (x) mVar;
                w wVar = (w) hVar;
                w wVar2 = (w) hVar2;
                if (wVar.get() == null) {
                    return null;
                }
                int i2 = m.f5874m;
                if (wVar.getValue() == null) {
                    return null;
                }
                ReferenceQueue<K> referenceQueue = xVar.n;
                ReferenceQueue<V> referenceQueue2 = xVar.o;
                w<K, V> wVar3 = new w<>(referenceQueue, wVar.get(), wVar.a, wVar2);
                wVar3.c = wVar.c.b(referenceQueue2, wVar3);
                return wVar3;
            }

            @Override // f.h.c.b.a0.i
            public n b() {
                return n.f5883g;
            }

            @Override // f.h.c.b.a0.i
            public void c(m mVar, h hVar, Object obj) {
                w wVar = (w) hVar;
                ReferenceQueue<V> referenceQueue = ((x) mVar).o;
                z<K, V, w<K, V>> zVar = wVar.c;
                wVar.c = new C0132a0(referenceQueue, obj, wVar);
                zVar.clear();
            }

            @Override // f.h.c.b.a0.i
            public m d(a0 a0Var, int i2, int i3) {
                return new x(a0Var, i2, i3);
            }

            @Override // f.h.c.b.a0.i
            public h e(m mVar, Object obj, int i2, h hVar) {
                return new w(((x) mVar).n, obj, i2, (w) hVar);
            }
        }

        public w(ReferenceQueue<K> referenceQueue, K k2, int i2, w<K, V> wVar) {
            super(referenceQueue, k2, i2, wVar);
            z<Object, Object, d> zVar = a0.o;
            this.c = (z<K, V, w<K, V>>) a0.o;
        }

        @Override // f.h.c.b.a0.y
        public z<K, V, w<K, V>> b() {
            return this.c;
        }

        @Override // f.h.c.b.a0.h
        public V getValue() {
            return this.c.get();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public static final class x<K, V> extends m<K, V, w<K, V>, x<K, V>> {
        public final ReferenceQueue<K> n;
        public final ReferenceQueue<V> o;

        public x(a0<K, V, w<K, V>, x<K, V>> a0Var, int i2, int i3) {
            super(a0Var, i2, i3);
            this.n = new ReferenceQueue<>();
            this.o = new ReferenceQueue<>();
        }

        @Override // f.h.c.b.a0.m
        public void f() {
            a((ReferenceQueue<K>) this.n);
        }

        @Override // f.h.c.b.a0.m
        public void g() {
            b(this.n);
            c(this.o);
        }

        @Override // f.h.c.b.a0.m
        public m l() {
            return this;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public interface y<K, V, E extends h<K, V, E>> extends h<K, V, E> {
        z<K, V, E> b();
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes.dex */
    public interface z<K, V, E extends h<K, V, E>> {
        E a();

        z<K, V, E> b(ReferenceQueue<V> referenceQueue, E e2);

        void clear();

        V get();
    }

    public a0(f.h.c.b.z zVar, i<K, V, E, S> iVar) {
        this.f5857j = (f.h.c.a.e) f.h.b.c.a.k0(null, zVar.a().a());
        this.f5858k = iVar;
        int min = Math.min(16, (int) CommonUtils.BYTES_IN_A_GIGABYTE);
        int i2 = 0;
        int i3 = 1;
        int i4 = 1;
        int i5 = 0;
        while (i4 < this.f5856i) {
            i5++;
            i4 <<= 1;
        }
        this.f5854g = 32 - i5;
        this.f5853f = i4 - 1;
        this.f5855h = new m[i4];
        int i6 = min / i4;
        while (i3 < (i4 * i6 < min ? i6 + 1 : i6)) {
            i3 <<= 1;
        }
        while (true) {
            m<K, V, E, S>[] mVarArr = this.f5855h;
            if (i2 >= mVarArr.length) {
                return;
            }
            mVarArr[i2] = this.f5858k.d(this, i3, -1);
            i2++;
        }
    }

    public static ArrayList a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        f.h.b.c.a.g(arrayList, collection.iterator());
        return arrayList;
    }

    public int b(Object obj) {
        f.h.c.a.e<Object> eVar = this.f5857j;
        Objects.requireNonNull(eVar);
        int b2 = eVar.b(obj);
        int i2 = b2 + ((b2 << 15) ^ (-12931));
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = (i5 << 2) + (i5 << 14) + i5;
        return (i6 >>> 16) ^ i6;
    }

    public m<K, V, E, S> c(int i2) {
        return this.f5855h[(i2 >>> this.f5854g) & this.f5853f];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m<K, V, E, S>[] mVarArr = this.f5855h;
        int length = mVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            m<K, V, E, S> mVar = mVarArr[i2];
            if (mVar.f5876g != 0) {
                mVar.lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = mVar.f5879j;
                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                        atomicReferenceArray.set(i3, null);
                    }
                    mVar.f();
                    mVar.f5881l.set(0);
                    mVar.f5877h++;
                    mVar.f5876g = 0;
                } finally {
                    mVar.unlock();
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        E e2;
        boolean z2 = false;
        if (obj == null) {
            return false;
        }
        int b2 = b(obj);
        m<K, V, E, S> c2 = c(b2);
        Objects.requireNonNull(c2);
        try {
            if (c2.f5876g != 0 && (e2 = c2.e(obj, b2)) != null) {
                if (e2.getValue() != null) {
                    z2 = true;
                }
            }
            return z2;
        } finally {
            c2.h();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Object value;
        if (obj == null) {
            return false;
        }
        m<K, V, E, S>[] mVarArr = this.f5855h;
        long j2 = -1;
        int i2 = 0;
        while (i2 < 3) {
            long j3 = 0;
            for (m<K, V, E, S> mVar : mVarArr) {
                int i3 = mVar.f5876g;
                AtomicReferenceArray<E> atomicReferenceArray = mVar.f5879j;
                for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                    for (E e2 = atomicReferenceArray.get(i4); e2 != null; e2 = e2.a()) {
                        if (e2.getKey() == null) {
                            mVar.n();
                        } else {
                            value = e2.getValue();
                            if (value == null) {
                                mVar.n();
                            }
                            if (value == null && d().c(obj, value)) {
                                return true;
                            }
                        }
                        value = null;
                        if (value == null) {
                        }
                    }
                }
                j3 += mVar.f5877h;
            }
            if (j3 == j2) {
                return false;
            }
            i2++;
            j2 = j3;
        }
        return false;
    }

    public f.h.c.a.e<Object> d() {
        return this.f5858k.b().a();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.n;
        if (set != null) {
            return set;
        }
        f fVar = new f();
        this.n = fVar;
        return fVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        V v2 = null;
        if (obj == null) {
            return null;
        }
        int b2 = b(obj);
        m<K, V, E, S> c2 = c(b2);
        Objects.requireNonNull(c2);
        try {
            E e2 = c2.e(obj, b2);
            if (e2 != null && (v2 = (V) e2.getValue()) == null) {
                c2.n();
            }
            return v2;
        } finally {
            c2.h();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        m<K, V, E, S>[] mVarArr = this.f5855h;
        long j2 = 0;
        for (int i2 = 0; i2 < mVarArr.length; i2++) {
            if (mVarArr[i2].f5876g != 0) {
                return false;
            }
            j2 += mVarArr[i2].f5877h;
        }
        if (j2 != 0) {
            for (int i3 = 0; i3 < mVarArr.length; i3++) {
                if (mVarArr[i3].f5876g != 0) {
                    return false;
                }
                j2 -= mVarArr[i3].f5877h;
            }
            return j2 == 0;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f5859l;
        if (set != null) {
            return set;
        }
        k kVar = new k();
        this.f5859l = kVar;
        return kVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v2) {
        Objects.requireNonNull(k2);
        Objects.requireNonNull(v2);
        int b2 = b(k2);
        return c(b2).i(k2, b2, v2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k2, V v2) {
        Objects.requireNonNull(k2);
        Objects.requireNonNull(v2);
        int b2 = b(k2);
        return c(b2).i(k2, b2, v2, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        r11 = (V) r7.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (r11 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r7.getValue() != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
        if (r1 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
        r2.f5877h++;
        r3.set(r4, r2.j(r6, r7));
        r2.f5876g--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
        return r11;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public V remove(java.lang.Object r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L4
            return r0
        L4:
            int r1 = r10.b(r11)
            f.h.c.b.a0$m r2 = r10.c(r1)
            r2.lock()
            r2.k()     // Catch: java.lang.Throwable -> L6b
            java.util.concurrent.atomic.AtomicReferenceArray<E extends f.h.c.b.a0$h<K, V, E>> r3 = r2.f5879j     // Catch: java.lang.Throwable -> L6b
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L6b
            r5 = 1
            int r4 = r4 - r5
            r4 = r4 & r1
            java.lang.Object r6 = r3.get(r4)     // Catch: java.lang.Throwable -> L6b
            f.h.c.b.a0$h r6 = (f.h.c.b.a0.h) r6     // Catch: java.lang.Throwable -> L6b
            r7 = r6
        L22:
            if (r7 == 0) goto L67
            java.lang.Object r8 = r7.getKey()     // Catch: java.lang.Throwable -> L6b
            int r9 = r7.getHash()     // Catch: java.lang.Throwable -> L6b
            if (r9 != r1) goto L62
            if (r8 == 0) goto L62
            f.h.c.b.a0<K, V, E extends f.h.c.b.a0$h<K, V, E>, S extends f.h.c.b.a0$m<K, V, E, S>> r9 = r2.f5875f     // Catch: java.lang.Throwable -> L6b
            f.h.c.a.e<java.lang.Object> r9 = r9.f5857j     // Catch: java.lang.Throwable -> L6b
            boolean r8 = r9.c(r11, r8)     // Catch: java.lang.Throwable -> L6b
            if (r8 == 0) goto L62
            java.lang.Object r11 = r7.getValue()     // Catch: java.lang.Throwable -> L6b
            if (r11 == 0) goto L41
            goto L4c
        L41:
            java.lang.Object r1 = r7.getValue()     // Catch: java.lang.Throwable -> L6b
            if (r1 != 0) goto L49
            r1 = 1
            goto L4a
        L49:
            r1 = 0
        L4a:
            if (r1 == 0) goto L67
        L4c:
            int r0 = r2.f5877h     // Catch: java.lang.Throwable -> L6b
            int r0 = r0 + r5
            r2.f5877h = r0     // Catch: java.lang.Throwable -> L6b
            f.h.c.b.a0$h r0 = r2.j(r6, r7)     // Catch: java.lang.Throwable -> L6b
            int r1 = r2.f5876g     // Catch: java.lang.Throwable -> L6b
            int r1 = r1 - r5
            r3.set(r4, r0)     // Catch: java.lang.Throwable -> L6b
            r2.f5876g = r1     // Catch: java.lang.Throwable -> L6b
            r2.unlock()
            r0 = r11
            goto L6a
        L62:
            f.h.c.b.a0$h r7 = r7.a()     // Catch: java.lang.Throwable -> L6b
            goto L22
        L67:
            r2.unlock()
        L6a:
            return r0
        L6b:
            r11 = move-exception
            r2.unlock()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.c.b.a0.remove(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
        return null;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public V replace(K r11, V r12) {
        /*
            r10 = this;
            java.util.Objects.requireNonNull(r11)
            java.util.Objects.requireNonNull(r12)
            int r0 = r10.b(r11)
            f.h.c.b.a0$m r1 = r10.c(r0)
            r1.lock()
            r1.k()     // Catch: java.lang.Throwable -> L7e
            java.util.concurrent.atomic.AtomicReferenceArray<E extends f.h.c.b.a0$h<K, V, E>> r2 = r1.f5879j     // Catch: java.lang.Throwable -> L7e
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L7e
            r4 = 1
            int r3 = r3 - r4
            r3 = r3 & r0
            java.lang.Object r5 = r2.get(r3)     // Catch: java.lang.Throwable -> L7e
            f.h.c.b.a0$h r5 = (f.h.c.b.a0.h) r5     // Catch: java.lang.Throwable -> L7e
            r6 = r5
        L24:
            r7 = 0
            if (r6 == 0) goto L7a
            java.lang.Object r8 = r6.getKey()     // Catch: java.lang.Throwable -> L7e
            int r9 = r6.getHash()     // Catch: java.lang.Throwable -> L7e
            if (r9 != r0) goto L75
            if (r8 == 0) goto L75
            f.h.c.b.a0<K, V, E extends f.h.c.b.a0$h<K, V, E>, S extends f.h.c.b.a0$m<K, V, E, S>> r9 = r1.f5875f     // Catch: java.lang.Throwable -> L7e
            f.h.c.a.e<java.lang.Object> r9 = r9.f5857j     // Catch: java.lang.Throwable -> L7e
            boolean r8 = r9.c(r11, r8)     // Catch: java.lang.Throwable -> L7e
            if (r8 == 0) goto L75
            java.lang.Object r11 = r6.getValue()     // Catch: java.lang.Throwable -> L7e
            if (r11 != 0) goto L60
            java.lang.Object r11 = r6.getValue()     // Catch: java.lang.Throwable -> L7e
            if (r11 != 0) goto L4b
            r11 = 1
            goto L4c
        L4b:
            r11 = 0
        L4c:
            if (r11 == 0) goto L7a
            int r11 = r1.f5877h     // Catch: java.lang.Throwable -> L7e
            int r11 = r11 + r4
            r1.f5877h = r11     // Catch: java.lang.Throwable -> L7e
            f.h.c.b.a0$h r11 = r1.j(r5, r6)     // Catch: java.lang.Throwable -> L7e
            int r12 = r1.f5876g     // Catch: java.lang.Throwable -> L7e
            int r12 = r12 - r4
            r2.set(r3, r11)     // Catch: java.lang.Throwable -> L7e
            r1.f5876g = r12     // Catch: java.lang.Throwable -> L7e
            goto L7a
        L60:
            int r0 = r1.f5877h     // Catch: java.lang.Throwable -> L7e
            int r0 = r0 + r4
            r1.f5877h = r0     // Catch: java.lang.Throwable -> L7e
            f.h.c.b.a0<K, V, E extends f.h.c.b.a0$h<K, V, E>, S extends f.h.c.b.a0$m<K, V, E, S>> r0 = r1.f5875f     // Catch: java.lang.Throwable -> L7e
            f.h.c.b.a0$i<K, V, E extends f.h.c.b.a0$h<K, V, E>, S extends f.h.c.b.a0$m<K, V, E, S>> r0 = r0.f5858k     // Catch: java.lang.Throwable -> L7e
            f.h.c.b.a0$m r2 = r1.l()     // Catch: java.lang.Throwable -> L7e
            r0.c(r2, r6, r12)     // Catch: java.lang.Throwable -> L7e
            r1.unlock()
            r7 = r11
            goto L7d
        L75:
            f.h.c.b.a0$h r6 = r6.a()     // Catch: java.lang.Throwable -> L7e
            goto L24
        L7a:
            r1.unlock()
        L7d:
            return r7
        L7e:
            r11 = move-exception
            r1.unlock()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.c.b.a0.replace(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j2 = 0;
        for (m<K, V, E, S> mVar : this.f5855h) {
            j2 += mVar.f5876g;
        }
        return f.h.b.c.a.S0(j2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f5860m;
        if (collection != null) {
            return collection;
        }
        t tVar = new t();
        this.f5860m = tVar;
        return tVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
        if (r2.f5875f.d().c(r12, r7.getValue()) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
        if (r7.getValue() != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
        if (r11 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
        r2.f5877h++;
        r3.set(r4, r2.j(r6, r7));
        r2.f5876g--;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean remove(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L7a
            if (r12 != 0) goto L7
            goto L7a
        L7:
            int r1 = r10.b(r11)
            f.h.c.b.a0$m r2 = r10.c(r1)
            r2.lock()
            r2.k()     // Catch: java.lang.Throwable -> L75
            java.util.concurrent.atomic.AtomicReferenceArray<E extends f.h.c.b.a0$h<K, V, E>> r3 = r2.f5879j     // Catch: java.lang.Throwable -> L75
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L75
            r5 = 1
            int r4 = r4 - r5
            r4 = r4 & r1
            java.lang.Object r6 = r3.get(r4)     // Catch: java.lang.Throwable -> L75
            f.h.c.b.a0$h r6 = (f.h.c.b.a0.h) r6     // Catch: java.lang.Throwable -> L75
            r7 = r6
        L25:
            if (r7 == 0) goto L71
            java.lang.Object r8 = r7.getKey()     // Catch: java.lang.Throwable -> L75
            int r9 = r7.getHash()     // Catch: java.lang.Throwable -> L75
            if (r9 != r1) goto L6c
            if (r8 == 0) goto L6c
            f.h.c.b.a0<K, V, E extends f.h.c.b.a0$h<K, V, E>, S extends f.h.c.b.a0$m<K, V, E, S>> r9 = r2.f5875f     // Catch: java.lang.Throwable -> L75
            f.h.c.a.e<java.lang.Object> r9 = r9.f5857j     // Catch: java.lang.Throwable -> L75
            boolean r8 = r9.c(r11, r8)     // Catch: java.lang.Throwable -> L75
            if (r8 == 0) goto L6c
            java.lang.Object r11 = r7.getValue()     // Catch: java.lang.Throwable -> L75
            f.h.c.b.a0<K, V, E extends f.h.c.b.a0$h<K, V, E>, S extends f.h.c.b.a0$m<K, V, E, S>> r1 = r2.f5875f     // Catch: java.lang.Throwable -> L75
            f.h.c.a.e r1 = r1.d()     // Catch: java.lang.Throwable -> L75
            boolean r11 = r1.c(r12, r11)     // Catch: java.lang.Throwable -> L75
            if (r11 == 0) goto L4f
            r0 = 1
            goto L5a
        L4f:
            java.lang.Object r11 = r7.getValue()     // Catch: java.lang.Throwable -> L75
            if (r11 != 0) goto L57
            r11 = 1
            goto L58
        L57:
            r11 = 0
        L58:
            if (r11 == 0) goto L71
        L5a:
            int r11 = r2.f5877h     // Catch: java.lang.Throwable -> L75
            int r11 = r11 + r5
            r2.f5877h = r11     // Catch: java.lang.Throwable -> L75
            f.h.c.b.a0$h r11 = r2.j(r6, r7)     // Catch: java.lang.Throwable -> L75
            int r12 = r2.f5876g     // Catch: java.lang.Throwable -> L75
            int r12 = r12 - r5
            r3.set(r4, r11)     // Catch: java.lang.Throwable -> L75
            r2.f5876g = r12     // Catch: java.lang.Throwable -> L75
            goto L71
        L6c:
            f.h.c.b.a0$h r7 = r7.a()     // Catch: java.lang.Throwable -> L75
            goto L25
        L71:
            r2.unlock()
            return r0
        L75:
            r11 = move-exception
            r2.unlock()
            throw r11
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.c.b.a0.remove(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k2, V v2, V v3) {
        Objects.requireNonNull(k2);
        Objects.requireNonNull(v3);
        if (v2 == null) {
            return false;
        }
        int b2 = b(k2);
        m<K, V, E, S> c2 = c(b2);
        c2.lock();
        try {
            c2.k();
            AtomicReferenceArray<E> atomicReferenceArray = c2.f5879j;
            int length = (atomicReferenceArray.length() - 1) & b2;
            E e2 = atomicReferenceArray.get(length);
            E e3 = e2;
            while (true) {
                if (e3 == null) {
                    break;
                }
                Object key = e3.getKey();
                if (e3.getHash() == b2 && key != null && c2.f5875f.f5857j.c(k2, key)) {
                    Object value = e3.getValue();
                    if (value == null) {
                        if (e3.getValue() == null) {
                            c2.f5877h++;
                            atomicReferenceArray.set(length, c2.j(e2, e3));
                            c2.f5876g--;
                        }
                    } else if (c2.f5875f.d().c(v2, value)) {
                        c2.f5877h++;
                        c2.f5875f.f5858k.c(c2.l(), e3, v3);
                        c2.unlock();
                        return true;
                    }
                } else {
                    e3 = (E) e3.a();
                }
            }
            return false;
        } finally {
            c2.unlock();
        }
    }
}
