package com.google.firebase.inappmessaging.display.dagger.internal;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class MapBuilder<K, V> {
    private final Map<K, V> contributions;

    private MapBuilder(int i2) {
        this.contributions = DaggerCollections.newLinkedHashMapWithExpectedSize(i2);
    }

    public static <K, V> MapBuilder<K, V> newMapBuilder(int i2) {
        return new MapBuilder<>(i2);
    }

    public Map<K, V> build() {
        if (this.contributions.size() != 0) {
            return Collections.unmodifiableMap(this.contributions);
        }
        return Collections.emptyMap();
    }

    public MapBuilder<K, V> put(K k2, V v) {
        this.contributions.put(k2, v);
        return this;
    }

    public MapBuilder<K, V> putAll(Map<K, V> map) {
        this.contributions.putAll(map);
        return this;
    }
}
