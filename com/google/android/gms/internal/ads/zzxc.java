package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.WindowManager;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzxc implements zzxb {
    private final WindowManager zza;

    private zzxc(WindowManager windowManager) {
        this.zza = windowManager;
    }

    public static zzxb zzc(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            return new zzxc(windowManager);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxb
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzxb
    public final void zzb(zzwz zzwzVar) {
        zzxf.zzb(zzwzVar.zza, this.zza.getDefaultDisplay());
    }
}
