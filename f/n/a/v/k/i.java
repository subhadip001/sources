package f.n.a.v.k;

import com.video_converter.video_compressor.adControllers.AdLoader;
import com.video_converter.video_compressor.screens.outputScreen.OutputsActivity;
import java.util.Objects;

/* compiled from: OutputsActivity.java */
/* loaded from: classes2.dex */
public class i implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ OutputsActivity f7271f;

    public i(OutputsActivity outputsActivity) {
        this.f7271f = outputsActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        OutputsActivity outputsActivity = this.f7271f;
        int i2 = OutputsActivity.J;
        outputsActivity.I = new AdLoader(outputsActivity, outputsActivity.u, outputsActivity);
        this.f7271f.u.setVisibility(0);
        OutputsActivity outputsActivity2 = this.f7271f;
        Objects.requireNonNull(outputsActivity2);
        try {
            outputsActivity2.I.c();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
