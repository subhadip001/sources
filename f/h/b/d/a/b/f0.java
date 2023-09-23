package f.h.b.d.a.b;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class f0 extends f.h.b.d.a.e.s {

    /* renamed from: f  reason: collision with root package name */
    public final File f5607f;

    /* renamed from: g  reason: collision with root package name */
    public final File f5608g;

    /* renamed from: h  reason: collision with root package name */
    public final NavigableMap f5609h = new TreeMap();

    public f0(File file, File file2) {
        this.f5607f = file;
        this.f5608g = file2;
        ArrayList arrayList = (ArrayList) z2.a(file, file2);
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            long j2 = 0;
            while (it.hasNext()) {
                File file3 = (File) it.next();
                this.f5609h.put(Long.valueOf(j2), file3);
                j2 += file3.length();
            }
            return;
        }
        throw new y0(String.format("Virtualized slice archive empty for %s, %s", file, file2));
    }

    @Override // f.h.b.d.a.e.s
    public final long a() {
        Map.Entry lastEntry = this.f5609h.lastEntry();
        return ((File) lastEntry.getValue()).length() + ((Long) lastEntry.getKey()).longValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // f.h.b.d.a.e.s
    public final InputStream f(long j2, long j3) {
        if (j2 >= 0 && j3 >= 0) {
            long j4 = j2 + j3;
            if (j4 <= a()) {
                Long l2 = (Long) this.f5609h.floorKey(Long.valueOf(j2));
                Long l3 = (Long) this.f5609h.floorKey(Long.valueOf(j4));
                if (l2.equals(l3)) {
                    return new e0(g(j2, l2), j3);
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(g(j2, l2));
                Collection values = this.f5609h.subMap(l2, false, l3, false).values();
                if (!values.isEmpty()) {
                    arrayList.add(new b2(Collections.enumeration(values)));
                }
                arrayList.add(new e0(new FileInputStream((File) this.f5609h.get(l3)), j3 - (l3.longValue() - j2)));
                return new SequenceInputStream(Collections.enumeration(arrayList));
            }
            throw new y0(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", Long.valueOf(a()), Long.valueOf(j4)));
        }
        throw new y0(String.format("Invalid input parameters %s, %s", Long.valueOf(j2), Long.valueOf(j3)));
    }

    public final InputStream g(long j2, Long l2) {
        FileInputStream fileInputStream = new FileInputStream((File) this.f5609h.get(l2));
        if (fileInputStream.skip(j2 - l2.longValue()) == j2 - l2.longValue()) {
            return fileInputStream;
        }
        throw new y0(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", l2));
    }
}
