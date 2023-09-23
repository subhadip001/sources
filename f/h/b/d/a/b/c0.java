package f.h.b.d.a.b;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class c0 {
    public static final f.h.b.d.a.e.f c = new f.h.b.d.a.e.f("AssetPackStorage");
    public final Context a;
    public final n2 b;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        timeUnit.toMillis(14L);
        timeUnit.toMillis(28L);
    }

    public c0(Context context, n2 n2Var) {
        this.a = context;
        this.b = n2Var;
    }

    public static long d(File file, boolean z) {
        File[] listFiles;
        if (file.exists()) {
            ArrayList arrayList = new ArrayList();
            if (z && file.listFiles().length > 1) {
                c.e("Multiple pack versions found, using highest version code.", new Object[0]);
            }
            try {
                for (File file2 : file.listFiles()) {
                    if (!file2.getName().equals("stale.tmp")) {
                        arrayList.add(Long.valueOf(file2.getName()));
                    }
                }
            } catch (NumberFormatException e2) {
                c.c(e2, "Corrupt asset pack directories.", new Object[0]);
            }
            if (arrayList.isEmpty()) {
                return -1L;
            }
            Collections.sort(arrayList);
            return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
        }
        return -1L;
    }

    public static void i(File file) {
        File[] listFiles;
        if (file.listFiles() == null || file.listFiles().length <= 1) {
            return;
        }
        long d2 = d(file, false);
        for (File file2 : file.listFiles()) {
            if (!file2.getName().equals(String.valueOf(d2)) && !file2.getName().equals("stale.tmp")) {
                j(file2);
            }
        }
    }

    public static boolean j(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                z &= j(file2);
            }
        }
        if (file.delete()) {
            return z;
        }
        return false;
    }

    public final void a(String str, int i2, long j2, int i3) {
        File file = new File(p(str, i2, j2), "merge.tmp");
        Properties properties = new Properties();
        properties.put("numberOfMerges", String.valueOf(i3));
        file.getParentFile().mkdirs();
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    public final void b(String str, int i2, long j2) {
        File[] listFiles;
        File[] listFiles2;
        File e2 = e(str);
        if (e2.exists()) {
            for (File file : e2.listFiles()) {
                if (!file.getName().equals(String.valueOf(i2)) && !file.getName().equals("stale.tmp")) {
                    j(file);
                } else if (file.getName().equals(String.valueOf(i2))) {
                    for (File file2 : file.listFiles()) {
                        if (!file2.getName().equals(String.valueOf(j2))) {
                            j(file2);
                        }
                    }
                }
            }
        }
    }

    public final boolean c(String str, int i2, long j2) {
        if (f(str, i2, j2).exists()) {
            return j(f(str, i2, j2));
        }
        return true;
    }

    public final File e(String str) {
        return new File(g(), str);
    }

    public final File f(String str, int i2, long j2) {
        return new File(new File(new File(new File(g(), "_tmp"), str), String.valueOf(i2)), String.valueOf(j2));
    }

    public final File g() {
        return new File(this.a.getFilesDir(), "assetpacks");
    }

    public final List h() {
        File[] listFiles;
        ArrayList arrayList = new ArrayList();
        try {
        } catch (IOException e2) {
            c.b("Could not process directory while scanning installed packs. %s", e2);
        }
        if (g().exists() && g().listFiles() != null) {
            for (File file : g().listFiles()) {
                if (!file.getCanonicalPath().equals(new File(g(), "_tmp").getCanonicalPath())) {
                    arrayList.add(file);
                }
            }
            return arrayList;
        }
        return arrayList;
    }

    public final int k(String str, int i2, long j2) {
        File file = new File(p(str, i2, j2), "merge.tmp");
        if (file.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("numberOfMerges") != null) {
                    try {
                        return Integer.parseInt(properties.getProperty("numberOfMerges"));
                    } catch (NumberFormatException e2) {
                        throw new y0("Merge checkpoint file corrupt.", e2);
                    }
                }
                throw new y0("Merge checkpoint file corrupt.");
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        }
        return 0;
    }

    public final long l(String str) {
        return d(m(str, (int) d(e(str), true)), true);
    }

    public final File m(String str, int i2) {
        return new File(e(str), String.valueOf(i2));
    }

    public final File n(String str, int i2, long j2) {
        return new File(m(str, i2), String.valueOf(j2));
    }

    public final File o(String str, int i2, long j2) {
        return new File(n(str, i2, j2), "_metadata");
    }

    public final File p(String str, int i2, long j2) {
        return new File(f(str, i2, j2), "_packs");
    }

    public final File q(String str, int i2, long j2, String str2) {
        return new File(r(str, i2, j2, str2), "checkpoint.dat");
    }

    public final File r(String str, int i2, long j2, String str2) {
        return new File(new File(new File(f(str, i2, j2), "_slices"), "_metadata"), str2);
    }

    public final File s(String str, int i2, long j2, String str2) {
        return new File(new File(new File(f(str, i2, j2), "_slices"), "_unverified"), str2);
    }

    public final File t(String str, int i2, long j2, String str2) {
        return new File(new File(new File(f(str, i2, j2), "_slices"), "_verified"), str2);
    }

    public final String u(String str) {
        int length;
        File file = new File(g(), str);
        if (!file.exists()) {
            c.a("Pack not found with pack name: %s", str);
            return null;
        }
        File file2 = new File(file, String.valueOf(this.b.a()));
        if (!file2.exists()) {
            c.a("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(this.b.a()));
            return null;
        }
        File[] listFiles = file2.listFiles();
        if (listFiles == null || (length = listFiles.length) == 0) {
            c.a("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(this.b.a()));
            return null;
        } else if (length > 1) {
            c.b("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(this.b.a()));
            return null;
        } else {
            return listFiles[0].getCanonicalPath();
        }
    }

    public final Map v() {
        HashMap hashMap = new HashMap();
        Iterator it = ((ArrayList) h()).iterator();
        while (it.hasNext()) {
            String name = ((File) it.next()).getName();
            int d2 = (int) d(e(name), true);
            long d3 = d(m(name, d2), true);
            if (n(name, d2, d3).exists()) {
                hashMap.put(name, Long.valueOf(d3));
            }
        }
        return hashMap;
    }
}
