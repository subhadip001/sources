package e.i.g;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: FontRequestWorker.java */
/* loaded from: classes.dex */
public class j {
    public static final e.f.f<String, Typeface> a = new e.f.f<>(16);
    public static final ExecutorService b;
    public static final Object c;

    /* renamed from: d  reason: collision with root package name */
    public static final e.f.h<String, ArrayList<e.i.i.a<a>>> f2488d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new n("fonts-androidx", 10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        f2488d = new e.f.h<>();
    }

    public static a a(String str, Context context, e eVar, int i2) {
        int i3;
        Typeface typeface = a.get(str);
        if (typeface != null) {
            return new a(typeface);
        }
        try {
            k a2 = d.a(context, eVar, null);
            int i4 = a2.a;
            int i5 = 1;
            if (i4 != 0) {
                if (i4 == 1) {
                    i3 = -2;
                }
                i3 = -3;
            } else {
                l[] lVarArr = a2.b;
                if (lVarArr != null && lVarArr.length != 0) {
                    for (l lVar : lVarArr) {
                        int i6 = lVar.f2490e;
                        if (i6 != 0) {
                            if (i6 >= 0) {
                                i3 = i6;
                            }
                            i3 = -3;
                        }
                    }
                    i5 = 0;
                }
                i3 = i5;
            }
            if (i3 != 0) {
                return new a(i3);
            }
            Typeface b2 = e.i.d.e.a.b(context, null, a2.b, i2);
            if (b2 != null) {
                a.put(str, b2);
                return new a(b2);
            }
            return new a(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new a(-1);
        }
    }

    /* compiled from: FontRequestWorker.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final Typeface a;
        public final int b;

        public a(int i2) {
            this.a = null;
            this.b = i2;
        }

        public a(Typeface typeface) {
            this.a = typeface;
            this.b = 0;
        }
    }
}
