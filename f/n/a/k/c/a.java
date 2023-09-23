package f.n.a.k.c;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.BounceInterpolator;
import com.google.logging.type.LogSeverity;
import com.video_converter.video_compressor.dialogs.common.DialogEnterAnimation;
import com.video_converter.video_compressor.dialogs.common.DialogExitAnimation;
import e.p.c.k;
import java.util.Objects;

/* compiled from: BaseDialog.java */
/* loaded from: classes2.dex */
public abstract class a extends k {

    /* renamed from: f  reason: collision with root package name */
    public b f6972f;

    /* renamed from: h  reason: collision with root package name */
    public DialogEnterAnimation f6974h;

    /* renamed from: j  reason: collision with root package name */
    public DialogExitAnimation f6976j;

    /* renamed from: l  reason: collision with root package name */
    public boolean f6978l;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6973g = true;

    /* renamed from: i  reason: collision with root package name */
    public int f6975i = LogSeverity.NOTICE_VALUE;

    /* renamed from: k  reason: collision with root package name */
    public int f6977k = LogSeverity.NOTICE_VALUE;

    /* compiled from: BaseDialog.java */
    /* renamed from: f.n.a.k.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0173a implements Runnable {
        public RunnableC0173a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.super.dismiss();
        }
    }

    /* compiled from: BaseDialog.java */
    /* loaded from: classes2.dex */
    public class b {
        public b(RunnableC0173a runnableC0173a) {
        }
    }

    public static View k(a aVar) {
        if (aVar.l() == null) {
            return null;
        }
        return aVar.l().getDecorView();
    }

    @Override // e.p.c.k
    public void dismiss() {
        ObjectAnimator ofFloat;
        if (this.f6978l) {
            return;
        }
        RunnableC0173a runnableC0173a = new RunnableC0173a();
        DialogExitAnimation dialogExitAnimation = this.f6976j;
        if (dialogExitAnimation == null) {
            runnableC0173a.run();
            return;
        }
        b bVar = this.f6972f;
        long j2 = this.f6977k;
        Objects.requireNonNull(bVar);
        int ordinal = dialogExitAnimation.ordinal();
        if (ordinal == 0) {
            ofFloat = ObjectAnimator.ofFloat(k(a.this), "translationX", 0.0f, -a.this.requireActivity().getWindow().getDecorView().getWidth());
        } else if (ordinal == 1) {
            ofFloat = ObjectAnimator.ofFloat(k(a.this), "translationY", 0.0f, a.this.requireActivity().getWindow().getDecorView().getHeight());
        } else {
            throw new RuntimeException("unhandled exit animation: " + dialogExitAnimation);
        }
        ofFloat.setDuration(j2);
        ofFloat.addListener(new f.n.a.k.c.b(this, runnableC0173a));
        ofFloat.start();
        this.f6978l = true;
    }

    public final Window l() {
        if (getDialog() == null || getDialog().getWindow() == null) {
            return null;
        }
        return getDialog().getWindow();
    }

    @Override // e.p.c.k, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f6972f = new b(null);
        if (bundle != null) {
            this.f6973g = bundle.getBoolean("SAVED_STATE_FIRST_ON_START");
            this.f6974h = (DialogEnterAnimation) bundle.getSerializable("SAVED_STATE_ENTER_ANIMATION");
            this.f6976j = (DialogExitAnimation) bundle.getSerializable("SAVED_STATE_EXIT_ANIMATION");
        }
    }

    @Override // e.p.c.k, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("SAVED_STATE_FIRST_ON_START", this.f6973g);
        bundle.putSerializable("SAVED_STATE_ENTER_ANIMATION", this.f6974h);
        bundle.putSerializable("SAVED_STATE_EXIT_ANIMATION", this.f6976j);
    }

    @Override // e.p.c.k, androidx.fragment.app.Fragment
    public void onStart() {
        ObjectAnimator ofFloat;
        super.onStart();
        if (this.f6973g) {
            super.setCancelable(false);
            DialogEnterAnimation dialogEnterAnimation = this.f6974h;
            if (dialogEnterAnimation != null) {
                b bVar = this.f6972f;
                long j2 = this.f6975i;
                Objects.requireNonNull(bVar);
                View k2 = k(a.this);
                if (k2 == null) {
                    ofFloat = null;
                } else {
                    int ordinal = dialogEnterAnimation.ordinal();
                    if (ordinal == 0) {
                        ofFloat = ObjectAnimator.ofFloat(k2, "translationX", a.this.requireActivity().getWindow().getDecorView().getWidth(), 0.0f);
                    } else if (ordinal == 1) {
                        ofFloat = ObjectAnimator.ofFloat(k2, "translationY", -a.this.requireActivity().getWindow().getDecorView().getHeight(), 0.0f);
                        ofFloat.setInterpolator(new BounceInterpolator());
                    } else {
                        throw new RuntimeException("unhandled enter animation: " + dialogEnterAnimation);
                    }
                    ofFloat.setDuration(j2);
                }
                if (ofFloat != null) {
                    ofFloat.start();
                }
            }
            this.f6973g = false;
        }
    }
}
