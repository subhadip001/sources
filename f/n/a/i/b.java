package f.n.a.i;

import android.os.Environment;
import java.io.File;

/* compiled from: MetaData.java */
/* loaded from: classes2.dex */
public class b {
    public static String a;
    public static String b;
    public static String c;

    /* renamed from: d  reason: collision with root package name */
    public static String f6954d;

    /* renamed from: e  reason: collision with root package name */
    public static String f6955e;

    /* renamed from: f  reason: collision with root package name */
    public static String f6956f;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES).getAbsolutePath());
        sb.append("/VideoCompressor");
        String str = File.separator;
        sb.append(str);
        a = sb.toString();
        b = f.a.b.a.a.u(new StringBuilder(), a, ".cache");
        c = f.a.b.a.a.u(new StringBuilder(), b, "/processingInfoTracker.json");
        f6954d = f.a.b.a.a.u(new StringBuilder(), b, "/selectedFiles.json");
        f6955e = f.a.b.a.a.u(new StringBuilder(), b, "/batch_processor.json");
        f6956f = f.a.b.a.a.v(new StringBuilder(), b, str, "preview");
    }
}
