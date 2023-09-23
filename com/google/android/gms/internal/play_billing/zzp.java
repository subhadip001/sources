package com.google.android.gms.internal.play_billing;

import f.a.b.a.a;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes.dex */
public final class zzp {
    public static void zza(Object obj, Object obj2) {
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
