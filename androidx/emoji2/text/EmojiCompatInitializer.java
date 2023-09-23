package androidx.emoji2.text;

import android.content.Context;
import android.os.Trace;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleInitializer;
import e.n.a.h;
import e.n.a.m;
import e.s.d;
import e.s.e;
import e.s.n;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements e.y.b<Boolean> {

    /* loaded from: classes.dex */
    public static class a extends h.c {
        public a(Context context) {
            super(new b(context));
            this.b = 1;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements h.g {
        public final Context a;

        public b(Context context) {
            this.a = context.getApplicationContext();
        }

        @Override // e.n.a.h.g
        public void a(final h.AbstractC0050h abstractC0050h) {
            final ThreadPoolExecutor t = e.i.a.t("EmojiCompatInitializer");
            t.execute(new Runnable() { // from class: e.n.a.c
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.b bVar = EmojiCompatInitializer.b.this;
                    h.AbstractC0050h abstractC0050h2 = abstractC0050h;
                    ThreadPoolExecutor threadPoolExecutor = t;
                    Objects.requireNonNull(bVar);
                    try {
                        m s = e.i.a.s(bVar.a);
                        if (s != null) {
                            m.b bVar2 = (m.b) s.a;
                            synchronized (bVar2.f2634d) {
                                bVar2.f2636f = threadPoolExecutor;
                            }
                            s.a.a(new i(bVar, abstractC0050h2, threadPoolExecutor));
                            return;
                        }
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    } catch (Throwable th) {
                        abstractC0050h2.a(th);
                        threadPoolExecutor.shutdown();
                    }
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                int i2 = e.i.f.h.a;
                Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                if (h.c()) {
                    h.a().e();
                }
                Trace.endSection();
            } catch (Throwable th) {
                int i3 = e.i.f.h.a;
                Trace.endSection();
                throw th;
            }
        }
    }

    @Override // e.y.b
    public /* bridge */ /* synthetic */ Boolean a(Context context) {
        b(context);
        return Boolean.TRUE;
    }

    public Boolean b(Context context) {
        Object obj;
        a aVar = new a(context);
        if (h.f2615k == null) {
            synchronized (h.f2614j) {
                if (h.f2615k == null) {
                    h.f2615k = new h(aVar);
                }
            }
        }
        e.y.a c2 = e.y.a.c(context);
        Objects.requireNonNull(c2);
        synchronized (e.y.a.f3013e) {
            obj = c2.a.get(ProcessLifecycleInitializer.class);
            if (obj == null) {
                obj = c2.b(ProcessLifecycleInitializer.class, new HashSet());
            }
        }
        final Lifecycle lifecycle = ((e.s.m) obj).getLifecycle();
        lifecycle.a(new e() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // e.s.g
            public void a(e.s.m mVar) {
                Objects.requireNonNull(EmojiCompatInitializer.this);
                e.i.a.M().postDelayed(new c(), 500L);
                n nVar = (n) lifecycle;
                nVar.d("removeObserver");
                nVar.a.e(this);
            }

            @Override // e.s.g
            public /* synthetic */ void b(e.s.m mVar) {
                d.a(this, mVar);
            }

            @Override // e.s.g
            public /* synthetic */ void e(e.s.m mVar) {
                d.c(this, mVar);
            }

            @Override // e.s.g
            public /* synthetic */ void onDestroy(e.s.m mVar) {
                d.b(this, mVar);
            }

            @Override // e.s.g
            public /* synthetic */ void onStart(e.s.m mVar) {
                d.d(this, mVar);
            }

            @Override // e.s.g
            public /* synthetic */ void onStop(e.s.m mVar) {
                d.e(this, mVar);
            }
        });
        return Boolean.TRUE;
    }

    @Override // e.y.b
    public List<Class<? extends e.y.b<?>>> dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
