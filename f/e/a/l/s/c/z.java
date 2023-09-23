package f.e.a.l.s.c;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import f.e.a.l.k;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: VideoDecoder.java */
/* loaded from: classes.dex */
public class z<T> implements f.e.a.l.m<T, Bitmap> {

    /* renamed from: d  reason: collision with root package name */
    public static final f.e.a.l.k<Long> f3484d = new f.e.a.l.k<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: e  reason: collision with root package name */
    public static final f.e.a.l.k<Integer> f3485e = new f.e.a.l.k<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: f  reason: collision with root package name */
    public static final e f3486f = new e();

    /* renamed from: g  reason: collision with root package name */
    public static final List<String> f3487g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));
    public final f<T> a;
    public final f.e.a.l.q.b0.d b;
    public final e c;

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes.dex */
    public class a implements k.b<Long> {
        public final ByteBuffer a = ByteBuffer.allocate(8);

        @Override // f.e.a.l.k.b
        public void a(byte[] bArr, Long l2, MessageDigest messageDigest) {
            Long l3 = l2;
            messageDigest.update(bArr);
            synchronized (this.a) {
                this.a.position(0);
                messageDigest.update(this.a.putLong(l3.longValue()).array());
            }
        }
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes.dex */
    public class b implements k.b<Integer> {
        public final ByteBuffer a = ByteBuffer.allocate(4);

        @Override // f.e.a.l.k.b
        public void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            Integer num2 = num;
            if (num2 == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.a) {
                this.a.position(0);
                messageDigest.update(this.a.putInt(num2.intValue()).array());
            }
        }
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes.dex */
    public static final class c implements f<AssetFileDescriptor> {
        public c(a aVar) {
        }

        @Override // f.e.a.l.s.c.z.f
        public void a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes.dex */
    public static final class d implements f<ByteBuffer> {
        @Override // f.e.a.l.s.c.z.f
        public void a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new a0(this, byteBuffer));
        }
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes.dex */
    public static class e {
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes.dex */
    public interface f<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes.dex */
    public static final class g implements f<ParcelFileDescriptor> {
        @Override // f.e.a.l.s.c.z.f
        public void a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes.dex */
    public static final class h extends RuntimeException {
        public h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    public z(f.e.a.l.q.b0.d dVar, f<T> fVar) {
        e eVar = f3486f;
        this.b = dVar;
        this.a = fVar;
        this.c = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap c(android.media.MediaMetadataRetriever r12, long r13, int r15, int r16, int r17, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r18) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.a.l.s.c.z.c(android.media.MediaMetadataRetriever, long, int, int, int, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy):android.graphics.Bitmap");
    }

    @Override // f.e.a.l.m
    public boolean a(T t, f.e.a.l.l lVar) {
        return true;
    }

    @Override // f.e.a.l.m
    public f.e.a.l.q.v<Bitmap> b(T t, int i2, int i3, f.e.a.l.l lVar) {
        long longValue = ((Long) lVar.c(f3484d)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException(f.a.b.a.a.l("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", longValue));
        }
        Integer num = (Integer) lVar.c(f3485e);
        if (num == null) {
            num = 2;
        }
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) lVar.c(DownsampleStrategy.f692f);
        if (downsampleStrategy == null) {
            downsampleStrategy = DownsampleStrategy.f691e;
        }
        DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        Objects.requireNonNull(this.c);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.a.a(mediaMetadataRetriever, t);
            return f.e.a.l.s.c.e.d(c(mediaMetadataRetriever, longValue, num.intValue(), i2, i3, downsampleStrategy2), this.b);
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                mediaMetadataRetriever.close();
            } else {
                mediaMetadataRetriever.release();
            }
        }
    }
}
