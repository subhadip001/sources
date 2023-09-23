package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcki extends zzek {
    private final Context zza;
    private final zzer zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzbcx zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private long zzn;
    private zzfvj zzo;
    private final AtomicLong zzp;
    private final zzckl zzq;

    public zzcki(Context context, zzer zzerVar, String str, int i2, zzft zzftVar, zzckl zzcklVar, byte[] bArr) {
        super(false);
        this.zza = context;
        this.zzb = zzerVar;
        this.zzq = zzcklVar;
        this.zzc = str;
        this.zzd = i2;
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzn = 0L;
        this.zzp = new AtomicLong(-1L);
        this.zzo = null;
        this.zze = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbB)).booleanValue();
        zzf(zzftVar);
    }

    private final boolean zzr() {
        if (this.zze) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdr)).booleanValue() || this.zzl) {
                return ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzds)).booleanValue() && !this.zzm;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i2, int i3) {
        int zza;
        if (this.zzg) {
            InputStream inputStream = this.zzf;
            if (inputStream != null) {
                zza = inputStream.read(bArr, i2, i3);
            } else {
                zza = this.zzb.zza(bArr, i2, i3);
            }
            if (!this.zze || this.zzf != null) {
                zzg(zza);
            }
            return zza;
        }
        throw new IOException("Attempt to read closed GcacheDataSource.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e8  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.StringBuilder] */
    @Override // com.google.android.gms.internal.ads.zzer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzb(com.google.android.gms.internal.ads.zzew r14) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcki.zzb(com.google.android.gms.internal.ads.zzew):long");
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final void zzd() {
        if (!this.zzg) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        boolean z = false;
        this.zzg = false;
        this.zzh = null;
        z = (this.zze && this.zzf == null) ? true : true;
        InputStream inputStream = this.zzf;
        if (inputStream != null) {
            IOUtils.closeQuietly(inputStream);
            this.zzf = null;
        } else {
            this.zzb.zzd();
        }
        if (z) {
            zzh();
        }
    }

    public final long zzk() {
        return this.zzn;
    }

    public final long zzl() {
        if (this.zzi == null) {
            return -1L;
        }
        if (this.zzp.get() != -1) {
            return this.zzp.get();
        }
        synchronized (this) {
            if (this.zzo == null) {
                this.zzo = zzcfv.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzckh
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzcki.this.zzm();
                    }
                });
            }
        }
        if (this.zzo.isDone()) {
            try {
                this.zzp.compareAndSet(-1L, ((Long) this.zzo.get()).longValue());
                return this.zzp.get();
            } catch (InterruptedException | ExecutionException unused) {
                return -1L;
            }
        }
        return -1L;
    }

    public final /* synthetic */ Long zzm() {
        return Long.valueOf(com.google.android.gms.ads.internal.zzt.zzc().zza(this.zzi));
    }

    public final boolean zzn() {
        return this.zzj;
    }

    public final boolean zzo() {
        return this.zzm;
    }

    public final boolean zzp() {
        return this.zzl;
    }

    public final boolean zzq() {
        return this.zzk;
    }
}
