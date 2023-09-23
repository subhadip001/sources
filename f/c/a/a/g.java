package f.c.a.a;

import android.os.Handler;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.video_converter.video_compressor.R;

/* compiled from: DurationAnimator.kt */
/* loaded from: classes.dex */
public final class g {
    public final TextSwitcher a;
    public final long b;
    public final i.l.a.l<Integer, i.h> c;

    /* renamed from: d  reason: collision with root package name */
    public i.l.a.a<i.h> f3107d;

    /* renamed from: e  reason: collision with root package name */
    public int f3108e;

    /* renamed from: f  reason: collision with root package name */
    public int f3109f;

    /* renamed from: g  reason: collision with root package name */
    public final i.c f3110g;

    public g(TextSwitcher textSwitcher, long j2, i.l.a.l lVar, long j3, i.l.a.a aVar, int i2) {
        j2 = (i2 & 2) != 0 ? 1000L : j2;
        lVar = (i2 & 4) != 0 ? null : lVar;
        j3 = (i2 & 8) != 0 ? 300L : j3;
        aVar = (i2 & 16) != 0 ? null : aVar;
        i.l.b.i.e(textSwitcher, "switcher");
        this.a = textSwitcher;
        this.b = j2;
        this.c = lVar;
        this.f3107d = aVar;
        textSwitcher.setFactory(new ViewSwitcher.ViewFactory() { // from class: f.c.a.a.a
            @Override // android.widget.ViewSwitcher.ViewFactory
            public final View makeView() {
                g gVar = g.this;
                i.l.b.i.e(gVar, "this$0");
                return new TextView(new ContextThemeWrapper(gVar.a.getContext(), (int) R.style.myTextStyle), null, 0);
            }
        });
        Animation loadAnimation = AnimationUtils.loadAnimation(textSwitcher.getContext(), R.anim.in_animation);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(textSwitcher.getContext(), R.anim.out_animation);
        loadAnimation.setDuration(j3);
        loadAnimation2.setDuration(j3);
        textSwitcher.setInAnimation(loadAnimation);
        textSwitcher.setOutAnimation(loadAnimation2);
        this.f3110g = f.n.a.n.i.E(new f(this));
    }

    public final Handler a() {
        return (Handler) this.f3110g.getValue();
    }

    public final void b(int i2, int i3) {
        a().removeCallbacksAndMessages(null);
        this.f3108e = i2;
        this.f3109f = i3;
        a().sendEmptyMessage(0);
    }
}
