package f.n.a.v.s;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: VidCompInputScreenView.java */
/* loaded from: classes2.dex */
public class z implements View.OnTouchListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c0 f7465f;

    public z(c0 c0Var) {
        this.f7465f = c0Var;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            for (i iVar : this.f7465f.c()) {
                iVar.j();
            }
            return false;
        }
        return false;
    }
}
