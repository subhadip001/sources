package e.p.c;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentState;
import androidx.lifecycle.Lifecycle;
import com.video_converter.video_compressor.R;
import e.i.j.z;
import e.p.c.s0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FragmentStateManager.java */
/* loaded from: classes.dex */
public class c0 {
    public final y a;
    public final d0 b;
    public final Fragment c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2687d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f2688e = -1;

    /* compiled from: FragmentStateManager.java */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ View f2689f;

        public a(c0 c0Var, View view) {
            this.f2689f = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f2689f.removeOnAttachStateChangeListener(this);
            View view2 = this.f2689f;
            AtomicInteger atomicInteger = e.i.j.z.a;
            z.h.c(view2);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public c0(y yVar, d0 d0Var, Fragment fragment) {
        this.a = yVar;
        this.b = d0Var;
        this.c = fragment;
    }

    public void a() {
        if (FragmentManager.P(3)) {
            StringBuilder A = f.a.b.a.a.A("moveto ACTIVITY_CREATED: ");
            A.append(this.c);
            Log.d("FragmentManager", A.toString());
        }
        Fragment fragment = this.c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        y yVar = this.a;
        Fragment fragment2 = this.c;
        yVar.a(fragment2, fragment2.mSavedFragmentState, false);
    }

    public void b() {
        View view;
        View view2;
        d0 d0Var = this.b;
        Fragment fragment = this.c;
        Objects.requireNonNull(d0Var);
        ViewGroup viewGroup = fragment.mContainer;
        int i2 = -1;
        if (viewGroup != null) {
            int indexOf = d0Var.a.indexOf(fragment);
            int i3 = indexOf - 1;
            while (true) {
                if (i3 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= d0Var.a.size()) {
                            break;
                        }
                        Fragment fragment2 = d0Var.a.get(indexOf);
                        if (fragment2.mContainer == viewGroup && (view = fragment2.mView) != null) {
                            i2 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment3 = d0Var.a.get(i3);
                    if (fragment3.mContainer == viewGroup && (view2 = fragment3.mView) != null) {
                        i2 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i3--;
                }
            }
        }
        Fragment fragment4 = this.c;
        fragment4.mContainer.addView(fragment4.mView, i2);
    }

    public void c() {
        if (FragmentManager.P(3)) {
            StringBuilder A = f.a.b.a.a.A("moveto ATTACHED: ");
            A.append(this.c);
            Log.d("FragmentManager", A.toString());
        }
        Fragment fragment = this.c;
        Fragment fragment2 = fragment.mTarget;
        c0 c0Var = null;
        if (fragment2 != null) {
            c0 h2 = this.b.h(fragment2.mWho);
            if (h2 != null) {
                Fragment fragment3 = this.c;
                fragment3.mTargetWho = fragment3.mTarget.mWho;
                fragment3.mTarget = null;
                c0Var = h2;
            } else {
                StringBuilder A2 = f.a.b.a.a.A("Fragment ");
                A2.append(this.c);
                A2.append(" declared target fragment ");
                A2.append(this.c.mTarget);
                A2.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(A2.toString());
            }
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (c0Var = this.b.h(str)) == null) {
                StringBuilder A3 = f.a.b.a.a.A("Fragment ");
                A3.append(this.c);
                A3.append(" declared target fragment ");
                throw new IllegalStateException(f.a.b.a.a.u(A3, this.c.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (c0Var != null) {
            c0Var.k();
        }
        Fragment fragment4 = this.c;
        FragmentManager fragmentManager = fragment4.mFragmentManager;
        fragment4.mHost = fragmentManager.q;
        fragment4.mParentFragment = fragmentManager.s;
        this.a.g(fragment4, false);
        this.c.performAttach();
        this.a.b(this.c, false);
    }

    public int d() {
        Fragment fragment = this.c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i2 = this.f2688e;
        int ordinal = fragment.mMaxState.ordinal();
        if (ordinal == 1) {
            i2 = Math.min(i2, 0);
        } else if (ordinal == 2) {
            i2 = Math.min(i2, 1);
        } else if (ordinal == 3) {
            i2 = Math.min(i2, 5);
        } else if (ordinal != 4) {
            i2 = Math.min(i2, -1);
        }
        Fragment fragment2 = this.c;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                i2 = Math.max(this.f2688e, 2);
                View view = this.c.mView;
                if (view != null && view.getParent() == null) {
                    i2 = Math.min(i2, 2);
                }
            } else {
                i2 = this.f2688e < 4 ? Math.min(i2, fragment2.mState) : Math.min(i2, 1);
            }
        }
        if (!this.c.mAdded) {
            i2 = Math.min(i2, 1);
        }
        Fragment fragment3 = this.c;
        ViewGroup viewGroup = fragment3.mContainer;
        s0.d.b bVar = null;
        s0.d dVar = null;
        if (viewGroup != null) {
            s0 f2 = s0.f(viewGroup, fragment3.getParentFragmentManager());
            Objects.requireNonNull(f2);
            s0.d d2 = f2.d(this.c);
            s0.d.b bVar2 = d2 != null ? d2.b : null;
            Fragment fragment4 = this.c;
            Iterator<s0.d> it = f2.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                s0.d next = it.next();
                if (next.c.equals(fragment4) && !next.f2788f) {
                    dVar = next;
                    break;
                }
            }
            bVar = (dVar == null || !(bVar2 == null || bVar2 == s0.d.b.NONE)) ? bVar2 : dVar.b;
        }
        if (bVar == s0.d.b.ADDING) {
            i2 = Math.min(i2, 6);
        } else if (bVar == s0.d.b.REMOVING) {
            i2 = Math.max(i2, 3);
        } else {
            Fragment fragment5 = this.c;
            if (fragment5.mRemoving) {
                if (fragment5.isInBackStack()) {
                    i2 = Math.min(i2, 1);
                } else {
                    i2 = Math.min(i2, -1);
                }
            }
        }
        Fragment fragment6 = this.c;
        if (fragment6.mDeferStart && fragment6.mState < 5) {
            i2 = Math.min(i2, 4);
        }
        if (FragmentManager.P(2)) {
            StringBuilder B = f.a.b.a.a.B("computeExpectedState() of ", i2, " for ");
            B.append(this.c);
            Log.v("FragmentManager", B.toString());
        }
        return i2;
    }

    public void e() {
        if (FragmentManager.P(3)) {
            StringBuilder A = f.a.b.a.a.A("moveto CREATED: ");
            A.append(this.c);
            Log.d("FragmentManager", A.toString());
        }
        Fragment fragment = this.c;
        if (!fragment.mIsCreated) {
            this.a.h(fragment, fragment.mSavedFragmentState, false);
            Fragment fragment2 = this.c;
            fragment2.performCreate(fragment2.mSavedFragmentState);
            y yVar = this.a;
            Fragment fragment3 = this.c;
            yVar.c(fragment3, fragment3.mSavedFragmentState, false);
            return;
        }
        fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
        this.c.mState = 1;
    }

    public void f() {
        String str;
        if (this.c.mFromLayout) {
            return;
        }
        if (FragmentManager.P(3)) {
            StringBuilder A = f.a.b.a.a.A("moveto CREATE_VIEW: ");
            A.append(this.c);
            Log.d("FragmentManager", A.toString());
        }
        Fragment fragment = this.c;
        LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        ViewGroup viewGroup = null;
        Fragment fragment2 = this.c;
        ViewGroup viewGroup2 = fragment2.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i2 = fragment2.mContainerId;
            if (i2 != 0) {
                if (i2 != -1) {
                    viewGroup = (ViewGroup) fragment2.mFragmentManager.r.c(i2);
                    if (viewGroup == null) {
                        Fragment fragment3 = this.c;
                        if (!fragment3.mRestored) {
                            try {
                                str = fragment3.getResources().getResourceName(this.c.mContainerId);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            StringBuilder A2 = f.a.b.a.a.A("No view found for id 0x");
                            A2.append(Integer.toHexString(this.c.mContainerId));
                            A2.append(" (");
                            A2.append(str);
                            A2.append(") for fragment ");
                            A2.append(this.c);
                            throw new IllegalArgumentException(A2.toString());
                        }
                    }
                } else {
                    StringBuilder A3 = f.a.b.a.a.A("Cannot create fragment ");
                    A3.append(this.c);
                    A3.append(" for a container view with no id");
                    throw new IllegalArgumentException(A3.toString());
                }
            }
        }
        Fragment fragment4 = this.c;
        fragment4.mContainer = viewGroup;
        fragment4.performCreateView(performGetLayoutInflater, viewGroup, fragment4.mSavedFragmentState);
        View view = this.c.mView;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.c;
            fragment5.mView.setTag(R.id.fragment_container_view_tag, fragment5);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment6 = this.c;
            if (fragment6.mHidden) {
                fragment6.mView.setVisibility(8);
            }
            View view2 = this.c.mView;
            AtomicInteger atomicInteger = e.i.j.z.a;
            if (z.g.b(view2)) {
                z.h.c(this.c.mView);
            } else {
                View view3 = this.c.mView;
                view3.addOnAttachStateChangeListener(new a(this, view3));
            }
            this.c.performViewCreated();
            y yVar = this.a;
            Fragment fragment7 = this.c;
            yVar.m(fragment7, fragment7.mView, fragment7.mSavedFragmentState, false);
            int visibility = this.c.mView.getVisibility();
            this.c.setPostOnViewCreatedAlpha(this.c.mView.getAlpha());
            Fragment fragment8 = this.c;
            if (fragment8.mContainer != null && visibility == 0) {
                View findFocus = fragment8.mView.findFocus();
                if (findFocus != null) {
                    this.c.setFocusedView(findFocus);
                    if (FragmentManager.P(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.c);
                    }
                }
                this.c.mView.setAlpha(0.0f);
            }
        }
        this.c.mState = 2;
    }

    public void g() {
        Fragment d2;
        if (FragmentManager.P(3)) {
            StringBuilder A = f.a.b.a.a.A("movefrom CREATED: ");
            A.append(this.c);
            Log.d("FragmentManager", A.toString());
        }
        Fragment fragment = this.c;
        boolean z = true;
        boolean z2 = fragment.mRemoving && !fragment.isInBackStack();
        if (z2 || this.b.c.f(this.c)) {
            w<?> wVar = this.c.mHost;
            if (wVar instanceof e.s.j0) {
                z = this.b.c.f2676g;
            } else {
                Context context = wVar.f2800g;
                if (context instanceof Activity) {
                    z = true ^ ((Activity) context).isChangingConfigurations();
                }
            }
            if (z2 || z) {
                a0 a0Var = this.b.c;
                Fragment fragment2 = this.c;
                Objects.requireNonNull(a0Var);
                if (FragmentManager.P(3)) {
                    Log.d("FragmentManager", "Clearing non-config state for " + fragment2);
                }
                a0 a0Var2 = a0Var.f2673d.get(fragment2.mWho);
                if (a0Var2 != null) {
                    a0Var2.b();
                    a0Var.f2673d.remove(fragment2.mWho);
                }
                e.s.i0 i0Var = a0Var.f2674e.get(fragment2.mWho);
                if (i0Var != null) {
                    i0Var.a();
                    a0Var.f2674e.remove(fragment2.mWho);
                }
            }
            this.c.performDestroy();
            this.a.d(this.c, false);
            Iterator it = ((ArrayList) this.b.f()).iterator();
            while (it.hasNext()) {
                c0 c0Var = (c0) it.next();
                if (c0Var != null) {
                    Fragment fragment3 = c0Var.c;
                    if (this.c.mWho.equals(fragment3.mTargetWho)) {
                        fragment3.mTarget = this.c;
                        fragment3.mTargetWho = null;
                    }
                }
            }
            Fragment fragment4 = this.c;
            String str = fragment4.mTargetWho;
            if (str != null) {
                fragment4.mTarget = this.b.d(str);
            }
            this.b.k(this);
            return;
        }
        String str2 = this.c.mTargetWho;
        if (str2 != null && (d2 = this.b.d(str2)) != null && d2.mRetainInstance) {
            this.c.mTarget = d2;
        }
        this.c.mState = 0;
    }

    public void h() {
        View view;
        if (FragmentManager.P(3)) {
            StringBuilder A = f.a.b.a.a.A("movefrom CREATE_VIEW: ");
            A.append(this.c);
            Log.d("FragmentManager", A.toString());
        }
        Fragment fragment = this.c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.c.performDestroyView();
        this.a.n(this.c, false);
        Fragment fragment2 = this.c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.k(null);
        this.c.mInLayout = false;
    }

    public void i() {
        if (FragmentManager.P(3)) {
            StringBuilder A = f.a.b.a.a.A("movefrom ATTACHED: ");
            A.append(this.c);
            Log.d("FragmentManager", A.toString());
        }
        this.c.performDetach();
        boolean z = false;
        this.a.e(this.c, false);
        Fragment fragment = this.c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z = true;
        }
        if (z || this.b.c.f(this.c)) {
            if (FragmentManager.P(3)) {
                StringBuilder A2 = f.a.b.a.a.A("initState called for fragment: ");
                A2.append(this.c);
                Log.d("FragmentManager", A2.toString());
            }
            this.c.initState();
        }
    }

