package f.m.b;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;

/* compiled from: Utils.java */
/* loaded from: classes2.dex */
public final class d0 {
    public static final StringBuilder a = new StringBuilder();
    public static final l.i b = l.i.j("RIFF");
    public static final l.i c = l.i.j("WEBP");

    /* compiled from: Utils.java */
    /* loaded from: classes2.dex */
    public static class a extends Thread {
        public a(Runnable runnable) {
            super(runnable);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    /* compiled from: Utils.java */
    /* loaded from: classes2.dex */
    public static class b implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new a(runnable);
        }
    }

    public static void a() {
        if (!(Looper.getMainLooper().getThread() == Thread.currentThread())) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    public static String b(v vVar, StringBuilder sb) {
        Objects.requireNonNull(vVar);
        Uri uri = vVar.c;
        if (uri != null) {
            String uri2 = uri.toString();
            sb.ensureCapacity(uri2.length() + 50);
            sb.append(uri2);
        } else {
            sb.ensureCapacity(50);
            sb.append(vVar.f6880d);
        }
        sb.append('\n');
        if (vVar.f6888l != 0.0f) {
            sb.append("rotation:");
            sb.append(vVar.f6888l);
            if (vVar.o) {
                sb.append('@');
                sb.append(vVar.f6889m);
                sb.append('x');
                sb.append(vVar.n);
            }
            sb.append('\n');
        }
        if (vVar.a()) {
            sb.append("resize:");
            sb.append(vVar.f6882f);
            sb.append('x');
            sb.append(vVar.f6883g);
            sb.append('\n');
        }
        if (vVar.f6884h) {
            sb.append("centerCrop:");
            sb.append(vVar.f6885i);
            sb.append('\n');
        } else if (vVar.f6886j) {
            sb.append("centerInside");
            sb.append('\n');
        }
        List<b0> list = vVar.f6881e;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append(vVar.f6881e.get(i2).b());
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    public static int c(Bitmap bitmap) {
        int allocationByteCount = bitmap.getAllocationByteCount();
        if (allocationByteCount >= 0) {
            return allocationByteCount;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    public static String d(c cVar) {
        return e(cVar, "");
    }

    public static String e(c cVar, String str) {
        StringBuilder sb = new StringBuilder(str);
        f.m.b.a aVar = cVar.p;
        if (aVar != null) {
            sb.append(aVar.b.b());
        }
        List<f.m.b.a> list = cVar.q;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 > 0 || aVar != null) {
                    sb.append(", ");
                }
                sb.append(list.get(i2).b.b());
            }
        }
        return sb.toString();
    }

    public static void f(String str, String str2, String str3, String str4) {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", str, str2, str3, str4));
    }
}
