package f.e.a.l.q.c0;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* compiled from: MemorySizeCalculator.java */
/* loaded from: classes.dex */
public final class j {
    public final int a;
    public final int b;
    public final Context c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3295d;

    /* compiled from: MemorySizeCalculator.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        public static final int f3296e;
        public final Context a;
        public ActivityManager b;
        public c c;

        /* renamed from: d  reason: collision with root package name */
        public float f3297d;

        static {
            f3296e = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f3297d = f3296e;
            this.a = context;
            this.b = (ActivityManager) context.getSystemService("activity");
            this.c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !this.b.isLowRamDevice()) {
                return;
            }
            this.f3297d = 0.0f;
        }
    }

    /* compiled from: MemorySizeCalculator.java */
    /* loaded from: classes.dex */
    public static final class b implements c {
        public final DisplayMetrics a;

        public b(DisplayMetrics displayMetrics) {
            this.a = displayMetrics;
        }
    }

    /* compiled from: MemorySizeCalculator.java */
    /* loaded from: classes.dex */
    public interface c {
    }

    public j(a aVar) {
        ActivityManager activityManager;
        this.c = aVar.a;
        int i2 = aVar.b.isLowRamDevice() ? 2097152 : 4194304;
        this.f3295d = i2;
        int round = Math.round(activityManager.getMemoryClass() * 1024 * 1024 * (aVar.b.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = ((b) aVar.c).a;
        float f2 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        int round2 = Math.round(aVar.f3297d * f2);
        int round3 = Math.round(f2 * 2.0f);
        int i3 = round - i2;
        int i4 = round3 + round2;
        if (i4 <= i3) {
            this.b = round3;
            this.a = round2;
        } else {
            float f3 = i3 / (aVar.f3297d + 2.0f);
            this.b = Math.round(2.0f * f3);
            this.a = Math.round(f3 * aVar.f3297d);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder A = f.a.b.a.a.A("Calculation complete, Calculated memory cache size: ");
            A.append(a(this.b));
            A.append(", pool size: ");
            A.append(a(this.a));
            A.append(", byte array size: ");
            A.append(a(i2));
            A.append(", memory class limited? ");
            A.append(i4 > round);
            A.append(", max size: ");
            A.append(a(round));
            A.append(", memoryClass: ");
            A.append(aVar.b.getMemoryClass());
            A.append(", isLowMemoryDevice: ");
            A.append(aVar.b.isLowRamDevice());
            Log.d("MemorySizeCalculator", A.toString());
        }
    }

    public final String a(int i2) {
        return Formatter.formatFileSize(this.c, i2);
    }
}
