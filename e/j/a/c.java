package e.j.a;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: ResourceCursorAdapter.java */
/* loaded from: classes.dex */
public abstract class c extends a {
    public int n;
    public int o;
    public LayoutInflater p;

    @Deprecated
    public c(Context context, int i2, Cursor cursor, boolean z) {
        super(context, null, z);
        this.o = i2;
        this.n = i2;
        this.p = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // e.j.a.a
    public View d(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.p.inflate(this.n, viewGroup, false);
    }
}
