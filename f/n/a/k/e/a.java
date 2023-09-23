package f.n.a.k.e;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.dialogs.common.DialogEnterAnimation;
import com.video_converter.video_compressor.dialogs.common.DialogExitAnimation;
import com.video_converter.video_compressor.dialogs.infoDialog.InfoDialogDismissedEvent;
import f.n.a.k.b;
import m.a.a.c;

/* compiled from: InfoDialog.java */
/* loaded from: classes2.dex */
public class a extends f.n.a.k.c.a {

    /* renamed from: m  reason: collision with root package name */
    public c f6980m;
    public b n;
    public TextView o;
    public AppCompatButton p;

    /* compiled from: InfoDialog.java */
    /* renamed from: f.n.a.k.e.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0174a implements View.OnClickListener {
        public View$OnClickListenerC0174a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            aVar.dismiss();
            aVar.f6980m.f(new InfoDialogDismissedEvent(aVar.n.a(aVar), InfoDialogDismissedEvent.ClickedButton.POSITIVE));
        }
    }

    public static a m(String str, String str2) {
        a aVar = new a();
        Bundle bundle = new Bundle(4);
        bundle.putString("ARG_CONTENT", str);
        bundle.putString("ARG_POSITIVE_BUTTON_CAPTION", str2);
        aVar.setArguments(bundle);
        aVar.f6974h = DialogEnterAnimation.SLIDE_IN_FROM_RIGHT;
        aVar.f6976j = DialogExitAnimation.SLIDE_OUT_FROM_LEFT;
        return aVar;
    }

    @Override // f.n.a.k.c.a, e.p.c.k, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f6980m = c.b();
        this.n = new b(requireActivity().H());
    }

    @Override // e.p.c.k
    public final Dialog onCreateDialog(Bundle bundle) {
        if (getArguments() != null) {
            Dialog dialog = new Dialog(requireContext());
            dialog.setContentView(R.layout.layout_info_dialog);
            this.o = (TextView) dialog.findViewById(R.id.tv_content);
            this.p = (AppCompatButton) dialog.findViewById(R.id.btn_positive);
            this.o.setText(getArguments().getString("ARG_CONTENT"));
            this.p.setText(getArguments().getString("ARG_POSITIVE_BUTTON_CAPTION"));
            this.p.setOnClickListener(new View$OnClickListenerC0174a());
            return dialog;
        }
        throw new IllegalStateException("arguments mustn't be null");
    }
}
