package com.bumptech.glide.load;

import f.e.a.l.q.b0.b;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface ImageHeaderParser {

    /* loaded from: classes.dex */
    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        UNKNOWN(false);
        
        private final boolean hasAlpha;

        ImageType(boolean z) {
            this.hasAlpha = z;
        }

        public boolean hasAlpha() {
            return this.hasAlpha;
        }

        public boolean isWebp() {
            int ordinal = ordinal();
            return ordinal == 5 || ordinal == 6 || ordinal == 7;
        }
    }

    ImageType a(ByteBuffer byteBuffer);

    int b(ByteBuffer byteBuffer, b bVar);

    ImageType c(InputStream inputStream);

    int d(InputStream inputStream, b bVar);
}
