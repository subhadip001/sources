package f.h.b.b.c2.u;

import java.util.Collections;
import java.util.Set;

/* compiled from: WebvttCssStyle.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: f  reason: collision with root package name */
    public int f4065f;

    /* renamed from: h  reason: collision with root package name */
    public int f4067h;
    public String a = "";
    public String b = "";
    public Set<String> c = Collections.emptySet();

    /* renamed from: d  reason: collision with root package name */
    public String f4063d = "";

    /* renamed from: e  reason: collision with root package name */
    public String f4064e = null;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4066g = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4068i = false;

    /* renamed from: j  reason: collision with root package name */
    public int f4069j = -1;

    /* renamed from: k  reason: collision with root package name */
    public int f4070k = -1;

    /* renamed from: l  reason: collision with root package name */
    public int f4071l = -1;

    /* renamed from: m  reason: collision with root package name */
    public int f4072m = -1;
    public int n = -1;
    public int o = -1;
    public boolean p = false;

    public static int b(int i2, String str, String str2, int i3) {
        if (str.isEmpty() || i2 == -1) {
            return i2;
        }
        if (str.equals(str2)) {
            return i2 + i3;
        }
        return -1;
    }

    public int a() {
        int i2 = this.f4071l;
        if (i2 == -1 && this.f4072m == -1) {
            return -1;
        }
        return (i2 == 1 ? 1 : 0) | (this.f4072m == 1 ? 2 : 0);
    }
}
