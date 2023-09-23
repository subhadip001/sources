package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import f.a.b.a.a;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes.dex */
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {
    private T zac;

    public SingleRefDataBufferIterator(DataBuffer<T> dataBuffer) {
        super(dataBuffer);
    }

    @Override // com.google.android.gms.common.data.DataBufferIterator, java.util.Iterator
    public final T next() {
        if (hasNext()) {
            int i2 = this.zab + 1;
            this.zab = i2;
            if (i2 == 0) {
                T t = (T) Preconditions.checkNotNull(this.zaa.get(0));
                this.zac = t;
                if (!(t instanceof DataBufferRef)) {
                    String valueOf = String.valueOf(t.getClass());
                    throw new IllegalStateException(a.v(new StringBuilder(valueOf.length() + 44), "DataBuffer reference of type ", valueOf, " is not movable"));
                }
            } else {
                ((DataBufferRef) Preconditions.checkNotNull(this.zac)).zaa(this.zab);
            }
            return this.zac;
        }
        throw new NoSuchElementException(a.d(46, "Cannot advance the iterator beyond ", this.zab));
    }
}
