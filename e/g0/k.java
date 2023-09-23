package e.g0;

import android.util.Log;

/* compiled from: Logger.java */
/* loaded from: classes.dex */
public abstract class k {
    public static k a;

    /* compiled from: Logger.java */
    /* loaded from: classes.dex */
    public static class a extends k {
        public int b;

        public a(int i2) {
            this.b = i2;
        }

        @Override // e.g0.k
        public void a(String str, String str2, Throwable... thArr) {
            if (this.b <= 3) {
                if (thArr.length >= 1) {
                    Log.d(str, str2, thArr[0]);
                } else {
                    Log.d(str, str2);
                }
            }
        }

        @Override // e.g0.k
        public void b(String str, String str2, Throwable... thArr) {
            if (this.b <= 6) {
                if (thArr.length >= 1) {
                    Log.e(str, str2, thArr[0]);
                } else {
                    Log.e(str, str2);
                }
            }
        }

        @Override // e.g0.k
        public void d(String str, String str2, Throwable... thArr) {
            if (this.b <= 4) {
                if (thArr.length >= 1) {
                    Log.i(str, str2, thArr[0]);
                } else {
                    Log.i(str, str2);
                }
            }
        }

        @Override // e.g0.k
        public void f(String str, String str2, Throwable... thArr) {
            if (this.b <= 5) {
                if (thArr.length >= 1) {
                    Log.w(str, str2, thArr[0]);
                } else {
                    Log.w(str, str2);
                }
            }
        }
    }

    public static synchronized k c() {
        k kVar;
        synchronized (k.class) {
            if (a == null) {
                a = new a(3);
            }
            kVar = a;
        }
        return kVar;
    }

    public static String e(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void f(String str, String str2, Throwable... thArr);
}
