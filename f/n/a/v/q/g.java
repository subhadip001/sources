package f.n.a.v.q;

import android.app.Activity;
import android.widget.TextView;
import com.video_converter.video_compressor.R;
import java.util.Locale;

/* compiled from: SimpleOptionsScreenManipulationTask.java */
/* loaded from: classes2.dex */
public class g {
    public Activity a;
    public o b;

    public g(Activity activity) {
        this.a = activity;
    }

    public final String a(String str, String str2, String str3, String str4) {
        return String.format(Locale.US, "%s: %s (%s)\n%s: %s\n%s: %s", this.a.getString(R.string.resolution), str, str2, this.a.getString(R.string.quality), str3, this.a.getString(R.string.speed), str4);
    }

    public void b(String str, String str2, String str3, boolean z) {
        String string = z ? this.a.getString(R.string.original) : this.a.getString(R.string.high);
        String a = a(str, this.a.getString(R.string.low), this.a.getString(R.string.acceptable), this.a.getString(R.string.fastest));
        String a2 = a(str2, this.a.getString(R.string.medium), this.a.getString(R.string.good), this.a.getString(R.string.medium));
        String a3 = a(str3, string, this.a.getString(R.string.good), this.a.getString(R.string.slower));
        String a4 = a(str, this.a.getString(R.string.low), this.a.getString(R.string.high), this.a.getString(R.string.faster));
        String a5 = a(str2, this.a.getString(R.string.medium), this.a.getString(R.string.high), this.a.getString(R.string.slow));
        String a6 = a(str3, string, this.a.getString(R.string.high), this.a.getString(R.string.slowest));
        this.b.s.setText(a);
        this.b.t.setText(a2);
        this.b.u.setText(a3);
        this.b.v.setText(a4);
        this.b.w.setText(a5);
        this.b.x.setText(a6);
    }

    public void c(int i2) {
        TextView textView = this.b.f7406k;
        textView.setText(i2 + "%");
    }

    public void d(int i2, int i3) {
        this.b.f7403h.setText(String.format(Locale.US, "%dx%d", Integer.valueOf(i2), Integer.valueOf(i3)));
    }
}
