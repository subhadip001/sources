package e.b.c;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import com.video_converter.video_compressor.R;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: AppCompatViewInflater.java */
/* loaded from: classes.dex */
public class u {
    public static final Class<?>[] b = {Context.class, AttributeSet.class};
    public static final int[] c = {16843375};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f1509d = {16844160};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f1510e = {16844156};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f1511f = {16844148};

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f1512g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h  reason: collision with root package name */
    public static final e.f.h<String, Constructor<? extends View>> f1513h = new e.f.h<>();
    public final Object[] a = new Object[2];

    /* compiled from: AppCompatViewInflater.java */
    /* loaded from: classes.dex */
    public static class a implements View.OnClickListener {

        /* renamed from: f  reason: collision with root package name */
        public final View f1514f;

        /* renamed from: g  reason: collision with root package name */
        public final String f1515g;

        /* renamed from: h  reason: collision with root package name */
        public Method f1516h;

        /* renamed from: i  reason: collision with root package name */
        public Context f1517i;

        public a(View view, String str) {
            this.f1514f = view;
            this.f1515g = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String sb;
            Method method;
            if (this.f1516h == null) {
                Context context = this.f1514f.getContext();
                while (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(this.f1515g, View.class)) != null) {
                            this.f1516h = method;
                            this.f1517i = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
                }
                int id = this.f1514f.getId();
                if (id == -1) {
                    sb = "";
                } else {
                    StringBuilder A = f.a.b.a.a.A(" with id '");
                    A.append(this.f1514f.getContext().getResources().getResourceEntryName(id));
                    A.append("'");
                    sb = A.toString();
                }
                StringBuilder A2 = f.a.b.a.a.A("Could not find method ");
                A2.append(this.f1515g);
                A2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                A2.append(this.f1514f.getClass());
                A2.append(sb);
                throw new IllegalStateException(A2.toString());
            }
            try {
                this.f1516h.invoke(this.f1517i, view);
            } catch (IllegalAccessException e2) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
            } catch (InvocationTargetException e3) {
                throw new IllegalStateException("Could not execute method for android:onClick", e3);
            }
        }
    }

    public e.b.h.d a(Context context, AttributeSet attributeSet) {
        return new e.b.h.d(context, attributeSet);
    }

    public AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    public AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    public e.b.h.r d(Context context, AttributeSet attributeSet) {
        return new e.b.h.r(context, attributeSet, R.attr.radioButtonStyle);
    }

    public AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public View f() {
        return null;
    }

    public final View g(Context context, String str, String str2) {
        String str3;
        e.f.h<String, Constructor<? extends View>> hVar = f1513h;
        Constructor<? extends View> orDefault = hVar.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            orDefault = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(b);
            hVar.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return orDefault.newInstance(this.a);
    }

    public final void h(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }
}
