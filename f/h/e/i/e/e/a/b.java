package f.h.e.i.e.e.a;

import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;

/* compiled from: lambda */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements CrashlyticsReportJsonTransform.ObjectParser {
    public static final /* synthetic */ b a = new b();

    @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
    public final Object parse(JsonReader jsonReader) {
        CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame parseEventFrame;
        parseEventFrame = CrashlyticsReportJsonTransform.parseEventFrame(jsonReader);
        return parseEventFrame;
    }
}
