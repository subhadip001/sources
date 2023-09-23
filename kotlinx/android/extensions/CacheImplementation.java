package kotlinx.android.extensions;

/* compiled from: CacheImplementation.kt */
/* loaded from: classes2.dex */
public enum CacheImplementation {
    SPARSE_ARRAY,
    HASH_MAP,
    NO_CACHE;
    
    public static final a Companion;
    private static final CacheImplementation DEFAULT;

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlinx.android.extensions.CacheImplementation$a] */
    static {
        CacheImplementation cacheImplementation = HASH_MAP;
        Companion = new Object(null) { // from class: kotlinx.android.extensions.CacheImplementation.a
        };
        DEFAULT = cacheImplementation;
    }
}
