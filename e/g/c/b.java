package e.g.c;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ConstraintLayoutStates.java */
/* loaded from: classes.dex */
public class b {
    public final ConstraintLayout a;
    public int b = -1;
    public int c = -1;

    /* renamed from: d  reason: collision with root package name */
    public SparseArray<a> f2121d = new SparseArray<>();

    /* renamed from: e  reason: collision with root package name */
    public SparseArray<c> f2122e = new SparseArray<>();

    /* compiled from: ConstraintLayoutStates.java */
    /* loaded from: classes.dex */
    public static class a {
        public int a;
        public ArrayList<C0035b> b = new ArrayList<>();
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public c f2123d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), h.f2185j);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 0) {
                    this.a = obtainStyledAttributes.getResourceId(index, this.a);
                } else if (index == 1) {
                    this.c = obtainStyledAttributes.getResourceId(index, this.c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                    context.getResources().getResourceName(this.c);
                    if ("layout".equals(resourceTypeName)) {
                        c cVar = new c();
                        this.f2123d = cVar;
                        cVar.c((ConstraintLayout) LayoutInflater.from(context).inflate(this.c, (ViewGroup) null));
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        public int a(float f2, float f3) {
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                if (this.b.get(i2).a(f2, f3)) {
                    return i2;
                }
            }
            return -1;
        }
    }

    /* compiled from: ConstraintLayoutStates.java */
    /* renamed from: e.g.c.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0035b {
        public float a;
        public float b;
        public float c;

        /* renamed from: d  reason: collision with root package name */
        public float f2124d;

        /* renamed from: e  reason: collision with root package name */
        public int f2125e;

        /* renamed from: f  reason: collision with root package name */
        public c f2126f;

        public C0035b(Context context, XmlPullParser xmlPullParser) {
            this.a = Float.NaN;
            this.b = Float.NaN;
            this.c = Float.NaN;
            this.f2124d = Float.NaN;
            this.f2125e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), h.f2187l);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 0) {
                    this.f2125e = obtainStyledAttributes.getResourceId(index, this.f2125e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2125e);
                    context.getResources().getResourceName(this.f2125e);
                    if ("layout".equals(resourceTypeName)) {
                        c cVar = new c();
                        this.f2126f = cVar;
                        cVar.c((ConstraintLayout) LayoutInflater.from(context).inflate(this.f2125e, (ViewGroup) null));
                    }
                } else if (index == 1) {
                    this.f2124d = obtainStyledAttributes.getDimension(index, this.f2124d);
                } else if (index == 2) {
                    this.b = obtainStyledAttributes.getDimension(index, this.b);
                } else if (index == 3) {
                    this.c = obtainStyledAttributes.getDimension(index, this.c);
                } else if (index == 4) {
                    this.a = obtainStyledAttributes.getDimension(index, this.a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        public boolean a(float f2, float f3) {
            if (Float.isNaN(this.a) || f2 >= this.a) {
                if (Float.isNaN(this.b) || f3 >= this.b) {
                    if (Float.isNaN(this.c) || f2 <= this.c) {
                        return Float.isNaN(this.f2124d) || f3 <= this.f2124d;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
    }

    public b(Context context, ConstraintLayout constraintLayout, int i2) {
        this.a = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            int eventType = xml.getEventType();
            a aVar = null;
            while (true) {
                char c = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                break;
                            }
                            c = 65535;
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 2) {
                        a aVar2 = new a(context, xml);
                        this.f2121d.put(aVar2.a, aVar2);
                        aVar = aVar2;
                        continue;
                    } else if (c == 3) {
                        C0035b c0035b = new C0035b(context, xml);
                        if (aVar != null) {
                            aVar.b.add(c0035b);
                            continue;
                        } else {
                            continue;
                        }
                    } else if (c != 4) {
                        continue;
                    } else {
                        a(context, xml);
                        continue;
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0228, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.content.Context r12, org.xmlpull.v1.XmlPullParser r13) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.g.c.b.a(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
