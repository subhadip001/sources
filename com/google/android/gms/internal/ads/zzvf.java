package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzvf extends zzvk {
    public static final /* synthetic */ int zza = 0;
    private static final zzfsp zzb = zzfsp.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzuo
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int i2 = zzvf.zza;
            if (num.intValue() == -1) {
                return num2.intValue() == -1 ? 0 : -1;
            } else if (num2.intValue() == -1) {
                return 1;
            } else {
                return num.intValue() - num2.intValue();
            }
        }
    });
    private static final zzfsp zzc = zzfsp.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzup
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int i2 = zzvf.zza;
            return 0;
        }
    });
    private final AtomicReference zzd;
    private final zzue zze;

    @Deprecated
    public zzvf() {
        zzuu zzuuVar = zzuu.zzC;
        throw null;
    }

    public static int zza(zzad zzadVar, String str, boolean z) {
        if (TextUtils.isEmpty(str) || !str.equals(zzadVar.zzd)) {
            String zzf = zzf(str);
            String zzf2 = zzf(zzadVar.zzd);
            if (zzf2 == null || zzf == null) {
                return (z && zzf2 == null) ? 1 : 0;
            } else if (zzf2.startsWith(zzf) || zzf.startsWith(zzf2)) {
                return 3;
            } else {
                return zzeg.zzag(zzf2, "-")[0].equals(zzeg.zzag(zzf, "-")[0]) ? 2 : 0;
            }
        }
        return 4;
    }

    public static String zzf(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean zzi(int i2, boolean z) {
        int i3 = i2 & 7;
        return i3 == 4 || (z && i3 == 3);
    }

    private static void zzo(zztz zztzVar, zzcp zzcpVar, Map map) {
        for (int i2 = 0; i2 < zztzVar.zzc; i2++) {
            if (((zzcm) zzcpVar.zzA.get(zztzVar.zzb(i2))) != null) {
                throw null;
            }
        }
    }

    private static final Pair zzp(int i2, zzvj zzvjVar, int[][][] iArr, zzva zzvaVar, Comparator comparator) {
        RandomAccess randomAccess;
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < 2; i3++) {
            if (i2 == zzvjVar.zzc(i3)) {
                zztz zzd = zzvjVar.zzd(i3);
                for (int i4 = 0; i4 < zzd.zzc; i4++) {
                    zzck zzb2 = zzd.zzb(i4);
                    List zza2 = zzvaVar.zza(i3, zzb2, iArr[i3][i4]);
                    int i5 = zzb2.zzb;
                    int i6 = 1;
                    boolean[] zArr = new boolean[1];
                    int i7 = 0;
                    while (i7 <= 0) {
                        zzvb zzvbVar = (zzvb) zza2.get(i7);
                        int zzb3 = zzvbVar.zzb();
                        if (!zArr[i7] && zzb3 != 0) {
                            if (zzb3 == i6) {
                                randomAccess = zzfrh.zzp(zzvbVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzvbVar);
                                for (int i8 = i7 + 1; i8 <= 0; i8++) {
                                    zzvb zzvbVar2 = (zzvb) zza2.get(i8);
                                    if (zzvbVar2.zzb() == 2 && zzvbVar.zzc(zzvbVar2)) {
                                        arrayList2.add(zzvbVar2);
                                        zArr[i8] = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i7++;
                        i6 = 1;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i9 = 0; i9 < list.size(); i9++) {
            iArr2[i9] = ((zzvb) list.get(i9)).zzc;
        }
        zzvb zzvbVar3 = (zzvb) list.get(0);
        return Pair.create(new zzvg(zzvbVar3.zzb, iArr2, 0), Integer.valueOf(zzvbVar3.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final Pair zzb(zzvj zzvjVar, int[][][] iArr, final int[] iArr2, zzsb zzsbVar, zzci zzciVar) {
        int i2;
        final boolean z;
        final String str;
        int[] iArr3;
        int length;
        zzvh zza2;
        int[][][] iArr4 = iArr;
        final zzuu zzuuVar = (zzuu) this.zzd.get();
        int i3 = 2;
        zzvg[] zzvgVarArr = new zzvg[2];
        Pair zzp = zzp(2, zzvjVar, iArr4, new zzva() { // from class: com.google.android.gms.internal.ads.zzuk
            /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
            @Override // com.google.android.gms.internal.ads.zzva
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.util.List zza(int r17, com.google.android.gms.internal.ads.zzck r18, int[] r19) {
                /*
                    r16 = this;
                    r0 = r16
                    r9 = r18
                    com.google.android.gms.internal.ads.zzuu r10 = com.google.android.gms.internal.ads.zzuu.this
                    int[] r1 = r2
                    int r2 = com.google.android.gms.internal.ads.zzvf.zza
                    r11 = r1[r17]
                    int r1 = r10.zzl
                    int r2 = r10.zzm
                    boolean r3 = r10.zzn
                    r14 = 2147483647(0x7fffffff, float:NaN)
                    if (r1 == r14) goto L80
                    if (r2 != r14) goto L1b
                    goto L83
                L1b:
                    r4 = 0
                    r5 = 2147483647(0x7fffffff, float:NaN)
                L1f:
                    int r6 = r9.zzb
                    if (r4 > 0) goto L7e
                    com.google.android.gms.internal.ads.zzad r6 = r9.zzb(r4)
                    int r7 = r6.zzr
                    if (r7 <= 0) goto L78
                    int r8 = r6.zzs
                    if (r8 <= 0) goto L78
                    if (r3 == 0) goto L40
                    if (r7 > r8) goto L35
                    r15 = 0
                    goto L36
                L35:
                    r15 = 1
                L36:
                    if (r1 > r2) goto L3a
                    r12 = 0
                    goto L3b
                L3a:
                    r12 = 1
                L3b:
                    if (r15 == r12) goto L40
                    r12 = r1
                    r15 = r2
                    goto L42
                L40:
                    r15 = r1
                    r12 = r2
                L42:
                    int r13 = r7 * r12
                    int r14 = r8 * r15
                    if (r13 < r14) goto L52
                    android.graphics.Point r8 = new android.graphics.Point
                    int r7 = com.google.android.gms.internal.ads.zzeg.zze(r14, r7)
                    r8.<init>(r15, r7)
                    goto L5c
                L52:
                    android.graphics.Point r7 = new android.graphics.Point
                    int r8 = com.google.android.gms.internal.ads.zzeg.zze(r13, r8)
                    r7.<init>(r8, r12)
                    r8 = r7
                L5c:
                    int r7 = r6.zzr
                    int r6 = r6.zzs
                    int r12 = r7 * r6
                    int r13 = r8.x
                    float r13 = (float) r13
                    r14 = 1065017672(0x3f7ae148, float:0.98)
                    float r13 = r13 * r14
                    int r13 = (int) r13
                    if (r7 < r13) goto L78
                    int r7 = r8.y
                    float r7 = (float) r7
                    float r7 = r7 * r14
                    int r7 = (int) r7
                    if (r6 < r7) goto L78
                    if (r12 >= r5) goto L78
                    r5 = r12
                L78:
                    int r4 = r4 + 1
                    r14 = 2147483647(0x7fffffff, float:NaN)
                    goto L1f
                L7e:
                    r14 = r5
                    goto L83
                L80:
                    r14 = 2147483647(0x7fffffff, float:NaN)
                L83:
                    com.google.android.gms.internal.ads.zzfre r12 = com.google.android.gms.internal.ads.zzfrh.zzi()
                    r13 = 0
                L88:
                    int r1 = r9.zzb
                    if (r13 > 0) goto Lb8
                    com.google.android.gms.internal.ads.zzad r1 = r9.zzb(r13)
                    int r1 = r1.zza()
                    r15 = 2147483647(0x7fffffff, float:NaN)
                    if (r14 == r15) goto La1
                    r2 = -1
                    if (r1 == r2) goto L9f
                    if (r1 > r14) goto L9f
                    goto La1
                L9f:
                    r8 = 0
                    goto La2
                La1:
                    r8 = 1
                La2:
                    com.google.android.gms.internal.ads.zzve r7 = new com.google.android.gms.internal.ads.zzve
                    r6 = r19[r13]
                    r1 = r7
                    r2 = r17
                    r3 = r18
                    r4 = r13
                    r5 = r10
                    r15 = r7
                    r7 = r11
                    r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                    r12.zze(r15)
                    int r13 = r13 + 1
                    goto L88
                Lb8:
                    com.google.android.gms.internal.ads.zzfrh r1 = r12.zzg()
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuk.zza(int, com.google.android.gms.internal.ads.zzck, int[]):java.util.List");
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzul
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = (List) obj;
                List list2 = (List) obj2;
                zzfqw zzj = zzfqw.zzj();
                zzvc zzvcVar = new Comparator() { // from class: com.google.android.gms.internal.ads.zzvc
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzve.zzd((zzve) obj3, (zzve) obj4);
                    }
                };
                zzfqw zzb2 = zzj.zzc((zzve) Collections.max(list, zzvcVar), (zzve) Collections.max(list2, zzvcVar), zzvcVar).zzb(list.size(), list2.size());
                zzvd zzvdVar = new Comparator() { // from class: com.google.android.gms.internal.ads.zzvd
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzve.zza((zzve) obj3, (zzve) obj4);
                    }
                };
                return zzb2.zzc((zzve) Collections.max(list, zzvdVar), (zzve) Collections.max(list2, zzvdVar), zzvdVar).zza();
            }
        });
        if (zzp != null) {
            zzvgVarArr[((Integer) zzp.second).intValue()] = (zzvg) zzp.first;
        }
        int i4 = 0;
        while (true) {
            i2 = 1;
            if (i4 >= 2) {
                z = false;
                break;
            } else if (zzvjVar.zzc(i4) == 2 && zzvjVar.zzd(i4).zzc > 0) {
                z = true;
                break;
            } else {
                i4++;
            }
        }
        Pair zzp2 = zzp(1, zzvjVar, iArr4, new zzva() { // from class: com.google.android.gms.internal.ads.zzui
            @Override // com.google.android.gms.internal.ads.zzva
            public final List zza(int i5, zzck zzckVar, int[] iArr5) {
                zzuu zzuuVar2 = zzuu.this;
                boolean z2 = z;
                int i6 = zzvf.zza;
                zzfre zzi = zzfrh.zzi();
                int i7 = 0;
                while (true) {
                    int i8 = zzckVar.zzb;
                    if (i7 <= 0) {
                        zzi.zze(new zzuq(i5, zzckVar, i7, zzuuVar2, iArr5[i7], z2));
                        i7++;
                    } else {
                        return zzi.zzg();
                    }
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzuj
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzuq) Collections.max((List) obj)).compareTo((zzuq) Collections.max((List) obj2));
            }
        });
        if (zzp2 != null) {
            zzvgVarArr[((Integer) zzp2.second).intValue()] = (zzvg) zzp2.first;
        }
        if (zzp2 == null) {
            str = null;
        } else {
            Object obj = zzp2.first;
            str = ((zzvg) obj).zza.zzb(((zzvg) obj).zzb[0]).zzd;
        }
        int i5 = 3;
        Pair zzp3 = zzp(3, zzvjVar, iArr4, new zzva() { // from class: com.google.android.gms.internal.ads.zzum
            @Override // com.google.android.gms.internal.ads.zzva
            public final List zza(int i6, zzck zzckVar, int[] iArr5) {
                zzuu zzuuVar2 = zzuu.this;
                String str2 = str;
                int i7 = zzvf.zza;
                zzfre zzi = zzfrh.zzi();
                int i8 = 0;
                while (true) {
                    int i9 = zzckVar.zzb;
                    if (i8 <= 0) {
                        zzi.zze(new zzuz(i6, zzckVar, i8, zzuuVar2, iArr5[i8], str2));
                        i8++;
                    } else {
                        return zzi.zzg();
                    }
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzun
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ((zzuz) ((List) obj2).get(0)).compareTo((zzuz) ((List) obj3).get(0));
            }
        });
        if (zzp3 != null) {
            zzvgVarArr[((Integer) zzp3.second).intValue()] = (zzvg) zzp3.first;
        }
        int i6 = 0;
        while (i6 < i3) {
            int zzc2 = zzvjVar.zzc(i6);
            if (zzc2 != i3 && zzc2 != i2 && zzc2 != i5) {
                zztz zzd = zzvjVar.zzd(i6);
                int[][] iArr5 = iArr4[i6];
                int i7 = 0;
                zzck zzckVar = null;
                int i8 = 0;
                zzur zzurVar = null;
                while (i7 < zzd.zzc) {
                    zzck zzb2 = zzd.zzb(i7);
                    int[] iArr6 = iArr5[i7];
                    zzur zzurVar2 = zzurVar;
                    int i9 = 0;
                    while (true) {
                        int i10 = zzb2.zzb;
                        if (i9 <= 0) {
                            if (zzi(iArr6[i9], zzuuVar.zzP)) {
                                zzur zzurVar3 = new zzur(zzb2.zzb(i9), iArr6[i9]);
                                if (zzurVar2 == null || zzurVar3.compareTo(zzurVar2) > 0) {
                                    i8 = i9;
                                    zzurVar2 = zzurVar3;
                                    zzckVar = zzb2;
                                }
                            }
                            i9++;
                        }
                    }
                    i7++;
                    zzurVar = zzurVar2;
                }
                zzvgVarArr[i6] = zzckVar == null ? null : new zzvg(zzckVar, new int[]{i8}, 0);
            }
            i6++;
            iArr4 = iArr;
            i3 = 2;
            i2 = 1;
            i5 = 3;
        }
        HashMap hashMap = new HashMap();
        for (int i11 = 0; i11 < 2; i11++) {
            zzo(zzvjVar.zzd(i11), zzuuVar, hashMap);
        }
        zzo(zzvjVar.zze(), zzuuVar, hashMap);
        for (int i12 = 0; i12 < 2; i12++) {
            if (((zzcm) hashMap.get(Integer.valueOf(zzvjVar.zzc(i12)))) != null) {
                throw null;
            }
        }
        int i13 = 0;
        for (int i14 = 2; i13 < i14; i14 = 2) {
            zztz zzd2 = zzvjVar.zzd(i13);
            if (zzuuVar.zzg(i13, zzd2)) {
                if (zzuuVar.zze(i13, zzd2) == null) {
                    zzvgVarArr[i13] = null;
                } else {
                    throw null;
                }
            }
            i13++;
        }
        int i15 = 0;
        for (int i16 = 2; i15 < i16; i16 = 2) {
            int zzc3 = zzvjVar.zzc(i15);
            if (zzuuVar.zzf(i15) || zzuuVar.zzB.contains(Integer.valueOf(zzc3))) {
                zzvgVarArr[i15] = null;
            }
            i15++;
        }
        zzue zzueVar = this.zze;
        zzvv zzl = zzl();
        zzfrh zzf = zzuf.zzf(zzvgVarArr);
        int i17 = 2;
        zzvh[] zzvhVarArr = new zzvh[2];
        int i18 = 0;
        while (i18 < i17) {
            zzvg zzvgVar = zzvgVarArr[i18];
            if (zzvgVar != null && (length = (iArr3 = zzvgVar.zzb).length) != 0) {
                if (length == 1) {
                    zza2 = new zzvi(zzvgVar.zza, iArr3[0], 0, 0, null);
                } else {
                    zza2 = zzueVar.zza(zzvgVar.zza, iArr3, 0, zzl, (zzfrh) zzf.get(i18));
                }
                zzvhVarArr[i18] = zza2;
            }
            i18++;
            i17 = 2;
        }
        zzjw[] zzjwVarArr = new zzjw[i17];
        for (int i19 = 0; i19 < i17; i19++) {
            zzjwVarArr[i19] = (zzuuVar.zzf(i19) || zzuuVar.zzB.contains(Integer.valueOf(zzvjVar.zzc(i19))) || (zzvjVar.zzc(i19) != -2 && zzvhVarArr[i19] == null)) ? null : zzjw.zza;
        }
        boolean z2 = zzuuVar.zzQ;
        return Pair.create(zzjwVarArr, zzvhVarArr);
    }

    public final zzuu zzc() {
        return (zzuu) this.zzd.get();
    }

    public final void zzg(zzuw zzuwVar) {
        zzuu zzuuVar = new zzuu(zzuwVar);
        if (((zzuu) this.zzd.getAndSet(zzuuVar)).equals(zzuuVar)) {
            return;
        }
        zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final boolean zzh() {
        return true;
    }

    public zzvf(Context context) {
        zzue zzueVar = new zzue();
        zzuu zzc2 = zzuu.zzc(context);
        this.zze = zzueVar;
        this.zzd = new AtomicReference(zzc2);
    }
}
