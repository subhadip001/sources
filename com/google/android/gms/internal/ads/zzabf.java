package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzabf {
    private final ByteArrayOutputStream zza;
    private final DataOutputStream zzb;

    public zzabf() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.zza = byteArrayOutputStream;
        this.zzb = new DataOutputStream(byteArrayOutputStream);
    }

    private static void zzb(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] zza(zzabe zzabeVar) {
        this.zza.reset();
        try {
            zzb(this.zzb, zzabeVar.zza);
            String str = zzabeVar.zzb;
            if (str == null) {
                str = "";
            }
            zzb(this.zzb, str);
            this.zzb.writeLong(zzabeVar.zzc);
            this.zzb.writeLong(zzabeVar.zzd);
            this.zzb.write(zzabeVar.zze);
            this.zzb.flush();
            return this.zza.toByteArray();
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }
}
