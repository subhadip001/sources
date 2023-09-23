package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import f.e.a.l.p.e;
import java.io.IOException;

/* loaded from: classes.dex */
public final class ParcelFileDescriptorRewinder implements e<ParcelFileDescriptor> {
    public final InternalRewinder a;

    /* loaded from: classes.dex */
    public static final class InternalRewinder {
        public final ParcelFileDescriptor a;

        public InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.a = parcelFileDescriptor;
        }

        public ParcelFileDescriptor rewind() {
            try {
                Os.lseek(this.a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.a;
            } catch (ErrnoException e2) {
                throw new IOException(e2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class a implements e.a<ParcelFileDescriptor> {
        @Override // f.e.a.l.p.e.a
        public Class<ParcelFileDescriptor> a() {
            return ParcelFileDescriptor.class;
        }

        @Override // f.e.a.l.p.e.a
        public e<ParcelFileDescriptor> b(ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new InternalRewinder(parcelFileDescriptor);
    }

    public static boolean c() {
        return !"robolectric".equals(Build.FINGERPRINT);
    }

    @Override // f.e.a.l.p.e
    public void b() {
    }

    @Override // f.e.a.l.p.e
    /* renamed from: d */
    public ParcelFileDescriptor a() {
        return this.a.rewind();
    }
}
