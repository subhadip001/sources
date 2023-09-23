package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbby {
    private final zzbbn zza;
    private final int zzb;
    private String zzc;
    private final int zzd;

    public zzbby(int i2, int i3, int i4) {
        this.zzb = i2;
        i3 = (i3 > 64 || i3 < 0) ? 64 : 64;
        if (i4 <= 0) {
            this.zzd = 1;
        } else {
            this.zzd = i4;
        }
        this.zza = new zzbbw(i3);
    }

    public final String zza(ArrayList arrayList, ArrayList arrayList2) {
        Collections.sort(arrayList2, new zzbbx(this));
        HashSet hashSet = new HashSet();
        loop0: for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            String[] split = Normalizer.normalize((CharSequence) arrayList.get(((zzbbm) arrayList2.get(i2)).zze()), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (split.length != 0) {
                for (String str : split) {
                    if (str.contains("'")) {
                        StringBuilder sb = new StringBuilder(str);
                        int i3 = 1;
                        boolean z = false;
                        while (true) {
                            int i4 = i3 + 2;
                            if (i4 > sb.length()) {
                                break;
                            }
                            if (sb.charAt(i3) == '\'') {
                                if (sb.charAt(i3 - 1) != ' ') {
                                    int i5 = i3 + 1;
                                    if ((sb.charAt(i5) == 's' || sb.charAt(i5) == 'S') && (i4 == sb.length() || sb.charAt(i4) == ' ')) {
                                        sb.insert(i3, ' ');
                                        i3 = i4;
                                        z = true;
                                    }
                                }
                                sb.setCharAt(i3, ' ');
                                z = true;
                            }
                            i3++;
                        }
                        String sb2 = z ? sb.toString() : null;
                        if (sb2 != null) {
                            this.zzc = sb2;
                            str = sb2;
                        }
                    }
                    String[] zzb = zzbbr.zzb(str, true);
                    if (zzb.length >= this.zzd) {
                        for (int i6 = 0; i6 < zzb.length; i6++) {
                            String str2 = "";
                            for (int i7 = 0; i7 < this.zzd; i7++) {
                                int i8 = i6 + i7;
                                if (i8 >= zzb.length) {
                                    break;
                                }
                                if (i7 > 0) {
                                    str2 = str2.concat(" ");
                                }
                                str2 = str2.concat(String.valueOf(zzb[i8]));
                            }
                            hashSet.add(str2);
                            if (hashSet.size() >= this.zzb) {
                                break loop0;
                            }
                        }
                        if (hashSet.size() >= this.zzb) {
                            break loop0;
                        }
                    }
                }
                continue;
            }
        }
        zzbbp zzbbpVar = new zzbbp();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                zzbbpVar.zzb.write(this.zza.zzb((String) it.next()));
            } catch (IOException e2) {
                zzcfi.zzh("Error while writing hash to byteStream", e2);
            }
        }
        return zzbbpVar.toString();
    }
}
