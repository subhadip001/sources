package e.p.c;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;

/* compiled from: FragmentLayoutInflaterFactory.java */
/* loaded from: classes.dex */
public class x implements LayoutInflater.Factory2 {

    /* renamed from: f  reason: collision with root package name */
    public final FragmentManager f2803f;

    /* compiled from: FragmentLayoutInflaterFactory.java */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ c0 f2804f;

        public a(c0 c0Var) {
            this.f2804f = c0Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c0 c0Var = this.f2804f;
            Fragment fragment = c0Var.c;
            c0Var.k();
            s0.f((ViewGroup) fragment.mView.getParent(), x.this.f2803f).e();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public x(FragmentManager fragmentManager) {
        this.f2803f = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        c0 h2;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f2803f);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.p.b.a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                ClassLoader classLoader = context.getClassLoader();
                e.f.h<ClassLoader, e.f.h<String, Class<?>>> hVar = v.a;
                try {
                    z = Fragment.class.isAssignableFrom(v.b(classLoader, attributeValue));
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    Fragment H = resourceId != -1 ? this.f2803f.H(resourceId) : null;
                    if (H == null && string != null) {
                        H = this.f2803f.I(string);
                    }
                    if (H == null && id != -1) {
                        H = this.f2803f.H(id);
                    }
                    if (H == null) {
                        H = this.f2803f.L().a(context.getClassLoader(), attributeValue);
                        H.mFromLayout = true;
                        H.mFragmentId = resourceId != 0 ? resourceId : id;
                        H.mContainerId = id;
                        H.mTag = string;
                        H.mInLayout = true;
                        FragmentManager fragmentManager = this.f2803f;
                        H.mFragmentManager = fragmentManager;
                        w<?> wVar = fragmentManager.q;
                        H.mHost = wVar;
                        H.onInflate(wVar.f2800g, attributeSet, H.mSavedFragmentState);
                        h2 = this.f2803f.a(H);
                        if (FragmentManager.P(2)) {
                            Log.v("FragmentManager", "Fragment " + H + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else if (!H.mInLayout) {
                        H.mInLayout = true;
                        FragmentManager fragmentManager2 = this.f2803f;
                        H.mFragmentManager = fragmentManager2;
                        w<?> wVar2 = fragmentManager2.q;
                        H.mHost = wVar2;
                        H.onInflate(wVar2.f2800g, attributeSet, H.mSavedFragmentState);
                        h2 = this.f2803f.h(H);
                        if (FragmentManager.P(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + H + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    H.mContainer = (ViewGroup) view;
                    h2.k();
                    h2.j();
                    View view2 = H.mView;
                    if (view2 != null) {
                        if (resourceId != 0) {
                            view2.setId(resourceId);
                        }
                        if (H.mView.getTag() == null) {
                            H.mView.setTag(string);
                        }
                        H.mView.addOnAttachStateChangeListener(new a(h2));
                        return H.mView;
                    }
                    throw new IllegalStateException(f.a.b.a.a.q("Fragment ", attributeValue, " did not create a view."));
                }
            }
            return null;
        }
        return null;
    }
}
