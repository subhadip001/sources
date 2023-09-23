package f.h.b.b.a2.i;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

/* compiled from: EventMessageEncoder.java */
/* loaded from: classes.dex */
public final class b {
    public final ByteArrayOutputStream a;
    public final DataOutputStream b;

    public b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.a = byteArrayOutputStream;
        this.b = new DataOutputStream(byteArrayOutputStream);
    }

    public static void a(DataOutputStream dataOutputStream, long j2) {
        dataOutputStream.writeByte(((int) (j2 >>> 24)) & 255);
        dataOutputStream.writeByte(((int) (j2 >>> 16)) & 255);
        dataOutputStream.writeByte(((int) (j2 >>> 8)) & 255);
        dataOutputStream.writeByte(((int) j2) & 255);
    }
}
