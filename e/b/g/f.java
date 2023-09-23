package e.b.g;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import e.b.g.i.i;
import e.b.g.i.j;
import e.b.h.e0;
import e.b.h.z0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: SupportMenuInflater.java */
/* loaded from: classes.dex */
public class f extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    public static final Class<?>[] f1588e;

    /* renamed from: f  reason: collision with root package name */
    public static final Class<?>[] f1589f;
    public final Object[] a;
    public final Object[] b;
    public Context c;

    /* renamed from: d  reason: collision with root package name */
    public Object f1590d;

    /* compiled from: SupportMenuInflater.java */
    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {
        public static final Class<?>[] c = {MenuItem.class};
        public Object a;
        public Method b;

        public a(Object obj, String str) {
            this.a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.b = cls.getMethod(str, c);
            } catch (Exception e2) {
                StringBuilder E = f.a.b.a.a.E("Couldn't resolve menu item onClick handler ", str, " in class ");
                E.append(cls.getName());
                InflateException inflateException = new InflateException(E.toString());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.b.invoke(this.a, menuItem)).booleanValue();
                }
                this.b.invoke(this.a, menuItem);
                return true;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* compiled from: SupportMenuInflater.java */
    /* loaded from: classes.dex */
    public class b {
        public e.i.j.d A;
        public CharSequence B;
        public CharSequence C;
        public Menu a;

        /* renamed from: h  reason: collision with root package name */
        public boolean f1595h;

        /* renamed from: i  reason: collision with root package name */
        public int f1596i;

        /* renamed from: j  reason: collision with root package name */
        public int f1597j;

        /* renamed from: k  reason: collision with root package name */
        public CharSequence f1598k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f1599l;

        /* renamed from: m  reason: collision with root package name */
        public int f1600m;
        public char n;
        public int o;
        public char p;
        public int q;
        public int r;
        public boolean s;
        public boolean t;
        public boolean u;
        public int v;
        public int w;
        public String x;
        public String y;
        public String z;
        public ColorStateList D = null;
        public PorterDuff.Mode E = null;
        public int b = 0;
        public int c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f1591d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f1592e = 0;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1593f = true;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1594g = true;

        public b(Menu menu) {
            this.a = menu;
        }

        public SubMenu a() {
            this.f1595h = true;
            SubMenu addSubMenu = this.a.addSubMenu(this.b, this.f1596i, this.f1597j, this.f1598k);
            c(addSubMenu.getItem());
            return addSubMenu;
        }

        public final <T> T b(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, f.this.c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e2) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
                return null;
            }
        }

        public final void c(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.f1599l).setIcon(this.f1600m);
            int i2 = this.v;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            if (this.z != null) {
                if (!f.this.c.isRestricted()) {
                    f fVar = f.this;
                    if (fVar.f1590d == null) {
                        fVar.f1590d = fVar.a(fVar.c);
                    }
                    menuItem.setOnMenuItemClickListener(new a(fVar.f1590d, this.z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.r >= 2) {
                if (menuItem instanceof i) {
                    ((i) menuItem).k(true);
                } else if (menuItem instanceof j) {
                    j jVar = (j) menuItem;
                    try {
                        if (jVar.f1675e == null) {
                            jVar.f1675e = jVar.f1674d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        jVar.f1675e.invoke(jVar.f1674d, Boolean.TRUE);
                    } catch (Exception e2) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                    }
                }
            }
            String str = this.x;
            if (str != null) {
                menuItem.setActionView((View) b(str, f.f1588e, f.this.a));
                z = true;
            }
            int i3 = this.w;
            if (i3 > 0) {
                if (!z) {
                    menuItem.setActionView(i3);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            e.i.j.d dVar = this.A;
            if (dVar != null) {
                if (menuItem instanceof e.i.e.a.b) {
                    ((e.i.e.a.b) menuItem).a(dVar);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.B;
            boolean z2 = menuItem instanceof e.i.e.a.b;
            if (z2) {
                ((e.i.e.a.b) menuItem).setContentDescription(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setContentDescription(charSequence);
            }
            CharSequence charSequence2 = this.C;
            if (z2) {
                ((e.i.e.a.b) menuItem).setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setTooltipText(charSequence2);
            }
            char c = this.n;
            int i4 = this.o;
            if (z2) {
                ((e.i.e.a.b) menuItem).setAlphabeticShortcut(c, i4);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setAlphabeticShortcut(c, i4);
            }
            char c2 = this.p;
            int i5 = this.q;
            if (z2) {
                ((e.i.e.a.b) menuItem).setNumericShortcut(c2, i5);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setNumericShortcut(c2, i5);
            }
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                if (z2) {
                    ((e.i.e.a.b) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    menuItem.setIconTintMode(mode);
                }
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                if (z2) {
                    ((e.i.e.a.b) menuItem).setIconTintList(colorStateList);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    menuItem.setIconTintList(colorStateList);
                }
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f1588e = clsArr;
        f1589f = clsArr;
    }

    public f(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        ColorStateList colorStateList;
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException(f.a.b.a.a.p("Expecting menu, got ", name));
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            str = null;
                            z2 = false;
                        } else if (name2.equals("group")) {
                            bVar.b = 0;
                            bVar.c = 0;
                            bVar.f1591d = 0;
                            bVar.f1592e = 0;
                            bVar.f1593f = true;
                            bVar.f1594g = true;
                        } else if (name2.equals("item")) {
                            if (!bVar.f1595h) {
                                e.i.j.d dVar = bVar.A;
                                if (dVar != null && dVar.a()) {
                                    bVar.a();
                                } else {
                                    bVar.f1595h = true;
                                    bVar.c(bVar.a.add(bVar.b, bVar.f1596i, bVar.f1597j, bVar.f1598k));
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        TypedArray obtainStyledAttributes = f.this.c.obtainStyledAttributes(attributeSet, e.b.b.q);
                        bVar.b = obtainStyledAttributes.getResourceId(1, 0);
                        bVar.c = obtainStyledAttributes.getInt(3, 0);
                        bVar.f1591d = obtainStyledAttributes.getInt(4, 0);
                        bVar.f1592e = obtainStyledAttributes.getInt(5, 0);
                        bVar.f1593f = obtainStyledAttributes.getBoolean(2, true);
                        bVar.f1594g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals("item")) {
                        z0 p = z0.p(f.this.c, attributeSet, e.b.b.r);
                        bVar.f1596i = p.l(2, 0);
                        bVar.f1597j = (p.j(5, bVar.c) & (-65536)) | (p.j(6, bVar.f1591d) & 65535);
                        bVar.f1598k = p.n(7);
                        bVar.f1599l = p.n(8);
                        bVar.f1600m = p.l(0, 0);
                        String m2 = p.m(9);
                        bVar.n = m2 == null ? (char) 0 : m2.charAt(0);
                        bVar.o = p.j(16, 4096);
                        String m3 = p.m(10);
                        bVar.p = m3 == null ? (char) 0 : m3.charAt(0);
                        bVar.q = p.j(20, 4096);
                        if (p.o(11)) {
                            bVar.r = p.a(11, false) ? 1 : 0;
                        } else {
                            bVar.r = bVar.f1592e;
                        }
                        bVar.s = p.a(3, false);
                        bVar.t = p.a(4, bVar.f1593f);
                        bVar.u = p.a(1, bVar.f1594g);
                        bVar.v = p.j(21, -1);
                        bVar.z = p.m(12);
                        bVar.w = p.l(13, 0);
                        bVar.x = p.m(15);
                        String m4 = p.m(14);
                        bVar.y = m4;
                        boolean z3 = m4 != null;
                        if (z3 && bVar.w == 0 && bVar.x == null) {
                            bVar.A = (e.i.j.d) bVar.b(m4, f1589f, f.this.b);
                        } else {
                            if (z3) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            bVar.A = null;
                        }
                        bVar.B = p.n(17);
                        bVar.C = p.n(22);
                        if (p.o(19)) {
                            bVar.E = e0.e(p.j(19, -1), bVar.E);
                            colorStateList = null;
                        } else {
                            colorStateList = null;
                            bVar.E = null;
                        }
                        if (p.o(18)) {
                            bVar.D = p.c(18);
                        } else {
                            bVar.D = colorStateList;
                        }
                        p.b.recycle();
                        bVar.f1595h = false;
                    } else if (name3.equals("menu")) {
                        b(xmlPullParser, attributeSet, bVar.a());
                    } else {
                        z2 = true;
                        str = name3;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(int i2, Menu menu) {
        if (!(menu instanceof e.i.e.a.a)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.c.getResources().getLayout(i2);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (IOException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
