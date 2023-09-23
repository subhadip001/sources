package com.google.android.gms.appset;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes.dex */
public class AppSetIdInfo {
    public static final int SCOPE_APP = 1;
    public static final int SCOPE_DEVELOPER = 2;
    private final String zza;
    private final int zzb;

    /* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Scope {
    }

    public AppSetIdInfo(String str, int i2) {
        this.zza = str;
        this.zzb = i2;
    }

    public String getId() {
        return this.zza;
    }

    public int getScope() {
        return this.zzb;
    }
}
