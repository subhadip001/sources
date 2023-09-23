package e.b.h;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import com.video_converter.video_compressor.R;

/* compiled from: PopupMenu.java */
/* loaded from: classes.dex */
public class o0 {
    public final Context a;
    public final e.b.g.i.g b;
    public final View c;

    /* renamed from: d  reason: collision with root package name */
    public final e.b.g.i.l f1818d;

    /* renamed from: e  reason: collision with root package name */
    public a f1819e;

    /* compiled from: PopupMenu.java */
    /* loaded from: classes.dex */
    public interface a {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public o0(Context context, View view) {
        this.a = context;
        this.c = view;
        e.b.g.i.g gVar = new e.b.g.i.g(context);
        this.b = gVar;
        gVar.f1652e = new m0(this);
        e.b.g.i.l lVar = new e.b.g.i.l(context, gVar, view, false, R.attr.popupMenuStyle, 0);
        this.f1818d = lVar;
        lVar.f1682g = 0;
        lVar.f1686k = new n0(this);
    }
}
