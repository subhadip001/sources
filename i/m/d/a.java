package i.m.d;

import i.l.b.i;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* compiled from: PlatformThreadLocalRandom.kt */
/* loaded from: classes2.dex */
public final class a extends i.m.a {
    @Override // i.m.a
    public Random c() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        i.d(current, "current()");
        return current;
    }
}
