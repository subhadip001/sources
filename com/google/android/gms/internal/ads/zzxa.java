package com.google.android.gms.internal.ads;

import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzxa {
    public static void zza(Surface surface, float f2) {
        try {
            surface.setFrameRate(f2, f2 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e2) {
            zzdn.zza("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e2);
        }
    }
}
