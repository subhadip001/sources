package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.video_converter.video_compressor.R;
import f.h.b.b.e2.h;
import f.h.b.b.e2.o;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: f  reason: collision with root package name */
    public final int f970f;

    /* renamed from: g  reason: collision with root package name */
    public final LayoutInflater f971g;

    /* renamed from: h  reason: collision with root package name */
    public final CheckedTextView f972h;

    /* renamed from: i  reason: collision with root package name */
    public final CheckedTextView f973i;

    /* renamed from: j  reason: collision with root package name */
    public final b f974j;

    /* renamed from: k  reason: collision with root package name */
    public final SparseArray<DefaultTrackSelector.SelectionOverride> f975k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f976l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f977m;
    public o n;
    public TrackGroupArray o;
    public boolean p;

    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b(a aVar) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView trackSelectionView = TrackSelectionView.this;
            if (view == trackSelectionView.f972h) {
                trackSelectionView.p = true;
                trackSelectionView.f975k.clear();
            } else if (view == trackSelectionView.f973i) {
                trackSelectionView.p = false;
                trackSelectionView.f975k.clear();
            } else {
                trackSelectionView.p = false;
                Object tag = view.getTag();
                Objects.requireNonNull(tag);
                trackSelectionView.f975k.get(((c) tag).a);
                throw null;
            }
            trackSelectionView.a();
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public final int a;
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        this.f975k = new SparseArray<>();
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843534});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.f970f = resourceId;
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.f971g = from;
        b bVar = new b(null);
        this.f974j = bVar;
        this.n = new h(getResources());
        this.o = TrackGroupArray.f878i;
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(17367055, (ViewGroup) this, false);
        this.f972h = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(17367055, (ViewGroup) this, false);
        this.f973i = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }

    public final void a() {
        this.f972h.setChecked(this.p);
        this.f973i.setChecked(!this.p && this.f975k.size() == 0);
        throw null;
    }

    public final void b() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount >= 3) {
                removeViewAt(childCount);
            } else {
                this.f972h.setEnabled(false);
                this.f973i.setEnabled(false);
                return;
            }
        }
    }

    public boolean getIsDisabled() {
        return this.p;
    }

    public List<DefaultTrackSelector.SelectionOverride> getOverrides() {
        ArrayList arrayList = new ArrayList(this.f975k.size());
        for (int i2 = 0; i2 < this.f975k.size(); i2++) {
            arrayList.add(this.f975k.valueAt(i2));
        }
        return arrayList;
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.f976l != z) {
            this.f976l = z;
            b();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.f977m != z) {
            this.f977m = z;
            if (!z && this.f975k.size() > 1) {
                for (int size = this.f975k.size() - 1; size > 0; size--) {
                    this.f975k.remove(size);
                }
            }
            b();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.f972h.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(o oVar) {
        Objects.requireNonNull(oVar);
        this.n = oVar;
        b();
    }
}
