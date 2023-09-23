package f.e.a.l.q.b0;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: SizeConfigStrategy.java */
/* loaded from: classes.dex */
public class m implements k {

    /* renamed from: d  reason: collision with root package name */
    public static final Bitmap.Config[] f3287d;

    /* renamed from: e  reason: collision with root package name */
    public static final Bitmap.Config[] f3288e;

    /* renamed from: f  reason: collision with root package name */
    public static final Bitmap.Config[] f3289f;

    /* renamed from: g  reason: collision with root package name */
    public static final Bitmap.Config[] f3290g;

    /* renamed from: h  reason: collision with root package name */
    public static final Bitmap.Config[] f3291h;
    public final c a = new c();
    public final g<b, Bitmap> b = new g<>();
    public final Map<Bitmap.Config, NavigableMap<Integer, Integer>> c = new HashMap();

    /* compiled from: SizeConfigStrategy.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: SizeConfigStrategy.java */
    /* loaded from: classes.dex */
    public static final class b implements l {
        public final c a;
        public int b;
        public Bitmap.Config c;

        public b(c cVar) {
            this.a = cVar;
        }

        @Override // f.e.a.l.q.b0.l
        public void a() {
            this.a.c(this);
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.b == bVar.b && f.e.a.r.l.b(this.c, bVar.c);
            }
            return false;
        }

        public int hashCode() {
            int i2 = this.b * 31;
            Bitmap.Config config = this.c;
            return i2 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return m.c(this.b, this.c);
        }
    }

    /* compiled from: SizeConfigStrategy.java */
    /* loaded from: classes.dex */
    public static class c extends f.e.a.l.q.b0.c<b> {
        @Override // f.e.a.l.q.b0.c
        public b a() {
            return new b(this);
        }

        public b d(int i2, Bitmap.Config config) {
            b b = b();
            b.b = i2;
            b.c = config;
            return b;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f3287d = configArr;
        f3288e = configArr;
        f3289f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f3290g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f3291h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i2, Bitmap.Config config) {
        return "[" + i2 + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> d2 = d(bitmap.getConfig());
        Integer num2 = (Integer) d2.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                d2.remove(num);
                return;
            } else {
                d2.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + e(bitmap) + ", this: " + this);
    }

    public Bitmap b(int i2, int i3, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int d2 = f.e.a.r.l.d(config) * i2 * i3;
        b b2 = this.a.b();
        b2.b = d2;
        b2.c = config;
        int i4 = 0;
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            configArr = f3288e;
        } else {
            int i5 = a.a[config.ordinal()];
            if (i5 == 1) {
                configArr = f3287d;
            } else if (i5 == 2) {
                configArr = f3289f;
            } else if (i5 != 3) {
                configArr = i5 != 4 ? new Bitmap.Config[]{config} : f3291h;
            } else {
                configArr = f3290g;
            }
        }
        int length = configArr.length;
        while (true) {
            if (i4 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i4];
            Integer ceilingKey = d(config2).ceilingKey(Integer.valueOf(d2));
            if (ceilingKey == null || ceilingKey.intValue() > d2 * 8) {
                i4++;
            } else if (ceilingKey.intValue() != d2 || (config2 != null ? !config2.equals(config) : config != null)) {
                this.a.c(b2);
                b2 = this.a.d(ceilingKey.intValue(), config2);
            }
        }
        Bitmap a2 = this.b.a(b2);
        if (a2 != null) {
            a(Integer.valueOf(b2.b), a2);
            a2.reconfigure(i2, i3, config);
        }
        return a2;
    }

    public final NavigableMap<Integer, Integer> d(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.c.get(config);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.c.put(config, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    public String e(Bitmap bitmap) {
        return c(f.e.a.r.l.c(bitmap), bitmap.getConfig());
    }

    public void f(Bitmap bitmap) {
        b d2 = this.a.d(f.e.a.r.l.c(bitmap), bitmap.getConfig());
        this.b.b(d2, bitmap);
        NavigableMap<Integer, Integer> d3 = d(bitmap.getConfig());
        Integer num = (Integer) d3.get(Integer.valueOf(d2.b));
        d3.put(Integer.valueOf(d2.b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("SizeConfigStrategy{groupedMap=");
        A.append(this.b);
        A.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.c.entrySet()) {
            A.append(entry.getKey());
            A.append('[');
            A.append(entry.getValue());
            A.append("], ");
        }
        if (!this.c.isEmpty()) {
            A.replace(A.length() - 2, A.length(), "");
        }
        A.append(")}");
        return A.toString();
    }
}
