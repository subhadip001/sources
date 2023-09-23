package f.n.a.s;

import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.video_converter.video_compressor.model.MediaFile;
import com.video_converter.video_compressor.model.ProcessingInfo;
import com.video_converter.video_compressor.services.BatchProcessingService;
import f.n.a.o.c;
import f.n.a.s.a;
import f.n.a.w.g;
import f.n.a.w.h;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: MediaInformationExtractor.java */
/* loaded from: classes2.dex */
public class c implements a.InterfaceC0181a {

    /* renamed from: f  reason: collision with root package name */
    public a f7076f;

    /* renamed from: g  reason: collision with root package name */
    public f.n.a.s.a f7077g;

    /* renamed from: h  reason: collision with root package name */
    public MediaFile f7078h;

    /* renamed from: i  reason: collision with root package name */
    public f.n.a.o.c f7079i;

    /* compiled from: MediaInformationExtractor.java */
    /* loaded from: classes2.dex */
    public interface a {
    }

    public c(f.n.a.s.a aVar) {
        this.f7077g = aVar;
    }

    @Override // f.n.a.s.a.InterfaceC0181a
    public void a() {
    }

    @Override // f.n.a.s.a.InterfaceC0181a
    public void b(long j2, long j3) {
    }

    public final int c(String str) {
        if (str != null) {
            return Integer.valueOf(str.split("x")[1]).intValue();
        }
        return 0;
    }

