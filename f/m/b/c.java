package f.m.b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;
import f.m.b.q;
import f.m.b.x;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

/* compiled from: BitmapHunter.java */
/* loaded from: classes2.dex */
public class c implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final int f6829f = A.incrementAndGet();

    /* renamed from: g  reason: collision with root package name */
    public final Picasso f6830g;

    /* renamed from: h  reason: collision with root package name */
    public final i f6831h;

    /* renamed from: i  reason: collision with root package name */
    public final f.m.b.d f6832i;

    /* renamed from: j  reason: collision with root package name */
    public final z f6833j;

    /* renamed from: k  reason: collision with root package name */
    public final String f6834k;

    /* renamed from: l  reason: collision with root package name */
    public final v f6835l;

    /* renamed from: m  reason: collision with root package name */
    public final int f6836m;
    public int n;
    public final x o;
    public f.m.b.a p;
    public List<f.m.b.a> q;
    public Bitmap r;
    public Future<?> s;
    public Picasso.LoadedFrom t;
    public Exception u;
    public int v;
    public int w;
    public Picasso.Priority x;
    public static final Object y = new Object();
    public static final ThreadLocal<StringBuilder> z = new a();
    public static final AtomicInteger A = new AtomicInteger();
    public static final x B = new b();

    /* compiled from: BitmapHunter.java */
    /* loaded from: classes2.dex */
    public static class a extends ThreadLocal<StringBuilder> {
        @Override // java.lang.ThreadLocal
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    /* compiled from: BitmapHunter.java */
    /* loaded from: classes2.dex */
    public static class b extends x {
        @Override // f.m.b.x
        public boolean c(v vVar) {
            return true;
        }

        @Override // f.m.b.x
        public x.a f(v vVar, int i2) {
            throw new IllegalStateException("Unrecognized type of request: " + vVar);
        }
    }

    /* compiled from: BitmapHunter.java */
    /* renamed from: f.m.b.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class RunnableC0167c implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ b0 f6837f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ RuntimeException f6838g;

        public RunnableC0167c(b0 b0Var, RuntimeException runtimeException) {
            this.f6837f = b0Var;
            this.f6838g = runtimeException;
        }

        @Override // java.lang.Runnable
        public void run() {
            StringBuilder A = f.a.b.a.a.A("Transformation ");
            A.append(this.f6837f.b());
            A.append(" crashed with exception.");
            throw new RuntimeException(A.toString(), this.f6838g);
        }
    }

    /* compiled from: BitmapHunter.java */
    /* loaded from: classes2.dex */
    public static class d implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ StringBuilder f6839f;

        public d(StringBuilder sb) {
            this.f6839f = sb;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new NullPointerException(this.f6839f.toString());
        }
    }

    /* compiled from: BitmapHunter.java */
    /* loaded from: classes2.dex */
    public static class e implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ b0 f6840f;

        public e(b0 b0Var) {
            this.f6840f = b0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            StringBuilder A = f.a.b.a.a.A("Transformation ");
            A.append(this.f6840f.b());
            A.append(" returned input Bitmap but recycled it.");
            throw new IllegalStateException(A.toString());
        }
    }

    /* compiled from: BitmapHunter.java */
    /* loaded from: classes2.dex */
    public static class f implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ b0 f6841f;

        public f(b0 b0Var) {
            this.f6841f = b0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            StringBuilder A = f.a.b.a.a.A("Transformation ");
            A.append(this.f6841f.b());
            A.append(" mutated input Bitmap but failed to recycle the original.");
            throw new IllegalStateException(A.toString());
        }
    }

    public c(Picasso picasso, i iVar, f.m.b.d dVar, z zVar, f.m.b.a aVar, x xVar) {
        this.f6830g = picasso;
        this.f6831h = iVar;
        this.f6832i = dVar;
        this.f6833j = zVar;
        this.p = aVar;
        this.f6834k = aVar.f6815i;
        v vVar = aVar.b;
        this.f6835l = vVar;
        this.x = vVar.r;
        this.f6836m = aVar.f6811e;
        this.n = aVar.f6812f;
        this.o = xVar;
        this.w = xVar.e();
    }

    public static Bitmap a(List<b0> list, Bitmap bitmap) {
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            b0 b0Var = list.get(i2);
            try {
                Bitmap a2 = b0Var.a(bitmap);
                if (a2 == null) {
                    StringBuilder A2 = f.a.b.a.a.A("Transformation ");
                    A2.append(b0Var.b());
                    A2.append(" returned null after ");
                    A2.append(i2);
                    A2.append(" previous transformation(s).\n\nTransformation list:\n");
                    for (b0 b0Var2 : list) {
                        A2.append(b0Var2.b());
                        A2.append('\n');
                    }
                    Picasso.o.post(new d(A2));
                    return null;
                } else if (a2 == bitmap && bitmap.isRecycled()) {
                    Picasso.o.post(new e(b0Var));
                    return null;
                } else if (a2 != bitmap && !bitmap.isRecycled()) {
                    Picasso.o.post(new f(b0Var));
                    return null;
                } else {
                    i2++;
                    bitmap = a2;
                }
            } catch (RuntimeException e2) {
                Picasso.o.post(new RunnableC0167c(b0Var, e2));
                return null;
            }
        }
        return bitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Bitmap c(l.y yVar, v vVar) {
        Logger logger = l.o.a;
        l.t tVar = new l.t(yVar);
        boolean z2 = tVar.f(0L, d0.b) && tVar.f(8L, d0.c);
        boolean z3 = vVar.p;
        BitmapFactory.Options d2 = x.d(vVar);
        boolean z4 = d2 != null && d2.inJustDecodeBounds;
        if (!z2) {
            l.s sVar = new l.s(tVar);
            if (z4) {
                o oVar = new o(sVar);
                oVar.f6862k = false;
                long j2 = oVar.f6858g + 1024;
                if (oVar.f6860i < j2) {
                    oVar.f(j2);
                }
                long j3 = oVar.f6858g;
                BitmapFactory.decodeStream(oVar, null, d2);
                x.b(vVar.f6882f, vVar.f6883g, d2, vVar);
                oVar.a(j3);
                oVar.f6862k = true;
                sVar = oVar;
            }
            Bitmap decodeStream = BitmapFactory.decodeStream(sVar, null, d2);
            if (decodeStream != null) {
                return decodeStream;
            }
            throw new IOException("Failed to decode stream.");
        }
        tVar.f9257f.i0(tVar.f9258g);
        byte[] v = tVar.f9257f.v();
        if (z4) {
            BitmapFactory.decodeByteArray(v, 0, v.length, d2);
            x.b(vVar.f6882f, vVar.f6883g, d2, vVar);
        }
        return BitmapFactory.decodeByteArray(v, 0, v.length, d2);
    }

    public static boolean f(boolean z2, int i2, int i3, int i4, int i5) {
        return !z2 || (i4 != 0 && i2 > i4) || (i5 != 0 && i3 > i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap g(f.m.b.v r27, android.graphics.Bitmap r28, int r29) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.m.b.c.g(f.m.b.v, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    public static void h(v vVar) {
        String hexString;
        Uri uri = vVar.c;
        if (uri != null) {
            hexString = String.valueOf(uri.getPath());
        } else {
            hexString = Integer.toHexString(vVar.f6880d);
        }
        StringBuilder sb = z.get();
        sb.ensureCapacity(hexString.length() + 8);
        sb.replace(8, sb.length(), hexString);
        Thread.currentThread().setName(sb.toString());
    }

    public boolean b() {
        Future<?> future;
        if (this.p == null) {
            List<f.m.b.a> list = this.q;
            return (list == null || list.isEmpty()) && (future = this.s) != null && future.cancel(false);
        }
        return false;
    }

    public void d(f.m.b.a aVar) {
        boolean remove;
        boolean z2 = true;
        if (this.p == aVar) {
            this.p = null;
            remove = true;
        } else {
            List<f.m.b.a> list = this.q;
            remove = list != null ? list.remove(aVar) : false;
        }
        if (remove && aVar.b.r == this.x) {
            Picasso.Priority priority = Picasso.Priority.LOW;
            List<f.m.b.a> list2 = this.q;
            boolean z3 = (list2 == null || list2.isEmpty()) ? false : true;
            f.m.b.a aVar2 = this.p;
            if (aVar2 == null && !z3) {
                z2 = false;
            }
            if (z2) {
                if (aVar2 != null) {
                    priority = aVar2.b.r;
                }
                if (z3) {
                    int size = this.q.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Picasso.Priority priority2 = this.q.get(i2).b.r;
                        if (priority2.ordinal() > priority.ordinal()) {
                            priority = priority2;
                        }
                    }
                }
            }
            this.x = priority;
        }
        if (this.f6830g.n) {
            d0.f("Hunter", "removed", aVar.b.b(), d0.e(this, "from "));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Bitmap e() {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.m.b.c.e():android.graphics.Bitmap");
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                try {
                    h(this.f6835l);
                    if (this.f6830g.n) {
                        d0.f("Hunter", "executing", d0.d(this), "");
                    }
                    Bitmap e2 = e();
                    this.r = e2;
                    if (e2 == null) {
                        this.f6831h.c(this);
                    } else {
                        this.f6831h.b(this);
                    }
                } catch (IOException e3) {
                    this.u = e3;
                    Handler handler = this.f6831h.f6850i;
                    handler.sendMessageDelayed(handler.obtainMessage(5, this), 500L);
                } catch (Exception e4) {
                    this.u = e4;
                    Handler handler2 = this.f6831h.f6850i;
                    handler2.sendMessage(handler2.obtainMessage(6, this));
                }
            } catch (q.b e5) {
                if (!NetworkPolicy.isOfflineOnly(e5.f6872g) || e5.f6871f != 504) {
                    this.u = e5;
                }
                Handler handler3 = this.f6831h.f6850i;
                handler3.sendMessage(handler3.obtainMessage(6, this));
            } catch (OutOfMemoryError e6) {
                StringWriter stringWriter = new StringWriter();
                this.f6833j.a().a(new PrintWriter(stringWriter));
                this.u = new RuntimeException(stringWriter.toString(), e6);
                Handler handler4 = this.f6831h.f6850i;
                handler4.sendMessage(handler4.obtainMessage(6, this));
            }
        } finally {
            Thread.currentThread().setName("Picasso-Idle");
        }
    }
}
