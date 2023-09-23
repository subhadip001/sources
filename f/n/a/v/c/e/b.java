package f.n.a.v.c.e;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.video_converter.video_compressor.adControllers.RewardedAdManager;

/* compiled from: BaseFragment.java */
/* loaded from: classes2.dex */
public class b extends Fragment {

    /* renamed from: f  reason: collision with root package name */
    public f.n.a.h.d.c f7132f;

    /* renamed from: g  reason: collision with root package name */
    public RewardedAdManager f7133g;

    public f.n.a.h.d.c i() {
        if (this.f7132f == null) {
            this.f7132f = new f.n.a.h.d.c(f.n.a.h.d.b.c(), requireActivity());
        }
        return this.f7132f;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RewardedAdManager rewardedAdManager = new RewardedAdManager();
        this.f7133g = rewardedAdManager;
        rewardedAdManager.n(requireContext(), this, this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f7133g.p(this);
    }
}
