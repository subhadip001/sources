package m.b.a.j;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import f.h.f.j;
import i.l.b.i;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import org.inverseai.cross_promo.helpers.CrossPromoType;
import org.inverseai.cross_promo.model.CrossPromoProduct;

/* compiled from: Utils.kt */
/* loaded from: classes2.dex */
public final class f {
    public static ArrayList<CrossPromoProduct> a;

    /* compiled from: Utils.kt */
    /* loaded from: classes2.dex */
    public static final class a extends f.h.f.a0.a<Collection<? extends CrossPromoProduct>> {
    }

    public static final ArrayList<CrossPromoProduct> a(Context context) {
        String str;
        i.e(context, "context");
        ArrayList<CrossPromoProduct> arrayList = a;
        if (arrayList == null) {
            try {
                InputStream open = context.getAssets().open("cross_data.json");
                i.d(open, "context.assets.open(filePath)");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, StandardCharsets.UTF_8));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                }
                str = sb.toString();
                i.d(str, "builder.toString()");
                bufferedReader.close();
            } catch (IOException e2) {
                e2.printStackTrace();
                str = null;
            }
            if (str == null) {
                return new ArrayList<>();
            }
            j jVar = new j();
            Type type = new a().b;
            i.d(type, "object : TypeToken<Collection<CrossPromoProduct?>?>() {}.getType()");
            ArrayList<CrossPromoProduct> arrayList2 = (ArrayList) jVar.d(str, type);
            a = new ArrayList<>();
            i.d(arrayList2, "products");
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                CrossPromoProduct crossPromoProduct = (CrossPromoProduct) it.next();
                if (!context.getPackageName().equals(crossPromoProduct.getPkg_name())) {
                    String pkg_name = crossPromoProduct.getPkg_name();
                    PackageManager packageManager = context.getPackageManager();
                    i.d(packageManager, "context.packageManager");
                    i.e(pkg_name, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
                    i.e(packageManager, "packageManager");
                    try {
                        packageManager.getPackageInfo(pkg_name, 0);
                    } catch (PackageManager.NameNotFoundException unused) {
                        r3 = false;
                    }
                    if (!r3) {
                        int priority = crossPromoProduct.getPriority();
                        for (int i2 = 0; i2 < priority; i2++) {
                            ArrayList<CrossPromoProduct> arrayList3 = a;
                            if (arrayList3 != null) {
                                arrayList3.add(crossPromoProduct);
                            }
                        }
                    }
                }
            }
            ArrayList<CrossPromoProduct> arrayList4 = a;
            if (arrayList4 != null && arrayList4.size() == 0) {
                if (!(arrayList2.size() == 0)) {
                    for (CrossPromoProduct crossPromoProduct2 : arrayList2) {
                        if (!context.getPackageName().equals(crossPromoProduct2.getPkg_name())) {
                            int priority2 = crossPromoProduct2.getPriority();
                            for (int i3 = 0; i3 < priority2; i3++) {
                                ArrayList<CrossPromoProduct> arrayList5 = a;
                                if (arrayList5 != null) {
                                    arrayList5.add(crossPromoProduct2);
                                }
                            }
                        }
                    }
                }
            }
            ArrayList<CrossPromoProduct> arrayList6 = a;
            return arrayList6 == null ? new ArrayList<>() : arrayList6;
        }
        return arrayList;
    }

    public static final String b(String str) {
        int ordinal = CrossPromoType.valueOf(str).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return "rewarded_";
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return "interstitial_";
            }
            return "native_";
        }
        return "banner_";
    }

    public static final boolean c(Context context) {
        i.e(context, "context");
        return a(context).size() > 0;
    }
}
