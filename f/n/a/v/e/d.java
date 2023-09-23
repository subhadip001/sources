package f.n.a.v.e;

import android.util.Log;
import android.widget.TextView;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.constants.User;
import com.video_converter.video_compressor.dialogs.inputDialog.InputDialogDismissedEvent;
import com.video_converter.video_compressor.screens.vidCompInputScreen.VidCompInputScreenActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: FileNameInputBottomSheetController.java */
/* loaded from: classes2.dex */
public class d implements e {
    public x a;
    public boolean b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f7161d;

    /* renamed from: e  reason: collision with root package name */
    public String f7162e;

    /* renamed from: f  reason: collision with root package name */
    public String f7163f;

    /* renamed from: g  reason: collision with root package name */
    public String f7164g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<f.n.a.o.h> f7165h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<f.n.a.o.h> f7166i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList<f.n.a.o.h> f7167j;

    /* renamed from: k  reason: collision with root package name */
    public f.h.b.c.h.e f7168k;

    public d(f.h.b.c.h.e eVar) {
        this.f7168k = eVar;
    }

    @Override // f.n.a.v.e.e
    public void a() {
        this.f7168k.dismissAllowingStateLoss();
    }

    @Override // f.n.a.v.e.e
    public Boolean b(String str) {
        Log.d("TAGTAG", "onStartCheckFileNameValidity: ");
        if (!str.isEmpty() && !str.contains("/") && !str.contains("\\") && !str.contains("?") && !str.contains("*") && !str.contains("\"") && !str.contains(":")) {
            Boolean bool = Boolean.FALSE;
            if (bool.equals(Boolean.valueOf(this.b)) && new File(f.l.b.c.f(str, this.f7163f)).exists()) {
                f.h.b.c.h.e eVar = this.f7168k;
                if (eVar != null) {
                    x xVar = this.a;
                    String string = eVar.getString(R.string.file_name_exists);
                    Objects.requireNonNull(xVar);
                    if (string != null) {
                        xVar.o.setText(string);
                        xVar.o.setVisibility(0);
                    }
                }
                return bool;
            }
            return Boolean.TRUE;
        }
        f.h.b.c.h.e eVar2 = this.f7168k;
        if (eVar2 != null) {
            x xVar2 = this.a;
            String string2 = eVar2.getString(R.string.invalid_name);
            Objects.requireNonNull(xVar2);
            if (string2 != null) {
                xVar2.o.setText(string2);
                xVar2.o.setVisibility(0);
            }
        }
        return Boolean.FALSE;
    }

    @Override // f.n.a.v.e.e
    public void c(int i2, Boolean bool) {
        x xVar = this.a;
        String valueOf = String.valueOf(i2);
        TextView textView = xVar.n;
        textView.setText(valueOf + "%");
        this.f7161d = i2;
        if (this.b) {
            return;
        }
        int round = (int) (Math.round(((float) ((this.c * i2) / 100.0d)) * 100.0d) / 100.0d);
        if (round % 2 == 1) {
            round++;
        }
        x xVar2 = this.a;
        String valueOf2 = String.valueOf(round);
        TextView textView2 = xVar2.f7187m;
        textView2.setText("(" + valueOf2 + "kbps)");
    }

    @Override // f.n.a.v.e.e
    public void d(ArrayList<f.n.a.o.h> arrayList, int i2) {
        Iterator<f.n.a.o.h> it = arrayList.iterator();
        while (it.hasNext()) {
            f.n.a.o.h next = it.next();
            if (next.f7062j) {
                next.f7062j = false;
            }
        }
        arrayList.get(i2).f7062j = !arrayList.get(i2).f7062j;
        x xVar = this.a;
        xVar.f7186l.setText(arrayList.get(i2).f7058f);
        x xVar2 = this.a;
        boolean k2 = k();
        b bVar = xVar2.A;
        bVar.a = arrayList;
        bVar.f7156d = Boolean.valueOf(k2);
        bVar.notifyDataSetChanged();
    }

    @Override // f.n.a.v.e.e
    public void e(String str, Boolean bool, Boolean bool2, Boolean bool3) {
        if (bool2.booleanValue()) {
            Iterator<f.n.a.o.h> it = this.f7165h.iterator();
            while (it.hasNext()) {
                it.next().f7062j = false;
            }
            Iterator<f.n.a.o.h> it2 = this.f7165h.iterator();
            while (it2.hasNext()) {
                f.n.a.o.h next = it2.next();
                if ("_none".equals(next.f7059g)) {
                    next.f7062j = true;
                }
            }
        }
        m.a.a.c.b().f(new InputDialogDismissedEvent(this.f7162e, InputDialogDismissedEvent.ClickedButton.NEGATIVE, str, bool.booleanValue(), bool3.booleanValue(), this.f7161d, this.f7165h, this.f7166i, this.f7167j));
        this.f7168k.dismiss();
    }

