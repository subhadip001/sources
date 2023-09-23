package com.bumptech.glide.load.resource.bitmap;

import f.e.a.l.k;

/* loaded from: classes.dex */
public abstract class DownsampleStrategy {
    public static final DownsampleStrategy a = new c();
    public static final DownsampleStrategy b = new a();
    public static final DownsampleStrategy c;

    /* renamed from: d  reason: collision with root package name */
    public static final DownsampleStrategy f690d;

    /* renamed from: e  reason: collision with root package name */
    public static final DownsampleStrategy f691e;

    /* renamed from: f  reason: collision with root package name */
    public static final k<DownsampleStrategy> f692f;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f693g;

    /* loaded from: classes.dex */
    public enum SampleSizeRounding {
        MEMORY,
        QUALITY
    }

    /* loaded from: classes.dex */
    public static class a extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding a(int i2, int i3, int i4, int i5) {
            if (b(i2, i3, i4, i5) == 1.0f) {
                return SampleSizeRounding.QUALITY;
            }
            if (DownsampleStrategy.f693g) {
                return SampleSizeRounding.QUALITY;
            }
            return SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int i2, int i3, int i4, int i5) {
            return Math.min(1.0f, DownsampleStrategy.a.b(i2, i3, i4, i5));
        }
    }

    /* loaded from: classes.dex */
    public static class b extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding a(int i2, int i3, int i4, int i5) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int i2, int i3, int i4, int i5) {
            return Math.max(i4 / i2, i5 / i3);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding a(int i2, int i3, int i4, int i5) {
            if (DownsampleStrategy.f693g) {
                return SampleSizeRounding.QUALITY;
            }
            return SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int i2, int i3, int i4, int i5) {
            if (DownsampleStrategy.f693g) {
                return Math.min(i4 / i2, i5 / i3);
            }
            int max = Math.max(i3 / i5, i2 / i4);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(max);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding a(int i2, int i3, int i4, int i5) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int i2, int i3, int i4, int i5) {
            return 1.0f;
        }
    }

    static {
        b bVar = new b();
        c = bVar;
        f690d = new d();
        f691e = bVar;
        f692f = k.b("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", bVar);
        f693g = true;
    }

    public abstract SampleSizeRounding a(int i2, int i3, int i4, int i5);

    public abstract float b(int i2, int i3, int i4, int i5);
}
