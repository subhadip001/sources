package g.a.x0.a;

import com.google.protobuf.CodedOutputStream;
import f.h.h.n0;
import f.h.h.u0;
import g.a.b0;
import g.a.q;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;

/* compiled from: ProtoInputStream.java */
/* loaded from: classes2.dex */
public final class a extends InputStream implements q, b0 {

    /* renamed from: f  reason: collision with root package name */
    public n0 f8111f;

    /* renamed from: g  reason: collision with root package name */
    public final u0<?> f8112g;

    /* renamed from: h  reason: collision with root package name */
    public ByteArrayInputStream f8113h;

    public a(n0 n0Var, u0<?> u0Var) {
        this.f8111f = n0Var;
        this.f8112g = u0Var;
    }

    @Override // g.a.q
    public int a(OutputStream outputStream) {
        n0 n0Var = this.f8111f;
        if (n0Var != null) {
            int serializedSize = n0Var.getSerializedSize();
            this.f8111f.writeTo(outputStream);
            this.f8111f = null;
            return serializedSize;
        }
        ByteArrayInputStream byteArrayInputStream = this.f8113h;
        if (byteArrayInputStream == null) {
            return 0;
        }
        f.h.h.q qVar = b.a;
        f.h.b.c.a.x(byteArrayInputStream, "inputStream cannot be null!");
        f.h.b.c.a.x(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j2 = 0;
        while (true) {
            int read = byteArrayInputStream.read(bArr);
            if (read == -1) {
                int i2 = (int) j2;
                this.f8113h = null;
                return i2;
            }
            outputStream.write(bArr, 0, read);
            j2 += read;
        }
    }

    @Override // java.io.InputStream
    public int available() {
        n0 n0Var = this.f8111f;
        if (n0Var != null) {
            return n0Var.getSerializedSize();
        }
        ByteArrayInputStream byteArrayInputStream = this.f8113h;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f8111f != null) {
            this.f8113h = new ByteArrayInputStream(this.f8111f.toByteArray());
            this.f8111f = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f8113h;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) {
        n0 n0Var = this.f8111f;
        if (n0Var != null) {
            int serializedSize = n0Var.getSerializedSize();
            if (serializedSize == 0) {
                this.f8111f = null;
                this.f8113h = null;
                return -1;
            } else if (i3 >= serializedSize) {
                Logger logger = CodedOutputStream.b;
                CodedOutputStream.c cVar = new CodedOutputStream.c(bArr, i2, serializedSize);
                this.f8111f.writeTo(cVar);
                cVar.b();
                this.f8111f = null;
                this.f8113h = null;
                return serializedSize;
            } else {
                this.f8113h = new ByteArrayInputStream(this.f8111f.toByteArray());
                this.f8111f = null;
            }
        }
        ByteArrayInputStream byteArrayInputStream = this.f8113h;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i2, i3);
        }
        return -1;
    }
}
