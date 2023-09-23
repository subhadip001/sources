package e.a;

import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: OnBackPressedCallback.java */
/* loaded from: classes.dex */
public abstract class b {
    public boolean a;
    public CopyOnWriteArrayList<a> b = new CopyOnWriteArrayList<>();

    public b(boolean z) {
        this.a = z;
    }

    public abstract void a();
}
