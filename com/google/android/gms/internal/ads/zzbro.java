package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.common.util.Predicate;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbro implements zzbrg, zzbre {
    private final zzcli zza;

    public zzbro(Context context, zzcfo zzcfoVar, zzaoc zzaocVar, com.google.android.gms.ads.internal.zza zzaVar) {
        com.google.android.gms.ads.internal.zzt.zzz();
        zzcli zza = zzclu.zza(context, zzcmx.zza(), "", false, false, null, null, zzcfoVar, null, null, null, zzbdl.zza(), null, null);
        this.zza = zza;
        ((View) zza).setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        if (zzcfb.zzs()) {
            runnable.run();
        } else {
            com.google.android.gms.ads.internal.util.zzs.zza.post(runnable);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zza(final String str) {
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbrj
            @Override // java.lang.Runnable
            public final void run() {
                zzbro.this.zzm(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final /* synthetic */ void zzb(String str, String str2) {
        zzbrd.zzc(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbrg
    public final void zzc() {
        this.zza.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final /* synthetic */ void zzd(String str, Map map) {
        zzbrd.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbrd.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbrg
    public final void zzf(final String str) {
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbrk
            @Override // java.lang.Runnable
            public final void run() {
                zzbro.this.zzn(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbrg
    public final void zzg(final String str) {
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbrm
            @Override // java.lang.Runnable
            public final void run() {
                zzbro.this.zzo(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbrg
    public final void zzh(String str) {
        final String format = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbrl
            @Override // java.lang.Runnable
            public final void run() {
                zzbro.this.zzp(format);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbrg
    public final boolean zzi() {
        return this.zza.zzaB();
    }

    @Override // com.google.android.gms.internal.ads.zzbrg
    public final zzbsn zzj() {
        return new zzbsn(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbrg
    public final void zzk(final zzbru zzbruVar) {
        this.zza.zzP().zzF(new zzcmu(null) { // from class: com.google.android.gms.internal.ads.zzbrh
            @Override // com.google.android.gms.internal.ads.zzcmu
            public final void zza() {
                zzbru zzbruVar2 = zzbru.this;
                final zzbsl zzbslVar = zzbruVar2.zza;
                final zzbsk zzbskVar = zzbruVar2.zzb;
                final zzbrg zzbrgVar = zzbruVar2.zzc;
                com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbrt
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbsl.this.zzi(zzbskVar, zzbrgVar);
                    }
                }, 10000L);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzbrd.zzd(this, str, jSONObject);
    }

    public final /* synthetic */ void zzm(String str) {
        this.zza.zza(str);
    }

    public final /* synthetic */ void zzn(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    public final /* synthetic */ void zzo(String str) {
        this.zza.loadUrl(str);
    }

    public final /* synthetic */ void zzp(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final void zzq(String str, zzbol zzbolVar) {
        this.zza.zzaf(str, new zzbrn(this, zzbolVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final void zzr(String str, final zzbol zzbolVar) {
        this.zza.zzax(str, new Predicate() { // from class: com.google.android.gms.internal.ads.zzbri
            @Override // com.google.android.gms.common.util.Predicate
            public final boolean apply(Object obj) {
                zzbol zzbolVar2;
                zzbol zzbolVar3 = zzbol.this;
                zzbol zzbolVar4 = (zzbol) obj;
                if (zzbolVar4 instanceof zzbrn) {
                    zzbolVar2 = ((zzbrn) zzbolVar4).zzb;
                    return zzbolVar2.equals(zzbolVar3);
                }
                return false;
            }
        });
    }
}
