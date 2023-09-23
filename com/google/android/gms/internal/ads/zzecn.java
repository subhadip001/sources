package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.util.IOUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzecn extends zzbzl {
    private final Context zza;
    private final Executor zzb;
    private final zzfvk zzc;
    private final zzcaf zzd;
    private final zzcsl zze;
    private final ArrayDeque zzf;
    private final zzfhs zzg;
    private final zzcag zzh;
    private final zzecs zzi;

    public zzecn(Context context, Executor executor, zzfvk zzfvkVar, zzcag zzcagVar, zzcsl zzcslVar, zzcaf zzcafVar, ArrayDeque arrayDeque, zzecs zzecsVar, zzfhs zzfhsVar, byte[] bArr) {
        zzbhy.zzc(context);
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfvkVar;
        this.zzh = zzcagVar;
        this.zzd = zzcafVar;
        this.zze = zzcslVar;
        this.zzf = arrayDeque;
        this.zzi = zzecsVar;
        this.zzg = zzfhsVar;
    }

    public static /* synthetic */ void zzk(zzecn zzecnVar) {
        zzcfy.zza(zzecnVar.zzd.zza(), "persistFlags");
    }

    private final synchronized zzeck zzl(String str) {
        Iterator it = this.zzf.iterator();
        while (it.hasNext()) {
            zzeck zzeckVar = (zzeck) it.next();
            if (zzeckVar.zzd.equals(str)) {
                it.remove();
                return zzeckVar;
            }
        }
        return null;
    }

    private final synchronized zzeck zzm(String str) {
        Iterator it = this.zzf.iterator();
        while (it.hasNext()) {
            zzeck zzeckVar = (zzeck) it.next();
            if (zzeckVar.zzc.equals(str)) {
                it.remove();
                return zzeckVar;
            }
        }
        return null;
    }

    private static zzfvj zzn(zzfvj zzfvjVar, zzfge zzfgeVar, zzbsz zzbszVar, zzfhq zzfhqVar, zzfhg zzfhgVar) {
        zzbsp zza = zzbszVar.zza("AFMA_getAdDictionary", zzbsw.zza, new zzbsr() { // from class: com.google.android.gms.internal.ads.zzece
            @Override // com.google.android.gms.internal.ads.zzbsr
            public final Object zza(JSONObject jSONObject) {
                return new zzbzx(jSONObject);
            }
        });
        zzfhp.zzc(zzfvjVar, zzfhgVar);
        zzffj zza2 = zzfgeVar.zzb(zzffy.BUILD_URL, zzfvjVar).zzf(zza).zza();
        zzfhp.zzb(zza2, zzfhqVar, zzfhgVar);
        return zza2;
    }

    private static zzfvj zzo(zzbzu zzbzuVar, zzfge zzfgeVar, final zzett zzettVar) {
        zzfuh zzfuhVar = new zzfuh() { // from class: com.google.android.gms.internal.ads.zzeby
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                return zzett.this.zzb().zza(com.google.android.gms.ads.internal.client.zzaw.zzb().zzg((Bundle) obj));
            }
        };
        return zzfgeVar.zzb(zzffy.GMS_SIGNALS, zzfva.zzi(zzbzuVar.zza)).zzf(zzfuhVar).zze(new zzffh() { // from class: com.google.android.gms.internal.ads.zzebz
            @Override // com.google.android.gms.internal.ads.zzffh
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                com.google.android.gms.ads.internal.util.zze.zza("Ad request signals:");
                com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).zza();
    }

    private final synchronized void zzp(zzeck zzeckVar) {
        zzq();
        this.zzf.addLast(zzeckVar);
    }

    private final synchronized void zzq() {
        int intValue = ((Long) zzbju.zzc.zze()).intValue();
        while (this.zzf.size() >= intValue) {
            this.zzf.removeFirst();
        }
    }

    private final void zzr(zzfvj zzfvjVar, zzbzq zzbzqVar) {
        zzfva.zzr(zzfva.zzn(zzfvjVar, new zzfuh() { // from class: com.google.android.gms.internal.ads.zzech
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                final InputStream inputStream = (InputStream) obj;
                ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
                final ParcelFileDescriptor parcelFileDescriptor2 = createPipe[1];
                zzcfv.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfcw
                    @Override // java.lang.Runnable
                    public final void run() {
                        InputStream inputStream2 = inputStream;
                        try {
                            ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor2);
                            try {
                                IOUtils.copyStream(inputStream2, autoCloseOutputStream);
                                autoCloseOutputStream.close();
                                if (inputStream2 != null) {
                                    inputStream2.close();
                                }
                            } catch (Throwable th) {
                                try {
                                    autoCloseOutputStream.close();
                                } catch (Throwable th2) {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                }
                                throw th;
                            }
                        } catch (IOException unused) {
                        }
                    }
                });
                return zzfva.zzi(parcelFileDescriptor);
            }
        }, zzcfv.zza), new zzecj(this, zzbzqVar), zzcfv.zzf);
    }

    public final zzfvj zzb(final zzbzu zzbzuVar, int i2) {
        if (!((Boolean) zzbju.zza.zze()).booleanValue()) {
            return zzfva.zzh(new Exception("Split request is disabled."));
        }
        zzfdu zzfduVar = zzbzuVar.zzi;
        if (zzfduVar == null) {
            return zzfva.zzh(new Exception("Pool configuration missing from request."));
        }
        if (zzfduVar.zzc != 0 && zzfduVar.zzd != 0) {
            zzbsz zzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(this.zza, zzcfo.zza(), this.zzg);
            zzett zzp = this.zze.zzp(zzbzuVar, i2);
            zzfge zzc = zzp.zzc();
            final zzfvj zzo = zzo(zzbzuVar, zzc, zzp);
            zzfhq zzd = zzp.zzd();
            final zzfhg zza = zzfhf.zza(this.zza, 9);
            final zzfvj zzn = zzn(zzo, zzc, zzb, zzd, zza);
            return zzc.zza(zzffy.GET_URL_AND_CACHE_KEY, zzo, zzn).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzecd
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzecn.this.zzj(zzn, zzo, zzbzuVar, zza);
                }
            }).zza();
        }
        return zzfva.zzh(new Exception("Caching is disabled."));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzfvj zzc(com.google.android.gms.internal.ads.zzbzu r17, int r18) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzecn.zzc(com.google.android.gms.internal.ads.zzbzu, int):com.google.android.gms.internal.ads.zzfvj");
    }

    public final zzfvj zzd(zzbzu zzbzuVar, int i2) {
        zzbsz zzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(this.zza, zzcfo.zza(), this.zzg);
        if (!((Boolean) zzbjz.zza.zze()).booleanValue()) {
            return zzfva.zzh(new Exception("Signal collection disabled."));
        }
        zzett zzp = this.zze.zzp(zzbzuVar, i2);
        final zzete zza = zzp.zza();
        return zzp.zzc().zzb(zzffy.GET_SIGNALS, zzfva.zzi(zzbzuVar.zza)).zzf(new zzfuh() { // from class: com.google.android.gms.internal.ads.zzecf
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                return zzete.this.zza(com.google.android.gms.ads.internal.client.zzaw.zzb().zzg((Bundle) obj));
            }
        }).zzb(zzffy.JS_SIGNALS).zzf(zzb.zza("google.afma.request.getSignals", zzbsw.zza, zzbsw.zzb)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbzm
    public final void zze(zzbzu zzbzuVar, zzbzq zzbzqVar) {
        zzr(zzb(zzbzuVar, Binder.getCallingUid()), zzbzqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbzm
    public final void zzf(zzbzu zzbzuVar, zzbzq zzbzqVar) {
        zzr(zzd(zzbzuVar, Binder.getCallingUid()), zzbzqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbzm
    public final void zzg(zzbzu zzbzuVar, zzbzq zzbzqVar) {
        zzfvj zzc = zzc(zzbzuVar, Binder.getCallingUid());
        zzr(zzc, zzbzqVar);
        if (((Boolean) zzbjm.zzg.zze()).booleanValue()) {
            zzc.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeca
                @Override // java.lang.Runnable
                public final void run() {
                    zzecn.zzk(zzecn.this);
                }
            }, this.zzc);
        } else {
            zzc.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeca
                @Override // java.lang.Runnable
                public final void run() {
                    zzecn.zzk(zzecn.this);
                }
            }, this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzm
    public final void zzh(String str, zzbzq zzbzqVar) {
        zzr(zzi(str), zzbzqVar);
    }

    public final zzfvj zzi(String str) {
        zzeck zzl;
        if (!((Boolean) zzbju.zza.zze()).booleanValue()) {
            return zzfva.zzh(new Exception("Split request is disabled."));
        }
        zzeci zzeciVar = new zzeci(this);
        if (((Boolean) zzbju.zzd.zze()).booleanValue()) {
            zzl = zzm(str);
        } else {
            zzl = zzl(str);
        }
        if (zzl == null) {
            return zzfva.zzh(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str))));
        }
        return zzfva.zzi(zzeciVar);
    }

    public final /* synthetic */ InputStream zzj(zzfvj zzfvjVar, zzfvj zzfvjVar2, zzbzu zzbzuVar, zzfhg zzfhgVar) {
        String zzc = ((zzbzx) zzfvjVar.get()).zzc();
        String str = zzbzuVar.zzh;
        zzp(new zzeck((zzbzx) zzfvjVar.get(), (JSONObject) zzfvjVar2.get(), str, zzc, zzfhgVar));
        return new ByteArrayInputStream(zzc.getBytes(zzfog.zzc));
    }
}
