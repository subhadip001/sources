package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import f.a.b.a.a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes.dex */
public class DataBufferIterator<T> implements Iterator<T> {
    public final DataBuffer<T> zaa;
    public int zab = -1;

    public DataBufferIterator(DataBuffer<T> dataBuffer) {
        this.zaa = (DataBuffer) Preconditions.checkNotNull(dataBuffer);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zab < this.zaa.getCount() + (-1);
    }

    @Override // java.util.Iterator
    public T next() {
        if (hasNext()) {
            DataBuffer<T> dataBuffer = this.zaa;
            int i2 = this.zab + 1;
            this.zab = i2;
            return dataBuffer.get(i2);
        }
        throw new NoSuchElementException(a.d(46, "Cannot advance the iterator beyond ", this.zab));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
