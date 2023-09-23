package i.q;

import i.l.a.p;
import i.l.b.i;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Strings.kt */
/* loaded from: classes2.dex */
public final class a implements i.p.b<i.n.c> {
    public final CharSequence a;
    public final int b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final p<CharSequence, Integer, i.d<Integer, Integer>> f8665d;

    /* compiled from: Strings.kt */
    /* renamed from: i.q.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0227a implements Iterator<i.n.c> {

        /* renamed from: f  reason: collision with root package name */
        public int f8666f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f8667g;

        /* renamed from: h  reason: collision with root package name */
        public int f8668h;

        /* renamed from: i  reason: collision with root package name */
        public i.n.c f8669i;

        /* renamed from: j  reason: collision with root package name */
        public int f8670j;

        public C0227a() {
            int i2 = a.this.b;
            int length = a.this.a.length();
            if (length >= 0) {
                if (i2 < 0) {
                    i2 = 0;
                } else if (i2 > length) {
                    i2 = length;
                }
                this.f8667g = i2;
                this.f8668h = i2;
                return;
            }
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + length + " is less than minimum 0.");
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
            if (r6 < r3) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a() {
            /*
                r7 = this;
                int r0 = r7.f8668h
                r1 = 0
                if (r0 >= 0) goto Lc
                r7.f8666f = r1
                r0 = 0
                r7.f8669i = r0
                goto L8f
            Lc:
                i.q.a r2 = i.q.a.this
                int r3 = r2.c
                r4 = 1
                r5 = -1
                if (r3 <= 0) goto L1b
                int r6 = r7.f8670j
                int r6 = r6 + r4
                r7.f8670j = r6
                if (r6 >= r3) goto L23
            L1b:
                java.lang.CharSequence r2 = r2.a
                int r2 = r2.length()
                if (r0 <= r2) goto L37
            L23:
                i.n.c r0 = new i.n.c
                int r1 = r7.f8667g
                i.q.a r2 = i.q.a.this
                java.lang.CharSequence r2 = r2.a
                int r2 = i.q.e.b(r2)
                r0.<init>(r1, r2)
                r7.f8669i = r0
                r7.f8668h = r5
                goto L8d
            L37:
                i.q.a r0 = i.q.a.this
                i.l.a.p<java.lang.CharSequence, java.lang.Integer, i.d<java.lang.Integer, java.lang.Integer>> r2 = r0.f8665d
                java.lang.CharSequence r0 = r0.a
                int r3 = r7.f8668h
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object r0 = r2.k(r0, r3)
                i.d r0 = (i.d) r0
                if (r0 != 0) goto L5f
                i.n.c r0 = new i.n.c
                int r1 = r7.f8667g
                i.q.a r2 = i.q.a.this
                java.lang.CharSequence r2 = r2.a
                int r2 = i.q.e.b(r2)
                r0.<init>(r1, r2)
                r7.f8669i = r0
                r7.f8668h = r5
                goto L8d
            L5f:
                A r2 = r0.f8606f
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                B r0 = r0.f8607g
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r3 = r7.f8667g
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r2 > r5) goto L7a
                i.n.c r3 = i.n.c.f8662i
                i.n.c r3 = i.n.c.f8663j
                goto L82
            L7a:
                i.n.c r5 = new i.n.c
                int r6 = r2 + (-1)
                r5.<init>(r3, r6)
                r3 = r5
            L82:
                r7.f8669i = r3
                int r2 = r2 + r0
                r7.f8667g = r2
                if (r0 != 0) goto L8a
                r1 = 1
            L8a:
                int r2 = r2 + r1
                r7.f8668h = r2
            L8d:
                r7.f8666f = r4
            L8f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i.q.a.C0227a.a():void");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f8666f == -1) {
                a();
            }
            return this.f8666f == 1;
        }

        @Override // java.util.Iterator
        public i.n.c next() {
            if (this.f8666f == -1) {
                a();
            }
            if (this.f8666f != 0) {
                i.n.c cVar = this.f8669i;
                i.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f8669i = null;
                this.f8666f = -1;
                return cVar;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(CharSequence charSequence, int i2, int i3, p<? super CharSequence, ? super Integer, i.d<Integer, Integer>> pVar) {
        i.e(charSequence, "input");
        i.e(pVar, "getNextMatch");
        this.a = charSequence;
        this.b = i2;
        this.c = i3;
        this.f8665d = pVar;
    }

    @Override // i.p.b
    public Iterator<i.n.c> iterator() {
        return new C0227a();
    }
}
