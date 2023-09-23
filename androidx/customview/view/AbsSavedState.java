package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class AbsSavedState implements Parcelable {

    /* renamed from: f  reason: collision with root package name */
    public final Parcelable f348f;

    /* renamed from: g  reason: collision with root package name */
    public static final AbsSavedState f347g = new AbsSavedState() { // from class: androidx.customview.view.AbsSavedState.1
    };
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new a();

    public AbsSavedState(AnonymousClass1 anonymousClass1) {
        this.f348f = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f348f, i2);
    }

    /* loaded from: classes.dex */
    public class a implements Parcelable.ClassLoaderCreator<AbsSavedState> {
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable(null) == null) {
                return AbsSavedState.f347g;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i2) {
            return new AbsSavedState[i2];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.f347g;
            }
            throw new IllegalStateException("superState must be null");
        }
    }

    public AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.f348f = parcelable == f347g ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f348f = readParcelable == null ? f347g : readParcelable;
    }
}
