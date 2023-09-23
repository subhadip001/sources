package io.grpc;

import f.h.c.a.i;
import f.h.c.a.q;
import g.a.i0;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class Status {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f8683d = Boolean.parseBoolean(System.getProperty("io.grpc.Status.failOnEqualsForTest", "false"));

    /* renamed from: e  reason: collision with root package name */
    public static final List<Status> f8684e;

    /* renamed from: f  reason: collision with root package name */
    public static final Status f8685f;

    /* renamed from: g  reason: collision with root package name */
    public static final Status f8686g;

    /* renamed from: h  reason: collision with root package name */
    public static final Status f8687h;

    /* renamed from: i  reason: collision with root package name */
    public static final Status f8688i;

    /* renamed from: j  reason: collision with root package name */
    public static final Status f8689j;

    /* renamed from: k  reason: collision with root package name */
    public static final Status f8690k;

    /* renamed from: l  reason: collision with root package name */
    public static final Status f8691l;

    /* renamed from: m  reason: collision with root package name */
    public static final Status f8692m;
    public static final Status n;
    public static final i0.f<Status> o;
    public static final i0.i<String> p;
    public static final i0.f<String> q;
    public final Code a;
    public final String b;
    public final Throwable c;

    /* loaded from: classes2.dex */
    public enum Code {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);
        
        private final int value;
        private final byte[] valueAscii;

        Code(int i2) {
            this.value = i2;
            this.valueAscii = Integer.toString(i2).getBytes(f.h.c.a.c.a);
        }

        public static byte[] a(Code code) {
            return code.valueAscii;
        }

        public Status toStatus() {
            return Status.f8684e.get(this.value);
        }

        public int value() {
            return this.value;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements i0.i<Status> {
        public b(a aVar) {
        }

        @Override // g.a.i0.i
        public byte[] a(Status status) {
            return Code.a(status.a);
        }

        @Override // g.a.i0.i
        public Status b(byte[] bArr) {
            int i2;
            char c = 1;
            if (bArr.length == 1 && bArr[0] == 48) {
                return Status.f8685f;
            }
            int length = bArr.length;
            if (length != 1) {
                i2 = (length == 2 && bArr[0] >= 48 && bArr[0] <= 57) ? 0 + ((bArr[0] - 48) * 10) : 0;
                Status status = Status.f8687h;
                StringBuilder A = f.a.b.a.a.A("Unknown code ");
                A.append(new String(bArr, f.h.c.a.c.a));
                return status.h(A.toString());
            }
            c = 0;
            if (bArr[c] >= 48 && bArr[c] <= 57) {
                int i3 = (bArr[c] - 48) + i2;
                List<Status> list = Status.f8684e;
                if (i3 < list.size()) {
                    return list.get(i3);
                }
            }
            Status status2 = Status.f8687h;
            StringBuilder A2 = f.a.b.a.a.A("Unknown code ");
            A2.append(new String(bArr, f.h.c.a.c.a));
            return status2.h(A2.toString());
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements i0.i<String> {
        public static final byte[] a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

        public c(a aVar) {
        }

        public static boolean c(byte b) {
            return b < 32 || b >= 126 || b == 37;
        }

        @Override // g.a.i0.i
        public byte[] a(String str) {
            byte[] bytes = str.getBytes(f.h.c.a.c.c);
            int i2 = 0;
            while (i2 < bytes.length) {
                if (c(bytes[i2])) {
                    byte[] bArr = new byte[((bytes.length - i2) * 3) + i2];
                    if (i2 != 0) {
                        System.arraycopy(bytes, 0, bArr, 0, i2);
                    }
                    int i3 = i2;
                    while (i2 < bytes.length) {
                        byte b = bytes[i2];
                        if (c(b)) {
                            bArr[i3] = 37;
                            byte[] bArr2 = a;
                            bArr[i3 + 1] = bArr2[(b >> 4) & 15];
                            bArr[i3 + 2] = bArr2[b & 15];
                            i3 += 3;
                        } else {
                            bArr[i3] = b;
                            i3++;
                        }
                        i2++;
                    }
                    return Arrays.copyOf(bArr, i3);
                }
                i2++;
            }
            return bytes;
        }

        @Override // g.a.i0.i
        public String b(byte[] bArr) {
            for (int i2 = 0; i2 < bArr.length; i2++) {
                byte b = bArr[i2];
                if (b < 32 || b >= 126 || (b == 37 && i2 + 2 < bArr.length)) {
                    ByteBuffer allocate = ByteBuffer.allocate(bArr.length);
                    int i3 = 0;
                    while (i3 < bArr.length) {
                        if (bArr[i3] == 37 && i3 + 2 < bArr.length) {
                            try {
                                allocate.put((byte) Integer.parseInt(new String(bArr, i3 + 1, 2, f.h.c.a.c.a), 16));
                                i3 += 3;
                            } catch (NumberFormatException unused) {
                            }
                        }
                        allocate.put(bArr[i3]);
                        i3++;
                    }
                    return new String(allocate.array(), 0, allocate.position(), f.h.c.a.c.c);
                }
            }
            return new String(bArr, 0);
        }
    }

    static {
        TreeMap treeMap = new TreeMap();
        Code[] values = Code.values();
        for (int i2 = 0; i2 < 17; i2++) {
            Code code = values[i2];
            Status status = (Status) treeMap.put(Integer.valueOf(code.value()), new Status(code, null, null));
            if (status != null) {
                StringBuilder A = f.a.b.a.a.A("Code value duplication between ");
                A.append(status.a.name());
                A.append(" & ");
                A.append(code.name());
                throw new IllegalStateException(A.toString());
            }
        }
        f8684e = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        f8685f = Code.OK.toStatus();
        f8686g = Code.CANCELLED.toStatus();
        f8687h = Code.UNKNOWN.toStatus();
        Code.INVALID_ARGUMENT.toStatus();
        f8688i = Code.DEADLINE_EXCEEDED.toStatus();
        Code.NOT_FOUND.toStatus();
        Code.ALREADY_EXISTS.toStatus();
        f8689j = Code.PERMISSION_DENIED.toStatus();
        f8690k = Code.UNAUTHENTICATED.toStatus();
        f8691l = Code.RESOURCE_EXHAUSTED.toStatus();
        Code.FAILED_PRECONDITION.toStatus();
        Code.ABORTED.toStatus();
        Code.OUT_OF_RANGE.toStatus();
        Code.UNIMPLEMENTED.toStatus();
        f8692m = Code.INTERNAL.toStatus();
        n = Code.UNAVAILABLE.toStatus();
        Code.DATA_LOSS.toStatus();
        o = i0.f.b("grpc-status", false, new b(null));
        c cVar = new c(null);
        p = cVar;
        q = i0.f.b("grpc-message", false, cVar);
    }

    public Status(Code code, String str, Throwable th) {
        f.h.b.c.a.x(code, "code");
        this.a = code;
        this.b = str;
        this.c = th;
    }

    public static String c(Status status) {
        if (status.b == null) {
            return status.a.toString();
        }
        return status.a + ": " + status.b;
    }

    public static Status d(int i2) {
        if (i2 >= 0) {
            List<Status> list = f8684e;
            if (i2 <= list.size()) {
                return list.get(i2);
            }
        }
        Status status = f8687h;
        return status.h("Unknown code " + i2);
    }

    public static Status e(Throwable th) {
        f.h.b.c.a.x(th, "t");
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof StatusException) {
                return ((StatusException) th2).f8693f;
            }
            if (th2 instanceof StatusRuntimeException) {
                return ((StatusRuntimeException) th2).f8696f;
            }
        }
        return f8687h.g(th);
    }

    public StatusRuntimeException a() {
        return new StatusRuntimeException(this, null);
    }

    public Status b(String str) {
        if (str == null) {
            return this;
        }
        if (this.b == null) {
            return new Status(this.a, str, this.c);
        }
        return new Status(this.a, f.a.b.a.a.v(new StringBuilder(), this.b, "\n", str), this.c);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public boolean f() {
        return Code.OK == this.a;
    }

    public Status g(Throwable th) {
        return f.h.b.c.a.i0(this.c, th) ? this : new Status(this.a, this.b, th);
    }

    public Status h(String str) {
        return f.h.b.c.a.i0(this.b, str) ? this : new Status(this.a, str, this.c);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        i c1 = f.h.b.c.a.c1(this);
        c1.c("code", this.a.name());
        c1.c("description", this.b);
        Throwable th = this.c;
        String str = th;
        if (th != null) {
            Object obj = q.a;
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            str = stringWriter.toString();
        }
        c1.c("cause", str);
        return c1.toString();
    }
}
