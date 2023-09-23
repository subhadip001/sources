package f.h.b.d.a.e;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class a0 {
    public static final /* synthetic */ int a = 0;

    static {
        a0.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
