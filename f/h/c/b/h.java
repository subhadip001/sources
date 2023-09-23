package f.h.c.b;

/* JADX INFO: Add missing generic type declarations: [K] */
/* compiled from: CompactHashMap.java */
/* loaded from: classes.dex */
public class h<K> extends k<K, V>.b<K> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ k f5928j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar) {
        super(null);
        this.f5928j = kVar;
    }

    @Override // f.h.c.b.k.b
    public K a(int i2) {
        return (K) k.a(this.f5928j, i2);
    }
}
