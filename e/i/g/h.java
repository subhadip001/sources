package e.i.g;

import android.content.Context;
import e.i.g.j;
import java.util.concurrent.Callable;

/* compiled from: FontRequestWorker.java */
/* loaded from: classes.dex */
public class h implements Callable<j.a> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f2484f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Context f2485g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ e f2486h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f2487i;

    public h(String str, Context context, e eVar, int i2) {
        this.f2484f = str;
        this.f2485g = context;
        this.f2486h = eVar;
        this.f2487i = i2;
    }

    @Override // java.util.concurrent.Callable
    public j.a call() {
        try {
            return j.a(this.f2484f, this.f2485g, this.f2486h, this.f2487i);
        } catch (Throwable unused) {
            return new j.a(-3);
        }
    }
}
