package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<FragmentState> f413f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<String> f414g;

    /* renamed from: h  reason: collision with root package name */
    public BackStackState[] f415h;

    /* renamed from: i  reason: collision with root package name */
    public int f416i;

    /* renamed from: j  reason: collision with root package name */
    public String f417j;

    /* renamed from: k  reason: collision with root package name */
    public ArrayList<String> f418k;

    /* renamed from: l  reason: collision with root package name */
    public ArrayList<Bundle> f419l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<FragmentManager.LaunchedFragmentInfo> f420m;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<FragmentManagerState> {
        @Override // android.os.Parcelable.Creator
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public FragmentManagerState[] newArray(int i2) {
            return new FragmentManagerState[i2];
        }
    }

    public FragmentManagerState() {
        this.f417j = null;
        this.f418k = new ArrayList<>();
        this.f419l = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedList(this.f413f);
        parcel.writeStringList(this.f414g);
        parcel.writeTypedArray(this.f415h, i2);
        parcel.writeInt(this.f416i);
        parcel.writeString(this.f417j);
        parcel.writeStringList(this.f418k);
        parcel.writeTypedList(this.f419l);
        parcel.writeTypedList(this.f420m);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f417j = null;
        this.f418k = new ArrayList<>();
        this.f419l = new ArrayList<>();
        this.f413f = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.f414g = parcel.createStringArrayList();
        this.f415h = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f416i = parcel.readInt();
        this.f417j = parcel.readString();
        this.f418k = parcel.createStringArrayList();
        this.f419l = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f420m = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
