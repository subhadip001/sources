package f.n.a.v.k;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* compiled from: RecyclerViewListener.java */
/* loaded from: classes2.dex */
public class k implements RecyclerView.q {
    public b a;
    public GestureDetector b;

    /* compiled from: RecyclerViewListener.java */
    /* loaded from: classes2.dex */
    public class a extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ RecyclerView f7273f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ b f7274g;

        public a(k kVar, RecyclerView recyclerView, b bVar) {
            this.f7273f = recyclerView;
            this.f7274g = bVar;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            b bVar;
            View C = this.f7273f.C(motionEvent.getX(), motionEvent.getY());
            if (C == null || (bVar = this.f7274g) == null) {
                return;
            }
            h.i(((e) bVar).a, this.f7273f.K(C));
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }
    }

    /* compiled from: RecyclerViewListener.java */
    /* loaded from: classes2.dex */
    public interface b {
    }

    public k(Context context, RecyclerView recyclerView, b bVar) {
        this.a = bVar;
        this.b = new GestureDetector(context, new a(this, recyclerView, bVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        View C = recyclerView.C(motionEvent.getX(), motionEvent.getY());
        if (C == null || this.a == null || !this.b.onTouchEvent(motionEvent)) {
            return false;
        }
        b bVar = this.a;
        recyclerView.K(C);
        Objects.requireNonNull((e) bVar);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void e(boolean z) {
    }
}
