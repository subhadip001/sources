package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class ActivityResult implements Parcelable {
    public static final Parcelable.Creator<ActivityResult> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final int f69f;

    /* renamed from: g  reason: collision with root package name */
    public final Intent f70g;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<ActivityResult> {
        @Override // android.os.Parcelable.Creator
        public ActivityResult createFromParcel(Parcel parcel) {
            return new ActivityResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ActivityResult[] newArray(int i2) {
            return new ActivityResult[i2];
        }
    }

    public ActivityResult(int i2, Intent intent) {
        this.f69f = i2;
        this.f70g = intent;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        String str;
        StringBuilder A = f.a.b.a.a.A("ActivityResult{resultCode=");
        int i2 = this.f69f;
        if (i2 != -1) {
            str = i2 != 0 ? String.valueOf(i2) : "RESULT_CANCELED";
        } else {
            str = "RESULT_OK";
        }
        A.append(str);
        A.append(", data=");
        A.append(this.f70g);
        A.append('}');
        return A.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f69f);
        parcel.writeInt(this.f70g == null ? 0 : 1);
        Intent intent = this.f70g;
        if (intent != null) {
            intent.writeToParcel(parcel, i2);
        }
    }

    public ActivityResult(Parcel parcel) {
        this.f69f = parcel.readInt();
        this.f70g = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
