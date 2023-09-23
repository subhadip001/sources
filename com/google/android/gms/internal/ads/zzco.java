package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.google.android.gms.common.api.Api;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzco {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private final zzfrh zzh;
    private final zzfrh zzi;
    private final int zzj;
    private final int zzk;
    private final zzfrh zzl;
    private zzfrh zzm;
    private int zzn;
    private final HashMap zzo;
    private final HashSet zzp;

    @Deprecated
    public zzco() {
        this.zza = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzb = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzc = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzd = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zze = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzf = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzg = true;
        this.zzh = zzfrh.zzo();
        this.zzi = zzfrh.zzo();
        this.zzj = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzk = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzl = zzfrh.zzo();
        this.zzm = zzfrh.zzo();
        this.zzn = 0;
        this.zzo = new HashMap();
        this.zzp = new HashSet();
    }

    public static /* bridge */ /* synthetic */ int zza(zzco zzcoVar) {
        return zzcoVar.zzn;
    }

    public static /* bridge */ /* synthetic */ int zzb(zzco zzcoVar) {
        return zzcoVar.zzf;
    }

    public static /* bridge */ /* synthetic */ int zzc(zzco zzcoVar) {
        return zzcoVar.zze;
    }

    public static /* bridge */ /* synthetic */ zzfrh zzf(zzco zzcoVar) {
        return zzcoVar.zzi;
    }

    public static /* bridge */ /* synthetic */ zzfrh zzg(zzco zzcoVar) {
        return zzcoVar.zzl;
    }

    public static /* bridge */ /* synthetic */ zzfrh zzh(zzco zzcoVar) {
        return zzcoVar.zzm;
    }

    public static /* bridge */ /* synthetic */ zzfrh zzi(zzco zzcoVar) {
        return zzcoVar.zzh;
    }

    public static /* bridge */ /* synthetic */ HashMap zzj(zzco zzcoVar) {
        return zzcoVar.zzo;
    }

    public static /* bridge */ /* synthetic */ HashSet zzk(zzco zzcoVar) {
        return zzcoVar.zzp;
    }

    public static /* bridge */ /* synthetic */ boolean zzl(zzco zzcoVar) {
        return zzcoVar.zzg;
    }

    public final zzco zzd(Context context) {
        CaptioningManager captioningManager;
        if ((zzeg.zza >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.zzn = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.zzm = zzfrh.zzp(zzeg.zzM(locale));
            }
        }
        return this;
    }

    public zzco zze(int i2, int i3, boolean z) {
        this.zze = i2;
        this.zzf = i3;
        this.zzg = true;
        return this;
    }

    public zzco(zzcp zzcpVar) {
        this.zza = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzb = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzc = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzd = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zze = zzcpVar.zzl;
        this.zzf = zzcpVar.zzm;
        this.zzg = zzcpVar.zzn;
        this.zzh = zzcpVar.zzo;
        this.zzi = zzcpVar.zzq;
        this.zzj = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzk = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzl = zzcpVar.zzu;
        this.zzm = zzcpVar.zzv;
        this.zzn = zzcpVar.zzw;
        this.zzp = new HashSet(zzcpVar.zzB);
        this.zzo = new HashMap(zzcpVar.zzA);
    }
}
