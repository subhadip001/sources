package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaej implements zzys {
    public static final zzyz zza = new zzyz() { // from class: com.google.android.gms.internal.ads.zzaef
        @Override // com.google.android.gms.internal.ads.zzyz
        public final zzys[] zza() {
            zzyz zzyzVar = zzaej.zza;
            return new zzys[]{new zzaej(0, null)};
        }

        @Override // com.google.android.gms.internal.ads.zzyz
        public final /* synthetic */ zzys[] zzb(Uri uri, Map map) {
            return zzyy.zza(this, uri, map);
        }
    };
    private static final byte[] zzb = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzad zzc;
    private int zzA;
    private int zzB;
    private boolean zzC;
    private zzyv zzD;
    private zzzz[] zzE;
    private zzzz[] zzF;
    private boolean zzG;
    private final List zzd;
    private final SparseArray zze;
    private final zzdy zzf;
    private final zzdy zzg;
    private final zzdy zzh;
    private final byte[] zzi;
    private final zzdy zzj;
    private final zzabf zzk;
    private final zzdy zzl;
    private final ArrayDeque zzm;
    private final ArrayDeque zzn;
    private int zzo;
    private int zzp;
    private long zzq;
    private int zzr;
    private zzdy zzs;
    private long zzt;
    private int zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private zzaei zzy;
    private int zzz;

    static {
        zzab zzabVar = new zzab();
        zzabVar.zzS("application/x-emsg");
        zzc = zzabVar.zzY();
    }

    public zzaej() {
        this(0, null);
    }

    private static int zze(int i2) {
        if (i2 >= 0) {
            return i2;
        }
        throw zzbp.zza("Unexpected negative value: " + i2, null);
    }

    private static zzv zzf(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            zzadv zzadvVar = (zzadv) list.get(i2);
            if (zzadvVar.zzd == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] zzH = zzadvVar.zza.zzH();
                UUID zza2 = zzaeq.zza(zzH);
                if (zza2 == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new zzu(zza2, null, "video/mp4", zzH));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new zzv(arrayList);
    }

    private final void zzg() {
        this.zzo = 0;
        this.zzr = 0;
    }

    private static void zzh(zzdy zzdyVar, int i2, zzaev zzaevVar) {
        zzdyVar.zzF(i2 + 8);
        int zze = zzdyVar.zze() & 16777215;
        if ((zze & 1) == 0) {
            boolean z = (zze & 2) != 0;
            int zzn = zzdyVar.zzn();
            if (zzn == 0) {
                Arrays.fill(zzaevVar.zzl, 0, zzaevVar.zze, false);
                return;
            }
            int i3 = zzaevVar.zze;
            if (zzn == i3) {
                Arrays.fill(zzaevVar.zzl, 0, zzn, z);
                zzaevVar.zza(zzdyVar.zza());
                zzdy zzdyVar2 = zzaevVar.zzn;
                zzdyVar.zzB(zzdyVar2.zzH(), 0, zzdyVar2.zzd());
                zzaevVar.zzn.zzF(0);
                zzaevVar.zzo = false;
                return;
            }
            throw zzbp.zza("Senc sample count " + zzn + " is different from fragment sample count" + i3, null);
        }
        throw zzbp.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    private final void zzi(long j2) {
        zzaej zzaejVar;
        SparseArray sparseArray;
        zzadu zzaduVar;
        int i2;
        int i3;
        byte[] bArr;
        int i4;
        int i5;
        int i6;
        int i7;
        byte[] bArr2;
        byte[] bArr3;
        int i8;
        boolean z;
        int i9;
        zzadu zzaduVar2;
        byte[] bArr4;
        zzaev zzaevVar;
        List list;
        int i10;
        int i11;
        int i12;
        zzadu zzaduVar3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        zzaee zzaeeVar;
        long j3;
        zzaej zzaejVar2 = this;
        while (!zzaejVar2.zzm.isEmpty() && ((zzadu) zzaejVar2.zzm.peek()).zza == j2) {
            zzadu zzaduVar4 = (zzadu) zzaejVar2.zzm.pop();
            int i23 = zzaduVar4.zzd;
            int i24 = 12;
            int i25 = 8;
            if (i23 == 1836019574) {
                zzv zzf = zzf(zzaduVar4.zzb);
                zzadu zza2 = zzaduVar4.zza(1836475768);
                Objects.requireNonNull(zza2);
                SparseArray sparseArray2 = new SparseArray();
                int size = zza2.zzb.size();
                long j4 = -9223372036854775807L;
                int i26 = 0;
                while (i26 < size) {
                    zzadv zzadvVar = (zzadv) zza2.zzb.get(i26);
                    int i27 = zzadvVar.zzd;
                    if (i27 == 1953654136) {
                        zzdy zzdyVar = zzadvVar.zza;
                        zzdyVar.zzF(i24);
                        Pair create = Pair.create(Integer.valueOf(zzdyVar.zze()), new zzaee(zzdyVar.zze() - 1, zzdyVar.zze(), zzdyVar.zze(), zzdyVar.zze()));
                        sparseArray2.put(((Integer) create.first).intValue(), (zzaee) create.second);
                    } else if (i27 == 1835362404) {
                        zzdy zzdyVar2 = zzadvVar.zza;
                        zzdyVar2.zzF(8);
                        j4 = zzadw.zze(zzdyVar2.zze()) == 0 ? zzdyVar2.zzs() : zzdyVar2.zzt();
                    }
                    i26++;
                    i24 = 12;
                }
                List zzc2 = zzaed.zzc(zzaduVar4, new zzzh(), j4, zzf, false, false, new zzfoi() { // from class: com.google.android.gms.internal.ads.zzaeg
                    @Override // com.google.android.gms.internal.ads.zzfoi
                    public final Object apply(Object obj) {
                        return (zzaet) obj;
                    }
                });
                int size2 = zzc2.size();
                if (zzaejVar2.zze.size() == 0) {
                    for (int i28 = 0; i28 < size2; i28++) {
                        zzaew zzaewVar = (zzaew) zzc2.get(i28);
                        zzaet zzaetVar = zzaewVar.zza;
                        zzaejVar2.zze.put(zzaetVar.zza, new zzaei(zzaejVar2.zzD.zzv(i28, zzaetVar.zzb), zzaewVar, zzj(sparseArray2, zzaetVar.zza)));
                        zzaejVar2.zzw = Math.max(zzaejVar2.zzw, zzaetVar.zze);
                    }
                    zzaejVar2.zzD.zzB();
                } else {
                    zzcw.zzf(zzaejVar2.zze.size() == size2);
                    for (int i29 = 0; i29 < size2; i29++) {
                        zzaew zzaewVar2 = (zzaew) zzc2.get(i29);
                        zzaet zzaetVar2 = zzaewVar2.zza;
                        ((zzaei) zzaejVar2.zze.get(zzaetVar2.zza)).zzh(zzaewVar2, zzj(sparseArray2, zzaetVar2.zza));
                    }
                }
            } else {
                if (i23 == 1836019558) {
                    SparseArray sparseArray3 = zzaejVar2.zze;
                    byte[] bArr5 = zzaejVar2.zzi;
                    int size3 = zzaduVar4.zzc.size();
                    int i30 = 0;
                    while (i30 < size3) {
                        zzadu zzaduVar5 = (zzadu) zzaduVar4.zzc.get(i30);
                        if (zzaduVar5.zzd == 1953653094) {
                            zzadv zzb2 = zzaduVar5.zzb(1952868452);
                            Objects.requireNonNull(zzb2);
                            zzdy zzdyVar3 = zzb2.zza;
                            zzdyVar3.zzF(i25);
                            int zze = zzdyVar3.zze() & 16777215;
                            zzaei zzaeiVar = (zzaei) sparseArray3.get(zzdyVar3.zze());
                            if (zzaeiVar == null) {
                                zzaeiVar = null;
                            } else {
                                if ((zze & 1) != 0) {
                                    long zzt = zzdyVar3.zzt();
                                    zzaev zzaevVar2 = zzaeiVar.zzb;
                                    zzaevVar2.zzb = zzt;
                                    zzaevVar2.zzc = zzt;
                                }
                                zzaee zzaeeVar2 = zzaeiVar.zze;
                                int zze2 = (zze & 2) != 0 ? zzdyVar3.zze() - 1 : zzaeeVar2.zza;
                                if ((zze & 8) != 0) {
                                    i4 = zzdyVar3.zze();
                                } else {
                                    i4 = zzaeeVar2.zzb;
                                }
                                if ((zze & 16) != 0) {
                                    i5 = zzdyVar3.zze();
                                } else {
                                    i5 = zzaeeVar2.zzc;
                                }
                                if ((zze & 32) != 0) {
                                    i6 = zzdyVar3.zze();
                                } else {
                                    i6 = zzaeeVar2.zzd;
                                }
                                zzaeiVar.zzb.zza = new zzaee(zze2, i4, i5, i6);
                            }
                            if (zzaeiVar != null) {
                                zzaev zzaevVar3 = zzaeiVar.zzb;
                                long j5 = zzaevVar3.zzp;
                                boolean z2 = zzaevVar3.zzq;
                                zzaeiVar.zzi();
                                zzaeiVar.zzl = true;
                                zzadv zzb3 = zzaduVar5.zzb(1952867444);
                                if (zzb3 != null) {
                                    zzdy zzdyVar4 = zzb3.zza;
                                    zzdyVar4.zzF(i25);
                                    zzaevVar3.zzp = zzadw.zze(zzdyVar4.zze()) == 1 ? zzdyVar4.zzt() : zzdyVar4.zzs();
                                    zzaevVar3.zzq = true;
                                } else {
                                    zzaevVar3.zzp = j5;
                                    zzaevVar3.zzq = z2;
                                }
                                List list2 = zzaduVar5.zzb;
                                int size4 = list2.size();
                                int i31 = 0;
                                int i32 = 0;
                                int i33 = 0;
                                while (true) {
                                    i7 = 1953658222;
                                    if (i31 >= size4) {
                                        break;
                                    }
                                    zzadv zzadvVar2 = (zzadv) list2.get(i31);
                                    SparseArray sparseArray4 = sparseArray3;
                                    if (zzadvVar2.zzd == 1953658222) {
                                        zzdy zzdyVar5 = zzadvVar2.zza;
                                        zzdyVar5.zzF(12);
                                        int zzn = zzdyVar5.zzn();
                                        if (zzn > 0) {
                                            i33 += zzn;
                                            i32++;
                                        }
                                    }
                                    i31++;
                                    sparseArray3 = sparseArray4;
                                }
                                sparseArray = sparseArray3;
                                zzaeiVar.zzh = 0;
                                zzaeiVar.zzg = 0;
                                zzaeiVar.zzf = 0;
                                zzaev zzaevVar4 = zzaeiVar.zzb;
                                zzaevVar4.zzd = i32;
                                zzaevVar4.zze = i33;
                                if (zzaevVar4.zzg.length < i32) {
                                    zzaevVar4.zzf = new long[i32];
                                    zzaevVar4.zzg = new int[i32];
                                }
                                if (zzaevVar4.zzh.length < i33) {
                                    int i34 = (i33 * 125) / 100;
                                    zzaevVar4.zzh = new int[i34];
                                    zzaevVar4.zzi = new long[i34];
                                    zzaevVar4.zzj = new boolean[i34];
                                    zzaevVar4.zzl = new boolean[i34];
                                }
                                int i35 = 0;
                                int i36 = 0;
                                int i37 = 0;
                                while (true) {
                                    long j6 = 0;
                                    if (i35 >= size4) {
                                        break;
                                    }
                                    zzadv zzadvVar3 = (zzadv) list2.get(i35);
                                    if (zzadvVar3.zzd == i7) {
                                        int i38 = i37 + 1;
                                        zzdy zzdyVar6 = zzadvVar3.zza;
                                        zzdyVar6.zzF(8);
                                        int zze3 = zzdyVar6.zze() & 16777215;
                                        list = list2;
                                        zzaet zzaetVar3 = zzaeiVar.zzd.zza;
                                        i10 = size3;
                                        zzaev zzaevVar5 = zzaeiVar.zzb;
                                        i12 = size4;
                                        zzaee zzaeeVar3 = zzaevVar5.zza;
                                        int i39 = zzeg.zza;
                                        zzaevVar5.zzg[i37] = zzdyVar6.zzn();
                                        long[] jArr = zzaevVar5.zzf;
                                        zzaduVar2 = zzaduVar4;
                                        bArr4 = bArr5;
                                        long j7 = zzaevVar5.zzb;
                                        jArr[i37] = j7;
                                        if ((zze3 & 1) != 0) {
                                            i9 = i35;
                                            jArr[i37] = j7 + zzdyVar6.zze();
                                        } else {
                                            i9 = i35;
                                        }
                                        int i40 = zze3 & 4;
                                        int i41 = zzaeeVar3.zzd;
                                        if (i40 != 0) {
                                            i41 = zzdyVar6.zze();
                                        }
                                        int i42 = zze3 & 256;
                                        int i43 = zze3 & 512;
                                        int i44 = zze3 & 1024;
                                        int i45 = zze3 & RecyclerView.a0.FLAG_MOVED;
                                        int i46 = i41;
                                        long[] jArr2 = zzaetVar3.zzh;
                                        if (jArr2 != null) {
                                            i11 = i30;
                                            zzaduVar3 = zzaduVar5;
                                            if (jArr2.length == 1 && jArr2[0] == 0) {
                                                j6 = ((long[]) zzeg.zzG(zzaetVar3.zzi))[0];
                                            }
                                        } else {
                                            i11 = i30;
                                            zzaduVar3 = zzaduVar5;
                                        }
                                        int[] iArr = zzaevVar5.zzh;
                                        long[] jArr3 = zzaevVar5.zzi;
                                        boolean[] zArr = zzaevVar5.zzj;
                                        zzaevVar = zzaevVar3;
                                        int i47 = zzaevVar5.zzg[i37] + i36;
                                        long j8 = zzaetVar3.zzc;
                                        int i48 = i36;
                                        long j9 = zzaevVar5.zzp;
                                        while (i48 < i47) {
                                            if (i42 != 0) {
                                                i13 = i42;
                                                i14 = zzdyVar6.zze();
                                            } else {
                                                i13 = i42;
                                                i14 = zzaeeVar3.zzb;
                                            }
                                            zze(i14);
                                            if (i43 != 0) {
                                                i15 = i43;
                                                i16 = zzdyVar6.zze();
                                            } else {
                                                i15 = i43;
                                                i16 = zzaeeVar3.zzc;
                                            }
                                            zze(i16);
                                            if (i44 != 0) {
                                                i17 = i40;
                                                i18 = zzdyVar6.zze();
                                            } else {
                                                i17 = i40;
                                                if (i48 == 0) {
                                                    if (i40 != 0) {
                                                        i18 = i46;
                                                        i48 = 0;
                                                    } else {
                                                        i48 = 0;
                                                    }
                                                }
                                                i18 = zzaeeVar3.zzd;
                                            }
                                            if (i45 != 0) {
                                                i19 = i47;
                                                i20 = i44;
                                                i21 = i45;
                                                i22 = zzdyVar6.zze();
                                            } else {
                                                i19 = i47;
                                                i20 = i44;
                                                i21 = i45;
                                                i22 = 0;
                                            }
                                            long zzw = zzeg.zzw((i22 + j9) - j6, 1000000L, j8);
                                            jArr3[i48] = zzw;
                                            if (zzaevVar5.zzq) {
                                                zzaeeVar = zzaeeVar3;
                                                j3 = j8;
                                            } else {
                                                zzaeeVar = zzaeeVar3;
                                                j3 = j8;
                                                jArr3[i48] = zzw + zzaeiVar.zzd.zzh;
                                            }
                                            iArr[i48] = i16;
                                            zArr[i48] = 1 == (((i18 >> 16) & 1) ^ 1);
                                            j9 += i14;
                                            i48++;
                                            zzaeeVar3 = zzaeeVar;
                                            j8 = j3;
                                            i42 = i13;
                                            i43 = i15;
                                            i40 = i17;
                                            i47 = i19;
                                            i44 = i20;
                                            i45 = i21;
                                        }
                                        zzaevVar5.zzp = j9;
                                        i37 = i38;
                                        i36 = i47;
                                    } else {
                                        i9 = i35;
                                        zzaduVar2 = zzaduVar4;
                                        bArr4 = bArr5;
                                        zzaevVar = zzaevVar3;
                                        list = list2;
                                        i10 = size3;
                                        i11 = i30;
                                        i12 = size4;
                                        zzaduVar3 = zzaduVar5;
                                    }
                                    i35 = i9 + 1;
                                    list2 = list;
                                    size3 = i10;
                                    size4 = i12;
                                    zzaduVar4 = zzaduVar2;
                                    bArr5 = bArr4;
                                    i30 = i11;
                                    zzaduVar5 = zzaduVar3;
                                    zzaevVar3 = zzaevVar;
                                    i7 = 1953658222;
                                }
                                zzaduVar = zzaduVar4;
                                byte[] bArr6 = bArr5;
                                zzaev zzaevVar6 = zzaevVar3;
                                i2 = size3;
                                i3 = i30;
                                zzadu zzaduVar6 = zzaduVar5;
                                zzaet zzaetVar4 = zzaeiVar.zzd.zza;
                                zzaee zzaeeVar4 = zzaevVar6.zza;
                                Objects.requireNonNull(zzaeeVar4);
                                zzaeu zza3 = zzaetVar4.zza(zzaeeVar4.zza);
                                zzadv zzb4 = zzaduVar6.zzb(1935763834);
                                if (zzb4 != null) {
                                    Objects.requireNonNull(zza3);
                                    zzdy zzdyVar7 = zzb4.zza;
                                    int i49 = zza3.zzd;
                                    zzdyVar7.zzF(8);
                                    if ((zzdyVar7.zze() & 1) == 1) {
                                        zzdyVar7.zzG(8);
                                    }
                                    int zzk = zzdyVar7.zzk();
                                    int zzn2 = zzdyVar7.zzn();
                                    int i50 = zzaevVar6.zze;
                                    if (zzn2 > i50) {
                                        throw zzbp.zza("Saiz sample count " + zzn2 + " is greater than fragment sample count" + i50, null);
                                    }
                                    if (zzk == 0) {
                                        boolean[] zArr2 = zzaevVar6.zzl;
                                        i8 = 0;
                                        for (int i51 = 0; i51 < zzn2; i51++) {
                                            int zzk2 = zzdyVar7.zzk();
                                            i8 += zzk2;
                                            zArr2[i51] = zzk2 > i49;
                                        }
                                        z = false;
                                    } else {
                                        boolean z3 = zzk > i49;
                                        i8 = zzk * zzn2;
                                        z = false;
                                        Arrays.fill(zzaevVar6.zzl, 0, zzn2, z3);
                                    }
                                    Arrays.fill(zzaevVar6.zzl, zzn2, zzaevVar6.zze, z);
                                    if (i8 > 0) {
                                        zzaevVar6.zza(i8);
                                    }
                                }
                                zzadv zzb5 = zzaduVar6.zzb(1935763823);
                                if (zzb5 != null) {
                                    zzdy zzdyVar8 = zzb5.zza;
                                    zzdyVar8.zzF(8);
                                    int zze4 = zzdyVar8.zze();
                                    if ((zze4 & 1) == 1) {
                                        zzdyVar8.zzG(8);
                                    }
                                    int zzn3 = zzdyVar8.zzn();
                                    if (zzn3 != 1) {
                                        throw zzbp.zza("Unexpected saio entry count: " + zzn3, null);
                                    }
                                    zzaevVar6.zzc += zzadw.zze(zze4) == 0 ? zzdyVar8.zzs() : zzdyVar8.zzt();
                                }
                                zzadv zzb6 = zzaduVar6.zzb(1936027235);
                                if (zzb6 != null) {
                                    zzh(zzb6.zza, 0, zzaevVar6);
                                }
                                String str = zza3 != null ? zza3.zzb : null;
                                zzdy zzdyVar9 = null;
                                zzdy zzdyVar10 = null;
                                for (int i52 = 0; i52 < zzaduVar6.zzb.size(); i52++) {
                                    zzadv zzadvVar4 = (zzadv) zzaduVar6.zzb.get(i52);
                                    zzdy zzdyVar11 = zzadvVar4.zza;
                                    int i53 = zzadvVar4.zzd;
                                    if (i53 == 1935828848) {
                                        zzdyVar11.zzF(12);
                                        if (zzdyVar11.zze() == 1936025959) {
                                            zzdyVar9 = zzdyVar11;
                                        }
                                    } else if (i53 == 1936158820) {
                                        zzdyVar11.zzF(12);
                                        if (zzdyVar11.zze() == 1936025959) {
                                            zzdyVar10 = zzdyVar11;
                                        }
                                    }
                                }
                                if (zzdyVar9 != null && zzdyVar10 != null) {
                                    zzdyVar9.zzF(8);
                                    int zze5 = zzdyVar9.zze();
                                    zzdyVar9.zzG(4);
                                    if (zzadw.zze(zze5) == 1) {
                                        zzdyVar9.zzG(4);
                                    }
                                    if (zzdyVar9.zze() == 1) {
                                        zzdyVar10.zzF(8);
                                        int zze6 = zzadw.zze(zzdyVar10.zze());
                                        zzdyVar10.zzG(4);
                                        if (zze6 == 1) {
                                            if (zzdyVar10.zzs() == 0) {
                                                throw zzbp.zzc("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (zze6 >= 2) {
                                            zzdyVar10.zzG(4);
                                        }
                                        if (zzdyVar10.zzs() == 1) {
                                            zzdyVar10.zzG(1);
                                            int zzk3 = zzdyVar10.zzk();
                                            int i54 = (zzk3 & 240) >> 4;
                                            int i55 = zzk3 & 15;
                                            if (zzdyVar10.zzk() == 1) {
                                                int zzk4 = zzdyVar10.zzk();
                                                byte[] bArr7 = new byte[16];
                                                zzdyVar10.zzB(bArr7, 0, 16);
                                                if (zzk4 == 0) {
                                                    int zzk5 = zzdyVar10.zzk();
                                                    byte[] bArr8 = new byte[zzk5];
                                                    zzdyVar10.zzB(bArr8, 0, zzk5);
                                                    bArr3 = bArr8;
                                                } else {
                                                    bArr3 = null;
                                                }
                                                zzaevVar6.zzk = true;
                                                zzaevVar6.zzm = new zzaeu(true, str, zzk4, bArr7, i54, i55, bArr3);
                                            }
                                        } else {
                                            throw zzbp.zzc("Entry count in sgpd != 1 (unsupported).");
                                        }
                                    } else {
                                        throw zzbp.zzc("Entry count in sbgp != 1 (unsupported).");
                                    }
                                }
                                int size5 = zzaduVar6.zzb.size();
                                int i56 = 0;
                                while (i56 < size5) {
                                    zzadv zzadvVar5 = (zzadv) zzaduVar6.zzb.get(i56);
                                    if (zzadvVar5.zzd == 1970628964) {
                                        zzdy zzdyVar12 = zzadvVar5.zza;
                                        zzdyVar12.zzF(8);
                                        bArr2 = bArr6;
                                        zzdyVar12.zzB(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, zzb)) {
                                            zzh(zzdyVar12, 16, zzaevVar6);
                                        }
                                    } else {
                                        bArr2 = bArr6;
                                    }
                                    i56++;
                                    bArr6 = bArr2;
                                }
                                bArr = bArr6;
                                bArr5 = bArr;
                                size3 = i2;
                                zzaduVar4 = zzaduVar;
                                i25 = 8;
                                i30 = i3 + 1;
                                sparseArray3 = sparseArray;
                            }
                        }
                        sparseArray = sparseArray3;
                        zzaduVar = zzaduVar4;
                        i2 = size3;
                        i3 = i30;
                        bArr = bArr5;
                        bArr5 = bArr;
                        size3 = i2;
                        zzaduVar4 = zzaduVar;
                        i25 = 8;
                        i30 = i3 + 1;
                        sparseArray3 = sparseArray;
                    }
                    zzv zzf2 = zzf(zzaduVar4.zzb);
                    zzaejVar = this;
                    if (zzf2 != null) {
                        int size6 = zzaejVar.zze.size();
                        for (int i57 = 0; i57 < size6; i57++) {
                            zzaei zzaeiVar2 = (zzaei) zzaejVar.zze.valueAt(i57);
                            zzaet zzaetVar5 = zzaeiVar2.zzd.zza;
                            zzaee zzaeeVar5 = zzaeiVar2.zzb.zza;
                            int i58 = zzeg.zza;
                            zzaeu zza4 = zzaetVar5.zza(zzaeeVar5.zza);
                            zzv zzb7 = zzf2.zzb(zza4 != null ? zza4.zzb : null);
                            zzab zzb8 = zzaeiVar2.zzd.zza.zzf.zzb();
                            zzb8.zzB(zzb7);
                            zzaeiVar2.zza.zzk(zzb8.zzY());
                        }
                    }
                    if (zzaejVar.zzv != -9223372036854775807L) {
                        int size7 = zzaejVar.zze.size();
                        for (int i59 = 0; i59 < size7; i59++) {
                            zzaei zzaeiVar3 = (zzaei) zzaejVar.zze.valueAt(i59);
                            long j10 = zzaejVar.zzv;
                            int i60 = zzaeiVar3.zzf;
                            while (true) {
                                zzaev zzaevVar7 = zzaeiVar3.zzb;
                                if (i60 < zzaevVar7.zze && zzaevVar7.zzi[i60] < j10) {
                                    if (zzaevVar7.zzj[i60]) {
                                        zzaeiVar3.zzi = i60;
                                    }
                                    i60++;
                                }
                            }
                        }
                        zzaejVar.zzv = -9223372036854775807L;
                    }
                } else {
                    zzaejVar = zzaejVar2;
                    if (!zzaejVar.zzm.isEmpty()) {
                        ((zzadu) zzaejVar.zzm.peek()).zzc(zzaduVar4);
                    }
                }
                zzaejVar2 = zzaejVar;
            }
        }
        zzg();
    }

    private static final zzaee zzj(SparseArray sparseArray, int i2) {
        if (sparseArray.size() == 1) {
            return (zzaee) sparseArray.valueAt(0);
        }
        zzaee zzaeeVar = (zzaee) sparseArray.get(i2);
        Objects.requireNonNull(zzaeeVar);
        return zzaeeVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0250, code lost:
        if (r0.zzn.isEmpty() != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0252, code lost:
        r1 = (com.google.android.gms.internal.ads.zzaeh) r0.zzn.removeFirst();
        r0.zzu -= r1.zzc;
        r6 = r1.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0265, code lost:
        if (r1.zzb == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0267, code lost:
        r6 = r6 + r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0268, code lost:
        r3 = r0.zzE;
        r15 = r3.length;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x026d, code lost:
        if (r14 >= r15) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x026f, code lost:
        r3[r14].zzs(r6, 1, r1.zzc, r0.zzu, null);
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0287, code lost:
        if (r2.zzk() != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0289, code lost:
        r0.zzy = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x028c, code lost:
        r0.zzo = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x028f, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:?, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0097, code lost:
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009a, code lost:
        if (r0.zzo != 3) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
        r3 = r2.zzb();
        r0.zzz = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a6, code lost:
        if (r2.zzf >= r2.zzi) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
        ((com.google.android.gms.internal.ads.zzym) r1).zzo(r3, false);
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b1, code lost:
        if (r1 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b4, code lost:
        r3 = r2.zzb.zzn;
        r1 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ba, code lost:
        if (r1 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bc, code lost:
        r3.zzG(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c7, code lost:
        if (r2.zzb.zzb(r2.zzf) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c9, code lost:
        r3.zzG(r3.zzo() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d6, code lost:
        if (r2.zzk() != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d8, code lost:
        r0.zzy = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00da, code lost:
        r0.zzo = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e4, code lost:
        if (r2.zzd.zza.zzg != 1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e6, code lost:
        r0.zzz = r3 - 8;
        ((com.google.android.gms.internal.ads.zzym) r1).zzo(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0100, code lost:
        if ("audio/ac4".equals(r2.zzd.zza.zzf.zzm) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0102, code lost:
        r0.zzA = r2.zzc(r0.zzz, 7);
        com.google.android.gms.internal.ads.zzya.zzb(r0.zzz, r0.zzj);
        com.google.android.gms.internal.ads.zzzx.zzb(r2.zza, r0.zzj, 7);
        r3 = r0.zzA + 7;
        r0.zzA = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011f, code lost:
        r3 = r2.zzc(r0.zzz, 0);
        r0.zzA = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0127, code lost:
        r0.zzz += r3;
        r0.zzo = 4;
        r0.zzB = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0131, code lost:
        r3 = r2.zzd.zza;
        r9 = r2.zza;
        r14 = r2.zze();
        r5 = r3.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013d, code lost:
        if (r5 != 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013f, code lost:
        r3 = r0.zzA;
        r4 = r0.zzz;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0143, code lost:
        if (r3 >= r4) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0145, code lost:
        r0.zzA += com.google.android.gms.internal.ads.zzzx.zza(r9, r1, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0150, code lost:
        r10 = r0.zzg.zzH();
        r10[0] = 0;
        r10[1] = 0;
        r10[2] = 0;
        r11 = r5 + 1;
        r5 = 4 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0165, code lost:
        if (r0.zzA >= r0.zzz) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0167, code lost:
        r12 = r0.zzB;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016b, code lost:
        if (r12 != 0) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016d, code lost:
        ((com.google.android.gms.internal.ads.zzym) r1).zzn(r10, r5, r11, r8);
        r0.zzg.zzF(r8);
        r12 = r0.zzg.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017e, code lost:
        if (r12 <= 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0180, code lost:
        r0.zzB = r12 - 1;
        r0.zzf.zzF(r8);
        com.google.android.gms.internal.ads.zzzx.zzb(r9, r0.zzf, 4);
        com.google.android.gms.internal.ads.zzzx.zzb(r9, r0.zzg, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0197, code lost:
        if (r0.zzF.length <= 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0199, code lost:
        r8 = r3.zzf.zzm;
        r12 = r10[4];
        r16 = com.google.android.gms.internal.ads.zzzp.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a7, code lost:
        if ("video/avc".equals(r8) == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ab, code lost:
        if ((r12 & 31) == r4) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b1, code lost:
        if ("video/hevc".equals(r8) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b8, code lost:
        if (((r12 & 126) >> r7) != 39) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ba, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bc, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01bd, code lost:
        r0.zzC = r6;
        r0.zzA += 5;
        r0.zzz += r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01d2, code lost:
        throw com.google.android.gms.internal.ads.zzbp.zza("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d5, code lost:
        if (r0.zzC == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d7, code lost:
        r0.zzh.zzC(r12);
        ((com.google.android.gms.internal.ads.zzym) r1).zzn(r0.zzh.zzH(), 0, r0.zzB, false);
        com.google.android.gms.internal.ads.zzzx.zzb(r9, r0.zzh, r0.zzB);
        r4 = r0.zzB;
        r6 = r0.zzh;
        r6 = com.google.android.gms.internal.ads.zzzp.zzb(r6.zzH(), r6.zzd());
        r0.zzh.zzF("video/hevc".equals(r3.zzf.zzm) ? 1 : 0);
        r0.zzh.zzE(r6);
        com.google.android.gms.internal.ads.zzyj.zza(r14, r0.zzh, r0.zzF);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x021c, code lost:
        r4 = com.google.android.gms.internal.ads.zzzx.zza(r9, r1, r12, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0221, code lost:
        r0.zzA += r4;
        r0.zzB -= r4;
        r4 = 6;
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x022e, code lost:
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0232, code lost:
        r12 = r2.zza();
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x023a, code lost:
        if (r1 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x023c, code lost:
        r1 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x023f, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0240, code lost:
        r9.zzs(r14, r12, r0.zzz, 0, r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v22 */
    @Override // com.google.android.gms.internal.ads.zzys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(com.google.android.gms.internal.ads.zzyt r29, com.google.android.gms.internal.ads.zzzs r30) {
        /*
            Method dump skipped, instructions count: 1858
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaej.zza(com.google.android.gms.internal.ads.zzyt, com.google.android.gms.internal.ads.zzzs):int");
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzb(zzyv zzyvVar) {
        this.zzD = zzyvVar;
        zzg();
        zzzz[] zzzzVarArr = new zzzz[2];
        this.zzE = zzzzVarArr;
        int i2 = 0;
        zzzz[] zzzzVarArr2 = (zzzz[]) zzeg.zzad(zzzzVarArr, 0);
        this.zzE = zzzzVarArr2;
        for (zzzz zzzzVar : zzzzVarArr2) {
            zzzzVar.zzk(zzc);
        }
        this.zzF = new zzzz[this.zzd.size()];
        int i3 = 100;
        while (i2 < this.zzF.length) {
            int i4 = i3 + 1;
            zzzz zzv = this.zzD.zzv(i3, 3);
            zzv.zzk((zzad) this.zzd.get(i2));
            this.zzF[i2] = zzv;
            i2++;
            i3 = i4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzc(long j2, long j3) {
        int size = this.zze.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((zzaei) this.zze.valueAt(i2)).zzi();
        }
        this.zzn.clear();
        this.zzu = 0;
        this.zzv = j3;
        this.zzm.clear();
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final boolean zzd(zzyt zzytVar) {
        return zzaes.zza(zzytVar);
    }

    public zzaej(int i2, zzee zzeeVar) {
        this.zzd = Collections.unmodifiableList(Collections.emptyList());
        this.zzk = new zzabf();
        this.zzl = new zzdy(16);
        this.zzf = new zzdy(zzzp.zza);
        this.zzg = new zzdy(5);
        this.zzh = new zzdy();
        byte[] bArr = new byte[16];
        this.zzi = bArr;
        this.zzj = new zzdy(bArr);
        this.zzm = new ArrayDeque();
        this.zzn = new ArrayDeque();
        this.zze = new SparseArray();
        this.zzw = -9223372036854775807L;
        this.zzv = -9223372036854775807L;
        this.zzx = -9223372036854775807L;
        this.zzD = zzyv.zza;
        this.zzE = new zzzz[0];
        this.zzF = new zzzz[0];
    }
}
