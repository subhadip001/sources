package com.google.android.gms.internal.common;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jspecify.nullness.NullMarked;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@NullMarked
/* loaded from: classes.dex */
public abstract class zzj implements Iterator {
    private Object zza;
    private int zzb = 2;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.zzb;
        if (i2 != 4) {
            int i3 = i2 - 1;
            if (i2 != 0) {
                if (i3 != 0) {
                    if (i3 != 2) {
                        this.zzb = 4;
                        this.zza = zza();
                        if (this.zzb != 3) {
                            this.zzb = 1;
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
            throw null;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.zzb = 2;
            Object obj = this.zza;
            this.zza = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public abstract Object zza();

    public final Object zzb() {
        this.zzb = 3;
        return null;
    }
}
