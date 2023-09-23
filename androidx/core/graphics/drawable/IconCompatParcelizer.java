package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;
import java.nio.charset.Charset;
import java.util.Objects;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = versionedParcel.k(iconCompat.a, 1);
        byte[] bArr = iconCompat.c;
        if (versionedParcel.i(2)) {
            bArr = versionedParcel.g();
        }
        iconCompat.c = bArr;
        iconCompat.f331d = versionedParcel.m(iconCompat.f331d, 3);
        iconCompat.f332e = versionedParcel.k(iconCompat.f332e, 4);
        iconCompat.f333f = versionedParcel.k(iconCompat.f333f, 5);
        iconCompat.f334g = (ColorStateList) versionedParcel.m(iconCompat.f334g, 6);
        String str = iconCompat.f336i;
        if (versionedParcel.i(7)) {
            str = versionedParcel.n();
        }
        iconCompat.f336i = str;
        String str2 = iconCompat.f337j;
        if (versionedParcel.i(8)) {
            str2 = versionedParcel.n();
        }
        iconCompat.f337j = str2;
        iconCompat.f335h = PorterDuff.Mode.valueOf(iconCompat.f336i);
        switch (iconCompat.a) {
            case -1:
                Parcelable parcelable = iconCompat.f331d;
                if (parcelable != null) {
                    iconCompat.b = parcelable;
                    break;
                } else {
                    throw new IllegalArgumentException("Invalid icon");
                }
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f331d;
                if (parcelable2 != null) {
                    iconCompat.b = parcelable2;
                    break;
                } else {
                    byte[] bArr2 = iconCompat.c;
                    iconCompat.b = bArr2;
                    iconCompat.a = 3;
                    iconCompat.f332e = 0;
                    iconCompat.f333f = bArr2.length;
                    break;
                }
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.c, Charset.forName("UTF-16"));
                iconCompat.b = str3;
                if (iconCompat.a == 2 && iconCompat.f337j == null) {
                    iconCompat.f337j = str3.split(":", -1)[0];
                    break;
                }
                break;
            case 3:
                iconCompat.b = iconCompat.c;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        Objects.requireNonNull(versionedParcel);
        iconCompat.f336i = iconCompat.f335h.name();
        switch (iconCompat.a) {
            case -1:
                iconCompat.f331d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case 5:
                iconCompat.f331d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i2 = iconCompat.a;
        if (-1 != i2) {
            versionedParcel.p(1);
            versionedParcel.t(i2);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            versionedParcel.p(2);
            versionedParcel.r(bArr);
        }
        Parcelable parcelable = iconCompat.f331d;
        if (parcelable != null) {
            versionedParcel.p(3);
            versionedParcel.u(parcelable);
        }
        int i3 = iconCompat.f332e;
        if (i3 != 0) {
            versionedParcel.p(4);
            versionedParcel.t(i3);
        }
        int i4 = iconCompat.f333f;
        if (i4 != 0) {
            versionedParcel.p(5);
            versionedParcel.t(i4);
        }
        ColorStateList colorStateList = iconCompat.f334g;
        if (colorStateList != null) {
            versionedParcel.p(6);
            versionedParcel.u(colorStateList);
        }
        String str = iconCompat.f336i;
        if (str != null) {
            versionedParcel.p(7);
            versionedParcel.v(str);
        }
        String str2 = iconCompat.f337j;
        if (str2 != null) {
            versionedParcel.p(8);
            versionedParcel.v(str2);
        }
    }
}
