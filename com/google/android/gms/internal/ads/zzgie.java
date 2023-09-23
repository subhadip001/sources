package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgie extends ThreadLocal {
    public final /* synthetic */ zzgif zza;

    public zzgie(zzgif zzgifVar) {
        this.zza = zzgifVar;
    }

    @Override // java.lang.ThreadLocal
    /* renamed from: zza */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            zzghq zzghqVar = zzghq.zzb;
            str = this.zza.zzb;
            Mac mac = (Mac) zzghqVar.zza(str);
            key = this.zza.zzc;
            mac.init(key);
            return mac;
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
