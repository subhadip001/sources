package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzsk {
    public final int zza;
    public final zzsb zzb;
    private final CopyOnWriteArrayList zzc;

    public zzsk() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    private zzsk(CopyOnWriteArrayList copyOnWriteArrayList, int i2, zzsb zzsbVar, long j2) {
        this.zzc = copyOnWriteArrayList;
        this.zza = i2;
        this.zzb = zzsbVar;
    }

    private static final long zzn(long j2) {
        long zzz = zzeg.zzz(j2);
        if (zzz == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzz;
    }

    public final zzsk zza(int i2, zzsb zzsbVar, long j2) {
        return new zzsk(this.zzc, i2, zzsbVar, 0L);
    }

    public final void zzb(Handler handler, zzsl zzslVar) {
        Objects.requireNonNull(zzslVar);
        this.zzc.add(new zzsj(handler, zzslVar));
    }

    public final void zzc(final zzrx zzrxVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsj zzsjVar = (zzsj) it.next();
            final zzsl zzslVar = zzsjVar.zzb;
            zzeg.zzX(zzsjVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzse
                @Override // java.lang.Runnable
                public final void run() {
                    zzsk zzskVar = zzsk.this;
                    zzslVar.zzaf(zzskVar.zza, zzskVar.zzb, zzrxVar);
                }
            });
        }
    }

    public final void zzd(int i2, zzad zzadVar, int i3, Object obj, long j2) {
        zzc(new zzrx(1, i2, zzadVar, 0, null, zzn(j2), -9223372036854775807L));
    }

    public final void zze(final zzrs zzrsVar, final zzrx zzrxVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsj zzsjVar = (zzsj) it.next();
            final zzsl zzslVar = zzsjVar.zzb;
            zzeg.zzX(zzsjVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzsf
                @Override // java.lang.Runnable
                public final void run() {
                    zzsk zzskVar = zzsk.this;
                    zzslVar.zzag(zzskVar.zza, zzskVar.zzb, zzrsVar, zzrxVar);
                }
            });
        }
    }

    public final void zzf(zzrs zzrsVar, int i2, int i3, zzad zzadVar, int i4, Object obj, long j2, long j3) {
        zze(zzrsVar, new zzrx(1, -1, null, 0, null, zzn(j2), zzn(j3)));
    }

    public final void zzg(final zzrs zzrsVar, final zzrx zzrxVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsj zzsjVar = (zzsj) it.next();
            final zzsl zzslVar = zzsjVar.zzb;
            zzeg.zzX(zzsjVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzsi
                @Override // java.lang.Runnable
                public final void run() {
                    zzsk zzskVar = zzsk.this;
                    zzslVar.zzah(zzskVar.zza, zzskVar.zzb, zzrsVar, zzrxVar);
                }
            });
        }
    }

    public final void zzh(zzrs zzrsVar, int i2, int i3, zzad zzadVar, int i4, Object obj, long j2, long j3) {
        zzg(zzrsVar, new zzrx(1, -1, null, 0, null, zzn(j2), zzn(j3)));
    }

    public final void zzi(final zzrs zzrsVar, final zzrx zzrxVar, final IOException iOException, final boolean z) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsj zzsjVar = (zzsj) it.next();
            final zzsl zzslVar = zzsjVar.zzb;
            zzeg.zzX(zzsjVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzsg
                @Override // java.lang.Runnable
                public final void run() {
                    zzsk zzskVar = zzsk.this;
                    zzslVar.zzai(zzskVar.zza, zzskVar.zzb, zzrsVar, zzrxVar, iOException, z);
                }
            });
        }
    }

    public final void zzj(zzrs zzrsVar, int i2, int i3, zzad zzadVar, int i4, Object obj, long j2, long j3, IOException iOException, boolean z) {
        zzi(zzrsVar, new zzrx(1, -1, null, 0, null, zzn(j2), zzn(j3)), iOException, z);
    }

    public final void zzk(final zzrs zzrsVar, final zzrx zzrxVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsj zzsjVar = (zzsj) it.next();
            final zzsl zzslVar = zzsjVar.zzb;
            zzeg.zzX(zzsjVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzsh
                @Override // java.lang.Runnable
                public final void run() {
                    zzsk zzskVar = zzsk.this;
                    zzslVar.zzaj(zzskVar.zza, zzskVar.zzb, zzrsVar, zzrxVar);
                }
            });
        }
    }

    public final void zzl(zzrs zzrsVar, int i2, int i3, zzad zzadVar, int i4, Object obj, long j2, long j3) {
        zzk(zzrsVar, new zzrx(1, -1, null, 0, null, zzn(j2), zzn(j3)));
    }

    public final void zzm(zzsl zzslVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsj zzsjVar = (zzsj) it.next();
            if (zzsjVar.zzb == zzslVar) {
                this.zzc.remove(zzsjVar);
            }
        }
    }
}
