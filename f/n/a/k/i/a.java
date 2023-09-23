package f.n.a.k.i;

import android.text.InputFilter;
import android.text.Spanned;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* compiled from: CustomRangeInputFilter.java */
/* loaded from: classes2.dex */
public class a implements InputFilter {
    public double a;

    public a(double d2, double d3) {
        this.a = d3;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        try {
            StringBuilder sb = new StringBuilder();
            boolean z = false;
            sb.append(spanned.toString().substring(0, i4));
            sb.append(spanned.toString().substring(i5, spanned.toString().length()));
            String sb2 = sb.toString();
            double parseDouble = Double.parseDouble(sb2.substring(0, i4) + charSequence.toString() + sb2.substring(i4, sb2.length()));
            double d2 = this.a;
            if (d2 <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? !(parseDouble < d2 || parseDouble > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) : !(parseDouble < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || parseDouble > d2)) {
                z = true;
            }
            if (z) {
                return null;
            }
            return "";
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
            return "";
        }
    }
}
