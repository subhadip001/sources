package f.e.a.l.s.c;

import android.graphics.Bitmap;
import com.bumptech.glide.load.EncodeStrategy;

/* compiled from: BitmapEncoder.java */
/* loaded from: classes.dex */
public class c implements f.e.a.l.n<Bitmap> {
    public static final f.e.a.l.k<Integer> b = f.e.a.l.k.b("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);
    public static final f.e.a.l.k<Bitmap.CompressFormat> c = f.e.a.l.k.a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
    public final f.e.a.l.q.b0.b a;

    public c(f.e.a.l.q.b0.b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
        if (r6 != null) goto L20;
     */
    @Override // f.e.a.l.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(java.lang.Object r9, java.io.File r10, f.e.a.l.l r11) {
        /*
            r8 = this;
            f.e.a.l.q.v r9 = (f.e.a.l.q.v) r9
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r9 = r9.get()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            f.e.a.l.k<android.graphics.Bitmap$CompressFormat> r1 = f.e.a.l.s.c.c.c
            java.lang.Object r1 = r11.c(r1)
            android.graphics.Bitmap$CompressFormat r1 = (android.graphics.Bitmap.CompressFormat) r1
            if (r1 == 0) goto L15
            goto L20
        L15:
            boolean r1 = r9.hasAlpha()
            if (r1 == 0) goto L1e
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG
            goto L20
        L1e:
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
        L20:
            r9.getWidth()
            r9.getHeight()
            int r2 = f.e.a.r.h.b     // Catch: java.lang.Throwable -> Lc3
            long r2 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> Lc3
            f.e.a.l.k<java.lang.Integer> r4 = f.e.a.l.s.c.c.b     // Catch: java.lang.Throwable -> Lc3
            java.lang.Object r4 = r11.c(r4)     // Catch: java.lang.Throwable -> Lc3
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> Lc3
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> Lc3
            r5 = 0
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            r7.<init>(r10)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            f.e.a.l.q.b0.b r10 = r8.a     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            if (r10 == 0) goto L4c
            f.e.a.l.p.c r10 = new f.e.a.l.p.c     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            f.e.a.l.q.b0.b r6 = r8.a     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            r10.<init>(r7, r6)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            r6 = r10
            goto L4d
        L4c:
            r6 = r7
        L4d:
            r9.compress(r1, r4, r6)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            r6.close()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            r5 = 1
            goto L6b
        L55:
            r9 = move-exception
            goto Lbd
        L57:
            r10 = move-exception
            r6 = r7
            goto L5d
        L5a:
            r9 = move-exception
            goto Lbc
        L5c:
            r10 = move-exception
        L5d:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L5a
            if (r4 == 0) goto L69
            java.lang.String r4 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r4, r10)     // Catch: java.lang.Throwable -> L5a
        L69:
            if (r6 == 0) goto L6e
        L6b:
            r6.close()     // Catch: java.io.IOException -> L6e java.lang.Throwable -> Lc3
        L6e:
            r10 = 2
            boolean r10 = android.util.Log.isLoggable(r0, r10)     // Catch: java.lang.Throwable -> Lc3
            if (r10 == 0) goto Lbb
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc3
            r10.<init>()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r4 = "Compressed with type: "
            r10.append(r4)     // Catch: java.lang.Throwable -> Lc3
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r1 = " of size "
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc3
            int r1 = f.e.a.r.l.c(r9)     // Catch: java.lang.Throwable -> Lc3
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r1 = " in "
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc3
            double r1 = f.e.a.r.h.a(r2)     // Catch: java.lang.Throwable -> Lc3
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r1 = ", options format: "
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc3
            f.e.a.l.k<android.graphics.Bitmap$CompressFormat> r1 = f.e.a.l.s.c.c.c     // Catch: java.lang.Throwable -> Lc3
            java.lang.Object r11 = r11.c(r1)     // Catch: java.lang.Throwable -> Lc3
            r10.append(r11)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r11 = ", hasAlpha: "
            r10.append(r11)     // Catch: java.lang.Throwable -> Lc3
            boolean r9 = r9.hasAlpha()     // Catch: java.lang.Throwable -> Lc3
            r10.append(r9)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r9 = r10.toString()     // Catch: java.lang.Throwable -> Lc3
            android.util.Log.v(r0, r9)     // Catch: java.lang.Throwable -> Lc3
        Lbb:
            return r5
        Lbc:
            r7 = r6
        Lbd:
            if (r7 == 0) goto Lc2
            r7.close()     // Catch: java.io.IOException -> Lc2 java.lang.Throwable -> Lc3
        Lc2:
            throw r9     // Catch: java.lang.Throwable -> Lc3
        Lc3:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.a.l.s.c.c.a(java.lang.Object, java.io.File, f.e.a.l.l):boolean");
    }

    @Override // f.e.a.l.n
    public EncodeStrategy b(f.e.a.l.l lVar) {
        return EncodeStrategy.TRANSFORMED;
    }
}
