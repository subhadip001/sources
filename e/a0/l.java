package e.a0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.video_converter.video_compressor.R;
import e.i.j.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: TransitionManager.java */
/* loaded from: classes.dex */
public class l {
    public static h a = new e.a0.a();
    public static ThreadLocal<WeakReference<e.f.a<ViewGroup, ArrayList<h>>>> b = new ThreadLocal<>();
    public static ArrayList<ViewGroup> c = new ArrayList<>();

    /* compiled from: TransitionManager.java */
    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: f  reason: collision with root package name */
        public h f1443f;

        /* renamed from: g  reason: collision with root package name */
        public ViewGroup f1444g;

        /* compiled from: TransitionManager.java */
        /* renamed from: e.a0.l$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0021a extends k {
            public final /* synthetic */ e.f.a a;

            public C0021a(e.f.a aVar) {
                this.a = aVar;
            }

            @Override // e.a0.h.d
            public void c(h hVar) {
                ((ArrayList) this.a.get(a.this.f1444g)).remove(hVar);
                hVar.v(this);
            }
        }

        public a(h hVar, ViewGroup viewGroup) {
            this.f1443f = hVar;
            this.f1444g = viewGroup;
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x0215  */
        /* JADX WARN: Removed duplicated region for block: B:106:0x0242  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x01ef A[EDGE_INSN: B:136:0x01ef->B:90:0x01ef ?: BREAK  , SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x01f4  */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onPreDraw() {
            /*
                Method dump skipped, instructions count: 692
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: e.a0.l.a.onPreDraw():boolean");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.f1444g.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f1444g.removeOnAttachStateChangeListener(this);
            l.c.remove(this.f1444g);
            ArrayList<h> arrayList = l.b().get(this.f1444g);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<h> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().x(this.f1444g);
                }
            }
            this.f1443f.i(true);
        }
    }

    public static void a(ViewGroup viewGroup, h hVar) {
        if (c.contains(viewGroup)) {
            return;
        }
        AtomicInteger atomicInteger = e.i.j.z.a;
        if (z.g.c(viewGroup)) {
            c.add(viewGroup);
            if (hVar == null) {
                hVar = a;
            }
            h clone = hVar.clone();
            ArrayList<h> orDefault = b().getOrDefault(viewGroup, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator<h> it = orDefault.iterator();
                while (it.hasNext()) {
                    it.next().u(viewGroup);
                }
            }
            if (clone != null) {
                clone.h(viewGroup, true);
            }
            if (((g) viewGroup.getTag(R.id.transition_current_scene)) == null) {
                viewGroup.setTag(R.id.transition_current_scene, null);
                if (clone != null) {
                    a aVar = new a(clone, viewGroup);
                    viewGroup.addOnAttachStateChangeListener(aVar);
                    viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
                    return;
                }
                return;
            }
            throw null;
        }
    }

    public static e.f.a<ViewGroup, ArrayList<h>> b() {
        e.f.a<ViewGroup, ArrayList<h>> aVar;
        WeakReference<e.f.a<ViewGroup, ArrayList<h>>> weakReference = b.get();
        if (weakReference == null || (aVar = weakReference.get()) == null) {
            e.f.a<ViewGroup, ArrayList<h>> aVar2 = new e.f.a<>();
            b.set(new WeakReference<>(aVar2));
            return aVar2;
        }
        return aVar;
    }
}
