package com.google.android.gms.internal.ads;

import android.util.Pair;
import f.a.b.a.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaed {
    private static final byte[] zza = zzeg.zzZ("OpusHead");

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ae, code lost:
        if (r3 != 13) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair zza(com.google.android.gms.internal.ads.zzadv r11) {
        /*
            com.google.android.gms.internal.ads.zzdy r11 = r11.zza
            r0 = 8
            r11.zzF(r0)
            r1 = 0
            r2 = r1
            r3 = r2
        La:
            int r4 = r11.zza()
            if (r4 < r0) goto Lda
            int r4 = r11.zzc()
            int r5 = r11.zze()
            int r6 = r11.zze()
            r7 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r6 != r7) goto L75
            r11.zzF(r4)
            int r2 = r4 + r5
            r11.zzG(r0)
            zzd(r11)
        L2c:
            int r6 = r11.zzc()
            if (r6 >= r2) goto L73
            int r6 = r11.zzc()
            int r7 = r11.zze()
            int r8 = r11.zze()
            r9 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r8 != r9) goto L6e
            r11.zzF(r6)
            int r6 = r6 + r7
            r11.zzG(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L4f:
            int r7 = r11.zzc()
            if (r7 >= r6) goto L5f
            com.google.android.gms.internal.ads.zzbk r7 = com.google.android.gms.internal.ads.zzaek.zza(r11)
            if (r7 == 0) goto L4f
            r2.add(r7)
            goto L4f
        L5f:
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L66
            goto L73
        L66:
            com.google.android.gms.internal.ads.zzbl r6 = new com.google.android.gms.internal.ads.zzbl
            r6.<init>(r2)
            r2 = r6
            goto Ld4
        L6e:
            int r6 = r6 + r7
            r11.zzF(r6)
            goto L2c
        L73:
            r2 = r1
            goto Ld4
        L75:
            r7 = 1936553057(0x736d7461, float:1.8813092E31)
            if (r6 != r7) goto Ld4
            r11.zzF(r4)
            int r3 = r4 + r5
            r6 = 12
            r11.zzG(r6)
        L84:
            int r7 = r11.zzc()
            if (r7 >= r3) goto Ld3
            int r7 = r11.zzc()
            int r8 = r11.zze()
            int r9 = r11.zze()
            r10 = 1935766900(0x73617574, float:1.7862687E31)
            if (r9 != r10) goto Lce
            r3 = 14
            if (r8 >= r3) goto La0
            goto Ld3
        La0:
            r3 = 5
            r11.zzG(r3)
            int r3 = r11.zzk()
            r7 = 1123024896(0x42f00000, float:120.0)
            if (r3 == r6) goto Lb1
            r6 = 13
            if (r3 == r6) goto Lb5
            goto Ld3
        Lb1:
            if (r3 != r6) goto Lb5
            r7 = 1131413504(0x43700000, float:240.0)
        Lb5:
            r3 = 1
            r11.zzG(r3)
            int r6 = r11.zzk()
            com.google.android.gms.internal.ads.zzbl r8 = new com.google.android.gms.internal.ads.zzbl
            com.google.android.gms.internal.ads.zzbk[] r3 = new com.google.android.gms.internal.ads.zzbk[r3]
            com.google.android.gms.internal.ads.zzacv r9 = new com.google.android.gms.internal.ads.zzacv
            r9.<init>(r7, r6)
            r6 = 0
            r3[r6] = r9
            r8.<init>(r3)
            r3 = r8
            goto Ld4
        Lce:
            int r7 = r7 + r8
            r11.zzF(r7)
            goto L84
        Ld3:
            r3 = r1
        Ld4:
            int r4 = r4 + r5
            r11.zzF(r4)
            goto La
        Lda:
            android.util.Pair r11 = android.util.Pair.create(r2, r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaed.zza(com.google.android.gms.internal.ads.zzadv):android.util.Pair");
    }

    public static zzbl zzb(zzadu zzaduVar) {
        zzacp zzacpVar;
        zzadv zzb = zzaduVar.zzb(1751411826);
        zzadv zzb2 = zzaduVar.zzb(1801812339);
        zzadv zzb3 = zzaduVar.zzb(1768715124);
        if (zzb == null || zzb2 == null || zzb3 == null || zzg(zzb.zza) != 1835299937) {
            return null;
        }
        zzdy zzdyVar = zzb2.zza;
        zzdyVar.zzF(12);
        int zze = zzdyVar.zze();
        String[] strArr = new String[zze];
        for (int i2 = 0; i2 < zze; i2++) {
            int zze2 = zzdyVar.zze();
            zzdyVar.zzG(4);
            strArr[i2] = zzdyVar.zzx(zze2 - 8, zzfog.zzc);
        }
        zzdy zzdyVar2 = zzb3.zza;
        zzdyVar2.zzF(8);
        ArrayList arrayList = new ArrayList();
        while (zzdyVar2.zza() > 8) {
            int zzc = zzdyVar2.zzc();
            int zze3 = zzdyVar2.zze();
            int zze4 = zzdyVar2.zze() - 1;
            if (zze4 >= 0 && zze4 < zze) {
                String str = strArr[zze4];
                int i3 = zzc + zze3;
                while (true) {
                    int zzc2 = zzdyVar2.zzc();
                    if (zzc2 >= i3) {
                        zzacpVar = null;
                        break;
                    }
                    int zze5 = zzdyVar2.zze();
                    if (zzdyVar2.zze() == 1684108385) {
                        int zze6 = zzdyVar2.zze();
                        int zze7 = zzdyVar2.zze();
                        int i4 = zze5 - 16;
                        byte[] bArr = new byte[i4];
                        zzdyVar2.zzB(bArr, 0, i4);
                        zzacpVar = new zzacp(str, bArr, zze7, zze6);
                        break;
                    }
                    zzdyVar2.zzF(zzc2 + zze5);
                }
                if (zzacpVar != null) {
                    arrayList.add(zzacpVar);
                }
            } else {
                a.O("Skipped metadata with unknown key index: ", zze4, "AtomParsers");
            }
            zzdyVar2.zzF(zzc + zze3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzbl(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b9, code lost:
        if (r8 == 0) goto L637;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x078c, code lost:
        if (r30 == null) goto L588;
     */
    /* JADX WARN: Removed duplicated region for block: B:377:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0805  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0836  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x09f1  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0acc  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0ae1  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0b32  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0b35  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0b7b  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0b96  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x0de8  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x0abd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List zzc(com.google.android.gms.internal.ads.zzadu r54, com.google.android.gms.internal.ads.zzzh r55, long r56, com.google.android.gms.internal.ads.zzv r58, boolean r59, boolean r60, com.google.android.gms.internal.ads.zzfoi r61) {
        /*
            Method dump skipped, instructions count: 3575
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaed.zzc(com.google.android.gms.internal.ads.zzadu, com.google.android.gms.internal.ads.zzzh, long, com.google.android.gms.internal.ads.zzv, boolean, boolean, com.google.android.gms.internal.ads.zzfoi):java.util.List");
    }

    public static void zzd(zzdy zzdyVar) {
        int zzc = zzdyVar.zzc();
        zzdyVar.zzG(4);
        if (zzdyVar.zze() != 1751411826) {
            zzc += 4;
        }
        zzdyVar.zzF(zzc);
    }

    private static int zze(int i2) {
        if (i2 == 1936684398) {
            return 1;
        }
        if (i2 == 1986618469) {
            return 2;
        }
        if (i2 == 1952807028 || i2 == 1935832172 || i2 == 1937072756 || i2 == 1668047728) {
            return 3;
        }
        return i2 == 1835365473 ? 5 : -1;
    }

    private static int zzf(zzdy zzdyVar) {
        int zzk = zzdyVar.zzk();
        int i2 = zzk & 127;
        while ((zzk & 128) == 128) {
            zzk = zzdyVar.zzk();
            i2 = (i2 << 7) | (zzk & 127);
        }
        return i2;
    }

    private static int zzg(zzdy zzdyVar) {
        zzdyVar.zzF(16);
        return zzdyVar.zze();
    }

    private static Pair zzh(zzadu zzaduVar) {
        zzadv zzb = zzaduVar.zzb(1701606260);
        if (zzb == null) {
            return null;
        }
        zzdy zzdyVar = zzb.zza;
        zzdyVar.zzF(8);
        int zze = zzadw.zze(zzdyVar.zze());
        int zzn = zzdyVar.zzn();
        long[] jArr = new long[zzn];
        long[] jArr2 = new long[zzn];
        for (int i2 = 0; i2 < zzn; i2++) {
            jArr[i2] = zze == 1 ? zzdyVar.zzt() : zzdyVar.zzs();
            jArr2[i2] = zze == 1 ? zzdyVar.zzr() : zzdyVar.zze();
            if (zzdyVar.zzy() == 1) {
                zzdyVar.zzG(2);
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    private static Pair zzi(zzdy zzdyVar, int i2) {
        zzdyVar.zzF(i2 + 12);
        zzdyVar.zzG(1);
        zzf(zzdyVar);
        zzdyVar.zzG(2);
        int zzk = zzdyVar.zzk();
        if ((zzk & 128) != 0) {
            zzdyVar.zzG(2);
        }
        if ((zzk & 64) != 0) {
            zzdyVar.zzG(zzdyVar.zzo());
        }
        if ((zzk & 32) != 0) {
            zzdyVar.zzG(2);
        }
        zzdyVar.zzG(1);
        zzf(zzdyVar);
        String zzd = zzbo.zzd(zzdyVar.zzk());
        if (!"audio/mpeg".equals(zzd) && !"audio/vnd.dts".equals(zzd) && !"audio/vnd.dts.hd".equals(zzd)) {
            zzdyVar.zzG(12);
            zzdyVar.zzG(1);
            int zzf = zzf(zzdyVar);
            byte[] bArr = new byte[zzf];
            zzdyVar.zzB(bArr, 0, zzf);
            return Pair.create(zzd, bArr);
        }
        return Pair.create(zzd, null);
    }

    private static Pair zzj(zzdy zzdyVar) {
        zzdyVar.zzF(8);
        int zze = zzadw.zze(zzdyVar.zze());
        zzdyVar.zzG(zze == 0 ? 8 : 16);
        long zzs = zzdyVar.zzs();
        zzdyVar.zzG(zze == 0 ? 4 : 8);
        int zzo = zzdyVar.zzo();
        StringBuilder sb = new StringBuilder();
        sb.append((char) (((zzo >> 10) & 31) + 96));
        sb.append((char) (((zzo >> 5) & 31) + 96));
        sb.append((char) ((zzo & 31) + 96));
        return Pair.create(Long.valueOf(zzs), sb.toString());
    }

    private static Pair zzk(zzdy zzdyVar, int i2, int i3) {
        Integer num;
        zzaeu zzaeuVar;
        Pair create;
        int i4;
        int i5;
        byte[] bArr;
        int zzc = zzdyVar.zzc();
        while (zzc - i2 < i3) {
            zzdyVar.zzF(zzc);
            int zze = zzdyVar.zze();
            zzyw.zzb(zze > 0, "childAtomSize must be positive");
            if (zzdyVar.zze() == 1936289382) {
                int i6 = zzc + 8;
                int i7 = -1;
                int i8 = 0;
                String str = null;
                Integer num2 = null;
                while (i6 - zzc < zze) {
                    zzdyVar.zzF(i6);
                    int zze2 = zzdyVar.zze();
                    int zze3 = zzdyVar.zze();
                    if (zze3 == 1718775137) {
                        num2 = Integer.valueOf(zzdyVar.zze());
                    } else if (zze3 == 1935894637) {
                        zzdyVar.zzG(4);
                        str = zzdyVar.zzx(4, zzfog.zzc);
                    } else if (zze3 == 1935894633) {
                        i7 = i6;
                        i8 = zze2;
                    }
                    i6 += zze2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    zzyw.zzb(num2 != null, "frma atom is mandatory");
                    zzyw.zzb(i7 != -1, "schi atom is mandatory");
                    int i9 = i7 + 8;
                    while (true) {
                        if (i9 - i7 >= i8) {
                            num = num2;
                            zzaeuVar = null;
                            break;
                        }
                        zzdyVar.zzF(i9);
                        int zze4 = zzdyVar.zze();
                        if (zzdyVar.zze() == 1952804451) {
                            int zze5 = zzdyVar.zze();
                            zzdyVar.zzG(1);
                            if (zzadw.zze(zze5) == 0) {
                                zzdyVar.zzG(1);
                                i4 = 0;
                                i5 = 0;
                            } else {
                                int zzk = zzdyVar.zzk();
                                i4 = zzk & 15;
                                i5 = (zzk & 240) >> 4;
                            }
                            boolean z = zzdyVar.zzk() == 1;
                            int zzk2 = zzdyVar.zzk();
                            byte[] bArr2 = new byte[16];
                            zzdyVar.zzB(bArr2, 0, 16);
                            if (z && zzk2 == 0) {
                                int zzk3 = zzdyVar.zzk();
                                byte[] bArr3 = new byte[zzk3];
                                zzdyVar.zzB(bArr3, 0, zzk3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            zzaeuVar = new zzaeu(z, str, zzk2, bArr2, i5, i4, bArr);
                        } else {
                            i9 += zze4;
                        }
                    }
                    zzyw.zzb(zzaeuVar != null, "tenc atom is mandatory");
                    int i10 = zzeg.zza;
                    create = Pair.create(num, zzaeuVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            zzc += zze;
        }
        return null;
    }

    private static ByteBuffer zzl() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zzm(com.google.android.gms.internal.ads.zzdy r22, int r23, int r24, int r25, int r26, java.lang.String r27, boolean r28, com.google.android.gms.internal.ads.zzv r29, com.google.android.gms.internal.ads.zzadz r30, int r31) {
        /*
            Method dump skipped, instructions count: 965
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaed.zzm(com.google.android.gms.internal.ads.zzdy, int, int, int, int, java.lang.String, boolean, com.google.android.gms.internal.ads.zzv, com.google.android.gms.internal.ads.zzadz, int):void");
    }

    private static boolean zzn(long[] jArr, long j2, long j3, long j4) {
        int length = jArr.length;
        int i2 = length - 1;
        return jArr[0] <= j3 && j3 < jArr[zzeg.zzf(4, 0, i2)] && jArr[zzeg.zzf(length + (-4), 0, i2)] < j4 && j4 <= j2;
    }
}
