package f.e.a.l.s.c;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* compiled from: BitmapDrawableDecoder.java */
/* loaded from: classes.dex */
public class a<DataType> implements f.e.a.l.m<DataType, BitmapDrawable> {
    public final f.e.a.l.m<DataType, Bitmap> a;
    public final Resources b;

    public a(Resources resources, f.e.a.l.m<DataType, Bitmap> mVar) {
        this.b = resources;
        this.a = mVar;
    }

    @Override // f.e.a.l.m
    public boolean a(DataType datatype, f.e.a.l.l lVar) {
        return this.a.a(datatype, lVar);
    }

    @Override // f.e.a.l.m
    public f.e.a.l.q.v<BitmapDrawable> b(DataType datatype, int i2, int i3, f.e.a.l.l lVar) {
        return s.d(this.b, this.a.b(datatype, i2, i3, lVar));
    }
}
