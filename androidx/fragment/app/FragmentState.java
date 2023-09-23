package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final String f421f;

    /* renamed from: g  reason: collision with root package name */
    public final String f422g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f423h;

    /* renamed from: i  reason: collision with root package name */
    public final int f424i;

    /* renamed from: j  reason: collision with root package name */
    public final int f425j;

    /* renamed from: k  reason: collision with root package name */
    public final String f426k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f427l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f428m;
    public final boolean n;
    public final Bundle o;
    public final boolean p;
    public final int q;
    public Bundle r;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<FragmentState> {
        @Override // android.os.Parcelable.Creator
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public FragmentState[] newArray(int i2) {
            return new FragmentState[i2];
        }
    }

    public FragmentState(Fragment fragment) {
        this.f421f = fragment.getClass().getName();
        this.f422g = fragment.mWho;
        this.f423h = fragment.mFromLayout;
        this.f424i = fragment.mFragmentId;
        this.f425j = fragment.mContainerId;
        this.f426k = fragment.mTag;
        this.f427l = fragment.mRetainInstance;
        this.f428m = fragment.mRemoving;
        this.n = fragment.mDetached;
        this.o = fragment.mArguments;
        this.p = fragment.mHidden;
        this.q = fragment.mMaxState.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f421f);
        sb.append(" (");
        sb.append(this.f422g);
        sb.append(")}:");
        if (this.f423h) {
            sb.append(" fromLayout");
        }
        if (this.f425j != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f425j));
        }
        String str = this.f426k;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f426k);
        }
        if (this.f427l) {
            sb.append(" retainInstance");
        }
        if (this.f428m) {
            sb.append(" removing");
        }
        if (this.n) {
            sb.append(" detached");
        }
        if (this.p) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f421f);
        parcel.writeString(this.f422g);
        parcel.writeInt(this.f423h ? 1 : 0);
        parcel.writeInt(this.f424i);
        parcel.writeInt(this.f425j);
        parcel.writeString(this.f426k);
        parcel.writeInt(this.f427l ? 1 : 0);
        parcel.writeInt(this.f428m ? 1 : 0);
        parcel.writeInt(this.n ? 1 : 0);
        parcel.writeBundle(this.o);
        parcel.writeInt(this.p ? 1 : 0);
        parcel.writeBundle(this.r);
        parcel.writeInt(this.q);
    }

    public FragmentState(Parcel parcel) {
        this.f421f = parcel.readString();
        this.f422g = parcel.readString();
        this.f423h = parcel.readInt() != 0;
        this.f424i = parcel.readInt();
        this.f425j = parcel.readInt();
        this.f426k = parcel.readString();
        this.f427l = parcel.readInt() != 0;
        this.f428m = parcel.readInt() != 0;
        this.n = parcel.readInt() != 0;
        this.o = parcel.readBundle();
        this.p = parcel.readInt() != 0;
        this.r = parcel.readBundle();
        this.q = parcel.readInt();
    }
}
