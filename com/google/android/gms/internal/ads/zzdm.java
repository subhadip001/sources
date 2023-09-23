package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdm {
    private final zzcx zza;
    private final zzdg zzb;
    private final zzdk zzc;
    private final CopyOnWriteArraySet zzd;
    private final ArrayDeque zze;
    private final ArrayDeque zzf;
    private boolean zzg;

    public zzdm(Looper looper, zzcx zzcxVar, zzdk zzdkVar) {
        this(new CopyOnWriteArraySet(), looper, zzcxVar, zzdkVar);
    }

    public static /* synthetic */ boolean zzg(zzdm zzdmVar, Message message) {
        Iterator it = zzdmVar.zzd.iterator();
        while (it.hasNext()) {
            ((zzdl) it.next()).zzb(zzdmVar.zzc);
            if (zzdmVar.zzb.zzf(0)) {
                return true;
            }
        }
        return true;
    }

    public final zzdm zza(Looper looper, zzdk zzdkVar) {
        return new zzdm(this.zzd, looper, this.zza, zzdkVar);
    }

    public final void zzb(Object obj) {
        if (this.zzg) {
            return;
        }
        this.zzd.add(new zzdl(obj));
    }

    public final void zzc() {
        if (this.zzf.isEmpty()) {
            return;
        }
        if (!this.zzb.zzf(0)) {
            zzdg zzdgVar = this.zzb;
            zzdgVar.zzj(zzdgVar.zza(0));
        }
        boolean isEmpty = this.zze.isEmpty();
        this.zze.addAll(this.zzf);
        this.zzf.clear();
        if (!isEmpty) {
            return;
        }
        while (!this.zze.isEmpty()) {
            ((Runnable) this.zze.peekFirst()).run();
            this.zze.removeFirst();
        }
    }

    public final void zzd(final int i2, final zzdj zzdjVar) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.zzd);
        this.zzf.add(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdi
            @Override // java.lang.Runnable
            public final void run() {
                CopyOnWriteArraySet copyOnWriteArraySet2 = copyOnWriteArraySet;
                int i3 = i2;
                zzdj zzdjVar2 = zzdjVar;
                Iterator it = copyOnWriteArraySet2.iterator();
                while (it.hasNext()) {
                    ((zzdl) it.next()).zza(i3, zzdjVar2);
                }
            }
        });
    }

    public final void zze() {
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            ((zzdl) it.next()).zzc(this.zzc);
        }
        this.zzd.clear();
        this.zzg = true;
    }

    public final void zzf(Object obj) {
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            zzdl zzdlVar = (zzdl) it.next();
            if (zzdlVar.zza.equals(obj)) {
                zzdlVar.zzc(this.zzc);
                this.zzd.remove(zzdlVar);
            }
        }
    }

    private zzdm(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, zzcx zzcxVar, zzdk zzdkVar) {
        this.zza = zzcxVar;
        this.zzd = copyOnWriteArraySet;
        this.zzc = zzdkVar;
        this.zze = new ArrayDeque();
        this.zzf = new ArrayDeque();
        this.zzb = zzcxVar.zzb(looper, new Handler.Callback() { // from class: com.google.android.gms.internal.ads.zzdh
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                zzdm.zzg(zzdm.this, message);
                return true;
            }
        });
    }
}
