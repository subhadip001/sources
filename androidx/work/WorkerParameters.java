package androidx.work;

import android.net.Network;
import android.net.Uri;
import e.g0.e;
import e.g0.g;
import e.g0.n;
import e.g0.s;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class WorkerParameters {
    public UUID a;
    public e b;
    public Set<String> c;

    /* renamed from: d  reason: collision with root package name */
    public a f632d;

    /* renamed from: e  reason: collision with root package name */
    public int f633e;

    /* renamed from: f  reason: collision with root package name */
    public Executor f634f;

    /* renamed from: g  reason: collision with root package name */
    public e.g0.t.t.t.a f635g;

    /* renamed from: h  reason: collision with root package name */
    public s f636h;

    /* renamed from: i  reason: collision with root package name */
    public n f637i;

    /* renamed from: j  reason: collision with root package name */
    public g f638j;

    /* loaded from: classes.dex */
    public static class a {
        public List<String> a = Collections.emptyList();
        public List<Uri> b = Collections.emptyList();
        public Network c;
    }

    public WorkerParameters(UUID uuid, e eVar, Collection<String> collection, a aVar, int i2, Executor executor, e.g0.t.t.t.a aVar2, s sVar, n nVar, g gVar) {
        this.a = uuid;
        this.b = eVar;
        this.c = new HashSet(collection);
        this.f632d = aVar;
        this.f633e = i2;
        this.f634f = executor;
        this.f635g = aVar2;
        this.f636h = sVar;
        this.f637i = nVar;
        this.f638j = gVar;
    }
}
