package e.g.b.a;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import e.g.b.a.d;
import e.g.c.b;
import e.i.j.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MotionLayout.java */
/* loaded from: classes.dex */
public class c extends ConstraintLayout implements o {
    public static final /* synthetic */ int d0 = 0;
    public int A;
    public int B;
    public int C;
    public boolean D;
    public long E;
    public float F;
    public float G;
    public float H;
    public long I;
    public float J;
    public InterfaceC0034c K;
    public int L;
    public e.g.b.a.a M;
    public long N;
    public boolean O;
    public ArrayList<e.g.b.a.b> P;
    public ArrayList<e.g.b.a.b> Q;
    public CopyOnWriteArrayList<InterfaceC0034c> R;
    public int S;
    public float T;
    public float U;
    public boolean V;
    public b W;
    public boolean a0;
    public d b0;
    public boolean c0;
    public float z;

    /* compiled from: MotionLayout.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.W.a();
        }
    }

    /* compiled from: MotionLayout.java */
    /* loaded from: classes.dex */
    public class b {
        public float a = Float.NaN;
        public float b = Float.NaN;
        public int c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f2106d = -1;

        public b() {
        }

        public void a() {
            e.g.c.c cVar;
            b.a aVar;
            int a;
            d dVar = d.SETUP;
            int i2 = this.c;
            if (i2 != -1 || this.f2106d != -1) {
                if (i2 == -1) {
                    c.this.w(this.f2106d);
                } else {
                    int i3 = this.f2106d;
                    if (i3 == -1) {
                        c cVar2 = c.this;
                        cVar2.setState(dVar);
                        cVar2.B = i2;
                        cVar2.A = -1;
                        cVar2.C = -1;
                        e.g.c.b bVar = cVar2.p;
                        if (bVar != null) {
                            float f2 = -1;
                            int i4 = bVar.b;
                            if (i4 == i2) {
                                if (i2 == -1) {
                                    aVar = bVar.f2121d.valueAt(0);
                                } else {
                                    aVar = bVar.f2121d.get(i4);
                                }
                                int i5 = bVar.c;
                                if ((i5 == -1 || !aVar.b.get(i5).a(f2, f2)) && bVar.c != (a = aVar.a(f2, f2))) {
                                    e.g.c.c cVar3 = a == -1 ? null : aVar.b.get(a).f2126f;
                                    if (a != -1) {
                                        int i6 = aVar.b.get(a).f2125e;
                                    }
                                    if (cVar3 != null) {
                                        bVar.c = a;
                                        cVar3.a(bVar.a);
                                    }
                                }
                            } else {
                                bVar.b = i2;
                                b.a aVar2 = bVar.f2121d.get(i2);
                                int a2 = aVar2.a(f2, f2);
                                if (a2 == -1) {
                                    cVar = aVar2.f2123d;
                                } else {
                                    cVar = aVar2.b.get(a2).f2126f;
                                }
                                if (a2 != -1) {
                                    int i7 = aVar2.b.get(a2).f2125e;
                                }
                                if (cVar == null) {
                                    Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i2 + ", dim =" + f2 + ", " + f2);
                                } else {
                                    bVar.c = a2;
                                    cVar.a(bVar.a);
                                }
                            }
                        }
                    } else {
                        c.this.v(i2, i3);
                    }
                }
                c.this.setState(dVar);
            }
            if (Float.isNaN(this.b)) {
                if (Float.isNaN(this.a)) {
                    return;
                }
                c.this.setProgress(this.a);
                return;
            }
            c cVar4 = c.this;
            float f3 = this.a;
            float f4 = this.b;
            if (!cVar4.isAttachedToWindow()) {
                if (cVar4.W == null) {
                    cVar4.W = new b();
                }
                b bVar2 = cVar4.W;
                bVar2.a = f3;
                bVar2.b = f4;
            } else {
                cVar4.setProgress(f3);
                cVar4.setState(d.MOVING);
                cVar4.z = f4;
                if (f4 == 0.0f && f3 != 0.0f) {
                    int i8 = (f3 > 1.0f ? 1 : (f3 == 1.0f ? 0 : -1));
                }
            }
            this.a = Float.NaN;
            this.b = Float.NaN;
            this.c = -1;
            this.f2106d = -1;
        }
    }

    /* compiled from: MotionLayout.java */
    /* renamed from: e.g.b.a.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0034c {
        void a(c cVar, int i2, int i3, float f2);

        void b(c cVar, int i2, int i3);
    }

    /* compiled from: MotionLayout.java */
    /* loaded from: classes.dex */
    public enum d {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        s(false);
        super.dispatchDraw(canvas);
    }

    public int[] getConstraintSetIds() {
        return null;
    }

    public int getCurrentState() {
        return this.B;
    }

    public ArrayList<d.a> getDefinedTransitions() {
        return null;
    }

    public e.g.b.a.a getDesignTool() {
        if (this.M == null) {
            this.M = new e.g.b.a.a(this);
        }
        return this.M;
    }

    public int getEndState() {
        return this.C;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.H;
    }

    public e.g.b.a.d getScene() {
        return null;
    }

    public int getStartState() {
        return this.A;
    }

    public float getTargetPosition() {
        return this.J;
    }

    public Bundle getTransitionState() {
        if (this.W == null) {
            this.W = new b();
        }
        b bVar = this.W;
        c cVar = c.this;
        bVar.f2106d = cVar.C;
        bVar.c = cVar.A;
        bVar.b = cVar.getVelocity();
        bVar.a = c.this.getProgress();
        b bVar2 = this.W;
        Objects.requireNonNull(bVar2);
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", bVar2.a);
        bundle.putFloat("motion.velocity", bVar2.b);
        bundle.putInt("motion.StartState", bVar2.c);
        bundle.putInt("motion.EndState", bVar2.f2106d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        return this.F * 1000.0f;
    }

    public float getVelocity() {
        return this.z;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void h(int i2) {
        this.p = null;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    @Override // e.i.j.o
    public void j(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (i2 == 0 && i3 == 0) {
            return;
        }
        iArr[0] = iArr[0] + i4;
        iArr[1] = iArr[1] + i5;
    }

    @Override // e.i.j.n
    public void k(View view, int i2, int i3, int i4, int i5, int i6) {
    }

    @Override // e.i.j.n
    public boolean l(View view, View view2, int i2, int i3) {
        return false;
    }

    @Override // e.i.j.n
    public void m(View view, View view2, int i2, int i3) {
        this.N = getNanoTime();
    }

    @Override // e.i.j.n
    public void n(View view, int i2) {
    }

    @Override // e.i.j.n
    public void o(View view, int i2, int i3, int[] iArr, int i4) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        b bVar = this.W;
        if (bVar != null) {
            if (this.a0) {
                post(new a());
            } else {
                bVar.a();
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        this.V = true;
        try {
            super.onLayout(z, i2, i3, i4, i5);
        } finally {
            this.V = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof e.g.b.a.b) {
            e.g.b.a.b bVar = (e.g.b.a.b) view;
            if (this.R == null) {
                this.R = new CopyOnWriteArrayList<>();
            }
            this.R.add(bVar);
            if (bVar.n) {
                if (this.P == null) {
                    this.P = new ArrayList<>();
                }
                this.P.add(bVar);
            }
            if (bVar.o) {
                if (this.Q == null) {
                    this.Q = new ArrayList<>();
                }
                this.Q.add(bVar);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<e.g.b.a.b> arrayList = this.P;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<e.g.b.a.b> arrayList2 = this.Q;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        int i2 = this.B;
        super.requestLayout();
    }

    public void s(boolean z) {
        boolean z2;
        int i2;
        d dVar = d.FINISHED;
        if (this.I == -1) {
            this.I = getNanoTime();
        }
        float f2 = this.H;
        if (f2 > 0.0f && f2 < 1.0f) {
            this.B = -1;
        }
        boolean z3 = false;
        if (this.O) {
            float signum = Math.signum(this.J - f2);
            long nanoTime = getNanoTime();
            float f3 = ((((float) (nanoTime - this.I)) * signum) * 1.0E-9f) / this.F;
            float f4 = this.H + f3;
            int i3 = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
            if ((i3 > 0 && f4 >= this.J) || (signum <= 0.0f && f4 <= this.J)) {
                f4 = this.J;
            }
            this.H = f4;
            this.G = f4;
            this.I = nanoTime;
            this.z = f3;
            if (Math.abs(f3) > 1.0E-5f) {
                setState(d.MOVING);
            }
            if ((i3 > 0 && f4 >= this.J) || (signum <= 0.0f && f4 <= this.J)) {
                f4 = this.J;
            }
            int i4 = (f4 > 1.0f ? 1 : (f4 == 1.0f ? 0 : -1));
            if (i4 >= 0 || f4 <= 0.0f) {
                setState(dVar);
            }
            int childCount = getChildCount();
            this.O = false;
            getNanoTime();
            this.U = f4;
            if (childCount <= 0) {
                boolean z4 = (i3 > 0 && f4 >= this.J) || (signum <= 0.0f && f4 <= this.J);
                if (!this.O && z4) {
                    setState(dVar);
                }
                boolean z5 = (!z4) | this.O;
                this.O = z5;
                if (f4 <= 0.0f && (i2 = this.A) != -1 && this.B != i2) {
                    this.B = i2;
                    throw null;
                }
                if (f4 >= 1.0d) {
                    int i5 = this.B;
                    int i6 = this.C;
                    if (i5 != i6) {
                        this.B = i6;
                        throw null;
                    }
                }
                if (z5) {
                    invalidate();
                } else if ((i3 > 0 && i4 == 0) || (signum < 0.0f && f4 == 0.0f)) {
                    setState(dVar);
                }
                if (!this.O && (i3 <= 0 || i4 != 0)) {
                    int i7 = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
                }
            } else {
                getChildAt(0);
                throw null;
            }
        }
        float f5 = this.H;
        if (f5 >= 1.0f) {
            int i8 = this.B;
            int i9 = this.C;
            z2 = i8 != i9;
            this.B = i9;
        } else {
            if (f5 <= 0.0f) {
                int i10 = this.B;
                int i11 = this.A;
                z2 = i10 != i11;
                this.B = i11;
            }
            this.c0 |= z3;
            if (z3 && !this.V) {
                requestLayout();
            }
            this.G = this.H;
        }
        z3 = z2;
        this.c0 |= z3;
        if (z3) {
            requestLayout();
        }
        this.G = this.H;
    }

    public void setDebugMode(int i2) {
        this.L = i2;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.a0 = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.D = z;
    }

    public void setInterpolatedProgress(float f2) {
        setProgress(f2);
    }

    public void setOnHide(float f2) {
        ArrayList<e.g.b.a.b> arrayList = this.Q;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.Q.get(i2).setProgress(f2);
            }
        }
    }

    public void setOnShow(float f2) {
        ArrayList<e.g.b.a.b> arrayList = this.P;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.P.get(i2).setProgress(f2);
            }
        }
    }

    public void setProgress(float f2) {
        d dVar = d.FINISHED;
        d dVar2 = d.MOVING;
        int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i2 < 0 || f2 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.W == null) {
                this.W = new b();
            }
            this.W.a = f2;
        } else if (i2 <= 0) {
            if (this.H == 1.0f && this.B == this.C) {
                setState(dVar2);
            }
            this.B = this.A;
            if (this.H == 0.0f) {
                setState(dVar);
            }
        } else if (f2 >= 1.0f) {
            if (this.H == 0.0f && this.B == this.A) {
                setState(dVar2);
            }
            this.B = this.C;
            if (this.H == 1.0f) {
                setState(dVar);
            }
        } else {
            this.B = -1;
            setState(dVar2);
        }
    }

    public void setScene(e.g.b.a.d dVar) {
        g();
        throw null;
    }

    public void setStartState(int i2) {
        if (!isAttachedToWindow()) {
            if (this.W == null) {
                this.W = new b();
            }
            b bVar = this.W;
            bVar.c = i2;
            bVar.f2106d = i2;
            return;
        }
        this.B = i2;
    }

    public void setState(d dVar) {
        d dVar2 = d.FINISHED;
        if (dVar == dVar2 && this.B == -1) {
            return;
        }
        d dVar3 = this.b0;
        this.b0 = dVar;
        d dVar4 = d.MOVING;
        if (dVar3 == dVar4 && dVar == dVar4) {
            t();
        }
        int ordinal = dVar3.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2 && dVar == dVar2) {
                u();
                return;
            }
            return;
        }
        if (dVar == dVar4) {
            t();
        }
        if (dVar == dVar2) {
            u();
        }
    }

    public void setTransition(int i2) {
    }

    public void setTransition(d.a aVar) {
        throw null;
    }

    public void setTransitionDuration(int i2) {
        Log.e("MotionLayout", "MotionScene not defined");
    }

    public void setTransitionListener(InterfaceC0034c interfaceC0034c) {
        this.K = interfaceC0034c;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.W == null) {
            this.W = new b();
        }
        b bVar = this.W;
        Objects.requireNonNull(bVar);
        bVar.a = bundle.getFloat("motion.progress");
        bVar.b = bundle.getFloat("motion.velocity");
        bVar.c = bundle.getInt("motion.StartState");
        bVar.f2106d = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.W.a();
        }
    }

    public final void t() {
        CopyOnWriteArrayList<InterfaceC0034c> copyOnWriteArrayList;
        if ((this.K == null && ((copyOnWriteArrayList = this.R) == null || copyOnWriteArrayList.isEmpty())) || this.T == this.G) {
            return;
        }
        if (this.S != -1) {
            InterfaceC0034c interfaceC0034c = this.K;
            if (interfaceC0034c != null) {
                interfaceC0034c.b(this, this.A, this.C);
            }
            CopyOnWriteArrayList<InterfaceC0034c> copyOnWriteArrayList2 = this.R;
            if (copyOnWriteArrayList2 != null) {
                Iterator<InterfaceC0034c> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().b(this, this.A, this.C);
                }
            }
        }
        this.S = -1;
        float f2 = this.G;
        this.T = f2;
        InterfaceC0034c interfaceC0034c2 = this.K;
        if (interfaceC0034c2 != null) {
            interfaceC0034c2.a(this, this.A, this.C, f2);
        }
        CopyOnWriteArrayList<InterfaceC0034c> copyOnWriteArrayList3 = this.R;
        if (copyOnWriteArrayList3 != null) {
            Iterator<InterfaceC0034c> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().a(this, this.A, this.C, this.G);
            }
        }
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return e.e.a.d(context, this.A) + "->" + e.e.a.d(context, this.C) + " (pos:" + this.H + " Dpos/Dt:" + this.z;
    }

    public void u() {
        CopyOnWriteArrayList<InterfaceC0034c> copyOnWriteArrayList;
        CopyOnWriteArrayList<InterfaceC0034c> copyOnWriteArrayList2;
        if ((this.K == null && ((copyOnWriteArrayList2 = this.R) == null || copyOnWriteArrayList2.isEmpty())) || this.S != -1) {
            if (this.K != null || ((copyOnWriteArrayList = this.R) != null && !copyOnWriteArrayList.isEmpty())) {
                throw null;
            }
            return;
        }
        this.S = this.B;
        throw null;
    }

    public void v(int i2, int i3) {
        if (isAttachedToWindow()) {
            return;
        }
        if (this.W == null) {
            this.W = new b();
        }
        b bVar = this.W;
        bVar.c = i2;
        bVar.f2106d = i3;
    }

    public void w(int i2) {
        if (!isAttachedToWindow()) {
            if (this.W == null) {
                this.W = new b();
            }
            this.W.f2106d = i2;
            return;
        }
        int i3 = this.B;
        if (i3 == i2 || this.A == i2 || this.C == i2) {
            return;
        }
        this.C = i2;
        if (i3 != -1) {
            v(i3, i2);
            this.H = 0.0f;
            return;
        }
        this.J = 1.0f;
        this.G = 0.0f;
        this.H = 0.0f;
        this.I = getNanoTime();
        this.E = getNanoTime();
        throw null;
    }
}
