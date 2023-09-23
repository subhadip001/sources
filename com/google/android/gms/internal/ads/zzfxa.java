package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfxa {
    private final ConcurrentMap zza = new ConcurrentHashMap();
    private zzfwx zzb;
    private final Class zzc;

    private zzfxa(Class cls) {
        this.zzc = cls;
    }

    public static zzfxa zzc(Class cls) {
        return new zzfxa(cls);
    }

    public final zzfwx zza(Object obj, zzgft zzgftVar) {
        byte[] array;
        if (zzgftVar.zzi() == 3) {
            int zzj = zzgftVar.zzj() - 2;
            if (zzj != 1) {
                if (zzj != 2) {
                    if (zzj == 3) {
                        array = zzfwi.zza;
                    } else if (zzj != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                }
                array = ByteBuffer.allocate(5).put((byte) 0).putInt(zzgftVar.zza()).array();
            } else {
                array = ByteBuffer.allocate(5).put((byte) 1).putInt(zzgftVar.zza()).array();
            }
            zzfwx zzfwxVar = new zzfwx(obj, array, zzgftVar.zzi(), zzgftVar.zzj(), zzgftVar.zza());
            ArrayList arrayList = new ArrayList();
            arrayList.add(zzfwxVar);
            zzfwz zzfwzVar = new zzfwz(zzfwxVar.zzb(), null);
            List list = (List) this.zza.put(zzfwzVar, Collections.unmodifiableList(arrayList));
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(list);
                arrayList2.add(zzfwxVar);
                this.zza.put(zzfwzVar, Collections.unmodifiableList(arrayList2));
            }
            return zzfwxVar;
        }
        throw new GeneralSecurityException("only ENABLED key is allowed");
    }

    public final zzfwx zzb() {
        return this.zzb;
    }

    public final Class zzd() {
        return this.zzc;
    }

    public final List zze(byte[] bArr) {
        List list = (List) this.zza.get(new zzfwz(bArr, null));
        return list != null ? list : Collections.emptyList();
    }

    public final void zzf(zzfwx zzfwxVar) {
        if (zzfwxVar.zzc() == 3) {
            if (!zze(zzfwxVar.zzb()).isEmpty()) {
                this.zzb = zzfwxVar;
                return;
            }
            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
        }
        throw new IllegalArgumentException("the primary entry has to be ENABLED");
    }
}
