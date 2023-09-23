package f.n.a.m.c;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: MediaInformationParser.java */
/* loaded from: classes2.dex */
public class d {
    public static ArrayList<f.n.a.m.d.b> a(String str, String str2) {
        String q = f.a.b.a.a.q("(?<=Stream #)(\\d+:\\d+)[\\[0-9A-Za-z\\]]{0,15}(\\([a-zA-z]*\\))*\\s*:\\s*", str, ":\\s*([a-zA-Z_0-9]+)");
        ArrayList<f.n.a.m.d.b> arrayList = new ArrayList<>();
        Matcher matcher = Pattern.compile(q).matcher(str2);
        while (matcher.find()) {
            try {
                f.n.a.m.d.b bVar = new f.n.a.m.d.b(matcher.group(1), str, matcher.group(3));
                if (matcher.group(2) != null) {
                    matcher.group(2);
                }
                arrayList.add(bVar);
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }
}
