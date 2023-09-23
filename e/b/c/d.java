package e.b.c;

import android.view.View;
import androidx.appcompat.app.AlertController;

/* compiled from: AlertController.java */
/* loaded from: classes.dex */
public class d implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ View f1471f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ View f1472g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ AlertController f1473h;

    public d(AlertController alertController, View view, View view2) {
        this.f1473h = alertController;
        this.f1471f = view;
        this.f1472g = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        AlertController.c(this.f1473h.A, this.f1471f, this.f1472g);
    }
}
