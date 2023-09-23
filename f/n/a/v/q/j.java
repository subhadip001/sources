package f.n.a.v.q;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.video_converter.video_compressor.screens.common.Event;

/* compiled from: SimpleOptionsScreenView.java */
/* loaded from: classes2.dex */
public class j implements View.OnTouchListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ o f7400f;

    public j(o oVar) {
        this.f7400f = oVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        StringBuilder A = f.a.b.a.a.A("onTouchSV: ");
        A.append(motionEvent.getAction());
        Log.d("TAG", A.toString());
        if (motionEvent.getAction() == 0) {
            Log.d("TAG", "onTouchSV: ");
            o.d(this.f7400f, Event.ON_SCROLL_VIEW_CLICKED);
            return false;
        }
        return false;
    }
}
