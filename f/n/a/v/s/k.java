package f.n.a.v.s;

import android.net.Uri;
import android.widget.Toast;
import com.video_converter.video_compressor.model.MediaFile;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: VidCompInputScreenController.java */
/* loaded from: classes2.dex */
public class k implements f.n.a.v.f.a {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ j f7448f;

    public k(j jVar) {
        this.f7448f = jVar;
    }

    @Override // f.n.a.v.f.a
    public void f(List<MediaFile> list) {
        List<f.n.a.m.c.a> list2;
        e.p.c.n nVar = this.f7448f.o;
        StringBuilder A = f.a.b.a.a.A("Submitted List");
        A.append(list.size());
        Toast.makeText(nVar, A.toString(), 1).show();
        for (MediaFile mediaFile : list) {
            j jVar = this.f7448f;
            String valueOf = String.valueOf(mediaFile.f1372j);
            String str = mediaFile.f1371i;
            int i2 = 0;
            for (MediaFile mediaFile2 : jVar.n) {
                Uri uri = mediaFile2.f1372j;
                if (uri != null && String.valueOf(uri).equalsIgnoreCase(valueOf) && (list2 = jVar.B) != null && list2.size() < i2) {
                    long j2 = -1;
                    try {
                        Matcher matcher = Pattern.compile("(?<=Duration:).* (\\d+:\\d+:\\d+.\\d*)").matcher(str);
                        if (matcher.find()) {
                            String group = matcher.group(1);
                            String[] split = (group.contains(".") ? group.replace('.', ':') : group + ":00").split(":");
                            j2 = Integer.parseInt(split[3]) + (Integer.parseInt(split[2]) * 1000) + (Integer.parseInt(split[1]) * 60000) + (Integer.parseInt(split[0]) * 3600000);
                        }
                    } catch (Exception unused) {
                    }
                    jVar.B.get(i2).t = j2;
                }
                i2++;
            }
        }
    }
}
