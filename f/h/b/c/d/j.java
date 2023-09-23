package f.h.b.c.d;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;
import com.video_converter.video_compressor.R;

/* compiled from: ViewUtilsLollipop.java */
/* loaded from: classes.dex */
public class j {
    public static final int[] a = {16843848};

    public static void a(View view, float f2) {
        int integer = view.getResources().getInteger(R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j2 = integer;
        stateListAnimator.addState(new int[]{16842910, R.attr.state_liftable, -2130969578}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j2));
        stateListAnimator.addState(new int[]{16842910}, ObjectAnimator.ofFloat(view, "elevation", f2).setDuration(j2));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}
