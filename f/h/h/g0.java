package f.h.h;

import com.google.protobuf.WireFormat$FieldType;

/* compiled from: MapEntryLite.java */
/* loaded from: classes2.dex */
public class g0<K, V> {
    public final a<K, V> a;
    public final K b;
    public final V c;

    /* compiled from: MapEntryLite.java */
    /* loaded from: classes2.dex */
    public static class a<K, V> {
        public final WireFormat$FieldType a;
        public final K b;
        public final WireFormat$FieldType c;

        /* renamed from: d  reason: collision with root package name */
        public final V f6357d;

        public a(WireFormat$FieldType wireFormat$FieldType, K k2, WireFormat$FieldType wireFormat$FieldType2, V v) {
            this.a = wireFormat$FieldType;
            this.b = k2;
            this.c = wireFormat$FieldType2;
            this.f6357d = v;
        }
    }

    public g0(WireFormat$FieldType wireFormat$FieldType, K k2, WireFormat$FieldType wireFormat$FieldType2, V v) {
        this.a = new a<>(wireFormat$FieldType, k2, wireFormat$FieldType2, v);
        this.b = k2;
        this.c = v;
    }

    public static <K, V> int a(a<K, V> aVar, K k2, V v) {
        return u.d(aVar.c, 2, v) + u.d(aVar.a, 1, k2);
    }
}
