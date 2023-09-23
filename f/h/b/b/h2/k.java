package f.h.b.b.h2;

/* compiled from: DolbyVisionConfig.java */
/* loaded from: classes.dex */
public final class k {
    public final String a;

    public k(int i2, int i3, String str) {
        this.a = str;
    }

    public static k a(f.h.b.b.g2.t tVar) {
        String str;
        tVar.D(2);
        int r = tVar.r();
        int i2 = r >> 1;
        int r2 = ((tVar.r() >> 3) & 31) | ((r & 1) << 5);
        if (i2 == 4 || i2 == 5 || i2 == 7) {
            str = "dvhe";
        } else if (i2 == 8) {
            str = "hev1";
        } else if (i2 != 9) {
            return null;
        } else {
            str = "avc3";
        }
        String str2 = r2 < 10 ? ".0" : ".";
        StringBuilder sb = new StringBuilder(str2.length() + str.length() + 24);
        sb.append(str);
        sb.append(".0");
        sb.append(i2);
        sb.append(str2);
        sb.append(r2);
        return new k(i2, r2, sb.toString());
    }
}
