package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.common.api.Api;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.video_converter.video_compressor.R;
import e.i.j.h0.d;
import e.i.j.z;
import e.u.b.a;
import e.u.b.a0;
import e.u.b.b;
import e.u.b.b0;
import e.u.b.d0;
import e.u.b.e0;
import e.u.b.k;
import e.u.b.n;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements e.i.j.l {
    public static final int[] D0 = {16843830};
    public static final boolean E0;
    public static final boolean F0;
    public static final boolean G0;
    public static final Class<?>[] H0;
    public static final Interpolator I0;
    public int A;
    public final List<a0> A0;
    public boolean B;
    public Runnable B0;
    public boolean C;
    public final e0.b C0;
    public boolean D;
    public int E;
    public boolean F;
    public final AccessibilityManager G;
    public List<o> H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public i M;
    public EdgeEffect N;
    public EdgeEffect O;
    public EdgeEffect P;
    public EdgeEffect Q;
    public j R;
    public int S;
    public int T;
    public VelocityTracker U;
    public int V;
    public int W;
    public int a0;
    public int b0;
    public int c0;
    public p d0;
    public final int e0;

    /* renamed from: f  reason: collision with root package name */
    public final v f473f;
    public final int f0;

    /* renamed from: g  reason: collision with root package name */
    public final t f474g;
    public float g0;

    /* renamed from: h  reason: collision with root package name */
    public SavedState f475h;
    public float h0;

    /* renamed from: i  reason: collision with root package name */
    public e.u.b.a f476i;
    public boolean i0;

    /* renamed from: j  reason: collision with root package name */
    public e.u.b.b f477j;
    public final z j0;

    /* renamed from: k  reason: collision with root package name */
    public final e0 f478k;
    public e.u.b.n k0;

    /* renamed from: l  reason: collision with root package name */
    public boolean f479l;
    public n.b l0;

    /* renamed from: m  reason: collision with root package name */
    public final Runnable f480m;
    public final x m0;
    public final Rect n;
    public r n0;
    public final Rect o;
    public List<r> o0;
    public final RectF p;
    public boolean p0;
    public e q;
    public boolean q0;
    public m r;
    public j.b r0;
    public u s;
    public boolean s0;
    public final ArrayList<l> t;
    public e.u.b.a0 t0;
    public final ArrayList<q> u;
    public h u0;
    public q v;
    public final int[] v0;
    public boolean w;
    public e.i.j.m w0;
    public boolean x;
    public final int[] x0;
    public boolean y;
    public final int[] y0;
    public boolean z;
    public final int[] z0;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.z || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.w) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.C) {
                recyclerView2.B = true;
            } else {
                recyclerView2.n();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a0 {
        public static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        public static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        public static final int FLAG_BOUND = 1;
        public static final int FLAG_IGNORE = 128;
        public static final int FLAG_INVALID = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_NOT_RECYCLABLE = 16;
        public static final int FLAG_REMOVED = 8;
        public static final int FLAG_RETURNED_FROM_SCRAP = 32;
        public static final int FLAG_TMP_DETACHED = 256;
        public static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        public static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        public int mFlags;
        public WeakReference<RecyclerView> mNestedRecyclerView;
        public RecyclerView mOwnerRecyclerView;
        public int mPosition = -1;
        public int mOldPosition = -1;
        public long mItemId = -1;
        public int mItemViewType = -1;
        public int mPreLayoutPosition = -1;
        public a0 mShadowedHolder = null;
        public a0 mShadowingHolder = null;
        public List<Object> mPayloads = null;
        public List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        public t mScrapContainer = null;
        public boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        public int mPendingAccessibilityState = -1;

        public a0(View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i2) {
            this.mFlags = i2 | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            if ((this.mFlags & 16) == 0) {
                View view = this.itemView;
                AtomicInteger atomicInteger = e.i.j.z.a;
                if (z.d.i(view)) {
                    return true;
                }
            }
            return false;
        }

        public void flagRemovedAndOffsetPosition(int i2, int i3, boolean z) {
            addFlags(8);
            offsetPosition(i3, z);
            this.mPosition = i2;
        }

        public final int getAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.I(this);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i2 = this.mPreLayoutPosition;
            return i2 == -1 ? this.mPosition : i2;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i2 = this.mPreLayoutPosition;
            return i2 == -1 ? this.mPosition : i2;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) == 0) {
                List<Object> list = this.mPayloads;
                if (list != null && list.size() != 0) {
                    return this.mUnmodifiedPayloads;
                }
                return FULLUPDATE_PAYLOADS;
            }
            return FULLUPDATE_PAYLOADS;
        }

        public boolean hasAnyOfTheFlags(int i2) {
            return (i2 & this.mFlags) != 0;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            if ((this.mFlags & 16) == 0) {
                View view = this.itemView;
                AtomicInteger atomicInteger = e.i.j.z.a;
                if (!z.d.i(view)) {
                    return true;
                }
            }
            return false;
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void offsetPosition(int i2, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i2;
            }
            this.mPosition += i2;
            if (this.itemView.getLayoutParams() != null) {
                ((n) this.itemView.getLayoutParams()).c = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i2 = this.mPendingAccessibilityState;
            if (i2 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i2;
            } else {
                View view = this.itemView;
                AtomicInteger atomicInteger = e.i.j.z.a;
                this.mWasImportantForAccessibilityBeforeHidden = z.d.c(view);
            }
            recyclerView.n0(this, 4);
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.n0(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.k(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i2, int i3) {
            this.mFlags = (i2 & i3) | (this.mFlags & (~i3));
        }

        public final void setIsRecyclable(boolean z) {
            int i2 = this.mIsRecyclableCount;
            int i3 = z ? i2 - 1 : i2 + 1;
            this.mIsRecyclableCount = i3;
            if (i3 < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z && i3 == 1) {
                this.mFlags |= 16;
            } else if (z && i3 == 0) {
                this.mFlags &= -17;
            }
        }

        public void setScrapContainer(t tVar, boolean z) {
            this.mScrapContainer = tVar;
            this.mInChangeScrap = z;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder D = f.a.b.a.a.D(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            D.append(Integer.toHexString(hashCode()));
            D.append(" position=");
            D.append(this.mPosition);
            D.append(" id=");
            D.append(this.mItemId);
            D.append(", oldPos=");
            D.append(this.mOldPosition);
            D.append(", pLpos:");
            D.append(this.mPreLayoutPosition);
            StringBuilder sb = new StringBuilder(D.toString());
            if (isScrap()) {
                sb.append(" scrap ");
                sb.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                StringBuilder A = f.a.b.a.a.A(" not recyclable(");
                A.append(this.mIsRecyclableCount);
                A.append(")");
                sb.append(A.toString());
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public void unScrap() {
            this.mScrapContainer.k(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j jVar = RecyclerView.this.R;
            if (jVar != null) {
                e.u.b.k kVar = (e.u.b.k) jVar;
                boolean z = !kVar.f2863h.isEmpty();
                boolean z2 = !kVar.f2865j.isEmpty();
                boolean z3 = !kVar.f2866k.isEmpty();
                boolean z4 = !kVar.f2864i.isEmpty();
                if (z || z2 || z4 || z3) {
                    Iterator<a0> it = kVar.f2863h.iterator();
                    while (it.hasNext()) {
                        a0 next = it.next();
                        View view = next.itemView;
                        ViewPropertyAnimator animate = view.animate();
                        kVar.q.add(next);
                        animate.setDuration(kVar.f484d).alpha(0.0f).setListener(new e.u.b.f(kVar, next, animate, view)).start();
                    }
                    kVar.f2863h.clear();
                    if (z2) {
                        ArrayList<k.b> arrayList = new ArrayList<>();
                        arrayList.addAll(kVar.f2865j);
                        kVar.f2868m.add(arrayList);
                        kVar.f2865j.clear();
                        e.u.b.c cVar = new e.u.b.c(kVar, arrayList);
                        if (z) {
                            View view2 = arrayList.get(0).a.itemView;
                            long j2 = kVar.f484d;
                            AtomicInteger atomicInteger = e.i.j.z.a;
                            z.d.n(view2, cVar, j2);
                        } else {
                            cVar.run();
                        }
                    }
                    if (z3) {
                        ArrayList<k.a> arrayList2 = new ArrayList<>();
                        arrayList2.addAll(kVar.f2866k);
                        kVar.n.add(arrayList2);
                        kVar.f2866k.clear();
                        e.u.b.d dVar = new e.u.b.d(kVar, arrayList2);
                        if (z) {
                            View view3 = arrayList2.get(0).a.itemView;
                            long j3 = kVar.f484d;
                            AtomicInteger atomicInteger2 = e.i.j.z.a;
                            z.d.n(view3, dVar, j3);
                        } else {
                            dVar.run();
                        }
                    }
                    if (z4) {
                        ArrayList<a0> arrayList3 = new ArrayList<>();
                        arrayList3.addAll(kVar.f2864i);
                        kVar.f2867l.add(arrayList3);
                        kVar.f2864i.clear();
                        e.u.b.e eVar = new e.u.b.e(kVar, arrayList3);
                        if (!z && !z2 && !z3) {
                            eVar.run();
                        } else {
                            long j4 = z ? kVar.f484d : 0L;
                            long j5 = z2 ? kVar.f485e : 0L;
                            long j6 = z3 ? kVar.f486f : 0L;
                            View view4 = arrayList3.get(0).itemView;
                            AtomicInteger atomicInteger3 = e.i.j.z.a;
                            z.d.n(view4, eVar, Math.max(j5, j6) + j4);
                        }
                    }
                }
            }
            RecyclerView.this.s0 = false;
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public class d implements e0.b {
        public d() {
        }

        public void a(a0 a0Var, j.c cVar, j.c cVar2) {
            boolean z;
            int i2;
            int i3;
            RecyclerView recyclerView = RecyclerView.this;
            Objects.requireNonNull(recyclerView);
            a0Var.setIsRecyclable(false);
            b0 b0Var = (b0) recyclerView.R;
            Objects.requireNonNull(b0Var);
            if (cVar != null && ((i2 = cVar.a) != (i3 = cVar2.a) || cVar.b != cVar2.b)) {
                z = b0Var.i(a0Var, i2, cVar.b, i3, cVar2.b);
            } else {
                e.u.b.k kVar = (e.u.b.k) b0Var;
                kVar.n(a0Var);
                a0Var.itemView.setAlpha(0.0f);
                kVar.f2864i.add(a0Var);
                z = true;
            }
            if (z) {
                recyclerView.c0();
            }
        }

        public void b(a0 a0Var, j.c cVar, j.c cVar2) {
            boolean z;
            RecyclerView.this.f474g.k(a0Var);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f(a0Var);
            a0Var.setIsRecyclable(false);
            b0 b0Var = (b0) recyclerView.R;
            Objects.requireNonNull(b0Var);
            int i2 = cVar.a;
            int i3 = cVar.b;
            View view = a0Var.itemView;
            int left = cVar2 == null ? view.getLeft() : cVar2.a;
            int top = cVar2 == null ? view.getTop() : cVar2.b;
            if (!a0Var.isRemoved() && (i2 != left || i3 != top)) {
                view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                z = b0Var.i(a0Var, i2, i3, left, top);
            } else {
                e.u.b.k kVar = (e.u.b.k) b0Var;
                kVar.n(a0Var);
                kVar.f2863h.add(a0Var);
                z = true;
            }
            if (z) {
                recyclerView.c0();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class f extends Observable<g> {
        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void c(int i2, int i3) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).e(i2, i3, 1);
            }
        }

        public void d(int i2, int i3, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).c(i2, i3, obj);
            }
        }

        public void e(int i2, int i3) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).d(i2, i3);
            }
        }

        public void f(int i2, int i3) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).f(i2, i3);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class g {
        public void a() {
        }

        public void b(int i2, int i3) {
        }

        public void c(int i2, int i3, Object obj) {
            b(i2, i3);
        }

        public void d(int i2, int i3) {
        }

        public void e(int i2, int i3, int i4) {
        }

        public void f(int i2, int i3) {
        }
    }

    /* loaded from: classes.dex */
    public interface h {
        int a(int i2, int i3);
    }

    /* loaded from: classes.dex */
    public static class i {
        public EdgeEffect a(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* loaded from: classes.dex */
    public static abstract class j {
        public b a = null;
        public ArrayList<a> b = new ArrayList<>();
        public long c = 120;

        /* renamed from: d  reason: collision with root package name */
        public long f484d = 120;

        /* renamed from: e  reason: collision with root package name */
        public long f485e = 250;

        /* renamed from: f  reason: collision with root package name */
        public long f486f = 250;

        /* loaded from: classes.dex */
        public interface a {
            void a();
        }

        /* loaded from: classes.dex */
        public interface b {
        }

        /* loaded from: classes.dex */
        public static class c {
            public int a;
            public int b;
        }

        public static int b(a0 a0Var) {
            int i2 = a0Var.mFlags & 14;
            if (a0Var.isInvalid()) {
                return 4;
            }
            if ((i2 & 4) == 0) {
                int oldPosition = a0Var.getOldPosition();
                int adapterPosition = a0Var.getAdapterPosition();
                return (oldPosition == -1 || adapterPosition == -1 || oldPosition == adapterPosition) ? i2 : i2 | a0.FLAG_MOVED;
            }
            return i2;
        }

        public abstract boolean a(a0 a0Var, a0 a0Var2, c cVar, c cVar2);

        public final void c(a0 a0Var) {
            b bVar = this.a;
            if (bVar != null) {
                k kVar = (k) bVar;
                Objects.requireNonNull(kVar);
                boolean z = true;
                a0Var.setIsRecyclable(true);
                if (a0Var.mShadowedHolder != null && a0Var.mShadowingHolder == null) {
                    a0Var.mShadowedHolder = null;
                }
                a0Var.mShadowingHolder = null;
                if (a0Var.shouldBeKeptAsChild()) {
                    return;
                }
                RecyclerView recyclerView = RecyclerView.this;
                View view = a0Var.itemView;
                recyclerView.r0();
                e.u.b.b bVar2 = recyclerView.f477j;
                int indexOfChild = ((e.u.b.y) bVar2.a).a.indexOfChild(view);
                if (indexOfChild == -1) {
                    bVar2.l(view);
                } else if (bVar2.b.d(indexOfChild)) {
                    bVar2.b.f(indexOfChild);
                    bVar2.l(view);
                    ((e.u.b.y) bVar2.a).c(indexOfChild);
                } else {
                    z = false;
                }
                if (z) {
                    a0 M = RecyclerView.M(view);
                    recyclerView.f474g.k(M);
                    recyclerView.f474g.h(M);
                }
                recyclerView.t0(!z);
                if (z || !a0Var.isTmpDetached()) {
                    return;
                }
                RecyclerView.this.removeDetachedView(a0Var.itemView, false);
            }
        }

        public final void d() {
            int size = this.b.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.b.get(i2).a();
            }
            this.b.clear();
        }

        public abstract void e(a0 a0Var);

        public abstract void f();

        public abstract boolean g();

        public c h(a0 a0Var) {
            c cVar = new c();
            View view = a0Var.itemView;
            cVar.a = view.getLeft();
            cVar.b = view.getTop();
            view.getRight();
            view.getBottom();
            return cVar;
        }
    }

    /* loaded from: classes.dex */
    public class k implements j.b {
        public k() {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class l {
        public void f(Rect rect, View view, RecyclerView recyclerView, x xVar) {
            ((n) view.getLayoutParams()).a();
            rect.set(0, 0, 0, 0);
        }

        public void g(Canvas canvas, RecyclerView recyclerView, x xVar) {
        }

        public void h(Canvas canvas, RecyclerView recyclerView, x xVar) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class m {
        public e.u.b.b a;
        public RecyclerView b;
        public final d0.b c;

        /* renamed from: d  reason: collision with root package name */
        public final d0.b f487d;

        /* renamed from: e  reason: collision with root package name */
        public d0 f488e;

        /* renamed from: f  reason: collision with root package name */
        public d0 f489f;

        /* renamed from: g  reason: collision with root package name */
        public w f490g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f491h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f492i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f493j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f494k;

        /* renamed from: l  reason: collision with root package name */
        public int f495l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f496m;
        public int n;
        public int o;
        public int p;
        public int q;

        /* loaded from: classes.dex */
        public class a implements d0.b {
            public a() {
            }

            @Override // e.u.b.d0.b
            public int a(View view) {
                return m.this.E(view) - ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).leftMargin;
            }

            @Override // e.u.b.d0.b
            public int b() {
                return m.this.P();
            }

            @Override // e.u.b.d0.b
            public int c() {
                m mVar = m.this;
                return mVar.p - mVar.Q();
            }

            @Override // e.u.b.d0.b
            public View d(int i2) {
                return m.this.z(i2);
            }

            @Override // e.u.b.d0.b
            public int e(View view) {
                return m.this.H(view) + ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).rightMargin;
            }
        }

        /* loaded from: classes.dex */
        public class b implements d0.b {
            public b() {
            }

            @Override // e.u.b.d0.b
            public int a(View view) {
                return m.this.I(view) - ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).topMargin;
            }

            @Override // e.u.b.d0.b
            public int b() {
                return m.this.R();
            }

            @Override // e.u.b.d0.b
            public int c() {
                m mVar = m.this;
                return mVar.q - mVar.O();
            }

            @Override // e.u.b.d0.b
            public View d(int i2) {
                return m.this.z(i2);
            }

            @Override // e.u.b.d0.b
            public int e(View view) {
                return m.this.D(view) + ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).bottomMargin;
            }
        }

        /* loaded from: classes.dex */
        public interface c {
        }

        /* loaded from: classes.dex */
        public static class d {
            public int a;
            public int b;
            public boolean c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f497d;
        }

        public m() {
            a aVar = new a();
            this.c = aVar;
            b bVar = new b();
            this.f487d = bVar;
            this.f488e = new d0(aVar);
            this.f489f = new d0(bVar);
            this.f491h = false;
            this.f492i = false;
            this.f493j = true;
            this.f494k = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
            if (r5 == 1073741824) goto L8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int B(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1a
                if (r7 < 0) goto L11
                goto L1c
            L11:
                if (r7 != r1) goto L2f
                if (r5 == r2) goto L21
                if (r5 == 0) goto L2f
                if (r5 == r3) goto L21
                goto L2f
            L1a:
                if (r7 < 0) goto L1f
            L1c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L31
            L1f:
                if (r7 != r1) goto L23
            L21:
                r7 = r4
                goto L31
            L23:
                if (r7 != r0) goto L2f
                if (r5 == r2) goto L2c
                if (r5 != r3) goto L2a
                goto L2c
            L2a:
                r5 = 0
                goto L21
            L2c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L21
            L2f:
                r5 = 0
                r7 = 0
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m.B(int, int, int, int, boolean):int");
        }

        public static d T(Context context, AttributeSet attributeSet, int i2, int i3) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.u.a.a, i2, i3);
            dVar.a = obtainStyledAttributes.getInt(0, 1);
            dVar.b = obtainStyledAttributes.getInt(10, 1);
            dVar.c = obtainStyledAttributes.getBoolean(9, false);
            dVar.f497d = obtainStyledAttributes.getBoolean(11, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static boolean Z(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if (i4 <= 0 || i2 == i4) {
                if (mode == Integer.MIN_VALUE) {
                    return size >= i2;
                } else if (mode != 0) {
                    return mode == 1073741824 && size == i2;
                } else {
                    return true;
                }
            }
            return false;
        }

        public static int j(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i3, i4) : size;
            }
            return Math.min(size, Math.max(i3, i4));
        }

        public int A() {
            e.u.b.b bVar = this.a;
            if (bVar != null) {
                return bVar.e();
            }
            return 0;
        }

        public boolean A0(RecyclerView recyclerView, View view, View view2) {
            return z0(recyclerView);
        }

        public void B0(Parcelable parcelable) {
        }

        public int C(t tVar, x xVar) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || recyclerView.q == null || !g()) {
                return 1;
            }
            return this.b.q.getItemCount();
        }

        public Parcelable C0() {
            return null;
        }

        public int D(View view) {
            return view.getBottom() + ((n) view.getLayoutParams()).b.bottom;
        }

        public void D0(int i2) {
        }

        public int E(View view) {
            return view.getLeft() - ((n) view.getLayoutParams()).b.left;
        }

        public boolean E0(t tVar, x xVar, int i2, Bundle bundle) {
            int R;
            int P;
            int i3;
            int i4;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                return false;
            }
            if (i2 == 4096) {
                R = recyclerView.canScrollVertically(1) ? (this.q - R()) - O() : 0;
                if (this.b.canScrollHorizontally(1)) {
                    P = (this.p - P()) - Q();
                    i3 = R;
                    i4 = P;
                }
                i3 = R;
                i4 = 0;
            } else if (i2 != 8192) {
                i4 = 0;
                i3 = 0;
            } else {
                R = recyclerView.canScrollVertically(-1) ? -((this.q - R()) - O()) : 0;
                if (this.b.canScrollHorizontally(-1)) {
                    P = -((this.p - P()) - Q());
                    i3 = R;
                    i4 = P;
                }
                i3 = R;
                i4 = 0;
            }
            if (i3 == 0 && i4 == 0) {
                return false;
            }
            this.b.p0(i4, i3, null, Integer.MIN_VALUE, true);
            return true;
        }

        public int F(View view) {
            Rect rect = ((n) view.getLayoutParams()).b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public boolean F0() {
            return false;
        }

        public int G(View view) {
            Rect rect = ((n) view.getLayoutParams()).b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void G0(t tVar) {
            for (int A = A() - 1; A >= 0; A--) {
                if (!RecyclerView.M(z(A)).shouldIgnore()) {
                    J0(A, tVar);
                }
            }
        }

        public int H(View view) {
            return view.getRight() + ((n) view.getLayoutParams()).b.right;
        }

        public void H0(t tVar) {
            int size = tVar.a.size();
            for (int i2 = size - 1; i2 >= 0; i2--) {
                View view = tVar.a.get(i2).itemView;
                a0 M = RecyclerView.M(view);
                if (!M.shouldIgnore()) {
                    M.setIsRecyclable(false);
                    if (M.isTmpDetached()) {
                        this.b.removeDetachedView(view, false);
                    }
                    j jVar = this.b.R;
                    if (jVar != null) {
                        jVar.e(M);
                    }
                    M.setIsRecyclable(true);
                    a0 M2 = RecyclerView.M(view);
                    M2.mScrapContainer = null;
                    M2.mInChangeScrap = false;
                    M2.clearReturnedFromScrapFlag();
                    tVar.h(M2);
                }
            }
            tVar.a.clear();
            ArrayList<a0> arrayList = tVar.b;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.b.invalidate();
            }
        }

        public int I(View view) {
            return view.getTop() - ((n) view.getLayoutParams()).b.top;
        }

        public void I0(View view, t tVar) {
            e.u.b.b bVar = this.a;
            int indexOfChild = ((e.u.b.y) bVar.a).a.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (bVar.b.f(indexOfChild)) {
                    bVar.l(view);
                }
                ((e.u.b.y) bVar.a).c(indexOfChild);
            }
            tVar.g(view);
        }

        public View J() {
            View focusedChild;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.a.c.contains(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void J0(int i2, t tVar) {
            View z = z(i2);
            K0(i2);
            tVar.g(z);
        }

        public int K() {
            RecyclerView recyclerView = this.b;
            e adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public void K0(int i2) {
            e.u.b.b bVar;
            int f2;
            View a2;
            if (z(i2) == null || (a2 = ((e.u.b.y) bVar.a).a((f2 = (bVar = this.a).f(i2)))) == null) {
                return;
            }
            if (bVar.b.f(f2)) {
                bVar.l(a2);
            }
            ((e.u.b.y) bVar.a).c(f2);
        }

        public int L() {
            RecyclerView recyclerView = this.b;
            AtomicInteger atomicInteger = e.i.j.z.a;
            return z.e.d(recyclerView);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00b3, code lost:
            if (r14 == false) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean L0(androidx.recyclerview.widget.RecyclerView r10, android.view.View r11, android.graphics.Rect r12, boolean r13, boolean r14) {
            /*
                r9 = this;
                r0 = 2
                int[] r0 = new int[r0]
                int r1 = r9.P()
                int r2 = r9.R()
                int r3 = r9.p
                int r4 = r9.Q()
                int r3 = r3 - r4
                int r4 = r9.q
                int r5 = r9.O()
                int r4 = r4 - r5
                int r5 = r11.getLeft()
                int r6 = r12.left
                int r5 = r5 + r6
                int r6 = r11.getScrollX()
                int r5 = r5 - r6
                int r6 = r11.getTop()
                int r7 = r12.top
                int r6 = r6 + r7
                int r11 = r11.getScrollY()
                int r6 = r6 - r11
                int r11 = r12.width()
                int r11 = r11 + r5
                int r12 = r12.height()
                int r12 = r12 + r6
                int r5 = r5 - r1
                r1 = 0
                int r7 = java.lang.Math.min(r1, r5)
                int r6 = r6 - r2
                int r2 = java.lang.Math.min(r1, r6)
                int r11 = r11 - r3
                int r3 = java.lang.Math.max(r1, r11)
                int r12 = r12 - r4
                int r12 = java.lang.Math.max(r1, r12)
                int r4 = r9.L()
                r8 = 1
                if (r4 != r8) goto L5f
                if (r3 == 0) goto L5a
                goto L67
            L5a:
                int r3 = java.lang.Math.max(r7, r11)
                goto L67
            L5f:
                if (r7 == 0) goto L62
                goto L66
            L62:
                int r7 = java.lang.Math.min(r5, r3)
            L66:
                r3 = r7
            L67:
                if (r2 == 0) goto L6a
                goto L6e
            L6a:
                int r2 = java.lang.Math.min(r6, r12)
            L6e:
                r0[r1] = r3
                r0[r8] = r2
                r11 = r0[r1]
                r12 = r0[r8]
                if (r14 == 0) goto Lb5
                android.view.View r14 = r10.getFocusedChild()
                if (r14 != 0) goto L80
            L7e:
                r14 = 0
                goto Lb3
            L80:
                int r0 = r9.P()
                int r2 = r9.R()
                int r3 = r9.p
                int r4 = r9.Q()
                int r3 = r3 - r4
                int r4 = r9.q
                int r5 = r9.O()
                int r4 = r4 - r5
                androidx.recyclerview.widget.RecyclerView r5 = r9.b
                android.graphics.Rect r5 = r5.n
                androidx.recyclerview.widget.RecyclerView.N(r14, r5)
                int r14 = r5.left
                int r14 = r14 - r11
                if (r14 >= r3) goto L7e
                int r14 = r5.right
                int r14 = r14 - r11
                if (r14 <= r0) goto L7e
                int r14 = r5.top
                int r14 = r14 - r12
                if (r14 >= r4) goto L7e
                int r14 = r5.bottom
                int r14 = r14 - r12
                if (r14 > r2) goto Lb2
                goto L7e
            Lb2:
                r14 = 1
            Lb3:
                if (r14 == 0) goto Lba
            Lb5:
                if (r11 != 0) goto Lbb
                if (r12 == 0) goto Lba
                goto Lbb
            Lba:
                return r1
            Lbb:
                if (r13 == 0) goto Lc1
                r10.scrollBy(r11, r12)
                goto Lc4
            Lc1:
                r10.o0(r11, r12)
            Lc4:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m.L0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }

        public int M() {
            RecyclerView recyclerView = this.b;
            AtomicInteger atomicInteger = e.i.j.z.a;
            return z.d.d(recyclerView);
        }

        public void M0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int N() {
            RecyclerView recyclerView = this.b;
            AtomicInteger atomicInteger = e.i.j.z.a;
            return z.d.e(recyclerView);
        }

        public int N0(int i2, t tVar, x xVar) {
            return 0;
        }

        public int O() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public void O0(int i2) {
        }

        public int P() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int P0(int i2, t tVar, x xVar) {
            return 0;
        }

        public int Q() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public void Q0(RecyclerView recyclerView) {
            R0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), CommonUtils.BYTES_IN_A_GIGABYTE), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), CommonUtils.BYTES_IN_A_GIGABYTE));
        }

        public int R() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public void R0(int i2, int i3) {
            this.p = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            this.n = mode;
            if (mode == 0 && !RecyclerView.E0) {
                this.p = 0;
            }
            this.q = View.MeasureSpec.getSize(i3);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.o = mode2;
            if (mode2 != 0 || RecyclerView.E0) {
                return;
            }
            this.q = 0;
        }

        public int S(View view) {
            return ((n) view.getLayoutParams()).a();
        }

        public void S0(Rect rect, int i2, int i3) {
            int Q = Q() + P() + rect.width();
            int O = O() + R() + rect.height();
            this.b.setMeasuredDimension(j(i2, Q, N()), j(i3, O, M()));
        }

        public void T0(int i2, int i3) {
            int A = A();
            if (A == 0) {
                this.b.o(i2, i3);
                return;
            }
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            int i7 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            for (int i8 = 0; i8 < A; i8++) {
                View z = z(i8);
                Rect rect = this.b.n;
                RecyclerView.N(z, rect);
                int i9 = rect.left;
                if (i9 < i6) {
                    i6 = i9;
                }
                int i10 = rect.right;
                if (i10 > i4) {
                    i4 = i10;
                }
                int i11 = rect.top;
                if (i11 < i7) {
                    i7 = i11;
                }
                int i12 = rect.bottom;
                if (i12 > i5) {
                    i5 = i12;
                }
            }
            this.b.n.set(i6, i7, i4, i5);
            S0(this.b.n, i2, i3);
        }

        public int U(t tVar, x xVar) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || recyclerView.q == null || !h()) {
                return 1;
            }
            return this.b.q.getItemCount();
        }

        public void U0(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.b = null;
                this.a = null;
                this.p = 0;
                this.q = 0;
            } else {
                this.b = recyclerView;
                this.a = recyclerView.f477j;
                this.p = recyclerView.getWidth();
                this.q = recyclerView.getHeight();
            }
            this.n = CommonUtils.BYTES_IN_A_GIGABYTE;
            this.o = CommonUtils.BYTES_IN_A_GIGABYTE;
        }

        public int V() {
            return 0;
        }

        public boolean V0(View view, int i2, int i3, n nVar) {
            return (!view.isLayoutRequested() && this.f493j && Z(view.getWidth(), i2, ((ViewGroup.MarginLayoutParams) nVar).width) && Z(view.getHeight(), i3, ((ViewGroup.MarginLayoutParams) nVar).height)) ? false : true;
        }

        public void W(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((n) view.getLayoutParams()).b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.b.p;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean W0() {
            return false;
        }

        public boolean X() {
            return false;
        }

        public boolean X0(View view, int i2, int i3, n nVar) {
            return (this.f493j && Z(view.getMeasuredWidth(), i2, ((ViewGroup.MarginLayoutParams) nVar).width) && Z(view.getMeasuredHeight(), i3, ((ViewGroup.MarginLayoutParams) nVar).height)) ? false : true;
        }

        public boolean Y() {
            return false;
        }

        public void Y0(RecyclerView recyclerView, x xVar, int i2) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public void Z0(w wVar) {
            w wVar2 = this.f490g;
            if (wVar2 != null && wVar != wVar2 && wVar2.f506e) {
                wVar2.d();
            }
            this.f490g = wVar;
            RecyclerView recyclerView = this.b;
            Objects.requireNonNull(wVar);
            recyclerView.j0.c();
            if (wVar.f509h) {
                StringBuilder A = f.a.b.a.a.A("An instance of ");
                A.append(wVar.getClass().getSimpleName());
                A.append(" was started more than once. Each instance of");
                A.append(wVar.getClass().getSimpleName());
                A.append(" is intended to only be used once. You should create a new instance for each use.");
                Log.w("RecyclerView", A.toString());
            }
            wVar.b = recyclerView;
            wVar.c = this;
            int i2 = wVar.a;
            if (i2 != -1) {
                recyclerView.m0.a = i2;
                wVar.f506e = true;
                wVar.f505d = true;
                wVar.f507f = recyclerView.r.v(i2);
                wVar.b.j0.a();
                wVar.f509h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public boolean a0(View view, boolean z) {
            boolean z2 = this.f488e.b(view, 24579) && this.f489f.b(view, 24579);
            return z ? z2 : !z2;
        }

        public boolean a1() {
            return false;
        }

        public void b0(View view, int i2, int i3, int i4, int i5) {
            n nVar = (n) view.getLayoutParams();
            Rect rect = nVar.b;
            view.layout(i2 + rect.left + ((ViewGroup.MarginLayoutParams) nVar).leftMargin, i3 + rect.top + ((ViewGroup.MarginLayoutParams) nVar).topMargin, (i4 - rect.right) - ((ViewGroup.MarginLayoutParams) nVar).rightMargin, (i5 - rect.bottom) - ((ViewGroup.MarginLayoutParams) nVar).bottomMargin);
        }

        public void c(View view) {
            d(view, -1, false);
        }

        public void c0(int i2) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                int e2 = recyclerView.f477j.e();
                for (int i3 = 0; i3 < e2; i3++) {
                    recyclerView.f477j.d(i3).offsetLeftAndRight(i2);
                }
            }
        }

        public final void d(View view, int i2, boolean z) {
            a0 M = RecyclerView.M(view);
            if (!z && !M.isRemoved()) {
                this.b.f478k.f(M);
            } else {
                this.b.f478k.a(M);
            }
            n nVar = (n) view.getLayoutParams();
            if (!M.wasReturnedFromScrap() && !M.isScrap()) {
                if (view.getParent() == this.b) {
                    int j2 = this.a.j(view);
                    if (i2 == -1) {
                        i2 = this.a.e();
                    }
                    if (j2 == -1) {
                        StringBuilder A = f.a.b.a.a.A("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                        A.append(this.b.indexOfChild(view));
                        throw new IllegalStateException(f.a.b.a.a.h(this.b, A));
                    } else if (j2 != i2) {
                        m mVar = this.b.r;
                        View z2 = mVar.z(j2);
                        if (z2 != null) {
                            mVar.z(j2);
                            mVar.t(j2);
                            n nVar2 = (n) z2.getLayoutParams();
                            a0 M2 = RecyclerView.M(z2);
                            if (M2.isRemoved()) {
                                mVar.b.f478k.a(M2);
                            } else {
                                mVar.b.f478k.f(M2);
                            }
                            mVar.a.b(z2, i2, nVar2, M2.isRemoved());
                        } else {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + j2 + mVar.b.toString());
                        }
                    }
                } else {
                    this.a.a(view, i2, false);
                    nVar.c = true;
                    w wVar = this.f490g;
                    if (wVar != null && wVar.f506e && wVar.b.K(view) == wVar.a) {
                        wVar.f507f = view;
                    }
                }
            } else {
                if (M.isScrap()) {
                    M.unScrap();
                } else {
                    M.clearReturnedFromScrapFlag();
                }
                this.a.b(view, i2, view.getLayoutParams(), false);
            }
            if (nVar.f498d) {
                M.itemView.invalidate();
                nVar.f498d = false;
            }
        }

        public void d0(int i2) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                int e2 = recyclerView.f477j.e();
                for (int i3 = 0; i3 < e2; i3++) {
                    recyclerView.f477j.d(i3).offsetTopAndBottom(i2);
                }
            }
        }

        public void e(String str) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.i(str);
            }
        }

        public void e0() {
        }

        public void f(View view, Rect rect) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.O(view));
            }
        }

        public boolean f0() {
            return false;
        }

        public boolean g() {
            return false;
        }

        public void g0() {
        }

        public boolean h() {
            return false;
        }

        @Deprecated
        public void h0() {
        }

        public boolean i(n nVar) {
            return nVar != null;
        }

        public void i0(RecyclerView recyclerView, t tVar) {
            h0();
        }

        public View j0(View view, int i2, t tVar, x xVar) {
            return null;
        }

        public void k(int i2, int i3, x xVar, c cVar) {
        }

        public void k0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            t tVar = recyclerView.f474g;
            x xVar = recyclerView.m0;
            l0(accessibilityEvent);
        }

        public void l(int i2, c cVar) {
        }

        public void l0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            e eVar = this.b.q;
            if (eVar != null) {
                accessibilityEvent.setItemCount(eVar.getItemCount());
            }
        }

        public int m(x xVar) {
            return 0;
        }

        public void m0(t tVar, x xVar, e.i.j.h0.d dVar) {
            if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
                dVar.a.addAction(8192);
                dVar.a.setScrollable(true);
            }
            if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
                dVar.a.addAction(4096);
                dVar.a.setScrollable(true);
            }
            dVar.m(d.b.a(U(tVar, xVar), C(tVar, xVar), Y(), V()));
        }

        public int n(x xVar) {
            return 0;
        }

        public void n0(View view, e.i.j.h0.d dVar) {
            a0 M = RecyclerView.M(view);
            if (M == null || M.isRemoved() || this.a.k(M.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.b;
            o0(recyclerView.f474g, recyclerView.m0, view, dVar);
        }

        public int o(x xVar) {
            return 0;
        }

        public void o0(t tVar, x xVar, View view, e.i.j.h0.d dVar) {
            dVar.n(d.c.a(h() ? S(view) : 0, 1, g() ? S(view) : 0, 1, false, false));
        }

        public int p(x xVar) {
            return 0;
        }

        public View p0() {
            return null;
        }

        public int q(x xVar) {
            return 0;
        }

        public void q0(RecyclerView recyclerView, int i2, int i3) {
        }

        public int r(x xVar) {
            return 0;
        }

        public void r0(RecyclerView recyclerView) {
        }

        public void s(t tVar) {
            int A = A();
            while (true) {
                A--;
                if (A < 0) {
                    return;
                }
                View z = z(A);
                a0 M = RecyclerView.M(z);
                if (!M.shouldIgnore()) {
                    if (M.isInvalid() && !M.isRemoved() && !this.b.q.hasStableIds()) {
                        K0(A);
                        tVar.h(M);
                    } else {
                        z(A);
                        t(A);
                        tVar.i(z);
                        this.b.f478k.f(M);
                    }
                }
            }
        }

        public void s0(RecyclerView recyclerView, int i2, int i3, int i4) {
        }

        public final void t(int i2) {
            this.a.c(i2);
        }

        public void t0(RecyclerView recyclerView, int i2, int i3) {
        }

        public View u(View view) {
            View D;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (D = recyclerView.D(view)) == null || this.a.c.contains(D)) {
                return null;
            }
            return D;
        }

        public void u0() {
        }

        public View v(int i2) {
            int A = A();
            for (int i3 = 0; i3 < A; i3++) {
                View z = z(i3);
                a0 M = RecyclerView.M(z);
                if (M != null && M.getLayoutPosition() == i2 && !M.shouldIgnore() && (this.b.m0.f517g || !M.isRemoved())) {
                    return z;
                }
            }
            return null;
        }

        public void v0(RecyclerView recyclerView, int i2, int i3, Object obj) {
            u0();
        }

        public abstract n w();

        public void w0(t tVar, x xVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public n x(Context context, AttributeSet attributeSet) {
            return new n(context, attributeSet);
        }

        public void x0(x xVar) {
        }

        public n y(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof n) {
                return new n((n) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new n((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new n(layoutParams);
        }

        public void y0(int i2, int i3) {
            this.b.o(i2, i3);
        }

        public View z(int i2) {
            e.u.b.b bVar = this.a;
            if (bVar != null) {
                return ((e.u.b.y) bVar.a).a(bVar.f(i2));
            }
            return null;
        }

        @Deprecated
        public boolean z0(RecyclerView recyclerView) {
            w wVar = this.f490g;
            return (wVar != null && wVar.f506e) || recyclerView.R();
        }
    }

    /* loaded from: classes.dex */
    public interface o {
        void b(View view);

        void d(View view);
    }

    /* loaded from: classes.dex */
    public static abstract class p {
    }

    /* loaded from: classes.dex */
    public interface q {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean c(RecyclerView recyclerView, MotionEvent motionEvent);

        void e(boolean z);
    }

    /* loaded from: classes.dex */
    public static abstract class r {
        public void a(RecyclerView recyclerView, int i2) {
        }

        public void b(RecyclerView recyclerView, int i2, int i3) {
        }
    }

    /* loaded from: classes.dex */
    public static class s {
        public SparseArray<a> a = new SparseArray<>();
        public int b = 0;

        /* loaded from: classes.dex */
        public static class a {
            public final ArrayList<a0> a = new ArrayList<>();
            public int b = 5;
            public long c = 0;

            /* renamed from: d  reason: collision with root package name */
            public long f499d = 0;
        }

        public final a a(int i2) {
            a aVar = this.a.get(i2);
            if (aVar == null) {
                a aVar2 = new a();
                this.a.put(i2, aVar2);
                return aVar2;
            }
            return aVar;
        }

        public long b(long j2, long j3) {
            if (j2 == 0) {
                return j3;
            }
            return (j3 / 4) + ((j2 / 4) * 3);
        }
    }

    /* loaded from: classes.dex */
    public final class t {
        public final ArrayList<a0> a;
        public ArrayList<a0> b;
        public final ArrayList<a0> c;

        /* renamed from: d  reason: collision with root package name */
        public final List<a0> f500d;

        /* renamed from: e  reason: collision with root package name */
        public int f501e;

        /* renamed from: f  reason: collision with root package name */
        public int f502f;

        /* renamed from: g  reason: collision with root package name */
        public s f503g;

        public t() {
            ArrayList<a0> arrayList = new ArrayList<>();
            this.a = arrayList;
            this.b = null;
            this.c = new ArrayList<>();
            this.f500d = Collections.unmodifiableList(arrayList);
            this.f501e = 2;
            this.f502f = 2;
        }

        public void a(a0 a0Var, boolean z) {
            RecyclerView.k(a0Var);
            View view = a0Var.itemView;
            e.u.b.a0 a0Var2 = RecyclerView.this.t0;
            if (a0Var2 != null) {
                a0.a aVar = a0Var2.f2843e;
                e.i.j.z.w(view, aVar instanceof a0.a ? aVar.f2845e.remove(view) : null);
            }
            if (z) {
                u uVar = RecyclerView.this.s;
                if (uVar != null) {
                    uVar.a(a0Var);
                }
                e eVar = RecyclerView.this.q;
                if (eVar != null) {
                    eVar.onViewRecycled(a0Var);
                }
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.m0 != null) {
                    recyclerView.f478k.g(a0Var);
                }
            }
            a0Var.mOwnerRecyclerView = null;
            s d2 = d();
            Objects.requireNonNull(d2);
            int itemViewType = a0Var.getItemViewType();
            ArrayList<a0> arrayList = d2.a(itemViewType).a;
            if (d2.a.get(itemViewType).b <= arrayList.size()) {
                return;
            }
            a0Var.resetInternal();
            arrayList.add(a0Var);
        }

        public void b() {
            this.a.clear();
            e();
        }

        public int c(int i2) {
            if (i2 >= 0 && i2 < RecyclerView.this.m0.b()) {
                RecyclerView recyclerView = RecyclerView.this;
                return !recyclerView.m0.f517g ? i2 : recyclerView.f476i.f(i2, 0);
            }
            StringBuilder B = f.a.b.a.a.B("invalid position ", i2, ". State item count is ");
            B.append(RecyclerView.this.m0.b());
            throw new IndexOutOfBoundsException(f.a.b.a.a.h(RecyclerView.this, B));
        }

        public s d() {
            if (this.f503g == null) {
                this.f503g = new s();
            }
            return this.f503g;
        }

        public void e() {
            for (int size = this.c.size() - 1; size >= 0; size--) {
                f(size);
            }
            this.c.clear();
            if (RecyclerView.G0) {
                n.b bVar = RecyclerView.this.l0;
                int[] iArr = bVar.c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.f2892d = 0;
            }
        }

        public void f(int i2) {
            a(this.c.get(i2), true);
            this.c.remove(i2);
        }

        public void g(View view) {
            a0 M = RecyclerView.M(view);
            if (M.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (M.isScrap()) {
                M.unScrap();
            } else if (M.wasReturnedFromScrap()) {
                M.clearReturnedFromScrapFlag();
            }
            h(M);
            if (RecyclerView.this.R == null || M.isRecyclable()) {
                return;
            }
            RecyclerView.this.R.e(M);
        }

        public void h(a0 a0Var) {
            boolean z = true;
            if (!a0Var.isScrap() && a0Var.itemView.getParent() == null) {
                if (!a0Var.isTmpDetached()) {
                    if (!a0Var.shouldIgnore()) {
                        boolean doesTransientStatePreventRecycling = a0Var.doesTransientStatePreventRecycling();
                        e eVar = RecyclerView.this.q;
                        if ((eVar != null && doesTransientStatePreventRecycling && eVar.onFailedToRecycleView(a0Var)) || a0Var.isRecyclable()) {
                            if (this.f502f <= 0 || a0Var.hasAnyOfTheFlags(526)) {
                                r1 = false;
                            } else {
                                int size = this.c.size();
                                if (size >= this.f502f && size > 0) {
                                    f(0);
                                    size--;
                                }
                                if (RecyclerView.G0 && size > 0 && !RecyclerView.this.l0.c(a0Var.mPosition)) {
                                    do {
                                        size--;
                                        if (size < 0) {
                                            break;
                                        }
                                    } while (RecyclerView.this.l0.c(this.c.get(size).mPosition));
                                    size++;
                                }
                                this.c.add(size, a0Var);
                                r1 = true;
                            }
                            if (!r1) {
                                a(a0Var, true);
                                RecyclerView.this.f478k.g(a0Var);
                                if (r1 && !z && doesTransientStatePreventRecycling) {
                                    a0Var.mOwnerRecyclerView = null;
                                    return;
                                }
                                return;
                            }
                        }
                        z = false;
                        RecyclerView.this.f478k.g(a0Var);
                        if (r1) {
                            return;
                        }
                        return;
                    }
                    throw new IllegalArgumentException(f.a.b.a.a.h(RecyclerView.this, f.a.b.a.a.A("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb.append(a0Var);
                throw new IllegalArgumentException(f.a.b.a.a.h(RecyclerView.this, sb));
            }
            StringBuilder A = f.a.b.a.a.A("Scrapped or attached views may not be recycled. isScrap:");
            A.append(a0Var.isScrap());
            A.append(" isAttached:");
            A.append(a0Var.itemView.getParent() != null);
            throw new IllegalArgumentException(f.a.b.a.a.h(RecyclerView.this, A));
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void i(android.view.View r5) {
            /*
                r4 = this;
                androidx.recyclerview.widget.RecyclerView$a0 r5 = androidx.recyclerview.widget.RecyclerView.M(r5)
                r0 = 12
                boolean r0 = r5.hasAnyOfTheFlags(r0)
                r1 = 0
                if (r0 != 0) goto L57
                boolean r0 = r5.isUpdated()
                if (r0 == 0) goto L57
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$j r0 = r0.R
                r2 = 1
                if (r0 == 0) goto L3f
                java.util.List r3 = r5.getUnmodifiedPayloads()
                e.u.b.k r0 = (e.u.b.k) r0
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L39
                boolean r0 = r0.f2846g
                if (r0 == 0) goto L33
                boolean r0 = r5.isInvalid()
                if (r0 == 0) goto L31
                goto L33
            L31:
                r0 = 0
                goto L34
            L33:
                r0 = 1
            L34:
                if (r0 == 0) goto L37
                goto L39
            L37:
                r0 = 0
                goto L3a
            L39:
                r0 = 1
            L3a:
                if (r0 == 0) goto L3d
                goto L3f
            L3d:
                r0 = 0
                goto L40
            L3f:
                r0 = 1
            L40:
                if (r0 == 0) goto L43
                goto L57
            L43:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r0 = r4.b
                if (r0 != 0) goto L4e
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r4.b = r0
            L4e:
                r5.setScrapContainer(r4, r2)
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r0 = r4.b
                r0.add(r5)
                goto L88
            L57:
                boolean r0 = r5.isInvalid()
                if (r0 == 0) goto L80
                boolean r0 = r5.isRemoved()
                if (r0 != 0) goto L80
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r0 = r0.q
                boolean r0 = r0.hasStableIds()
                if (r0 == 0) goto L6e
                goto L80
            L6e:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."
                java.lang.StringBuilder r0 = f.a.b.a.a.A(r0)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = f.a.b.a.a.h(r1, r0)
                r5.<init>(r0)
                throw r5
            L80:
                r5.setScrapContainer(r4, r1)
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r0 = r4.a
                r0.add(r5)
            L88:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.t.i(android.view.View):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:162:0x0318, code lost:
            r7 = r14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:166:0x0323, code lost:
            r7 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:232:0x0468, code lost:
            if ((r8 == 0 || r8 + r5 < r21) == false) goto L226;
         */
        /* JADX WARN: Removed duplicated region for block: B:130:0x025d  */
        /* JADX WARN: Removed duplicated region for block: B:211:0x03ff  */
        /* JADX WARN: Removed duplicated region for block: B:225:0x0451  */
        /* JADX WARN: Removed duplicated region for block: B:241:0x049d  */
        /* JADX WARN: Removed duplicated region for block: B:256:0x04d3  */
        /* JADX WARN: Removed duplicated region for block: B:260:0x04de  */
        /* JADX WARN: Removed duplicated region for block: B:261:0x04ec  */
        /* JADX WARN: Removed duplicated region for block: B:267:0x0508 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x01c2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.recyclerview.widget.RecyclerView.a0 j(int r19, boolean r20, long r21) {
            /*
                Method dump skipped, instructions count: 1329
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.t.j(int, boolean, long):androidx.recyclerview.widget.RecyclerView$a0");
        }

        public void k(a0 a0Var) {
            if (a0Var.mInChangeScrap) {
                this.b.remove(a0Var);
            } else {
                this.a.remove(a0Var);
            }
            a0Var.mScrapContainer = null;
            a0Var.mInChangeScrap = false;
            a0Var.clearReturnedFromScrapFlag();
        }

        public void l() {
            m mVar = RecyclerView.this.r;
            this.f502f = this.f501e + (mVar != null ? mVar.f495l : 0);
            for (int size = this.c.size() - 1; size >= 0 && this.c.size() > this.f502f; size--) {
                f(size);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface u {
        void a(a0 a0Var);
    }

    /* loaded from: classes.dex */
    public class v extends g {
        public v() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void a() {
            RecyclerView.this.i(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.m0.f516f = true;
            recyclerView.e0(true);
            if (RecyclerView.this.f476i.g()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void c(int i2, int i3, Object obj) {
            RecyclerView.this.i(null);
            e.u.b.a aVar = RecyclerView.this.f476i;
            Objects.requireNonNull(aVar);
            boolean z = false;
            if (i3 >= 1) {
                aVar.b.add(aVar.h(4, i2, i3, obj));
                aVar.f2840f |= 4;
                if (aVar.b.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void d(int i2, int i3) {
            RecyclerView.this.i(null);
            e.u.b.a aVar = RecyclerView.this.f476i;
            Objects.requireNonNull(aVar);
            boolean z = false;
            if (i3 >= 1) {
                aVar.b.add(aVar.h(1, i2, i3, null));
                aVar.f2840f |= 1;
                if (aVar.b.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void e(int i2, int i3, int i4) {
            RecyclerView.this.i(null);
            e.u.b.a aVar = RecyclerView.this.f476i;
            Objects.requireNonNull(aVar);
            boolean z = false;
            if (i2 != i3) {
                if (i4 == 1) {
                    aVar.b.add(aVar.h(8, i2, i3, null));
                    aVar.f2840f |= 8;
                    if (aVar.b.size() == 1) {
                        z = true;
                    }
                } else {
                    throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
                }
            }
            if (z) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void f(int i2, int i3) {
            RecyclerView.this.i(null);
            e.u.b.a aVar = RecyclerView.this.f476i;
            Objects.requireNonNull(aVar);
            boolean z = false;
            if (i3 >= 1) {
                aVar.b.add(aVar.h(2, i2, i3, null));
                aVar.f2840f |= 2;
                if (aVar.b.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                g();
            }
        }

        public void g() {
            if (RecyclerView.F0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.x && recyclerView.w) {
                    Runnable runnable = recyclerView.f480m;
                    AtomicInteger atomicInteger = e.i.j.z.a;
                    z.d.m(recyclerView, runnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.F = true;
            recyclerView2.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class w {
        public RecyclerView b;
        public m c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f505d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f506e;

        /* renamed from: f  reason: collision with root package name */
        public View f507f;

        /* renamed from: h  reason: collision with root package name */
        public boolean f509h;
        public int a = -1;

        /* renamed from: g  reason: collision with root package name */
        public final a f508g = new a(0, 0);

        /* loaded from: classes.dex */
        public static class a {
            public int a;
            public int b;

            /* renamed from: d  reason: collision with root package name */
            public int f510d = -1;

            /* renamed from: f  reason: collision with root package name */
            public boolean f512f = false;

            /* renamed from: g  reason: collision with root package name */
            public int f513g = 0;
            public int c = Integer.MIN_VALUE;

            /* renamed from: e  reason: collision with root package name */
            public Interpolator f511e = null;

            public a(int i2, int i3) {
                this.a = i2;
                this.b = i3;
            }

            public void a(RecyclerView recyclerView) {
                int i2 = this.f510d;
                if (i2 >= 0) {
                    this.f510d = -1;
                    recyclerView.S(i2);
                    this.f512f = false;
                } else if (this.f512f) {
                    Interpolator interpolator = this.f511e;
                    if (interpolator != null && this.c < 1) {
                        throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                    }
                    int i3 = this.c;
                    if (i3 >= 1) {
                        recyclerView.j0.b(this.a, this.b, i3, interpolator);
                        int i4 = this.f513g + 1;
                        this.f513g = i4;
                        if (i4 > 10) {
                            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                        }
                        this.f512f = false;
                        return;
                    }
                    throw new IllegalStateException("Scroll duration must be a positive number");
                } else {
                    this.f513g = 0;
                }
            }

            public void b(int i2, int i3, int i4, Interpolator interpolator) {
                this.a = i2;
                this.b = i3;
                this.c = i4;
                this.f511e = interpolator;
                this.f512f = true;
            }
        }

        /* loaded from: classes.dex */
        public interface b {
            PointF a(int i2);
        }

        public PointF a(int i2) {
            m mVar = this.c;
            if (mVar instanceof b) {
                return ((b) mVar).a(i2);
            }
            StringBuilder A = f.a.b.a.a.A("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            A.append(b.class.getCanonicalName());
            Log.w("RecyclerView", A.toString());
            return null;
        }

        public void b(int i2, int i3) {
            PointF a2;
            RecyclerView recyclerView = this.b;
            if (this.a == -1 || recyclerView == null) {
                d();
            }
            if (this.f505d && this.f507f == null && this.c != null && (a2 = a(this.a)) != null) {
                float f2 = a2.x;
                if (f2 != 0.0f || a2.y != 0.0f) {
                    recyclerView.l0((int) Math.signum(f2), (int) Math.signum(a2.y), null);
                }
            }
            this.f505d = false;
            View view = this.f507f;
            if (view != null) {
                if (this.b.K(view) == this.a) {
                    c(this.f507f, recyclerView.m0, this.f508g);
                    this.f508g.a(recyclerView);
                    d();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f507f = null;
                }
            }
            if (this.f506e) {
                x xVar = recyclerView.m0;
                a aVar = this.f508g;
                e.u.b.r rVar = (e.u.b.r) this;
                if (rVar.b.r.A() == 0) {
                    rVar.d();
                } else {
                    int i4 = rVar.o;
                    int i5 = i4 - i2;
                    if (i4 * i5 <= 0) {
                        i5 = 0;
                    }
                    rVar.o = i5;
                    int i6 = rVar.p;
                    int i7 = i6 - i3;
                    if (i6 * i7 <= 0) {
                        i7 = 0;
                    }
                    rVar.p = i7;
                    if (i5 == 0 && i7 == 0) {
                        PointF a3 = rVar.a(rVar.a);
                        if (a3 != null) {
                            float f3 = a3.x;
                            if (f3 != 0.0f || a3.y != 0.0f) {
                                float f4 = a3.y;
                                float sqrt = (float) Math.sqrt((f4 * f4) + (f3 * f3));
                                float f5 = a3.x / sqrt;
                                a3.x = f5;
                                float f6 = a3.y / sqrt;
                                a3.y = f6;
                                rVar.f2929k = a3;
                                rVar.o = (int) (f5 * 10000.0f);
                                rVar.p = (int) (f6 * 10000.0f);
                                aVar.b((int) (rVar.o * 1.2f), (int) (rVar.p * 1.2f), (int) (rVar.g(10000) * 1.2f), rVar.f2927i);
                            }
                        }
                        aVar.f510d = rVar.a;
                        rVar.d();
                    }
                }
                a aVar2 = this.f508g;
                boolean z = aVar2.f510d >= 0;
                aVar2.a(recyclerView);
                if (z && this.f506e) {
                    this.f505d = true;
                    recyclerView.j0.a();
                }
            }
        }

        public abstract void c(View view, x xVar, a aVar);

        public final void d() {
            if (this.f506e) {
                this.f506e = false;
                e.u.b.r rVar = (e.u.b.r) this;
                rVar.p = 0;
                rVar.o = 0;
                rVar.f2929k = null;
                this.b.m0.a = -1;
                this.f507f = null;
                this.a = -1;
                this.f505d = false;
                m mVar = this.c;
                if (mVar.f490g == this) {
                    mVar.f490g = null;
                }
                this.c = null;
                this.b = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class x {
        public int a = -1;
        public int b = 0;
        public int c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f514d = 1;

        /* renamed from: e  reason: collision with root package name */
        public int f515e = 0;

        /* renamed from: f  reason: collision with root package name */
        public boolean f516f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f517g = false;

        /* renamed from: h  reason: collision with root package name */
        public boolean f518h = false;

        /* renamed from: i  reason: collision with root package name */
        public boolean f519i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f520j = false;

        /* renamed from: k  reason: collision with root package name */
        public boolean f521k = false;

        /* renamed from: l  reason: collision with root package name */
        public int f522l;

        /* renamed from: m  reason: collision with root package name */
        public long f523m;
        public int n;

        public void a(int i2) {
            if ((this.f514d & i2) != 0) {
                return;
            }
            StringBuilder A = f.a.b.a.a.A("Layout state should be one of ");
            A.append(Integer.toBinaryString(i2));
            A.append(" but it is ");
            A.append(Integer.toBinaryString(this.f514d));
            throw new IllegalStateException(A.toString());
        }

        public int b() {
            return this.f517g ? this.b - this.c : this.f515e;
        }

        public String toString() {
            StringBuilder A = f.a.b.a.a.A("State{mTargetPosition=");
            A.append(this.a);
            A.append(", mData=");
            A.append((Object) null);
            A.append(", mItemCount=");
            A.append(this.f515e);
            A.append(", mIsMeasuring=");
            A.append(this.f519i);
            A.append(", mPreviousLayoutItemCount=");
            A.append(this.b);
            A.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            A.append(this.c);
            A.append(", mStructureChanged=");
            A.append(this.f516f);
            A.append(", mInPreLayout=");
            A.append(this.f517g);
            A.append(", mRunSimpleAnimations=");
            A.append(this.f520j);
            A.append(", mRunPredictiveAnimations=");
            A.append(this.f521k);
            A.append('}');
            return A.toString();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class y {
    }

    /* loaded from: classes.dex */
    public class z implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public int f524f;

        /* renamed from: g  reason: collision with root package name */
        public int f525g;

        /* renamed from: h  reason: collision with root package name */
        public OverScroller f526h;

        /* renamed from: i  reason: collision with root package name */
        public Interpolator f527i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f528j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f529k;

        public z() {
            Interpolator interpolator = RecyclerView.I0;
            this.f527i = interpolator;
            this.f528j = false;
            this.f529k = false;
            this.f526h = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public void a() {
            if (this.f528j) {
                this.f529k = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            RecyclerView recyclerView = RecyclerView.this;
            AtomicInteger atomicInteger = e.i.j.z.a;
            z.d.m(recyclerView, this);
        }

        public void b(int i2, int i3, int i4, Interpolator interpolator) {
            int i5;
            if (i4 == Integer.MIN_VALUE) {
                int abs = Math.abs(i2);
                int abs2 = Math.abs(i3);
                boolean z = abs > abs2;
                int sqrt = (int) Math.sqrt(0);
                int sqrt2 = (int) Math.sqrt((i3 * i3) + (i2 * i2));
                RecyclerView recyclerView = RecyclerView.this;
                int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
                int i6 = width / 2;
                float f2 = width;
                float f3 = i6;
                float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f2) - 0.5f) * 0.47123894f)) * f3) + f3;
                if (sqrt > 0) {
                    i5 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
                } else {
                    if (!z) {
                        abs = abs2;
                    }
                    i5 = (int) (((abs / f2) + 1.0f) * 300.0f);
                }
                i4 = Math.min(i5, 2000);
            }
            int i7 = i4;
            if (interpolator == null) {
                interpolator = RecyclerView.I0;
            }
            if (this.f527i != interpolator) {
                this.f527i = interpolator;
                this.f526h = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f525g = 0;
            this.f524f = 0;
            RecyclerView.this.setScrollState(2);
            this.f526h.startScroll(0, 0, i2, i3, i7);
            if (Build.VERSION.SDK_INT < 23) {
                this.f526h.computeScrollOffset();
            }
            a();
        }

        public void c() {
            RecyclerView.this.removeCallbacks(this);
            this.f526h.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i2;
            int i3;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.r == null) {
                c();
                return;
            }
            this.f529k = false;
            this.f528j = true;
            recyclerView.n();
            OverScroller overScroller = this.f526h;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i4 = currX - this.f524f;
                int i5 = currY - this.f525g;
                this.f524f = currX;
                this.f525g = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.z0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.t(i4, i5, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.z0;
                    i4 -= iArr2[0];
                    i5 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.m(i4, i5);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.q != null) {
                    int[] iArr3 = recyclerView3.z0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.l0(i4, i5, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.z0;
                    i3 = iArr4[0];
                    i2 = iArr4[1];
                    i4 -= i3;
                    i5 -= i2;
                    w wVar = recyclerView4.r.f490g;
                    if (wVar != null && !wVar.f505d && wVar.f506e) {
                        int b = recyclerView4.m0.b();
                        if (b == 0) {
                            wVar.d();
                        } else if (wVar.a >= b) {
                            wVar.a = b - 1;
                            wVar.b(i3, i2);
                        } else {
                            wVar.b(i3, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i3 = 0;
                }
                if (!RecyclerView.this.t.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.z0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.u(i3, i2, i4, i5, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.z0;
                int i6 = i4 - iArr6[0];
                int i7 = i5 - iArr6[1];
                if (i3 != 0 || i2 != 0) {
                    recyclerView6.v(i3, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i6 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i7 != 0));
                RecyclerView recyclerView7 = RecyclerView.this;
                w wVar2 = recyclerView7.r.f490g;
                if (!(wVar2 != null && wVar2.f505d) && z) {
                    if (recyclerView7.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i8 = i6 < 0 ? -currVelocity : i6 > 0 ? currVelocity : 0;
                        if (i7 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i7 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView recyclerView8 = RecyclerView.this;
                        Objects.requireNonNull(recyclerView8);
                        if (i8 < 0) {
                            recyclerView8.x();
                            if (recyclerView8.N.isFinished()) {
                                recyclerView8.N.onAbsorb(-i8);
                            }
                        } else if (i8 > 0) {
                            recyclerView8.y();
                            if (recyclerView8.P.isFinished()) {
                                recyclerView8.P.onAbsorb(i8);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView8.z();
                            if (recyclerView8.O.isFinished()) {
                                recyclerView8.O.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView8.w();
                            if (recyclerView8.Q.isFinished()) {
                                recyclerView8.Q.onAbsorb(currVelocity);
                            }
                        }
                        if (i8 != 0 || currVelocity != 0) {
                            AtomicInteger atomicInteger = e.i.j.z.a;
                            z.d.k(recyclerView8);
                        }
                    }
                    if (RecyclerView.G0) {
                        n.b bVar = RecyclerView.this.l0;
                        int[] iArr7 = bVar.c;
                        if (iArr7 != null) {
                            Arrays.fill(iArr7, -1);
                        }
                        bVar.f2892d = 0;
                    }
                } else {
                    a();
                    RecyclerView recyclerView9 = RecyclerView.this;
                    e.u.b.n nVar = recyclerView9.k0;
                    if (nVar != null) {
                        nVar.a(recyclerView9, i3, i2);
                    }
                }
            }
            w wVar3 = RecyclerView.this.r.f490g;
            if (wVar3 != null && wVar3.f505d) {
                wVar3.b(0, 0);
            }
            this.f528j = false;
            if (this.f529k) {
                RecyclerView.this.removeCallbacks(this);
                RecyclerView recyclerView10 = RecyclerView.this;
                AtomicInteger atomicInteger2 = e.i.j.z.a;
                z.d.m(recyclerView10, this);
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.u0(1);
        }
    }

    static {
        E0 = Build.VERSION.SDK_INT >= 23;
        F0 = true;
        G0 = true;
        Class<?> cls = Integer.TYPE;
        H0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        I0 = new c();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    public static RecyclerView G(View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                RecyclerView G = G(viewGroup.getChildAt(i2));
                if (G != null) {
                    return G;
                }
            }
            return null;
        }
        return null;
    }

    public static a0 M(View view) {
        if (view == null) {
            return null;
        }
        return ((n) view.getLayoutParams()).a;
    }

    public static void N(View view, Rect rect) {
        n nVar = (n) view.getLayoutParams();
        Rect rect2 = nVar.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) nVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) nVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) nVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin);
    }

    private e.i.j.m getScrollingChildHelper() {
        if (this.w0 == null) {
            this.w0 = new e.i.j.m(this);
        }
        return this.w0;
    }

    public static void k(a0 a0Var) {
        WeakReference<RecyclerView> weakReference = a0Var.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == a0Var.itemView) {
                    return;
                }
                ViewParent parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            a0Var.mNestedRecyclerView = null;
        }
    }

    public String A() {
        StringBuilder A = f.a.b.a.a.A(" ");
        A.append(super.toString());
        A.append(", adapter:");
        A.append(this.q);
        A.append(", layout:");
        A.append(this.r);
        A.append(", context:");
        A.append(getContext());
        return A.toString();
    }

    public final void B(x xVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.j0.f526h;
            overScroller.getFinalX();
            overScroller.getCurrX();
            Objects.requireNonNull(xVar);
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        Objects.requireNonNull(xVar);
    }

    public View C(float f2, float f3) {
        for (int e2 = this.f477j.e() - 1; e2 >= 0; e2--) {
            View d2 = this.f477j.d(e2);
            float translationX = d2.getTranslationX();
            float translationY = d2.getTranslationY();
            if (f2 >= d2.getLeft() + translationX && f2 <= d2.getRight() + translationX && f3 >= d2.getTop() + translationY && f3 <= d2.getBottom() + translationY) {
                return d2;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View D(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.D(android.view.View):android.view.View");
    }

    public final boolean E(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.u.size();
        for (int i2 = 0; i2 < size; i2++) {
            q qVar = this.u.get(i2);
            if (qVar.c(this, motionEvent) && action != 3) {
                this.v = qVar;
                return true;
            }
        }
        return false;
    }

    public final void F(int[] iArr) {
        int e2 = this.f477j.e();
        if (e2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < e2; i4++) {
            a0 M = M(this.f477j.d(i4));
            if (!M.shouldIgnore()) {
                int layoutPosition = M.getLayoutPosition();
                if (layoutPosition < i2) {
                    i2 = layoutPosition;
                }
                if (layoutPosition > i3) {
                    i3 = layoutPosition;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    public a0 H(int i2) {
        a0 a0Var = null;
        if (this.I) {
            return null;
        }
        int h2 = this.f477j.h();
        for (int i3 = 0; i3 < h2; i3++) {
            a0 M = M(this.f477j.g(i3));
            if (M != null && !M.isRemoved() && I(M) == i2) {
                if (!this.f477j.k(M.itemView)) {
                    return M;
                }
                a0Var = M;
            }
        }
        return a0Var;
    }

    public int I(a0 a0Var) {
        if (!a0Var.hasAnyOfTheFlags(524) && a0Var.isBound()) {
            e.u.b.a aVar = this.f476i;
            int i2 = a0Var.mPosition;
            int size = aVar.b.size();
            for (int i3 = 0; i3 < size; i3++) {
                a.b bVar = aVar.b.get(i3);
                int i4 = bVar.a;
                if (i4 != 1) {
                    if (i4 == 2) {
                        int i5 = bVar.b;
                        if (i5 <= i2) {
                            int i6 = bVar.f2841d;
                            if (i5 + i6 <= i2) {
                                i2 -= i6;
                            }
                        } else {
                            continue;
                        }
                    } else if (i4 == 8) {
                        int i7 = bVar.b;
                        if (i7 == i2) {
                            i2 = bVar.f2841d;
                        } else {
                            if (i7 < i2) {
                                i2--;
                            }
                            if (bVar.f2841d <= i2) {
                                i2++;
                            }
                        }
                    }
                } else if (bVar.b <= i2) {
                    i2 += bVar.f2841d;
                }
            }
            return i2;
        }
        return -1;
    }

    public long J(a0 a0Var) {
        return this.q.hasStableIds() ? a0Var.getItemId() : a0Var.mPosition;
    }

    public int K(View view) {
        a0 M = M(view);
        if (M != null) {
            return M.getLayoutPosition();
        }
        return -1;
    }

    public a0 L(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return M(view);
    }

    public Rect O(View view) {
        n nVar = (n) view.getLayoutParams();
        if (!nVar.c) {
            return nVar.b;
        }
        if (this.m0.f517g && (nVar.b() || nVar.a.isInvalid())) {
            return nVar.b;
        }
        Rect rect = nVar.b;
        rect.set(0, 0, 0, 0);
        int size = this.t.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.n.set(0, 0, 0, 0);
            this.t.get(i2).f(this.n, view, this, this.m0);
            int i3 = rect.left;
            Rect rect2 = this.n;
            rect.left = i3 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        nVar.c = false;
        return rect;
    }

    public boolean P() {
        return !this.z || this.I || this.f476i.g();
    }

    public void Q() {
        this.Q = null;
        this.O = null;
        this.P = null;
        this.N = null;
    }

    public boolean R() {
        return this.K > 0;
    }

    public void S(int i2) {
        if (this.r == null) {
            return;
        }
        setScrollState(2);
        this.r.O0(i2);
        awakenScrollBars();
    }

    public void T() {
        int h2 = this.f477j.h();
        for (int i2 = 0; i2 < h2; i2++) {
            ((n) this.f477j.g(i2).getLayoutParams()).c = true;
        }
        t tVar = this.f474g;
        int size = tVar.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            n nVar = (n) tVar.c.get(i3).itemView.getLayoutParams();
            if (nVar != null) {
                nVar.c = true;
            }
        }
    }

    public void U(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int h2 = this.f477j.h();
        for (int i5 = 0; i5 < h2; i5++) {
            a0 M = M(this.f477j.g(i5));
            if (M != null && !M.shouldIgnore()) {
                int i6 = M.mPosition;
                if (i6 >= i4) {
                    M.offsetPosition(-i3, z2);
                    this.m0.f516f = true;
                } else if (i6 >= i2) {
                    M.flagRemovedAndOffsetPosition(i2 - 1, -i3, z2);
                    this.m0.f516f = true;
                }
            }
        }
        t tVar = this.f474g;
        int size = tVar.c.size();
        while (true) {
            size--;
            if (size >= 0) {
                a0 a0Var = tVar.c.get(size);
                if (a0Var != null) {
                    int i7 = a0Var.mPosition;
                    if (i7 >= i4) {
                        a0Var.offsetPosition(-i3, z2);
                    } else if (i7 >= i2) {
                        a0Var.addFlags(8);
                        tVar.f(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public void V() {
    }

    public void W() {
    }

    public void X() {
        this.K++;
    }

    public void Y(boolean z2) {
        int i2;
        boolean z3 = true;
        int i3 = this.K - 1;
        this.K = i3;
        if (i3 < 1) {
            this.K = 0;
            if (z2) {
                int i4 = this.E;
                this.E = 0;
                if (i4 != 0) {
                    AccessibilityManager accessibilityManager = this.G;
                    if ((accessibilityManager == null || !accessibilityManager.isEnabled()) ? false : false) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(a0.FLAG_MOVED);
                        obtain.setContentChangeTypes(i4);
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                for (int size = this.A0.size() - 1; size >= 0; size--) {
                    a0 a0Var = this.A0.get(size);
                    if (a0Var.itemView.getParent() == this && !a0Var.shouldIgnore() && (i2 = a0Var.mPendingAccessibilityState) != -1) {
                        View view = a0Var.itemView;
                        AtomicInteger atomicInteger = e.i.j.z.a;
                        z.d.s(view, i2);
                        a0Var.mPendingAccessibilityState = -1;
                    }
                }
                this.A0.clear();
            }
        }
    }

    public final void Z(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.T) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.T = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.a0 = x2;
            this.V = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.b0 = y2;
            this.W = y2;
        }
    }

    public void a0() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        m mVar = this.r;
        if (mVar == null || !mVar.f0()) {
            super.addFocusables(arrayList, i2, i3);
        }
    }

    public void b0() {
    }

    public void c0() {
        if (this.s0 || !this.w) {
            return;
        }
        Runnable runnable = this.B0;
        AtomicInteger atomicInteger = e.i.j.z.a;
        z.d.m(this, runnable);
        this.s0 = true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof n) && this.r.i((n) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        m mVar = this.r;
        if (mVar != null && mVar.g()) {
            return this.r.m(this.m0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        m mVar = this.r;
        if (mVar != null && mVar.g()) {
            return this.r.n(this.m0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        m mVar = this.r;
        if (mVar != null && mVar.g()) {
            return this.r.o(this.m0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        m mVar = this.r;
        if (mVar != null && mVar.h()) {
            return this.r.p(this.m0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        m mVar = this.r;
        if (mVar != null && mVar.h()) {
            return this.r.q(this.m0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        m mVar = this.r;
        if (mVar != null && mVar.h()) {
            return this.r.r(this.m0);
        }
        return 0;
    }

    public final void d0() {
        boolean z2;
        boolean z3 = false;
        if (this.I) {
            e.u.b.a aVar = this.f476i;
            aVar.l(aVar.b);
            aVar.l(aVar.c);
            aVar.f2840f = 0;
            if (this.J) {
                this.r.r0(this);
            }
        }
        if (this.R != null && this.r.a1()) {
            this.f476i.j();
        } else {
            this.f476i.c();
        }
        boolean z4 = this.p0 || this.q0;
        this.m0.f520j = this.z && this.R != null && ((z2 = this.I) || z4 || this.r.f491h) && (!z2 || this.q.hasStableIds());
        x xVar = this.m0;
        if (xVar.f520j && z4 && !this.I) {
            if (this.R != null && this.r.a1()) {
                z3 = true;
            }
        }
        xVar.f521k = z3;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().e(i2, i3, i4, i5, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        int size = this.t.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.t.get(i2).h(canvas, this, this.m0);
        }
        EdgeEffect edgeEffect = this.N;
        boolean z4 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f479l ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.N;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.O;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f479l) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.O;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.P;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f479l ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.P;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.Q;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f479l) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.Q;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if (z2 || this.R == null || this.t.size() <= 0 || !this.R.g()) {
            z4 = z2;
        }
        if (z4) {
            AtomicInteger atomicInteger = e.i.j.z.a;
            z.d.k(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public void e0(boolean z2) {
        this.J = z2 | this.J;
        this.I = true;
        int h2 = this.f477j.h();
        for (int i2 = 0; i2 < h2; i2++) {
            a0 M = M(this.f477j.g(i2));
            if (M != null && !M.shouldIgnore()) {
                M.addFlags(6);
            }
        }
        T();
        t tVar = this.f474g;
        int size = tVar.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            a0 a0Var = tVar.c.get(i3);
            if (a0Var != null) {
                a0Var.addFlags(6);
                a0Var.addChangePayload(null);
            }
        }
        e eVar = RecyclerView.this.q;
        if (eVar == null || !eVar.hasStableIds()) {
            tVar.e();
        }
    }

    public final void f(a0 a0Var) {
        View view = a0Var.itemView;
        boolean z2 = view.getParent() == this;
        this.f474g.k(L(view));
        if (a0Var.isTmpDetached()) {
            this.f477j.b(view, -1, view.getLayoutParams(), true);
        } else if (!z2) {
            this.f477j.a(view, -1, true);
        } else {
            e.u.b.b bVar = this.f477j;
            int indexOfChild = ((e.u.b.y) bVar.a).a.indexOfChild(view);
            if (indexOfChild >= 0) {
                bVar.b.h(indexOfChild);
                bVar.i(view);
                return;
            }
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public void f0(a0 a0Var, j.c cVar) {
        a0Var.setFlags(0, 8192);
        if (this.m0.f518h && a0Var.isUpdated() && !a0Var.isRemoved() && !a0Var.shouldIgnore()) {
            this.f478k.b.j(J(a0Var), a0Var);
        }
        this.f478k.c(a0Var, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0169, code lost:
        if (r3 > 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0183, code lost:
        if (r6 > 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0186, code lost:
        if (r3 < 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0189, code lost:
        if (r6 < 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0192, code lost:
        if ((r6 * r1) < 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x019b, code lost:
        if ((r6 * r1) > 0) goto L122;
     */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0075  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public void g(l lVar) {
        m mVar = this.r;
        if (mVar != null) {
            mVar.e("Cannot add item decoration during a scroll  or layout");
        }
        if (this.t.isEmpty()) {
            setWillNotDraw(false);
        }
        this.t.add(lVar);
        T();
        requestLayout();
    }

    public void g0() {
        j jVar = this.R;
        if (jVar != null) {
            jVar.f();
        }
        m mVar = this.r;
        if (mVar != null) {
            mVar.G0(this.f474g);
            this.r.H0(this.f474g);
        }
        this.f474g.b();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        m mVar = this.r;
        if (mVar != null) {
            return mVar.w();
        }
        throw new IllegalStateException(f.a.b.a.a.h(this, f.a.b.a.a.A("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        m mVar = this.r;
        if (mVar != null) {
            return mVar.x(getContext(), attributeSet);
        }
        throw new IllegalStateException(f.a.b.a.a.h(this, f.a.b.a.a.A("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public e getAdapter() {
        return this.q;
    }

    @Override // android.view.View
    public int getBaseline() {
        m mVar = this.r;
        if (mVar != null) {
            Objects.requireNonNull(mVar);
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        h hVar = this.u0;
        if (hVar == null) {
            return super.getChildDrawingOrder(i2, i3);
        }
        return hVar.a(i2, i3);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f479l;
    }

    public e.u.b.a0 getCompatAccessibilityDelegate() {
        return this.t0;
    }

    public i getEdgeEffectFactory() {
        return this.M;
    }

    public j getItemAnimator() {
        return this.R;
    }

    public int getItemDecorationCount() {
        return this.t.size();
    }

    public m getLayoutManager() {
        return this.r;
    }

    public int getMaxFlingVelocity() {
        return this.f0;
    }

    public int getMinFlingVelocity() {
        return this.e0;
    }

    public long getNanoTime() {
        if (G0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public p getOnFlingListener() {
        return this.d0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.i0;
    }

    public s getRecycledViewPool() {
        return this.f474g.d();
    }

    public int getScrollState() {
        return this.S;
    }

    public void h(r rVar) {
        if (this.o0 == null) {
            this.o0 = new ArrayList();
        }
        this.o0.add(rVar);
    }

    public void h0(l lVar) {
        m mVar = this.r;
        if (mVar != null) {
            mVar.e("Cannot remove item decoration during a scroll  or layout");
        }
        this.t.remove(lVar);
        if (this.t.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        T();
        requestLayout();
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().h(0);
    }

    public void i(String str) {
        if (R()) {
            if (str == null) {
                throw new IllegalStateException(f.a.b.a.a.h(this, f.a.b.a.a.A("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        } else if (this.L > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(f.a.b.a.a.h(this, f.a.b.a.a.A(""))));
        }
    }

    public final void i0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.n.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof n) {
            n nVar = (n) layoutParams;
            if (!nVar.c) {
                Rect rect = nVar.b;
                Rect rect2 = this.n;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.n);
            offsetRectIntoDescendantCoords(view, this.n);
        }
        this.r.L0(this, view, this.n, !this.z, view2 == null);
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.w;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.C;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f2543d;
    }

    public final void j() {
        j0();
        setScrollState(0);
    }

    public final void j0() {
        VelocityTracker velocityTracker = this.U;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z2 = false;
        u0(0);
        EdgeEffect edgeEffect = this.N;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.N.isFinished();
        }
        EdgeEffect edgeEffect2 = this.O;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.O.isFinished();
        }
        EdgeEffect edgeEffect3 = this.P;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.P.isFinished();
        }
        EdgeEffect edgeEffect4 = this.Q;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.Q.isFinished();
        }
        if (z2) {
            AtomicInteger atomicInteger = e.i.j.z.a;
            z.d.k(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean k0(int r18, int r19, android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.k0(int, int, android.view.MotionEvent):boolean");
    }

    public void l() {
        int h2 = this.f477j.h();
        for (int i2 = 0; i2 < h2; i2++) {
            a0 M = M(this.f477j.g(i2));
            if (!M.shouldIgnore()) {
                M.clearOldPosition();
            }
        }
        t tVar = this.f474g;
        int size = tVar.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            tVar.c.get(i3).clearOldPosition();
        }
        int size2 = tVar.a.size();
        for (int i4 = 0; i4 < size2; i4++) {
            tVar.a.get(i4).clearOldPosition();
        }
        ArrayList<a0> arrayList = tVar.b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i5 = 0; i5 < size3; i5++) {
                tVar.b.get(i5).clearOldPosition();
            }
        }
    }

    public void l0(int i2, int i3, int[] iArr) {
        a0 a0Var;
        r0();
        X();
        int i4 = e.i.f.h.a;
        Trace.beginSection("RV Scroll");
        B(this.m0);
        int N0 = i2 != 0 ? this.r.N0(i2, this.f474g, this.m0) : 0;
        int P0 = i3 != 0 ? this.r.P0(i3, this.f474g, this.m0) : 0;
        Trace.endSection();
        int e2 = this.f477j.e();
        for (int i5 = 0; i5 < e2; i5++) {
            View d2 = this.f477j.d(i5);
            a0 L = L(d2);
            if (L != null && (a0Var = L.mShadowingHolder) != null) {
                View view = a0Var.itemView;
                int left = d2.getLeft();
                int top = d2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        Y(true);
        t0(false);
        if (iArr != null) {
            iArr[0] = N0;
            iArr[1] = P0;
        }
    }

    public void m(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.N;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.N.onRelease();
            z2 = this.N.isFinished();
        }
        EdgeEffect edgeEffect2 = this.P;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.P.onRelease();
            z2 |= this.P.isFinished();
        }
        EdgeEffect edgeEffect3 = this.O;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.O.onRelease();
            z2 |= this.O.isFinished();
        }
        EdgeEffect edgeEffect4 = this.Q;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.Q.onRelease();
            z2 |= this.Q.isFinished();
        }
        if (z2) {
            AtomicInteger atomicInteger = e.i.j.z.a;
            z.d.k(this);
        }
    }

    public void m0(int i2) {
        if (this.C) {
            return;
        }
        v0();
        m mVar = this.r;
        if (mVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        mVar.O0(i2);
        awakenScrollBars();
    }

    public void n() {
        if (this.z && !this.I) {
            if (this.f476i.g()) {
                e.u.b.a aVar = this.f476i;
                int i2 = aVar.f2840f;
                boolean z2 = false;
                if ((i2 & 4) != 0) {
                    if (!((i2 & 11) != 0)) {
                        int i3 = e.i.f.h.a;
                        Trace.beginSection("RV PartialInvalidate");
                        r0();
                        X();
                        this.f476i.j();
                        if (!this.B) {
                            int e2 = this.f477j.e();
                            int i4 = 0;
                            while (true) {
                                if (i4 < e2) {
                                    a0 M = M(this.f477j.d(i4));
                                    if (M != null && !M.shouldIgnore() && M.isUpdated()) {
                                        z2 = true;
                                        break;
                                    }
                                    i4++;
                                } else {
                                    break;
                                }
                            }
                            if (z2) {
                                q();
                            } else {
                                this.f476i.b();
                            }
                        }
                        t0(true);
                        Y(true);
                        Trace.endSection();
                        return;
                    }
                }
                if (aVar.g()) {
                    int i5 = e.i.f.h.a;
                    Trace.beginSection("RV FullInvalidate");
                    q();
                    Trace.endSection();
                    return;
                }
                return;
            }
            return;
        }
        int i6 = e.i.f.h.a;
        Trace.beginSection("RV FullInvalidate");
        q();
        Trace.endSection();
    }

    public boolean n0(a0 a0Var, int i2) {
        if (R()) {
            a0Var.mPendingAccessibilityState = i2;
            this.A0.add(a0Var);
            return false;
        }
        View view = a0Var.itemView;
        AtomicInteger atomicInteger = e.i.j.z.a;
        z.d.s(view, i2);
        return true;
    }

    public void o(int i2, int i3) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        AtomicInteger atomicInteger = e.i.j.z.a;
        setMeasuredDimension(m.j(i2, paddingRight, z.d.e(this)), m.j(i3, getPaddingBottom() + getPaddingTop(), z.d.d(this)));
    }

    public void o0(int i2, int i3) {
        p0(i2, i3, null, Integer.MIN_VALUE, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K = 0;
        this.w = true;
        this.z = this.z && !isLayoutRequested();
        m mVar = this.r;
        if (mVar != null) {
            mVar.f492i = true;
            mVar.g0();
        }
        this.s0 = false;
        if (G0) {
            ThreadLocal<e.u.b.n> threadLocal = e.u.b.n.f2886j;
            e.u.b.n nVar = threadLocal.get();
            this.k0 = nVar;
            if (nVar == null) {
                this.k0 = new e.u.b.n();
                AtomicInteger atomicInteger = e.i.j.z.a;
                Display b2 = z.e.b(this);
                float f2 = 60.0f;
                if (!isInEditMode() && b2 != null) {
                    float refreshRate = b2.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f2 = refreshRate;
                    }
                }
                e.u.b.n nVar2 = this.k0;
                nVar2.f2890h = 1.0E9f / f2;
                threadLocal.set(nVar2);
            }
            this.k0.f2888f.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        e.u.b.n nVar;
        super.onDetachedFromWindow();
        j jVar = this.R;
        if (jVar != null) {
            jVar.f();
        }
        v0();
        this.w = false;
        m mVar = this.r;
        if (mVar != null) {
            t tVar = this.f474g;
            mVar.f492i = false;
            mVar.i0(this, tVar);
        }
        this.A0.clear();
        removeCallbacks(this.B0);
        Objects.requireNonNull(this.f478k);
        do {
        } while (e0.a.f2855d.b() != null);
        if (!G0 || (nVar = this.k0) == null) {
            return;
        }
        nVar.f2888f.remove(this);
        this.k0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.t.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.t.get(i2).g(canvas, this, this.m0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$m r0 = r5.r
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.C
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3c
            androidx.recyclerview.widget.RecyclerView$m r0 = r5.r
            boolean r0 = r0.h()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            androidx.recyclerview.widget.RecyclerView$m r3 = r5.r
            boolean r3 = r3.g()
            if (r3 == 0) goto L61
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L62
        L3c:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L60
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$m r3 = r5.r
            boolean r3 = r3.h()
            if (r3 == 0) goto L55
            float r0 = -r0
            goto L61
        L55:
            androidx.recyclerview.widget.RecyclerView$m r3 = r5.r
            boolean r3 = r3.g()
            if (r3 == 0) goto L60
            r3 = r0
            r0 = 0
            goto L62
        L60:
            r0 = 0
        L61:
            r3 = 0
        L62:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6a
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6a:
            float r2 = r5.g0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.h0
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.k0(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.C) {
            return false;
        }
        this.v = null;
        if (E(motionEvent)) {
            j();
            return true;
        }
        m mVar = this.r;
        if (mVar == null) {
            return false;
        }
        boolean g2 = mVar.g();
        boolean h2 = this.r.h();
        if (this.U == null) {
            this.U = VelocityTracker.obtain();
        }
        this.U.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.D) {
                this.D = false;
            }
            this.T = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.a0 = x2;
            this.V = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.b0 = y2;
            this.W = y2;
            if (this.S == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                u0(1);
            }
            int[] iArr = this.y0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i2 = g2;
            if (h2) {
                i2 = (g2 ? 1 : 0) | 2;
            }
            s0(i2, 0);
        } else if (actionMasked == 1) {
            this.U.clear();
            u0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.T);
            if (findPointerIndex < 0) {
                StringBuilder A = f.a.b.a.a.A("Error processing scroll; pointer index for id ");
                A.append(this.T);
                A.append(" not found. Did any MotionEvents get skipped?");
                Log.e("RecyclerView", A.toString());
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.S != 1) {
                int i3 = x3 - this.V;
                int i4 = y3 - this.W;
                if (!g2 || Math.abs(i3) <= this.c0) {
                    z2 = false;
                } else {
                    this.a0 = x3;
                    z2 = true;
                }
                if (h2 && Math.abs(i4) > this.c0) {
                    this.b0 = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            j();
        } else if (actionMasked == 5) {
            this.T = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.a0 = x4;
            this.V = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.b0 = y4;
            this.W = y4;
        } else if (actionMasked == 6) {
            Z(motionEvent);
        }
        return this.S == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6 = e.i.f.h.a;
        Trace.beginSection("RV OnLayout");
        q();
        Trace.endSection();
        this.z = true;
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        m mVar = this.r;
        if (mVar == null) {
            o(i2, i3);
            return;
        }
        boolean z2 = false;
        if (mVar.X()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.r.y0(i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            if (z2 || this.q == null) {
                return;
            }
            if (this.m0.f514d == 1) {
                r();
            }
            this.r.R0(i2, i3);
            this.m0.f519i = true;
            s();
            this.r.T0(i2, i3);
            if (this.r.W0()) {
                this.r.R0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), CommonUtils.BYTES_IN_A_GIGABYTE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), CommonUtils.BYTES_IN_A_GIGABYTE));
                this.m0.f519i = true;
                s();
                this.r.T0(i2, i3);
            }
        } else if (this.x) {
            this.r.y0(i2, i3);
        } else {
            if (this.F) {
                r0();
                X();
                d0();
                Y(true);
                x xVar = this.m0;
                if (xVar.f521k) {
                    xVar.f517g = true;
                } else {
                    this.f476i.c();
                    this.m0.f517g = false;
                }
                this.F = false;
                t0(false);
            } else if (this.m0.f521k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            e eVar = this.q;
            if (eVar != null) {
                this.m0.f515e = eVar.getItemCount();
            } else {
                this.m0.f515e = 0;
            }
            r0();
            this.r.y0(i2, i3);
            t0(false);
            this.m0.f517g = false;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (R()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f475h = savedState;
        super.onRestoreInstanceState(savedState.f348f);
        m mVar = this.r;
        if (mVar == null || (parcelable2 = this.f475h.f481h) == null) {
            return;
        }
        mVar.B0(parcelable2);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f475h;
        if (savedState2 != null) {
            savedState.f481h = savedState2.f481h;
        } else {
            m mVar = this.r;
            if (mVar != null) {
                savedState.f481h = mVar.C0();
            } else {
                savedState.f481h = null;
            }
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        Q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:211:0x0320, code lost:
        if (r0 < r3) goto L172;
     */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0110  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 1000
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p(View view) {
        a0 M = M(view);
        W();
        e eVar = this.q;
        if (eVar != null && M != null) {
            eVar.onViewDetachedFromWindow(M);
        }
        List<o> list = this.H;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.H.get(size).b(view);
            }
        }
    }

    public void p0(int i2, int i3, Interpolator interpolator, int i4, boolean z2) {
        m mVar = this.r;
        if (mVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.C) {
        } else {
            if (!mVar.g()) {
                i2 = 0;
            }
            if (!this.r.h()) {
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return;
            }
            if (i4 == Integer.MIN_VALUE || i4 > 0) {
                if (z2) {
                    int i5 = i2 != 0 ? 1 : 0;
                    if (i3 != 0) {
                        i5 |= 2;
                    }
                    s0(i5, 1);
                }
                this.j0.b(i2, i3, i4, interpolator);
                return;
            }
            scrollBy(i2, i3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x0331, code lost:
        if (r15.f477j.k(getFocusedChild()) == false) goto L218;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void q() {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.q():void");
    }

    public void q0(int i2) {
        if (this.C) {
            return;
        }
        m mVar = this.r;
        if (mVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            mVar.Y0(this, this.m0, i2);
        }
    }

    public final void r() {
        int adapterPosition;
        View D;
        this.m0.a(1);
        B(this.m0);
        this.m0.f519i = false;
        r0();
        e0 e0Var = this.f478k;
        e0Var.a.clear();
        e0Var.b.b();
        X();
        d0();
        View focusedChild = (this.i0 && hasFocus() && this.q != null) ? getFocusedChild() : null;
        a0 L = (focusedChild == null || (D = D(focusedChild)) == null) ? null : L(D);
        if (L == null) {
            x xVar = this.m0;
            xVar.f523m = -1L;
            xVar.f522l = -1;
            xVar.n = -1;
        } else {
            this.m0.f523m = this.q.hasStableIds() ? L.getItemId() : -1L;
            x xVar2 = this.m0;
            if (this.I) {
                adapterPosition = -1;
            } else {
                adapterPosition = L.isRemoved() ? L.mOldPosition : L.getAdapterPosition();
            }
            xVar2.f522l = adapterPosition;
            x xVar3 = this.m0;
            View view = L.itemView;
            int id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id = view.getId();
                }
            }
            xVar3.n = id;
        }
        x xVar4 = this.m0;
        xVar4.f518h = xVar4.f520j && this.q0;
        this.q0 = false;
        this.p0 = false;
        xVar4.f517g = xVar4.f521k;
        xVar4.f515e = this.q.getItemCount();
        F(this.v0);
        if (this.m0.f520j) {
            int e2 = this.f477j.e();
            for (int i2 = 0; i2 < e2; i2++) {
                a0 M = M(this.f477j.d(i2));
                if (!M.shouldIgnore() && (!M.isInvalid() || this.q.hasStableIds())) {
                    j jVar = this.R;
                    j.b(M);
                    M.getUnmodifiedPayloads();
                    this.f478k.c(M, jVar.h(M));
                    if (this.m0.f518h && M.isUpdated() && !M.isRemoved() && !M.shouldIgnore() && !M.isInvalid()) {
                        this.f478k.b.j(J(M), M);
                    }
                }
            }
        }
        if (this.m0.f521k) {
            int h2 = this.f477j.h();
            for (int i3 = 0; i3 < h2; i3++) {
                a0 M2 = M(this.f477j.g(i3));
                if (!M2.shouldIgnore()) {
                    M2.saveOldPosition();
                }
            }
            x xVar5 = this.m0;
            boolean z2 = xVar5.f516f;
            xVar5.f516f = false;
            this.r.w0(this.f474g, xVar5);
            this.m0.f516f = z2;
            for (int i4 = 0; i4 < this.f477j.e(); i4++) {
                a0 M3 = M(this.f477j.d(i4));
                if (!M3.shouldIgnore()) {
                    e0.a orDefault = this.f478k.a.getOrDefault(M3, null);
                    if (!((orDefault == null || (orDefault.a & 4) == 0) ? false : true)) {
                        j.b(M3);
                        boolean hasAnyOfTheFlags = M3.hasAnyOfTheFlags(8192);
                        j jVar2 = this.R;
                        M3.getUnmodifiedPayloads();
                        j.c h3 = jVar2.h(M3);
                        if (hasAnyOfTheFlags) {
                            f0(M3, h3);
                        } else {
                            e0 e0Var2 = this.f478k;
                            e0.a orDefault2 = e0Var2.a.getOrDefault(M3, null);
                            if (orDefault2 == null) {
                                orDefault2 = e0.a.a();
                                e0Var2.a.put(M3, orDefault2);
                            }
                            orDefault2.a |= 2;
                            orDefault2.b = h3;
                        }
                    }
                }
            }
            l();
        } else {
            l();
        }
        Y(true);
        t0(false);
        this.m0.f514d = 2;
    }

    public void r0() {
        int i2 = this.A + 1;
        this.A = i2;
        if (i2 != 1 || this.C) {
            return;
        }
        this.B = false;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z2) {
        a0 M = M(view);
        if (M != null) {
            if (M.isTmpDetached()) {
                M.clearTmpDetachFlag();
            } else if (!M.shouldIgnore()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(M);
                throw new IllegalArgumentException(f.a.b.a.a.h(this, sb));
            }
        }
        view.clearAnimation();
        p(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.r.A0(this, view, view2) && view2 != null) {
            i0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.r.L0(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.u.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.u.get(i2).e(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.A == 0 && !this.C) {
            super.requestLayout();
        } else {
            this.B = true;
        }
    }

    public final void s() {
        r0();
        X();
        this.m0.a(6);
        this.f476i.c();
        this.m0.f515e = this.q.getItemCount();
        x xVar = this.m0;
        xVar.c = 0;
        xVar.f517g = false;
        this.r.w0(this.f474g, xVar);
        x xVar2 = this.m0;
        xVar2.f516f = false;
        this.f475h = null;
        xVar2.f520j = xVar2.f520j && this.R != null;
        xVar2.f514d = 4;
        Y(true);
        t0(false);
    }

    public boolean s0(int i2, int i3) {
        return getScrollingChildHelper().i(i2, i3);
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
        m mVar = this.r;
        if (mVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.C) {
        } else {
            boolean g2 = mVar.g();
            boolean h2 = this.r.h();
            if (g2 || h2) {
                if (!g2) {
                    i2 = 0;
                }
                if (!h2) {
                    i3 = 0;
                }
                k0(i2, i3, null);
            }
        }
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (R()) {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.E |= contentChangeTypes != 0 ? contentChangeTypes : 0;
            r1 = 1;
        }
        if (r1 != 0) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(e.u.b.a0 a0Var) {
        this.t0 = a0Var;
        e.i.j.z.w(this, a0Var);
    }

    public void setAdapter(e eVar) {
        setLayoutFrozen(false);
        e eVar2 = this.q;
        if (eVar2 != null) {
            eVar2.unregisterAdapterDataObserver(this.f473f);
            this.q.onDetachedFromRecyclerView(this);
        }
        g0();
        e.u.b.a aVar = this.f476i;
        aVar.l(aVar.b);
        aVar.l(aVar.c);
        aVar.f2840f = 0;
        e eVar3 = this.q;
        this.q = eVar;
        if (eVar != null) {
            eVar.registerAdapterDataObserver(this.f473f);
            eVar.onAttachedToRecyclerView(this);
        }
        m mVar = this.r;
        if (mVar != null) {
            mVar.e0();
        }
        t tVar = this.f474g;
        e eVar4 = this.q;
        tVar.b();
        s d2 = tVar.d();
        Objects.requireNonNull(d2);
        if (eVar3 != null) {
            d2.b--;
        }
        if (d2.b == 0) {
            for (int i2 = 0; i2 < d2.a.size(); i2++) {
                d2.a.valueAt(i2).a.clear();
            }
        }
        if (eVar4 != null) {
            d2.b++;
        }
        this.m0.f516f = true;
        e0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(h hVar) {
        if (hVar == this.u0) {
            return;
        }
        this.u0 = hVar;
        setChildrenDrawingOrderEnabled(hVar != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.f479l) {
            Q();
        }
        this.f479l = z2;
        super.setClipToPadding(z2);
        if (this.z) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(i iVar) {
        Objects.requireNonNull(iVar);
        this.M = iVar;
        Q();
    }

    public void setHasFixedSize(boolean z2) {
        this.x = z2;
    }

    public void setItemAnimator(j jVar) {
        j jVar2 = this.R;
        if (jVar2 != null) {
            jVar2.f();
            this.R.a = null;
        }
        this.R = jVar;
        if (jVar != null) {
            jVar.a = this.r0;
        }
    }

    public void setItemViewCacheSize(int i2) {
        t tVar = this.f474g;
        tVar.f501e = i2;
        tVar.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(m mVar) {
        if (mVar == this.r) {
            return;
        }
        v0();
        if (this.r != null) {
            j jVar = this.R;
            if (jVar != null) {
                jVar.f();
            }
            this.r.G0(this.f474g);
            this.r.H0(this.f474g);
            this.f474g.b();
            if (this.w) {
                m mVar2 = this.r;
                t tVar = this.f474g;
                mVar2.f492i = false;
                mVar2.i0(this, tVar);
            }
            this.r.U0(null);
            this.r = null;
        } else {
            this.f474g.b();
        }
        e.u.b.b bVar = this.f477j;
        b.a aVar = bVar.b;
        aVar.a = 0L;
        b.a aVar2 = aVar.b;
        if (aVar2 != null) {
            aVar2.g();
        }
        int size = bVar.c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            e.u.b.y yVar = (e.u.b.y) bVar.a;
            Objects.requireNonNull(yVar);
            a0 M = M(bVar.c.get(size));
            if (M != null) {
                M.onLeftHiddenState(yVar.a);
            }
            bVar.c.remove(size);
        }
        e.u.b.y yVar2 = (e.u.b.y) bVar.a;
        int b2 = yVar2.b();
        for (int i2 = 0; i2 < b2; i2++) {
            View a2 = yVar2.a(i2);
            yVar2.a.p(a2);
            a2.clearAnimation();
        }
        yVar2.a.removeAllViews();
        this.r = mVar;
        if (mVar != null) {
            if (mVar.b == null) {
                mVar.U0(this);
                if (this.w) {
                    m mVar3 = this.r;
                    mVar3.f492i = true;
                    mVar3.g0();
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("LayoutManager ");
                sb.append(mVar);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(f.a.b.a.a.h(mVar.b, sb));
            }
        }
        this.f474g.l();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        e.i.j.m scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f2543d) {
            View view = scrollingChildHelper.c;
            AtomicInteger atomicInteger = e.i.j.z.a;
            z.i.z(view);
        }
        scrollingChildHelper.f2543d = z2;
    }

    public void setOnFlingListener(p pVar) {
        this.d0 = pVar;
    }

    @Deprecated
    public void setOnScrollListener(r rVar) {
        this.n0 = rVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.i0 = z2;
    }

    public void setRecycledViewPool(s sVar) {
        s sVar2;
        t tVar = this.f474g;
        if (tVar.f503g != null) {
            sVar2.b--;
        }
        tVar.f503g = sVar;
        if (sVar == null || RecyclerView.this.getAdapter() == null) {
            return;
        }
        tVar.f503g.b++;
    }

    public void setRecyclerListener(u uVar) {
        this.s = uVar;
    }

    public void setScrollState(int i2) {
        w wVar;
        if (i2 == this.S) {
            return;
        }
        this.S = i2;
        if (i2 != 2) {
            this.j0.c();
            m mVar = this.r;
            if (mVar != null && (wVar = mVar.f490g) != null) {
                wVar.d();
            }
        }
        m mVar2 = this.r;
        if (mVar2 != null) {
            mVar2.D0(i2);
        }
        a0();
        r rVar = this.n0;
        if (rVar != null) {
            rVar.a(this, i2);
        }
        List<r> list = this.o0;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            this.o0.get(size).a(this, i2);
        }
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
            } else {
                this.c0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.c0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(y yVar) {
        Objects.requireNonNull(this.f474g);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().i(i2, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().j(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        if (z2 != this.C) {
            i("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.C = false;
                if (this.B && this.r != null && this.q != null) {
                    requestLayout();
                }
                this.B = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.C = true;
            this.D = true;
            v0();
        }
    }

    public boolean t(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().c(i2, i3, iArr, null, i4);
    }

    public void t0(boolean z2) {
        if (this.A < 1) {
            this.A = 1;
        }
        if (!z2 && !this.C) {
            this.B = false;
        }
        if (this.A == 1) {
            if (z2 && this.B && !this.C && this.r != null && this.q != null) {
                q();
            }
            if (!this.C) {
                this.B = false;
            }
        }
        this.A--;
    }

    public final void u(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().f(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public void u0(int i2) {
        getScrollingChildHelper().j(i2);
    }

    public void v(int i2, int i3) {
        this.L++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        b0();
        r rVar = this.n0;
        if (rVar != null) {
            rVar.b(this, i2, i3);
        }
        List<r> list = this.o0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.o0.get(size).b(this, i2, i3);
            }
        }
        this.L--;
    }

    public void v0() {
        w wVar;
        setScrollState(0);
        this.j0.c();
        m mVar = this.r;
        if (mVar == null || (wVar = mVar.f490g) == null) {
            return;
        }
        wVar.d();
    }

    public void w() {
        if (this.Q != null) {
            return;
        }
        EdgeEffect a2 = this.M.a(this);
        this.Q = a2;
        if (this.f479l) {
            a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a2.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void x() {
        if (this.N != null) {
            return;
        }
        EdgeEffect a2 = this.M.a(this);
        this.N = a2;
        if (this.f479l) {
            a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a2.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void y() {
        if (this.P != null) {
            return;
        }
        EdgeEffect a2 = this.M.a(this);
        this.P = a2;
        if (this.f479l) {
            a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a2.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void z() {
        if (this.O != null) {
            return;
        }
        EdgeEffect a2 = this.M.a(this);
        this.O = a2;
        if (this.f479l) {
            a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a2.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e<VH extends a0> {
        private final f mObservable = new f();
        private boolean mHasStableIds = false;

        public final void bindViewHolder(VH vh, int i2) {
            vh.mPosition = i2;
            if (hasStableIds()) {
                vh.mItemId = getItemId(i2);
            }
            vh.setFlags(1, 519);
            int i3 = e.i.f.h.a;
            Trace.beginSection("RV OnBindView");
            onBindViewHolder(vh, i2, vh.getUnmodifiedPayloads());
            vh.clearPayload();
            ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
            if (layoutParams instanceof n) {
                ((n) layoutParams).c = true;
            }
            Trace.endSection();
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i2) {
            try {
                int i3 = e.i.f.h.a;
                Trace.beginSection("RV CreateView");
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i2);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = i2;
                    Trace.endSection();
                    return onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } catch (Throwable th) {
                int i4 = e.i.f.h.a;
                Trace.endSection();
                throw th;
            }
        }

        public abstract int getItemCount();

        public long getItemId(int i2) {
            return -1L;
        }

        public int getItemViewType(int i2) {
            return 0;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int i2) {
            this.mObservable.d(i2, 1, null);
        }

        public final void notifyItemInserted(int i2) {
            this.mObservable.e(i2, 1);
        }

        public final void notifyItemMoved(int i2, int i3) {
            this.mObservable.c(i2, i3);
        }

        public final void notifyItemRangeChanged(int i2, int i3) {
            this.mObservable.d(i2, i3, null);
        }

        public final void notifyItemRangeInserted(int i2, int i3) {
            this.mObservable.e(i2, i3);
        }

        public final void notifyItemRangeRemoved(int i2, int i3) {
            this.mObservable.f(i2, i3);
        }

        public final void notifyItemRemoved(int i2) {
            this.mObservable.f(i2, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh, int i2);

        public void onBindViewHolder(VH vh, int i2, List<Object> list) {
            onBindViewHolder(vh, i2);
        }

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i2);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }

        public void registerAdapterDataObserver(g gVar) {
            this.mObservable.registerObserver(gVar);
        }

        public void setHasStableIds(boolean z) {
            if (!hasObservers()) {
                this.mHasStableIds = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void unregisterAdapterDataObserver(g gVar) {
            this.mObservable.unregisterObserver(gVar);
        }

        public final void notifyItemChanged(int i2, Object obj) {
            this.mObservable.d(i2, 1, obj);
        }

        public final void notifyItemRangeChanged(int i2, int i3, Object obj) {
            this.mObservable.d(i2, i3, obj);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        float a2;
        float a3;
        int i3;
        char c2;
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        this.f473f = new v();
        this.f474g = new t();
        this.f478k = new e0();
        this.f480m = new a();
        this.n = new Rect();
        this.o = new Rect();
        this.p = new RectF();
        this.t = new ArrayList<>();
        this.u = new ArrayList<>();
        this.A = 0;
        this.I = false;
        this.J = false;
        this.K = 0;
        this.L = 0;
        this.M = new i();
        this.R = new e.u.b.k();
        this.S = 0;
        this.T = -1;
        this.g0 = Float.MIN_VALUE;
        this.h0 = Float.MIN_VALUE;
        this.i0 = true;
        this.j0 = new z();
        this.l0 = G0 ? new n.b() : null;
        this.m0 = new x();
        this.p0 = false;
        this.q0 = false;
        this.r0 = new k();
        this.s0 = false;
        this.v0 = new int[2];
        this.x0 = new int[2];
        this.y0 = new int[2];
        this.z0 = new int[2];
        this.A0 = new ArrayList();
        this.B0 = new b();
        this.C0 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.c0 = viewConfiguration.getScaledTouchSlop();
        Method method = e.i.j.a0.a;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            a2 = viewConfiguration.getScaledHorizontalScrollFactor();
        } else {
            a2 = e.i.j.a0.a(viewConfiguration, context);
        }
        this.g0 = a2;
        if (i4 >= 26) {
            a3 = viewConfiguration.getScaledVerticalScrollFactor();
        } else {
            a3 = e.i.j.a0.a(viewConfiguration, context);
        }
        this.h0 = a3;
        this.e0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.R.a = this.r0;
        this.f476i = new e.u.b.a(new e.u.b.z(this));
        this.f477j = new e.u.b.b(new e.u.b.y(this));
        AtomicInteger atomicInteger = e.i.j.z.a;
        if ((i4 >= 26 ? z.l.b(this) : 0) == 0 && i4 >= 26) {
            z.l.l(this, 8);
        }
        if (z.d.c(this) == 0) {
            z.d.s(this, 1);
        }
        this.G = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new e.u.b.a0(this));
        int[] iArr = e.u.a.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        if (i4 >= 29) {
            i3 = 8;
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, i2, 0);
        } else {
            i3 = 8;
        }
        String string = obtainStyledAttributes.getString(i3);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f479l = obtainStyledAttributes.getBoolean(1, true);
        boolean z2 = obtainStyledAttributes.getBoolean(3, false);
        this.y = z2;
        if (z2) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                Resources resources = getContext().getResources();
                c2 = 2;
                new e.u.b.m(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
            } else {
                throw new IllegalArgumentException(f.a.b.a.a.h(this, f.a.b.a.a.A("Trying to set fast scroller without both required drawables.")));
            }
        } else {
            c2 = 2;
        }
        obtainStyledAttributes.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                String str = trim;
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(str, false, classLoader).asSubclass(m.class);
                    try {
                        constructor = asSubclass.getConstructor(H0);
                        Object[] objArr2 = new Object[4];
                        objArr2[0] = context;
                        objArr2[1] = attributeSet;
                        objArr2[c2] = Integer.valueOf(i2);
                        objArr2[3] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e2) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e3) {
                            e3.initCause(e2);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e3);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((m) constructor.newInstance(objArr));
                } catch (ClassCastException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e4);
                } catch (ClassNotFoundException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e6);
                } catch (InstantiationException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e7);
                } catch (InvocationTargetException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e8);
                }
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        int[] iArr2 = D0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
        if (i5 >= 29) {
            saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes2, i2, 0);
        }
        boolean z3 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z3);
    }

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        public Parcelable f481h;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f481h = parcel.readParcelable(classLoader == null ? m.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f348f, i2);
            parcel.writeParcelable(this.f481h, 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* loaded from: classes.dex */
    public static class n extends ViewGroup.MarginLayoutParams {
        public a0 a;
        public final Rect b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f498d;

        public n(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = new Rect();
            this.c = true;
            this.f498d = false;
        }

        public int a() {
            return this.a.getLayoutPosition();
        }

        public boolean b() {
            return this.a.isUpdated();
        }

        public boolean c() {
            return this.a.isRemoved();
        }

        public n(int i2, int i3) {
            super(i2, i3);
            this.b = new Rect();
            this.c = true;
            this.f498d = false;
        }

        public n(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = new Rect();
            this.c = true;
            this.f498d = false;
        }

        public n(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = new Rect();
            this.c = true;
            this.f498d = false;
        }

        public n(n nVar) {
            super((ViewGroup.LayoutParams) nVar);
            this.b = new Rect();
            this.c = true;
            this.f498d = false;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        m mVar = this.r;
        if (mVar != null) {
            return mVar.y(layoutParams);
        }
        throw new IllegalStateException(f.a.b.a.a.h(this, f.a.b.a.a.A("RecyclerView has no LayoutManager")));
    }
}
