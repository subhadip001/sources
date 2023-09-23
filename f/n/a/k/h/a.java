package f.n.a.k.h;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.dialogs.purchaseDialog.PurchaseDialogDismissedEvent;

/* compiled from: PurchaseDialog.java */
/* loaded from: classes2.dex */
public class a extends f.n.a.k.c.a {

    /* renamed from: m  reason: collision with root package name */
    public m.a.a.c f6993m;
    public f.n.a.k.b n;
    public TextView o;
    public TextView p;
    public TextView q;
    public View r;
    public View s;
    public View t;
    public View u;
    public TextView v;
    public ProgressBar w;
    public f.n.a.n.d x;
    public long y;
    public Handler z;

    /* compiled from: PurchaseDialog.java */
    /* renamed from: f.n.a.k.h.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class HandlerC0177a extends Handler {
        public HandlerC0177a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            try {
                a aVar = a.this;
                long j2 = aVar.y;
                if (j2 <= 0) {
                    aVar.u.setVisibility(8);
                    return;
                }
                long j3 = j2 - 50;
                aVar.y = j3;
                aVar.v.setText(String.valueOf((int) Math.ceil(j3 / 1000)));
                if (Build.VERSION.SDK_INT >= 24) {
                    ProgressBar progressBar = a.this.w;
                    progressBar.setProgress((int) (progressBar.getMax() - a.this.y), true);
                } else {
                    ProgressBar progressBar2 = a.this.w;
                    progressBar2.setProgress((int) (progressBar2.getMax() - a.this.y));
                }
                a aVar2 = a.this;
                if (aVar2.y <= 0) {
                    aVar2.dismiss();
                    aVar2.f6993m.f(new PurchaseDialogDismissedEvent(aVar2.n.a(aVar2), PurchaseDialogDismissedEvent.ClickedButton.NEGATIVE));
                    return;
                }
                aVar2.z.sendEmptyMessageDelayed(0, 100L);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: PurchaseDialog.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Log.d("TAGTAG", "onTrialClick: ");
            a aVar = a.this;
            aVar.dismiss();
            aVar.f6993m.f(new PurchaseDialogDismissedEvent(aVar.n.a(aVar), PurchaseDialogDismissedEvent.ClickedButton.POSITIVE));
        }
    }

    /* compiled from: PurchaseDialog.java */
    /* loaded from: classes2.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.x.a("click_watch_ad");
            Log.d("TAGTAG", "onAdClick: ");
            a aVar = a.this;
            aVar.dismiss();
            aVar.f6993m.f(new PurchaseDialogDismissedEvent(aVar.n.a(aVar), PurchaseDialogDismissedEvent.ClickedButton.NEGATIVE));
        }
    }

    /* compiled from: PurchaseDialog.java */
    /* loaded from: classes2.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            aVar.dismiss();
            aVar.f6993m.f(new PurchaseDialogDismissedEvent(aVar.n.a(aVar), PurchaseDialogDismissedEvent.ClickedButton.NEUTRAL));
        }
    }

    @Override // f.n.a.k.c.a, e.p.c.k, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f6993m = m.a.a.c.b();
        this.n = new f.n.a.k.b(requireActivity().H());
        this.x = new f.n.a.n.d(getActivity());
        try {
            this.z = new HandlerC0177a(Looper.getMainLooper());
        } catch (Exception unused) {
        }
    }

    @Override // e.p.c.k
    public final Dialog onCreateDialog(Bundle bundle) {
        if (getArguments() != null) {
            Dialog dialog = new Dialog(requireContext());
            dialog.setContentView(R.layout.new_purchase_dialog_layout);
            this.o = (TextView) dialog.findViewById(R.id.tv_content);
            this.p = (TextView) dialog.findViewById(R.id.tv_title);
            this.q = (TextView) dialog.findViewById(R.id.tv_negative_btn_label);
            this.r = dialog.findViewById(R.id.btn_positive);
            this.s = dialog.findViewById(R.id.btn_negative);
            this.v = (TextView) dialog.findViewById(R.id.tvCountDown);
            this.w = (ProgressBar) dialog.findViewById(R.id.pbCountDown);
            this.u = dialog.findViewById(R.id.acCountDownContainer);
            try {
                FirebaseRemoteConfig firebaseRemoteConfig = f.n.a.u.a.e().a;
                long j2 = firebaseRemoteConfig == null ? 15000L : firebaseRemoteConfig.getLong("watch_ad_count_down");
                this.y = j2;
                if (j2 > 0) {
                    this.w.setIndeterminate(false);
                    this.w.setSecondaryProgress(0);
                    this.w.setProgress(100);
                    this.w.setMax((int) this.y);
                    this.v.setText(String.valueOf(this.y));
                    this.u.setVisibility(0);
                    this.z.sendEmptyMessage(0);
                } else {
                    this.u.setVisibility(8);
                }
            } catch (Exception unused) {
            }
            this.p.setText(getArguments().getString("ARG_TITLE", "Unlock Premium Features"));
            this.o.setText(getArguments().getString("ARG_CONTENT", "Description"));
            if (getArguments().getBoolean("ARG_VIDEO", false)) {
                this.s.setVisibility(0);
            } else {
                this.s.setVisibility(8);
            }
            if (getArguments().getString("ARG_TITLE", null) != null) {
                this.p.setVisibility(0);
                this.p.setText(getArguments().getString("ARG_TITLE"));
            } else {
                this.p.setVisibility(8);
            }
            this.t = dialog.findViewById(R.id.btn_neutral);
            this.q.setText(getArguments().getString("ARG_NEGATIVE_BTN_LABEL"));
            if (getArguments().getString("ARG_NEGATIVE_BTN_LABEL", null) != null) {
                this.q.setVisibility(0);
                this.q.setText(getArguments().getString("ARG_NEGATIVE_BTN_LABEL"));
            } else {
                this.q.setVisibility(8);
            }
            this.r.setOnClickListener(new b());
            this.s.setOnClickListener(new c());
            this.t.setOnClickListener(new d());
            try {
                dialog.getWindow().setLayout((int) (getResources().getDisplayMetrics().widthPixels * 0.92d), -2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return dialog;
        }
        throw new IllegalStateException("arguments mustn't be null");
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        try {
            this.z.removeCallbacksAndMessages(null);
        } catch (Exception unused) {
        }
    }

    @Override // f.n.a.k.c.a, e.p.c.k, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        try {
            this.z.sendEmptyMessage(0);
        } catch (Exception unused) {
        }
    }

    @Override // e.p.c.k, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }
}
