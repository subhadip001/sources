package f.n.a.v.f;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.constants.CompressionProfile;
import f.n.a.v.q.o;
import java.util.Locale;

/* compiled from: FixedSizeInputDialog.java */
/* loaded from: classes2.dex */
public class b extends f.n.a.k.c.a implements View.OnClickListener, TextWatcher {

    /* renamed from: m  reason: collision with root package name */
    public RadioButton f7188m;
    public RadioButton n;
    public RadioButton o;
    public RadioButton p;
    public Button q;
    public EditText r;
    public c s;
    public CheckBox t;
    public RadioButton u;
    public RadioButton v;

    /* compiled from: FixedSizeInputDialog.java */
    /* loaded from: classes2.dex */
    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                b.this.u.setChecked(false);
            }
        }
    }

    /* compiled from: FixedSizeInputDialog.java */
    /* renamed from: f.n.a.v.f.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0186b implements CompoundButton.OnCheckedChangeListener {
        public C0186b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                b.this.v.setChecked(false);
            }
        }
    }

    /* compiled from: FixedSizeInputDialog.java */
    /* loaded from: classes2.dex */
    public interface c {
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public final void m(int i2) {
        if (i2 != R.id.gmailVal) {
            this.f7188m.setChecked(false);
        }
        if (i2 != R.id.whatsappVal) {
            this.n.setChecked(false);
        }
        if (i2 != R.id.outlookVal) {
            this.o.setChecked(false);
        }
        if (i2 != R.id.gmxVal) {
            this.p.setChecked(false);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R.id.okayBtn) {
            this.r.setError(null);
        }
        switch (view.getId()) {
            case R.id.gmailVal /* 2131362301 */:
                m(R.id.gmailVal);
                this.r.setText(String.valueOf(25));
                f.n.a.z.a.a().a = "gmail_yahoo_aol_button";
                return;
            case R.id.gmxVal /* 2131362302 */:
                m(R.id.gmxVal);
                this.r.setText(String.valueOf(50));
                f.n.a.z.a.a().a = "gmx_button";
                return;
            case R.id.okayBtn /* 2131362531 */:
                f.l.b.c.j(requireContext(), String.class, "last_used_sz", this.r.getText().toString());
                f.l.b.c.j(requireContext(), String.class, "last_used_fp", (this.v.isChecked() ? CompressionProfile.FIXED_SIZE_COMPRESSION : CompressionProfile.FIXED_SIZE_COMPRESSION_LOSSY).toString());
                c cVar = this.s;
                if (cVar != null) {
                    String obj = this.r.getText().toString();
                    CompressionProfile compressionProfile = this.v.isChecked() ? CompressionProfile.FIXED_SIZE_COMPRESSION : CompressionProfile.FIXED_SIZE_COMPRESSION_LOSSY;
                    Log.d("SimpleOptionsScreenCont", "onSubmitWithProfiles() called with: value = [" + obj + "], selectedMode = [" + compressionProfile + "]");
                    f.n.a.v.q.d dVar = ((f.n.a.v.q.c) cVar).a;
                    dVar.f7392l = compressionProfile;
                    dVar.a = obj;
                    o oVar = dVar.f7384d;
                    oVar.p.setText(String.format(Locale.US, oVar.b().getResources().getString(R.string.fixed_size_output), f.a.b.a.a.q(": ", obj, " MB")));
                }
                f.n.a.z.a.a().b = "slower_mode_button";
                if (this.u.isChecked()) {
                    f.n.a.z.a.a().b = "faster_mode_button";
                }
                f.n.a.z.a a2 = f.n.a.z.a.a();
                Context context = getContext();
                if (a2.a != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("impression", a2.a);
                    FirebaseAnalytics.getInstance(context).logEvent("fit_to_size_events", bundle);
                }
                if (a2.b != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("impression", a2.b);
                    FirebaseAnalytics.getInstance(context).logEvent("fit_to_size_events", bundle2);
                }
                a2.a = null;
                a2.b = null;
                dismiss();
                return;
            case R.id.outlookVal /* 2131362544 */:
                m(R.id.outlookVal);
                this.r.setText(String.valueOf(10));
                f.n.a.z.a.a().a = "outlook_hotmail_button";
                return;
            case R.id.whatsappVal /* 2131363034 */:
                m(R.id.whatsappVal);
                this.r.setText(String.valueOf(16));
                f.n.a.z.a.a().a = "whatsapp_button";
                return;
            default:
                return;
        }
    }

    @Override // e.p.c.k
    public Dialog onCreateDialog(Bundle bundle) {
        CompressionProfile compressionProfile;
        Dialog dialog = new Dialog(requireActivity());
        dialog.setContentView(R.layout.fixed_size_input_layout);
        this.f7188m = (RadioButton) dialog.findViewById(R.id.gmailVal);
        this.n = (RadioButton) dialog.findViewById(R.id.whatsappVal);
        this.o = (RadioButton) dialog.findViewById(R.id.outlookVal);
        this.p = (RadioButton) dialog.findViewById(R.id.gmxVal);
        EditText editText = (EditText) dialog.findViewById(R.id.sizeInputFiled);
        this.r = editText;
        String str = (String) f.l.b.c.b(requireActivity(), String.class, "last_used_sz");
        if (str == null) {
            str = "16";
        }
        editText.setText(str);
        this.r.addTextChangedListener(this);
        this.f7188m.setOnClickListener(this);
        this.n.setOnClickListener(this);
        this.o.setOnClickListener(this);
        this.p.setOnClickListener(this);
        Button button = (Button) dialog.findViewById(R.id.okayBtn);
        this.q = button;
        button.setOnClickListener(this);
        RadioButton radioButton = (RadioButton) dialog.findViewById(R.id.twoPassMode);
        this.v = radioButton;
        radioButton.setOnCheckedChangeListener(new a());
        RadioButton radioButton2 = (RadioButton) dialog.findViewById(R.id.lossyMode);
        this.u = radioButton2;
        radioButton2.setOnCheckedChangeListener(new C0186b());
        CheckBox checkBox = (CheckBox) dialog.findViewById(R.id.originalResCheck);
        this.t = checkBox;
        checkBox.setChecked(getArguments().getBoolean("check_original", false));
        try {
            compressionProfile = CompressionProfile.valueOf((String) f.l.b.c.b(requireActivity(), String.class, "last_used_fp"));
        } catch (Exception unused) {
            compressionProfile = CompressionProfile.FIXED_SIZE_COMPRESSION_LOSSY;
        }
        if (compressionProfile == CompressionProfile.FIXED_SIZE_COMPRESSION) {
            this.v.setChecked(true);
        } else {
            this.u.setChecked(true);
        }
        try {
            dialog.getWindow().setLayout((int) (getResources().getDisplayMetrics().widthPixels * 0.92d), -2);
            if (dialog.getWindow() != null) {
                dialog.getWindow().setSoftInputMode(2);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return dialog;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        try {
            Double.parseDouble(charSequence.toString());
            this.q.setEnabled(true);
        } catch (Exception unused) {
            this.r.setError("A valid size required");
            this.q.setEnabled(false);
        }
    }
}
