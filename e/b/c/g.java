package e.b.c;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* compiled from: AlertController.java */
/* loaded from: classes.dex */
public class g implements AdapterView.OnItemClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ AlertController f1477f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ AlertController.b f1478g;

    public g(AlertController.b bVar, AlertController alertController) {
        this.f1478g = bVar;
        this.f1477f = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.f1478g.o.onClick(this.f1477f.b, i2);
        if (this.f1478g.q) {
            return;
        }
        this.f1477f.b.dismiss();
    }
}
