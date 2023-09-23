package f.h.b.d.a.b;

import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class z2 {
    public static final Pattern a = Pattern.compile("[0-9]+-(NAM|LFH)\\.dat");

    public static List a(File file, File file2) {
        File[] fileArr;
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file2.listFiles(new FilenameFilter() { // from class: f.h.b.d.a.b.y2
            @Override // java.io.FilenameFilter
            public final boolean accept(File file3, String str) {
                return z2.a.matcher(str).matches();
            }
        });
        if (listFiles == null) {
            fileArr = new File[0];
        } else {
            File[] fileArr2 = new File[listFiles.length];
            for (File file3 : listFiles) {
                int parseInt = Integer.parseInt(file3.getName().split("-")[0]);
                if (parseInt <= listFiles.length && fileArr2[parseInt] == null) {
                    fileArr2[parseInt] = file3;
                } else {
                    throw new y0("Metadata folder ordering corrupt.");
                }
            }
            fileArr = fileArr2;
        }
        for (File file4 : fileArr) {
            arrayList.add(file4);
            if (file4.getName().contains("LFH")) {
                FileInputStream fileInputStream = new FileInputStream(file4);
                try {
                    d3 a2 = new m0(fileInputStream).a();
                    if (((j0) a2).a != null) {
                        File file5 = new File(file, ((j0) a2).a);
                        if (file5.exists()) {
                            arrayList.add(file5);
                            fileInputStream.close();
                        } else {
                            throw new y0(String.format("Missing asset file %s during slice reconstruction.", file5.getCanonicalPath()));
                        }
                    } else {
                        throw new y0("Metadata files corrupt. Could not read local file header.");
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            }
        }
        return arrayList;
    }
}
