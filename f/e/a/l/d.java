package f.e.a.l;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import f.e.a.l.s.c.u;
import java.io.FileInputStream;

/* compiled from: ImageHeaderParserUtils.java */
/* loaded from: classes.dex */
public class d implements i {
    public final /* synthetic */ ParcelFileDescriptorRewinder a;
    public final /* synthetic */ f.e.a.l.q.b0.b b;

    public d(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, f.e.a.l.q.b0.b bVar) {
        this.a = parcelFileDescriptorRewinder;
        this.b = bVar;
    }

    @Override // f.e.a.l.i
    public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
        u uVar;
        u uVar2 = null;
        try {
            uVar = new u(new FileInputStream(this.a.a().getFileDescriptor()), this.b);
        } catch (Throwable th) {
            th = th;
        }
        try {
            ImageHeaderParser.ImageType c = imageHeaderParser.c(uVar);
            uVar.release();
            this.a.a();
            return c;
        } catch (Throwable th2) {
            th = th2;
            uVar2 = uVar;
            if (uVar2 != null) {
                uVar2.release();
            }
            this.a.a();
            throw th;
        }
    }
}
