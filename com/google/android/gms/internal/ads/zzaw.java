package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzaw {
    public final Uri zza;
    public final List zze;
    public final zzfrh zzg;
    @Deprecated
    public final List zzh;
    public final Object zzi;
    public final String zzb = null;
    public final zzaq zzc = null;
    public final zzag zzd = null;
    public final String zzf = null;

    public /* synthetic */ zzaw(Uri uri, String str, zzaq zzaqVar, zzag zzagVar, List list, String str2, zzfrh zzfrhVar, Object obj, zzav zzavVar) {
        this.zza = uri;
        this.zze = list;
        this.zzg = zzfrhVar;
        zzfre zzi = zzfrh.zzi();
        if (zzfrhVar.size() <= 0) {
            this.zzh = zzi.zzg();
            this.zzi = null;
            return;
        }
        zzaz zzazVar = (zzaz) zzfrhVar.get(0);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzaw) {
            zzaw zzawVar = (zzaw) obj;
            return this.zza.equals(zzawVar.zza) && zzeg.zzS(null, null) && zzeg.zzS(null, null) && zzeg.zzS(null, null) && this.zze.equals(zzawVar.zze) && zzeg.zzS(null, null) && this.zzg.equals(zzawVar.zzg) && zzeg.zzS(null, null);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zze.hashCode();
        return (this.zzg.hashCode() + ((hashCode + (this.zza.hashCode() * 923521)) * 961)) * 31;
    }
}
