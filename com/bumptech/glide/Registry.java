package com.bumptech.glide;

import com.bumptech.glide.load.ImageHeaderParser;
import f.e.a.l.m;
import f.e.a.l.p.e;
import f.e.a.l.r.n;
import f.e.a.l.r.o;
import f.e.a.l.r.p;
import f.e.a.l.r.r;
import f.e.a.l.s.h.f;
import f.e.a.o.a;
import f.e.a.o.b;
import f.e.a.o.c;
import f.e.a.o.d;
import f.e.a.o.e;
import f.e.a.o.f;
import f.e.a.r.m.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class Registry {
    public final p a;
    public final a b;
    public final e c;

    /* renamed from: d  reason: collision with root package name */
    public final f f675d;

    /* renamed from: e  reason: collision with root package name */
    public final f.e.a.l.p.f f676e;

    /* renamed from: f  reason: collision with root package name */
    public final f.e.a.l.s.h.f f677f;

    /* renamed from: g  reason: collision with root package name */
    public final b f678g;

    /* renamed from: h  reason: collision with root package name */
    public final d f679h = new d();

    /* renamed from: i  reason: collision with root package name */
    public final c f680i = new c();

    /* renamed from: j  reason: collision with root package name */
    public final e.i.i.c<List<Throwable>> f681j;

    /* loaded from: classes.dex */
    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    /* loaded from: classes.dex */
    public static class NoModelLoaderAvailableException extends MissingComponentException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public NoModelLoaderAvailableException(java.lang.Object r2) {
            /*
                r1 = this;
                java.lang.String r0 = "Failed to find any ModelLoaders registered for model class: "
                java.lang.StringBuilder r0 = f.a.b.a.a.A(r0)
                java.lang.Class r2 = r2.getClass()
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.Registry.NoModelLoaderAvailableException.<init>(java.lang.Object):void");
        }

        public <M> NoModelLoaderAvailableException(M m2, List<n<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m2);
        }

        public NoModelLoaderAvailableException(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    /* loaded from: classes.dex */
    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* loaded from: classes.dex */
    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        a.c cVar = new a.c(new e.i.i.e(20), new f.e.a.r.m.b(), new f.e.a.r.m.c());
        this.f681j = cVar;
        this.a = new p(cVar);
        this.b = new f.e.a.o.a();
        this.c = new e();
        this.f675d = new f();
        this.f676e = new f.e.a.l.p.f();
        this.f677f = new f.e.a.l.s.h.f();
        this.f678g = new b();
        List<String> asList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        for (String str : asList) {
            arrayList.add(str);
        }
        arrayList.add("legacy_append");
        e eVar = this.c;
        synchronized (eVar) {
            ArrayList arrayList2 = new ArrayList(eVar.a);
            eVar.a.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                eVar.a.add((String) it.next());
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                if (!arrayList.contains(str2)) {
                    eVar.a.add(str2);
                }
            }
        }
    }

    public <Data> Registry a(Class<Data> cls, f.e.a.l.a<Data> aVar) {
        f.e.a.o.a aVar2 = this.b;
        synchronized (aVar2) {
            aVar2.a.add(new a.C0089a<>(cls, aVar));
        }
        return this;
    }

    public <TResource> Registry b(Class<TResource> cls, f.e.a.l.n<TResource> nVar) {
        f fVar = this.f675d;
        synchronized (fVar) {
            fVar.a.add(new f.a<>(cls, nVar));
        }
        return this;
    }

    public <Model, Data> Registry c(Class<Model> cls, Class<Data> cls2, o<Model, Data> oVar) {
        p pVar = this.a;
        synchronized (pVar) {
            r rVar = pVar.a;
            synchronized (rVar) {
                r.b<?, ?> bVar = new r.b<>(cls, cls2, oVar);
                List<r.b<?, ?>> list = rVar.a;
                list.add(list.size(), bVar);
            }
            pVar.b.a.clear();
        }
        return this;
    }

    public <Data, TResource> Registry d(String str, Class<Data> cls, Class<TResource> cls2, m<Data, TResource> mVar) {
        e eVar = this.c;
        synchronized (eVar) {
            eVar.a(str).add(new e.a<>(cls, cls2, mVar));
        }
        return this;
    }

    public List<ImageHeaderParser> e() {
        List<ImageHeaderParser> list;
        b bVar = this.f678g;
        synchronized (bVar) {
            list = bVar.a;
        }
        if (list.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return list;
    }

    public <Model> List<n<Model, ?>> f(Model model) {
        List<n<?, ?>> list;
        p pVar = this.a;
        Objects.requireNonNull(pVar);
        Class<?> cls = model.getClass();
        synchronized (pVar) {
            p.a.C0082a<?> c0082a = pVar.b.a.get(cls);
            list = c0082a == null ? null : c0082a.a;
            if (list == null) {
                list = Collections.unmodifiableList(pVar.a.c(cls));
                if (pVar.b.a.put(cls, new p.a.C0082a<>(list)) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (!list.isEmpty()) {
            int size = list.size();
            List<n<Model, ?>> emptyList = Collections.emptyList();
            boolean z = true;
            for (int i2 = 0; i2 < size; i2++) {
                n<?, ?> nVar = list.get(i2);
                if (nVar.a(model)) {
                    if (z) {
                        emptyList = new ArrayList<>(size - i2);
                        z = false;
                    }
                    emptyList.add(nVar);
                }
            }
            if (emptyList.isEmpty()) {
                throw new NoModelLoaderAvailableException(model, (List<n<Model, ?>>) list);
            }
            return emptyList;
        }
        throw new NoModelLoaderAvailableException(model);
    }

    public <X> f.e.a.l.p.e<X> g(X x) {
        f.e.a.l.p.e<X> eVar;
        f.e.a.l.p.f fVar = this.f676e;
        synchronized (fVar) {
            Objects.requireNonNull(x, "Argument must not be null");
            e.a<?> aVar = fVar.a.get(x.getClass());
            if (aVar == null) {
                Iterator<e.a<?>> it = fVar.a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    e.a<?> next = it.next();
                    if (next.a().isAssignableFrom(x.getClass())) {
                        aVar = next;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = f.e.a.l.p.f.b;
            }
            eVar = (f.e.a.l.p.e<X>) aVar.b(x);
        }
        return eVar;
    }

    public Registry h(e.a<?> aVar) {
        f.e.a.l.p.f fVar = this.f676e;
        synchronized (fVar) {
            fVar.a.put(aVar.a(), aVar);
        }
        return this;
    }

    public <TResource, Transcode> Registry i(Class<TResource> cls, Class<Transcode> cls2, f.e.a.l.s.h.e<TResource, Transcode> eVar) {
        f.e.a.l.s.h.f fVar = this.f677f;
        synchronized (fVar) {
            fVar.a.add(new f.a<>(cls, cls2, eVar));
        }
        return this;
    }
}
