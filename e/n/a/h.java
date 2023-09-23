package e.n.a;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.inputmethod.EditorInfo;
import com.google.android.gms.common.api.Api;
import e.n.a.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: EmojiCompat.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: j  reason: collision with root package name */
    public static final Object f2614j = new Object();

    /* renamed from: k  reason: collision with root package name */
    public static volatile h f2615k;
    public final ReadWriteLock a;
    public final Set<e> b;
    public volatile int c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f2616d;

    /* renamed from: e  reason: collision with root package name */
    public final b f2617e;

    /* renamed from: f  reason: collision with root package name */
    public final g f2618f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2619g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2620h;

    /* renamed from: i  reason: collision with root package name */
    public final d f2621i;

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static final class a extends b {
        public volatile k b;
        public volatile n c;

        /* compiled from: EmojiCompat.java */
        /* renamed from: e.n.a.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0049a extends AbstractC0050h {
            public C0049a() {
            }

            @Override // e.n.a.h.AbstractC0050h
            public void a(Throwable th) {
                a.this.a.f(th);
            }

            @Override // e.n.a.h.AbstractC0050h
            public void b(n nVar) {
                a aVar = a.this;
                if (nVar == null) {
                    aVar.a.f(new IllegalArgumentException("metadataRepo cannot be null"));
                    return;
                }
                aVar.c = nVar;
                n nVar2 = aVar.c;
                i iVar = new i();
                h hVar = aVar.a;
                d dVar = hVar.f2621i;
                Objects.requireNonNull(hVar);
                aVar.b = new k(nVar2, iVar, dVar, false, null);
                aVar.a.g();
            }
        }

        public a(h hVar) {
            super(hVar);
        }

        @Override // e.n.a.h.b
        public void a() {
            try {
                this.a.f2618f.a(new C0049a());
            } catch (Throwable th) {
                this.a.f(th);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:88:0x014c, code lost:
            return r17;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0053 A[Catch: all -> 0x014d, TryCatch #0 {all -> 0x014d, blocks: (B:7:0x001c, B:10:0x0021, B:12:0x0025, B:14:0x0034, B:19:0x0042, B:21:0x004c, B:23:0x004f, B:25:0x0053, B:27:0x005f, B:28:0x0062, B:30:0x006f, B:36:0x007e, B:37:0x008c, B:42:0x00a4, B:49:0x00b2, B:52:0x00be, B:53:0x00c3, B:55:0x00d9, B:57:0x00e0, B:58:0x00e5, B:60:0x00f0, B:63:0x00f7, B:65:0x00fb, B:67:0x0101, B:69:0x0105, B:76:0x0114, B:79:0x0120, B:80:0x0126, B:16:0x003c), top: B:93:0x001c }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00e5 A[Catch: all -> 0x014d, TryCatch #0 {all -> 0x014d, blocks: (B:7:0x001c, B:10:0x0021, B:12:0x0025, B:14:0x0034, B:19:0x0042, B:21:0x004c, B:23:0x004f, B:25:0x0053, B:27:0x005f, B:28:0x0062, B:30:0x006f, B:36:0x007e, B:37:0x008c, B:42:0x00a4, B:49:0x00b2, B:52:0x00be, B:53:0x00c3, B:55:0x00d9, B:57:0x00e0, B:58:0x00e5, B:60:0x00f0, B:63:0x00f7, B:65:0x00fb, B:67:0x0101, B:69:0x0105, B:76:0x0114, B:79:0x0120, B:80:0x0126, B:16:0x003c), top: B:93:0x001c }] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0120 A[Catch: all -> 0x014d, TryCatch #0 {all -> 0x014d, blocks: (B:7:0x001c, B:10:0x0021, B:12:0x0025, B:14:0x0034, B:19:0x0042, B:21:0x004c, B:23:0x004f, B:25:0x0053, B:27:0x005f, B:28:0x0062, B:30:0x006f, B:36:0x007e, B:37:0x008c, B:42:0x00a4, B:49:0x00b2, B:52:0x00be, B:53:0x00c3, B:55:0x00d9, B:57:0x00e0, B:58:0x00e5, B:60:0x00f0, B:63:0x00f7, B:65:0x00fb, B:67:0x0101, B:69:0x0105, B:76:0x0114, B:79:0x0120, B:80:0x0126, B:16:0x003c), top: B:93:0x001c }] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x013c  */
        /* JADX WARN: Type inference failed for: r8v10 */
        @Override // e.n.a.h.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.CharSequence b(java.lang.CharSequence r17, int r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instructions count: 342
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: e.n.a.h.a.b(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
        }

        @Override // e.n.a.h.b
        public void c(EditorInfo editorInfo) {
            Bundle bundle = editorInfo.extras;
            e.n.a.q.b bVar = this.c.a;
            int a = bVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a != 0 ? bVar.b.getInt(a + bVar.a) : 0);
            Bundle bundle2 = editorInfo.extras;
            Objects.requireNonNull(this.a);
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public final h a;

        public b(h hVar) {
            this.a = hVar;
        }

        public void a() {
            throw null;
        }

        public CharSequence b(CharSequence charSequence, int i2, int i3, int i4, boolean z) {
            throw null;
        }

        public void c(EditorInfo editorInfo) {
            throw null;
        }
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static abstract class c {
        public final g a;
        public int b = 0;
        public d c = new k.a();

        public c(g gVar) {
            e.i.a.i(gVar, "metadataLoader cannot be null.");
            this.a = gVar;
        }
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public interface d {
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static abstract class e {
        public void a(Throwable th) {
        }

        public void b() {
        }
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static class f implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final List<e> f2622f;

        /* renamed from: g  reason: collision with root package name */
        public final Throwable f2623g;

        /* renamed from: h  reason: collision with root package name */
        public final int f2624h;

        public f(Collection<e> collection, int i2, Throwable th) {
            e.i.a.i(collection, "initCallbacks cannot be null");
            this.f2622f = new ArrayList(collection);
            this.f2624h = i2;
            this.f2623g = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f2622f.size();
            int i2 = 0;
            if (this.f2624h != 1) {
                while (i2 < size) {
                    this.f2622f.get(i2).a(this.f2623g);
                    i2++;
                }
                return;
            }
            while (i2 < size) {
                this.f2622f.get(i2).b();
                i2++;
            }
        }
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public interface g {
        void a(AbstractC0050h abstractC0050h);
    }

    /* compiled from: EmojiCompat.java */
    /* renamed from: e.n.a.h$h  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0050h {
        public abstract void a(Throwable th);

        public abstract void b(n nVar);
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static class i {
    }

    public h(c cVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        Objects.requireNonNull(cVar);
        this.f2619g = -16711936;
        this.f2618f = cVar.a;
        int i2 = cVar.b;
        this.f2620h = i2;
        this.f2621i = cVar.c;
        this.f2616d = new Handler(Looper.getMainLooper());
        this.b = new e.f.c(0);
        a aVar = new a(this);
        this.f2617e = aVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i2 == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            aVar.a();
        }
    }

    public static h a() {
        h hVar;
        synchronized (f2614j) {
            hVar = f2615k;
            e.i.a.k(hVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return hVar;
    }

    public static boolean c() {
        return f2615k != null;
    }

    public int b() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final boolean d() {
        return b() == 1;
    }

    public void e() {
        e.i.a.k(this.f2620h == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (d()) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            this.f2617e.a();
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.f2616d.post(new f(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public void g() {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 1;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.f2616d.post(new f(arrayList, this.c, null));
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, 0, charSequence == null ? 0 : charSequence.length(), Api.BaseClientBuilder.API_PRIORITY_OTHER, 0);
    }

    public CharSequence i(CharSequence charSequence, int i2, int i3, int i4, int i5) {
        e.i.a.k(d(), "Not initialized yet");
        e.i.a.h(i2, "start cannot be negative");
        e.i.a.h(i3, "end cannot be negative");
        e.i.a.h(i4, "maxEmojiCount cannot be negative");
        e.i.a.f(i2 <= i3, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        e.i.a.f(i2 <= charSequence.length(), "start should be < than charSequence length");
        e.i.a.f(i3 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i2 == i3) {
            return charSequence;
        }
        return this.f2617e.b(charSequence, i2, i3, i4, i5 == 1);
    }

    public void j(e eVar) {
        e.i.a.i(eVar, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c != 1 && this.c != 2) {
                this.b.add(eVar);
            }
            Handler handler = this.f2616d;
            int i2 = this.c;
            e.i.a.i(eVar, "initCallback cannot be null");
            handler.post(new f(Arrays.asList(eVar), i2, null));
        } finally {
            this.a.writeLock().unlock();
        }
    }
}
