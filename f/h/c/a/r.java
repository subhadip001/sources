package f.h.c.a;

import com.google.common.base.VerifyException;

/* compiled from: Verify.java */
/* loaded from: classes.dex */
public final class r {
    public static void a(boolean z, String str, Object obj) {
        if (!z) {
            throw new VerifyException(f.h.b.c.a.E0(str, obj));
        }
    }
}
