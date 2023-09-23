package f.e.a.l.r;

import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.settings.DefaultSettingsSpiCall;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: LazyHeaders.java */
/* loaded from: classes.dex */
public final class j implements h {
    public final Map<String, List<i>> b;
    public volatile Map<String, String> c;

    /* compiled from: LazyHeaders.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: d  reason: collision with root package name */
        public static final String f3423d;

        /* renamed from: e  reason: collision with root package name */
        public static final Map<String, List<i>> f3424e;
        public boolean a = true;
        public Map<String, List<i>> b = f3424e;
        public boolean c = true;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb = new StringBuilder(property.length());
                for (int i2 = 0; i2 < length; i2++) {
                    char charAt = property.charAt(i2);
                    if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                        sb.append(charAt);
                    } else {
                        sb.append('?');
                    }
                }
                property = sb.toString();
            }
            f3423d = property;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                hashMap.put(DefaultSettingsSpiCall.HEADER_USER_AGENT, Collections.singletonList(new b(property)));
            }
            f3424e = Collections.unmodifiableMap(hashMap);
        }

        public final void a() {
            if (this.a) {
                this.a = false;
                HashMap hashMap = new HashMap(this.b.size());
                for (Map.Entry<String, List<i>> entry : this.b.entrySet()) {
                    hashMap.put(entry.getKey(), new ArrayList(entry.getValue()));
                }
                this.b = hashMap;
            }
        }
    }

    /* compiled from: LazyHeaders.java */
    /* loaded from: classes.dex */
    public static final class b implements i {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        @Override // f.e.a.l.r.i
        public String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.a.equals(((b) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            StringBuilder A = f.a.b.a.a.A("StringHeaderFactory{value='");
            A.append(this.a);
            A.append('\'');
            A.append('}');
            return A.toString();
        }
    }

    public j(Map<String, List<i>> map) {
        this.b = Collections.unmodifiableMap(map);
    }

    @Override // f.e.a.l.r.h
    public Map<String, String> a() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = Collections.unmodifiableMap(b());
                }
            }
        }
        return this.c;
    }

    public final Map<String, String> b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<i>> entry : this.b.entrySet()) {
            List<i> value = entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = value.size();
            for (int i2 = 0; i2 < size; i2++) {
                String a2 = value.get(i2).a();
                if (!TextUtils.isEmpty(a2)) {
                    sb.append(a2);
                    if (i2 != value.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                hashMap.put(entry.getKey(), sb2);
            }
        }
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.b.equals(((j) obj).b);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("LazyHeaders{headers=");
        A.append(this.b);
        A.append('}');
        return A.toString();
    }
}
