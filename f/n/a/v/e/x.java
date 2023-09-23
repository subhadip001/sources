package f.n.a.v.e;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.video_converter.video_compressor.R;
import java.util.ArrayList;

/* compiled from: FileNameInputBottomSheetView.java */
/* loaded from: classes2.dex */
public class x extends f.n.a.v.c.d.a<e> {
    public b A;
    public ConstraintLayout B;
    public ConstraintLayout C;
    public ConstraintLayout D;
    public ConstraintLayout E;
    public ConstraintLayout F;
    public SeekBar G;
    public CheckBox H;
    public CheckBox I;
    public AlertDialog J;
    public ImageButton K;
    public View L;
    public View M;
    public Switch N;

    /* renamed from: h  reason: collision with root package name */
    public Context f7182h;

    /* renamed from: i  reason: collision with root package name */
    public EditText f7183i;

    /* renamed from: j  reason: collision with root package name */
    public TextView f7184j;

    /* renamed from: k  reason: collision with root package name */
    public TextView f7185k;

    /* renamed from: l  reason: collision with root package name */
    public TextView f7186l;

    /* renamed from: m  reason: collision with root package name */
    public TextView f7187m;
    public TextView n;
    public TextView o;
    public TextView p;
    public ImageView q;
    public ImageView r;
    public ImageView s;
    public RecyclerView t;
    public RecyclerView u;
    public RecyclerView v;
    public Button w;
    public Button x;
    public b y;
    public b z;

    public x(Context context, ViewGroup viewGroup) {
        this.f7182h = context;
        this.f7131f = LayoutInflater.from(context).inflate(R.layout.fragment_file_name_input_bottom_sheet, viewGroup, false);
        this.f7183i = (EditText) a(R.id.etFileName);
        this.f7184j = (TextView) a(R.id.tvSelectedAudio);
        this.f7185k = (TextView) a(R.id.tvSelectedSub);
        this.f7186l = (TextView) a(R.id.tvSelectedAC);
        this.f7187m = (TextView) a(R.id.tvKbpsBitrate);
        this.n = (TextView) a(R.id.tvPercentageBitrate);
        this.o = (TextView) a(R.id.tvShowErrorMsg);
        this.p = (TextView) a(R.id.tvBitrateDisabled);
        this.w = (Button) a(R.id.btnAddToQueue);
        this.x = (Button) a(R.id.btnStart);
        this.t = (RecyclerView) a(R.id.audioStreamsRecycler);
        this.u = (RecyclerView) a(R.id.subtitleRecycler);
        this.v = (RecyclerView) a(R.id.audioChannelRecycler);
        this.B = (ConstraintLayout) a(R.id.audioLay);
        this.C = (ConstraintLayout) a(R.id.subtitleLay);
        this.D = (ConstraintLayout) a(R.id.audioChannelLay);
        ConstraintLayout constraintLayout = (ConstraintLayout) a(R.id.clBitrateLay);
        this.E = (ConstraintLayout) a(R.id.acOriginalNameCheckLay);
        this.F = (ConstraintLayout) a(R.id.acDeleteAudio);
        SeekBar seekBar = (SeekBar) a(R.id.sbAudioBitrate);
        this.G = seekBar;
        if (Build.VERSION.SDK_INT >= 26) {
            seekBar.setMin(5);
        }
        this.G.setMax(150);
        this.G.setProgress(100);
        this.x = (Button) a(R.id.btnStart);
        this.w = (Button) a(R.id.btnAddToQueue);
        this.K = (ImageButton) a(R.id.ibClose);
        this.H = (CheckBox) a(R.id.checkBoxOriginalName);
        this.I = (CheckBox) a(R.id.checkBoxDeleteAudio);
        this.N = (Switch) a(R.id.swHighQualityAudio);
        this.q = (ImageView) a(R.id.ic_audio_arrow_right);
        this.r = (ImageView) a(R.id.ic_subtitle_arrow_right);
        this.s = (ImageView) a(R.id.ic_audio_channel_arrow_right);
        AlertDialog create = new AlertDialog.Builder(this.f7182h).create();
        this.J = create;
        create.setTitle("Error");
        this.J.setMessage("Selected output format does not support this Codec");
        this.J.setButton(-3, "OK", new n(this));
        this.L = a(R.id.llCbHighQuality);
        this.M = a(R.id.clBitrateLay);
        boolean booleanValue = ((Boolean) f.l.b.c.b(this.f7182h, Boolean.class, "previous_high_quality_audio")).booleanValue();
        this.N.setChecked(booleanValue);
        h(!booleanValue);
    }

    public static void d(x xVar, RecyclerView recyclerView) {
        RecyclerView recyclerView2 = xVar.v;
        if (recyclerView != recyclerView2 && recyclerView2.getVisibility() == 0) {
            xVar.v.setVisibility(8);
            xVar.s.setRotation(0.0f);
        }
        RecyclerView recyclerView3 = xVar.u;
        if (recyclerView != recyclerView3 && recyclerView3.getVisibility() == 0) {
            xVar.u.setVisibility(8);
            xVar.r.setRotation(0.0f);
        }
        RecyclerView recyclerView4 = xVar.t;
        if (recyclerView == recyclerView4 || recyclerView4.getVisibility() != 0) {
            return;
        }
        xVar.t.setVisibility(8);
        xVar.q.setRotation(0.0f);
    }

    public void e(ArrayList<f.n.a.o.h> arrayList, boolean z) {
        b bVar = this.A;
        bVar.a = arrayList;
        bVar.f7156d = Boolean.valueOf(z);
        bVar.notifyDataSetChanged();
    }

    public void f(ArrayList<f.n.a.o.h> arrayList, boolean z) {
        b bVar = this.y;
        bVar.a = arrayList;
        bVar.f7156d = Boolean.valueOf(z);
        bVar.notifyDataSetChanged();
    }

    public void g() {
        this.G.setEnabled(false);
    }

    public void h(boolean z) {
        View view = this.M;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt != this.p) {
                    childAt.setEnabled(z);
                }
            }
            if (z) {
                this.p.setVisibility(8);
            } else {
                this.p.setVisibility(0);
            }
        }
    }

    public void i(ArrayList<f.n.a.o.h> arrayList, boolean z) {
        b bVar = this.z;
        bVar.a = arrayList;
        bVar.f7156d = Boolean.valueOf(z);
        bVar.notifyDataSetChanged();
    }
}
