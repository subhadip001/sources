package f.h.b.b.y1;

/* compiled from: SeekMap.java */
/* loaded from: classes.dex */
public interface t {

    /* compiled from: SeekMap.java */
    /* loaded from: classes.dex */
    public static class b implements t {
        public final long a;
        public final a b;

        public b(long j2, long j3) {
            this.a = j2;
            this.b = new a(j3 == 0 ? u.c : new u(0L, j3));
        }

        @Override // f.h.b.b.y1.t
        public boolean c() {
            return false;
        }

        @Override // f.h.b.b.y1.t
        public a h(long j2) {
            return this.b;
        }

        @Override // f.h.b.b.y1.t
        public long i() {
            return this.a;
        }
    }

    boolean c();

    a h(long j2);

    long i();

    /* compiled from: SeekMap.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final u a;
        public final u b;

        public a(u uVar) {
            this.a = uVar;
            this.b = uVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public String toString() {
            String sb;
            String valueOf = String.valueOf(this.a);
            if (this.a.equals(this.b)) {
                sb = "";
            } else {
                String valueOf2 = String.valueOf(this.b);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 2);
                sb2.append(", ");
                sb2.append(valueOf2);
                sb = sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb).length() + valueOf.length() + 2);
            sb3.append("[");
            sb3.append(valueOf);
            sb3.append(sb);
            sb3.append("]");
            return sb3.toString();
        }

        public a(u uVar, u uVar2) {
            this.a = uVar;
            this.b = uVar2;
        }
    }
}
