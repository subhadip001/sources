package e.g0.t.s;

/* compiled from: Preference.java */
/* loaded from: classes.dex */
public class d {
    public String a;
    public Long b;

    public d(String str, long j2) {
        this.a = str;
        this.b = Long.valueOf(j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.a.equals(dVar.a)) {
                Long l2 = this.b;
                Long l3 = dVar.b;
                return l2 != null ? l2.equals(l3) : l3 == null;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l2 = this.b;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public d(String str, boolean z) {
        long j2 = z ? 1L : 0L;
        this.a = str;
        this.b = Long.valueOf(j2);
    }
}
