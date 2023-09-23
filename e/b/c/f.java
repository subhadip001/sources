package e.b.c;

import android.view.View;
import androidx.appcompat.app.AlertController;

/* compiled from: AlertController.java */
/* loaded from: classes.dex */
public class f implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ View f1474f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ View f1475g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ AlertController f1476h;

    public f(AlertController alertController, View view, View view2) {
        this.f1476h = alertController;
        this.f1474f = view;
        this.f1475g = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        AlertController.c(this.f1476h.f89g, this.f1474f, this.f1475g);
    }
}
