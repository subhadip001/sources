package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzcdw;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfo;
import com.google.android.gms.internal.ads.zzdwb;
import com.google.android.gms.internal.ads.zzdwl;
import com.google.android.gms.internal.ads.zzfuw;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzv implements zzfuw {
    public final /* synthetic */ zzcdw zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ zzz zzc;

    public zzv(zzz zzzVar, zzcdw zzcdwVar, long j2) {
        this.zzc = zzzVar;
        this.zza = zzcdwVar;
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zza(Throwable th) {
        zzdwl zzdwlVar;
        zzdwb zzdwbVar;
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis();
        long j2 = this.zzb;
        String message = th.getMessage();
        com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "SignalGeneratorImpl.generateSignals");
        zzz zzzVar = this.zzc;
        zzdwlVar = zzzVar.zzr;
        zzdwbVar = zzzVar.zzj;
        zzf.zzc(zzdwlVar, zzdwbVar, "sgf", new Pair("sgf_reason", message), new Pair("tqgt", String.valueOf(currentTimeMillis - j2)));
        try {
            zzcdw zzcdwVar = this.zza;
            zzcdwVar.zzb("Internal error. " + message);
        } catch (RemoteException e2) {
            zzcfi.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdwl zzdwlVar;
        zzdwb zzdwbVar;
        zzdwb zzdwbVar2;
        boolean z;
        boolean z2;
        zzdwl zzdwlVar2;
        zzdwb zzdwbVar3;
        String str;
        String str2;
        String str3;
        String str4;
        Context context;
        zzcfo zzcfoVar;
        String str5;
        String str6;
        AtomicInteger atomicInteger;
        zzdwl zzdwlVar3;
        zzdwb zzdwbVar4;
        zzdwl zzdwlVar4;
        zzdwb zzdwbVar5;
        zzal zzalVar = (zzal) obj;
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzgu)).booleanValue()) {
            try {
                this.zza.zzb("QueryInfo generation has been disabled.");
                return;
            } catch (RemoteException e2) {
                zzcfi.zzg("QueryInfo generation has been disabled.".concat(e2.toString()));
                return;
            }
        }
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis() - this.zzb;
        try {
            if (zzalVar == null) {
                this.zza.zzc(null, null, null);
                zzz zzzVar = this.zzc;
                zzdwlVar4 = zzzVar.zzr;
                zzdwbVar5 = zzzVar.zzj;
                zzf.zzc(zzdwlVar4, zzdwbVar5, "sgs", new Pair("rid", "-1"));
                return;
            }
            try {
                String optString = new JSONObject(zzalVar.zzb).optString("request_id", "");
                if (TextUtils.isEmpty(optString)) {
                    zzcfi.zzj("The request ID is empty in request JSON.");
                    this.zza.zzb("Internal error: request ID is empty in request JSON.");
                    zzz zzzVar2 = this.zzc;
                    zzdwlVar3 = zzzVar2.zzr;
                    zzdwbVar4 = zzzVar2.zzj;
                    zzf.zzc(zzdwlVar3, zzdwbVar4, "sgf", new Pair("sgf_reason", "rid_missing"));
                    return;
                }
                zzz zzzVar3 = this.zzc;
                String str7 = zzalVar.zzb;
                zzdwbVar2 = zzzVar3.zzj;
                zzz.zzF(zzzVar3, optString, str7, zzdwbVar2);
                Bundle bundle = zzalVar.zzc;
                zzz zzzVar4 = this.zzc;
                z = zzzVar4.zzw;
                if (z && bundle != null) {
                    str5 = zzzVar4.zzy;
                    if (bundle.getInt(str5, -1) == -1) {
                        zzz zzzVar5 = this.zzc;
                        str6 = zzzVar5.zzy;
                        atomicInteger = zzzVar5.zzz;
                        bundle.putInt(str6, atomicInteger.get());
                    }
                }
                zzz zzzVar6 = this.zzc;
                z2 = zzzVar6.zzv;
                if (z2 && bundle != null) {
                    str = zzzVar6.zzx;
                    if (TextUtils.isEmpty(bundle.getString(str))) {
                        str2 = this.zzc.zzB;
                        if (TextUtils.isEmpty(str2)) {
                            zzz zzzVar7 = this.zzc;
                            com.google.android.gms.ads.internal.util.zzs zzp = com.google.android.gms.ads.internal.zzt.zzp();
                            zzz zzzVar8 = this.zzc;
                            context = zzzVar8.zzg;
                            zzcfoVar = zzzVar8.zzA;
                            zzzVar7.zzB = zzp.zzc(context, zzcfoVar.zza);
                        }
                        zzz zzzVar9 = this.zzc;
                        str3 = zzzVar9.zzx;
                        str4 = zzzVar9.zzB;
                        bundle.putString(str3, str4);
                    }
                }
                this.zza.zzc(zzalVar.zza, zzalVar.zzb, bundle);
                zzz zzzVar10 = this.zzc;
                zzdwlVar2 = zzzVar10.zzr;
                zzdwbVar3 = zzzVar10.zzj;
                zzf.zzc(zzdwlVar2, zzdwbVar3, "sgs", new Pair("tqgt", String.valueOf(currentTimeMillis)));
            } catch (JSONException e3) {
                zzcfi.zzj("Failed to create JSON object from the request string.");
                zzcdw zzcdwVar = this.zza;
                String obj2 = e3.toString();
                zzcdwVar.zzb("Internal error for request JSON: " + obj2);
                zzz zzzVar11 = this.zzc;
                zzdwlVar = zzzVar11.zzr;
                zzdwbVar = zzzVar11.zzj;
                zzf.zzc(zzdwlVar, zzdwbVar, "sgf", new Pair("sgf_reason", "request_invalid"));
            }
        } catch (RemoteException e4) {
            zzcfi.zzh("", e4);
        }
    }
}
