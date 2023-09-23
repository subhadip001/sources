package e.p.c;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import e.p.c.e0;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: BackStackRecord.java */
/* loaded from: classes.dex */
public final class a extends e0 implements FragmentManager.l {
    public final FragmentManager q;
    public boolean r;
    public int s;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(androidx.fragment.app.FragmentManager r3) {
        /*
            r2 = this;
            e.p.c.v r0 = r3.L()
            e.p.c.w<?> r1 = r3.q
            if (r1 == 0) goto Lf
            android.content.Context r1 = r1.f2800g
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L10
        Lf:
            r1 = 0
        L10:
            r2.<init>(r0, r1)
            r0 = -1
            r2.s = r0
            r2.q = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.p.c.a.<init>(androidx.fragment.app.FragmentManager):void");
    }

    @Override // androidx.fragment.app.FragmentManager.l
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.P(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f2694g) {
            FragmentManager fragmentManager = this.q;
            if (fragmentManager.f398d == null) {
                fragmentManager.f398d = new ArrayList<>();
            }
            fragmentManager.f398d.add(this);
            return true;
        }
        return true;
    }

    @Override // e.p.c.e0
    public int d() {
        return j(false);
    }

    @Override // e.p.c.e0
    public int e() {
        return j(true);
    }

    @Override // e.p.c.e0
    public void f() {
        if (!this.f2694g) {
            this.f2695h = false;
            this.q.D(this, false);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    @Override // e.p.c.e0
    public void g(int i2, Fragment fragment, String str, int i3) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str2 = fragment.mTag;
                if (str2 != null && !str.equals(str2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Can't change tag of fragment ");
                    sb.append(fragment);
                    sb.append(": was ");
                    throw new IllegalStateException(f.a.b.a.a.v(sb, fragment.mTag, " now ", str));
                }
                fragment.mTag = str;
            }
            if (i2 != 0) {
                if (i2 != -1) {
                    int i4 = fragment.mFragmentId;
                    if (i4 != 0 && i4 != i2) {
                        throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i2);
                    }
                    fragment.mFragmentId = i2;
                    fragment.mContainerId = i2;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
                }
            }
            b(new e0.a(i3, fragment));
            fragment.mFragmentManager = this.q;
            return;
        }
        StringBuilder A = f.a.b.a.a.A("Fragment ");
        A.append(cls.getCanonicalName());
        A.append(" must be a public static class to be  properly recreated from instance state.");
        throw new IllegalStateException(A.toString());
    }

    public void i(int i2) {
        if (this.f2694g) {
            if (FragmentManager.P(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            int size = this.a.size();
            for (int i3 = 0; i3 < size; i3++) {
                e0.a aVar = this.a.get(i3);
                Fragment fragment = aVar.b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i2;
                    if (FragmentManager.P(2)) {
                        StringBuilder A = f.a.b.a.a.A("Bump nesting of ");
                        A.append(aVar.b);
                        A.append(" to ");
                        A.append(aVar.b.mBackStackNesting);
                        Log.v("FragmentManager", A.toString());
                    }
                }
            }
        }
    }

    public int j(boolean z) {
        if (!this.r) {
            if (FragmentManager.P(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new r0("FragmentManager"));
                l("  ", printWriter, true);
                printWriter.close();
            }
            this.r = true;
            if (this.f2694g) {
                this.s = this.q.f403i.getAndIncrement();
            } else {
                this.s = -1;
            }
            this.q.A(this, z);
            return this.s;
        }
        throw new IllegalStateException("commit already called");
    }

    public void k() {
        if (!this.f2694g) {
            this.f2695h = false;
            this.q.D(this, true);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public void l(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2696i);
            printWriter.print(" mIndex=");
            printWriter.print(this.s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.r);
            if (this.f2693f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2693f));
            }
            if (this.b != 0 || this.c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (this.f2691d != 0 || this.f2692e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2691d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2692e));
            }
            if (this.f2697j != 0 || this.f2698k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2697j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2698k);
            }
            if (this.f2699l != 0 || this.f2700m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2699l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2700m);
            }
        }
        if (this.a.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            e0.a aVar = this.a.get(i2);
            switch (aVar.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    StringBuilder A = f.a.b.a.a.A("cmd=");
                    A.append(aVar.a);
                    str2 = A.toString();
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i2);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.b);
            if (z) {
                if (aVar.c != 0 || aVar.f2701d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f2701d));
                }
                if (aVar.f2702e != 0 || aVar.f2703f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f2702e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f2703f));
                }
            }
        }
    }

    public void m() {
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            e0.a aVar = this.a.get(i2);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f2693f);
                fragment.setSharedElementNames(this.n, this.o);
            }
            switch (aVar.a) {
                case 1:
                    fragment.setAnimations(aVar.c, aVar.f2701d, aVar.f2702e, aVar.f2703f);
                    this.q.h0(fragment, false);
                    this.q.a(fragment);
                    break;
                case 2:
                default:
                    StringBuilder A = f.a.b.a.a.A("Unknown cmd: ");
                    A.append(aVar.a);
                    throw new IllegalArgumentException(A.toString());
                case 3:
                    fragment.setAnimations(aVar.c, aVar.f2701d, aVar.f2702e, aVar.f2703f);
                    this.q.c0(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.c, aVar.f2701d, aVar.f2702e, aVar.f2703f);
                    this.q.O(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.c, aVar.f2701d, aVar.f2702e, aVar.f2703f);
                    this.q.h0(fragment, false);
                    this.q.l0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.c, aVar.f2701d, aVar.f2702e, aVar.f2703f);
                    this.q.j(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.c, aVar.f2701d, aVar.f2702e, aVar.f2703f);
                    this.q.h0(fragment, false);
                    this.q.c(fragment);
                    break;
                case 8:
                    this.q.j0(fragment);
                    break;
                case 9:
                    this.q.j0(null);
                    break;
                case 10:
                    this.q.i0(fragment, aVar.f2705h);
                    break;
            }
            if (!this.p) {
                int i3 = aVar.a;
            }
        }
    }

    public void n(boolean z) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            e0.a aVar = this.a.get(size);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                fragment.setPopDirection(true);
                int i2 = this.f2693f;
                fragment.setNextTransition(i2 != 4097 ? i2 != 4099 ? i2 != 8194 ? 0 : 4097 : 4099 : 8194);
                fragment.setSharedElementNames(this.o, this.n);
            }
            switch (aVar.a) {
                case 1:
                    fragment.setAnimations(aVar.c, aVar.f2701d, aVar.f2702e, aVar.f2703f);
                    this.q.h0(fragment, true);
                    this.q.c0(fragment);
                    break;
                case 2:
                default:
                    StringBuilder A = f.a.b.a.a.A("Unknown cmd: ");
                    A.append(aVar.a);
                    throw new IllegalArgumentException(A.toString());
                case 3:
                    fragment.setAnimations(aVar.c, aVar.f2701d, aVar.f2702e, aVar.f2703f);
                    this.q.a(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.c, aVar.f2701d, aVar.f2702e, aVar.f2703f);
                    this.q.l0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.c, aVar.f2701d, aVar.f2702e, aVar.f2703f);
                    this.q.h0(fragment, true);
                    this.q.O(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.c, aVar.f2701d, aVar.f2702e, aVar.f2703f);
                    this.q.c(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.c, aVar.f2701d, aVar.f2702e, aVar.f2703f);
                    this.q.h0(fragment, true);
                    this.q.j(fragment);
                    break;
                case 8:
                    this.q.j0(null);
                    break;
                case 9:
                    this.q.j0(fragment);
                    break;
                case 10:
                    this.q.i0(fragment, aVar.f2704g);
                    break;
            }
            if (!this.p) {
                int i3 = aVar.a;
            }
        }
    }

    public boolean o(int i2) {
        int size = this.a.size();
        for (int i3 = 0; i3 < size; i3++) {
            Fragment fragment = this.a.get(i3).b;
            int i4 = fragment != null ? fragment.mContainerId : 0;
            if (i4 != 0 && i4 == i2) {
                return true;
            }
        }
        return false;
    }

    public boolean p(ArrayList<a> arrayList, int i2, int i3) {
        if (i3 == i2) {
            return false;
        }
        int size = this.a.size();
        int i4 = -1;
        for (int i5 = 0; i5 < size; i5++) {
            Fragment fragment = this.a.get(i5).b;
            int i6 = fragment != null ? fragment.mContainerId : 0;
            if (i6 != 0 && i6 != i4) {
                for (int i7 = i2; i7 < i3; i7++) {
                    a aVar = arrayList.get(i7);
                    int size2 = aVar.a.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        Fragment fragment2 = aVar.a.get(i8).b;
                        if ((fragment2 != null ? fragment2.mContainerId : 0) == i6) {
                            return true;
                        }
                    }
                }
                i4 = i6;
            }
        }
        return false;
    }

    public e0 q(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.q) {
            StringBuilder A = f.a.b.a.a.A("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
            A.append(fragment.toString());
            A.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(A.toString());
        }
        b(new e0.a(3, fragment));
        return this;
    }

    public e0 r(Fragment fragment, Lifecycle.State state) {
        if (fragment.mFragmentManager == this.q) {
            if (state == Lifecycle.State.INITIALIZED && fragment.mState > -1) {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + " after the Fragment has been created");
            } else if (state != Lifecycle.State.DESTROYED) {
                b(new e0.a(10, fragment, state));
                return this;
            } else {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
            }
        }
        StringBuilder A = f.a.b.a.a.A("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
        A.append(this.q);
        throw new IllegalArgumentException(A.toString());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.s >= 0) {
            sb.append(" #");
            sb.append(this.s);
        }
        if (this.f2696i != null) {
            sb.append(" ");
            sb.append(this.f2696i);
        }
        sb.append("}");
        return sb.toString();
    }
}
