package f.n.a.k.g;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.dialogs.promptdialog.PromptDialogDismissedEvent;
import m.a.a.c;

/* compiled from: PromptDialog.java */
/* loaded from: classes2.dex */
public class a extends f.n.a.k.c.a {

    /* renamed from: m  reason: collision with root package name */
    public c f6990m;
    public f.n.a.k.b n;
    public TextView o;
    public TextView p;
    public AppCompatButton q;
    public AppCompatButton r;

    /* compiled from: PromptDialog.java */
    /* renamed from: f.n.a.k.g.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0176a implements View.OnClickListener {
        public View$OnClickListenerC0176a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            aVar.dismiss();
            aVar.f6990m.f(new PromptDialogDismissedEvent(aVar.n.a(aVar), PromptDialogDismissedEvent.ClickedButton.POSITIVE));
        }
    }

    /* compiled from: PromptDialog.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            aVar.dismiss();
            aVar.f6990m.f(new PromptDialogDismissedEvent(aVar.n.a(aVar), PromptDialogDismissedEvent.ClickedButton.NEGATIVE));
        }
    }

    public static a m(String str, String str2, String str3, String str4) {
        a aVar = new a();
        Bundle bundle = new Bundle(4);
        bundle.putString("ARG_TITLE", str);
        bundle.putString("ARG_MESSAGE", str2);
        bundle.putString("ARG_POSITIVE_BUTTON_CAPTION", str3);
        bundle.putString("ARG_NEGATIVE_BUTTON_CAPTION", str4);
        aVar.setArguments(bundle);
        return aVar;
    }

    @Override // f.n.a.k.c.a, e.p.c.k, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f6990m = c.b();
        this.n = new f.n.a.k.b(requireActivity().H());
    }

    @Override // e.p.c.k
    public final Dialog onCreateDialog(Bundle bundle) {
        if (getArguments() != null) {
            Dialog dialog = new Dialog(requireContext());
            dialog.setContentView(R.layout.layout_prompt_dialog);
            this.o = (TextView) dialog.findViewById(R.id.tv_title);
            this.p = (TextView) dialog.findViewById(R.id.tv_content);
            this.q = (AppCompatButton) dialog.findViewById(R.id.btn_positive);
            this.r = (AppCompatButton) dialog.findViewById(R.id.btn_negative);
            this.o.setText(getArguments().getString("ARG_TITLE"));
            this.p.setText(getArguments().getString("ARG_MESSAGE"));
            this.q.setText(getArguments().getString("ARG_POSITIVE_BUTTON_CAPTION"));
            this.r.setText(getArguments().getString("ARG_NEGATIVE_BUTTON_CAPTION"));
            this.q.setOnClickListener(new View$OnClickListenerC0176a());
            this.r.setOnClickListener(new b());
            return dialog;
        }
        throw new IllegalStateException("arguments mustn't be null");
    }
}
