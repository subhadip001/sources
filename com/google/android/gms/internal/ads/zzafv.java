package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzafv implements zzys {
    public static final zzyz zza = new zzyz() { // from class: com.google.android.gms.internal.ads.zzafu
        @Override // com.google.android.gms.internal.ads.zzyz
        public final zzys[] zza() {
            zzyz zzyzVar = zzafv.zza;
            return new zzys[]{new zzafv(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzyz
        public final /* synthetic */ zzys[] zzb(Uri uri, Map map) {
            return zzyy.zza(this, uri, map);
        }
    };
    private final zzafw zzb;
    private final zzdy zzc;
    private final zzdy zzd;
    private final zzdx zze;
    private zzyv zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;

    public zzafv() {
        this(0);
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final int zza(zzyt zzytVar, zzzs zzzsVar) {
        zzcw.zzb(this.zzf);
        int zza2 = zzytVar.zza(this.zzc.zzH(), 0, RecyclerView.a0.FLAG_MOVED);
        if (!this.zzj) {
            this.zzf.zzL(new zzzu(-9223372036854775807L, 0L));
            this.zzj = true;
        }
        if (zza2 == -1) {
            return -1;
        }
        this.zzc.zzF(0);
        this.zzc.zzE(zza2);
        if (!this.zzi) {
            this.zzb.zzd(this.zzg, 4);
            this.zzi = true;
        }
        this.zzb.zza(this.zzc);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzb(zzyv zzyvVar) {
        this.zzf = zzyvVar;
        this.zzb.zzb(zzyvVar, new zzahm(Integer.MIN_VALUE, 0, 1));
        zzyvVar.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzc(long j2, long j3) {
        this.zzi = false;
        this.zzb.zze();
        this.zzg = j3;
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final boolean zzd(zzyt zzytVar) {
        int i2 = 0;
        while (true) {
            zzym zzymVar = (zzym) zzytVar;
            zzymVar.zzm(this.zzd.zzH(), 0, 10, false);
            this.zzd.zzF(0);
            if (this.zzd.zzm() != 4801587) {
                break;
            }
            this.zzd.zzG(3);
            int zzj = this.zzd.zzj();
            i2 += zzj + 10;
            zzymVar.zzl(zzj, false);
        }
        zzytVar.zzj();
        zzym zzymVar2 = (zzym) zzytVar;
        zzymVar2.zzl(i2, false);
        if (this.zzh == -1) {
            this.zzh = i2;
        }
        int i3 = i2;
        int i4 = 0;
        int i5 = 0;
        do {
            zzymVar2.zzm(this.zzd.zzH(), 0, 2, false);
            this.zzd.zzF(0);
            if (zzafw.zzf(this.zzd.zzo())) {
                i4++;
                if (i4 >= 4 && i5 > 188) {
                    return true;
                }
                zzymVar2.zzm(this.zzd.zzH(), 0, 4, false);
                this.zze.zzh(14);
                int zzc = this.zze.zzc(13);
                if (zzc <= 6) {
                    i3++;
                    zzytVar.zzj();
                    zzymVar2.zzl(i3, false);
                } else {
                    zzymVar2.zzl(zzc - 6, false);
                    i5 += zzc;
                }
            } else {
                i3++;
                zzytVar.zzj();
                zzymVar2.zzl(i3, false);
            }
            i4 = 0;
            i5 = 0;
        } while (i3 - i2 < 8192);
        return false;
    }

    public zzafv(int i2) {
        this.zzb = new zzafw(true, null);
        this.zzc = new zzdy((int) RecyclerView.a0.FLAG_MOVED);
        this.zzh = -1L;
        zzdy zzdyVar = new zzdy(10);
        this.zzd = zzdyVar;
        byte[] zzH = zzdyVar.zzH();
        this.zze = new zzdx(zzH, zzH.length);
    }
}
