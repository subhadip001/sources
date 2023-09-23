package com.google.android.gms.internal.play_billing;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Arrays;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes.dex */
public final class zzaf extends zzx {
    public static final zzx zza = new zzaf(null, new Object[0], 0);
    public final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzaf(Object obj, Object[] objArr, int i2) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [int[]] */
    public static zzaf zzf(int i2, Object[] objArr, zzw zzwVar) {
        short[] sArr;
        Object[] objArr2;
        byte[] bArr;
        int i3 = i2;
        Object[] objArr3 = objArr;
        if (i3 == 0) {
            return (zzaf) zza;
        }
        Object obj = null;
        if (i3 == 1) {
            Object obj2 = objArr3[0];
            obj2.getClass();
            Object obj3 = objArr3[1];
            obj3.getClass();
            zzp.zza(obj2, obj3);
            return new zzaf(null, objArr3, 1);
        }
        zzm.zzb(i3, objArr3.length >> 1, "index");
        char c = 2;
        int max = Math.max(i3, 2);
        int i4 = CommonUtils.BYTES_IN_A_GIGABYTE;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            i4 = highestOneBit + highestOneBit;
            while (i4 * 0.7d < max) {
                i4 += i4;
            }
        } else if (max >= 1073741824) {
            throw new IllegalArgumentException("collection too large");
        }
        if (i3 == 1) {
            Object obj4 = objArr3[0];
            obj4.getClass();
            Object obj5 = objArr3[1];
            obj5.getClass();
            zzp.zza(obj4, obj5);
        } else {
            int i5 = i4 - 1;
            char c2 = 65535;
            if (i4 <= 128) {
                byte[] bArr2 = new byte[i4];
                Arrays.fill(bArr2, (byte) -1);
                int i6 = 0;
                for (int i7 = 0; i7 < i3; i7++) {
                    int i8 = i7 + i7;
                    int i9 = i6 + i6;
                    Object obj6 = objArr3[i8];
                    obj6.getClass();
                    Object obj7 = objArr3[i8 ^ 1];
                    obj7.getClass();
                    zzp.zza(obj6, obj7);
                    int zza2 = zzq.zza(obj6.hashCode());
                    while (true) {
                        int i10 = zza2 & i5;
                        int i11 = bArr2[i10] & 255;
                        if (i11 == 255) {
                            bArr2[i10] = (byte) i9;
                            if (i6 < i7) {
                                objArr3[i9] = obj6;
                                objArr3[i9 ^ 1] = obj7;
                            }
                            i6++;
                        } else if (obj6.equals(objArr3[i11])) {
                            int i12 = i11 ^ 1;
                            Object obj8 = objArr3[i12];
                            obj8.getClass();
                            zzv zzvVar = new zzv(obj6, obj7, obj8);
                            objArr3[i12] = obj7;
                            obj = zzvVar;
                            break;
                        } else {
                            zza2 = i10 + 1;
                        }
                    }
                }
                if (i6 == i3) {
                    bArr = bArr2;
                    c = 2;
                    obj = bArr;
                } else {
                    sArr = new Object[]{bArr2, Integer.valueOf(i6), obj};
                }
            } else if (i4 <= 32768) {
                sArr = new short[i4];
                Arrays.fill(sArr, (short) -1);
                int i13 = 0;
                for (int i14 = 0; i14 < i3; i14++) {
                    int i15 = i14 + i14;
                    int i16 = i13 + i13;
                    Object obj9 = objArr3[i15];
                    obj9.getClass();
                    Object obj10 = objArr3[i15 ^ 1];
                    obj10.getClass();
                    zzp.zza(obj9, obj10);
                    int zza3 = zzq.zza(obj9.hashCode());
                    while (true) {
                        int i17 = zza3 & i5;
                        char c3 = (char) sArr[i17];
                        if (c3 == 65535) {
                            sArr[i17] = (short) i16;
                            if (i13 < i14) {
                                objArr3[i16] = obj9;
                                objArr3[i16 ^ 1] = obj10;
                            }
                            i13++;
                        } else if (obj9.equals(objArr3[c3])) {
                            int i18 = c3 ^ 1;
                            Object obj11 = objArr3[i18];
                            obj11.getClass();
                            zzv zzvVar2 = new zzv(obj9, obj10, obj11);
                            objArr3[i18] = obj10;
                            obj = zzvVar2;
                            break;
                        } else {
                            zza3 = i17 + 1;
                        }
                    }
                }
                if (i13 != i3) {
                    c = 2;
                    objArr2 = new Object[]{sArr, Integer.valueOf(i13), obj};
                    obj = objArr2;
                }
            } else {
                sArr = new int[i4];
                Arrays.fill((int[]) sArr, -1);
                int i19 = 0;
                int i20 = 0;
                while (i19 < i3) {
                    int i21 = i19 + i19;
                    int i22 = i20 + i20;
                    Object obj12 = objArr3[i21];
                    obj12.getClass();
                    Object obj13 = objArr3[i21 ^ 1];
                    obj13.getClass();
                    zzp.zza(obj12, obj13);
                    int zza4 = zzq.zza(obj12.hashCode());
                    while (true) {
                        int i23 = zza4 & i5;
                        ?? r15 = sArr[i23];
                        if (r15 == c2) {
                            sArr[i23] = i22;
                            if (i20 < i19) {
                                objArr3[i22] = obj12;
                                objArr3[i22 ^ 1] = obj13;
                            }
                            i20++;
                        } else if (obj12.equals(objArr3[r15])) {
                            int i24 = r15 ^ 1;
                            Object obj14 = objArr3[i24];
                            obj14.getClass();
                            zzv zzvVar3 = new zzv(obj12, obj13, obj14);
                            objArr3[i24] = obj13;
                            obj = zzvVar3;
                            break;
                        } else {
                            zza4 = i23 + 1;
                            c2 = 65535;
                        }
                    }
                    i19++;
                    c2 = 65535;
                }
                if (i20 != i3) {
                    c = 2;
                    objArr2 = new Object[]{sArr, Integer.valueOf(i20), obj};
                    obj = objArr2;
                }
            }
            bArr = sArr;
            c = 2;
            obj = bArr;
        }
        boolean z = obj instanceof Object[];
        Object obj15 = obj;
        if (z) {
            Object[] objArr4 = (Object[]) obj;
            zzwVar.zzc = (zzv) objArr4[c];
            Object obj16 = objArr4[0];
            int intValue = ((Integer) objArr4[1]).intValue();
            objArr3 = Arrays.copyOf(objArr3, intValue + intValue);
            obj15 = obj16;
            i3 = intValue;
        }
        return new zzaf(obj15, objArr3, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.play_billing.zzx, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.zzc
            java.lang.Object[] r1 = r9.zzb
            int r2 = r9.zzd
            r3 = 0
            if (r10 != 0) goto Lc
        L9:
            r10 = r3
            goto L9c
        Lc:
            r4 = 1
            if (r2 != r4) goto L22
            r0 = 0
            r0 = r1[r0]
            r0.getClass()
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L9
            r10 = r1[r4]
            r10.getClass()
            goto L9c
        L22:
            if (r0 != 0) goto L25
            goto L9
        L25:
            boolean r2 = r0 instanceof byte[]
            r5 = -1
            if (r2 == 0) goto L51
            r2 = r0
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
            int r6 = r0 + (-1)
            int r0 = r10.hashCode()
            int r0 = com.google.android.gms.internal.play_billing.zzq.zza(r0)
        L38:
            r0 = r0 & r6
            r5 = r2[r0]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L9
        L41:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L9c
        L4e:
            int r0 = r0 + 1
            goto L38
        L51:
            boolean r2 = r0 instanceof short[]
            if (r2 == 0) goto L7d
            r2 = r0
            short[] r2 = (short[]) r2
            int r0 = r2.length
            int r6 = r0 + (-1)
            int r0 = r10.hashCode()
            int r0 = com.google.android.gms.internal.play_billing.zzq.zza(r0)
        L63:
            r0 = r0 & r6
            short r5 = r2[r0]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L9
        L6d:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L9c
        L7a:
            int r0 = r0 + 1
            goto L63
        L7d:
            int[] r0 = (int[]) r0
            int r2 = r0.length
            int r2 = r2 + r5
            int r6 = r10.hashCode()
            int r6 = com.google.android.gms.internal.play_billing.zzq.zza(r6)
        L89:
            r6 = r6 & r2
            r7 = r0[r6]
            if (r7 != r5) goto L90
            goto L9
        L90:
            r8 = r1[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r1[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r3
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzaf.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzx
    public final zzr zza() {
        return new zzae(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzx
    public final zzy zzc() {
        return new zzac(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzx
    public final zzy zzd() {
        return new zzad(this, new zzae(this.zzb, 0, this.zzd));
    }
}
