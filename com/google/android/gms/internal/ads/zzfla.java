package com.google.android.gms.internal.ads;

import android.content.Context;
import com.arthenica.ffmpegkit.AbstractSession;
import com.google.android.gms.common.internal.ShowFirstParty;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
@ShowFirstParty
/* loaded from: classes.dex */
public final class zzfla {
    public static zzaly zza(Context context, String str, String str2) {
        return new zzfkz(context, str, str2).zzb(AbstractSession.DEFAULT_TIMEOUT_FOR_ASYNCHRONOUS_MESSAGES_IN_TRANSMIT);
    }
}
