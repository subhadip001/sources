package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final IntentSender f82f;

    /* renamed from: g  reason: collision with root package name */
    public final Intent f83g;

    /* renamed from: h  reason: collision with root package name */
    public final int f84h;

    /* renamed from: i  reason: collision with root package name */
    public final int f85i;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<IntentSenderRequest> {
        @Override // android.os.Parcelable.Creator
        public IntentSenderRequest createFromParcel(Parcel parcel) {
            return new IntentSenderRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public IntentSenderRequest[] newArray(int i2) {
            return new IntentSenderRequest[i2];
        }
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i2, int i3) {
        this.f82f = intentSender;
        this.f83g = intent;
        this.f84h = i2;
        this.f85i = i3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f82f, i2);
        parcel.writeParcelable(this.f83g, i2);
        parcel.writeInt(this.f84h);
        parcel.writeInt(this.f85i);
    }

    public IntentSenderRequest(Parcel parcel) {
        this.f82f = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f83g = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f84h = parcel.readInt();
        this.f85i = parcel.readInt();
    }
}
