package e.b.g.i;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import e.b.g.i.e;
import e.b.g.i.m;

/* compiled from: MenuDialogHelper.java */
/* loaded from: classes.dex */
public class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {

    /* renamed from: f  reason: collision with root package name */
    public g f1661f;

    /* renamed from: g  reason: collision with root package name */
    public e.b.c.h f1662g;

    /* renamed from: h  reason: collision with root package name */
    public e f1663h;

    public h(g gVar) {
        this.f1661f = gVar;
    }

    @Override // e.b.g.i.m.a
    public void b(g gVar, boolean z) {
        e.b.c.h hVar;
        if ((z || gVar == this.f1661f) && (hVar = this.f1662g) != null) {
            hVar.dismiss();
        }
    }

    @Override // e.b.g.i.m.a
    public boolean c(g gVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        this.f1661f.r(((e.a) this.f1663h.a()).getItem(i2), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        e eVar = this.f1663h;
        g gVar = this.f1661f;
        m.a aVar = eVar.f1641j;
        if (aVar != null) {
            aVar.b(gVar, true);
        }
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i2 == 82 || i2 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1662g.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1662g.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1661f.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1661f.performShortcut(i2, keyEvent, 0);
    }
}
