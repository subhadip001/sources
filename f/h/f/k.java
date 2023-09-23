package f.h.f;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.LongSerializationPolicy;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: GsonBuilder.java */
/* loaded from: classes2.dex */
public final class k {
    public f.h.f.z.o a = f.h.f.z.o.f6246h;
    public LongSerializationPolicy b = LongSerializationPolicy.DEFAULT;
    public d c = FieldNamingPolicy.IDENTITY;

    /* renamed from: d  reason: collision with root package name */
    public final Map<Type, l<?>> f6232d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final List<x> f6233e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final List<x> f6234f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public int f6235g = 2;

    /* renamed from: h  reason: collision with root package name */
    public int f6236h = 2;

    /* renamed from: i  reason: collision with root package name */
    public boolean f6237i = true;

    public j a() {
        ArrayList arrayList = new ArrayList(this.f6234f.size() + this.f6233e.size() + 3);
        arrayList.addAll(this.f6233e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f6234f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        int i2 = this.f6235g;
        int i3 = this.f6236h;
        if (i2 != 2 && i3 != 2) {
            a aVar = new a(Date.class, i2, i3);
            a aVar2 = new a(Timestamp.class, i2, i3);
            a aVar3 = new a(java.sql.Date.class, i2, i3);
            w<Class> wVar = f.h.f.z.z.o.a;
            arrayList.add(new f.h.f.z.z.q(Date.class, aVar));
            arrayList.add(new f.h.f.z.z.q(Timestamp.class, aVar2));
            arrayList.add(new f.h.f.z.z.q(java.sql.Date.class, aVar3));
        }
        return new j(this.a, this.c, this.f6232d, false, false, false, this.f6237i, false, false, false, this.b, null, this.f6235g, this.f6236h, this.f6233e, this.f6234f, arrayList);
    }
}
