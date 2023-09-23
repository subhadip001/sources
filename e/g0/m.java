package e.g0;

/* compiled from: Operation.java */
/* loaded from: classes.dex */
public interface m {
    public static final b.c a = new b.c(null);
    public static final b.C0039b b = new b.C0039b(null);

    /* compiled from: Operation.java */
    /* loaded from: classes.dex */
    public static abstract class b {

        /* compiled from: Operation.java */
        /* loaded from: classes.dex */
        public static final class a extends b {
            public final Throwable a;

            public a(Throwable th) {
                this.a = th;
            }

            public String toString() {
                return String.format("FAILURE (%s)", this.a.getMessage());
            }
        }

        /* compiled from: Operation.java */
        /* renamed from: e.g0.m$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0039b extends b {
            public C0039b(a aVar) {
            }

            public String toString() {
                return "IN_PROGRESS";
            }
        }

        /* compiled from: Operation.java */
        /* loaded from: classes.dex */
        public static final class c extends b {
            public c() {
            }

            public String toString() {
                return "SUCCESS";
            }

            public c(a aVar) {
            }
        }
    }
}