    @Override // f.n.a.v.e.e
    public void f(ArrayList<f.n.a.o.h> arrayList, int i2) {
        boolean z = false;
        if (this.b) {
            if (!User.a() && "_all".equals(arrayList.get(i2).f7059g) && !j()) {
                m.a.a.c.b().f(new f.n.a.v.a.i("all_audio_streams_purchase_dialog"));
                return;
            }
            Iterator<f.n.a.o.h> it = arrayList.iterator();
            while (it.hasNext()) {
                f.n.a.o.h next = it.next();
                if (next.f7062j) {
                    next.f7062j = false;
                }
            }
            arrayList.get(i2).f7062j = !arrayList.get(i2).f7062j;
            if (arrayList.get(i2).f7059g.equals("_none")) {
                this.a.g();
            } else {
                this.a.G.setEnabled(true);
            }
            x xVar = this.a;
            xVar.f7184j.setText(arrayList.get(i2).f7058f);
            x xVar2 = this.a;
            boolean j2 = j();
            b bVar = xVar2.y;
            bVar.a = arrayList;
            bVar.f7156d = Boolean.valueOf(j2);
            bVar.notifyDataSetChanged();
        } else if (i2 == 0) {
            for (int i3 = 1; i3 < arrayList.size(); i3++) {
                if (arrayList.get(i3).f7062j) {
                    arrayList.get(i3).f7062j = false;
                }
            }
            arrayList.get(0).f7062j = true;
            this.a.f7184j.setText("None");
            x xVar3 = this.a;
            boolean j3 = j();
            b bVar2 = xVar3.y;
            bVar2.a = arrayList;
            bVar2.f7156d = Boolean.valueOf(j3);
            bVar2.notifyDataSetChanged();
            this.a.g();
        } else {
            arrayList.get(0).f7062j = false;
            arrayList.get(i2).f7062j = !arrayList.get(i2).f7062j;
            int i4 = 0;
            for (int i5 = 1; i5 < arrayList.size(); i5++) {
                if (arrayList.get(i5).f7062j) {
                    i4++;
                }
            }
            if (i4 == 0) {
                arrayList.get(0).f7062j = true;
                this.a.f7184j.setText("None");
                this.a.g();
            } else if (i4 == 1) {
                Iterator<f.n.a.o.h> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    f.n.a.o.h next2 = it2.next();
                    if (next2.f7062j) {
                        x xVar4 = this.a;
                        xVar4.f7184j.setText(next2.f7058f);
                    }
                }
                x xVar5 = this.a;
                boolean j4 = j();
                b bVar3 = xVar5.y;
                bVar3.a = arrayList;
                bVar3.f7156d = Boolean.valueOf(j4);
                bVar3.notifyDataSetChanged();
                this.a.G.setEnabled(true);
            } else {
                if (!User.a()) {
                    f.h.b.c.h.e eVar = this.f7168k;
                    if (eVar != null && eVar.getActivity() != null && (this.f7168k.getActivity() instanceof VidCompInputScreenActivity)) {
                        z = ((VidCompInputScreenActivity) this.f7168k.getActivity()).x.J;
                    }
                    if (!z) {
                        m.a.a.c.b().f(new f.n.a.v.a.i("audio_purchase_dialog"));
                        arrayList.get(i2).f7062j = !arrayList.get(i2).f7062j;
                    }
                }
                x xVar6 = this.a;
                xVar6.f7184j.setText(String.valueOf(i4) + " Streams selected");
                x xVar7 = this.a;
                boolean j5 = j();
                b bVar4 = xVar7.y;
                bVar4.a = arrayList;
                bVar4.f7156d = Boolean.valueOf(j5);
                bVar4.notifyDataSetChanged();
            }
            x xVar8 = this.a;
            boolean j6 = j();
            b bVar5 = xVar8.y;
            bVar5.a = arrayList;
            bVar5.f7156d = Boolean.valueOf(j6);
            bVar5.notifyDataSetChanged();
        }
    }

    @Override // f.n.a.v.e.e
    public void g() {
        if (this.a.N.isChecked()) {
            this.a.N.setChecked(false);
            this.a.h(true);
            return;
        }
        this.a.N.setChecked(true);
        this.a.h(false);
    }

    @Override // f.n.a.v.e.e
    public void h(String str, Boolean bool, Boolean bool2, Boolean bool3) {
        if (bool2.booleanValue()) {
            Iterator<f.n.a.o.h> it = this.f7165h.iterator();
            while (it.hasNext()) {
                it.next().f7062j = false;
            }
            Iterator<f.n.a.o.h> it2 = this.f7165h.iterator();
            while (it2.hasNext()) {
                f.n.a.o.h next = it2.next();
                if ("_none".equals(next.f7059g)) {
                    next.f7062j = true;
                }
            }
        }
        m.a.a.c.b().f(new InputDialogDismissedEvent(this.f7162e, InputDialogDismissedEvent.ClickedButton.POSITIVE, str, bool.booleanValue(), bool3.booleanValue(), this.f7161d, this.f7165h, this.f7166i, this.f7167j));
        this.f7168k.dismiss();
    }

    @Override // f.n.a.v.e.e
    public void i(ArrayList<f.n.a.o.h> arrayList, int i2) {
        boolean z = false;
        if (this.b) {
            if (!User.a() && "_all".equals(arrayList.get(i2).f7059g) && !k()) {
                m.a.a.c.b().f(new f.n.a.v.a.i("all_subtitle_streams_purchase_dialog"));
                return;
            }
            Iterator<f.n.a.o.h> it = arrayList.iterator();
            while (it.hasNext()) {
                f.n.a.o.h next = it.next();
                if (next.f7062j) {
                    next.f7062j = false;
                }
            }
            arrayList.get(i2).f7062j = !arrayList.get(i2).f7062j;
            x xVar = this.a;
            xVar.f7185k.setText(arrayList.get(i2).f7058f);
            x xVar2 = this.a;
            boolean k2 = k();
            b bVar = xVar2.z;
            bVar.a = arrayList;
            bVar.f7156d = Boolean.valueOf(k2);
            bVar.notifyDataSetChanged();
        } else if (i2 == 0) {
            for (int i3 = 1; i3 < arrayList.size(); i3++) {
                if (arrayList.get(i3).f7062j) {
                    arrayList.get(i3).f7062j = false;
                }
            }
            arrayList.get(0).f7062j = true;
            this.a.f7185k.setText("None");
            x xVar3 = this.a;
            boolean k3 = k();
            b bVar2 = xVar3.z;
            bVar2.a = arrayList;
            bVar2.f7156d = Boolean.valueOf(k3);
            bVar2.notifyDataSetChanged();
        } else {
            StringBuilder A = f.a.b.a.a.A("onSubtitleOptionClicked: ");
            A.append(arrayList.get(i2).f7060h);
            Log.d("fg", A.toString());
            if (!l(arrayList.get(i2).f7060h)) {
                x xVar4 = this.a;
                xVar4.J.setMessage(this.f7168k.getString(R.string.codec_not_supported));
                xVar4.J.show();
                return;
            }
            arrayList.get(0).f7062j = false;
            arrayList.get(i2).f7062j = !arrayList.get(i2).f7062j;
            int i4 = 0;
            for (int i5 = 1; i5 < arrayList.size(); i5++) {
                if (arrayList.get(i5).f7062j) {
                    i4++;
                }
            }
            if (i4 == 0) {
                arrayList.get(0).f7062j = true;
                this.a.f7185k.setText("None");
            } else if (i4 == 1) {
                Iterator<f.n.a.o.h> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    f.n.a.o.h next2 = it2.next();
                    if (next2.f7062j) {
                        x xVar5 = this.a;
                        xVar5.f7185k.setText(next2.f7058f);
                    }
                }
                x xVar6 = this.a;
                boolean k4 = k();
                b bVar3 = xVar6.z;
                bVar3.a = arrayList;
                bVar3.f7156d = Boolean.valueOf(k4);
                bVar3.notifyDataSetChanged();
            } else {
                if (!User.a()) {
                    f.h.b.c.h.e eVar = this.f7168k;
                    if (eVar != null && eVar.getActivity() != null && (this.f7168k.getActivity() instanceof VidCompInputScreenActivity)) {
                        z = ((VidCompInputScreenActivity) this.f7168k.getActivity()).x.K;
                    }
                    if (!z) {
                        m.a.a.c.b().f(new f.n.a.v.a.i("subtitle_purchase_dialog"));
                        arrayList.get(i2).f7062j = !arrayList.get(i2).f7062j;
                    }
                }
                x xVar7 = this.a;
                xVar7.f7185k.setText(String.valueOf(i4) + " Streams selected");
                x xVar8 = this.a;
                boolean k5 = k();
                b bVar4 = xVar8.z;
                bVar4.a = arrayList;
                bVar4.f7156d = Boolean.valueOf(k5);
                bVar4.notifyDataSetChanged();
            }
            x xVar9 = this.a;
            boolean k6 = k();
            b bVar5 = xVar9.z;
            bVar5.a = arrayList;
            bVar5.f7156d = Boolean.valueOf(k6);
            bVar5.notifyDataSetChanged();
        }
    }

    public boolean j() {
        f.h.b.c.h.e eVar = this.f7168k;
        if (eVar == null || eVar.getActivity() == null || !(this.f7168k.getActivity() instanceof VidCompInputScreenActivity)) {
            return false;
        }
        return ((VidCompInputScreenActivity) this.f7168k.getActivity()).x.L;
    }

    public boolean k() {
        f.h.b.c.h.e eVar = this.f7168k;
        if (eVar == null || eVar.getActivity() == null || !(this.f7168k.getActivity() instanceof VidCompInputScreenActivity)) {
            return false;
        }
        return ((VidCompInputScreenActivity) this.f7168k.getActivity()).x.M;
    }

    public final boolean l(String str) {
        for (String str2 : f.n.a.i.a.a) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
