package e.i.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import com.google.android.gms.common.api.Api;
import com.google.logging.type.LogSeverity;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: TypefaceCompatBaseImpl.java */
/* loaded from: classes.dex */
public class l {
    public ConcurrentHashMap<Long, e.i.c.d.f> a = new ConcurrentHashMap<>();

    /* compiled from: TypefaceCompatBaseImpl.java */
    /* loaded from: classes.dex */
    public interface a<T> {
        int a(T t);

        boolean b(T t);
    }

    public static <T> T e(T[] tArr, int i2, a<T> aVar) {
        int i3 = (i2 & 1) == 0 ? LogSeverity.WARNING_VALUE : LogSeverity.ALERT_VALUE;
        boolean z = (i2 & 2) != 0;
        T t = null;
        int i4 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (T t2 : tArr) {
            int abs = (Math.abs(aVar.a(t2) - i3) * 2) + (aVar.b(t2) == z ? 0 : 1);
            if (t == null || i4 > abs) {
                t = t2;
                i4 = abs;
            }
        }
        return t;
    }

    public Typeface a(Context context, e.i.c.d.f fVar, Resources resources, int i2) {
        throw null;
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, e.i.g.l[] lVarArr, int i2) {
        throw null;
    }

    public Typeface c(Context context, InputStream inputStream) {
        File E = e.i.a.E(context);
        if (E == null) {
            return null;
        }
        try {
            if (e.i.a.r(E, inputStream)) {
                return Typeface.createFromFile(E.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            E.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i2, String str, int i3) {
        File E = e.i.a.E(context);
        if (E == null) {
            return null;
        }
        try {
            if (e.i.a.q(E, resources, i2)) {
                return Typeface.createFromFile(E.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            E.delete();
        }
    }
}
