package f.n.a.k.f;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.video_converter.video_compressor.R;
import java.util.Objects;

/* compiled from: ProgressDialogue.java */
/* loaded from: classes2.dex */
public class a extends Dialog {

    /* renamed from: j  reason: collision with root package name */
    public static Group f6982j;

    /* renamed from: k  reason: collision with root package name */
    public static Group f6983k;

    /* renamed from: f  reason: collision with root package name */
    public String f6984f;

    /* renamed from: g  reason: collision with root package name */
    public final String f6985g;

    /* renamed from: h  reason: collision with root package name */
    public TextView f6986h;

    /* renamed from: i  reason: collision with root package name */
    public CountDownTimer f6987i;

    /* compiled from: ProgressDialogue.java */
    /* renamed from: f.n.a.k.f.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0175a implements View.OnClickListener {
        public View$OnClickListenerC0175a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.dismiss();
        }
    }

    /* compiled from: ProgressDialogue.java */
    /* loaded from: classes2.dex */
    public class b implements DialogInterface.OnDismissListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            try {
                CountDownTimer countDownTimer = a.this.f6987i;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                    a.this.f6987i = null;
                }
                Objects.requireNonNull(a.this);
            } catch (Exception unused) {
            }
        }
    }

    public a(Context context, String str, String str2) {
        super(context);
        this.f6984f = null;
        this.f6985g = null;
    }

    public void a() {
        f6983k.setVisibility(8);
        f6982j.setVisibility(0);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.layout_progress_dialog);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f6986h = (TextView) findViewById(R.id.subTitle);
        f6982j = (Group) findViewById(R.id.successGroup);
        f6983k = (Group) findViewById(R.id.progressGroup);
        findViewById(R.id.okayBtn).setOnClickListener(new View$OnClickListenerC0175a());
        String str = this.f6984f;
        if (str != null) {
            textView.setText(str);
        }
        String str2 = this.f6985g;
        if (str2 != null) {
            this.f6986h.setText(str2);
        }
        getWindow().setLayout(-1, -2);
        setOnDismissListener(new b());
    }
}
