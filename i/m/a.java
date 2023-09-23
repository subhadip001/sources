package i.m;

import java.util.Random;

/* compiled from: PlatformRandom.kt */
/* loaded from: classes2.dex */
public abstract class a extends c {
    @Override // i.m.c
    public int a() {
        return c().nextInt();
    }

    @Override // i.m.c
    public int b(int i2) {
        return c().nextInt(i2);
    }

    public abstract Random c();
}
