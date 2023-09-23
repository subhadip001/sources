package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzayo extends IOException {
    public final zzayk zza;

    public zzayo(IOException iOException, zzayk zzaykVar, int i2) {
        super(iOException);
        this.zza = zzaykVar;
    }

    public zzayo(String str, zzayk zzaykVar, int i2) {
        super(str);
        this.zza = zzaykVar;
    }

    public zzayo(String str, IOException iOException, zzayk zzaykVar, int i2) {
        super(str, iOException);
        this.zza = zzaykVar;
    }
}
