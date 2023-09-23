package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import g.c.u.a;

/* loaded from: classes2.dex */
public final class ProgrammaticContextualTriggerFlowableModule_ProvidesProgramaticContextualTriggerStreamFactory implements Factory<a<String>> {
    private final ProgrammaticContextualTriggerFlowableModule module;

    public ProgrammaticContextualTriggerFlowableModule_ProvidesProgramaticContextualTriggerStreamFactory(ProgrammaticContextualTriggerFlowableModule programmaticContextualTriggerFlowableModule) {
        this.module = programmaticContextualTriggerFlowableModule;
    }

    public static ProgrammaticContextualTriggerFlowableModule_ProvidesProgramaticContextualTriggerStreamFactory create(ProgrammaticContextualTriggerFlowableModule programmaticContextualTriggerFlowableModule) {
        return new ProgrammaticContextualTriggerFlowableModule_ProvidesProgramaticContextualTriggerStreamFactory(programmaticContextualTriggerFlowableModule);
    }

    public static a<String> providesProgramaticContextualTriggerStream(ProgrammaticContextualTriggerFlowableModule programmaticContextualTriggerFlowableModule) {
        return (a) Preconditions.checkNotNull(programmaticContextualTriggerFlowableModule.providesProgramaticContextualTriggerStream(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, h.a.a
    public a<String> get() {
        return providesProgramaticContextualTriggerStream(this.module);
    }
}
