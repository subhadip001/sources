package com.google.android.play.core.assetpacks;

import com.google.android.play.core.tasks.zzj;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public class AssetPackException extends zzj {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AssetPackException(int r7) {
        /*
            r6 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r2 = 0
            r0[r2] = r1
            java.util.Map r1 = f.h.b.d.a.b.b.a.a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            boolean r3 = r1.containsKey(r2)
            if (r3 != 0) goto L19
            java.lang.String r1 = ""
            goto L47
        L19:
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Map r3 = f.h.b.d.a.b.b.a.b
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + 113
            int r3 = r3 + r4
            r5.<init>(r3)
            java.lang.String r3 = " (https://developer.android.com/reference/com/google/android/play/core/assetpacks/model/AssetPackErrorCode.html#"
            java.lang.String r4 = ")"
            java.lang.String r1 = f.a.b.a.a.w(r5, r1, r3, r2, r4)
        L47:
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "Asset Pack Download Error(%d): %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r6.<init>(r0)
            if (r7 == 0) goto L56
            return
        L56:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "errorCode should not be 0."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.AssetPackException.<init>(int):void");
    }
}
