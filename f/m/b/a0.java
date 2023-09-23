package f.m.b;

import java.io.PrintWriter;

/* compiled from: StatsSnapshot.java */
/* loaded from: classes2.dex */
public class a0 {
    public final int a;
    public final int b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final long f6819d;

    /* renamed from: e  reason: collision with root package name */
    public final long f6820e;

    /* renamed from: f  reason: collision with root package name */
    public final long f6821f;

    /* renamed from: g  reason: collision with root package name */
    public final long f6822g;

    /* renamed from: h  reason: collision with root package name */
    public final long f6823h;

    /* renamed from: i  reason: collision with root package name */
    public final long f6824i;

    /* renamed from: j  reason: collision with root package name */
    public final long f6825j;

    /* renamed from: k  reason: collision with root package name */
    public final int f6826k;

    /* renamed from: l  reason: collision with root package name */
    public final int f6827l;

    /* renamed from: m  reason: collision with root package name */
    public final int f6828m;
    public final long n;

    public a0(int i2, int i3, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, int i4, int i5, int i6, long j10) {
        this.a = i2;
        this.b = i3;
        this.c = j2;
        this.f6819d = j3;
        this.f6820e = j4;
        this.f6821f = j5;
        this.f6822g = j6;
        this.f6823h = j7;
        this.f6824i = j8;
        this.f6825j = j9;
        this.f6826k = i4;
        this.f6827l = i5;
        this.f6828m = i6;
        this.n = j10;
    }

    public void a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((this.b / this.a) * 100.0f));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f6819d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f6826k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f6820e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f6823h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f6827l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f6821f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f6828m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f6822g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f6824i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f6825j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("StatsSnapshot{maxSize=");
        A.append(this.a);
        A.append(", size=");
        A.append(this.b);
        A.append(", cacheHits=");
        A.append(this.c);
        A.append(", cacheMisses=");
        A.append(this.f6819d);
        A.append(", downloadCount=");
        A.append(this.f6826k);
        A.append(", totalDownloadSize=");
        A.append(this.f6820e);
        A.append(", averageDownloadSize=");
        A.append(this.f6823h);
        A.append(", totalOriginalBitmapSize=");
        A.append(this.f6821f);
        A.append(", totalTransformedBitmapSize=");
        A.append(this.f6822g);
        A.append(", averageOriginalBitmapSize=");
        A.append(this.f6824i);
        A.append(", averageTransformedBitmapSize=");
        A.append(this.f6825j);
        A.append(", originalBitmapCount=");
        A.append(this.f6827l);
        A.append(", transformedBitmapCount=");
        A.append(this.f6828m);
        A.append(", timeStamp=");
        A.append(this.n);
        A.append('}');
        return A.toString();
    }
}
