package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.ActivityOptionsCompat;
import androidx.lifecycle.Lifecycle;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import e.s.k;
import e.s.m;
import e.s.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {
    public Random a = new Random();
    public final Map<Integer, String> b = new HashMap();
    public final Map<String, Integer> c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, d> f71d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<String> f72e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public final transient Map<String, c<?>> f73f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final Map<String, Object> f74g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public final Bundle f75h = new Bundle();

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* loaded from: classes.dex */
    public class a<I> extends e.a.e.b<I> {
        public final /* synthetic */ String a;
        public final /* synthetic */ int b;
        public final /* synthetic */ e.a.e.d.a c;

        public a(String str, int i2, e.a.e.d.a aVar) {
            this.a = str;
            this.b = i2;
            this.c = aVar;
        }

        @Override // e.a.e.b
        public void a(I i2, ActivityOptionsCompat activityOptionsCompat) {
            ActivityResultRegistry.this.f72e.add(this.a);
            Integer num = ActivityResultRegistry.this.c.get(this.a);
            ActivityResultRegistry.this.b(num != null ? num.intValue() : this.b, this.c, i2, activityOptionsCompat);
        }

        @Override // e.a.e.b
        public void b() {
            ActivityResultRegistry.this.f(this.a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* loaded from: classes.dex */
    public class b<I> extends e.a.e.b<I> {
        public final /* synthetic */ String a;
        public final /* synthetic */ int b;
        public final /* synthetic */ e.a.e.d.a c;

        public b(String str, int i2, e.a.e.d.a aVar) {
            this.a = str;
            this.b = i2;
            this.c = aVar;
        }

        @Override // e.a.e.b
        public void a(I i2, ActivityOptionsCompat activityOptionsCompat) {
            ActivityResultRegistry.this.f72e.add(this.a);
            Integer num = ActivityResultRegistry.this.c.get(this.a);
            ActivityResultRegistry.this.b(num != null ? num.intValue() : this.b, this.c, i2, activityOptionsCompat);
        }

        @Override // e.a.e.b
        public void b() {
            ActivityResultRegistry.this.f(this.a);
        }
    }

    /* loaded from: classes.dex */
    public static class c<O> {
        public final e.a.e.a<O> a;
        public final e.a.e.d.a<?, O> b;

        public c(e.a.e.a<O> aVar, e.a.e.d.a<?, O> aVar2) {
            this.a = aVar;
            this.b = aVar2;
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public final Lifecycle a;
        public final ArrayList<k> b = new ArrayList<>();

        public d(Lifecycle lifecycle) {
            this.a = lifecycle;
        }
    }

    public final boolean a(int i2, int i3, Intent intent) {
        e.a.e.a<?> aVar;
        String str = this.b.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        this.f72e.remove(str);
        c<?> cVar = this.f73f.get(str);
        if (cVar != null && (aVar = cVar.a) != null) {
            aVar.a(cVar.b.c(i3, intent));
            return true;
        }
        this.f74g.remove(str);
        this.f75h.putParcelable(str, new ActivityResult(i3, intent));
        return true;
    }

    public abstract <I, O> void b(int i2, e.a.e.d.a<I, O> aVar, I i3, ActivityOptionsCompat activityOptionsCompat);

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> e.a.e.b<I> c(String str, e.a.e.d.a<I, O> aVar, e.a.e.a<O> aVar2) {
        int e2 = e(str);
        this.f73f.put(str, new c<>(aVar2, aVar));
        if (this.f74g.containsKey(str)) {
            Object obj = this.f74g.get(str);
            this.f74g.remove(str);
            aVar2.a(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f75h.getParcelable(str);
        if (activityResult != null) {
            this.f75h.remove(str);
            aVar2.a(aVar.c(activityResult.f69f, activityResult.f70g));
        }
        return new b(str, e2, aVar);
    }

    public final <I, O> e.a.e.b<I> d(final String str, m mVar, final e.a.e.d.a<I, O> aVar, final e.a.e.a<O> aVar2) {
        Lifecycle lifecycle = mVar.getLifecycle();
        if (!((n) lifecycle).b.isAtLeast(Lifecycle.State.STARTED)) {
            int e2 = e(str);
            d dVar = this.f71d.get(str);
            if (dVar == null) {
                dVar = new d(lifecycle);
            }
            k kVar = new k() { // from class: androidx.activity.result.ActivityResultRegistry.1
                @Override // e.s.k
                public void d(m mVar2, Lifecycle.Event event) {
                    if (Lifecycle.Event.ON_START.equals(event)) {
                        ActivityResultRegistry.this.f73f.put(str, new c<>(aVar2, aVar));
                        if (ActivityResultRegistry.this.f74g.containsKey(str)) {
                            Object obj = ActivityResultRegistry.this.f74g.get(str);
                            ActivityResultRegistry.this.f74g.remove(str);
                            aVar2.a(obj);
                        }
                        ActivityResult activityResult = (ActivityResult) ActivityResultRegistry.this.f75h.getParcelable(str);
                        if (activityResult != null) {
                            ActivityResultRegistry.this.f75h.remove(str);
                            aVar2.a(aVar.c(activityResult.f69f, activityResult.f70g));
                        }
                    } else if (Lifecycle.Event.ON_STOP.equals(event)) {
                        ActivityResultRegistry.this.f73f.remove(str);
                    } else if (Lifecycle.Event.ON_DESTROY.equals(event)) {
                        ActivityResultRegistry.this.f(str);
                    }
                }
            };
            dVar.a.a(kVar);
            dVar.b.add(kVar);
            this.f71d.put(str, dVar);
            return new a(str, e2, aVar);
        }
        throw new IllegalStateException("LifecycleOwner " + mVar + " is attempting to register while current state is " + ((n) lifecycle).b + ". LifecycleOwners must call register before they are STARTED.");
    }

    public final int e(String str) {
        Integer num = this.c.get(str);
        if (num != null) {
            return num.intValue();
        }
        int nextInt = this.a.nextInt(2147418112);
        while (true) {
            int i2 = nextInt + LogFileManager.MAX_LOG_SIZE;
            if (this.b.containsKey(Integer.valueOf(i2))) {
                nextInt = this.a.nextInt(2147418112);
            } else {
                this.b.put(Integer.valueOf(i2), str);
                this.c.put(str, Integer.valueOf(i2));
                return i2;
            }
        }
    }

    public final void f(String str) {
        Integer remove;
        if (!this.f72e.contains(str) && (remove = this.c.remove(str)) != null) {
            this.b.remove(remove);
        }
        this.f73f.remove(str);
        if (this.f74g.containsKey(str)) {
            StringBuilder E = f.a.b.a.a.E("Dropping pending result for request ", str, ": ");
            E.append(this.f74g.get(str));
            Log.w("ActivityResultRegistry", E.toString());
            this.f74g.remove(str);
        }
        if (this.f75h.containsKey(str)) {
            StringBuilder E2 = f.a.b.a.a.E("Dropping pending result for request ", str, ": ");
            E2.append(this.f75h.getParcelable(str));
            Log.w("ActivityResultRegistry", E2.toString());
            this.f75h.remove(str);
        }
        d dVar = this.f71d.get(str);
        if (dVar != null) {
            Iterator<k> it = dVar.b.iterator();
            while (it.hasNext()) {
                dVar.a.b(it.next());
            }
            dVar.b.clear();
            this.f71d.remove(str);
        }
    }
}
