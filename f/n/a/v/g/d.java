package f.n.a.v.g;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.screens.common.Event;

/* compiled from: FloatingBtnContainerView.java */
/* loaded from: classes2.dex */
public class d extends f.n.a.v.c.d.a<a> {

    /* renamed from: h  reason: collision with root package name */
    public FloatingActionButton f7203h;

    /* renamed from: i  reason: collision with root package name */
    public TextView f7204i;

    public d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f7131f = layoutInflater.inflate(R.layout.layout_floating_action_btn_container, viewGroup, false);
        this.f7203h = (FloatingActionButton) a(R.id.batch_manager_icon);
        ConstraintLayout constraintLayout = (ConstraintLayout) a(R.id.batch_btn_guide);
        ImageButton imageButton = (ImageButton) a(R.id.close_guide_btn);
        this.f7204i = (TextView) a(R.id.batch_counter_txt_view);
        CheckBox checkBox = (CheckBox) a(R.id.checkBox);
        this.f7203h.setOnClickListener(new c(this, Event.ON_BATCH_FAB_CLICKED));
    }
}
