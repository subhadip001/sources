package f.e.a.l.s.c;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import f.e.a.l.s.c.q;
import java.util.Objects;

/* compiled from: ParcelFileDescriptorBitmapDecoder.java */
/* loaded from: classes.dex */
public final class t implements f.e.a.l.m<ParcelFileDescriptor, Bitmap> {
    public final k a;

    public t(k kVar) {
        this.a = kVar;
    }

    @Override // f.e.a.l.m
    public boolean a(ParcelFileDescriptor parcelFileDescriptor, f.e.a.l.l lVar) {
        ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptor;
        String str = Build.MANUFACTURER;
        if (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor2.getStatSize() <= 536870912) {
            Objects.requireNonNull(this.a);
            if (ParcelFileDescriptorRewinder.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // f.e.a.l.m
    public f.e.a.l.q.v<Bitmap> b(ParcelFileDescriptor parcelFileDescriptor, int i2, int i3, f.e.a.l.l lVar) {
        k kVar = this.a;
        return kVar.a(new q.c(parcelFileDescriptor, kVar.f3464d, kVar.c), i2, i3, lVar, k.f3461k);
    }
}