    public void j() {
        Fragment fragment = this.c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.P(3)) {
                StringBuilder A = f.a.b.a.a.A("moveto CREATE_VIEW: ");
                A.append(this.c);
                Log.d("FragmentManager", A.toString());
            }
            Fragment fragment2 = this.c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), null, this.c.mSavedFragmentState);
            View view = this.c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.c;
                fragment3.mView.setTag(R.id.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.c.performViewCreated();
                y yVar = this.a;
                Fragment fragment5 = this.c;
                yVar.m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.c.mState = 2;
            }
        }
    }

    public void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        s0.d.b bVar = s0.d.b.NONE;
        if (this.f2687d) {
            if (FragmentManager.P(2)) {
                StringBuilder A = f.a.b.a.a.A("Ignoring re-entrant call to moveToExpectedState() for ");
                A.append(this.c);
                Log.v("FragmentManager", A.toString());
                return;
            }
            return;
        }
        try {
            this.f2687d = true;
            while (true) {
                int d2 = d();
                Fragment fragment = this.c;
                int i2 = fragment.mState;
                if (d2 == i2) {
                    if (fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            s0 f2 = s0.f(viewGroup, fragment.getParentFragmentManager());
                            if (this.c.mHidden) {
                                Objects.requireNonNull(f2);
                                if (FragmentManager.P(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + this.c);
                                }
                                f2.a(s0.d.c.GONE, bVar, this);
                            } else {
                                Objects.requireNonNull(f2);
                                if (FragmentManager.P(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + this.c);
                                }
                                f2.a(s0.d.c.VISIBLE, bVar, this);
                            }
                        }
                        Fragment fragment2 = this.c;
                        FragmentManager fragmentManager = fragment2.mFragmentManager;
                        if (fragmentManager != null && fragment2.mAdded && fragmentManager.Q(fragment2)) {
                            fragmentManager.A = true;
                        }
                        Fragment fragment3 = this.c;
                        fragment3.mHiddenChanged = false;
                        fragment3.onHiddenChanged(fragment3.mHidden);
                    }
                    return;
                } else if (d2 > i2) {
                    switch (i2 + 1) {
                        case 0:
                            c();
                            continue;
                        case 1:
                            e();
                            continue;
                        case 2:
                            j();
                            f();
                            continue;
                        case 3:
                            a();
                            continue;
                        case 4:
                            if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                s0 f3 = s0.f(viewGroup2, fragment.getParentFragmentManager());
                                s0.d.c d3 = s0.d.c.d(this.c.mView.getVisibility());
                                Objects.requireNonNull(f3);
                                if (FragmentManager.P(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + this.c);
                                }
                                f3.a(d3, s0.d.b.ADDING, this);
                            }
                            this.c.mState = 4;
                            continue;
                        case 5:
                            q();
                            continue;
                        case 6:
                            fragment.mState = 6;
                            continue;
                        case 7:
                            n();
                            continue;
                        default:
                            continue;
                    }
                } else {
                    switch (i2 - 1) {
                        case -1:
                            i();
                            continue;
                        case 0:
                            g();
                            continue;
                        case 1:
                            h();
                            this.c.mState = 1;
                            continue;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            continue;
                        case 3:
                            if (FragmentManager.P(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.c);
                            }
                            Fragment fragment4 = this.c;
                            if (fragment4.mView != null && fragment4.mSavedViewState == null) {
                                p();
                            }
                            Fragment fragment5 = this.c;
                            if (fragment5.mView != null && (viewGroup3 = fragment5.mContainer) != null) {
                                s0 f4 = s0.f(viewGroup3, fragment5.getParentFragmentManager());
                                Objects.requireNonNull(f4);
                                if (FragmentManager.P(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + this.c);
                                }
                                f4.a(s0.d.c.REMOVED, s0.d.b.REMOVING, this);
                            }
                            this.c.mState = 3;
                            continue;
                        case 4:
                            r();
                            continue;
                        case 5:
                            fragment.mState = 5;
                            continue;
                        case 6:
                            l();
                            continue;
                        default:
                            continue;
                    }
                }
            }
        } finally {
            this.f2687d = false;
        }
    }

    public void l() {
        if (FragmentManager.P(3)) {
            StringBuilder A = f.a.b.a.a.A("movefrom RESUMED: ");
            A.append(this.c);
            Log.d("FragmentManager", A.toString());
        }
        this.c.performPause();
        this.a.f(this.c, false);
    }

    public void m(ClassLoader classLoader) {
        Bundle bundle = this.c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.c;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.c;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
        Fragment fragment3 = this.c;
        fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
        Fragment fragment4 = this.c;
        if (fragment4.mTargetWho != null) {
            fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.c;
        Boolean bool = fragment5.mSavedUserVisibleHint;
        if (bool != null) {
            fragment5.mUserVisibleHint = bool.booleanValue();
            this.c.mSavedUserVisibleHint = null;
        } else {
            fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.c;
        if (fragment6.mUserVisibleHint) {
            return;
        }
        fragment6.mDeferStart = true;
    }

    public void n() {
        if (FragmentManager.P(3)) {
            StringBuilder A = f.a.b.a.a.A("moveto RESUMED: ");
            A.append(this.c);
            Log.d("FragmentManager", A.toString());
        }
        View focusedView = this.c.getFocusedView();
        if (focusedView != null) {
            boolean z = true;
            if (focusedView != this.c.mView) {
                ViewParent parent = focusedView.getParent();
                while (true) {
                    if (parent == null) {
                        z = false;
                        break;
                    } else if (parent == this.c.mView) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
            }
            if (z) {
                boolean requestFocus = focusedView.requestFocus();
                if (FragmentManager.P(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("requestFocus: Restoring focused view ");
                    sb.append(focusedView);
                    sb.append(" ");
                    sb.append(requestFocus ? "succeeded" : "failed");
                    sb.append(" on Fragment ");
                    sb.append(this.c);
                    sb.append(" resulting in focused view ");
                    sb.append(this.c.mView.findFocus());
                    Log.v("FragmentManager", sb.toString());
                }
            }
        }
        this.c.setFocusedView(null);
        this.c.performResume();
        this.a.i(this.c, false);
        Fragment fragment = this.c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public final Bundle o() {
        Bundle bundle = new Bundle();
        this.c.performSaveInstanceState(bundle);
        this.a.j(this.c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.c.mView != null) {
            p();
        }
        if (this.c.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.c.mSavedViewState);
        }
        if (this.c.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.c.mSavedViewRegistryState);
        }
        if (!this.c.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.c.mUserVisibleHint);
        }
        return bundle;
    }

    public void p() {
        if (this.c.mView == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.c.mViewLifecycleOwner.f2771h.b(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.c.mSavedViewRegistryState = bundle;
    }

    public void q() {
        if (FragmentManager.P(3)) {
            StringBuilder A = f.a.b.a.a.A("moveto STARTED: ");
            A.append(this.c);
            Log.d("FragmentManager", A.toString());
        }
        this.c.performStart();
        this.a.k(this.c, false);
    }

    public void r() {
        if (FragmentManager.P(3)) {
            StringBuilder A = f.a.b.a.a.A("movefrom STARTED: ");
            A.append(this.c);
            Log.d("FragmentManager", A.toString());
        }
        this.c.performStop();
        this.a.l(this.c, false);
    }

    public c0(y yVar, d0 d0Var, ClassLoader classLoader, v vVar, FragmentState fragmentState) {
        this.a = yVar;
        this.b = d0Var;
        Fragment a2 = vVar.a(classLoader, fragmentState.f421f);
        this.c = a2;
        Bundle bundle = fragmentState.o;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a2.setArguments(fragmentState.o);
        a2.mWho = fragmentState.f422g;
        a2.mFromLayout = fragmentState.f423h;
        a2.mRestored = true;
        a2.mFragmentId = fragmentState.f424i;
        a2.mContainerId = fragmentState.f425j;
        a2.mTag = fragmentState.f426k;
        a2.mRetainInstance = fragmentState.f427l;
        a2.mRemoving = fragmentState.f428m;
        a2.mDetached = fragmentState.n;
        a2.mHidden = fragmentState.p;
        a2.mMaxState = Lifecycle.State.values()[fragmentState.q];
        Bundle bundle2 = fragmentState.r;
        if (bundle2 != null) {
            a2.mSavedFragmentState = bundle2;
        } else {
            a2.mSavedFragmentState = new Bundle();
        }
        if (FragmentManager.P(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    public c0(y yVar, d0 d0Var, Fragment fragment, FragmentState fragmentState) {
        this.a = yVar;
        this.b = d0Var;
        this.c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = fragmentState.r;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }
}
