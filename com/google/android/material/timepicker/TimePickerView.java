package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.video_converter.video_compressor.R;
import e.g.c.c;
import e.i.j.z;
import f.h.b.c.d0.d;
import f.h.b.c.d0.e;
import f.h.b.c.d0.f;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class TimePickerView extends ConstraintLayout {
    public static final /* synthetic */ int D = 0;
    public final Chip A;
    public final MaterialButtonToggleGroup B;
    public final View.OnClickListener C;
    public final Chip z;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView timePickerView = TimePickerView.this;
            int i2 = TimePickerView.D;
            Objects.requireNonNull(timePickerView);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a aVar = new a();
        this.C = aVar;
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.B = materialButtonToggleGroup;
        materialButtonToggleGroup.f1115h.add(new d(this));
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        this.z = chip;
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.A = chip2;
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        f fVar = new f(this, new GestureDetector(getContext(), new e(this)));
        chip.setOnTouchListener(fVar);
        chip2.setOnTouchListener(fVar);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(aVar);
        chip2.setOnClickListener(aVar);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        s();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if (view == this && i2 == 0) {
            s();
        }
    }

    public final void s() {
        c.a aVar;
        if (this.B.getVisibility() == 0) {
            c cVar = new c();
            cVar.c(this);
            AtomicInteger atomicInteger = z.a;
            char c = z.e.d(this) == 0 ? (char) 2 : (char) 1;
            if (cVar.c.containsKey(Integer.valueOf((int) R.id.material_clock_display)) && (aVar = cVar.c.get(Integer.valueOf((int) R.id.material_clock_display))) != null) {
                switch (c) {
                    case 1:
                        c.b bVar = aVar.f2130d;
                        bVar.f2149j = -1;
                        bVar.f2148i = -1;
                        bVar.G = -1;
                        bVar.N = Integer.MIN_VALUE;
                        break;
                    case 2:
                        c.b bVar2 = aVar.f2130d;
                        bVar2.f2151l = -1;
                        bVar2.f2150k = -1;
                        bVar2.H = -1;
                        bVar2.P = Integer.MIN_VALUE;
                        break;
                    case 3:
                        c.b bVar3 = aVar.f2130d;
                        bVar3.n = -1;
                        bVar3.f2152m = -1;
                        bVar3.I = 0;
                        bVar3.O = Integer.MIN_VALUE;
                        break;
                    case 4:
                        c.b bVar4 = aVar.f2130d;
                        bVar4.o = -1;
                        bVar4.p = -1;
                        bVar4.J = 0;
                        bVar4.Q = Integer.MIN_VALUE;
                        break;
                    case 5:
                        c.b bVar5 = aVar.f2130d;
                        bVar5.q = -1;
                        bVar5.r = -1;
                        bVar5.s = -1;
                        bVar5.M = 0;
                        bVar5.T = Integer.MIN_VALUE;
                        break;
                    case 6:
                        c.b bVar6 = aVar.f2130d;
                        bVar6.t = -1;
                        bVar6.u = -1;
                        bVar6.L = 0;
                        bVar6.S = Integer.MIN_VALUE;
                        break;
                    case 7:
                        c.b bVar7 = aVar.f2130d;
                        bVar7.v = -1;
                        bVar7.w = -1;
                        bVar7.K = 0;
                        bVar7.R = Integer.MIN_VALUE;
                        break;
                    case '\b':
                        c.b bVar8 = aVar.f2130d;
                        bVar8.C = -1.0f;
                        bVar8.B = -1;
                        bVar8.A = -1;
                        break;
                    default:
                        throw new IllegalArgumentException("unknown constraint");
                }
            }
            cVar.b(this, true);
            setConstraintSet(null);
            requestLayout();
        }
    }
}
