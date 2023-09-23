package f.l.a.f.c.j;

import android.content.Context;
import androidx.fragment.app.Fragment;
import e.p.c.n;
import f.l.a.d.e.b;
import f.l.a.f.c.g.j;
import i.l.b.i;
import java.util.Objects;

/* compiled from: SearchListFragment.kt */
/* loaded from: classes2.dex */
public final class a extends j {
    @Override // f.l.a.f.c.g.j, f.l.a.f.c.c
    public void k() {
        super.k();
        i().f6619g.setEnabled(false);
    }

    @Override // f.l.a.f.c.g.j, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        i.e(context, "context");
        super.onAttach(context);
        if (getParentFragment() instanceof b) {
            Fragment parentFragment = getParentFragment();
            Objects.requireNonNull(parentFragment, "null cannot be cast to non-null type com.nightcode.mediapicker.domain.interfaces.MediaPickerInterface");
            this.f6761i = (b) parentFragment;
        }
        if (getActivity() instanceof b) {
            n activity = getActivity();
            Objects.requireNonNull(activity, "null cannot be cast to non-null type com.nightcode.mediapicker.domain.interfaces.MediaPickerInterface");
            this.f6761i = (b) activity;
        }
    }
}
