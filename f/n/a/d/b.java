package f.n.a.d;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BatchProcessor.java */
/* loaded from: classes2.dex */
public class b {
    public List<a> a;
    public int b = 0;
    public boolean c = false;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6925d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f6926e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f6927f = 0;

    public void a(a aVar) {
        b().add(aVar);
        Log.d("BATCH_PROCESSING", "addNewBatch: " + aVar.b.z);
    }

    public List<a> b() {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        return this.a;
    }

    public int c() {
        List<a> list = this.a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public void d() {
        b().clear();
        this.b = 0;
        this.c = false;
        this.f6925d = false;
        this.f6926e = 0;
        this.f6927f = 0;
    }
}
