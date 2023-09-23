package f.h.c.b;

/* JADX INFO: Add missing generic type declarations: [V] */
/* compiled from: CompactHashMap.java */
/* loaded from: classes.dex */
public class j<V> extends k<K, V>.b<V> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ k f5932j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar) {
        super(null);
        this.f5932j = kVar;
    }

    @Override // f.h.c.b.k.b
    public V a(int i2) {
        return (V) k.b(this.f5932j, i2);
    }
}
