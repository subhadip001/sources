package f.n.a.v.k;

import android.view.View;
import com.video_converter.video_compressor.R;
import e.b.h.o0;
import java.util.Objects;

/* compiled from: OutputFileListAdapter.java */
/* loaded from: classes2.dex */
public class a implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f7253f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ d f7254g;

    public a(d dVar, int i2) {
        this.f7254g = dVar;
        this.f7253f = i2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        d dVar = this.f7254g;
        int i2 = this.f7253f;
        Objects.requireNonNull(dVar);
        c cVar = new c(dVar, i2);
        o0 o0Var = new o0(new e.b.g.c(view.getContext(), (int) R.style.fileSelectorPopupMenuStyle), view);
        new e.b.g.f(o0Var.a).inflate(R.menu.output_item_menu, o0Var.b);
        o0Var.f1819e = new f.n.a.v.a.k(cVar);
        if (!o0Var.f1818d.f()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }
}
