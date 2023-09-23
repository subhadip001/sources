package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzedx implements zzfuw {
    public final /* synthetic */ boolean zza;
    public final /* synthetic */ zzedy zzb;

    public zzedx(zzedy zzedyVar, boolean z) {
        this.zzb = zzedyVar;
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zza(Throwable th) {
        zzcfi.zzg("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    @Override // com.google.android.gms.internal.ads.zzfuw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r8) {
        /*
            r7 = this;
            android.os.Bundle r8 = (android.os.Bundle) r8
            com.google.android.gms.internal.ads.zzedy r0 = r7.zzb
            com.google.android.gms.ads.internal.util.zzg r0 = com.google.android.gms.internal.ads.zzedy.zzc(r0)
            boolean r0 = r0.zzP()
            if (r0 == 0) goto Lf
            return
        Lf:
            java.lang.String r0 = "ad_types"
            java.lang.Object r0 = r8.get(r0)
            boolean r1 = r0 instanceof java.util.List
            if (r1 == 0) goto L1c
            java.util.List r0 = (java.util.List) r0
            goto L26
        L1c:
            boolean r1 = r0 instanceof java.lang.String[]
            if (r1 == 0) goto L4c
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.util.List r0 = java.util.Arrays.asList(r0)
        L26:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L33:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = r0.next()
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L33
            java.lang.String r2 = (java.lang.String) r2
            r1.add(r2)
            goto L33
        L47:
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            goto L50
        L4c:
            java.util.List r0 = java.util.Collections.emptyList()
        L50:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L59:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb3
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.hashCode()
            r3 = 3
            r5 = 2
            r6 = 1
            switch(r2) {
                case -1396342996: goto L8e;
                case -1052618729: goto L84;
                case -239580146: goto L7a;
                case 604727084: goto L70;
                default: goto L6f;
            }
        L6f:
            goto L98
        L70:
            java.lang.String r2 = "interstitial"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L98
            r1 = 1
            goto L99
        L7a:
            java.lang.String r2 = "rewarded"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L98
            r1 = 3
            goto L99
        L84:
            java.lang.String r2 = "native"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L98
            r1 = 2
            goto L99
        L8e:
            java.lang.String r2 = "banner"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L98
            r1 = 0
            goto L99
        L98:
            r1 = -1
        L99:
            if (r1 == 0) goto Lad
            if (r1 == r6) goto Laa
            if (r1 == r5) goto La7
            if (r1 == r3) goto La4
            com.google.android.gms.internal.ads.zzbej r1 = com.google.android.gms.internal.ads.zzbej.AD_FORMAT_TYPE_UNSPECIFIED
            goto Laf
        La4:
            com.google.android.gms.internal.ads.zzbej r1 = com.google.android.gms.internal.ads.zzbej.REWARD_BASED_VIDEO_AD
            goto Laf
        La7:
            com.google.android.gms.internal.ads.zzbej r1 = com.google.android.gms.internal.ads.zzbej.NATIVE_APP_INSTALL
            goto Laf
        Laa:
            com.google.android.gms.internal.ads.zzbej r1 = com.google.android.gms.internal.ads.zzbej.INTERSTITIAL
            goto Laf
        Lad:
            com.google.android.gms.internal.ads.zzbej r1 = com.google.android.gms.internal.ads.zzbej.BANNER
        Laf:
            r4.add(r1)
            goto L59
        Lb3:
            com.google.android.gms.internal.ads.zzedy r0 = r7.zzb
            com.google.android.gms.internal.ads.zzbfy r6 = com.google.android.gms.internal.ads.zzedy.zzb(r0, r8)
            com.google.android.gms.internal.ads.zzedy r0 = r7.zzb
            com.google.android.gms.internal.ads.zzbfp r5 = com.google.android.gms.internal.ads.zzedy.zza(r0, r8)
            com.google.android.gms.internal.ads.zzedy r8 = r7.zzb
            com.google.android.gms.internal.ads.zzedn r8 = com.google.android.gms.internal.ads.zzedy.zzd(r8)
            boolean r3 = r7.zza
            com.google.android.gms.internal.ads.zzedw r0 = new com.google.android.gms.internal.ads.zzedw
            r1 = r0
            r2 = r7
            r1.<init>()
            r8.zza(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzedx.zzb(java.lang.Object):void");
    }
}
