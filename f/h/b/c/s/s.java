package f.h.b.c.s;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: ToolbarUtils.java */
/* loaded from: classes.dex */
public class s {
    public static final Comparator<View> a = new a();

    /* compiled from: ToolbarUtils.java */
    /* loaded from: classes.dex */
    public class a implements Comparator<View> {
        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    }

    public static List<TextView> a(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < toolbar.getChildCount(); i2++) {
            View childAt = toolbar.getChildAt(i2);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }
}
