package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeob implements zzetb {
    private final zzfvk zza;
    private final zzdub zzb;
    private final zzdyi zzc;
    private final zzeoe zzd;

    public zzeob(zzfvk zzfvkVar, zzdub zzdubVar, zzdyi zzdyiVar, zzeoe zzeoeVar) {
        this.zza = zzfvkVar;
        this.zzb = zzdubVar;
        this.zzc = zzdyiVar;
        this.zzd = zzeoeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        if (!zzfpg.zzd((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbk)) && !this.zzd.zzb() && this.zzc.zzt()) {
            this.zzd.zza(true);
            return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeoa
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzeob.this.zzc();
                }
            });
        }
        return zzfva.zzi(new zzeod(new Bundle(), null));
    }

    public final /* synthetic */ zzeod zzc() {
        List<String> asList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbk)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : asList) {
            try {
                zzfct zzc = this.zzb.zzc(str, new JSONObject());
                zzc.zzA();
                Bundle bundle2 = new Bundle();
                try {
                    zzbwf zzf = zzc.zzf();
                    if (zzf != null) {
                        bundle2.putString("sdk_version", zzf.toString());
                    }
                } catch (zzfcd unused) {
                }
                try {
                    zzbwf zze = zzc.zze();
                    if (zze != null) {
                        bundle2.putString("adapter_version", zze.toString());
                    }
                } catch (zzfcd unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfcd unused3) {
            }
        }
        return new zzeod(bundle, null);
    }
}
