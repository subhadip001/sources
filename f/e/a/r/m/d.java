package f.e.a.r.m;

/* compiled from: StateVerifier.java */
/* loaded from: classes.dex */
public abstract class d {

    /* compiled from: StateVerifier.java */
    /* loaded from: classes.dex */
    public static class b extends d {
        public volatile boolean a;

        public b() {
            super(null);
        }

        @Override // f.e.a.r.m.d
        public void a() {
            if (this.a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public d(a aVar) {
    }

    public abstract void a();
}
