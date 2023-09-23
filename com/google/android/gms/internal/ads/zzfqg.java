package com.google.android.gms.internal.ads;

import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfqg {
    public static int zza(int i2, String str) {
        if (i2 >= 0) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(str.length() + 40);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void zzb(Object obj, Object obj2) {
        if (obj == null) {
            String valueOf = String.valueOf(obj2);
            valueOf.length();
            throw new NullPointerException("null key in entry: null=".concat(valueOf));
        } else if (obj2 != null) {
        } else {
            String obj3 = obj.toString();
            throw new NullPointerException(a.v(new StringBuilder(obj3.length() + 26), "null value in entry: ", obj3, "=null"));
        }
    }
}
