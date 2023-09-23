package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzesq implements zzetb {
    private final zzfvk zza;
    private final Context zzb;
    private final zzcfo zzc;

    public zzesq(zzfvk zzfvkVar, Context context, zzcfo zzcfoVar) {
        this.zza = zzfvkVar;
        this.zzb = context;
        this.zzc = zzcfoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 35;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzesq.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzesr zzc() {
        boolean isCallerInstantApp = Wrappers.packageManager(this.zzb).isCallerInstantApp();
        com.google.android.gms.ads.internal.zzt.zzp();
        boolean zzA = com.google.android.gms.ads.internal.util.zzs.zzA(this.zzb);
        String str = this.zzc.zza;
        com.google.android.gms.ads.internal.zzt.zzp();
        boolean zzB = com.google.android.gms.ads.internal.util.zzs.zzB();
        com.google.android.gms.ads.internal.zzt.zzp();
        ApplicationInfo applicationInfo = this.zzb.getApplicationInfo();
        return new zzesr(isCallerInstantApp, zzA, str, zzB, applicationInfo == null ? 0 : applicationInfo.targetSdkVersion, DynamiteModule.getRemoteVersion(this.zzb, ModuleDescriptor.MODULE_ID), DynamiteModule.getLocalVersion(this.zzb, ModuleDescriptor.MODULE_ID));
    }
}
