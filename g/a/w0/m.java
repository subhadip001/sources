package g.a.w0;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import g.a.v0.y2;
import g.a.v0.z2;

/* compiled from: OkHttpWritableBufferAllocator.java */
/* loaded from: classes2.dex */
public class m implements z2 {
    @Override // g.a.v0.z2
    public y2 a(int i2) {
        return new l(new l.f(), Math.min((int) CommonUtils.BYTES_IN_A_MEGABYTE, Math.max(4096, i2)));
    }
}
