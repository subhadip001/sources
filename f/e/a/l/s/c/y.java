package f.e.a.l.s.c;

import android.graphics.Bitmap;

/* compiled from: UnitBitmapDecoder.java */
/* loaded from: classes.dex */
public final class y implements f.e.a.l.m<Bitmap, Bitmap> {

    /* compiled from: UnitBitmapDecoder.java */
    /* loaded from: classes.dex */
    public static final class a implements f.e.a.l.q.v<Bitmap> {

        /* renamed from: f  reason: collision with root package name */
        public final Bitmap f3483f;

        public a(Bitmap bitmap) {
            this.f3483f = bitmap;
        }

        @Override // f.e.a.l.q.v
        public void a() {
        }

        @Override // f.e.a.l.q.v
        public int b() {
            return f.e.a.r.l.c(this.f3483f);
        }

        @Override // f.e.a.l.q.v
        public Class<Bitmap> c() {
            return Bitmap.class;
        }

        @Override // f.e.a.l.q.v
        public Bitmap get() {
            return this.f3483f;
        }
    }

    @Override // f.e.a.l.m
    public /* bridge */ /* synthetic */ boolean a(Bitmap bitmap, f.e.a.l.l lVar) {
        return true;
    }

    @Override // f.e.a.l.m
    public f.e.a.l.q.v<Bitmap> b(Bitmap bitmap, int i2, int i3, f.e.a.l.l lVar) {
        return new a(bitmap);
    }
}
