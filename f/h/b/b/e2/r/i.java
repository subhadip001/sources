package f.h.b.b.e2.r;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.exoplayer2.ui.PlayerView;
import f.h.b.b.e2.r.d;
import f.h.b.b.e2.r.h;

/* compiled from: TouchTracker.java */
/* loaded from: classes.dex */
public class i extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, d.a {

    /* renamed from: h  reason: collision with root package name */
    public final a f4194h;

    /* renamed from: i  reason: collision with root package name */
    public final float f4195i;

    /* renamed from: j  reason: collision with root package name */
    public final GestureDetector f4196j;

    /* renamed from: l  reason: collision with root package name */
    public g f4198l;

    /* renamed from: f  reason: collision with root package name */
    public final PointF f4192f = new PointF();

    /* renamed from: g  reason: collision with root package name */
    public final PointF f4193g = new PointF();

    /* renamed from: k  reason: collision with root package name */
    public volatile float f4197k = 3.1415927f;

    /* compiled from: TouchTracker.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public i(Context context, a aVar, float f2) {
        this.f4194h = aVar;
        this.f4195i = f2;
        this.f4196j = new GestureDetector(context, this);
    }

    @Override // f.h.b.b.e2.r.d.a
    public void a(float[] fArr, float f2) {
        this.f4197k = -f2;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f4192f.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        float x = (motionEvent2.getX() - this.f4192f.x) / this.f4195i;
        float y = motionEvent2.getY();
        PointF pointF = this.f4192f;
        float f4 = (y - pointF.y) / this.f4195i;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d2 = this.f4197k;
        float cos = (float) Math.cos(d2);
        float sin = (float) Math.sin(d2);
        PointF pointF2 = this.f4193g;
        pointF2.x -= (cos * x) - (sin * f4);
        float f5 = (cos * f4) + (sin * x) + pointF2.y;
        pointF2.y = f5;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f5));
        a aVar = this.f4194h;
        PointF pointF3 = this.f4193g;
        h.a aVar2 = (h.a) aVar;
        synchronized (aVar2) {
            aVar2.f4190l = pointF3.y;
            aVar2.b();
            Matrix.setRotateM(aVar2.f4189k, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        g gVar = this.f4198l;
        if (gVar != null) {
            PlayerView playerView = PlayerView.this;
            int i2 = PlayerView.G;
            return playerView.j();
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f4196j.onTouchEvent(motionEvent);
    }
}
