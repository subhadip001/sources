package f.n.a.n;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.preference.PreferenceManager;
import android.util.Log;
import com.video_converter.video_compressor.R;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: LocaleHelper.java */
/* loaded from: classes2.dex */
public class f {
    public static String a;
    public static final String[] b = {"en", "es", "fa", "ar", "pt"};
    public static final String[] c = {"English", "Español", "فارسی", "عربى", "Português"};

    /* compiled from: LocaleHelper.java */
    /* loaded from: classes2.dex */
    public class a implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            f.a = f.b[i2];
        }
    }

    /* compiled from: LocaleHelper.java */
    /* loaded from: classes2.dex */
    public class b implements DialogInterface.OnClickListener {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Context f7036f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ c f7037g;

        public b(Context context, c cVar) {
            this.f7036f = context;
            this.f7037g = cVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            String str = f.a;
            if (str != null) {
                f.b(this.f7036f, str);
            }
            c cVar = this.f7037g;
            if (cVar != null) {
                cVar.a();
            }
        }
    }

    /* compiled from: LocaleHelper.java */
    /* loaded from: classes2.dex */
    public interface c {
        void a();
    }

    public static String a(Context context, String str) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("LOCALE", str);
    }

    public static void b(Context context, String str) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString("LOCALE", str);
        edit.apply();
        if (Build.VERSION.SDK_INT >= 24) {
            Locale locale = new Locale(str);
            Locale.setDefault(locale);
            Configuration configuration = context.getResources().getConfiguration();
            configuration.setLocale(locale);
            configuration.setLayoutDirection(locale);
            context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
        }
        Locale locale2 = new Locale(str);
        Locale.setDefault(locale2);
        Resources resources = context.getResources();
        Configuration configuration2 = resources.getConfiguration();
        configuration2.locale = locale2;
        configuration2.setLayoutDirection(locale2);
        resources.updateConfiguration(configuration2, resources.getDisplayMetrics());
    }

    public static void c(Context context, c cVar) {
        StringBuilder A = f.a.b.a.a.A("getpersistentdata : ");
        A.append(a(context, null));
        Log.d("LOCALE_HELPER", A.toString());
        String a2 = a(context, "en");
        a = a2;
        int indexOf = Arrays.asList(b).indexOf(a2);
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(context.getString(R.string.choose_language));
        builder.setCancelable(true);
        builder.setSingleChoiceItems(c, indexOf, new a());
        builder.setPositiveButton(R.string.ok, new b(context, cVar));
        builder.create().show();
    }
}
