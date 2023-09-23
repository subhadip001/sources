package f.h.h;

import f.h.h.j;
import java.util.NoSuchElementException;

/* compiled from: ByteString.java */
/* loaded from: classes2.dex */
public class i extends j.a {

    /* renamed from: f  reason: collision with root package name */
    public int f6363f = 0;

    /* renamed from: g  reason: collision with root package name */
    public final int f6364g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ j f6365h;

    public i(j jVar) {
        this.f6365h = jVar;
        this.f6364g = jVar.size();
    }

    public byte a() {
        int i2 = this.f6363f;
        if (i2 < this.f6364g) {
            this.f6363f = i2 + 1;
            return this.f6365h.h(i2);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f6363f < this.f6364g;
    }
}
