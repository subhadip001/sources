package com.google.android.gms.common.api;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataBuffer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes.dex */
public class DataBufferResponse<T, R extends AbstractDataBuffer<T> & Result> extends Response<R> implements DataBuffer<T> {
    @KeepForSdk
    public DataBufferResponse() {
    }

    @Override // com.google.android.gms.common.data.DataBuffer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((AbstractDataBuffer) getResult()).close();
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public final T get(int i2) {
        return (T) ((AbstractDataBuffer) getResult()).get(i2);
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public final int getCount() {
        return ((AbstractDataBuffer) getResult()).getCount();
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public final Bundle getMetadata() {
        return ((AbstractDataBuffer) getResult()).getMetadata();
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public final boolean isClosed() {
        return ((AbstractDataBuffer) getResult()).isClosed();
    }

    @Override // com.google.android.gms.common.data.DataBuffer, java.lang.Iterable
    public final Iterator<T> iterator() {
        return ((AbstractDataBuffer) getResult()).iterator();
    }

    @Override // com.google.android.gms.common.data.DataBuffer, com.google.android.gms.common.api.Releasable
    public final void release() {
        ((AbstractDataBuffer) getResult()).release();
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public final Iterator<T> singleRefIterator() {
        return ((AbstractDataBuffer) getResult()).singleRefIterator();
    }

    /* JADX WARN: Incorrect types in method signature: (TR;)V */
    /* JADX WARN: Multi-variable type inference failed */
    @KeepForSdk
    public DataBufferResponse(AbstractDataBuffer abstractDataBuffer) {
        super(abstractDataBuffer);
    }
}
