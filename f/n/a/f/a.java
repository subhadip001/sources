package f.n.a.f;

import android.os.Build;
import com.google.firebase.database.FirebaseDatabase;
import com.video_converter.video_compressor.bugreport.BugReport;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: BugReporter.java */
/* loaded from: classes2.dex */
public class a {
    public static a a;
    public static BugReport b;

    public static a c() {
        if (a == null) {
            a = new a();
        }
        return a;
    }

    public final String a(String str) {
        if (str.length() == 0) {
            return "";
        }
        char charAt = str.charAt(0);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        return Character.toUpperCase(charAt) + str.substring(1);
    }

    public BugReport b() {
        if (b == null) {
            b = new BugReport();
        }
        return b;
    }

    public final String d(String str) {
        try {
            Matcher matcher = Pattern.compile("(\\/.*?)\\.([A-Za-z0-9]{3})", 2).matcher(str);
            matcher.find();
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            return str.replaceAll(group, "____." + group2);
        } catch (Exception unused) {
            return str;
        }
    }

    public void e() {
        String str;
        BugReport b2 = b();
        Calendar calendar = Calendar.getInstance();
        Locale locale = Locale.US;
        b2.setTime(new SimpleDateFormat("EEEE, dd-MMM-yyyy hh-mm-ss a", locale).format(calendar.getTime()));
        BugReport b3 = b();
        String str2 = Build.MANUFACTURER;
        String str3 = Build.MODEL;
        if (str3 == null || str2 == null) {
            str = "unknown";
        } else if (str3.toLowerCase().startsWith(str2.toLowerCase())) {
            str = a(str3);
        } else {
            str = a(str2) + " " + str3;
        }
        b3.setDeviceModel(str);
        FirebaseDatabase.getInstance().getReference("production").child("bug_report").child(String.format(locale, "V%d", 265)).child(new SimpleDateFormat("dd-MMM-yyyy", locale).format(Calendar.getInstance().getTime())).push().setValue(b());
        b = null;
    }
}
