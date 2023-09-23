package e.i.g;

import android.content.Context;
import e.i.g.j;
import java.util.concurrent.Callable;

/* compiled from: FontRequestWorker.java */
/* loaded from: classes.dex */
public class f implements Callable<j.a> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f2480f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Context f2481g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ e f2482h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f2483i;

    public f(String str, Context context, e eVar, int i2) {
        this.f2480f = str;
        this.f2481g = context;
        this.f2482h = eVar;
        this.f2483i = i2;
    }

    @Override // java.util.concurrent.Callable
    public j.a call() {
        return j.a(this.f2480f, this.f2481g, this.f2482h, this.f2483i);
    }
}
