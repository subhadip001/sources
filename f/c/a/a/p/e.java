package f.c.a.a.p;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import com.video_converter.video_compressor.R;

/* compiled from: TimerLayoutBinding.java */
/* loaded from: classes.dex */
public final class e implements e.d0.a {
    public final LinearLayout a;
    public final TextSwitcher b;
    public final TextSwitcher c;

    public e(LinearLayout linearLayout, TextSwitcher textSwitcher, TextSwitcher textSwitcher2) {
        this.a = linearLayout;
        this.b = textSwitcher;
        this.c = textSwitcher2;
    }

    public static e a(View view) {
        int i2 = R.id.timer_minute_switcher;
        TextSwitcher textSwitcher = (TextSwitcher) view.findViewById(R.id.timer_minute_switcher);
        if (textSwitcher != null) {
            i2 = R.id.timer_second_switcher;
            TextSwitcher textSwitcher2 = (TextSwitcher) view.findViewById(R.id.timer_second_switcher);
            if (textSwitcher2 != null) {
                return new e((LinearLayout) view, textSwitcher, textSwitcher2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    @Override // e.d0.a
    public View b() {
        return this.a;
    }
}
