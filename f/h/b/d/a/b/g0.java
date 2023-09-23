package f.h.b.d.a.b;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class g0 extends a {
    public final String a;
    public final String b;

    public g0(int i2, String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // f.h.b.d.a.b.a
    public final String a() {
        return this.b;
    }

    @Override // f.h.b.d.a.b.a
    public final int b() {
        return 0;
    }

    @Override // f.h.b.d.a.b.a
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (aVar.b() == 0 && ((str = this.a) != null ? str.equals(aVar.c()) : aVar.c() == null) && ((str2 = this.b) != null ? str2.equals(aVar.a()) : aVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ (-721379959)) * 1000003;
        String str2 = this.b;
        return hashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length());
        sb.append("AssetPackLocation{packStorageMethod=");
        sb.append(0);
        sb.append(", path=");
        sb.append(str);
        return f.a.b.a.a.v(sb, ", assetsPath=", str2, "}");
    }
}
