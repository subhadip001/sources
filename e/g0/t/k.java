package e.g0.t;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.util.HashMap;

/* compiled from: WorkDatabasePathHelper.java */
/* loaded from: classes.dex */
public class k {
    public static final String a = e.g0.k.e("WrkDbPathHelper");
    public static final String[] b = {"-journal", "-shm", "-wal"};

    public static void a(Context context) {
        String format;
        File file;
        String[] strArr;
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23 || !databasePath.exists()) {
            return;
        }
        e.g0.k.c().a(a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
        HashMap hashMap = new HashMap();
        if (i2 >= 23) {
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            if (i2 < 23) {
                file = context.getDatabasePath("androidx.work.workdb");
            } else {
                file = new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
            }
            hashMap.put(databasePath2, file);
            for (String str : b) {
                hashMap.put(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
            }
        }
        for (File file2 : hashMap.keySet()) {
            File file3 = (File) hashMap.get(file2);
            if (file2.exists() && file3 != null) {
                if (file3.exists()) {
                    e.g0.k.c().f(a, String.format("Over-writing contents of %s", file3), new Throwable[0]);
                }
                if (file2.renameTo(file3)) {
                    format = String.format("Migrated %s to %s", file2, file3);
                } else {
                    format = String.format("Renaming %s to %s failed", file2, file3);
                }
                e.g0.k.c().a(a, format, new Throwable[0]);
            }
        }
    }
}
