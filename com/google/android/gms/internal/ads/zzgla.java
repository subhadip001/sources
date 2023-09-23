package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzgla extends IOException {
    private zzgly zza;
    private boolean zzb;

    public zzgla(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.zza = null;
    }

    public static zzgkz zza() {
        return new zzgkz("Protocol message tag had invalid wire type.");
    }

    public static zzgla zzb() {
        return new zzgla("Protocol message end-group tag did not match expected tag.");
    }

    public static zzgla zzc() {
        return new zzgla("Protocol message contained an invalid tag (zero).");
    }

    public static zzgla zzd() {
        return new zzgla("Protocol message had invalid UTF-8.");
    }

    public static zzgla zze() {
        return new zzgla("CodedInputStream encountered a malformed varint.");
    }

    public static zzgla zzf() {
        return new zzgla("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzgla zzg() {
        return new zzgla("Failed to parse the message.");
    }

    public static zzgla zzi() {
        return new zzgla("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static zzgla zzj() {
        return new zzgla("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzgla zzh(zzgly zzglyVar) {
        this.zza = zzglyVar;
        return this;
    }

    public final void zzk() {
        this.zzb = true;
    }

    public final boolean zzl() {
        return this.zzb;
    }

    public zzgla(String str) {
        super(str);
        this.zza = null;
    }
}
