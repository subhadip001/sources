package com.google.android.gms.internal.ads;

import f.a.b.a.a;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfm extends zzfk {
    public final int zzd;
    public final String zze;
    public final Map zzf;
    public final byte[] zzg;

    public zzfm(int i2, String str, IOException iOException, Map map, zzew zzewVar, byte[] bArr) {
        super(a.i("Response code: ", i2), iOException, zzewVar, 2004, 1);
        this.zzd = i2;
        this.zze = str;
        this.zzf = map;
        this.zzg = bArr;
    }
}
