package f.h.h;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: UnsafeUtil.java */
/* loaded from: classes2.dex */
public final class k1 {
    public static final Unsafe a;
    public static final Class<?> b;
    public static final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f6404d;

    /* renamed from: e  reason: collision with root package name */
    public static final e f6405e;

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f6406f;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f6407g;

    /* renamed from: h  reason: collision with root package name */
    public static final long f6408h;

    /* renamed from: i  reason: collision with root package name */
    public static final long f6409i;

    /* renamed from: j  reason: collision with root package name */
    public static final boolean f6410j;

    /* compiled from: UnsafeUtil.java */
    /* loaded from: classes2.dex */
    public static class a implements PrivilegedExceptionAction<Unsafe> {
        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a */
        public Unsafe run() {
            Field[] declaredFields;
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    /* compiled from: UnsafeUtil.java */
    /* loaded from: classes2.dex */
    public static final class b extends e {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // f.h.h.k1.e
        public void c(long j2, byte[] bArr, long j3, long j4) {
            throw new UnsupportedOperationException();
        }

        @Override // f.h.h.k1.e
        public boolean d(Object obj, long j2) {
            return k1.f6410j ? k1.k(obj, j2) != 0 : k1.l(obj, j2) != 0;
        }

        @Override // f.h.h.k1.e
        public byte e(long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // f.h.h.k1.e
        public byte f(Object obj, long j2) {
            if (k1.f6410j) {
                return k1.k(obj, j2);
            }
            return k1.l(obj, j2);
        }

        @Override // f.h.h.k1.e
        public double g(Object obj, long j2) {
            return Double.longBitsToDouble(j(obj, j2));
        }

        @Override // f.h.h.k1.e
        public float h(Object obj, long j2) {
            return Float.intBitsToFloat(i(obj, j2));
        }

        @Override // f.h.h.k1.e
        public void m(Object obj, long j2, boolean z) {
            if (k1.f6410j) {
                k1.u(obj, j2, z ? (byte) 1 : (byte) 0);
            } else {
                k1.v(obj, j2, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // f.h.h.k1.e
        public void n(Object obj, long j2, byte b) {
            if (k1.f6410j) {
                k1.u(obj, j2, b);
            } else {
                k1.v(obj, j2, b);
            }
        }

        @Override // f.h.h.k1.e
        public void o(Object obj, long j2, double d2) {
            r(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // f.h.h.k1.e
        public void p(Object obj, long j2, float f2) {
            q(obj, j2, Float.floatToIntBits(f2));
        }

        @Override // f.h.h.k1.e
        public boolean u() {
            return false;
        }
    }

    /* compiled from: UnsafeUtil.java */
    /* loaded from: classes2.dex */
    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // f.h.h.k1.e
        public void c(long j2, byte[] bArr, long j3, long j4) {
            throw new UnsupportedOperationException();
        }

        @Override // f.h.h.k1.e
        public boolean d(Object obj, long j2) {
            return k1.f6410j ? k1.k(obj, j2) != 0 : k1.l(obj, j2) != 0;
        }

        @Override // f.h.h.k1.e
        public byte e(long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // f.h.h.k1.e
        public byte f(Object obj, long j2) {
            if (k1.f6410j) {
                return k1.k(obj, j2);
            }
            return k1.l(obj, j2);
        }

        @Override // f.h.h.k1.e
        public double g(Object obj, long j2) {
            return Double.longBitsToDouble(j(obj, j2));
        }

        @Override // f.h.h.k1.e
        public float h(Object obj, long j2) {
            return Float.intBitsToFloat(i(obj, j2));
        }

        @Override // f.h.h.k1.e
        public void m(Object obj, long j2, boolean z) {
            if (k1.f6410j) {
                k1.u(obj, j2, z ? (byte) 1 : (byte) 0);
            } else {
                k1.v(obj, j2, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // f.h.h.k1.e
        public void n(Object obj, long j2, byte b) {
            if (k1.f6410j) {
                k1.u(obj, j2, b);
            } else {
                k1.v(obj, j2, b);
            }
        }

        @Override // f.h.h.k1.e
        public void o(Object obj, long j2, double d2) {
            r(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // f.h.h.k1.e
        public void p(Object obj, long j2, float f2) {
            q(obj, j2, Float.floatToIntBits(f2));
        }

        @Override // f.h.h.k1.e
        public boolean u() {
            return false;
        }
    }

    /* compiled from: UnsafeUtil.java */
    /* loaded from: classes2.dex */
    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // f.h.h.k1.e
        public void c(long j2, byte[] bArr, long j3, long j4) {
            this.a.copyMemory((Object) null, j2, bArr, k1.f6408h + j3, j4);
        }

        @Override // f.h.h.k1.e
        public boolean d(Object obj, long j2) {
            return this.a.getBoolean(obj, j2);
        }

        @Override // f.h.h.k1.e
        public byte e(long j2) {
            return this.a.getByte(j2);
        }

        @Override // f.h.h.k1.e
        public byte f(Object obj, long j2) {
            return this.a.getByte(obj, j2);
        }

        @Override // f.h.h.k1.e
        public double g(Object obj, long j2) {
            return this.a.getDouble(obj, j2);
        }

        @Override // f.h.h.k1.e
        public float h(Object obj, long j2) {
            return this.a.getFloat(obj, j2);
        }

        @Override // f.h.h.k1.e
        public void m(Object obj, long j2, boolean z) {
            this.a.putBoolean(obj, j2, z);
        }

        @Override // f.h.h.k1.e
        public void n(Object obj, long j2, byte b) {
            this.a.putByte(obj, j2, b);
        }

        @Override // f.h.h.k1.e
        public void o(Object obj, long j2, double d2) {
            this.a.putDouble(obj, j2, d2);
        }

        @Override // f.h.h.k1.e
        public void p(Object obj, long j2, float f2) {
            this.a.putFloat(obj, j2, f2);
        }

        @Override // f.h.h.k1.e
        public boolean t() {
            if (super.t()) {
                try {
                    Class<?> cls = this.a.getClass();
                    Class<?> cls2 = Long.TYPE;
                    cls.getMethod("getByte", Object.class, cls2);
                    cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                    cls.getMethod("getBoolean", Object.class, cls2);
                    cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                    cls.getMethod("getFloat", Object.class, cls2);
                    cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                    cls.getMethod("getDouble", Object.class, cls2);
                    cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                    return true;
                } catch (Throwable th) {
                    k1.a(th);
                    return false;
                }
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0039 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // f.h.h.k1.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean u() {
            /*
                r11 = this;
                java.lang.String r0 = "copyMemory"
                java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                sun.misc.Unsafe r2 = r11.a
                java.lang.String r3 = "getLong"
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 != 0) goto Lf
            Ld:
                r2 = 0
                goto L37
            Lf:
                java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> L32
                java.lang.String r7 = "objectFieldOffset"
                java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L32
                java.lang.Class<java.lang.reflect.Field> r9 = java.lang.reflect.Field.class
                r8[r6] = r9     // Catch: java.lang.Throwable -> L32
                r2.getMethod(r7, r8)     // Catch: java.lang.Throwable -> L32
                java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L32
                r7[r6] = r1     // Catch: java.lang.Throwable -> L32
                java.lang.Class r8 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L32
                r7[r5] = r8     // Catch: java.lang.Throwable -> L32
                r2.getMethod(r3, r7)     // Catch: java.lang.Throwable -> L32
                java.lang.reflect.Field r2 = f.h.h.k1.f()     // Catch: java.lang.Throwable -> L32
                if (r2 != 0) goto L30
                goto Ld
            L30:
                r2 = 1
                goto L37
            L32:
                r2 = move-exception
                f.h.h.k1.a(r2)
                goto Ld
            L37:
                if (r2 != 0) goto L3a
                return r6
            L3a:
                sun.misc.Unsafe r2 = r11.a     // Catch: java.lang.Throwable -> L9e
                java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> L9e
                java.lang.String r7 = "getByte"
                java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L9e
                java.lang.Class r9 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L9e
                r8[r6] = r9     // Catch: java.lang.Throwable -> L9e
                r2.getMethod(r7, r8)     // Catch: java.lang.Throwable -> L9e
                java.lang.String r7 = "putByte"
                java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L9e
                r8[r6] = r9     // Catch: java.lang.Throwable -> L9e
                java.lang.Class r10 = java.lang.Byte.TYPE     // Catch: java.lang.Throwable -> L9e
                r8[r5] = r10     // Catch: java.lang.Throwable -> L9e
                r2.getMethod(r7, r8)     // Catch: java.lang.Throwable -> L9e
                java.lang.String r7 = "getInt"
                java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L9e
                r8[r6] = r9     // Catch: java.lang.Throwable -> L9e
                r2.getMethod(r7, r8)     // Catch: java.lang.Throwable -> L9e
                java.lang.String r7 = "putInt"
                java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L9e
                r8[r6] = r9     // Catch: java.lang.Throwable -> L9e
                java.lang.Class r10 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L9e
                r8[r5] = r10     // Catch: java.lang.Throwable -> L9e
                r2.getMethod(r7, r8)     // Catch: java.lang.Throwable -> L9e
                java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L9e
                r7[r6] = r9     // Catch: java.lang.Throwable -> L9e
                r2.getMethod(r3, r7)     // Catch: java.lang.Throwable -> L9e
                java.lang.String r3 = "putLong"
                java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L9e
                r7[r6] = r9     // Catch: java.lang.Throwable -> L9e
                r7[r5] = r9     // Catch: java.lang.Throwable -> L9e
                r2.getMethod(r3, r7)     // Catch: java.lang.Throwable -> L9e
                r3 = 3
                java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L9e
                r7[r6] = r9     // Catch: java.lang.Throwable -> L9e
                r7[r5] = r9     // Catch: java.lang.Throwable -> L9e
                r7[r4] = r9     // Catch: java.lang.Throwable -> L9e
                r2.getMethod(r0, r7)     // Catch: java.lang.Throwable -> L9e
                r7 = 5
                java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> L9e
                r7[r6] = r1     // Catch: java.lang.Throwable -> L9e
                r7[r5] = r9     // Catch: java.lang.Throwable -> L9e
                r7[r4] = r1     // Catch: java.lang.Throwable -> L9e
                r7[r3] = r9     // Catch: java.lang.Throwable -> L9e
                r1 = 4
                r7[r1] = r9     // Catch: java.lang.Throwable -> L9e
                r2.getMethod(r0, r7)     // Catch: java.lang.Throwable -> L9e
                return r5
            L9e:
                r0 = move-exception
                f.h.h.k1.a(r0)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: f.h.h.k1.d.u():boolean");
        }
    }

    /* compiled from: UnsafeUtil.java */
    /* loaded from: classes2.dex */
    public static abstract class e {
        public Unsafe a;

        public e(Unsafe unsafe) {
            this.a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.a.arrayIndexScale(cls);
        }

        public abstract void c(long j2, byte[] bArr, long j3, long j4);

        public abstract boolean d(Object obj, long j2);

        public abstract byte e(long j2);

        public abstract byte f(Object obj, long j2);

        public abstract double g(Object obj, long j2);

        public abstract float h(Object obj, long j2);

        public final int i(Object obj, long j2) {
            return this.a.getInt(obj, j2);
        }

        public final long j(Object obj, long j2) {
            return this.a.getLong(obj, j2);
        }

        public final Object k(Object obj, long j2) {
            return this.a.getObject(obj, j2);
        }

        public final long l(Field field) {
            return this.a.objectFieldOffset(field);
        }

        public abstract void m(Object obj, long j2, boolean z);

        public abstract void n(Object obj, long j2, byte b);

        public abstract void o(Object obj, long j2, double d2);

        public abstract void p(Object obj, long j2, float f2);

        public final void q(Object obj, long j2, int i2) {
            this.a.putInt(obj, j2, i2);
        }

        public final void r(Object obj, long j2, long j3) {
            this.a.putLong(obj, j2, j3);
        }

        public final void s(Object obj, long j2, Object obj2) {
            this.a.putObject(obj, j2, obj2);
        }

        public boolean t() {
            Unsafe unsafe = this.a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                k1.a(th);
                return false;
            }
        }

        public abstract boolean u();
    }

    static {
        Unsafe r = r();
        a = r;
        b = f.h.h.d.a;
        boolean g2 = g(Long.TYPE);
        c = g2;
        boolean g3 = g(Integer.TYPE);
        f6404d = g3;
        e eVar = null;
        if (r != null) {
            if (!f.h.h.d.a()) {
                eVar = new d(r);
            } else if (g2) {
                eVar = new c(r);
            } else if (g3) {
                eVar = new b(r);
            }
        }
        f6405e = eVar;
        f6406f = eVar == null ? false : eVar.u();
        f6407g = eVar == null ? false : eVar.t();
        f6408h = d(byte[].class);
        d(boolean[].class);
        e(boolean[].class);
        d(int[].class);
        e(int[].class);
        d(long[].class);
        e(long[].class);
        d(float[].class);
        e(float[].class);
        d(double[].class);
        e(double[].class);
        d(Object[].class);
        e(Object[].class);
        Field f2 = f();
        f6409i = (f2 == null || eVar == null) ? -1L : eVar.l(f2);
        f6410j = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void A(Object obj, long j2, Object obj2) {
        f6405e.s(obj, j2, obj2);
    }

    public static void a(Throwable th) {
        Logger logger = Logger.getLogger(k1.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static long b(ByteBuffer byteBuffer) {
        return f6405e.j(byteBuffer, f6409i);
    }

    public static <T> T c(Class<T> cls) {
        try {
            return (T) a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int d(Class<?> cls) {
        if (f6407g) {
            return f6405e.a(cls);
        }
        return -1;
    }

    public static int e(Class<?> cls) {
        if (f6407g) {
            return f6405e.b(cls);
        }
        return -1;
    }

    public static Field f() {
        Field field;
        Field field2;
        if (f.h.h.d.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static boolean g(Class<?> cls) {
        if (f.h.h.d.a()) {
            try {
                Class<?> cls2 = b;
                Class<?> cls3 = Boolean.TYPE;
                cls2.getMethod("peekLong", cls, cls3);
                cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
                Class<?> cls4 = Integer.TYPE;
                cls2.getMethod("pokeInt", cls, cls4, cls3);
                cls2.getMethod("peekInt", cls, cls3);
                cls2.getMethod("pokeByte", cls, Byte.TYPE);
                cls2.getMethod("peekByte", cls);
                cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
                cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    public static boolean h(Object obj, long j2) {
        return f6405e.d(obj, j2);
    }

    public static byte i(long j2) {
        return f6405e.e(j2);
    }

    public static byte j(byte[] bArr, long j2) {
        return f6405e.f(bArr, f6408h + j2);
    }

    public static byte k(Object obj, long j2) {
        return (byte) ((o(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & 255);
    }

    public static byte l(Object obj, long j2) {
        return (byte) ((o(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255);
    }

    public static double m(Object obj, long j2) {
        return f6405e.g(obj, j2);
    }

    public static float n(Object obj, long j2) {
        return f6405e.h(obj, j2);
    }

    public static int o(Object obj, long j2) {
        return f6405e.i(obj, j2);
    }

    public static long p(Object obj, long j2) {
        return f6405e.j(obj, j2);
    }

    public static Object q(Object obj, long j2) {
        return f6405e.k(obj, j2);
    }

    public static Unsafe r() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void s(Object obj, long j2, boolean z) {
        f6405e.m(obj, j2, z);
    }

    public static void t(byte[] bArr, long j2, byte b2) {
        f6405e.n(bArr, f6408h + j2, b2);
    }

    public static void u(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int o = o(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        e eVar = f6405e;
        eVar.q(obj, j3, ((255 & b2) << i2) | (o & (~(255 << i2))));
    }

    public static void v(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        e eVar = f6405e;
        eVar.q(obj, j3, ((255 & b2) << i2) | (o(obj, j3) & (~(255 << i2))));
    }

    public static void w(Object obj, long j2, double d2) {
        f6405e.o(obj, j2, d2);
    }

    public static void x(Object obj, long j2, float f2) {
        f6405e.p(obj, j2, f2);
    }

    public static void y(Object obj, long j2, int i2) {
        f6405e.q(obj, j2, i2);
    }

    public static void z(Object obj, long j2, long j3) {
        f6405e.r(obj, j2, j3);
    }
}
