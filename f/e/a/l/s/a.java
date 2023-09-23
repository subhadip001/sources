package f.e.a.l.s;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import f.e.a.l.l;
import f.e.a.l.s.c.k;
import f.e.a.l.s.c.p;

/* compiled from: DefaultOnHeaderDecodedListener.java */
/* loaded from: classes.dex */
public final class a implements ImageDecoder.OnHeaderDecodedListener {
    public final p a = p.a();
    public final int b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final DecodeFormat f3449d;

    /* renamed from: e  reason: collision with root package name */
    public final DownsampleStrategy f3450e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3451f;

    /* renamed from: g  reason: collision with root package name */
    public final PreferredColorSpace f3452g;

    /* compiled from: DefaultOnHeaderDecodedListener.java */
    /* renamed from: f.e.a.l.s.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0085a implements ImageDecoder.OnPartialImageListener {
        public C0085a(a aVar) {
        }

        @Override // android.graphics.ImageDecoder.OnPartialImageListener
        public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public a(int i2, int i3, l lVar) {
        this.b = i2;
        this.c = i3;
        this.f3449d = (DecodeFormat) lVar.c(k.f3456f);
        this.f3450e = (DownsampleStrategy) lVar.c(DownsampleStrategy.f692f);
        f.e.a.l.k<Boolean> kVar = k.f3459i;
        this.f3451f = lVar.c(kVar) != null && ((Boolean) lVar.c(kVar)).booleanValue();
        this.f3452g = (PreferredColorSpace) lVar.c(k.f3457g);
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        boolean z = false;
        if (this.a.b(this.b, this.c, this.f3451f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f3449d == DecodeFormat.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C0085a(this));
        Size size = imageInfo.getSize();
        int i2 = this.b;
        if (i2 == Integer.MIN_VALUE) {
            i2 = size.getWidth();
        }
        int i3 = this.c;
        if (i3 == Integer.MIN_VALUE) {
            i3 = size.getHeight();
        }
        float b = this.f3450e.b(size.getWidth(), size.getHeight(), i2, i3);
        int round = Math.round(size.getWidth() * b);
        int round2 = Math.round(size.getHeight() * b);
        if (Log.isLoggable("ImageDecoder", 2)) {
            StringBuilder A = f.a.b.a.a.A("Resizing from [");
            A.append(size.getWidth());
            A.append("x");
            A.append(size.getHeight());
            A.append("] to [");
            A.append(round);
            A.append("x");
            A.append(round2);
            A.append("] scaleFactor: ");
            A.append(b);
            Log.v("ImageDecoder", A.toString());
        }
        imageDecoder.setTargetSize(round, round2);
        PreferredColorSpace preferredColorSpace = this.f3452g;
        if (preferredColorSpace != null) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 < 28) {
                if (i4 >= 26) {
                    imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
                    return;
                }
                return;
            }
            if (preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                z = true;
            }
            imageDecoder.setTargetColorSpace(ColorSpace.get(z ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
        }
    }
}
