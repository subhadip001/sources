package f.n.a.o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: Command.java */
/* loaded from: classes2.dex */
public class a {
    public List<String> a;
    public String b;

    /* compiled from: Command.java */
    /* loaded from: classes2.dex */
    public static class b extends a {
        public b() {
            super(null);
        }

        public a b(String str) {
            this.a.add("-map");
            this.a.add(str);
            return this;
        }

        public a c() {
            String str = this.b;
            if (str != null) {
                this.a.add(str);
            }
            return new a(this, null);
        }

        public b d(String str) {
            Collections.addAll(this.a, str.trim().split(" "));
            return this;
        }

        public b e(String str) {
            this.a.add("-vf");
            this.a.add(str);
            return this;
        }
    }

    public a(C0180a c0180a) {
        this.a = new ArrayList();
    }

    public String[] a() {
        String[] strArr = new String[this.a.size()];
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            strArr[i2] = this.a.get(i2);
        }
        return strArr;
    }

    public a(b bVar, C0180a c0180a) {
        this.a = new ArrayList();
        this.a = bVar.a;
    }
}
