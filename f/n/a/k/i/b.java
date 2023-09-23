package f.n.a.k.i;

import android.app.AlertDialog;
import android.content.Context;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.video_converter.video_compressor.R;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: CustomTimePicker.java */
/* loaded from: classes2.dex */
public class b {
    public final c a;

    /* compiled from: CustomTimePicker.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ EditText f6997f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ long f6998g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ EditText f6999h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ long f7000i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ EditText f7001j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ long f7002k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ EditText f7003l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ long f7004m;
        public final /* synthetic */ long n;
        public final /* synthetic */ Context o;
        public final /* synthetic */ boolean p;
        public final /* synthetic */ long q;
        public final /* synthetic */ long r;
        public final /* synthetic */ AlertDialog s;

        public a(EditText editText, long j2, EditText editText2, long j3, EditText editText3, long j4, EditText editText4, long j5, long j6, Context context, boolean z, long j7, long j8, AlertDialog alertDialog) {
            this.f6997f = editText;
            this.f6998g = j2;
            this.f6999h = editText2;
            this.f7000i = j3;
            this.f7001j = editText3;
            this.f7002k = j4;
            this.f7003l = editText4;
            this.f7004m = j5;
            this.n = j6;
            this.o = context;
            this.p = z;
            this.q = j7;
            this.r = j8;
            this.s = alertDialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            long a = b.a(b.this, this.f6997f, this.f6998g);
            long a2 = b.a(b.this, this.f6999h, this.f7000i);
            long a3 = b.a(b.this, this.f7001j, this.f7002k);
            long millis = TimeUnit.SECONDS.toMillis(a3) + TimeUnit.MINUTES.toMillis(a2) + TimeUnit.HOURS.toMillis(a) + b.a(b.this, this.f7003l, this.f7004m);
            if (millis > this.n) {
                Context context = this.o;
                Toast.makeText(context, b.this.b(context, R.string.updated_time_greated_then_file_duration), 0).show();
                return;
            }
            boolean z = this.p;
            if (z && millis > this.q) {
                Context context2 = this.o;
                Toast.makeText(context2, b.this.b(context2, R.string.start_larger_then_end), 0).show();
            } else if (!z && millis < this.r) {
                Context context3 = this.o;
                Toast.makeText(context3, b.this.b(context3, R.string.end_smaller_then_start), 0).show();
            } else {
                b.this.a.a(millis);
                this.s.dismiss();
            }
        }
    }

    /* compiled from: CustomTimePicker.java */
    /* renamed from: f.n.a.k.i.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0178b implements View.OnClickListener {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ AlertDialog f7005f;

        public View$OnClickListenerC0178b(b bVar, AlertDialog alertDialog) {
            this.f7005f = alertDialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f7005f.cancel();
        }
    }

    /* compiled from: CustomTimePicker.java */
    /* loaded from: classes2.dex */
    public interface c {
        void a(long j2);
    }

    public b(c cVar) {
        this.a = cVar;
    }

    public static long a(b bVar, EditText editText, long j2) {
        Objects.requireNonNull(bVar);
        String obj = editText.getText().toString();
        return obj.length() > 0 ? Long.parseLong(obj) : j2;
    }

    public String b(Context context, int i2) {
        return context.getResources().getString(i2);
    }

    public void c(Context context, long j2, long j3, long j4, boolean z) {
        long j5 = z ? j2 : j3;
        AlertDialog create = new AlertDialog.Builder(context).create();
        View inflate = LayoutInflater.from(context).inflate(R.layout.time_picker_layout, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(R.id.title_txt_view);
        EditText editText = (EditText) inflate.findViewById(R.id.hh_edit_txt);
        EditText editText2 = (EditText) inflate.findViewById(R.id.mm_edit_txt);
        EditText editText3 = (EditText) inflate.findViewById(R.id.ss_edit_txt);
        EditText editText4 = (EditText) inflate.findViewById(R.id.msec_edit_txt);
        Locale locale = Locale.US;
        editText.setTextLocale(locale);
        editText2.setTextLocale(locale);
        editText3.setTextLocale(locale);
        editText4.setTextLocale(locale);
        Button button = (Button) inflate.findViewById(R.id.pos_btn);
        Button button2 = (Button) inflate.findViewById(R.id.neg_btn);
        button.setSelected(true);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(j5);
        long minutes = timeUnit.toMinutes(j5);
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        long minutes2 = minutes - timeUnit2.toMinutes(hours);
        long seconds = timeUnit.toSeconds(j5);
        long seconds2 = timeUnit2.toSeconds(hours);
        TimeUnit timeUnit3 = TimeUnit.MINUTES;
        long seconds3 = seconds - (timeUnit3.toSeconds(minutes2) + seconds2);
        long millis = timeUnit.toMillis(j5) - (TimeUnit.SECONDS.toMillis(seconds3) + (timeUnit3.toMillis(minutes2) + timeUnit2.toMillis(hours)));
        button.setOnClickListener(new a(editText, hours, editText2, minutes2, editText3, seconds3, editText4, millis, j4, context, z, j3, j2, create));
        button2.setOnClickListener(new View$OnClickListenerC0178b(this, create));
        textView.setText(b(context, z ? R.string.select_start_time : R.string.select_end_time));
        editText.setFilters(new InputFilter[]{new f.n.a.k.i.a(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 23.0d), new InputFilter.LengthFilter(2)});
        editText2.setFilters(new InputFilter[]{new f.n.a.k.i.a(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 59.0d), new InputFilter.LengthFilter(2)});
        editText3.setFilters(new InputFilter[]{new f.n.a.k.i.a(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 59.0d), new InputFilter.LengthFilter(2)});
        editText4.setFilters(new InputFilter[]{new f.n.a.k.i.a(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 999.0d), new InputFilter.LengthFilter(3)});
        editText.setHint(String.format(locale, "%02d", Long.valueOf(hours)));
        editText2.setHint(String.format(locale, "%02d", Long.valueOf(minutes2)));
        editText3.setHint(String.format(locale, "%02d", Long.valueOf(seconds3)));
        editText4.setHint(String.format(locale, "%03d", Long.valueOf(millis)));
        create.setView(inflate);
        create.show();
    }
}
