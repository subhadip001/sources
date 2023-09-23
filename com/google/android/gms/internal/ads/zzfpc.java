package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzfpc extends zzfnz {
    public final CharSequence zzb;
    public final zzfof zzc;
    public int zzd = 0;
    public int zze;

    public zzfpc(zzfpe zzfpeVar, CharSequence charSequence) {
        zzfof zzfofVar;
        zzfofVar = zzfpeVar.zza;
        this.zzc = zzfofVar;
        this.zze = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.zzfnz
    public final /* bridge */ /* synthetic */ Object zza() {
        int zzc;
        int i2 = this.zzd;
        while (true) {
            int i3 = this.zzd;
            if (i3 == -1) {
                zzb();
                return null;
            }
            int zzd = zzd(i3);
            if (zzd == -1) {
                zzd = this.zzb.length();
                this.zzd = -1;
                zzc = -1;
            } else {
                zzc = zzc(zzd);
                this.zzd = zzc;
            }
            if (zzc == i2) {
                int i4 = zzc + 1;
                this.zzd = i4;
                if (i4 > this.zzb.length()) {
                    this.zzd = -1;
                }
            } else {
                if (i2 < zzd) {
                    this.zzb.charAt(i2);
                }
                if (i2 < zzd) {
                    this.zzb.charAt(zzd - 1);
                }
                int i5 = this.zze;
                if (i5 == 1) {
                    zzd = this.zzb.length();
                    this.zzd = -1;
                    if (zzd > i2) {
                        this.zzb.charAt(zzd - 1);
                    }
                } else {
                    this.zze = i5 - 1;
                }
                return this.zzb.subSequence(i2, zzd).toString();
            }
        }
    }

    public abstract int zzc(int i2);

    public abstract int zzd(int i2);
}
