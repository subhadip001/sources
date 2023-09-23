package e.p.c;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: FragmentHostCallback.java */
/* loaded from: classes.dex */
public abstract class w<E> extends t {

    /* renamed from: f  reason: collision with root package name */
    public final Activity f2799f;

    /* renamed from: g  reason: collision with root package name */
    public final Context f2800g;

    /* renamed from: h  reason: collision with root package name */
    public final Handler f2801h;

    /* renamed from: i  reason: collision with root package name */
    public final FragmentManager f2802i;

    public w(n nVar) {
        Handler handler = new Handler();
        this.f2802i = new z();
        this.f2799f = nVar;
        e.i.a.i(nVar, "context == null");
        this.f2800g = nVar;
        e.i.a.i(handler, "handler == null");
        this.f2801h = handler;
    }

    public abstract void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract E f();

    public abstract LayoutInflater g();

    public abstract boolean h(Fragment fragment);

    public abstract boolean i(String str);

    public abstract void j();
}
