package e.v;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: RoomSQLiteQuery.java */
/* loaded from: classes.dex */
public class h implements e.x.a.e, e.x.a.d {
    public static final TreeMap<Integer, h> n = new TreeMap<>();

    /* renamed from: f  reason: collision with root package name */
    public volatile String f2957f;

    /* renamed from: g  reason: collision with root package name */
    public final long[] f2958g;

    /* renamed from: h  reason: collision with root package name */
    public final double[] f2959h;

    /* renamed from: i  reason: collision with root package name */
    public final String[] f2960i;

    /* renamed from: j  reason: collision with root package name */
    public final byte[][] f2961j;

    /* renamed from: k  reason: collision with root package name */
    public final int[] f2962k;

    /* renamed from: l  reason: collision with root package name */
    public final int f2963l;

    /* renamed from: m  reason: collision with root package name */
    public int f2964m;

    public h(int i2) {
        this.f2963l = i2;
        int i3 = i2 + 1;
        this.f2962k = new int[i3];
        this.f2958g = new long[i3];
        this.f2959h = new double[i3];
        this.f2960i = new String[i3];
        this.f2961j = new byte[i3];
    }

    public static h g(String str, int i2) {
        TreeMap<Integer, h> treeMap = n;
        synchronized (treeMap) {
            Map.Entry<Integer, h> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i2));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                h value = ceilingEntry.getValue();
                value.f2957f = str;
                value.f2964m = i2;
                return value;
            }
            h hVar = new h(i2);
            hVar.f2957f = str;
            hVar.f2964m = i2;
            return hVar;
        }
    }

    @Override // e.x.a.e
    public String a() {
        return this.f2957f;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // e.x.a.e
    public void f(e.x.a.d dVar) {
        for (int i2 = 1; i2 <= this.f2964m; i2++) {
            int i3 = this.f2962k[i2];
            if (i3 == 1) {
                ((e.x.a.f.e) dVar).f3010f.bindNull(i2);
            } else if (i3 == 2) {
                ((e.x.a.f.e) dVar).f3010f.bindLong(i2, this.f2958g[i2]);
            } else if (i3 == 3) {
                ((e.x.a.f.e) dVar).f3010f.bindDouble(i2, this.f2959h[i2]);
            } else if (i3 == 4) {
                ((e.x.a.f.e) dVar).f3010f.bindString(i2, this.f2960i[i2]);
            } else if (i3 == 5) {
                ((e.x.a.f.e) dVar).f3010f.bindBlob(i2, this.f2961j[i2]);
            }
        }
    }

    public void l(int i2, long j2) {
        this.f2962k[i2] = 2;
        this.f2958g[i2] = j2;
    }

    public void p(int i2) {
        this.f2962k[i2] = 1;
    }

    public void q(int i2, String str) {
        this.f2962k[i2] = 4;
        this.f2960i[i2] = str;
    }

    public void release() {
        TreeMap<Integer, h> treeMap = n;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f2963l), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i2 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i2;
                }
            }
        }
    }
}
