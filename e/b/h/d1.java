package e.b.h;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.video_converter.video_compressor.R;

/* compiled from: TooltipPopup.java */
/* loaded from: classes.dex */
public class d1 {
    public final Context a;
    public final View b;
    public final TextView c;

    /* renamed from: d  reason: collision with root package name */
    public final WindowManager.LayoutParams f1748d;

    /* renamed from: e  reason: collision with root package name */
    public final Rect f1749e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f1750f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f1751g;

    public d1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1748d = layoutParams;
        this.f1749e = new Rect();
        this.f1750f = new int[2];
        this.f1751g = new int[2];
        this.a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(d1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2131951623;
        layoutParams.flags = 24;
    }

    public void a() {
        if (this.b.getParent() != null) {
            ((WindowManager) this.a.getSystemService("window")).removeView(this.b);
        }
    }
}
