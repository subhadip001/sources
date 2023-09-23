package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import f.h.b.c.a;
import f.h.b.d.a.b.a0;
import f.h.b.d.a.b.c1;
import f.h.b.d.a.b.h0;
import f.h.b.d.a.b.l2;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public abstract class AssetPackState {
    public static AssetPackState h(String str, int i2, int i3, long j2, long j3, double d2, int i4, String str2, String str3) {
        return new h0(str, i2, i3, j2, j3, (int) Math.rint(100.0d * d2), i4, str2, str3);
    }

    public static AssetPackState i(Bundle bundle, String str, c1 c1Var, l2 l2Var, a0 a0Var) {
        double doubleValue;
        int i2;
        int zza = a0Var.zza(bundle.getInt(a.j1("status", str)), str);
        int i3 = bundle.getInt(a.j1("error_code", str));
        long j2 = bundle.getLong(a.j1("bytes_downloaded", str));
        long j3 = bundle.getLong(a.j1("total_bytes_to_download", str));
        synchronized (c1Var) {
            Double d2 = (Double) c1Var.a.get(str);
            doubleValue = d2 == null ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : d2.doubleValue();
        }
        long j4 = bundle.getLong(a.j1("pack_version", str));
        long j5 = bundle.getLong(a.j1("pack_base_version", str));
        int i4 = 4;
        if (zza == 4) {
            if (j5 != 0 && j5 != j4) {
                i2 = 2;
                return h(str, i4, i3, j2, j3, doubleValue, i2, bundle.getString(a.j1("pack_version_tag", str), String.valueOf(bundle.getInt("app_version_code"))), l2Var.a(str));
            }
            zza = 4;
        }
        i4 = zza;
        i2 = 1;
        return h(str, i4, i3, j2, j3, doubleValue, i2, bundle.getString(a.j1("pack_version_tag", str), String.valueOf(bundle.getInt("app_version_code"))), l2Var.a(str));
    }

    public abstract long a();

    public abstract int b();

    public abstract String c();

    public abstract int d();

    public abstract long e();

    public abstract int f();

    public abstract int g();

    public abstract String j();

    public abstract String k();
}
