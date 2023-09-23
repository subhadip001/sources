package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import com.google.firebase.messaging.Constants;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzxd implements DisplayManager.DisplayListener, zzxb {
    private final DisplayManager zza;
    private zzwz zzb;

    private zzxd(DisplayManager displayManager) {
        this.zza = displayManager;
    }

    public static zzxb zzc(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
        if (displayManager != null) {
            return new zzxd(displayManager);
        }
        return null;
    }

    private final Display zzd() {
        return this.zza.getDisplay(0);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i2) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i2) {
        zzwz zzwzVar = this.zzb;
        if (zzwzVar == null || i2 != 0) {
            return;
        }
        zzxf.zzb(zzwzVar.zza, zzd());
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzxb
    public final void zza() {
        this.zza.unregisterDisplayListener(this);
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzxb
    public final void zzb(zzwz zzwzVar) {
        this.zzb = zzwzVar;
        this.zza.registerDisplayListener(this, zzeg.zzC(null));
        zzxf.zzb(zzwzVar.zza, zzd());
    }
}
