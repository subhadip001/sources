package f.h.c.b;

import f.h.c.b.k;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: CompactHashMap.java */
/* loaded from: classes.dex */
public class i<K, V> extends k<K, V>.b<Map.Entry<K, V>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ k f5930j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar) {
        super(null);
        this.f5930j = kVar;
    }

    @Override // f.h.c.b.k.b
    public Object a(int i2) {
        return new k.d(i2);
    }
}
