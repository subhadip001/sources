package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.app.SharedElementCallback;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import com.video_converter.video_compressor.R;
import e.p.c.a0;
import e.p.c.b0;
import e.p.c.q0;
import e.p.c.s0;
import e.p.c.t;
import e.p.c.u0;
import e.p.c.v;
import e.p.c.w;
import e.p.c.z;
import e.s.e0;
import e.s.i0;
import e.s.j0;
import e.s.m;
import e.s.n;
import e.s.s;
import e.t.a.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, m, j0, e.w.c {
    public static final int ACTIVITY_CREATED = 4;
    public static final int ATTACHED = 0;
    public static final int AWAITING_ENTER_EFFECTS = 6;
    public static final int AWAITING_EXIT_EFFECTS = 3;
    public static final int CREATED = 1;
    public static final int INITIALIZING = -1;
    public static final int RESUMED = 7;
    public static final int STARTED = 5;
    public static final Object USE_DEFAULT_TRANSITION = new Object();
    public static final int VIEW_CREATED = 2;
    public boolean mAdded;
    public i mAnimationInfo;
    public Bundle mArguments;
    public int mBackStackNesting;
    private boolean mCalled;
    public FragmentManager mChildFragmentManager;
    public ViewGroup mContainer;
    public int mContainerId;
    private int mContentLayoutId;
    public e0 mDefaultFactory;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public FragmentManager mFragmentManager;
    public boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public w<?> mHost;
    public boolean mInLayout;
    public boolean mIsCreated;
    public boolean mIsNewlyAdded;
    private Boolean mIsPrimaryNavigationFragment;
    public LayoutInflater mLayoutInflater;
    public n mLifecycleRegistry;
    public Lifecycle.State mMaxState;
    public boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<j> mOnPreAttachedListeners;
    public Fragment mParentFragment;
    public boolean mPerformedCreateView;
    public float mPostponedAlpha;
    public Runnable mPostponedDurationRunnable;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetainInstanceChangedWhileDetached;
    public Bundle mSavedFragmentState;
    public e.w.b mSavedStateRegistryController;
    public Boolean mSavedUserVisibleHint;
    public Bundle mSavedViewRegistryState;
    public SparseArray<Parcelable> mSavedViewState;
    public int mState;
    public String mTag;
    public Fragment mTarget;
    public int mTargetRequestCode;
    public String mTargetWho;
    public boolean mUserVisibleHint;
    public View mView;
    public q0 mViewLifecycleOwner;
    public s<m> mViewLifecycleOwnerLiveData;
    public String mWho;

    /* loaded from: classes.dex */
    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ s0 f381f;

        public c(Fragment fragment, s0 s0Var) {
            this.f381f = s0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f381f.c();
        }
    }

    /* loaded from: classes.dex */
    public class d extends t {
        public d() {
        }

        @Override // e.p.c.t
        public View c(int i2) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i2);
            }
            StringBuilder A = f.a.b.a.a.A("Fragment ");
            A.append(Fragment.this);
            A.append(" does not have a view");
            throw new IllegalStateException(A.toString());
        }

        @Override // e.p.c.t
        public boolean d() {
            return Fragment.this.mView != null;
        }
    }

    /* loaded from: classes.dex */
    public class e implements e.c.a.c.a<Void, ActivityResultRegistry> {
        public e() {
        }

        @Override // e.c.a.c.a
        public ActivityResultRegistry apply(Void r3) {
            Fragment fragment = Fragment.this;
            w<?> wVar = fragment.mHost;
            if (wVar instanceof e.a.e.c) {
                return ((e.a.e.c) wVar).o();
            }
            return fragment.requireActivity().f46m;
        }
    }

    /* loaded from: classes.dex */
    public class f implements e.c.a.c.a<Void, ActivityResultRegistry> {
        public final /* synthetic */ ActivityResultRegistry a;

        public f(Fragment fragment, ActivityResultRegistry activityResultRegistry) {
            this.a = activityResultRegistry;
        }

        @Override // e.c.a.c.a
        public ActivityResultRegistry apply(Void r1) {
            return this.a;
        }
    }

    /* loaded from: classes.dex */
    public class g extends j {
        public final /* synthetic */ e.c.a.c.a a;
        public final /* synthetic */ AtomicReference b;
        public final /* synthetic */ e.a.e.d.a c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ e.a.e.a f382d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(e.c.a.c.a aVar, AtomicReference atomicReference, e.a.e.d.a aVar2, e.a.e.a aVar3) {
            super(null);
            this.a = aVar;
            this.b = atomicReference;
            this.c = aVar2;
            this.f382d = aVar3;
        }

        @Override // androidx.fragment.app.Fragment.j
        public void a() {
            this.b.set(((ActivityResultRegistry) this.a.apply(null)).d(Fragment.this.generateActivityResultKey(), Fragment.this, this.c, this.f382d));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* loaded from: classes.dex */
    public class h<I> extends e.a.e.b<I> {
        public final /* synthetic */ AtomicReference a;

        public h(Fragment fragment, AtomicReference atomicReference, e.a.e.d.a aVar) {
            this.a = atomicReference;
        }

        @Override // e.a.e.b
        public void a(I i2, ActivityOptionsCompat activityOptionsCompat) {
            e.a.e.b bVar = (e.a.e.b) this.a.get();
            if (bVar != null) {
                bVar.a(i2, activityOptionsCompat);
                return;
            }
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }

        @Override // e.a.e.b
        public void b() {
            e.a.e.b bVar = (e.a.e.b) this.a.getAndSet(null);
            if (bVar != null) {
                bVar.b();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class i {
        public View a;
        public Animator b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public int f384d;

        /* renamed from: e  reason: collision with root package name */
        public int f385e;

        /* renamed from: f  reason: collision with root package name */
        public int f386f;

        /* renamed from: g  reason: collision with root package name */
        public int f387g;

        /* renamed from: h  reason: collision with root package name */
        public int f388h;

        /* renamed from: i  reason: collision with root package name */
        public ArrayList<String> f389i;

        /* renamed from: j  reason: collision with root package name */
        public ArrayList<String> f390j;

        /* renamed from: k  reason: collision with root package name */
        public Object f391k = null;

        /* renamed from: l  reason: collision with root package name */
        public Object f392l;

        /* renamed from: m  reason: collision with root package name */
        public Object f393m;
        public Object n;
        public Object o;
        public Object p;
        public Boolean q;
        public Boolean r;
        public SharedElementCallback s;
        public SharedElementCallback t;
        public float u;
        public View v;
        public boolean w;
        public k x;
        public boolean y;

        public i() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f392l = obj;
            this.f393m = null;
            this.n = obj;
            this.o = null;
            this.p = obj;
            this.s = null;
            this.t = null;
            this.u = 1.0f;
            this.v = null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class j {
        public j() {
        }

        public abstract void a();

        public j(a aVar) {
        }
    }

    /* loaded from: classes.dex */
    public interface k {
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new z();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new a();
        this.mMaxState = Lifecycle.State.RESUMED;
        this.mViewLifecycleOwnerLiveData = new s<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        initLifecycle();
    }

    private i ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new i();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        Lifecycle.State state = this.mMaxState;
        if (state != Lifecycle.State.INITIALIZED && this.mParentFragment != null) {
            return Math.min(state.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
        }
        return state.ordinal();
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new n(this);
        this.mSavedStateRegistryController = new e.w.b(this);
        this.mDefaultFactory = null;
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    private <I, O> e.a.e.b<I> prepareCallInternal(e.a.e.d.a<I, O> aVar, e.c.a.c.a<Void, ActivityResultRegistry> aVar2, e.a.e.a<O> aVar3) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            registerOnPreAttachListener(new g(aVar2, atomicReference, aVar, aVar3));
            return new h(this, atomicReference, aVar);
        }
        throw new IllegalStateException(f.a.b.a.a.o("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
    }

    private void registerOnPreAttachListener(j jVar) {
        if (this.mState >= 0) {
            jVar.a();
        } else {
            this.mOnPreAttachedListeners.add(jVar);
        }
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        i iVar = this.mAnimationInfo;
        Object obj = null;
        if (iVar != null) {
            iVar.w = false;
            Object obj2 = iVar.x;
            iVar.x = null;
            obj = obj2;
        }
        if (obj != null) {
            FragmentManager.n nVar = (FragmentManager.n) obj;
            int i2 = nVar.c - 1;
            nVar.c = i2;
            if (i2 != 0) {
                return;
            }
            nVar.b.q.g0();
        } else if (this.mView == null || (viewGroup = this.mContainer) == null || (fragmentManager = this.mFragmentManager) == null) {
        } else {
            s0 f2 = s0.f(viewGroup, fragmentManager);
            f2.h();
            if (z) {
                this.mHost.f2801h.post(new c(this, f2));
            } else {
                f2.c();
            }
        }
    }

    public t createFragmentContainer() {
        return new d();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment();
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            e.t.a.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.y(f.a.b.a.a.p(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Fragment findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.c.e(str);
    }

    public String generateActivityResultKey() {
        StringBuilder A = f.a.b.a.a.A("fragment_");
        A.append(this.mWho);
        A.append("_rq#");
        A.append(this.mNextLocalRequestCode.getAndIncrement());
        return A.toString();
    }

    public final e.p.c.n getActivity() {
        w<?> wVar = this.mHost;
        if (wVar == null) {
            return null;
        }
        return (e.p.c.n) wVar.f2799f;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        i iVar = this.mAnimationInfo;
        if (iVar == null || (bool = iVar.r) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        i iVar = this.mAnimationInfo;
        if (iVar == null || (bool = iVar.q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.a;
    }

    public Animator getAnimator() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.b;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(f.a.b.a.a.o("Fragment ", this, " has not been attached yet."));
    }

    public Context getContext() {
        w<?> wVar = this.mHost;
        if (wVar == null) {
            return null;
        }
        return wVar.f2800g;
    }

    public e0 getDefaultViewModelProviderFactory() {
        if (this.mFragmentManager != null) {
            if (this.mDefaultFactory == null) {
                Application application = null;
                Context applicationContext = requireContext().getApplicationContext();
                while (true) {
                    if (!(applicationContext instanceof ContextWrapper)) {
                        break;
                    } else if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    } else {
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    }
                }
                if (application == null && FragmentManager.P(3)) {
                    StringBuilder A = f.a.b.a.a.A("Could not find Application instance from Context ");
                    A.append(requireContext().getApplicationContext());
                    A.append(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
                    Log.d("FragmentManager", A.toString());
                }
                this.mDefaultFactory = new e.s.z(application, this, getArguments());
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public int getEnterAnim() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f384d;
    }

    public Object getEnterTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f391k;
    }

    public SharedElementCallback getEnterTransitionCallback() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.s;
    }

    public int getExitAnim() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f385e;
    }

    public Object getExitTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f393m;
    }

    public SharedElementCallback getExitTransitionCallback() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.t;
    }

    public View getFocusedView() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.v;
    }

    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        w<?> wVar = this.mHost;
        if (wVar == null) {
            return null;
        }
        return wVar.f();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // e.s.m
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public e.t.a.a getLoaderManager() {
        return e.t.a.a.b(this);
    }

    public int getNextTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f388h;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException(f.a.b.a.a.o("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return false;
        }
        return iVar.c;
    }

    public int getPopEnterAnim() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f386f;
    }

    public int getPopExitAnim() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f387g;
    }

    public float getPostOnViewCreatedAlpha() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 1.0f;
        }
        return iVar.u;
    }

    public Object getReenterTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.n;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f392l;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // e.w.c
    public final e.w.a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b;
    }

    public Object getSharedElementEnterTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.o;
    }

    public Object getSharedElementReturnTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.p;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        i iVar = this.mAnimationInfo;
        return (iVar == null || (arrayList = iVar.f389i) == null) ? new ArrayList<>() : arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        i iVar = this.mAnimationInfo;
        return (iVar == null || (arrayList = iVar.f390j) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i2) {
        return getResources().getString(i2);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        String str;
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.G(str);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i2) {
        return getResources().getText(i2);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public m getViewLifecycleOwner() {
        q0 q0Var = this.mViewLifecycleOwner;
        if (q0Var != null) {
            return q0Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public LiveData<m> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // e.s.j0
    public i0 getViewModelStore() {
        if (this.mFragmentManager != null) {
            if (getMinimumMaxLifecycleState() != 1) {
                a0 a0Var = this.mFragmentManager.J;
                i0 i0Var = a0Var.f2674e.get(this.mWho);
                if (i0Var == null) {
                    i0 i0Var2 = new i0();
                    a0Var.f2674e.put(this.mWho, i0Var2);
                    return i0Var2;
                }
                return i0Var;
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new z();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    public boolean isHideReplaced() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return false;
        }
        return iVar.y;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        FragmentManager fragmentManager;
        return this.mMenuVisible && ((fragmentManager = this.mFragmentManager) == null || fragmentManager.R(this.mParentFragment));
    }

    public boolean isPostponed() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return false;
        }
        return iVar.w;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isRemovingParent() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null && (parentFragment.isRemoving() || parentFragment.isRemovingParent());
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.T();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.W();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (FragmentManager.P(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i2 + " resultCode: " + i3 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        w<?> wVar = this.mHost;
        Activity activity = wVar == null ? null : wVar.f2799f;
        if (activity != null) {
            this.mCalled = false;
            onAttach(activity);
        }
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        FragmentManager fragmentManager = this.mChildFragmentManager;
        if (fragmentManager.p >= 1) {
            return;
        }
        fragmentManager.m();
    }

    public Animation onCreateAnimation(int i2, boolean z, int i3) {
        return null;
    }

    public Animator onCreateAnimator(int i2, boolean z, int i3) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = this.mContentLayoutId;
        if (i2 != 0) {
            return layoutInflater.inflate(i2, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        w<?> wVar = this.mHost;
        Activity activity = wVar == null ? null : wVar.f2799f;
        if (activity != null) {
            this.mCalled = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.W();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            restoreViewState();
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.B = false;
            fragmentManager.C = false;
            fragmentManager.J.f2677h = false;
            fragmentManager.w(4);
            return;
        }
        throw new u0(f.a.b.a.a.o("Fragment ", this, " did not call through to super.onActivityCreated()"));
    }

    public void performAttach() {
        Iterator<j> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.b(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.f2800g);
        if (this.mCalled) {
            FragmentManager fragmentManager = this.mFragmentManager;
            Iterator<b0> it2 = fragmentManager.o.iterator();
            while (it2.hasNext()) {
                it2.next().a(fragmentManager, this);
            }
            FragmentManager fragmentManager2 = this.mChildFragmentManager;
            fragmentManager2.B = false;
            fragmentManager2.C = false;
            fragmentManager2.J.f2677h = false;
            fragmentManager2.w(0);
            return;
        }
        throw new u0(f.a.b.a.a.o("Fragment ", this, " did not call through to super.onAttach()"));
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.mChildFragmentManager.k(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.l(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.W();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new e.s.k() { // from class: androidx.fragment.app.Fragment.5
            @Override // e.s.k
            public void d(m mVar, Lifecycle.Event event) {
                View view;
                if (event != Lifecycle.Event.ON_STOP || (view = Fragment.this.mView) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        this.mSavedStateRegistryController.a(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.e(Lifecycle.Event.ON_CREATE);
            return;
        }
        throw new u0(f.a.b.a.a.o("Fragment ", this, " did not call through to super.onCreate()"));
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onCreateOptionsMenu(menu, menuInflater);
        }
        return z | this.mChildFragmentManager.n(menu, menuInflater);
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.W();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new q0(this, getViewModelStore());
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView != null) {
            this.mViewLifecycleOwner.c();
            this.mView.setTag(R.id.view_tree_lifecycle_owner, this.mViewLifecycleOwner);
            this.mView.setTag(R.id.view_tree_view_model_store_owner, this.mViewLifecycleOwner);
            this.mView.setTag(R.id.view_tree_saved_state_registry_owner, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.k(this.mViewLifecycleOwner);
            return;
        }
        if (!(this.mViewLifecycleOwner.f2770g != null)) {
            this.mViewLifecycleOwner = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public void performDestroy() {
        this.mChildFragmentManager.o();
        this.mLifecycleRegistry.e(Lifecycle.Event.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new u0(f.a.b.a.a.o("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.w(1);
        if (this.mView != null) {
            q0 q0Var = this.mViewLifecycleOwner;
            q0Var.c();
            if (q0Var.f2770g.b.isAtLeast(Lifecycle.State.CREATED)) {
                this.mViewLifecycleOwner.a(Lifecycle.Event.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            b.C0055b c0055b = ((e.t.a.b) e.t.a.a.b(this)).b;
            int g2 = c0055b.c.g();
            for (int i2 = 0; i2 < g2; i2++) {
                Objects.requireNonNull(c0055b.c.h(i2));
            }
            this.mPerformedCreateView = false;
            return;
        }
        throw new u0(f.a.b.a.a.o("Fragment ", this, " did not call through to super.onDestroyView()"));
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            FragmentManager fragmentManager = this.mChildFragmentManager;
            if (fragmentManager.D) {
                return;
            }
            fragmentManager.o();
            this.mChildFragmentManager = new z();
            return;
        }
        throw new u0(f.a.b.a.a.o("Fragment ", this, " did not call through to super.onDetach()"));
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
        this.mChildFragmentManager.p();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
        this.mChildFragmentManager.q(z);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.r(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.s(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.w(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(Lifecycle.Event.ON_PAUSE);
        }
        this.mLifecycleRegistry.e(Lifecycle.Event.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new u0(f.a.b.a.a.o("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
        this.mChildFragmentManager.u(z);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onPrepareOptionsMenu(menu);
        }
        return z | this.mChildFragmentManager.v(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean S = this.mFragmentManager.S(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != S) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(S);
            onPrimaryNavigationFragmentChanged(S);
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.o0();
            fragmentManager.t(fragmentManager.t);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.W();
        this.mChildFragmentManager.C(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            n nVar = this.mLifecycleRegistry;
            Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
            nVar.e(event);
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(event);
            }
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.B = false;
            fragmentManager.C = false;
            fragmentManager.J.f2677h = false;
            fragmentManager.w(7);
            return;
        }
        throw new u0(f.a.b.a.a.o("Fragment ", this, " did not call through to super.onResume()"));
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.b(bundle);
        Parcelable f0 = this.mChildFragmentManager.f0();
        if (f0 != null) {
            bundle.putParcelable("android:support:fragments", f0);
        }
    }

    public void performStart() {
        this.mChildFragmentManager.W();
        this.mChildFragmentManager.C(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            n nVar = this.mLifecycleRegistry;
            Lifecycle.Event event = Lifecycle.Event.ON_START;
            nVar.e(event);
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(event);
            }
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.B = false;
            fragmentManager.C = false;
            fragmentManager.J.f2677h = false;
            fragmentManager.w(5);
            return;
        }
        throw new u0(f.a.b.a.a.o("Fragment ", this, " did not call through to super.onStart()"));
    }

    public void performStop() {
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.C = true;
        fragmentManager.J.f2677h = true;
        fragmentManager.w(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(Lifecycle.Event.ON_STOP);
        }
        this.mLifecycleRegistry.e(Lifecycle.Event.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new u0(f.a.b.a.a.o("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.w(2);
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().w = true;
    }

    public final <I, O> e.a.e.b<I> registerForActivityResult(e.a.e.d.a<I, O> aVar, e.a.e.a<O> aVar2) {
        return prepareCallInternal(aVar, new e(), aVar2);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i2) {
        if (this.mHost != null) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.y != null) {
                parentFragmentManager.z.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i2));
                parentFragmentManager.y.a(strArr, null);
                return;
            }
            Objects.requireNonNull(parentFragmentManager.q);
            return;
        }
        throw new IllegalStateException(f.a.b.a.a.o("Fragment ", this, " not attached to Activity"));
    }

    public final e.p.c.n requireActivity() {
        e.p.c.n activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(f.a.b.a.a.o("Fragment ", this, " not attached to an activity."));
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(f.a.b.a.a.o("Fragment ", this, " does not have any arguments."));
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(f.a.b.a.a.o("Fragment ", this, " not attached to a context."));
    }

    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(f.a.b.a.a.o("Fragment ", this, " not attached to a host."));
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            if (getContext() == null) {
                throw new IllegalStateException(f.a.b.a.a.o("Fragment ", this, " is not attached to any Fragment or host"));
            }
            throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
        }
        return parentFragment;
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(f.a.b.a.a.o("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.mChildFragmentManager.e0(parcelable);
        this.mChildFragmentManager.m();
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            q0 q0Var = this.mViewLifecycleOwner;
            q0Var.f2771h.a(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(Lifecycle.Event.ON_CREATE);
                return;
            }
            return;
        }
        throw new u0(f.a.b.a.a.o("Fragment ", this, " did not call through to super.onViewStateRestored()"));
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().r = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().q = Boolean.valueOf(z);
    }

    public void setAnimatingAway(View view) {
        ensureAnimationInfo().a = view;
    }

    public void setAnimations(int i2, int i3, int i4, int i5) {
        if (this.mAnimationInfo == null && i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            return;
        }
        ensureAnimationInfo().f384d = i2;
        ensureAnimationInfo().f385e = i3;
        ensureAnimationInfo().f386f = i4;
        ensureAnimationInfo().f387g = i5;
    }

    public void setAnimator(Animator animator) {
        ensureAnimationInfo().b = animator;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(SharedElementCallback sharedElementCallback) {
        ensureAnimationInfo().s = sharedElementCallback;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().f391k = obj;
    }

    public void setExitSharedElementCallback(SharedElementCallback sharedElementCallback) {
        ensureAnimationInfo().t = sharedElementCallback;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().f393m = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().v = view;
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.j();
        }
    }

    public void setHideReplaced(boolean z) {
        ensureAnimationInfo().y = z;
    }

    public void setInitialSavedState(SavedState savedState) {
        if (this.mFragmentManager == null) {
            this.mSavedFragmentState = (savedState == null || (r2 = savedState.f378f) == null) ? null : null;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.j();
            }
        }
    }

    public void setNextTransition(int i2) {
        if (this.mAnimationInfo == null && i2 == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f388h = i2;
    }

    public void setOnStartEnterTransitionListener(k kVar) {
        ensureAnimationInfo();
        i iVar = this.mAnimationInfo;
        k kVar2 = iVar.x;
        if (kVar == kVar2) {
            return;
        }
        if (kVar != null && kVar2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (iVar.w) {
            iVar.x = kVar;
        }
        if (kVar != null) {
            ((FragmentManager.n) kVar).c++;
        }
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().c = z;
    }

    public void setPostOnViewCreatedAlpha(float f2) {
        ensureAnimationInfo().u = f2;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().n = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        this.mRetainInstance = z;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            fragmentManager.J.d(this);
        } else {
            fragmentManager.J.e(this);
        }
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().f392l = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().o = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        i iVar = this.mAnimationInfo;
        iVar.f389i = arrayList;
        iVar.f390j = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().p = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i2) {
        FragmentManager fragmentManager = this.mFragmentManager;
        FragmentManager fragmentManager2 = fragment != null ? fragment.mFragmentManager : null;
        if (fragmentManager != null && fragmentManager2 != null && fragmentManager != fragmentManager2) {
            throw new IllegalArgumentException(f.a.b.a.a.o("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getTargetFragment()) {
            if (fragment2.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager != null && fragment.mFragmentManager != null) {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        } else {
            this.mTargetWho = null;
            this.mTarget = fragment;
        }
        this.mTargetRequestCode = i2;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            fragmentManager.X(fragmentManager.h(this));
        }
        this.mUserVisibleHint = z;
        this.mDeferStart = this.mState < 5 && !z;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        w<?> wVar = this.mHost;
        if (wVar != null) {
            return wVar.i(str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i2) {
        startActivityForResult(intent, i2, null);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        Intent intent2 = intent;
        if (this.mHost != null) {
            if (FragmentManager.P(2)) {
                Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i2 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
            }
            FragmentManager parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.x != null) {
                if (bundle != null) {
                    if (intent2 == null) {
                        intent2 = new Intent();
                        intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                    }
                    if (FragmentManager.P(2)) {
                        Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + this);
                    }
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                }
                IntentSenderRequest intentSenderRequest = new IntentSenderRequest(intentSender, intent2, i3, i4);
                parentFragmentManager.z.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i2));
                if (FragmentManager.P(2)) {
                    Log.v("FragmentManager", "Fragment " + this + "is launching an IntentSender for result ");
                }
                parentFragmentManager.x.a(intentSenderRequest, null);
                return;
            }
            w<?> wVar = parentFragmentManager.q;
            Objects.requireNonNull(wVar);
            if (i2 == -1) {
                ActivityCompat.startIntentSenderForResult(wVar.f2799f, intentSender, i2, intent, i3, i4, i5, bundle);
                return;
            }
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        throw new IllegalStateException(f.a.b.a.a.o("Fragment ", this, " not attached to Activity"));
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().w) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().w = false;
        } else if (Looper.myLooper() != this.mHost.f2801h.getLooper()) {
            this.mHost.f2801h.postAtFrontOfQueue(new b());
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: f  reason: collision with root package name */
        public final Bundle f378f;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(Bundle bundle) {
            this.f378f = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeBundle(this.f378f);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f378f = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment newInstance = v.c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.setArguments(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e2) {
            throw new InstantiationException(f.a.b.a.a.q("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (java.lang.InstantiationException e3) {
            throw new InstantiationException(f.a.b.a.a.q("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (NoSuchMethodException e4) {
            throw new InstantiationException(f.a.b.a.a.q("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e4);
        } catch (InvocationTargetException e5) {
            throw new InstantiationException(f.a.b.a.a.q("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e5);
        }
    }

    public final String getString(int i2, Object... objArr) {
        return getResources().getString(i2, objArr);
    }

    public final void postponeEnterTransition(long j2, TimeUnit timeUnit) {
        Handler handler;
        ensureAnimationInfo().w = true;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            handler = fragmentManager.q.f2801h;
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        handler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j2));
    }

    public final <I, O> e.a.e.b<I> registerForActivityResult(e.a.e.d.a<I, O> aVar, ActivityResultRegistry activityResultRegistry, e.a.e.a<O> aVar2) {
        return prepareCallInternal(aVar, new f(this, activityResultRegistry), aVar2);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        w<?> wVar = this.mHost;
        if (wVar != null) {
            e.i.c.a.startActivity(wVar.f2800g, intent, bundle);
            return;
        }
        throw new IllegalStateException(f.a.b.a.a.o("Fragment ", this, " not attached to Activity"));
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i2, Bundle bundle) {
        if (this.mHost != null) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.w != null) {
                parentFragmentManager.z.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i2));
                if (intent != null && bundle != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                }
                parentFragmentManager.w.a(intent, null);
                return;
            }
            w<?> wVar = parentFragmentManager.q;
            Objects.requireNonNull(wVar);
            if (i2 == -1) {
                e.i.c.a.startActivity(wVar.f2800g, intent, bundle);
                return;
            }
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        throw new IllegalStateException(f.a.b.a.a.o("Fragment ", this, " not attached to Activity"));
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        w<?> wVar = this.mHost;
        if (wVar != null) {
            LayoutInflater g2 = wVar.g();
            g2.setFactory2(this.mChildFragmentManager.f400f);
            return g2;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    private void restoreViewState() {
        if (FragmentManager.P(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }

    public Fragment(int i2) {
        this();
        this.mContentLayoutId = i2;
    }
}
