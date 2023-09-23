package f.m.b;

import android.content.Context;
import com.squareup.picasso.Picasso;
import f.m.b.x;

/* compiled from: FileRequestHandler.java */
/* loaded from: classes2.dex */
public class k extends g {
    public k(Context context) {
        super(context);
    }

    @Override // f.m.b.g, f.m.b.x
    public boolean c(v vVar) {
        return "file".equals(vVar.c.getScheme());
    }

    @Override // f.m.b.g, f.m.b.x
    public x.a f(v vVar, int i2) {
        return new x.a(null, l.o.f(this.a.getContentResolver().openInputStream(vVar.c)), Picasso.LoadedFrom.DISK, new e.o.a.a(vVar.c.getPath()).c("Orientation", 1));
    }
}
