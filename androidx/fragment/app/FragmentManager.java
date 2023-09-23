package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.video_converter.video_compressor.R;
import e.p.c.a0;
import e.p.c.b0;
import e.p.c.c0;
import e.p.c.d0;
import e.p.c.e0;
import e.p.c.l0;
import e.p.c.r0;
import e.p.c.s0;
import e.p.c.t;
import e.p.c.t0;
import e.p.c.v;
import e.p.c.w;
import e.p.c.x;
import e.p.c.y;
import e.s.f0;
import e.s.h0;
import e.s.i0;
import e.s.j0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class FragmentManager {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public ArrayList<e.p.c.a> F;
    public ArrayList<Boolean> G;
    public ArrayList<Fragment> H;
    public ArrayList<n> I;
    public a0 J;
    public boolean b;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<e.p.c.a> f398d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<Fragment> f399e;

    /* renamed from: g  reason: collision with root package name */
    public OnBackPressedDispatcher f401g;
    public w<?> q;
    public t r;
    public Fragment s;
    public Fragment t;
    public e.a.e.b<Intent> w;
    public e.a.e.b<IntentSenderRequest> x;
    public e.a.e.b<String[]> y;
    public final ArrayList<l> a = new ArrayList<>();
    public final d0 c = new d0();

    /* renamed from: f  reason: collision with root package name */
    public final x f400f = new x(this);

    /* renamed from: h  reason: collision with root package name */
    public final e.a.b f402h = new c(false);

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f403i = new AtomicInteger();

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, Bundle> f404j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k  reason: collision with root package name */
    public final Map<String, Object> f405k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l  reason: collision with root package name */
    public Map<Fragment, HashSet<e.i.f.b>> f406l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m  reason: collision with root package name */
    public final l0.a f407m = new d();
    public final y n = new y(this);
    public final CopyOnWriteArrayList<b0> o = new CopyOnWriteArrayList<>();
    public int p = -1;
    public v u = new e();
    public t0 v = new f(this);
    public ArrayDeque<LaunchedFragmentInfo> z = new ArrayDeque<>();
    public Runnable K = new g();

    /* renamed from: androidx.fragment.app.FragmentManager$6  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass6 implements e.s.k {
        @Override // e.s.k
        public void d(e.s.m mVar, Lifecycle.Event event) {
            if (event != Lifecycle.Event.ON_START) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    throw null;
                }
                return;
            }
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public class a implements e.a.e.a<ActivityResult> {
        public a() {
        }

        @Override // e.a.e.a
        public void a(ActivityResult activityResult) {
            ActivityResult activityResult2 = activityResult;
            LaunchedFragmentInfo pollFirst = FragmentManager.this.z.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.f408f;
            int i2 = pollFirst.f409g;
            Fragment e2 = FragmentManager.this.c.e(str);
            if (e2 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            e2.onActivityResult(i2, activityResult2.f69f, activityResult2.f70g);
        }
    }

    /* loaded from: classes.dex */
    public class b implements e.a.e.a<Map<String, Boolean>> {
        public b() {
        }

        @Override // e.a.e.a
        public void a(Map<String, Boolean> map) {
            Map<String, Boolean> map2 = map;
            String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map2.values());
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo pollFirst = FragmentManager.this.z.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = pollFirst.f408f;
            int i3 = pollFirst.f409g;
            Fragment e2 = FragmentManager.this.c.e(str);
            if (e2 == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                return;
            }
            e2.onRequestPermissionsResult(i3, strArr, iArr);
        }
    }

    /* loaded from: classes.dex */
    public class c extends e.a.b {
        public c(boolean z) {
            super(z);
        }

        @Override // e.a.b
        public void a() {
            FragmentManager fragmentManager = FragmentManager.this;
            fragmentManager.C(true);
            if (fragmentManager.f402h.a) {
                fragmentManager.Z();
            } else {
                fragmentManager.f401g.a();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements l0.a {
        public d() {
        }

        public void a(Fragment fragment, e.i.f.b bVar) {
            boolean z;
            synchronized (bVar) {
                z = bVar.a;
            }
            if (z) {
                return;
            }
            FragmentManager fragmentManager = FragmentManager.this;
            HashSet<e.i.f.b> hashSet = fragmentManager.f406l.get(fragment);
            if (hashSet != null && hashSet.remove(bVar) && hashSet.isEmpty()) {
                fragmentManager.f406l.remove(fragment);
                if (fragment.mState < 5) {
                    fragmentManager.i(fragment);
                    fragmentManager.V(fragment, fragmentManager.p);
                }
            }
        }

        public void b(Fragment fragment, e.i.f.b bVar) {
            FragmentManager fragmentManager = FragmentManager.this;
            if (fragmentManager.f406l.get(fragment) == null) {
                fragmentManager.f406l.put(fragment, new HashSet<>());
            }
            fragmentManager.f406l.get(fragment).add(bVar);
        }
    }

    /* loaded from: classes.dex */
    public class e extends v {
        public e() {
        }

        @Override // e.p.c.v
        public Fragment a(ClassLoader classLoader, String str) {
            w<?> wVar = FragmentManager.this.q;
            Context context = wVar.f2800g;
            Objects.requireNonNull(wVar);
            return Fragment.instantiate(context, str, null);
        }
    }

    /* loaded from: classes.dex */
    public class f implements t0 {
        public f(FragmentManager fragmentManager) {
        }
    }

    /* loaded from: classes.dex */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.C(true);
        }
    }

    /* loaded from: classes.dex */
    public class h implements b0 {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f411f;

        public h(FragmentManager fragmentManager, Fragment fragment) {
            this.f411f = fragment;
        }

        @Override // e.p.c.b0
        public void a(FragmentManager fragmentManager, Fragment fragment) {
            this.f411f.onAttachFragment(fragment);
        }
    }

    /* loaded from: classes.dex */
    public class i implements e.a.e.a<ActivityResult> {
        public i() {
        }

        @Override // e.a.e.a
        public void a(ActivityResult activityResult) {
            ActivityResult activityResult2 = activityResult;
            LaunchedFragmentInfo pollFirst = FragmentManager.this.z.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.f408f;
            int i2 = pollFirst.f409g;
            Fragment e2 = FragmentManager.this.c.e(str);
            if (e2 == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                return;
            }
            e2.onActivityResult(i2, activityResult2.f69f, activityResult2.f70g);
        }
    }

    /* loaded from: classes.dex */
    public static class j extends e.a.e.d.a<IntentSenderRequest, ActivityResult> {
        @Override // e.a.e.d.a
        public Intent a(Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            IntentSenderRequest intentSenderRequest2 = intentSenderRequest;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = intentSenderRequest2.f83g;
            if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest2 = new IntentSenderRequest(intentSenderRequest2.f82f, null, intentSenderRequest2.f84h, intentSenderRequest2.f85i);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest2);
            if (FragmentManager.P(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // e.a.e.d.a
        public ActivityResult c(int i2, Intent intent) {
            return new ActivityResult(i2, intent);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class k {
    }

    /* loaded from: classes.dex */
    public interface l {
        boolean a(ArrayList<e.p.c.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* loaded from: classes.dex */
    public class m implements l {
        public final String a;
        public final int b;
        public final int c;

        public m(String str, int i2, int i3) {
            this.a = str;
            this.b = i2;
            this.c = i3;
        }

        @Override // androidx.fragment.app.FragmentManager.l
        public boolean a(ArrayList<e.p.c.a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.t;
            if (fragment == null || this.b >= 0 || this.a != null || !fragment.getChildFragmentManager().Z()) {
                return FragmentManager.this.b0(arrayList, arrayList2, this.a, this.b, this.c);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class n implements Fragment.k {
        public final boolean a;
        public final e.p.c.a b;
        public int c;

        public void a() {
            boolean z = this.c > 0;
            for (Fragment fragment : this.b.q.M()) {
                fragment.setOnStartEnterTransitionListener(null);
                if (z && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            e.p.c.a aVar = this.b;
            aVar.q.g(aVar, this.a, !z, true);
        }
    }

    public static boolean P(int i2) {
        return Log.isLoggable("FragmentManager", i2);
    }

    public void A(l lVar, boolean z) {
        if (!z) {
            if (this.q == null) {
                if (this.D) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (T()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.a) {
            if (this.q == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            this.a.add(lVar);
            g0();
        }
    }

    public final void B(boolean z) {
        if (!this.b) {
            if (this.q == null) {
                if (this.D) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (Looper.myLooper() == this.q.f2801h.getLooper()) {
                if (!z && T()) {
                    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                }
                if (this.F == null) {
                    this.F = new ArrayList<>();
                    this.G = new ArrayList<>();
                }
                this.b = true;
                try {
                    F(null, null);
                    return;
                } finally {
                    this.b = false;
                }
            } else {
                throw new IllegalStateException("Must be called from main thread of fragment host");
            }
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    public boolean C(boolean z) {
        boolean z2;
        B(z);
        boolean z3 = false;
        while (true) {
            ArrayList<e.p.c.a> arrayList = this.F;
            ArrayList<Boolean> arrayList2 = this.G;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    z2 = false;
                } else {
                    int size = this.a.size();
                    z2 = false;
                    for (int i2 = 0; i2 < size; i2++) {
                        z2 |= this.a.get(i2).a(arrayList, arrayList2);
                    }
                    this.a.clear();
                    this.q.f2801h.removeCallbacks(this.K);
                }
            }
            if (z2) {
                this.b = true;
                try {
                    d0(this.F, this.G);
                    e();
                    z3 = true;
                } catch (Throwable th) {
                    e();
                    throw th;
                }
            } else {
                o0();
                x();
                this.c.b();
                return z3;
            }
        }
    }

    public void D(l lVar, boolean z) {
        if (z && (this.q == null || this.D)) {
            return;
        }
        B(z);
        ((e.p.c.a) lVar).a(this.F, this.G);
        this.b = true;
        try {
            d0(this.F, this.G);
            e();
            o0();
            x();
            this.c.b();
        } catch (Throwable th) {
            e();
            throw th;
        }
    }

    public final void E(ArrayList<e.p.c.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ViewGroup viewGroup;
        int i4;
        int i5;
        ArrayList<Boolean> arrayList3 = arrayList2;
        boolean z = arrayList.get(i2).p;
        ArrayList<Fragment> arrayList4 = this.H;
        if (arrayList4 == null) {
            this.H = new ArrayList<>();
        } else {
            arrayList4.clear();
        }
        this.H.addAll(this.c.i());
        Fragment fragment = this.t;
        int i6 = i2;
        boolean z2 = false;
        while (true) {
            int i7 = 1;
            if (i6 < i3) {
                e.p.c.a aVar = arrayList.get(i6);
                int i8 = 3;
                if (!arrayList3.get(i6).booleanValue()) {
                    ArrayList<Fragment> arrayList5 = this.H;
                    int i9 = 0;
                    while (i9 < aVar.a.size()) {
                        e0.a aVar2 = aVar.a.get(i9);
                        int i10 = aVar2.a;
                        if (i10 != i7) {
                            if (i10 != 2) {
                                if (i10 == i8 || i10 == 6) {
                                    arrayList5.remove(aVar2.b);
                                    Fragment fragment2 = aVar2.b;
                                    if (fragment2 == fragment) {
                                        aVar.a.add(i9, new e0.a(9, fragment2));
                                        i9++;
                                        i4 = 1;
                                        fragment = null;
                                        i9 += i4;
                                        i7 = 1;
                                        i8 = 3;
                                    }
                                } else if (i10 != 7) {
                                    if (i10 == 8) {
                                        aVar.a.add(i9, new e0.a(9, fragment));
                                        i9++;
                                        fragment = aVar2.b;
                                    }
                                }
                                i4 = 1;
                                i9 += i4;
                                i7 = 1;
                                i8 = 3;
                            } else {
                                Fragment fragment3 = aVar2.b;
                                int i11 = fragment3.mContainerId;
                                int size = arrayList5.size() - 1;
                                boolean z3 = false;
                                while (size >= 0) {
                                    Fragment fragment4 = arrayList5.get(size);
                                    if (fragment4.mContainerId != i11) {
                                        i5 = i11;
                                    } else if (fragment4 == fragment3) {
                                        i5 = i11;
                                        z3 = true;
                                    } else {
                                        if (fragment4 == fragment) {
                                            i5 = i11;
                                            aVar.a.add(i9, new e0.a(9, fragment4));
                                            i9++;
                                            fragment = null;
                                        } else {
                                            i5 = i11;
                                        }
                                        e0.a aVar3 = new e0.a(3, fragment4);
                                        aVar3.c = aVar2.c;
                                        aVar3.f2702e = aVar2.f2702e;
                                        aVar3.f2701d = aVar2.f2701d;
                                        aVar3.f2703f = aVar2.f2703f;
                                        aVar.a.add(i9, aVar3);
                                        arrayList5.remove(fragment4);
                                        i9++;
                                    }
                                    size--;
                                    i11 = i5;
                                }
                                if (z3) {
                                    aVar.a.remove(i9);
                                    i9--;
                                    i4 = 1;
                                    i9 += i4;
                                    i7 = 1;
                                    i8 = 3;
                                } else {
                                    i4 = 1;
                                    aVar2.a = 1;
                                    arrayList5.add(fragment3);
                                    i9 += i4;
                                    i7 = 1;
                                    i8 = 3;
                                }
                            }
                        }
                        i4 = 1;
                        arrayList5.add(aVar2.b);
                        i9 += i4;
                        i7 = 1;
                        i8 = 3;
                    }
                } else {
                    int i12 = 1;
                    ArrayList<Fragment> arrayList6 = this.H;
                    int size2 = aVar.a.size() - 1;
                    while (size2 >= 0) {
                        e0.a aVar4 = aVar.a.get(size2);
                        int i13 = aVar4.a;
                        if (i13 != i12) {
                            if (i13 != 3) {
                                switch (i13) {
                                    case 8:
                                        fragment = null;
                                        break;
                                    case 9:
                                        fragment = aVar4.b;
                                        break;
                                    case 10:
                                        aVar4.f2705h = aVar4.f2704g;
                                        break;
                                }
                                size2--;
                                i12 = 1;
                            }
                            arrayList6.add(aVar4.b);
                            size2--;
                            i12 = 1;
                        }
                        arrayList6.remove(aVar4.b);
                        size2--;
                        i12 = 1;
                    }
                }
                z2 = z2 || aVar.f2694g;
                i6++;
                arrayList3 = arrayList2;
            } else {
                this.H.clear();
                if (!z && this.p >= 1) {
                    for (int i14 = i2; i14 < i3; i14++) {
                        Iterator<e0.a> it = arrayList.get(i14).a.iterator();
                        while (it.hasNext()) {
                            Fragment fragment5 = it.next().b;
                            if (fragment5 != null && fragment5.mFragmentManager != null) {
                                this.c.j(h(fragment5));
                            }
                        }
                    }
                }
                int i15 = i2;
                while (i15 < i3) {
                    e.p.c.a aVar5 = arrayList.get(i15);
                    if (arrayList2.get(i15).booleanValue()) {
                        aVar5.i(-1);
                        aVar5.n(i15 == i3 + (-1));
                    } else {
                        aVar5.i(1);
                        aVar5.m();
                    }
                    i15++;
                }
                boolean booleanValue = arrayList2.get(i3 - 1).booleanValue();
                for (int i16 = i2; i16 < i3; i16++) {
                    e.p.c.a aVar6 = arrayList.get(i16);
                    if (booleanValue) {
                        for (int size3 = aVar6.a.size() - 1; size3 >= 0; size3--) {
                            Fragment fragment6 = aVar6.a.get(size3).b;
                            if (fragment6 != null) {
                                h(fragment6).k();
                            }
                        }
                    } else {
                        Iterator<e0.a> it2 = aVar6.a.iterator();
                        while (it2.hasNext()) {
                            Fragment fragment7 = it2.next().b;
                            if (fragment7 != null) {
                                h(fragment7).k();
                            }
                        }
                    }
                }
                U(this.p, true);
                HashSet hashSet = new HashSet();
                for (int i17 = i2; i17 < i3; i17++) {
                    Iterator<e0.a> it3 = arrayList.get(i17).a.iterator();
                    while (it3.hasNext()) {
                        Fragment fragment8 = it3.next().b;
                        if (fragment8 != null && (viewGroup = fragment8.mContainer) != null) {
                            hashSet.add(s0.g(viewGroup, N()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    s0 s0Var = (s0) it4.next();
                    s0Var.f2779d = booleanValue;
                    s0Var.h();
                    s0Var.c();
                }
                for (int i18 = i2; i18 < i3; i18++) {
                    e.p.c.a aVar7 = arrayList.get(i18);
                    if (arrayList2.get(i18).booleanValue() && aVar7.s >= 0) {
                        aVar7.s = -1;
                    }
                    Objects.requireNonNull(aVar7);
                }
                return;
            }
        }
    }

    public final void F(ArrayList<e.p.c.a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<n> arrayList3 = this.I;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            n nVar = this.I.get(i2);
            if (arrayList != null && !nVar.a && (indexOf2 = arrayList.indexOf(nVar.b)) != -1 && arrayList2 != null && arrayList2.get(indexOf2).booleanValue()) {
                this.I.remove(i2);
                i2--;
                size--;
                e.p.c.a aVar = nVar.b;
                aVar.q.g(aVar, nVar.a, false, false);
            } else {
                if ((nVar.c == 0) || (arrayList != null && nVar.b.p(arrayList, 0, arrayList.size()))) {
                    this.I.remove(i2);
                    i2--;
                    size--;
                    if (arrayList != null && !nVar.a && (indexOf = arrayList.indexOf(nVar.b)) != -1 && arrayList2 != null && arrayList2.get(indexOf).booleanValue()) {
                        e.p.c.a aVar2 = nVar.b;
                        aVar2.q.g(aVar2, nVar.a, false, false);
                    } else {
                        nVar.a();
                    }
                }
            }
            i2++;
        }
    }

    public Fragment G(String str) {
        return this.c.d(str);
    }

    public Fragment H(int i2) {
        d0 d0Var = this.c;
        int size = d0Var.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = d0Var.a.get(size);
                if (fragment != null && fragment.mFragmentId == i2) {
                    return fragment;
                }
            } else {
                for (c0 c0Var : d0Var.b.values()) {
                    if (c0Var != null) {
                        Fragment fragment2 = c0Var.c;
                        if (fragment2.mFragmentId == i2) {
                            return fragment2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public Fragment I(String str) {
        d0 d0Var = this.c;
        Objects.requireNonNull(d0Var);
        if (str != null) {
            int size = d0Var.a.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                Fragment fragment = d0Var.a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (c0 c0Var : d0Var.b.values()) {
                if (c0Var != null) {
                    Fragment fragment2 = c0Var.c;
                    if (str.equals(fragment2.mTag)) {
                        return fragment2;
                    }
                }
            }
        }
        return null;
    }

    public int J() {
        ArrayList<e.p.c.a> arrayList = this.f398d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public final ViewGroup K(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.r.d()) {
            View c2 = this.r.c(fragment.mContainerId);
            if (c2 instanceof ViewGroup) {
                return (ViewGroup) c2;
            }
        }
        return null;
    }

    public v L() {
        Fragment fragment = this.s;
        if (fragment != null) {
            return fragment.mFragmentManager.L();
        }
        return this.u;
    }

    public List<Fragment> M() {
        return this.c.i();
    }

    public t0 N() {
        Fragment fragment = this.s;
        if (fragment != null) {
            return fragment.mFragmentManager.N();
        }
        return this.v;
    }

    public void O(Fragment fragment) {
        if (P(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        k0(fragment);
    }

    public final boolean Q(Fragment fragment) {
        boolean z;
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mChildFragmentManager;
        Iterator it = ((ArrayList) fragmentManager.c.g()).iterator();
        boolean z2 = false;
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Fragment fragment2 = (Fragment) it.next();
            if (fragment2 != null) {
                z2 = fragmentManager.Q(fragment2);
                continue;
            }
            if (z2) {
                z = true;
                break;
            }
        }
        return z;
    }

    public boolean R(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    public boolean S(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.t) && S(fragmentManager.s);
    }

    public boolean T() {
        return this.B || this.C;
    }

    public void U(int i2, boolean z) {
        w<?> wVar;
        if (this.q == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i2 != this.p) {
            this.p = i2;
            d0 d0Var = this.c;
            Iterator<Fragment> it = d0Var.a.iterator();
            while (it.hasNext()) {
                c0 c0Var = d0Var.b.get(it.next().mWho);
                if (c0Var != null) {
                    c0Var.k();
                }
            }
            Iterator<c0> it2 = d0Var.b.values().iterator();
            while (true) {
                boolean z2 = false;
                if (!it2.hasNext()) {
                    break;
                }
                c0 next = it2.next();
                if (next != null) {
                    next.k();
                    Fragment fragment = next.c;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        z2 = true;
                    }
                    if (z2) {
                        d0Var.k(next);
                    }
                }
            }
            m0();
            if (this.A && (wVar = this.q) != null && this.p == 7) {
                wVar.j();
                this.A = false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
        if (r1 != 5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void V(androidx.fragment.app.Fragment r17, int r18) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.V(androidx.fragment.app.Fragment, int):void");
    }

    public void W() {
        if (this.q == null) {
            return;
        }
        this.B = false;
        this.C = false;
        this.J.f2677h = false;
        for (Fragment fragment : this.c.i()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public void X(c0 c0Var) {
        Fragment fragment = c0Var.c;
        if (fragment.mDeferStart) {
            if (this.b) {
                this.E = true;
                return;
            }
            fragment.mDeferStart = false;
            c0Var.k();
        }
    }

    public void Y() {
        A(new m(null, -1, 0), false);
    }

    public boolean Z() {
        return a0(null, -1, 0);
    }

    public c0 a(Fragment fragment) {
        if (P(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        c0 h2 = h(fragment);
        fragment.mFragmentManager = this;
        this.c.j(h2);
        if (!fragment.mDetached) {
            this.c.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (Q(fragment)) {
                this.A = true;
            }
        }
        return h2;
    }

    public final boolean a0(String str, int i2, int i3) {
        C(false);
        B(true);
        Fragment fragment = this.t;
        if (fragment == null || i2 >= 0 || str != null || !fragment.getChildFragmentManager().Z()) {
            boolean b0 = b0(this.F, this.G, str, i2, i3);
            if (b0) {
                this.b = true;
                try {
                    d0(this.F, this.G);
                } finally {
                    e();
                }
            }
            o0();
            x();
            this.c.b();
            return b0;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(w<?> wVar, t tVar, Fragment fragment) {
        if (this.q == null) {
            this.q = wVar;
            this.r = tVar;
            this.s = fragment;
            if (fragment != null) {
                this.o.add(new h(this, fragment));
            } else if (wVar instanceof b0) {
                this.o.add((b0) wVar);
            }
            if (this.s != null) {
                o0();
            }
            if (wVar instanceof e.a.c) {
                e.a.c cVar = (e.a.c) wVar;
                OnBackPressedDispatcher b2 = cVar.b();
                this.f401g = b2;
                Fragment fragment2 = cVar;
                if (fragment != null) {
                    fragment2 = fragment;
                }
                e.a.b bVar = this.f402h;
                Objects.requireNonNull(b2);
                Lifecycle lifecycle = fragment2.getLifecycle();
                if (((e.s.n) lifecycle).b != Lifecycle.State.DESTROYED) {
                    bVar.b.add(new OnBackPressedDispatcher.LifecycleOnBackPressedCancellable(lifecycle, bVar));
                }
            }
            if (fragment != null) {
                a0 a0Var = fragment.mFragmentManager.J;
                a0 a0Var2 = a0Var.f2673d.get(fragment.mWho);
                if (a0Var2 == null) {
                    a0Var2 = new a0(a0Var.f2675f);
                    a0Var.f2673d.put(fragment.mWho, a0Var2);
                }
                this.J = a0Var2;
            } else if (wVar instanceof j0) {
                i0 viewModelStore = ((j0) wVar).getViewModelStore();
                e.s.e0 e0Var = a0.f2672i;
                String canonicalName = a0.class.getCanonicalName();
                if (canonicalName != null) {
                    String p = f.a.b.a.a.p("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
                    e.s.b0 b0Var = viewModelStore.a.get(p);
                    if (a0.class.isInstance(b0Var)) {
                        if (e0Var instanceof h0) {
                            ((h0) e0Var).b(b0Var);
                        }
                    } else {
                        b0Var = e0Var instanceof f0 ? ((f0) e0Var).c(p, a0.class) : ((a0.a) e0Var).a(a0.class);
                        e.s.b0 put = viewModelStore.a.put(p, b0Var);
                        if (put != null) {
                            put.b();
                        }
                    }
                    this.J = (a0) b0Var;
                } else {
                    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                }
            } else {
                this.J = new a0(false);
            }
            this.J.f2677h = T();
            this.c.c = this.J;
            w<?> wVar2 = this.q;
            if (wVar2 instanceof e.a.e.c) {
                ActivityResultRegistry o = ((e.a.e.c) wVar2).o();
                String p2 = f.a.b.a.a.p("FragmentManager:", fragment != null ? f.a.b.a.a.u(new StringBuilder(), fragment.mWho, ":") : "");
                this.w = o.c(f.a.b.a.a.p(p2, "StartActivityForResult"), new e.a.e.d.e(), new i());
                this.x = o.c(f.a.b.a.a.p(p2, "StartIntentSenderForResult"), new j(), new a());
                this.y = o.c(f.a.b.a.a.p(p2, "RequestPermissions"), new e.a.e.d.d(), new b());
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public boolean b0(ArrayList<e.p.c.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        ArrayList<e.p.c.a> arrayList3 = this.f398d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f398d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            int i4 = -1;
            if (str != null || i2 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    e.p.c.a aVar = this.f398d.get(size2);
                    if ((str != null && str.equals(aVar.f2696i)) || (i2 >= 0 && i2 == aVar.s)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        e.p.c.a aVar2 = this.f398d.get(size2);
                        if (str == null || !str.equals(aVar2.f2696i)) {
                            if (i2 < 0 || i2 != aVar2.s) {
                                break;
                            }
                        }
                    }
                }
                i4 = size2;
            }
            if (i4 == this.f398d.size() - 1) {
                return false;
            }
            for (int size3 = this.f398d.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.f398d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    public void c(Fragment fragment) {
        if (P(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.c.a(fragment);
            if (P(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (Q(fragment)) {
                this.A = true;
            }
        }
    }

    public void c0(Fragment fragment) {
        if (P(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            this.c.l(fragment);
            if (Q(fragment)) {
                this.A = true;
            }
            fragment.mRemoving = true;
            k0(fragment);
        }
    }

    public final void d(Fragment fragment) {
        HashSet<e.i.f.b> hashSet = this.f406l.get(fragment);
        if (hashSet != null) {
            Iterator<e.i.f.b> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            hashSet.clear();
            i(fragment);
            this.f406l.remove(fragment);
        }
    }

    public final void d0(ArrayList<e.p.c.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            F(arrayList, arrayList2);
            int size = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                if (!arrayList.get(i2).p) {
                    if (i3 != i2) {
                        E(arrayList, arrayList2, i3, i2);
                    }
                    i3 = i2 + 1;
                    if (arrayList2.get(i2).booleanValue()) {
                        while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).p) {
                            i3++;
                        }
                    }
                    E(arrayList, arrayList2, i2, i3);
                    i2 = i3 - 1;
                }
                i2++;
            }
            if (i3 != size) {
                E(arrayList, arrayList2, i3, size);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    public final void e() {
        this.b = false;
        this.G.clear();
        this.F.clear();
    }

    public void e0(Parcelable parcelable) {
        c0 c0Var;
        if (parcelable == null) {
            return;
        }
        FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
        if (fragmentManagerState.f413f == null) {
            return;
        }
        this.c.b.clear();
        Iterator<FragmentState> it = fragmentManagerState.f413f.iterator();
        while (it.hasNext()) {
            FragmentState next = it.next();
            if (next != null) {
                a0 a0Var = this.J;
                Fragment fragment = a0Var.c.get(next.f422g);
                if (fragment != null) {
                    if (P(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
                    }
                    c0Var = new c0(this.n, this.c, fragment, next);
                } else {
                    c0Var = new c0(this.n, this.c, this.q.f2800g.getClassLoader(), L(), next);
                }
                Fragment fragment2 = c0Var.c;
                fragment2.mFragmentManager = this;
                if (P(2)) {
                    StringBuilder A = f.a.b.a.a.A("restoreSaveState: active (");
                    A.append(fragment2.mWho);
                    A.append("): ");
                    A.append(fragment2);
                    Log.v("FragmentManager", A.toString());
                }
                c0Var.m(this.q.f2800g.getClassLoader());
                this.c.j(c0Var);
                c0Var.f2688e = this.p;
            }
        }
        a0 a0Var2 = this.J;
        Objects.requireNonNull(a0Var2);
        Iterator it2 = new ArrayList(a0Var2.c.values()).iterator();
        while (it2.hasNext()) {
            Fragment fragment3 = (Fragment) it2.next();
            if (!this.c.c(fragment3.mWho)) {
                if (P(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + fragmentManagerState.f413f);
                }
                this.J.e(fragment3);
                fragment3.mFragmentManager = this;
                c0 c0Var2 = new c0(this.n, this.c, fragment3);
                c0Var2.f2688e = 1;
                c0Var2.k();
                fragment3.mRemoving = true;
                c0Var2.k();
            }
        }
        d0 d0Var = this.c;
        ArrayList<String> arrayList = fragmentManagerState.f414g;
        d0Var.a.clear();
        if (arrayList != null) {
            for (String str : arrayList) {
                Fragment d2 = d0Var.d(str);
                if (d2 != null) {
                    if (P(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + d2);
                    }
                    d0Var.a(d2);
                } else {
                    throw new IllegalStateException(f.a.b.a.a.q("No instantiated fragment for (", str, ")"));
                }
            }
        }
        Fragment fragment4 = null;
        if (fragmentManagerState.f415h != null) {
            this.f398d = new ArrayList<>(fragmentManagerState.f415h.length);
            int i2 = 0;
            while (true) {
                BackStackState[] backStackStateArr = fragmentManagerState.f415h;
                if (i2 >= backStackStateArr.length) {
                    break;
                }
                BackStackState backStackState = backStackStateArr[i2];
                Objects.requireNonNull(backStackState);
                e.p.c.a aVar = new e.p.c.a(this);
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int[] iArr = backStackState.f369f;
                    if (i3 >= iArr.length) {
                        break;
                    }
                    e0.a aVar2 = new e0.a();
                    int i5 = i3 + 1;
                    aVar2.a = iArr[i3];
                    if (P(2)) {
                        Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i4 + " base fragment #" + backStackState.f369f[i5]);
                    }
                    String str2 = backStackState.f370g.get(i4);
                    if (str2 != null) {
                        aVar2.b = this.c.d(str2);
                    } else {
                        aVar2.b = fragment4;
                    }
                    aVar2.f2704g = Lifecycle.State.values()[backStackState.f371h[i4]];
                    aVar2.f2705h = Lifecycle.State.values()[backStackState.f372i[i4]];
                    int[] iArr2 = backStackState.f369f;
                    int i6 = i5 + 1;
                    int i7 = iArr2[i5];
                    aVar2.c = i7;
                    int i8 = i6 + 1;
                    int i9 = iArr2[i6];
                    aVar2.f2701d = i9;
                    int i10 = i8 + 1;
                    int i11 = iArr2[i8];
                    aVar2.f2702e = i11;
                    int i12 = iArr2[i10];
                    aVar2.f2703f = i12;
                    aVar.b = i7;
                    aVar.c = i9;
                    aVar.f2691d = i11;
                    aVar.f2692e = i12;
                    aVar.b(aVar2);
                    i4++;
                    fragment4 = null;
                    i3 = i10 + 1;
                }
                aVar.f2693f = backStackState.f373j;
                aVar.f2696i = backStackState.f374k;
                aVar.s = backStackState.f375l;
                aVar.f2694g = true;
                aVar.f2697j = backStackState.f376m;
                aVar.f2698k = backStackState.n;
                aVar.f2699l = backStackState.o;
                aVar.f2700m = backStackState.p;
                aVar.n = backStackState.q;
                aVar.o = backStackState.r;
                aVar.p = backStackState.s;
                aVar.i(1);
                if (P(2)) {
                    StringBuilder B = f.a.b.a.a.B("restoreAllState: back stack #", i2, " (index ");
                    B.append(aVar.s);
                    B.append("): ");
                    B.append(aVar);
                    Log.v("FragmentManager", B.toString());
                    PrintWriter printWriter = new PrintWriter(new r0("FragmentManager"));
                    aVar.l("  ", printWriter, false);
                    printWriter.close();
                }
                this.f398d.add(aVar);
                i2++;
                fragment4 = null;
            }
        } else {
            this.f398d = null;
        }
        this.f403i.set(fragmentManagerState.f416i);
        String str3 = fragmentManagerState.f417j;
        if (str3 != null) {
            Fragment G = G(str3);
            this.t = G;
            t(G);
        }
        ArrayList<String> arrayList2 = fragmentManagerState.f418k;
        if (arrayList2 != null) {
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                Bundle bundle = fragmentManagerState.f419l.get(i13);
                bundle.setClassLoader(this.q.f2800g.getClassLoader());
                this.f404j.put(arrayList2.get(i13), bundle);
            }
        }
        this.z = new ArrayDeque<>(fragmentManagerState.f420m);
    }

    public final Set<s0> f() {
        HashSet hashSet = new HashSet();
        Iterator it = ((ArrayList) this.c.f()).iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((c0) it.next()).c.mContainer;
            if (viewGroup != null) {
                hashSet.add(s0.g(viewGroup, N()));
            }
        }
        return hashSet;
    }

    public Parcelable f0() {
        int i2;
        ArrayList<String> arrayList;
        int size;
        Iterator it = ((HashSet) f()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            s0 s0Var = (s0) it.next();
            if (s0Var.f2780e) {
                s0Var.f2780e = false;
                s0Var.c();
            }
        }
        z();
        C(true);
        this.B = true;
        this.J.f2677h = true;
        d0 d0Var = this.c;
        Objects.requireNonNull(d0Var);
        ArrayList<FragmentState> arrayList2 = new ArrayList<>(d0Var.b.size());
        for (c0 c0Var : d0Var.b.values()) {
            if (c0Var != null) {
                Fragment fragment = c0Var.c;
                FragmentState fragmentState = new FragmentState(fragment);
                Fragment fragment2 = c0Var.c;
                if (fragment2.mState > -1 && fragmentState.r == null) {
                    Bundle o = c0Var.o();
                    fragmentState.r = o;
                    if (c0Var.c.mTargetWho != null) {
                        if (o == null) {
                            fragmentState.r = new Bundle();
                        }
                        fragmentState.r.putString("android:target_state", c0Var.c.mTargetWho);
                        int i3 = c0Var.c.mTargetRequestCode;
                        if (i3 != 0) {
                            fragmentState.r.putInt("android:target_req_state", i3);
                        }
                    }
                } else {
                    fragmentState.r = fragment2.mSavedFragmentState;
                }
                arrayList2.add(fragmentState);
                if (P(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragmentState.r);
                }
            }
        }
        BackStackState[] backStackStateArr = null;
        if (arrayList2.isEmpty()) {
            if (P(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        d0 d0Var2 = this.c;
        synchronized (d0Var2.a) {
            if (d0Var2.a.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(d0Var2.a.size());
                Iterator<Fragment> it2 = d0Var2.a.iterator();
                while (it2.hasNext()) {
                    Fragment next = it2.next();
                    arrayList.add(next.mWho);
                    if (P(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + next.mWho + "): " + next);
                    }
                }
            }
        }
        ArrayList<e.p.c.a> arrayList3 = this.f398d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (i2 = 0; i2 < size; i2++) {
                backStackStateArr[i2] = new BackStackState(this.f398d.get(i2));
                if (P(2)) {
                    StringBuilder B = f.a.b.a.a.B("saveAllState: adding back stack #", i2, ": ");
                    B.append(this.f398d.get(i2));
                    Log.v("FragmentManager", B.toString());
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f413f = arrayList2;
        fragmentManagerState.f414g = arrayList;
        fragmentManagerState.f415h = backStackStateArr;
        fragmentManagerState.f416i = this.f403i.get();
        Fragment fragment3 = this.t;
        if (fragment3 != null) {
            fragmentManagerState.f417j = fragment3.mWho;
        }
        fragmentManagerState.f418k.addAll(this.f404j.keySet());
        fragmentManagerState.f419l.addAll(this.f404j.values());
        fragmentManagerState.f420m = new ArrayList<>(this.z);
        return fragmentManagerState;
    }

    public void g(e.p.c.a aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.n(z3);
        } else {
            aVar.m();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2 && this.p >= 1) {
            l0.r(this.q.f2800g, this.r, arrayList, arrayList2, 0, 1, true, this.f407m);
        }
        if (z3) {
            U(this.p, true);
        }
        Iterator it = ((ArrayList) this.c.g()).iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && aVar.o(fragment.mContainerId)) {
                float f2 = fragment.mPostponedAlpha;
                if (f2 > 0.0f) {
                    fragment.mView.setAlpha(f2);
                }
                if (z3) {
                    fragment.mPostponedAlpha = 0.0f;
                } else {
                    fragment.mPostponedAlpha = -1.0f;
                    fragment.mIsNewlyAdded = false;
                }
            }
        }
    }

    public void g0() {
        synchronized (this.a) {
            ArrayList<n> arrayList = this.I;
            boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
            boolean z2 = this.a.size() == 1;
            if (z || z2) {
                this.q.f2801h.removeCallbacks(this.K);
                this.q.f2801h.post(this.K);
                o0();
            }
        }
    }

    public c0 h(Fragment fragment) {
        c0 h2 = this.c.h(fragment.mWho);
        if (h2 != null) {
            return h2;
        }
        c0 c0Var = new c0(this.n, this.c, fragment);
        c0Var.m(this.q.f2800g.getClassLoader());
        c0Var.f2688e = this.p;
        return c0Var;
    }

    public void h0(Fragment fragment, boolean z) {
        ViewGroup K = K(fragment);
        if (K == null || !(K instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) K).setDrawDisappearingViewsLast(!z);
    }

    public final void i(Fragment fragment) {
        fragment.performDestroyView();
        this.n.n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.k(null);
        fragment.mInLayout = false;
    }

    public void i0(Fragment fragment, Lifecycle.State state) {
        if (fragment.equals(G(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = state;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void j(Fragment fragment) {
        if (P(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (P(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.c.l(fragment);
            if (Q(fragment)) {
                this.A = true;
            }
            k0(fragment);
        }
    }

    public void j0(Fragment fragment) {
        if (fragment != null && (!fragment.equals(G(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this))) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        Fragment fragment2 = this.t;
        this.t = fragment;
        t(fragment2);
        t(this.t);
    }

    public void k(Configuration configuration) {
        for (Fragment fragment : this.c.i()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    public final void k0(Fragment fragment) {
        ViewGroup K = K(fragment);
        if (K != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (K.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    K.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) K.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public boolean l(MenuItem menuItem) {
        if (this.p < 1) {
            return false;
        }
        for (Fragment fragment : this.c.i()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void l0(Fragment fragment) {
        if (P(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public void m() {
        this.B = false;
        this.C = false;
        this.J.f2677h = false;
        w(1);
    }

    public final void m0() {
        Iterator it = ((ArrayList) this.c.f()).iterator();
        while (it.hasNext()) {
            X((c0) it.next());
        }
    }

    public boolean n(Menu menu, MenuInflater menuInflater) {
        if (this.p < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.c.i()) {
            if (fragment != null && R(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f399e != null) {
            for (int i2 = 0; i2 < this.f399e.size(); i2++) {
                Fragment fragment2 = this.f399e.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f399e = arrayList;
        return z;
    }

    public final void n0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new r0("FragmentManager"));
        w<?> wVar = this.q;
        if (wVar != null) {
            try {
                wVar.e("  ", null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        } else {
            try {
                y("  ", null, printWriter, new String[0]);
            } catch (Exception e3) {
                Log.e("FragmentManager", "Failed dumping state", e3);
            }
        }
        throw runtimeException;
    }

    public void o() {
        this.D = true;
        C(true);
        z();
        w(-1);
        this.q = null;
        this.r = null;
        this.s = null;
        if (this.f401g != null) {
            Iterator<e.a.a> it = this.f402h.b.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            this.f401g = null;
        }
        e.a.e.b<Intent> bVar = this.w;
        if (bVar != null) {
            bVar.b();
            this.x.b();
            this.y.b();
        }
    }

    public final void o0() {
        synchronized (this.a) {
            boolean z = true;
            if (!this.a.isEmpty()) {
                this.f402h.a = true;
                return;
            }
            this.f402h.a = (J() <= 0 || !S(this.s)) ? false : false;
        }
    }

    public void p() {
        for (Fragment fragment : this.c.i()) {
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    public void q(boolean z) {
        for (Fragment fragment : this.c.i()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
            }
        }
    }

    public boolean r(MenuItem menuItem) {
        if (this.p < 1) {
            return false;
        }
        for (Fragment fragment : this.c.i()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void s(Menu menu) {
        if (this.p < 1) {
            return;
        }
        for (Fragment fragment : this.c.i()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void t(Fragment fragment) {
        if (fragment == null || !fragment.equals(G(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.s;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.s)));
            sb.append("}");
        } else {
            w<?> wVar = this.q;
            if (wVar != null) {
                sb.append(wVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.q)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public void u(boolean z) {
        for (Fragment fragment : this.c.i()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
            }
        }
    }

    public boolean v(Menu menu) {
        boolean z = false;
        if (this.p < 1) {
            return false;
        }
        for (Fragment fragment : this.c.i()) {
            if (fragment != null && R(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final void w(int i2) {
        try {
            this.b = true;
            for (c0 c0Var : this.c.b.values()) {
                if (c0Var != null) {
                    c0Var.f2688e = i2;
                }
            }
            U(i2, false);
            Iterator it = ((HashSet) f()).iterator();
            while (it.hasNext()) {
                ((s0) it.next()).e();
            }
            this.b = false;
            C(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void x() {
        if (this.E) {
            this.E = false;
            m0();
        }
    }

    public void y(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String p = f.a.b.a.a.p(str, "    ");
        d0 d0Var = this.c;
        Objects.requireNonNull(d0Var);
        String str2 = str + "    ";
        if (!d0Var.b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (c0 c0Var : d0Var.b.values()) {
                printWriter.print(str);
                if (c0Var != null) {
                    Fragment fragment = c0Var.c;
                    printWriter.println(fragment);
                    fragment.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = d0Var.a.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size3; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(d0Var.a.get(i2).toString());
            }
        }
        ArrayList<Fragment> arrayList = this.f399e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size2; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(this.f399e.get(i3).toString());
            }
        }
        ArrayList<e.p.c.a> arrayList2 = this.f398d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size; i4++) {
                e.p.c.a aVar = this.f398d.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.l(p, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f403i.get());
        synchronized (this.a) {
            int size4 = this.a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i5 = 0; i5 < size4; i5++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println((l) this.a.get(i5));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.q);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.r);
        if (this.s != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.s);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.p);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.B);
        printWriter.print(" mStopped=");
        printWriter.print(this.C);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.D);
        if (this.A) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.A);
        }
    }

    public final void z() {
        Iterator it = ((HashSet) f()).iterator();
        while (it.hasNext()) {
            ((s0) it.next()).e();
        }
    }

    /* loaded from: classes.dex */
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new a();

        /* renamed from: f  reason: collision with root package name */
        public String f408f;

        /* renamed from: g  reason: collision with root package name */
        public int f409g;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<LaunchedFragmentInfo> {
            @Override // android.os.Parcelable.Creator
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public LaunchedFragmentInfo[] newArray(int i2) {
                return new LaunchedFragmentInfo[i2];
            }
        }

        public LaunchedFragmentInfo(String str, int i2) {
            this.f408f = str;
            this.f409g = i2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f408f);
            parcel.writeInt(this.f409g);
        }

        public LaunchedFragmentInfo(Parcel parcel) {
            this.f408f = parcel.readString();
            this.f409g = parcel.readInt();
        }
    }
}
