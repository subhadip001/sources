package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import com.video_converter.video_compressor.R;
import e.b.h.m;
import e.i.j.z;
import f.h.b.c.s.c;

/* loaded from: classes.dex */
public class CheckableImageButton extends m implements Checkable {

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f1170l = {16842912};

    /* renamed from: i  reason: collision with root package name */
    public boolean f1171i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1172j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1173k;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        public boolean f1174h;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f348f, i2);
            parcel.writeInt(this.f1174h ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1174h = parcel.readInt() == 1;
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.imageButtonStyle);
        this.f1172j = true;
        this.f1173k = true;
        z.w(this, new c(this));
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f1171i;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i2) {
        if (this.f1171i) {
            int[] iArr = f1170l;
            return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i2 + iArr.length), iArr);
        }
        return super.onCreateDrawableState(i2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f348f);
        setChecked(savedState.f1174h);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1174h = this.f1171i;
        return savedState;
    }

    public void setCheckable(boolean z) {
        if (this.f1172j != z) {
            this.f1172j = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f1172j || this.f1171i == z) {
            return;
        }
        this.f1171i = z;
        refreshDrawableState();
        sendAccessibilityEvent(RecyclerView.a0.FLAG_MOVED);
    }

    public void setPressable(boolean z) {
        this.f1173k = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f1173k) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f1171i);
    }
}
