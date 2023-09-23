package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzyo implements zzyz {
    private static final int[] zza = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};
    private static final zzyn zzc = new zzyn();

    private static final void zzc(int i2, List list) {
        switch (i2) {
            case 0:
                list.add(new zzafp());
                return;
            case 1:
                list.add(new zzafs());
                return;
            case 2:
                list.add(new zzafv(0));
                return;
            case 3:
                list.add(new zzaah(0));
                return;
            case 4:
                zzys zza2 = zzc.zza(0);
                if (zza2 != null) {
                    list.add(zza2);
                    return;
                } else {
                    list.add(new zzaan(0));
                    return;
                }
            case 5:
                list.add(new zzaaq());
                return;
            case 6:
                list.add(new zzadh(0));
                return;
            case 7:
                list.add(new zzadp(0));
                return;
            case 8:
                list.add(new zzaej(0, null));
                list.add(new zzaeo(0));
                return;
            case 9:
                list.add(new zzafd());
                return;
            case 10:
                list.add(new zzagy());
                return;
            case 11:
                list.add(new zzahi(1, 0, 112800));
                return;
            case 12:
                list.add(new zzahu());
                return;
            case 13:
            default:
                return;
            case 14:
                list.add(new zzaav());
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final synchronized zzys[] zza() {
        return zzb(Uri.EMPTY, new HashMap());
    }

    /* JADX WARN: Code restructure failed: missing block: B:191:0x02d0, code lost:
        if (r15 == r3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x02d2, code lost:
        zzc(r15, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0181 A[Catch: all -> 0x02f4, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0016, B:8:0x001d, B:105:0x0181, B:106:0x0184, B:192:0x02d2, B:193:0x02d5, B:195:0x02da, B:198:0x02e0, B:199:0x02e3, B:200:0x02e6, B:109:0x018d, B:111:0x0195, B:114:0x019f, B:117:0x01aa, B:119:0x01b2, B:122:0x01bc, B:125:0x01c7, B:128:0x01d2, B:131:0x01dd, B:133:0x01eb, B:136:0x01f5, B:139:0x0200, B:141:0x0208, B:143:0x0216, B:145:0x0224, B:148:0x0234, B:150:0x0242, B:153:0x024c, B:155:0x0254, B:157:0x025c, B:159:0x0264, B:162:0x026e, B:164:0x0276, B:167:0x0285, B:169:0x028d, B:172:0x0296, B:174:0x029e, B:177:0x02a7, B:179:0x02af, B:12:0x003b, B:13:0x0043, B:88:0x0158, B:15:0x0048, B:18:0x0054, B:21:0x0060, B:24:0x006c, B:27:0x0077, B:30:0x0082, B:33:0x008d, B:36:0x0099, B:39:0x00a5, B:42:0x00b1, B:45:0x00bd, B:48:0x00c8, B:51:0x00d3, B:54:0x00de, B:57:0x00ea, B:60:0x00f6, B:63:0x0101, B:66:0x010c, B:69:0x0117, B:72:0x0122, B:75:0x012c, B:78:0x0137, B:81:0x0142, B:84:0x014d), top: B:206:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x018d A[Catch: all -> 0x02f4, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0016, B:8:0x001d, B:105:0x0181, B:106:0x0184, B:192:0x02d2, B:193:0x02d5, B:195:0x02da, B:198:0x02e0, B:199:0x02e3, B:200:0x02e6, B:109:0x018d, B:111:0x0195, B:114:0x019f, B:117:0x01aa, B:119:0x01b2, B:122:0x01bc, B:125:0x01c7, B:128:0x01d2, B:131:0x01dd, B:133:0x01eb, B:136:0x01f5, B:139:0x0200, B:141:0x0208, B:143:0x0216, B:145:0x0224, B:148:0x0234, B:150:0x0242, B:153:0x024c, B:155:0x0254, B:157:0x025c, B:159:0x0264, B:162:0x026e, B:164:0x0276, B:167:0x0285, B:169:0x028d, B:172:0x0296, B:174:0x029e, B:177:0x02a7, B:179:0x02af, B:12:0x003b, B:13:0x0043, B:88:0x0158, B:15:0x0048, B:18:0x0054, B:21:0x0060, B:24:0x006c, B:27:0x0077, B:30:0x0082, B:33:0x008d, B:36:0x0099, B:39:0x00a5, B:42:0x00b1, B:45:0x00bd, B:48:0x00c8, B:51:0x00d3, B:54:0x00de, B:57:0x00ea, B:60:0x00f6, B:63:0x0101, B:66:0x010c, B:69:0x0117, B:72:0x0122, B:75:0x012c, B:78:0x0137, B:81:0x0142, B:84:0x014d), top: B:206:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02da A[Catch: all -> 0x02f4, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0016, B:8:0x001d, B:105:0x0181, B:106:0x0184, B:192:0x02d2, B:193:0x02d5, B:195:0x02da, B:198:0x02e0, B:199:0x02e3, B:200:0x02e6, B:109:0x018d, B:111:0x0195, B:114:0x019f, B:117:0x01aa, B:119:0x01b2, B:122:0x01bc, B:125:0x01c7, B:128:0x01d2, B:131:0x01dd, B:133:0x01eb, B:136:0x01f5, B:139:0x0200, B:141:0x0208, B:143:0x0216, B:145:0x0224, B:148:0x0234, B:150:0x0242, B:153:0x024c, B:155:0x0254, B:157:0x025c, B:159:0x0264, B:162:0x026e, B:164:0x0276, B:167:0x0285, B:169:0x028d, B:172:0x0296, B:174:0x029e, B:177:0x02a7, B:179:0x02af, B:12:0x003b, B:13:0x0043, B:88:0x0158, B:15:0x0048, B:18:0x0054, B:21:0x0060, B:24:0x006c, B:27:0x0077, B:30:0x0082, B:33:0x008d, B:36:0x0099, B:39:0x00a5, B:42:0x00b1, B:45:0x00bd, B:48:0x00c8, B:51:0x00d3, B:54:0x00de, B:57:0x00ea, B:60:0x00f6, B:63:0x0101, B:66:0x010c, B:69:0x0117, B:72:0x0122, B:75:0x012c, B:78:0x0137, B:81:0x0142, B:84:0x014d), top: B:206:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.zzyz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.google.android.gms.internal.ads.zzys[] zzb(android.net.Uri r19, java.util.Map r20) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyo.zzb(android.net.Uri, java.util.Map):com.google.android.gms.internal.ads.zzys[]");
    }
}
