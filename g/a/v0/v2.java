package g.a.v0;

import java.util.logging.Logger;

/* compiled from: TransportFrameUtil.java */
/* loaded from: classes2.dex */
public final class v2 {
    public static final Logger a = Logger.getLogger(v2.class.getName());
    public static final byte[] b = "-bin".getBytes(f.h.c.a.c.a);

    public static boolean a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i2 = length; i2 < bArr.length; i2++) {
            if (bArr[i2] != bArr2[i2 - length]) {
                return false;
            }
        }
        return true;
    }
}
