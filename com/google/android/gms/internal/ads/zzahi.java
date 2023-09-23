package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzahi implements zzys {
    public static final zzyz zza = new zzyz() { // from class: com.google.android.gms.internal.ads.zzahf
        @Override // com.google.android.gms.internal.ads.zzyz
        public final zzys[] zza() {
            zzyz zzyzVar = zzahi.zza;
            return new zzys[]{new zzahi(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzyz
        public final /* synthetic */ zzys[] zzb(Uri uri, Map map) {
            return zzyy.zza(this, uri, map);
        }
    };
    private final List zzb;
    private final zzdy zzc;
    private final SparseIntArray zzd;
    private final zzahl zze;
    private final SparseArray zzf;
    private final SparseBooleanArray zzg;
    private final SparseBooleanArray zzh;
    private final zzahe zzi;
    private zzahd zzj;
    private zzyv zzk;
    private int zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzp;
    private int zzq;

    public zzahi() {
        this(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0194, code lost:
        if (r1 == false) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.zzys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(com.google.android.gms.internal.ads.zzyt r19, com.google.android.gms.internal.ads.zzzs r20) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahi.zza(com.google.android.gms.internal.ads.zzyt, com.google.android.gms.internal.ads.zzzs):int");
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzb(zzyv zzyvVar) {
        this.zzk = zzyvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzc(long j2, long j3) {
        zzahd zzahdVar;
        int size = this.zzb.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzee zzeeVar = (zzee) this.zzb.get(i2);
            if (zzeeVar.zze() != -9223372036854775807L) {
                long zzc = zzeeVar.zzc();
                if (zzc != -9223372036854775807L) {
                    if (zzc != 0) {
                        if (zzc == j3) {
                        }
                    }
                }
            }
            zzeeVar.zzf(j3);
        }
        if (j3 != 0 && (zzahdVar = this.zzj) != null) {
            zzahdVar.zzd(j3);
        }
        this.zzc.zzC(0);
        this.zzd.clear();
        for (int i3 = 0; i3 < this.zzf.size(); i3++) {
            ((zzahn) this.zzf.valueAt(i3)).zzc();
        }
        this.zzp = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
        r2 = r2 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzd(com.google.android.gms.internal.ads.zzyt r7) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzdy r0 = r6.zzc
            byte[] r0 = r0.zzH()
            com.google.android.gms.internal.ads.zzym r7 = (com.google.android.gms.internal.ads.zzym) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.zzm(r0, r1, r2, r1)
            r2 = 0
        Lf:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L2b
            r3 = 0
        L14:
            r4 = 5
            if (r3 >= r4) goto L26
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L23
            int r2 = r2 + 1
            goto Lf
        L23:
            int r3 = r3 + 1
            goto L14
        L26:
            r7.zzo(r2, r1)
            r7 = 1
            return r7
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahi.zzd(com.google.android.gms.internal.ads.zzyt):boolean");
    }

    public zzahi(int i2) {
        this(1, 0, 112800);
    }

    public zzahi(int i2, int i3, int i4) {
        zzee zzeeVar = new zzee(0L);
        this.zze = new zzafx(0);
        this.zzb = Collections.singletonList(zzeeVar);
        this.zzc = new zzdy(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzg = sparseBooleanArray;
        this.zzh = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzf = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzi = new zzahe(112800);
        this.zzk = zzyv.zza;
        this.zzq = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.zzf.put(sparseArray2.keyAt(i5), (zzahn) sparseArray2.valueAt(i5));
        }
        this.zzf.put(0, new zzaha(new zzahg(this)));
    }
}
