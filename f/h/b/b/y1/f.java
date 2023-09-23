package f.h.b.b.y1;

import android.net.Uri;
import f.h.b.b.y1.j0.b0;
import f.h.b.b.y1.j0.h0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: DefaultExtractorsFactory.java */
/* loaded from: classes.dex */
public final class f implements l {
    public static final int[] a = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};
    public static final Constructor<? extends h> b;

    static {
        Constructor<? extends h> constructor = null;
        try {
            if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(h.class).getConstructor(Integer.TYPE);
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e2) {
            throw new RuntimeException("Error instantiating FLAC extension", e2);
        }
        b = constructor;
    }

    @Override // f.h.b.b.y1.l
    public synchronized h[] a() {
        return b(Uri.EMPTY, new HashMap());
    }

    @Override // f.h.b.b.y1.l
    public synchronized h[] b(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        int[] iArr;
        arrayList = new ArrayList(14);
        int o = f.h.b.b.e2.j.o(map);
        if (o != -1) {
            c(o, arrayList);
        }
        int p = f.h.b.b.e2.j.p(uri);
        if (p != -1 && p != o) {
            c(p, arrayList);
        }
        for (int i2 : a) {
            if (i2 != o && i2 != p) {
                c(i2, arrayList);
            }
        }
        return (h[]) arrayList.toArray(new h[arrayList.size()]);
    }

    public final void c(int i2, List<h> list) {
        switch (i2) {
            case 0:
                list.add(new f.h.b.b.y1.j0.f());
                return;
            case 1:
                list.add(new f.h.b.b.y1.j0.h());
                return;
            case 2:
                list.add(new f.h.b.b.y1.j0.j(0));
                return;
            case 3:
                list.add(new f.h.b.b.y1.b0.b(0));
                return;
            case 4:
                Constructor<? extends h> constructor = b;
                if (constructor != null) {
                    try {
                        list.add(constructor.newInstance(0));
                        return;
                    } catch (Exception e2) {
                        throw new IllegalStateException("Unexpected error creating FLAC extractor", e2);
                    }
                }
                list.add(new f.h.b.b.y1.c0.d(0));
                return;
            case 5:
                list.add(new f.h.b.b.y1.d0.c());
                return;
            case 6:
                list.add(new f.h.b.b.y1.f0.e(0));
                return;
            case 7:
                list.add(new f.h.b.b.y1.g0.f(0));
                return;
            case 8:
                list.add(new f.h.b.b.y1.h0.g(0));
                list.add(new f.h.b.b.y1.h0.i(0));
                return;
            case 9:
                list.add(new f.h.b.b.y1.i0.d());
                return;
            case 10:
                list.add(new b0());
                return;
            case 11:
                list.add(new h0(1, 0, 112800));
                return;
            case 12:
                list.add(new f.h.b.b.y1.k0.b());
                return;
            case 13:
            default:
                return;
            case 14:
                list.add(new f.h.b.b.y1.e0.a());
                return;
        }
    }
}
