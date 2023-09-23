package f.n.a.v.a;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.io.FileWriter;

/* compiled from: FileUtilites.java */
/* loaded from: classes2.dex */
public class h {
    public static String a = "";
    public static String b = "";
    public static String c = "";

    /* compiled from: FileUtilites.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void b(Throwable th);
    }

    /* compiled from: FileUtilites.java */
    /* loaded from: classes2.dex */
    public interface b {
        void a();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.net.Uri r16, android.app.Activity r17, f.n.a.v.a.h.a r18) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.n.a.v.a.h.a(android.net.Uri, android.app.Activity, f.n.a.v.a.h$a):void");
    }

    public static String b(Context context, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS));
        sb.append("/");
        sb.append(str);
        return f.a.b.a.a.u(sb, ".", str2);
    }

    public static void c(String str, String str2, boolean z) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(str, !z);
            fileWriter.write(str2);
            fileWriter.close();
            Log.d("TAG", "updateMergerTxtfile: " + str2 + " " + z);
            Log.d("TAG", "updateMergerTxtfile: success");
        } catch (Exception e2) {
            StringBuilder A = f.a.b.a.a.A("updateMergerTxtfile: exception ");
            A.append(e2.getMessage());
            Log.d("TAG", A.toString());
        }
    }
}
