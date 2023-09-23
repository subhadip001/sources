package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.Module;
import com.google.firebase.inappmessaging.dagger.Provides;
import com.google.firebase.inappmessaging.internal.ProgramaticContextualTriggers;
import com.google.firebase.inappmessaging.internal.injection.modules.ProgrammaticContextualTriggerFlowableModule;
import com.google.firebase.inappmessaging.internal.injection.qualifiers.ProgrammaticTrigger;
import g.c.d;
import g.c.e;
import g.c.f;
import g.c.u.a;
import g.c.w.e.b.c;
import io.reactivex.BackpressureStrategy;
import java.util.Objects;

@Module
/* loaded from: classes2.dex */
public class ProgrammaticContextualTriggerFlowableModule {
    private ProgramaticContextualTriggers triggers;

    public ProgrammaticContextualTriggerFlowableModule(ProgramaticContextualTriggers programaticContextualTriggers) {
        this.triggers = programaticContextualTriggers;
    }

    public /* synthetic */ void a(final e eVar) {
        this.triggers.setListener(new ProgramaticContextualTriggers.Listener() { // from class: f.h.e.n.e.j2.a.b
            @Override // com.google.firebase.inappmessaging.internal.ProgramaticContextualTriggers.Listener
            public final void onEventTrigger(String str) {
                e.this.onNext(str);
            }
        });
    }

    @Provides
    @ProgrammaticTrigger
    public a<String> providesProgramaticContextualTriggerStream() {
        f fVar = new f() { // from class: f.h.e.n.e.j2.a.a
            @Override // g.c.f
            public final void subscribe(e eVar) {
                ProgrammaticContextualTriggerFlowableModule.this.a(eVar);
            }
        };
        BackpressureStrategy backpressureStrategy = BackpressureStrategy.BUFFER;
        int i2 = d.f8128f;
        Objects.requireNonNull(backpressureStrategy, "mode is null");
        a c = new c(fVar, backpressureStrategy).c();
        c.f();
        return c;
    }

    @Provides
    @ProgrammaticTrigger
    public ProgramaticContextualTriggers providesProgramaticContextualTriggers() {
        return this.triggers;
    }
}
