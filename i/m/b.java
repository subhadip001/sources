package i.m;

import i.l.b.i;
import java.util.Random;

/* compiled from: PlatformRandom.kt */
/* loaded from: classes2.dex */
public final class b extends i.m.a {

    /* renamed from: h  reason: collision with root package name */
    public final a f8652h = new a();

    /* compiled from: PlatformRandom.kt */
    /* loaded from: classes2.dex */
    public static final class a extends ThreadLocal<Random> {
        @Override // java.lang.ThreadLocal
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // i.m.a
    public Random c() {
        Random random = this.f8652h.get();
        i.d(random, "implStorage.get()");
        return random;
    }
}
