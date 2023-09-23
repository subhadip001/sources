package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzafx implements zzahl {
    private final List zza;

    public zzafx() {
        this(0);
    }

    private final zzahb zzb(zzahk zzahkVar) {
        return new zzahb(zzd(zzahkVar));
    }

    private final zzahp zzc(zzahk zzahkVar) {
        return new zzahp(zzd(zzahkVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    private final List zzd(zzahk zzahkVar) {
        String str;
        int i2;
        List list;
        zzdy zzdyVar = new zzdy(zzahkVar.zzd);
        ArrayList arrayList = this.zza;
        while (zzdyVar.zza() > 0) {
            int zzk = zzdyVar.zzk();
            int zzc = zzdyVar.zzc() + zzdyVar.zzk();
            if (zzk == 134) {
                arrayList = new ArrayList();
                int zzk2 = zzdyVar.zzk() & 31;
                for (int i3 = 0; i3 < zzk2; i3++) {
                    String zzx = zzdyVar.zzx(3, zzfog.zzc);
                    int zzk3 = zzdyVar.zzk();
                    int i4 = zzk3 & 128;
                    if (i4 != 0) {
                        i2 = zzk3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i2 = 1;
                    }
                    byte zzk4 = (byte) zzdyVar.zzk();
                    zzdyVar.zzG(1);
                    if (i4 != 0) {
                        int i5 = zzcy.zza;
                        list = Collections.singletonList((zzk4 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    zzab zzabVar = new zzab();
                    zzabVar.zzS(str);
                    zzabVar.zzK(zzx);
                    zzabVar.zzu(i2);
                    zzabVar.zzI(list);
                    arrayList.add(zzabVar.zzY());
                }
            }
            zzdyVar.zzF(zzc);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzahl
    public final zzahn zza(int i2, zzahk zzahkVar) {
        if (i2 != 2) {
            if (i2 == 3 || i2 == 4) {
                return new zzagr(new zzago(zzahkVar.zzb));
            }
            if (i2 == 21) {
                return new zzagr(new zzagm());
            }
            if (i2 == 27) {
                return new zzagr(new zzagj(zzb(zzahkVar), false, false));
            }
            if (i2 == 36) {
                return new zzagr(new zzagl(zzb(zzahkVar)));
            }
            if (i2 == 89) {
                return new zzagr(new zzafz(zzahkVar.zzc));
            }
            if (i2 == 138) {
                return new zzagr(new zzafy(zzahkVar.zzb));
            }
            if (i2 == 172) {
                return new zzagr(new zzaft(zzahkVar.zzb));
            }
            if (i2 == 257) {
                return new zzaha(new zzagq("application/vnd.dvb.ait"));
            }
            if (i2 != 128) {
                if (i2 != 129) {
                    if (i2 == 134) {
                        return new zzaha(new zzagq("application/x-scte35"));
                    }
                    if (i2 != 135) {
                        switch (i2) {
                            case 15:
                                return new zzagr(new zzafw(false, zzahkVar.zzb));
                            case 16:
                                return new zzagr(new zzagf(zzc(zzahkVar)));
                            case 17:
                                return new zzagr(new zzagn(zzahkVar.zzb));
                            default:
                                return null;
                        }
                    }
                }
                return new zzagr(new zzafq(zzahkVar.zzb));
            }
        }
        return new zzagr(new zzagc(zzc(zzahkVar)));
    }

    public zzafx(int i2) {
        this.zza = zzfrh.zzo();
    }
}
