package e.b.c;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;

/* compiled from: TwilightManager.java */
/* loaded from: classes.dex */
public class x {

    /* renamed from: d  reason: collision with root package name */
    public static x f1529d;
    public final Context a;
    public final LocationManager b;
    public final a c = new a();

    /* compiled from: TwilightManager.java */
    /* loaded from: classes.dex */
    public static class a {
        public boolean a;
        public long b;
    }

    public x(Context context, LocationManager locationManager) {
        this.a = context;
        this.b = locationManager;
    }

    public final Location a(String str) {
        try {
            if (this.b.isProviderEnabled(str)) {
                return this.b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e2) {
            Log.d("TwilightManager", "Failed to get last known location", e2);
            return null;
        }
    }
}
