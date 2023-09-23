package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzapo extends zzaqm {
    private static final zzaqn zzi = new zzaqn();
    private final Context zzj;

    public zzapo(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i2, int i3, Context context) {
        super(zzapcVar, "zvpJLhHcREzFwRQlrOzsvLoNpjh/NkRx1SzlprPtOYrQsQFy5mJhifaboWh6aFyp", "8ERWo9yFmc7LDwD3Ell224G1/aFiu9/+mVDz7d1kThk=", zzaliVar, i2, 29);
        this.zzj = context;
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final void zza() {
        this.zze.zzm("E");
        AtomicReference zza = zzi.zza(this.zzj.getPackageName());
        if (zza.get() == null) {
            synchronized (zza) {
                if (zza.get() == null) {
                    zza.set((String) this.zzf.invoke(null, this.zzj));
                }
            }
        }
        String str = (String) zza.get();
        synchronized (this.zze) {
            this.zze.zzm(zzamn.zza(str.getBytes(), true));
        }
    }
}
