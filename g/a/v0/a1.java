package g.a.v0;

import java.util.ArrayList;

/* compiled from: InsightBuilder.java */
/* loaded from: classes2.dex */
public final class a1 {
    public final ArrayList<String> a = new ArrayList<>();

    public a1 a(Object obj) {
        this.a.add(String.valueOf(obj));
        return this;
    }

    public a1 b(String str, Object obj) {
        ArrayList<String> arrayList = this.a;
        arrayList.add(str + "=" + obj);
        return this;
    }

    public String toString() {
        return this.a.toString();
    }
}
