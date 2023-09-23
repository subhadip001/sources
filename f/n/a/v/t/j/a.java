package f.n.a.v.t.j;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.video_converter.video_compressor.screens.videoCompressorScreen.spinnerListItem.Item;

/* compiled from: CustomSpinnerAdapter.java */
/* loaded from: classes2.dex */
public class a extends ArrayAdapter<Item> {
    public a(Context context) {
        super(context, 0);
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        return getView(i2, view, viewGroup);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            b bVar = new b(LayoutInflater.from(getContext()), viewGroup);
            View view2 = bVar.f7131f;
            view2.setTag(bVar);
            view = view2;
        }
        Item item = getItem(i2);
        b bVar2 = (b) view.getTag();
        bVar2.f7481g.setText(item.f1395f);
        bVar2.f7482h.setText(item.f1396g);
        if (item.f1397h != null) {
            bVar2.f7483i.setVisibility(0);
        } else {
            bVar2.f7483i.setVisibility(8);
        }
        try {
            View currentFocus = ((Activity) view.getContext()).getCurrentFocus();
            if (currentFocus != null) {
                currentFocus.clearFocus();
            }
        } catch (Exception unused) {
        }
        return view;
    }
}
