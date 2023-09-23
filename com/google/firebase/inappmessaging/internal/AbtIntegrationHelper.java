package com.google.firebase.inappmessaging.internal;

import com.google.firebase.abt.AbtException;
import com.google.firebase.abt.AbtExperimentInfo;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.inappmessaging.ExperimentPayloadProto;
import com.google.firebase.inappmessaging.internal.AbtIntegrationHelper;
import com.google.firebase.inappmessaging.internal.injection.scopes.FirebaseAppScope;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import f.a.b.a.a;
import f.h.g.a.a.a.d.e;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@FirebaseAppScope
/* loaded from: classes2.dex */
public class AbtIntegrationHelper {
    private final FirebaseABTesting abTesting;
    public Executor executor = Executors.newSingleThreadExecutor();

    public AbtIntegrationHelper(FirebaseABTesting firebaseABTesting) {
        this.abTesting = firebaseABTesting;
    }

    public /* synthetic */ void a(ExperimentPayloadProto.ExperimentPayload experimentPayload) {
        try {
            Logging.logd("Updating active experiment: " + experimentPayload.toString());
            this.abTesting.reportActiveExperiment(new AbtExperimentInfo(experimentPayload.getExperimentId(), experimentPayload.getVariantId(), experimentPayload.getTriggerEvent(), new Date(experimentPayload.getExperimentStartTimeMillis()), experimentPayload.getTriggerTimeoutMillis(), experimentPayload.getTimeToLiveMillis()));
        } catch (AbtException e2) {
            StringBuilder A = a.A("Unable to set experiment as active with ABT, missing analytics?\n");
            A.append(e2.getMessage());
            Logging.loge(A.toString());
        }
    }

    public /* synthetic */ void b(ArrayList arrayList) {
        try {
            Logging.logd("Updating running experiments with: " + arrayList.size() + " experiments");
            this.abTesting.validateRunningExperiments(arrayList);
        } catch (AbtException e2) {
            StringBuilder A = a.A("Unable to register experiments with ABT, missing analytics?\n");
            A.append(e2.getMessage());
            Logging.loge(A.toString());
        }
    }

    public void setExperimentActive(final ExperimentPayloadProto.ExperimentPayload experimentPayload) {
        this.executor.execute(new Runnable() { // from class: f.h.e.n.e.c
            @Override // java.lang.Runnable
            public final void run() {
                AbtIntegrationHelper.this.a(experimentPayload);
            }
        });
    }

    public void updateRunningExperiments(e eVar) {
        final ArrayList arrayList = new ArrayList();
        for (CampaignProto$ThickContent campaignProto$ThickContent : eVar.e()) {
            if (!campaignProto$ThickContent.d() && campaignProto$ThickContent.e().equals(CampaignProto$ThickContent.PayloadCase.EXPERIMENTAL_PAYLOAD)) {
                ExperimentPayloadProto.ExperimentPayload f2 = campaignProto$ThickContent.c().f();
                arrayList.add(new AbtExperimentInfo(f2.getExperimentId(), f2.getVariantId(), f2.getTriggerEvent(), new Date(f2.getExperimentStartTimeMillis()), f2.getTriggerTimeoutMillis(), f2.getTimeToLiveMillis()));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.executor.execute(new Runnable() { // from class: f.h.e.n.e.b
            @Override // java.lang.Runnable
            public final void run() {
                AbtIntegrationHelper.this.b(arrayList);
            }
        });
    }
}
