package com.video_converter.video_compressor.model;

import android.util.Log;
import com.arthenica.ffmpegkit.MediaInformation;
import com.arthenica.ffmpegkit.StreamInformation;
import com.video_converter.video_compressor.constants.Codec;
import com.video_converter.video_compressor.constants.CompressionProfile;
import com.video_converter.video_compressor.constants.FileFormat;
import com.video_converter.video_compressor.constants.Preset;
import com.video_converter.video_compressor.constants.TwoPass;
import com.video_converter.video_compressor.constants.VideoQuality;
import com.video_converter.video_compressor.processorFactory.ProcessStatus;
import f.l.b.c;
import f.n.a.o.h;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public class ProcessingInfo implements Serializable {
    @f.h.f.y.b("outputMessage")
    public String A;
    @f.h.f.y.b("resolutionPercentage")
    public int B;
    @f.h.f.y.b("bitratePercentage")
    public int C;
    @f.h.f.y.b("inputFileSize")
    public String D;
    @f.h.f.y.b("outputFileSize")
    public String E;
    @f.h.f.y.b("compressionPercentage")
    public int F;
    @f.h.f.y.b("processRetryCount")
    public int G;
    @f.h.f.y.b("compressionProfile")
    public CompressionProfile H;
    @f.h.f.y.b("deleteAudio")
    public boolean I;
    @f.h.f.y.b("frameRate")
    public double J;
    @f.h.f.y.b("videoQuality")
    public VideoQuality K;
    @f.h.f.y.b("startOffset")
    public float L;
    @f.h.f.y.b("endOffset")
    public float M;
    @f.h.f.y.b("fileSize")
    private long N;
    @f.h.f.y.b("validDur")
    private long O;
    @f.h.f.y.b("isRetrying")
    private boolean P;
    @f.h.f.y.b("commandE")
    private String Q;
    @f.h.f.y.b("needAvParser")
    private boolean R;
    @f.h.f.y.b("hqAudio")
    private boolean S;
    @f.h.f.y.b("inputFileOriginalUri")
    public String T;
    @f.h.f.y.b("originalFileSize")
    public long U;
    @f.h.f.y.b("inputFileName")
    public String V;
    @f.h.f.y.b("originalDeleted")
    public int W;
    @f.h.f.y.b("mode")
    public PROCESS_MODE X;
    @f.h.f.y.b("currentStatus")
    public PROCESS_STATUS Y;
    @f.h.f.y.b("tempOutputfilePath")
    public String Z;
    @f.h.f.y.b("extension")
    public String a0;
    @f.h.f.y.b("textOutputFilePath")
    public String b0;
    @f.h.f.y.b("originalName")
    private boolean c0;
    @f.h.f.y.b("deleteSubtitle")
    private boolean d0;
    @f.h.f.y.b("audioStreams")
    private List<h> e0;
    @f.h.f.y.b("audioBitrate")

    /* renamed from: f  reason: collision with root package name */
    public String f1375f;
    @f.h.f.y.b("subtitleStreams")
    private List<h> f0;
    @f.h.f.y.b("inputAudioCodec")

    /* renamed from: g  reason: collision with root package name */
    public String f1376g;
    @f.h.f.y.b("audioChannels")
    private List<h> g0;
    @f.h.f.y.b("inputFilePath")

    /* renamed from: h  reason: collision with root package name */
    public String f1377h;
    public boolean h0;
    @f.h.f.y.b("outputFilePath")

    /* renamed from: i  reason: collision with root package name */
    public String f1378i;
    @f.h.f.y.b("resolution")

    /* renamed from: j  reason: collision with root package name */
    public String f1379j;
    @f.h.f.y.b("ffInfoMessage")

    /* renamed from: k  reason: collision with root package name */
    public String f1380k;
    @f.h.f.y.b(MediaInformation.KEY_DURATION)

    /* renamed from: l  reason: collision with root package name */
    public long f1381l;
    @f.h.f.y.b("bitrate")

    /* renamed from: m  reason: collision with root package name */
    public int f1382m;
    @f.h.f.y.b(StreamInformation.KEY_HEIGHT)
    public int n;
    @f.h.f.y.b(StreamInformation.KEY_WIDTH)
    public int o;
    @f.h.f.y.b("inputFormat")
    public FileFormat p;
    @f.h.f.y.b("outputFormat")
    public FileFormat q;
    @f.h.f.y.b("Codec")
    public Codec r;
    @f.h.f.y.b("Preset")
    public Preset s;
    @f.h.f.y.b("pass")
    public TwoPass t;
    @f.h.f.y.b(MediaInformation.KEY_SIZE)
    public String u;
    @f.h.f.y.b("highQualityEnabled")
    public boolean v;
    @f.h.f.y.b("resolutionChanged")
    public boolean w;
    @f.h.f.y.b("canChangeResinFix")
    public boolean x;
    @f.h.f.y.b("formatChanged")
    public boolean y;
    @f.h.f.y.b("processStatus")
    public ProcessStatus z;

    /* loaded from: classes2.dex */
    public enum PROCESS_MODE {
        CUT,
        TRIM
    }

    /* loaded from: classes2.dex */
    public enum PROCESS_STATUS {
        FIRST_PROCESS,
        SECOND_PROCESS,
        MERGE_PROCESS,
        SUCCESS,
        NOT_RUNNING
    }

    /* loaded from: classes2.dex */
    public static class b extends ProcessingInfo {
        public b() {
            super(null);
        }

        public ProcessingInfo v() {
            return new ProcessingInfo(this, null);
        }
    }

    public ProcessingInfo() {
        this.x = false;
        this.O = -1L;
        this.P = false;
        this.Q = null;
        this.R = false;
        this.W = 0;
        this.X = PROCESS_MODE.TRIM;
        this.Y = PROCESS_STATUS.FIRST_PROCESS;
        this.Z = "";
        this.a0 = "";
        this.b0 = "";
        this.h0 = false;
    }

    public List<h> a() {
        return this.g0;
    }

    public List<h> b() {
        return this.e0;
    }

    public String c() {
        return this.Q;
    }

    public String d() {
        String str = this.V;
        if (str == null) {
            StringBuilder A = f.a.b.a.a.A("unknown_video");
            A.append(this.q);
            return A.toString();
        }
        return str;
    }

    public String e() {
        StringBuilder A = f.a.b.a.a.A("getOutputFileName: ");
        A.append(this.f1378i.lastIndexOf(47));
        Log.d("TAGTAG", A.toString());
        String str = this.f1378i;
        return str.substring(str.lastIndexOf(47) + 1).trim();
    }

    public String f() {
        return String.format("%dx%d", Integer.valueOf(this.o), Integer.valueOf(this.n));
    }

    public PROCESS_MODE g() {
        PROCESS_MODE process_mode = this.X;
        return process_mode == null ? PROCESS_MODE.TRIM : process_mode;
    }

    public List<h> h() {
        return this.f0;
    }

    public long i() {
        long j2 = this.O;
        if (j2 != -1) {
            return j2;
        }
        if (g() == PROCESS_MODE.TRIM) {
            long j3 = this.N;
            float f2 = this.L;
            double d2 = j3 * 1.0d;
            this.O = ((long) (d2 * (this.M / 100.0f))) - ((long) ((f2 / 100.0f) * d2));
        } else {
            this.O = c.d(this.N, this.L, this.M);
        }
        Log.d("TAG", "getValidDuration: d");
        return this.O;
    }

    public long j() {
        return this.N;
    }

    public boolean k() {
        return this.S;
    }

    public boolean l() {
        return this.P;
    }

    public void m(List<h> list) {
        this.g0 = list;
    }

    public void n(List<h> list) {
        this.e0 = list;
    }

    public void o(String str) {
        this.Q = str;
    }

    public void p(boolean z) {
        this.d0 = z;
    }

    public void q(boolean z) {
        this.S = z;
    }

    public void r(boolean z) {
        this.R = z;
    }

    public void s(boolean z) {
        this.P = z;
    }

    public void t(List<h> list) {
        this.f0 = list;
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("ProcessingInfo{inputFilePath='");
        A.append(this.f1377h);
        A.append('\'');
        A.append(", outputFilePath='");
        A.append(this.f1378i);
        A.append('\'');
        A.append(", resolution='");
        A.append(this.f1379j);
        A.append('\'');
        A.append(", duration=");
        A.append(this.f1381l);
        A.append(", bitrate=");
        A.append(this.f1382m);
        A.append(", height=");
        A.append(this.n);
        A.append(", width=");
        A.append(this.o);
        A.append(", inputFormat=");
        A.append(this.p);
        A.append(", outputFormat=");
        A.append(this.q);
        A.append(", highQualityEnabled=");
        A.append(this.v);
        A.append(", resolutionChanged=");
        A.append(this.w);
        A.append(", formatChanged=");
        A.append(this.y);
        A.append('}');
        return A.toString();
    }

    public void u(long j2) {
        this.N = j2;
    }

    public ProcessingInfo(a aVar) {
        this.x = false;
        this.O = -1L;
        this.P = false;
        this.Q = null;
        this.R = false;
        this.W = 0;
        this.X = PROCESS_MODE.TRIM;
        this.Y = PROCESS_STATUS.FIRST_PROCESS;
        this.Z = "";
        this.a0 = "";
        this.b0 = "";
        this.h0 = false;
    }

    public ProcessingInfo(b bVar, a aVar) {
        this.x = false;
        this.O = -1L;
        this.P = false;
        this.Q = null;
        this.R = false;
        this.W = 0;
        this.X = PROCESS_MODE.TRIM;
        this.Y = PROCESS_STATUS.FIRST_PROCESS;
        this.Z = "";
        this.a0 = "";
        this.b0 = "";
        this.h0 = false;
        this.f1377h = bVar.f1377h;
        this.f1378i = bVar.f1378i;
        this.f1379j = bVar.f1379j;
        this.f1380k = bVar.f1380k;
        this.f1381l = bVar.f1381l;
        this.f1382m = bVar.f1382m;
        this.n = bVar.n;
        this.o = bVar.o;
        this.p = bVar.p;
        this.q = bVar.q;
        this.v = bVar.v;
        this.w = bVar.w;
        this.y = bVar.y;
        this.z = bVar.z;
        this.B = bVar.B;
        this.C = bVar.C;
        this.H = bVar.H;
        this.I = bVar.I;
        this.J = bVar.J;
        this.K = bVar.K;
        this.r = bVar.r;
        this.s = bVar.s;
        this.f1375f = bVar.f1375f;
        this.f1376g = bVar.f1376g;
        this.t = bVar.t;
        this.u = bVar.u;
        this.x = bVar.x;
        this.T = bVar.T;
        this.U = this.U;
        Log.d("IsTitleEmpty", "ProcessingInfo: ");
        this.V = d();
        this.W = this.W;
        this.X = g();
        this.Y = this.Y;
        this.Z = this.Z;
        this.a0 = this.a0;
    }
}
