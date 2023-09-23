package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import f.a.b.a.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzjm extends zzf {
    private final zzjl zza;
    private zzdx zzb;
    private volatile Boolean zzc;
    private final zzap zzd;
    private final zzkd zze;
    private final List zzf;
    private final zzap zzg;

    public zzjm(zzfr zzfrVar) {
        super(zzfrVar);
        this.zzf = new ArrayList();
        this.zze = new zzkd(zzfrVar.zzav());
        this.zza = new zzjl(this);
        this.zzd = new zziw(this, zzfrVar);
        this.zzg = new zziy(this, zzfrVar);
    }

    private final zzq zzO(boolean z) {
        Pair zza;
        this.zzt.zzaw();
        zzdy zzh = this.zzt.zzh();
        String str = null;
        if (z) {
            zzeh zzay = this.zzt.zzay();
            if (zzay.zzt.zzm().zzb != null && (zza = zzay.zzt.zzm().zzb.zza()) != null && zza != zzew.zza) {
                str = a.q(String.valueOf(zza.second), ":", (String) zza.first);
            }
        }
        return zzh.zzj(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzP() {
        zzg();
        this.zzt.zzay().zzj().zzb("Processing queued up service tasks", Integer.valueOf(this.zzf.size()));
        for (Runnable runnable : this.zzf) {
            try {
                runnable.run();
            } catch (RuntimeException e2) {
                this.zzt.zzay().zzd().zzb("Task exception while flushing queue", e2);
            }
        }
        this.zzf.clear();
        this.zzg.zzb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzQ() {
        zzg();
        this.zze.zzb();
        zzap zzapVar = this.zzd;
        this.zzt.zzf();
        zzapVar.zzd(((Long) zzdu.zzI.zza(null)).longValue());
    }

    private final void zzR(Runnable runnable) {
        zzg();
        if (zzL()) {
            runnable.run();
            return;
        }
        int size = this.zzf.size();
        this.zzt.zzf();
        if (size >= 1000) {
            a.J(this.zzt, "Discarding data. Max runnable queue size reached");
            return;
        }
        this.zzf.add(runnable);
        this.zzg.zzd(60000L);
        zzr();
    }

    private final boolean zzS() {
        this.zzt.zzaw();
        return true;
    }

    public static /* bridge */ /* synthetic */ void zzo(zzjm zzjmVar, ComponentName componentName) {
        zzjmVar.zzg();
        if (zzjmVar.zzb != null) {
            zzjmVar.zzb = null;
            zzjmVar.zzt.zzay().zzj().zzb("Disconnected from device MeasurementService", componentName);
            zzjmVar.zzg();
            zzjmVar.zzr();
        }
    }

    public final void zzA(zzaw zzawVar, String str) {
        Preconditions.checkNotNull(zzawVar);
        zzg();
        zza();
        zzS();
        zzR(new zzjb(this, true, zzO(true), this.zzt.zzi().zzo(zzawVar), zzawVar, str));
    }

    public final void zzB(com.google.android.gms.internal.measurement.zzcf zzcfVar, zzaw zzawVar, String str) {
        zzg();
        zza();
        if (this.zzt.zzv().zzo(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE) != 0) {
            a.L(this.zzt, "Not bundling data. Service unavailable or out of date");
            this.zzt.zzv().zzS(zzcfVar, new byte[0]);
            return;
        }
        zzR(new zzix(this, zzawVar, str, zzcfVar));
    }

    public final void zzC() {
        zzg();
        zza();
        zzq zzO = zzO(false);
        zzS();
        this.zzt.zzi().zzj();
        zzR(new zziq(this, zzO));
    }

    @VisibleForTesting
    public final void zzD(zzdx zzdxVar, AbstractSafeParcelable abstractSafeParcelable, zzq zzqVar) {
        int i2;
        zzg();
        zza();
        zzS();
        this.zzt.zzf();
        int i3 = 0;
        int i4 = 100;
        while (i3 < 1001 && i4 == 100) {
            ArrayList arrayList = new ArrayList();
            List zzi = this.zzt.zzi().zzi(100);
            if (zzi != null) {
                arrayList.addAll(zzi);
                i2 = zzi.size();
            } else {
                i2 = 0;
            }
            if (abstractSafeParcelable != null && i2 < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i5);
                if (abstractSafeParcelable2 instanceof zzaw) {
                    try {
                        zzdxVar.zzk((zzaw) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e2) {
                        this.zzt.zzay().zzd().zzb("Failed to send event to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof zzkw) {
                    try {
                        zzdxVar.zzt((zzkw) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e3) {
                        this.zzt.zzay().zzd().zzb("Failed to send user property to the service", e3);
                    }
                } else if (abstractSafeParcelable2 instanceof zzac) {
                    try {
                        zzdxVar.zzn((zzac) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e4) {
                        this.zzt.zzay().zzd().zzb("Failed to send conditional user property to the service", e4);
                    }
                } else {
                    a.J(this.zzt, "Discarding data. Unrecognized parcel type.");
                }
            }
            i3++;
            i4 = i2;
        }
    }

    public final void zzE(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        zzg();
        zza();
        this.zzt.zzaw();
        zzR(new zzjc(this, true, zzO(true), this.zzt.zzi().zzn(zzacVar), new zzac(zzacVar), zzacVar));
    }

    public final void zzF(boolean z) {
        zzg();
        zza();
        if (z) {
            zzS();
            this.zzt.zzi().zzj();
        }
        if (zzM()) {
            zzR(new zzja(this, zzO(false)));
        }
    }

    public final void zzG(zzie zzieVar) {
        zzg();
        zza();
        zzR(new zziu(this, zzieVar));
    }

    public final void zzH(Bundle bundle) {
        zzg();
        zza();
        zzR(new zziv(this, zzO(false), bundle));
    }

    public final void zzI() {
        zzg();
        zza();
        zzR(new zziz(this, zzO(true)));
    }

    @VisibleForTesting
    public final void zzJ(zzdx zzdxVar) {
        zzg();
        Preconditions.checkNotNull(zzdxVar);
        this.zzb = zzdxVar;
        zzQ();
        zzP();
    }

    public final void zzK(zzkw zzkwVar) {
        zzg();
        zza();
        zzS();
        zzR(new zzio(this, zzO(true), this.zzt.zzi().zzp(zzkwVar), zzkwVar));
    }

    public final boolean zzL() {
        zzg();
        zza();
        return this.zzb != null;
    }

    public final boolean zzM() {
        zzg();
        zza();
        return !zzN() || this.zzt.zzv().zzm() >= ((Integer) zzdu.zzaf.zza(null)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzN() {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjm.zzN():boolean");
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }

    public final Boolean zzj() {
        return this.zzc;
    }

    public final void zzq() {
        zzg();
        zza();
        zzq zzO = zzO(true);
        this.zzt.zzi().zzk();
        zzR(new zzit(this, zzO));
    }

    public final void zzr() {
        zzg();
        zza();
        if (zzL()) {
            return;
        }
        if (!zzN()) {
            if (this.zzt.zzf().zzx()) {
                return;
            }
            this.zzt.zzaw();
            List<ResolveInfo> queryIntentServices = this.zzt.zzau().getPackageManager().queryIntentServices(new Intent().setClassName(this.zzt.zzau(), "com.google.android.gms.measurement.AppMeasurementService"), LogFileManager.MAX_LOG_SIZE);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                Context zzau = this.zzt.zzau();
                this.zzt.zzaw();
                intent.setComponent(new ComponentName(zzau, "com.google.android.gms.measurement.AppMeasurementService"));
                this.zza.zzb(intent);
                return;
            }
            a.J(this.zzt, "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        this.zza.zzc();
    }

    public final void zzs() {
        zzg();
        zza();
        this.zza.zzd();
        try {
            ConnectionTracker.getInstance().unbindService(this.zzt.zzau(), this.zza);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.zzb = null;
    }

    public final void zzt(com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        zzg();
        zza();
        zzR(new zzis(this, zzO(false), zzcfVar));
    }

    public final void zzu(AtomicReference atomicReference) {
        zzg();
        zza();
        zzR(new zzir(this, atomicReference, zzO(false)));
    }

    public final void zzv(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str, String str2) {
        zzg();
        zza();
        zzR(new zzje(this, str, str2, zzO(false), zzcfVar));
    }

    public final void zzw(AtomicReference atomicReference, String str, String str2, String str3) {
        zzg();
        zza();
        zzR(new zzjd(this, atomicReference, null, str2, str3, zzO(false)));
    }

    public final void zzx(AtomicReference atomicReference, boolean z) {
        zzg();
        zza();
        zzR(new zzip(this, atomicReference, zzO(false), z));
    }

    public final void zzy(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str, String str2, boolean z) {
        zzg();
        zza();
        zzR(new zzin(this, str, str2, zzO(false), z, zzcfVar));
    }

    public final void zzz(AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        zzg();
        zza();
        zzR(new zzjf(this, atomicReference, null, str2, str3, zzO(false), z));
    }
}
