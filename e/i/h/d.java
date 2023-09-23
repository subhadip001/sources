package e.i.h;

/* compiled from: TextDirectionHeuristicsCompat.java */
/* loaded from: classes.dex */
public final class d {
    public static final e.i.h.c a = new C0044d(null, false);
    public static final e.i.h.c b = new C0044d(null, true);
    public static final e.i.h.c c;

    /* renamed from: d  reason: collision with root package name */
    public static final e.i.h.c f2507d;

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: classes.dex */
    public static class a implements b {
        public static final a a = new a();

        @Override // e.i.h.d.b
        public int a(CharSequence charSequence, int i2, int i3) {
            int i4 = i3 + i2;
            int i5 = 2;
            while (i2 < i4 && i5 == 2) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i2));
                e.i.h.c cVar = d.a;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                i5 = 2;
                                break;
                        }
                        i2++;
                    }
                    i5 = 0;
                    i2++;
                }
                i5 = 1;
                i2++;
            }
            return i5;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: classes.dex */
    public interface b {
        int a(CharSequence charSequence, int i2, int i3);
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: classes.dex */
    public static abstract class c implements e.i.h.c {
        public final b a;

        public c(b bVar) {
            this.a = bVar;
        }

        public abstract boolean a();

        public boolean b(CharSequence charSequence, int i2, int i3) {
            if (i2 >= 0 && i3 >= 0 && charSequence.length() - i3 >= i2) {
                b bVar = this.a;
                if (bVar == null) {
                    return a();
                }
                int a = bVar.a(charSequence, i2, i3);
                if (a != 0) {
                    if (a != 1) {
                        return a();
                    }
                    return false;
                }
                return true;
            }
            throw new IllegalArgumentException();
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* renamed from: e.i.h.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0044d extends c {
        public final boolean b;

        public C0044d(b bVar, boolean z) {
            super(bVar);
            this.b = z;
        }

        @Override // e.i.h.d.c
        public boolean a() {
            return this.b;
        }
    }

    static {
        a aVar = a.a;
        c = new C0044d(aVar, false);
        f2507d = new C0044d(aVar, true);
    }
}
