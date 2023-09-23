package f.n.a.v.e;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.video_converter.video_compressor.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: FileNameInputBottomSheet.java */
/* loaded from: classes2.dex */
public class c extends f.h.b.c.h.e {

    /* renamed from: f  reason: collision with root package name */
    public x f7158f;

    /* renamed from: g  reason: collision with root package name */
    public d f7159g;

    /* compiled from: FileNameInputBottomSheet.java */
    /* loaded from: classes2.dex */
    public class a implements DialogInterface.OnShowListener {
        public a(c cVar) {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            BottomSheetBehavior.G((FrameLayout) ((f.h.b.c.h.d) dialogInterface).findViewById(R.id.design_bottom_sheet)).N(3);
        }
    }

    /* compiled from: FileNameInputBottomSheet.java */
    /* loaded from: classes2.dex */
    public class b implements DialogInterface.OnKeyListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
            if (i2 == 4) {
                try {
                    c.this.dismiss();
                    return true;
                } catch (Exception unused) {
                }
            }
            return false;
        }
    }

    public void k() {
        d dVar = this.f7159g;
        if (dVar != null) {
            dVar.a.f(dVar.f7165h, dVar.j());
            dVar.a.i(dVar.f7166i, dVar.k());
            dVar.a.e(dVar.f7167j, dVar.k());
        }
    }

    @Override // e.p.c.k, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.DialogStyle);
    }

    @Override // f.h.b.c.h.e, e.b.c.t, e.p.c.k
    public Dialog onCreateDialog(Bundle bundle) {
        f.h.b.c.h.d dVar = new f.h.b.c.h.d(getContext(), getTheme());
        dVar.setOnShowListener(new a(this));
        return dVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        x xVar = new x(requireContext(), viewGroup);
        this.f7158f = xVar;
        d dVar = new d(this);
        this.f7159g = dVar;
        dVar.a = xVar;
        return xVar.f7131f;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (getDialog() != null) {
            getDialog().setOnKeyListener(new b());
        }
    }

    @Override // e.p.c.k, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        d dVar = this.f7159g;
        x xVar = dVar.a;
        if (xVar != null) {
            xVar.f7130g.add(dVar);
        }
    }

    @Override // e.p.c.k, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        d dVar = this.f7159g;
        x xVar = dVar.a;
        if (xVar != null) {
            xVar.f7130g.remove(dVar);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        d dVar = this.f7159g;
        Bundle arguments = getArguments();
        Objects.requireNonNull(dVar);
        if (arguments == null) {
            return;
        }
        dVar.b = arguments.getBoolean("isBatch", false);
        dVar.c = arguments.getInt("audioBitrate", 0);
        dVar.f7162e = arguments.getString("fileId");
        dVar.f7163f = arguments.getString("outputFormat");
        dVar.f7164g = arguments.getString("inputFileName");
        dVar.f7161d = 100;
        dVar.c(100, Boolean.TRUE);
        dVar.a.n.setText("100%");
        if (dVar.b) {
            dVar.a.f7183i.setText("batch_process");
            dVar.a.f7187m.setVisibility(8);
        } else {
            dVar.a.E.setEnabled(false);
            dVar.a.E.setVisibility(8);
            String str = "";
            for (int i2 = 0; i2 < dVar.f7164g.length() && dVar.f7164g.charAt(i2) != '.'; i2++) {
                StringBuilder A = f.a.b.a.a.A(str);
                A.append(dVar.f7164g.charAt(i2));
                str = A.toString();
            }
            dVar.a.f7183i.setText(str);
        }
        x xVar = dVar.a;
        boolean z = dVar.b;
        Objects.requireNonNull(xVar);
        f.n.a.v.e.b bVar = new f.n.a.v.e.b(Boolean.valueOf(z));
        xVar.y = bVar;
        bVar.b = new o(xVar);
        xVar.t.setAdapter(bVar);
        f.n.a.v.e.b bVar2 = new f.n.a.v.e.b(Boolean.valueOf(z));
        xVar.z = bVar2;
        bVar2.b = new p(xVar);
        xVar.u.setAdapter(bVar2);
        f.n.a.v.e.b bVar3 = new f.n.a.v.e.b(Boolean.valueOf(z));
        xVar.A = bVar3;
        bVar3.b = new q(xVar);
        xVar.v.setAdapter(bVar3);
        xVar.B.setOnClickListener(new r(xVar));
        xVar.C.setOnClickListener(new s(xVar));
        xVar.D.setOnClickListener(new t(xVar));
        xVar.G.setOnSeekBarChangeListener(new u(xVar));
        xVar.x.setOnClickListener(new v(xVar));
        xVar.w.setOnClickListener(new w(xVar));
        xVar.E.setOnClickListener(new f(xVar));
        xVar.H.setOnClickListener(new g(xVar));
        xVar.F.setOnClickListener(new h(xVar));
        xVar.I.setOnClickListener(new i(xVar));
        xVar.K.setOnClickListener(new j(xVar));
        xVar.f7183i.addTextChangedListener(new k(xVar));
        xVar.L.setOnClickListener(new l(xVar));
        xVar.N.setOnClickListener(new m(xVar));
        xVar.t.setVisibility(8);
        xVar.u.setVisibility(8);
        xVar.v.setVisibility(8);
        dVar.f7165h = (ArrayList) arguments.getSerializable("audioOptions");
        dVar.f7166i = (ArrayList) arguments.getSerializable("subtitleOptions");
        dVar.f7167j = (ArrayList) arguments.getSerializable("audioChannelOptions");
        Iterator<f.n.a.o.h> it = dVar.f7165h.iterator();
        while (it.hasNext()) {
            f.n.a.o.h next = it.next();
            if (next.f7062j) {
                x xVar2 = dVar.a;
                xVar2.f7184j.setText(next.f7058f);
            }
        }
        Iterator<f.n.a.o.h> it2 = dVar.f7166i.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            f.n.a.o.h next2 = it2.next();
            if (!next2.f7059g.equals("_none") && dVar.l(next2.f7060h)) {
                next2.f7062j = true;
                Iterator<f.n.a.o.h> it3 = dVar.f7166i.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    f.n.a.o.h next3 = it3.next();
                    if (next3.f7059g.equals("_none")) {
                        StringBuilder A2 = f.a.b.a.a.A("checkDefaultSupportedCodec: ");
                        A2.append(next2.f7060h);
                        Log.d("fdf", A2.toString());
                        next3.f7062j = false;
                        break;
                    }
                }
            }
        }
        Iterator<f.n.a.o.h> it4 = dVar.f7166i.iterator();
        while (it4.hasNext()) {
            f.n.a.o.h next4 = it4.next();
            if (next4.f7062j) {
                x xVar3 = dVar.a;
                xVar3.f7185k.setText(next4.f7058f);
            }
        }
        Iterator<f.n.a.o.h> it5 = dVar.f7167j.iterator();
        while (it5.hasNext()) {
            f.n.a.o.h next5 = it5.next();
            if (next5.f7062j) {
                x xVar4 = dVar.a;
                xVar4.f7186l.setText(next5.f7058f);
            }
        }
        dVar.a.e(dVar.f7167j, true);
        dVar.a.f(dVar.f7165h, dVar.j());
        dVar.a.i(dVar.f7166i, dVar.k());
        Log.d("testTest", "onViewCreated: " + dVar.b);
    }
}
