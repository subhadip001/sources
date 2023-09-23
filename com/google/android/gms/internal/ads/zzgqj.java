package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import e.d.a.b;
import e.d.a.d;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgqj extends d {
    private final WeakReference zza;

    public zzgqj(zzbiw zzbiwVar, byte[] bArr) {
        this.zza = new WeakReference(zzbiwVar);
    }

    @Override // e.d.a.d
    public final void onCustomTabsServiceConnected(ComponentName componentName, b bVar) {
        zzbiw zzbiwVar = (zzbiw) this.zza.get();
        if (zzbiwVar != null) {
            zzbiwVar.zzc(bVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbiw zzbiwVar = (zzbiw) this.zza.get();
        if (zzbiwVar != null) {
            zzbiwVar.zzd();
        }
    }
}
