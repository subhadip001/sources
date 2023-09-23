package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzahu implements zzys {
    public static final zzyz zza = new zzyz() { // from class: com.google.android.gms.internal.ads.zzahq
        @Override // com.google.android.gms.internal.ads.zzyz
        public final zzys[] zza() {
            zzyz zzyzVar = zzahu.zza;
            return new zzys[]{new zzahu()};
        }

        @Override // com.google.android.gms.internal.ads.zzyz
        public final /* synthetic */ zzys[] zzb(Uri uri, Map map) {
            return zzyy.zza(this, uri, map);
        }
    };
    private zzyv zzb;
    private zzzz zzc;
    private zzahs zzf;
    private int zzd = 0;
    private long zze = -1;
    private int zzg = -1;
    private long zzh = -1;

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e9, code lost:
        if (r1 != 65534) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010e  */
    @Override // com.google.android.gms.internal.ads.zzys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(com.google.android.gms.internal.ads.zzyt r19, com.google.android.gms.internal.ads.zzzs r20) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahu.zza(com.google.android.gms.internal.ads.zzyt, com.google.android.gms.internal.ads.zzzs):int");
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzb(zzyv zzyvVar) {
        this.zzb = zzyvVar;
        this.zzc = zzyvVar.zzv(0, 1);
        zzyvVar.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzc(long j2, long j3) {
        this.zzd = j2 == 0 ? 0 : 4;
        zzahs zzahsVar = this.zzf;
        if (zzahsVar != null) {
            zzahsVar.zzb(j3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final boolean zzd(zzyt zzytVar) {
        return zzahx.zzc(zzytVar);
    }
}
