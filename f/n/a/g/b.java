package f.n.a.g;

import android.util.Log;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture;
import com.video_converter.video_compressor.constants.Codec;
import com.video_converter.video_compressor.constants.CompressionProfile;
import com.video_converter.video_compressor.constants.FileFormat;
import com.video_converter.video_compressor.constants.Preset;
import com.video_converter.video_compressor.constants.TwoPass;
import com.video_converter.video_compressor.constants.VideoQuality;
import com.video_converter.video_compressor.model.ProcessingInfo;
import f.n.a.o.h;
import java.util.Locale;

/* compiled from: CommandHelper.java */
/* loaded from: classes2.dex */
public class b {
    public ProcessingInfo a;

    public b(ProcessingInfo processingInfo) {
        this.a = processingInfo;
    }

    public long a() {
        return this.a.j();
    }

    public String b() {
        if (this.a.a() != null) {
            for (h hVar : this.a.a()) {
                if (hVar.f7062j) {
                    if (hVar.f7059g.equals("audio_channel_mono")) {
                        return "1";
                    }
                    if (hVar.f7059g.equals("audio_channel_stereo")) {
                        return "2";
                    }
                    if (hVar.f7059g.equals("audio_channel_2_1")) {
                        return "3";
                    }
                    if (hVar.f7059g.equals("audio_channel_5_1")) {
                        return "6";
                    }
                    if (hVar.f7059g.equals("audio_channel_7_1")) {
                        return "8";
                    }
                }
            }
            return "";
        }
        return "";
    }

    public CompressionProfile c() {
        ProcessingInfo processingInfo = this.a;
        if (processingInfo.H == null) {
            if (processingInfo.v) {
                processingInfo.H = CompressionProfile.HIGH_QUALITY_FILE;
            } else {
                processingInfo.H = CompressionProfile.LOSSY_COMPRESSION;
            }
        }
        return processingInfo.H;
    }

    public String d(String str) {
        if (f.l.b.c.m(str) == Codec.LIBX265) {
            int ordinal = this.a.H.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3 || ordinal == 4 || ordinal == 5) {
                            return "29";
                        }
                        if (ordinal != 9) {
                            if (ordinal != 10) {
                                return CrashlyticsReportDataCapture.SIGNAL_DEFAULT;
                            }
                            VideoQuality videoQuality = this.a.K;
                            return videoQuality == VideoQuality.HIGH ? "30" : videoQuality == VideoQuality.MEDIUM ? "33" : "36";
                        }
                        return "31";
                    }
                    return "30";
                }
                return "33";
            }
            return "35";
        }
        int ordinal2 = this.a.H.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                if (ordinal2 != 2) {
                    if (ordinal2 == 3 || ordinal2 == 4 || ordinal2 == 5) {
                        return "24";
                    }
                    if (ordinal2 != 9) {
                        if (ordinal2 != 10) {
                            return CrashlyticsReportDataCapture.SIGNAL_DEFAULT;
                        }
                        VideoQuality videoQuality2 = this.a.K;
                        return videoQuality2 == VideoQuality.HIGH ? "25" : videoQuality2 == VideoQuality.MEDIUM ? "28" : "30";
                    }
                    return "26";
                }
                return "25";
            }
            return "28";
        }
        return "30";
    }

    public String e() {
        switch (this.a.q.ordinal()) {
            case 0:
                return "3gp";
            case 1:
                return "avi";
            case 2:
                return "flv";
            case 3:
                return "webm";
            case 4:
                return "mp4";
            case 5:
            case 12:
                return "mpeg2video";
            case 6:
                return "mov";
            case 7:
            case 8:
            case 9:
                return "mpegts";
            case 10:
                return "matroska";
            case 11:
                return "m4v";
            case 13:
                return "wmv2";
            case 14:
                return "vob";
            default:
                return "";
        }
    }

    public String f() {
        try {
            String str = this.a.f1380k;
            if (str.contains("Video:")) {
                String[] split = str.substring(str.indexOf("Video: ") + 7).replaceAll(",", " ").split(" ");
                for (int i2 = 0; i2 < split.length; i2++) {
                    if (split[i2].matches("\\d+x\\d+")) {
                        String[] split2 = split[i2].split("x");
                        int parseInt = Integer.parseInt(split2[0]);
                        int parseInt2 = Integer.parseInt(split2[1]);
                        if (parseInt % 2 == 0 && parseInt2 % 2 == 0) {
                            return "";
                        }
                        return String.format(Locale.US, "pad='width=%s:height=%s'", Integer.valueOf(parseInt + (parseInt % 2 == 0 ? 2 : 3)), Integer.valueOf(parseInt2 + (parseInt2 % 2 == 0 ? 2 : 3)));
                    }
                }
                return "pad='width=(ceil(iw/2)+1)*2:height=(ceil(ih/2)+1)*2'";
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public String g() {
        TwoPass twoPass = this.a.t;
        if (twoPass == null) {
            return "null";
        }
        int ordinal = twoPass.ordinal();
        return ordinal != 0 ? ordinal != 1 ? "null" : "2" : "1";
    }

    public ProcessingInfo.PROCESS_MODE h() {
        ProcessingInfo processingInfo = this.a;
        return processingInfo == null ? ProcessingInfo.PROCESS_MODE.TRIM : processingInfo.g();
    }

    public String i() {
        Preset preset = this.a.s;
        if (preset == null || preset == Preset.NORMAL) {
            return null;
        }
        return preset.getPreset();
    }

    public float j() {
        ProcessingInfo processingInfo = this.a;
        if (processingInfo == null) {
            return 0.0f;
        }
        return processingInfo.L;
    }

    public String k() {
        FileFormat fileFormat;
        ProcessingInfo processingInfo = this.a;
        if (processingInfo == null || (fileFormat = processingInfo.q) == null) {
            return null;
        }
        int ordinal = fileFormat.ordinal();
        return (ordinal == 0 || ordinal == 4 || ordinal == 6 || ordinal == 11 || ordinal == 15) ? "mov_text" : "srt";
    }

    public String l() {
        ProcessingInfo processingInfo = this.a;
        String str = processingInfo.f1375f;
        if (str == null) {
            return null;
        }
        if (str.contains(".")) {
            String str2 = processingInfo.f1375f;
            processingInfo.f1375f = str2.substring(0, str2.indexOf("."));
        }
        try {
            Log.d("TAG", "getAudioBitrate: " + processingInfo.f1375f);
            if (Integer.parseInt(processingInfo.f1375f) < 1) {
                return null;
            }
            return processingInfo.f1375f;
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean m() {
        switch (this.a.q.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
            case 14:
                return true;
            case 11:
            default:
                return false;
        }
    }

    public boolean n() {
        ProcessingInfo processingInfo = this.a;
        return (processingInfo == null || processingInfo.M == 100.0f) ? false : true;
    }

    public boolean o() {
        ProcessingInfo processingInfo = this.a;
        if (processingInfo == null) {
            return false;
        }
        if (processingInfo.H == CompressionProfile.FIXED_SIZE_COMPRESSION && g().equalsIgnoreCase("1")) {
            return true;
        }
        return this.a.I;
    }

    public boolean p() {
        ProcessingInfo processingInfo = this.a;
        return (processingInfo == null || processingInfo.L == 0.0f) ? false : true;
    }

    public boolean q() {
        return n() || p();
    }
}
