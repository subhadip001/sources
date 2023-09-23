package f.n.a.k.j;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.dialogs.common.DialogEnterAnimation;
import com.video_converter.video_compressor.dialogs.valueInputDialogue.ValueInputDialogDismissedEvent;
import java.io.File;
import java.util.Objects;

/* compiled from: ValueInputDialog.java */
/* loaded from: classes2.dex */
public class a extends f.n.a.k.c.a {
    public static final /* synthetic */ int u = 0;

    /* renamed from: m  reason: collision with root package name */
    public m.a.a.c f7006m;
    public f.n.a.k.b n;
    public TextView o;
    public TextView p;
    public TextView q;
    public EditText r;
    public AppCompatButton s;
    public AppCompatButton t;

    /* compiled from: ValueInputDialog.java */
    /* renamed from: f.n.a.k.j.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0179a implements TextWatcher {
        public C0179a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            String string;
            a aVar = a.this;
            int i5 = a.u;
            Objects.requireNonNull(aVar);
            try {
                int parseInt = Integer.parseInt(charSequence.toString());
                if (parseInt <= 8000 && parseInt >= 144 && parseInt % 2 == 0) {
                    string = null;
                } else if (parseInt <= 8000 && parseInt >= 144 && parseInt % 2 != 0) {
                    string = aVar.getResources().getString(R.string.even_resolution_hint);
                } else {
                    string = aVar.getResources().getString(R.string.resolution_range_message);
                }
            } catch (Exception unused) {
                string = aVar.getResources().getString(R.string.invalid_resolution);
            }
            if (string == null) {
                a.this.p.setVisibility(8);
                a.this.s.setEnabled(true);
                return;
            }
            a.this.p.setVisibility(0);
            a.this.p.setText(string);
            a.this.s.setEnabled(false);
        }
    }

    /* compiled from: ValueInputDialog.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            String obj = aVar.r.getText().toString();
            boolean z = false;
            if (!obj.isEmpty() && !obj.contains("/") && !obj.contains("\\") && !obj.contains("?") && !obj.contains("*") && !obj.contains("\"") && !obj.contains(":")) {
                if (Boolean.FALSE.equals(null) && new File(f.l.b.c.f(obj, null)).exists()) {
                    aVar.r.setError(aVar.getString(R.string.file_already_exists));
                } else {
                    z = true;
                }
            } else {
                aVar.r.setError(aVar.requireActivity().getString(R.string.invalid_file_name));
            }
            if (z) {
                a aVar2 = a.this;
                aVar2.dismiss();
                aVar2.f7006m.f(new ValueInputDialogDismissedEvent(aVar2.getArguments().getString("DIALOG_TAG"), ValueInputDialogDismissedEvent.ClickedButton.POSITIVE, aVar2.r.getText().toString()));
            }
        }
    }

    /* compiled from: ValueInputDialog.java */
    /* loaded from: classes2.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            aVar.dismiss();
            aVar.f7006m.f(new ValueInputDialogDismissedEvent(aVar.n.a(aVar), ValueInputDialogDismissedEvent.ClickedButton.NEGATIVE, null));
        }
    }

    public static a m(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        a aVar = new a();
        Bundle bundle = new Bundle(4);
        bundle.putString("ARG_TITLE", str2);
        bundle.putString("DIALOG_TAG", str);
        bundle.putString("ARG_SUB_TITLE", str3);
        bundle.putString("ARG_INPUT_TEXT", str4);
        bundle.putString("ARG_POSITIVE_BUTTON_CAPTION", str5);
        bundle.putString("ARG_NEGATIVE_BUTTON_CAPTION", str6);
        bundle.putString("ARG_NEUTRAL_BUTTON_CAPTION", str7);
        aVar.setArguments(bundle);
        aVar.f6974h = DialogEnterAnimation.SLIDE_IN_FROM_RIGHT;
        return aVar;
    }

    @Override // f.n.a.k.c.a, e.p.c.k, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f7006m = m.a.a.c.b();
        this.n = new f.n.a.k.b(requireActivity().H());
    }

    @Override // e.p.c.k
    public final Dialog onCreateDialog(Bundle bundle) {
        if (getArguments() != null) {
            Dialog dialog = new Dialog(requireContext());
            dialog.setContentView(R.layout.layout_value_input_dialog);
            this.o = (TextView) dialog.findViewById(R.id.tv_title);
            this.q = (TextView) dialog.findViewById(R.id.tv_Subtitle);
            this.r = (EditText) dialog.findViewById(R.id.et_input_field);
            this.p = (TextView) dialog.findViewById(R.id.invalidMessage);
            this.r.addTextChangedListener(new C0179a());
            this.s = (AppCompatButton) dialog.findViewById(R.id.btn_positive);
            this.t = (AppCompatButton) dialog.findViewById(R.id.btn_negative);
            this.o.setText(getArguments().getString("ARG_TITLE"));
            this.q.setText(getArguments().getString("ARG_SUB_TITLE"));
            this.r.setText(getArguments().getString("ARG_INPUT_TEXT"));
            this.s.setText(getArguments().getString("ARG_POSITIVE_BUTTON_CAPTION"));
            this.t.setText(getArguments().getString("ARG_NEGATIVE_BUTTON_CAPTION"));
            this.s.setOnClickListener(new b());
            this.t.setOnClickListener(new c());
            try {
                dialog.getWindow().setLayout((int) (getResources().getDisplayMetrics().widthPixels * 0.92d), -2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return dialog;
        }
        throw new IllegalStateException("arguments mustn't be null");
    }

    @Override // f.n.a.k.c.a, e.p.c.k, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        setCancelable(true);
    }
}
