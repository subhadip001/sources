package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzere implements zzetb {
    private final zzfvk zza;
    private final zzfby zzb;
    private final PackageInfo zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;

    public zzere(zzfvk zzfvkVar, zzfby zzfbyVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzfvkVar;
        this.zzb = zzfbyVar;
        this.zzc = packageInfo;
        this.zzd = zzgVar;
    }

    public static /* synthetic */ zzerf zzc(zzere zzereVar) {
        final ArrayList arrayList = zzereVar.zzb.zzg;
        return arrayList == null ? new zzerf() { // from class: com.google.android.gms.internal.ads.zzera
            @Override // com.google.android.gms.internal.ads.zzeta
            public final void zzf(Object obj) {
                Bundle bundle = (Bundle) obj;
            }
        } : arrayList.isEmpty() ? new zzerf() { // from class: com.google.android.gms.internal.ads.zzerb
            @Override // com.google.android.gms.internal.ads.zzeta
            public final void zzf(Object obj) {
                ((Bundle) obj).putInt("native_version", 0);
            }
        } : new zzerf() { // from class: com.google.android.gms.internal.ads.zzerc
            @Override // com.google.android.gms.internal.ads.zzeta
            public final void zzf(Object obj) {
                zzere.this.zzd(arrayList, (Bundle) obj);
            }
        };
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 26;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzerd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzere.zzc(zzere.this);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x00e2, code lost:
        if (r9 == 3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void zzd(java.util.ArrayList r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzere.zzd(java.util.ArrayList, android.os.Bundle):void");
    }
}
