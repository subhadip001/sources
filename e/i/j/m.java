package e.i.j;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* compiled from: NestedScrollingChildHelper.java */
/* loaded from: classes.dex */
public class m {
    public ViewParent a;
    public ViewParent b;
    public final View c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2543d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f2544e;

    public m(View view) {
        this.c = view;
    }

    public boolean a(float f2, float f3, boolean z) {
        ViewParent g2;
        if (!this.f2543d || (g2 = g(0)) == null) {
            return false;
        }
        try {
            return g2.onNestedFling(this.c, f2, f3, z);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + g2 + " does not implement interface method onNestedFling", e2);
            return false;
        }
    }

    public boolean b(float f2, float f3) {
        ViewParent g2;
        if (!this.f2543d || (g2 = g(0)) == null) {
            return false;
        }
        try {
            return g2.onNestedPreFling(this.c, f2, f3);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + g2 + " does not implement interface method onNestedPreFling", e2);
            return false;
        }
    }

    public boolean c(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        ViewParent g2;
        int i5;
        int i6;
        int[] iArr3;
        if (!this.f2543d || (g2 = g(i4)) == null) {
            return false;
        }
        if (i2 != 0 || i3 != 0) {
            if (iArr2 != null) {
                this.c.getLocationInWindow(iArr2);
                i5 = iArr2[0];
                i6 = iArr2[1];
            } else {
                i5 = 0;
                i6 = 0;
            }
            if (iArr == null) {
                if (this.f2544e == null) {
                    this.f2544e = new int[2];
                }
                iArr3 = this.f2544e;
            } else {
                iArr3 = iArr;
            }
            iArr3[0] = 0;
            iArr3[1] = 0;
            View view = this.c;
            if (g2 instanceof n) {
                ((n) g2).o(view, i2, i3, iArr3, i4);
            } else if (i4 == 0) {
                try {
                    g2.onNestedPreScroll(view, i2, i3, iArr3);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + g2 + " does not implement interface method onNestedPreScroll", e2);
                }
            }
            if (iArr2 != null) {
                this.c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i5;
                iArr2[1] = iArr2[1] - i6;
            }
            if (iArr3[0] != 0 || iArr3[1] != 0) {
                return true;
            }
        } else if (iArr2 != null) {
            iArr2[0] = 0;
            iArr2[1] = 0;
        }
        return false;
    }

    public void d(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        f(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public boolean e(int i2, int i3, int i4, int i5, int[] iArr) {
        return f(i2, i3, i4, i5, iArr, 0, null);
    }

    public final boolean f(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        ViewParent g2;
        int i7;
        int i8;
        int[] iArr3;
        if (!this.f2543d || (g2 = g(i6)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.c.getLocationInWindow(iArr);
            i7 = iArr[0];
            i8 = iArr[1];
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (iArr2 == null) {
            if (this.f2544e == null) {
                this.f2544e = new int[2];
            }
            int[] iArr4 = this.f2544e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view = this.c;
        if (g2 instanceof o) {
            ((o) g2).j(view, i2, i3, i4, i5, i6, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i4;
            iArr3[1] = iArr3[1] + i5;
            if (g2 instanceof n) {
                ((n) g2).k(view, i2, i3, i4, i5, i6);
            } else if (i6 == 0) {
                try {
                    g2.onNestedScroll(view, i2, i3, i4, i5);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + g2 + " does not implement interface method onNestedScroll", e2);
                }
            }
        }
        if (iArr != null) {
            this.c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i7;
            iArr[1] = iArr[1] - i8;
        }
        return true;
    }

    public final ViewParent g(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                return null;
            }
            return this.b;
        }
        return this.a;
    }

    public boolean h(int i2) {
        return g(i2) != null;
    }

    public boolean i(int i2, int i3) {
        boolean onStartNestedScroll;
        if (g(i3) != null) {
            return true;
        }
        if (this.f2543d) {
            View view = this.c;
            for (ViewParent parent = this.c.getParent(); parent != null; parent = parent.getParent()) {
                View view2 = this.c;
                boolean z = parent instanceof n;
                if (z) {
                    onStartNestedScroll = ((n) parent).l(view, view2, i2, i3);
                } else {
                    if (i3 == 0) {
                        try {
                            onStartNestedScroll = parent.onStartNestedScroll(view, view2, i2);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e2);
                        }
                    }
                    onStartNestedScroll = false;
                }
                if (onStartNestedScroll) {
                    if (i3 == 0) {
                        this.a = parent;
                    } else if (i3 == 1) {
                        this.b = parent;
                    }
                    View view3 = this.c;
                    if (z) {
                        ((n) parent).m(view, view3, i2, i3);
                    } else if (i3 == 0) {
                        try {
                            parent.onNestedScrollAccepted(view, view3, i2);
                        } catch (AbstractMethodError e3) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e3);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = parent;
                }
            }
        }
        return false;
    }

    public void j(int i2) {
        ViewParent g2 = g(i2);
        if (g2 != null) {
            View view = this.c;
            if (g2 instanceof n) {
                ((n) g2).n(view, i2);
            } else if (i2 == 0) {
                try {
                    g2.onStopNestedScroll(view);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + g2 + " does not implement interface method onStopNestedScroll", e2);
                }
            }
            if (i2 == 0) {
                this.a = null;
            } else if (i2 != 1) {
            } else {
                this.b = null;
            }
        }
    }
}
