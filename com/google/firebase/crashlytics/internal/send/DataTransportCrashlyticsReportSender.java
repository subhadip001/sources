package com.google.firebase.crashlytics.internal.send;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import f.h.b.a.b;
import f.h.b.a.d;
import f.h.b.a.f;
import f.h.b.a.h.c;
import f.h.b.a.i.m;
import f.h.b.a.i.p;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public class DataTransportCrashlyticsReportSender {
    private static final String CRASHLYTICS_TRANSPORT_NAME = "FIREBASE_CRASHLYTICS_REPORT";
    private final ReportQueue reportQueue;
    private final d<CrashlyticsReport, byte[]> transportTransform;
    private static final CrashlyticsReportJsonTransform TRANSFORM = new CrashlyticsReportJsonTransform();
    private static final String CRASHLYTICS_ENDPOINT = mergeStrings("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    private static final String CRASHLYTICS_API_KEY = mergeStrings("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    private static final d<CrashlyticsReport, byte[]> DEFAULT_TRANSFORM = new d() { // from class: f.h.e.i.e.g.a
        @Override // f.h.b.a.d
        public final Object apply(Object obj) {
            return DataTransportCrashlyticsReportSender.a((CrashlyticsReport) obj);
        }
    };

    public DataTransportCrashlyticsReportSender(ReportQueue reportQueue, d<CrashlyticsReport, byte[]> dVar) {
        this.reportQueue = reportQueue;
        this.transportTransform = dVar;
    }

    public static /* synthetic */ byte[] a(CrashlyticsReport crashlyticsReport) {
        return TRANSFORM.reportToJson(crashlyticsReport).getBytes(Charset.forName("UTF-8"));
    }

    public static DataTransportCrashlyticsReportSender create(Context context, SettingsProvider settingsProvider, OnDemandCounter onDemandCounter) {
        p.b(context);
        f c = p.a().c(new c(CRASHLYTICS_ENDPOINT, CRASHLYTICS_API_KEY));
        b bVar = new b("json");
        d<CrashlyticsReport, byte[]> dVar = DEFAULT_TRANSFORM;
        return new DataTransportCrashlyticsReportSender(new ReportQueue(((m) c).b(CRASHLYTICS_TRANSPORT_NAME, CrashlyticsReport.class, bVar, dVar), settingsProvider.getSettingsSync(), onDemandCounter), dVar);
    }

    private static String mergeStrings(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb = new StringBuilder(str2.length() + str.length());
            for (int i2 = 0; i2 < str.length(); i2++) {
                sb.append(str.charAt(i2));
                if (str2.length() > i2) {
                    sb.append(str2.charAt(i2));
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }

    public Task<CrashlyticsReportWithSessionId> enqueueReport(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, boolean z) {
        return this.reportQueue.enqueueReport(crashlyticsReportWithSessionId, z).getTask();
    }
}
