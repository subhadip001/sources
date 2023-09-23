package m.b.a.g;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.video_converter.video_compressor.R;
import e.p.c.k;
import i.l.b.i;
import m.b.a.g.d;

/* compiled from: ConfirmDialog.kt */
/* loaded from: classes2.dex */
public final class d extends k {

    /* renamed from: l  reason: collision with root package name */
    public static final a f9303l = new a(null);

    /* renamed from: f  reason: collision with root package name */
    public TextView f9304f;

    /* renamed from: g  reason: collision with root package name */
    public TextView f9305g;

    /* renamed from: h  reason: collision with root package name */
    public Button f9306h;

    /* renamed from: i  reason: collision with root package name */
    public Button f9307i;

    /* renamed from: j  reason: collision with root package name */
    public Button f9308j;

    /* renamed from: k  reason: collision with root package name */
    public e f9309k;

    /* compiled from: ConfirmDialog.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public a(i.l.b.e eVar) {
        }
    }

    @Override // e.p.c.k, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        i.e(context, "context");
        super.onAttach(context);
        if (context instanceof e) {
            this.f9309k = (e) context;
        }
    }

    @Override // e.p.c.k
    public Dialog onCreateDialog(Bundle bundle) {
        Button button;
        TextView textView;
        TextView textView2;
        super.onCreateDialog(bundle);
        Dialog dialog = new Dialog(requireContext());
        dialog.setContentView(R.layout.cp_layout_dialog_confirm);
        if (dialog.getWindow() != null) {
            Window window = dialog.getWindow();
            i.b(window);
            window.setLayout(-1, -2);
        }
        Bundle arguments = getArguments();
        String string = arguments == null ? null : arguments.getString("title");
        Bundle arguments2 = getArguments();
        String string2 = arguments2 == null ? null : arguments2.getString("message");
        Bundle arguments3 = getArguments();
        String string3 = arguments3 == null ? null : arguments3.getString("positive");
        Bundle arguments4 = getArguments();
        String string4 = arguments4 == null ? null : arguments4.getString("negative");
        Bundle arguments5 = getArguments();
        String string5 = arguments5 != null ? arguments5.getString("neutral") : null;
        this.f9304f = (TextView) dialog.findViewById(R.id.tv_title);
        this.f9305g = (TextView) dialog.findViewById(R.id.tv_message);
        this.f9306h = (Button) dialog.findViewById(R.id.btn_positive);
        this.f9307i = (Button) dialog.findViewById(R.id.btn_negative);
        this.f9308j = (Button) dialog.findViewById(R.id.btn_neutral);
        if (string != null && (textView2 = this.f9304f) != null) {
            textView2.setText(string);
        }
        if (string2 != null && (textView = this.f9305g) != null) {
            textView.setText(string2);
        }
        if (string3 != null && (button = this.f9306h) != null) {
            button.setText(string3);
        }
        if (string4 != null) {
            Button button2 = this.f9307i;
            if (button2 != null) {
                button2.setText(string4);
            }
            Button button3 = this.f9307i;
            if (button3 != null) {
                button3.setVisibility(0);
            }
        }
        if (string5 != null) {
            Button button4 = this.f9308j;
            if (button4 != null) {
                button4.setText(string5);
            }
            Button button5 = this.f9308j;
            if (button5 != null) {
                button5.setVisibility(0);
            }
        }
        Button button6 = this.f9306h;
        if (button6 != null) {
            button6.setOnClickListener(new View.OnClickListener() { // from class: m.b.a.g.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d dVar = d.this;
                    d.a aVar = d.f9303l;
                    i.e(dVar, "this$0");
                    e eVar = dVar.f9309k;
                    if (eVar == null) {
                        return;
                    }
                    eVar.s(dVar);
                }
            });
        }
        Button button7 = this.f9307i;
        if (button7 != null) {
            button7.setOnClickListener(new View.OnClickListener() { // from class: m.b.a.g.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d dVar = d.this;
                    d.a aVar = d.f9303l;
                    i.e(dVar, "this$0");
                    e eVar = dVar.f9309k;
                    if (eVar == null) {
                        return;
                    }
                    eVar.d(dVar);
                }
            });
        }
        Button button8 = this.f9308j;
        if (button8 != null) {
            button8.setOnClickListener(new View.OnClickListener() { // from class: m.b.a.g.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d dVar = d.this;
                    d.a aVar = d.f9303l;
                    i.e(dVar, "this$0");
                    e eVar = dVar.f9309k;
                    if (eVar == null) {
                        return;
                    }
                    eVar.k(dVar);
                }
            });
        }
        return dialog;
    }
}
