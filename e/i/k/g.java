package e.i.k;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.Method;

/* compiled from: TextViewCompat.java */
/* loaded from: classes.dex */
public class g implements ActionMode.Callback {
    public final ActionMode.Callback a;
    public final TextView b;
    public Class<?> c;

    /* renamed from: d  reason: collision with root package name */
    public Method f2573d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2574e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2575f = false;

    public g(ActionMode.Callback callback, TextView textView) {
        this.a = callback;
        this.b = textView;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.a.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.a.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode actionMode) {
        this.a.onDestroyActionMode(actionMode);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x009f A[SYNTHETIC] */
    @Override // android.view.ActionMode.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onPrepareActionMode(android.view.ActionMode r13, android.view.Menu r14) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.k.g.onPrepareActionMode(android.view.ActionMode, android.view.Menu):boolean");
    }
}
