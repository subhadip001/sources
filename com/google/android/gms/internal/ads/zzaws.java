package com.google.android.gms.internal.ads;

import android.net.Uri;
import f.a.b.a.a;
import java.io.EOFException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaws {
    private final zzatv[] zza;
    private final zzatw zzb;
    private zzatv zzc;

    public zzaws(zzatv[] zzatvVarArr, zzatw zzatwVar) {
        this.zza = zzatvVarArr;
        this.zzb = zzatwVar;
    }

    public final void zza() {
        if (this.zzc != null) {
            this.zzc = null;
        }
    }

    public final zzatv zzb(zzatu zzatuVar, Uri uri) {
        zzatv zzatvVar = this.zzc;
        if (zzatvVar != null) {
            return zzatvVar;
        }
        zzatv[] zzatvVarArr = this.zza;
        int length = zzatvVarArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            zzatv zzatvVar2 = zzatvVarArr[i2];
            try {
            } catch (EOFException unused) {
            } catch (Throwable th) {
                zzatuVar.zze();
                throw th;
            }
            if (zzatvVar2.zzg(zzatuVar)) {
                this.zzc = zzatvVar2;
                zzatuVar.zze();
                break;
            }
            continue;
            zzatuVar.zze();
            i2++;
        }
        zzatv zzatvVar3 = this.zzc;
        if (zzatvVar3 != null) {
            zzatvVar3.zzd(this.zzb);
            return this.zzc;
        }
        throw new zzaxq(a.q("None of the available extractors (", zzazn.zzk(this.zza), ") could read the stream."), uri);
    }
}
