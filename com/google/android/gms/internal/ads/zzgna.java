package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgna implements Iterator {
    public final /* synthetic */ zzgne zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    private final Iterator zza() {
        Map map;
        if (this.zzd == null) {
            map = this.zza.zzc;
            this.zzd = map.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i2 = this.zzb + 1;
        list = this.zza.zzb;
        if (i2 >= list.size()) {
            map = this.zza.zzc;
            return !map.isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        List list;
        List list2;
        this.zzc = true;
        int i2 = this.zzb + 1;
        this.zzb = i2;
        list = this.zza.zzb;
        if (i2 < list.size()) {
            list2 = this.zza.zzb;
            return (Map.Entry) list2.get(this.zzb);
        }
        return (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (this.zzc) {
            this.zzc = false;
            this.zza.zzn();
            int i2 = this.zzb;
            list = this.zza.zzb;
            if (i2 < list.size()) {
                zzgne zzgneVar = this.zza;
                int i3 = this.zzb;
                this.zzb = i3 - 1;
                zzgneVar.zzl(i3);
                return;
            }
            zza().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
