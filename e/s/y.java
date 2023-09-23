package e.s;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import e.w.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: SavedStateHandle.java */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: e  reason: collision with root package name */
    public static final Class[] f2831e = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};
    public final Map<String, Object> a;
    public final Map<String, a.b> b;
    public final Map<String, Object<?>> c;

    /* renamed from: d  reason: collision with root package name */
    public final a.b f2832d;

    /* compiled from: SavedStateHandle.java */
    /* loaded from: classes.dex */
    public class a implements a.b {
        public a() {
        }

        @Override // e.w.a.b
        public Bundle b() {
            for (Map.Entry entry : new HashMap(y.this.b).entrySet()) {
                Bundle b = ((a.b) entry.getValue()).b();
                y yVar = y.this;
                String str = (String) entry.getKey();
                Objects.requireNonNull(yVar);
                if (b != null) {
                    for (Class cls : y.f2831e) {
                        if (!cls.isInstance(b)) {
                        }
                    }
                    StringBuilder A = f.a.b.a.a.A("Can't put value with type ");
                    A.append(b.getClass());
                    A.append(" into saved state");
                    throw new IllegalArgumentException(A.toString());
                }
                s sVar = (s) yVar.c.get(str);
                if (sVar != null) {
                    sVar.k(b);
                } else {
                    yVar.a.put(str, b);
                }
            }
            Set<String> keySet = y.this.a.keySet();
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(keySet.size());
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(arrayList.size());
            for (String str2 : keySet) {
                arrayList.add(str2);
                arrayList2.add(y.this.a.get(str2));
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList(UserMetadata.KEYDATA_FILENAME, arrayList);
            bundle.putParcelableArrayList("values", arrayList2);
            return bundle;
        }
    }

    public y(Map<String, Object> map) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.f2832d = new a();
        this.a = new HashMap(map);
    }

    public y() {
        this.b = new HashMap();
        this.c = new HashMap();
        this.f2832d = new a();
        this.a = new HashMap();
    }
}
