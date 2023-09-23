package f.h.b.c.b0;

import android.view.View;
import android.widget.AdapterView;
import e.b.h.j0;

/* compiled from: MaterialAutoCompleteTextView.java */
/* loaded from: classes.dex */
public class p implements AdapterView.OnItemClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ q f5203f;

    public p(q qVar) {
        this.f5203f = qVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        Object item;
        q qVar = this.f5203f;
        if (i2 < 0) {
            j0 j0Var = qVar.f5204j;
            item = !j0Var.a() ? null : j0Var.f1799h.getSelectedItem();
        } else {
            item = qVar.getAdapter().getItem(i2);
        }
        q.a(this.f5203f, item);
        AdapterView.OnItemClickListener onItemClickListener = this.f5203f.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i2 < 0) {
                j0 j0Var2 = this.f5203f.f5204j;
                view = !j0Var2.a() ? null : j0Var2.f1799h.getSelectedView();
                j0 j0Var3 = this.f5203f.f5204j;
                i2 = !j0Var3.a() ? -1 : j0Var3.f1799h.getSelectedItemPosition();
                j0 j0Var4 = this.f5203f.f5204j;
                j2 = !j0Var4.a() ? Long.MIN_VALUE : j0Var4.f1799h.getSelectedItemId();
            }
            onItemClickListener.onItemClick(this.f5203f.f5204j.f1799h, view, i2, j2);
        }
        this.f5203f.f5204j.dismiss();
    }
}
