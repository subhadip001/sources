package f.l.b;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.video_converter.video_compressor.R;
import e.p.c.n;
import f.n.a.v.a.j;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* compiled from: FeedbackDialog.java */
/* loaded from: classes2.dex */
public class a extends Dialog {

    /* renamed from: f  reason: collision with root package name */
    public CheckBox[] f6788f;

    /* renamed from: g  reason: collision with root package name */
    public f.l.b.b[] f6789g;

    /* renamed from: h  reason: collision with root package name */
    public CheckBox f6790h;

    /* renamed from: i  reason: collision with root package name */
    public EditText f6791i;

    /* renamed from: j  reason: collision with root package name */
    public d f6792j;

    /* renamed from: k  reason: collision with root package name */
    public int f6793k;

    /* compiled from: FeedbackDialog.java */
    /* renamed from: f.l.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0163a implements View.OnClickListener {
        public View$OnClickListenerC0163a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            Objects.requireNonNull(aVar);
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < 4; i2++) {
                if (aVar.f6788f[i2].isChecked()) {
                    arrayList.add(aVar.f6789g[i2]);
                }
            }
            String obj = aVar.f6790h.isChecked() ? aVar.f6791i.getText().toString() : null;
            if (arrayList.isEmpty() && !aVar.f6790h.isChecked() && (obj == null || obj.isEmpty())) {
                Toast.makeText(aVar.getContext(), "Please tell us something", 0).show();
                return;
            }
            d dVar = aVar.f6792j;
            int i3 = aVar.f6793k;
            j.e eVar = (j.e) dVar;
            Objects.requireNonNull(eVar);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f.a.b.a.a.M(FirebaseAnalytics.getInstance(eVar.a), ((f.l.b.b) it.next()).a);
            }
            f.a.b.a.a.M(FirebaseAnalytics.getInstance(eVar.a), f.a.b.a.a.i("star_", i3));
            if (obj != null && !obj.isEmpty()) {
                if (f.n.a.t.a.a == null) {
                    f.n.a.t.a.a = new f.n.a.t.a();
                }
                f.n.a.t.a aVar2 = f.n.a.t.a.a;
                StringBuilder D = f.a.b.a.a.D(obj, "\n");
                StringBuilder A = f.a.b.a.a.A("Additional Information:\nDevice Brand: ");
                A.append(Build.BRAND);
                A.append("\nDevice Model: ");
                A.append(Build.MODEL);
                A.append("\nAPI Version: ");
                f.a.b.a.a.P(A, Build.VERSION.SDK_INT, "\nVersion Code: ", 265, "\nVersion Name: ");
                A.append("6.0.0");
                A.append("\n");
                D.append(A.toString());
                D.append(" Rating:");
                D.append(i3);
                D.append("\n");
                String sb = D.toString();
                Objects.requireNonNull(aVar2);
                DatabaseReference child = FirebaseDatabase.getInstance().getReference("production").child("rating_review");
                Locale locale = Locale.US;
                child.child(String.format(locale, "V%d", 265)).child(new SimpleDateFormat("dd-MMM-yyyy", locale).format(Calendar.getInstance().getTime())).push().setValue(sb);
                n nVar = eVar.a;
                try {
                    Intent intent = new Intent("android.intent.action.SENDTO");
                    intent.setData(Uri.parse("mailto:support@inverseai.com?subject=" + Uri.encode("Feedback For Video Compressor | Version code : 265") + "&body=" + Uri.encode(obj)));
                    nVar.startActivity(intent);
                } catch (Exception unused) {
                    Toast.makeText(nVar, "No Email app", 0).show();
                }
            }
            f.l.b.c.j(eVar.a, Boolean.class, "feedback_sent", Boolean.TRUE);
            aVar.dismiss();
        }
    }

    /* compiled from: FeedbackDialog.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.dismiss();
        }
    }

    /* compiled from: FeedbackDialog.java */
    /* loaded from: classes2.dex */
    public class c implements CompoundButton.OnCheckedChangeListener {
        public c() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                a.this.f6791i.setVisibility(0);
            } else {
                a.this.f6791i.setVisibility(8);
            }
        }
    }

    public a(Context context) {
        super(context, R.style.rating_dialog);
        this.f6788f = new CheckBox[]{null, null, null, null};
        this.f6789g = new f.l.b.b[]{new f.l.b.b("process_fail", "Process Failed"), new f.l.b.b("low_quality", "Low Quality"), new f.l.b.b("slow_compression", "Slow Compression"), new f.l.b.b("poor_translation", "Poor Translation")};
        this.f6793k = -1;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.feedback_dialog);
        this.f6788f[0] = (CheckBox) findViewById(R.id.check1);
        this.f6788f[1] = (CheckBox) findViewById(R.id.check2);
        this.f6788f[2] = (CheckBox) findViewById(R.id.check3);
        this.f6788f[3] = (CheckBox) findViewById(R.id.check4);
        this.f6790h = (CheckBox) findViewById(R.id.otherCheck);
        this.f6791i = (EditText) findViewById(R.id.messageBox);
        findViewById(R.id.submit_btn).setOnClickListener(new View$OnClickListenerC0163a());
        findViewById(R.id.cancel_button).setOnClickListener(new b());
        this.f6790h.setOnCheckedChangeListener(new c());
        d dVar = this.f6792j;
        if (dVar != null) {
            ((j.e) dVar).a();
            List<f.l.b.b> a = ((j.e) this.f6792j).a();
            int i2 = 0;
            while (true) {
                ArrayList arrayList = (ArrayList) a;
                if (i2 >= Math.min(4, arrayList.size())) {
                    break;
                }
                this.f6789g[i2] = (f.l.b.b) arrayList.get(i2);
                i2++;
            }
        }
        if (this.f6789g == null) {
            return;
        }
        for (int i3 = 0; i3 < Math.min(4, this.f6789g.length); i3++) {
            this.f6788f[i3].setText(this.f6789g[i3].b);
        }
    }
}
