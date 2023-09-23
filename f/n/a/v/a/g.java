package f.n.a.v.a;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import f.n.a.v.a.h;

/* compiled from: FileUtilites.java */
/* loaded from: classes2.dex */
public class g implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Context f7088f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f7089g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ h.b f7090h;

    public g(Context context, String str, h.b bVar) {
        this.f7088f = context;
        this.f7089g = str;
        this.f7090h = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7088f.getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS));
        sb.append("/");
        sb.append("vcTxt");
        h.a = f.a.b.a.a.u(sb, ".", "txt");
        h.b = this.f7088f.getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS) + "/temp_file_1." + this.f7089g;
        h.c = this.f7088f.getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS) + "/temp_file_2." + this.f7089g;
        StringBuilder A = f.a.b.a.a.A("run: ");
        A.append(h.a);
        A.append(" - ");
        A.append(h.b);
        A.append(" - ");
        A.append(h.c);
        Log.d("generateTempFilePaths", A.toString());
        this.f7090h.a();
    }
}
