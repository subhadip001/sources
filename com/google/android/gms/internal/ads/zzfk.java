package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzfk extends zzes {
    public final zzew zzb;
    public final int zzc;

    public zzfk(zzew zzewVar, int i2, int i3) {
        super(zzb(2008, 1));
        this.zzb = zzewVar;
        this.zzc = 1;
    }

    public static zzfk zza(IOException iOException, zzew zzewVar, int i2) {
        String message = iOException.getMessage();
        int i3 = 2001;
        if (iOException instanceof SocketTimeoutException) {
            i3 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i3 = 1004;
        } else if (message != null && zzfoa.zza(message).matches("cleartext.*not permitted.*")) {
            i3 = 2007;
        }
        if (i3 == 2007) {
            return new zzfj(iOException, zzewVar);
        }
        return new zzfk(iOException, zzewVar, i3, i2);
    }

    private static int zzb(int i2, int i3) {
        return i2 == 2000 ? i3 != 1 ? 2000 : 2001 : i2;
    }

    public zzfk(IOException iOException, zzew zzewVar, int i2, int i3) {
        super(iOException, zzb(i2, i3));
        this.zzb = zzewVar;
        this.zzc = i3;
    }

    public zzfk(String str, zzew zzewVar, int i2, int i3) {
        super(str, zzb(i2, i3));
        this.zzb = zzewVar;
        this.zzc = i3;
    }

    public zzfk(String str, IOException iOException, zzew zzewVar, int i2, int i3) {
        super(str, iOException, zzb(i2, i3));
        this.zzb = zzewVar;
        this.zzc = i3;
    }
}