    public final int d(String str) {
        if (str != null) {
            return Integer.valueOf(str.split("x")[0]).intValue();
        }
        return 0;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x009d -> B:23:0x009e). Please submit an issue!!! */
    @Override // f.n.a.s.a.InterfaceC0181a
    public void e(boolean z, String str) {
        String str2;
        int i2;
        int d2;
        int c;
        int i3;
        long j2;
        double d3;
        Matcher matcher;
        Log.d("MediaInfoExtractor", "extractAndAssignInfo: " + str);
        int i4 = 0;
        if (str.contains("Video:")) {
            String[] split = str.substring(str.indexOf("Video: ") + 7).replaceAll(",", " ").split(" ");
            for (int i5 = 0; i5 < split.length; i5++) {
                if (split[i5].matches("\\d+x\\d+")) {
                    str2 = split[i5];
                    break;
                }
            }
        }
        str2 = null;
        try {
            matcher = Pattern.compile("rotate\\s*:\\s*-*\\s*(\\d+)").matcher(str);
        } catch (Exception e2) {
            Log.d("RotateExcept", "getRotationFromMessage: " + e2);
        }
        if (matcher.find()) {
            i2 = Integer.parseInt(matcher.group(1));
        } else {
            Matcher matcher2 = Pattern.compile(".*rotation of -?((\\d+).*) degrees").matcher(str);
            if (matcher2.find()) {
                i2 = Integer.parseInt(matcher2.group(2));
            }
            i2 = 0;
        }
        if (i2 != 0 && i2 != 180) {
            d2 = c(str2);
            c = d(str2);
        } else {
            d2 = d(str2);
            c = c(str2);
        }
        int i6 = c;
        int i7 = d2;
        c.a aVar = new c.a();
        aVar.f7045f = str;
        try {
            String[] split2 = str.substring(str.indexOf("Duration: ") + 10, str.indexOf(44, str.lastIndexOf("Duration: ") + 1)).split(":");
            if (split2.length < 3) {
                j2 = -1;
                i3 = i6;
            } else {
                int parseInt = Integer.parseInt(split2[0]);
                int parseInt2 = Integer.parseInt(split2[1]);
                String[] split3 = split2[2].split("\\.");
                i3 = i6;
                j2 = Integer.parseInt(split3[1]) + (parseInt * 3600000) + (parseInt2 * 60000) + (Integer.parseInt(split3[0]) * 1000);
            }
        } catch (Exception e3) {
            i3 = i6;
            e3.printStackTrace();
            j2 = 0;
        }
        aVar.f7052m = j2;
        aVar.f7046g = String.format(Locale.US, "%dx%d", Integer.valueOf(i7), Integer.valueOf(i3));
        aVar.f7049j = i3;
        aVar.f7048i = i7;
        Matcher matcher3 = Pattern.compile("(?<=Stream #)(\\d+:\\d+)[\\[0-9A-Za-z\\]]{0,15}(\\([a-zA-z]*\\))*\\s*:\\s*Audio:\\s*([a-zA-Z_0-9]+)").matcher(str);
        aVar.f7047h = matcher3.find() ? matcher3.group(3) : null;
        Matcher matcher4 = Pattern.compile("Audio:(.* )(\\d+)(\\s*kb\\/s)").matcher(str);
        double d4 = 192.0d;
        try {
            if (matcher4.find()) {
                d4 = Integer.parseInt(matcher4.group(2));
            }
        } catch (Exception unused) {
        }
        aVar.f7051l = d4;
        try {
            if (str.contains("bitrate:")) {
                Matcher matcher5 = Pattern.compile("(?<=bitrate:)(.*)(?=kb/s)").matcher(str);
                if (matcher5.find()) {
                    double parseInt3 = Integer.parseInt(matcher5.group().trim());
                    i4 = (int) (parseInt3 - (0.2d * parseInt3));
                }
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        aVar.f7050k = i4;
        aVar.n = str.contains("Audio:");
        aVar.o = str.contains("Video:");
        try {
            Matcher matcher6 = Pattern.compile("(?<=Stream #)(\\d+:\\d+)[\\[0-9A-Za-z\\]]{0,15}(\\([a-zA-z]*\\))*\\s*:\\s*Video:\\s*([a-zA-Z_0-9]+)((.*)((\\s+|,)(\\d+(.\\d+)*)\\s*fps\\s*))*").matcher(str);
            String str3 = "";
            while (matcher6.find()) {
                str3 = matcher6.group(8);
            }
            d3 = Double.parseDouble(str3);
        } catch (Exception unused2) {
            d3 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        aVar.p = d3;
        this.f7079i = new f.n.a.o.c(aVar);
    }

    @Override // f.n.a.s.a.InterfaceC0181a
    public void onFinish() {
        Log.d("BATCH_PROCESSING", "notifyFinish: mie");
        a aVar = this.f7076f;
        f.n.a.o.c cVar = this.f7079i;
        h hVar = (h) aVar;
        ProcessingInfo processingInfo = hVar.a.b;
        processingInfo.f1376g = cVar.f7047h;
        processingInfo.f1380k = cVar.f7045f;
        processingInfo.f1381l = cVar.f7052m;
        processingInfo.f1379j = cVar.f7046g;
        int i2 = processingInfo.B;
        if (i2 != 100 && i2 != 0) {
            processingInfo.n = BatchProcessingService.l(hVar.b, cVar.f7049j, i2);
            hVar.a.b.o = BatchProcessingService.l(hVar.b, cVar.f7048i, i2);
        } else {
            int i3 = processingInfo.n;
            if (i3 == 0 && processingInfo.o == 0) {
                processingInfo.n = cVar.f7049j;
                processingInfo.o = cVar.f7048i;
            } else if (i3 != 0 && processingInfo.o == 0) {
                int i4 = cVar.f7049j;
                int i5 = cVar.f7048i;
                if (i4 < i5) {
                    Objects.requireNonNull(hVar.b);
                    processingInfo.o = ((int) ((i3 / i4) * i5)) & (-2);
                } else {
                    processingInfo.o = i3;
                    Objects.requireNonNull(hVar.b);
                    processingInfo.n = ((int) ((i3 / i5) * i4)) & (-2);
                }
            }
        }
        int i6 = hVar.a.b.C;
        if (i6 != 100 && i6 != 0 && !BatchProcessingService.m(hVar.b)) {
            hVar.a.b.f1382m = BatchProcessingService.l(hVar.b, cVar.f7050k, i6);
        }
        int i7 = cVar.f7049j;
        int i8 = cVar.f7048i;
        if (i7 < i8) {
            ProcessingInfo processingInfo2 = hVar.a.b;
            processingInfo2.w = processingInfo2.n != i7;
        } else {
            ProcessingInfo processingInfo3 = hVar.a.b;
            processingInfo3.w = processingInfo3.o != i8;
        }
        Objects.requireNonNull(hVar.b);
        f.n.a.g.c a2 = f.n.a.h.d.b.c().a().a(hVar.a.b);
        BatchProcessingService batchProcessingService = hVar.b;
        batchProcessingService.f1408m = batchProcessingService.K;
        new Thread(new g(hVar, a2)).start();
    }
}
