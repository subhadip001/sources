package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzedy {
    private static final SparseArray zza;
    private final Context zzb;
    private final zzday zzc;
    private final TelephonyManager zzd;
    private final zzedr zze;
    private final zzedn zzf;
    private final com.google.android.gms.ads.internal.util.zzg zzg;
    private int zzh;

    static {
        SparseArray sparseArray = new SparseArray();
        zza = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbfy.CONNECTED);
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        zzbfy zzbfyVar = zzbfy.CONNECTING;
        sparseArray.put(ordinal, zzbfyVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzbfyVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzbfyVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbfy.DISCONNECTING);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        zzbfy zzbfyVar2 = zzbfy.DISCONNECTED;
        sparseArray.put(ordinal2, zzbfyVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzbfyVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzbfyVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzbfyVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzbfyVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbfy.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzbfyVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzbfyVar);
    }

    public zzedy(Context context, zzday zzdayVar, zzedr zzedrVar, zzedn zzednVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzb = context;
        this.zzc = zzdayVar;
        this.zze = zzedrVar;
        this.zzf = zzednVar;
        this.zzd = (TelephonyManager) context.getSystemService("phone");
        this.zzg = zzgVar;
    }

    public static /* bridge */ /* synthetic */ zzbfp zza(zzedy zzedyVar, Bundle bundle) {
        zzbfi zza2 = zzbfp.zza();
        int i2 = bundle.getInt("cnt", -2);
        int i3 = bundle.getInt("gnt", 0);
        int i4 = 2;
        if (i2 == -1) {
            zzedyVar.zzh = 2;
        } else {
            zzedyVar.zzh = 1;
            if (i2 == 0) {
                zza2.zzb(2);
            } else if (i2 != 1) {
                zza2.zzb(1);
            } else {
                zza2.zzb(3);
            }
            switch (i3) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    i4 = 3;
                    break;
                case 13:
                    i4 = 5;
                    break;
                default:
                    i4 = 1;
                    break;
            }
            zza2.zza(i4);
        }
        return (zzbfp) zza2.zzaj();
    }

    public static /* bridge */ /* synthetic */ zzbfy zzb(zzedy zzedyVar, Bundle bundle) {
        return (zzbfy) zza.get(zzfcj.zza(zzfcj.zza(bundle, "device"), "network").getInt("active_network_state", -1), zzbfy.UNSPECIFIED);
    }

    public static /* bridge */ /* synthetic */ byte[] zzf(zzedy zzedyVar, boolean z, ArrayList arrayList, zzbfp zzbfpVar, zzbfy zzbfyVar) {
        zzbft zzg = zzbfu.zzg();
        zzg.zza(arrayList);
        zzg.zzh(zzg(Settings.Global.getInt(zzedyVar.zzb.getContentResolver(), "airplane_mode_on", 0) != 0));
        zzg.zzi(com.google.android.gms.ads.internal.zzt.zzq().zzh(zzedyVar.zzb, zzedyVar.zzd));
        zzg.zzf(zzedyVar.zze.zzd());
        zzg.zze(zzedyVar.zze.zzb());
        zzg.zzb(zzedyVar.zze.zza());
        zzg.zzc(zzbfyVar);
        zzg.zzd(zzbfpVar);
        zzg.zzj(zzedyVar.zzh);
        zzg.zzk(zzg(z));
        zzg.zzg(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis());
        zzg.zzl(zzg(Settings.Global.getInt(zzedyVar.zzb.getContentResolver(), "wifi_on", 0) != 0));
        return ((zzbfu) zzg.zzaj()).zzau();
    }

    private static final int zzg(boolean z) {
        return z ? 2 : 1;
    }

    public final void zze(boolean z) {
        zzfva.zzr(this.zzc.zzb(), new zzedx(this, z), zzcfv.zzf);
    }
}
