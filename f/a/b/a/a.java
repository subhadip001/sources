package f.a.b.a;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.Format;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.measurement.internal.zzfr;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.proto.AtProtobuf;
import java.util.HashMap;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: outline */
/* loaded from: classes.dex */
public class a {
    public static StringBuilder A(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder B(String str, int i2, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder C(String str, int i2, String str2, int i3, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i3);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder D(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder E(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder F(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static void G(int i2, String str, int i3, String str2) {
        StringBuilder sb = new StringBuilder(i2);
        sb.append(str);
        sb.append(i3);
        Log.w(str2, sb.toString());
    }

    public static void H(int i2, HashMap hashMap, String str, int i3, String str2, int i4, String str3, int i5, String str4) {
        hashMap.put(str, Integer.valueOf(i2));
        hashMap.put(str2, Integer.valueOf(i3));
        hashMap.put(str3, Integer.valueOf(i4));
        hashMap.put(str4, Integer.valueOf(i5));
    }

    public static int I(String str, int i2, int i3) {
        return (str.hashCode() + i2) * i3;
    }

    public static void J(zzfr zzfrVar, String str) {
        zzfrVar.zzay().zzd().zza(str);
    }

    public static void K(zzfr zzfrVar, String str) {
        zzfrVar.zzay().zzj().zza(str);
    }

    public static void L(zzfr zzfrVar, String str) {
        zzfrVar.zzay().zzk().zza(str);
    }

    public static void M(FirebaseAnalytics firebaseAnalytics, String str) {
        firebaseAnalytics.logEvent(str, new Bundle());
    }

    public static void N(String str, int i2, String str2) {
        Log.d(str2, str + i2);
    }

    public static void O(String str, int i2, String str2) {
        Log.w(str2, str + i2);
    }

    public static void P(StringBuilder sb, int i2, String str, int i3, String str2) {
        sb.append(i2);
        sb.append(str);
        sb.append(i3);
        sb.append(str2);
    }

    public static void Q(StringBuilder sb, String str, long j2, String str2) {
        sb.append(str);
        sb.append(j2);
        sb.append(str2);
    }

    public static void R(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static Bundle S(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        return bundle;
    }

    public static View T(ViewGroup viewGroup, int i2, ViewGroup viewGroup2, boolean z) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i2, viewGroup2, z);
    }

    public static Format.b U(int i2) {
        Format.b bVar = new Format.b();
        bVar.b(i2);
        return bVar;
    }

    public static IObjectWrapper V(Parcel parcel) {
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        parcel.recycle();
        return asInterface;
    }

    public static FieldDescriptor W(int i2, FieldDescriptor.Builder builder) {
        return builder.withProperty(AtProtobuf.builder().tag(i2).build()).build();
    }

    public static float a(float f2, float f3, float f4, float f5) {
        return ((f2 - f3) * f4) + f5;
    }

    public static float b(float f2, float f3, float f4, float f5) {
        return ((f2 - f3) / f4) + f5;
    }

    public static Object c(zzbl zzblVar, int i2, List list, int i3) {
        zzh.zzh(zzblVar.name(), i2, list);
        return list.get(i3);
    }

    public static String d(int i2, String str, int i3) {
        StringBuilder sb = new StringBuilder(i2);
        sb.append(str);
        sb.append(i3);
        return sb.toString();
    }

    public static String e(int i2, String str, int i3, String str2, int i4) {
        StringBuilder sb = new StringBuilder(i2);
        sb.append(str);
        sb.append(i3);
        sb.append(str2);
        sb.append(i4);
        return sb.toString();
    }

    public static String f(int i2, String str, long j2, String str2) {
        StringBuilder sb = new StringBuilder(i2);
        sb.append(str);
        sb.append(j2);
        sb.append(str2);
        return sb.toString();
    }

    public static String g(int i2, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(i2);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String h(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.A());
        return sb.toString();
    }

    public static String i(String str, int i2) {
        return str + i2;
    }

    public static String j(String str, int i2, String str2) {
        return str + i2 + str2;
    }

    public static String k(String str, int i2, String str2, int i3) {
        return str + i2 + str2 + i3;
    }

    public static String l(String str, long j2) {
        return str + j2;
    }

    public static int m(int i2, int i3, int i4, int i5) {
        return ((i2 * i3) / i4) + i5;
    }

    public static String n(String str, Uri uri) {
        return str + uri;
    }

    public static String o(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String p(String str, String str2) {
        return str + str2;
    }

    public static String q(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String r(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String s(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String t(StringBuilder sb, int i2, String str) {
        sb.append(i2);
        sb.append(str);
        return sb.toString();
    }

    public static String u(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String v(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String w(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static int x(String str, int i2) {
        return String.valueOf(str).length() + i2;
    }

    public static String y(XmlPullParser xmlPullParser, StringBuilder sb, String str) {
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder z(int i2, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(i2);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }
}
