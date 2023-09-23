package e.s;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SavedStateHandleController;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: SavedStateViewModelFactory.java */
/* loaded from: classes.dex */
public final class z extends f0 {

    /* renamed from: f  reason: collision with root package name */
    public static final Class<?>[] f2833f = {Application.class, y.class};

    /* renamed from: g  reason: collision with root package name */
    public static final Class<?>[] f2834g = {y.class};
    public final Application a;
    public final e0 b;
    public final Bundle c;

    /* renamed from: d  reason: collision with root package name */
    public final Lifecycle f2835d;

    /* renamed from: e  reason: collision with root package name */
    public final e.w.a f2836e;

    public z(Application application, e.w.c cVar, Bundle bundle) {
        e0 e0Var;
        this.f2836e = cVar.getSavedStateRegistry();
        this.f2835d = cVar.getLifecycle();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (d0.c == null) {
                d0.c = new d0(application);
            }
            e0Var = d0.c;
        } else {
            if (g0.a == null) {
                g0.a = new g0();
            }
            e0Var = g0.a;
        }
        this.b = e0Var;
    }

    public static <T> Constructor<T> d(Class<T> cls, Class<?>[] clsArr) {
        for (Constructor<?> constructor : cls.getConstructors()) {
            Constructor<T> constructor2 = (Constructor<T>) constructor;
            if (Arrays.equals(clsArr, constructor2.getParameterTypes())) {
                return constructor2;
            }
        }
        return null;
    }

    @Override // e.s.f0, e.s.e0
    public <T extends b0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) c(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // e.s.h0
    public void b(b0 b0Var) {
        e.w.a aVar = this.f2836e;
        Lifecycle lifecycle = this.f2835d;
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) b0Var.a("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.f450g) {
            return;
        }
        savedStateHandleController.c(aVar, lifecycle);
        SavedStateHandleController.f(aVar, lifecycle);
    }

    @Override // e.s.f0
    public <T extends b0> T c(String str, Class<T> cls) {
        Constructor d2;
        y yVar;
        T t;
        boolean isAssignableFrom = a.class.isAssignableFrom(cls);
        if (isAssignableFrom && this.a != null) {
            d2 = d(cls, f2833f);
        } else {
            d2 = d(cls, f2834g);
        }
        if (d2 == null) {
            return (T) this.b.a(cls);
        }
        e.w.a aVar = this.f2836e;
        Lifecycle lifecycle = this.f2835d;
        Bundle bundle = this.c;
        Bundle a = aVar.a(str);
        Class[] clsArr = y.f2831e;
        if (a == null && bundle == null) {
            yVar = new y();
        } else {
            HashMap hashMap = new HashMap();
            if (bundle != null) {
                for (String str2 : bundle.keySet()) {
                    hashMap.put(str2, bundle.get(str2));
                }
            }
            if (a == null) {
                yVar = new y(hashMap);
            } else {
                ArrayList parcelableArrayList = a.getParcelableArrayList(UserMetadata.KEYDATA_FILENAME);
                ArrayList parcelableArrayList2 = a.getParcelableArrayList("values");
                if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
                    for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                        hashMap.put((String) parcelableArrayList.get(i2), parcelableArrayList2.get(i2));
                    }
                    yVar = new y(hashMap);
                } else {
                    throw new IllegalStateException("Invalid bundle passed as restored state");
                }
            }
        }
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, yVar);
        savedStateHandleController.c(aVar, lifecycle);
        SavedStateHandleController.f(aVar, lifecycle);
        if (isAssignableFrom) {
            try {
                Application application = this.a;
                if (application != null) {
                    t = (T) d2.newInstance(application, savedStateHandleController.f451h);
                    t.c("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController);
                    return t;
                }
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Failed to access " + cls, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("A " + cls + " cannot be instantiated.", e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("An exception happened in constructor of " + cls, e4.getCause());
            }
        }
        t = (T) d2.newInstance(savedStateHandleController.f451h);
        t.c("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController);
        return t;
    }
}
