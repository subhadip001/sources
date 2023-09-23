package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaxv extends zzaxz {
    private final AtomicReference zza;

    public zzaxv() {
        this(null);
    }

    public static boolean zza(int i2, boolean z) {
        int i3 = i2 & 3;
        return i3 == 3 || (z && i3 == 2);
    }

    private static int zzh(int i2, int i3) {
        if (i2 == -1) {
            return i3 != -1 ? -1 : 0;
        } else if (i3 == -1) {
            return 1;
        } else {
            return i2 - i3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxz
    public final zzaxt[] zzb(zzary[] zzaryVarArr, zzaxp[] zzaxpVarArr, int[][][] iArr) {
        zzaxo zzaxoVar;
        int[] iArr2;
        ArrayList arrayList;
        boolean z;
        int i2;
        int zzh;
        int i3 = 2;
        zzaxt[] zzaxtVarArr = new zzaxt[2];
        zzaxu zzaxuVar = (zzaxu) this.zza.get();
        int i4 = 0;
        boolean z2 = false;
        while (true) {
            int i5 = 1;
            if (i4 >= i3) {
                break;
            }
            if (zzaryVarArr[i4].zzc() == i3) {
                if (!z2) {
                    zzary zzaryVar = zzaryVarArr[i4];
                    zzaxp zzaxpVar = zzaxpVarArr[i4];
                    int[][] iArr3 = iArr[i4];
                    int i6 = zzaxuVar.zzd;
                    int i7 = 0;
                    zzaxo zzaxoVar2 = null;
                    int i8 = 0;
                    int i9 = 0;
                    int i10 = -1;
                    int i11 = -1;
                    while (i7 < zzaxpVar.zzb) {
                        zzaxo zzb = zzaxpVar.zzb(i7);
                        int i12 = zzb.zza;
                        ArrayList arrayList2 = new ArrayList(i5);
                        for (int i13 = 0; i13 <= 0; i13++) {
                            arrayList2.add(Integer.valueOf(i13));
                        }
                        int[] iArr4 = iArr3[i7];
                        int i14 = i11;
                        int i15 = 0;
                        while (i15 <= 0) {
                            zzaxp zzaxpVar2 = zzaxpVar;
                            if (zza(iArr4[i15], true)) {
                                zzars zzb2 = zzb.zzb(i15);
                                if (arrayList2.contains(Integer.valueOf(i15))) {
                                    int i16 = zzb2.zzj;
                                    int i17 = zzb2.zzb;
                                    zzaxoVar = zzb;
                                    z = true;
                                } else {
                                    zzaxoVar = zzb;
                                    z = false;
                                }
                                if (true != z) {
                                    arrayList = arrayList2;
                                    i2 = 1;
                                } else {
                                    arrayList = arrayList2;
                                    i2 = 2;
                                }
                                iArr2 = iArr4;
                                boolean zza = zza(iArr4[i15], false);
                                if (zza) {
                                    i2 += 1000;
                                }
                                boolean z3 = i2 > i9;
                                if (i2 == i9) {
                                    if (zzb2.zza() != i14) {
                                        zzh = zzh(zzb2.zza(), i14);
                                    } else {
                                        zzh = zzh(zzb2.zzb, i10);
                                    }
                                    z3 = !(zza && z) ? zzh >= 0 : zzh <= 0;
                                }
                                if (z3) {
                                    i10 = zzb2.zzb;
                                    i14 = zzb2.zza();
                                    i9 = i2;
                                    i8 = i15;
                                    zzaxoVar2 = zzaxoVar;
                                }
                            } else {
                                zzaxoVar = zzb;
                                iArr2 = iArr4;
                                arrayList = arrayList2;
                            }
                            i15++;
                            zzaxpVar = zzaxpVar2;
                            zzb = zzaxoVar;
                            arrayList2 = arrayList;
                            iArr4 = iArr2;
                        }
                        i7++;
                        i11 = i14;
                        i5 = 1;
                    }
                    zzaxw zzaxwVar = zzaxoVar2 == null ? null : new zzaxw(zzaxoVar2, i8, 0, null);
                    zzaxtVarArr[i4] = zzaxwVar;
                    z2 = zzaxwVar != null;
                }
                int i18 = zzaxpVarArr[i4].zzb;
            }
            i4++;
            i3 = 2;
        }
        int i19 = 0;
        boolean z4 = false;
        while (i19 < i3) {
            if (zzaryVarArr[i19].zzc() == 1 && !z4) {
                zzaxp zzaxpVar3 = zzaxpVarArr[i19];
                int[][] iArr5 = iArr[i19];
                String str = zzaxuVar.zza;
                int i20 = -1;
                int i21 = -1;
                int i22 = 0;
                int i23 = 0;
                while (i22 < zzaxpVar3.zzb) {
                    zzaxo zzb3 = zzaxpVar3.zzb(i22);
                    int[] iArr6 = iArr5[i22];
                    int i24 = i23;
                    int i25 = i21;
                    int i26 = i20;
                    int i27 = 0;
                    while (true) {
                        int i28 = zzb3.zza;
                        if (i27 <= 0) {
                            if (zza(iArr6[i27], true)) {
                                zzars zzb4 = zzb3.zzb(i27);
                                int i29 = iArr6[i27];
                                int i30 = 1 != (zzb4.zzx & 1) ? 1 : 2;
                                if (zza(i29, false)) {
                                    i30 += 1000;
                                }
                                if (i30 > i24) {
                                    i25 = i27;
                                    i26 = i22;
                                    i24 = i30;
                                }
                            }
                            i27++;
                        }
                    }
                    i22++;
                    i20 = i26;
                    i21 = i25;
                    i23 = i24;
                }
                zzaxw zzaxwVar2 = i20 == -1 ? null : new zzaxw(zzaxpVar3.zzb(i20), i21, 0, null);
                zzaxtVarArr[i19] = zzaxwVar2;
                z4 = zzaxwVar2 != null;
            }
            i19++;
            i3 = 2;
        }
        return zzaxtVarArr;
    }

    public zzaxv(zzaya zzayaVar) {
        this.zza = new AtomicReference(new zzaxu());
    }
}
