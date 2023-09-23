package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import e.f.a;
import e.f.h;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdrk extends zzblt {
    private final Context zza;
    private final zzdng zzb;
    private zzdog zzc;
    private zzdnb zzd;

    public zzdrk(Context context, zzdng zzdngVar, zzdog zzdogVar, zzdnb zzdnbVar) {
        this.zza = context;
        this.zzb = zzdngVar;
        this.zzc = zzdogVar;
        this.zzd = zzdnbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final com.google.android.gms.ads.internal.client.zzdk zze() {
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final zzbla zzf(String str) {
        return (zzbla) this.zzb.zzh().getOrDefault(str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final IObjectWrapper zzg() {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final String zzh() {
        return this.zzb.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final String zzi(String str) {
        return (String) this.zzb.zzi().getOrDefault(str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final List zzj() {
        h zzh = this.zzb.zzh();
        h zzi = this.zzb.zzi();
        String[] strArr = new String[zzh.f2001h + zzi.f2001h];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < zzh.f2001h) {
            strArr[i4] = (String) zzh.h(i3);
            i3++;
            i4++;
        }
        while (i2 < zzi.f2001h) {
            strArr[i4] = (String) zzi.h(i2);
            i2++;
            i4++;
        }
        return Arrays.asList(strArr);
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final void zzk() {
        zzdnb zzdnbVar = this.zzd;
        if (zzdnbVar != null) {
            zzdnbVar.zzV();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final void zzl() {
        String zzA = this.zzb.zzA();
        if ("Google".equals(zzA)) {
            zzcfi.zzj("Illegal argument specified for omid partner name.");
        } else if (TextUtils.isEmpty(zzA)) {
            zzcfi.zzj("Not starting OMID session. OM partner name has not been configured.");
        } else {
            zzdnb zzdnbVar = this.zzd;
            if (zzdnbVar != null) {
                zzdnbVar.zzq(zzA, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final void zzm(String str) {
        zzdnb zzdnbVar = this.zzd;
        if (zzdnbVar != null) {
            zzdnbVar.zzy(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final void zzn() {
        zzdnb zzdnbVar = this.zzd;
        if (zzdnbVar != null) {
            zzdnbVar.zzB();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final void zzo(IObjectWrapper iObjectWrapper) {
        zzdnb zzdnbVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof View) || this.zzb.zzu() == null || (zzdnbVar = this.zzd) == null) {
            return;
        }
        zzdnbVar.zzC((View) unwrap);
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final boolean zzp() {
        zzdnb zzdnbVar = this.zzd;
        return (zzdnbVar == null || zzdnbVar.zzO()) && this.zzb.zzq() != null && this.zzb.zzr() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final boolean zzq(IObjectWrapper iObjectWrapper) {
        zzdog zzdogVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if ((unwrap instanceof ViewGroup) && (zzdogVar = this.zzc) != null && zzdogVar.zzf((ViewGroup) unwrap)) {
            this.zzb.zzr().zzaq(new zzdrj(this));
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final boolean zzr() {
        IObjectWrapper zzu = this.zzb.zzu();
        if (zzu != null) {
            com.google.android.gms.ads.internal.zzt.zzh().zzd(zzu);
            if (this.zzb.zzq() != null) {
                this.zzb.zzq().zzd("onSdkLoaded", new a());
                return true;
            }
            return true;
        }
        zzcfi.zzj("Trying to start OMID session before creation.");
        return false;
    }
}
