package e.b.g.i;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.firebase.crashlytics.internal.settings.DefaultSettingsSpiCall;
import e.i.j.a0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MenuBuilder.java */
/* loaded from: classes.dex */
public class g implements e.i.e.a.a {
    public static final int[] y = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public final Resources b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1651d;

    /* renamed from: e  reason: collision with root package name */
    public a f1652e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<i> f1653f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<i> f1654g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1655h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<i> f1656i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList<i> f1657j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1658k;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f1660m;
    public Drawable n;
    public View o;
    public i v;
    public boolean x;

    /* renamed from: l  reason: collision with root package name */
    public int f1659l = 0;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public ArrayList<i> t = new ArrayList<>();
    public CopyOnWriteArrayList<WeakReference<m>> u = new CopyOnWriteArrayList<>();
    public boolean w = false;

    /* compiled from: MenuBuilder.java */
    /* loaded from: classes.dex */
    public interface a {
        boolean a(g gVar, MenuItem menuItem);

        void b(g gVar);
    }

    /* compiled from: MenuBuilder.java */
    /* loaded from: classes.dex */
    public interface b {
        boolean a(i iVar);
    }

    public g(Context context) {
        boolean z;
        boolean z2 = false;
        this.a = context;
        Resources resources = context.getResources();
        this.b = resources;
        this.f1653f = new ArrayList<>();
        this.f1654g = new ArrayList<>();
        this.f1655h = true;
        this.f1656i = new ArrayList<>();
        this.f1657j = new ArrayList<>();
        this.f1658k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = a0.a;
            if (Build.VERSION.SDK_INT >= 28) {
                z = viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", DefaultSettingsSpiCall.ANDROID_CLIENT_TYPE);
                z = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z) {
                z2 = true;
            }
        }
        this.f1651d = z2;
    }

    public MenuItem a(int i2, int i3, int i4, CharSequence charSequence) {
        int i5;
        int i6 = ((-65536) & i4) >> 16;
        if (i6 >= 0) {
            int[] iArr = y;
            if (i6 < iArr.length) {
                int i7 = (iArr[i6] << 16) | (65535 & i4);
                i iVar = new i(this, i2, i3, i4, i7, charSequence, this.f1659l);
                ArrayList<i> arrayList = this.f1653f;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        i5 = 0;
                        break;
                    } else if (arrayList.get(size).f1664d <= i7) {
                        i5 = size + 1;
                        break;
                    }
                }
                arrayList.add(i5, iVar);
                q(true);
                return iVar;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i8 < 0 ? intent : intentArr[i8]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            i iVar = (i) a(i2, i3, i4, resolveInfo.loadLabel(packageManager));
            iVar.setIcon(resolveInfo.loadIcon(packageManager));
            iVar.setIntent(intent2);
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = iVar;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(m mVar, Context context) {
        this.u.add(new WeakReference<>(mVar));
        mVar.i(context, this);
        this.f1658k = true;
    }

    public final void c(boolean z) {
        if (this.s) {
            return;
        }
        this.s = true;
        Iterator<WeakReference<m>> it = this.u.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar = next.get();
            if (mVar == null) {
                this.u.remove(next);
            } else {
                mVar.b(this, z);
            }
        }
        this.s = false;
    }

    @Override // android.view.Menu
    public void clear() {
        i iVar = this.v;
        if (iVar != null) {
            d(iVar);
        }
        this.f1653f.clear();
        q(true);
    }

    public void clearHeader() {
        this.n = null;
        this.f1660m = null;
        this.o = null;
        q(false);
    }

    @Override // android.view.Menu
    public void close() {
        c(true);
    }

    public boolean d(i iVar) {
        boolean z = false;
        if (!this.u.isEmpty() && this.v == iVar) {
            z();
            Iterator<WeakReference<m>> it = this.u.iterator();
            while (it.hasNext()) {
                WeakReference<m> next = it.next();
                m mVar = next.get();
                if (mVar == null) {
                    this.u.remove(next);
                } else {
                    z = mVar.e(this, iVar);
                    if (z) {
                        break;
                    }
                }
            }
            y();
            if (z) {
                this.v = null;
            }
        }
        return z;
    }

    public boolean e(g gVar, MenuItem menuItem) {
        a aVar = this.f1652e;
        return aVar != null && aVar.a(gVar, menuItem);
    }

    public boolean f(i iVar) {
        boolean z = false;
        if (this.u.isEmpty()) {
            return false;
        }
        z();
        Iterator<WeakReference<m>> it = this.u.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar = next.get();
            if (mVar == null) {
                this.u.remove(next);
            } else {
                z = mVar.f(this, iVar);
                if (z) {
                    break;
                }
            }
        }
        y();
        if (z) {
            this.v = iVar;
        }
        return z;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i2) {
        MenuItem findItem;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f1653f.get(i3);
            if (iVar.a == i2) {
                return iVar;
            }
            if (iVar.hasSubMenu() && (findItem = iVar.o.findItem(i2)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public i g(int i2, KeyEvent keyEvent) {
        char c;
        ArrayList<i> arrayList = this.t;
        arrayList.clear();
        h(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean n = n();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = arrayList.get(i3);
            if (n) {
                c = iVar.f1670j;
            } else {
                c = iVar.f1668h;
            }
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (n && c == '\b' && i2 == 67))) {
                return iVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i2) {
        return this.f1653f.get(i2);
    }

    public void h(List<i> list, int i2, KeyEvent keyEvent) {
        char c;
        int i3;
        boolean n = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            int size = this.f1653f.size();
            for (int i4 = 0; i4 < size; i4++) {
                i iVar = this.f1653f.get(i4);
                if (iVar.hasSubMenu()) {
                    iVar.o.h(list, i2, keyEvent);
                }
                if (n) {
                    c = iVar.f1670j;
                } else {
                    c = iVar.f1668h;
                }
                if (n) {
                    i3 = iVar.f1671k;
                } else {
                    i3 = iVar.f1669i;
                }
                if (((modifiers & 69647) == (i3 & 69647)) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (n && c == '\b' && i2 == 67)) && iVar.isEnabled()) {
                        list.add(iVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.x) {
            return true;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f1653f.get(i2).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public void i() {
        ArrayList<i> l2 = l();
        if (this.f1658k) {
            Iterator<WeakReference<m>> it = this.u.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference<m> next = it.next();
                m mVar = next.get();
                if (mVar == null) {
                    this.u.remove(next);
                } else {
                    z |= mVar.d();
                }
            }
            if (z) {
                this.f1656i.clear();
                this.f1657j.clear();
                int size = l2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    i iVar = l2.get(i2);
                    if (iVar.g()) {
                        this.f1656i.add(iVar);
                    } else {
                        this.f1657j.add(iVar);
                    }
                }
            } else {
                this.f1656i.clear();
                this.f1657j.clear();
                this.f1657j.addAll(l());
            }
            this.f1658k = false;
        }
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return g(i2, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public g k() {
        return this;
    }

    public ArrayList<i> l() {
        if (this.f1655h) {
            this.f1654g.clear();
            int size = this.f1653f.size();
            for (int i2 = 0; i2 < size; i2++) {
                i iVar = this.f1653f.get(i2);
                if (iVar.isVisible()) {
                    this.f1654g.add(iVar);
                }
            }
            this.f1655h = false;
            this.f1658k = true;
            return this.f1654g;
        }
        return this.f1654g;
    }

    public boolean m() {
        return this.w;
    }

    public boolean n() {
        return this.c;
    }

    public boolean o() {
        return this.f1651d;
    }

    public void p() {
        this.f1658k = true;
        q(true);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i2, int i3) {
        return r(findItem(i2), i3);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        i g2 = g(i2, keyEvent);
        boolean s = g2 != null ? s(g2, null, i3) : false;
        if ((i3 & 2) != 0) {
            c(true);
        }
        return s;
    }

    public void q(boolean z) {
        if (!this.p) {
            if (z) {
                this.f1655h = true;
                this.f1658k = true;
            }
            if (this.u.isEmpty()) {
                return;
            }
            z();
            Iterator<WeakReference<m>> it = this.u.iterator();
            while (it.hasNext()) {
                WeakReference<m> next = it.next();
                m mVar = next.get();
                if (mVar == null) {
                    this.u.remove(next);
                } else {
                    mVar.c(z);
                }
            }
            y();
            return;
        }
        this.q = true;
        if (z) {
            this.r = true;
        }
    }

    public boolean r(MenuItem menuItem, int i2) {
        return s(menuItem, null, i2);
    }

    @Override // android.view.Menu
    public void removeGroup(int i2) {
        int size = size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (this.f1653f.get(i3).b == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = this.f1653f.size() - i3;
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                if (i4 >= size2 || this.f1653f.get(i3).b != i2) {
                    break;
                }
                t(i3, false);
                i4 = i5;
            }
            q(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i2) {
        int size = size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (this.f1653f.get(i3).a == i2) {
                break;
            } else {
                i3++;
            }
        }
        t(i3, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean s(android.view.MenuItem r7, e.b.g.i.m r8, int r9) {
        /*
            r6 = this;
            e.b.g.i.i r7 = (e.b.g.i.i) r7
            r0 = 0
            if (r7 == 0) goto Ld2
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Ld2
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.p
            r2 = 1
            if (r1 == 0) goto L19
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L19
            goto L21
        L19:
            e.b.g.i.g r1 = r7.n
            boolean r1 = r1.e(r1, r7)
            if (r1 == 0) goto L23
        L21:
            r1 = 1
            goto L43
        L23:
            android.content.Intent r1 = r7.f1667g
            if (r1 == 0) goto L37
            e.b.g.i.g r3 = r7.n     // Catch: android.content.ActivityNotFoundException -> L2f
            android.content.Context r3 = r3.a     // Catch: android.content.ActivityNotFoundException -> L2f
            r3.startActivity(r1)     // Catch: android.content.ActivityNotFoundException -> L2f
            goto L21
        L2f:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L37:
            e.i.j.d r1 = r7.A
            if (r1 == 0) goto L42
            boolean r1 = r1.e()
            if (r1 == 0) goto L42
            goto L21
        L42:
            r1 = 0
        L43:
            e.i.j.d r3 = r7.A
            if (r3 == 0) goto L4f
            boolean r4 = r3.a()
            if (r4 == 0) goto L4f
            r4 = 1
            goto L50
        L4f:
            r4 = 0
        L50:
            boolean r5 = r7.f()
            if (r5 == 0) goto L62
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Ld1
            r6.c(r2)
            goto Ld1
        L62:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L73
            if (r4 == 0) goto L6b
            goto L73
        L6b:
            r7 = r9 & 1
            if (r7 != 0) goto Ld1
            r6.c(r2)
            goto Ld1
        L73:
            r9 = r9 & 4
            if (r9 != 0) goto L7a
            r6.c(r0)
        L7a:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L8e
            e.b.g.i.r r9 = new e.b.g.i.r
            android.content.Context r5 = r6.a
            r9.<init>(r5, r6, r7)
            r7.o = r9
            java.lang.CharSequence r5 = r7.f1665e
            r9.setHeaderTitle(r5)
        L8e:
            e.b.g.i.r r7 = r7.o
            if (r4 == 0) goto L95
            r3.f(r7)
        L95:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<e.b.g.i.m>> r9 = r6.u
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L9e
            goto Lcb
        L9e:
            if (r8 == 0) goto La4
            boolean r0 = r8.l(r7)
        La4:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<e.b.g.i.m>> r8 = r6.u
            java.util.Iterator r8 = r8.iterator()
        Laa:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Lcb
            java.lang.Object r9 = r8.next()
            java.lang.ref.WeakReference r9 = (java.lang.ref.WeakReference) r9
            java.lang.Object r3 = r9.get()
            e.b.g.i.m r3 = (e.b.g.i.m) r3
            if (r3 != 0) goto Lc4
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<e.b.g.i.m>> r3 = r6.u
            r3.remove(r9)
            goto Laa
        Lc4:
            if (r0 != 0) goto Laa
            boolean r0 = r3.l(r7)
            goto Laa
        Lcb:
            r1 = r1 | r0
            if (r1 != 0) goto Ld1
            r6.c(r2)
        Ld1:
            return r1
        Ld2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.g.i.g.s(android.view.MenuItem, e.b.g.i.m, int):boolean");
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i2, boolean z, boolean z2) {
        int size = this.f1653f.size();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f1653f.get(i3);
            if (iVar.b == i2) {
                iVar.k(z2);
                iVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.w = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i2, boolean z) {
        int size = this.f1653f.size();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f1653f.get(i3);
            if (iVar.b == i2) {
                iVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i2, boolean z) {
        int size = this.f1653f.size();
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f1653f.get(i3);
            if (iVar.b == i2 && iVar.m(z)) {
                z2 = true;
            }
        }
        if (z2) {
            q(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.c = z;
        q(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f1653f.size();
    }

    public final void t(int i2, boolean z) {
        if (i2 < 0 || i2 >= this.f1653f.size()) {
            return;
        }
        this.f1653f.remove(i2);
        if (z) {
            q(true);
        }
    }

    public void u(m mVar) {
        Iterator<WeakReference<m>> it = this.u.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar2 = next.get();
            if (mVar2 == null || mVar2 == mVar) {
                this.u.remove(next);
            }
        }
    }

    public void v(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((r) item.getSubMenu()).v(bundle);
            }
        }
        int i3 = bundle.getInt("android:menu:expandedactionview");
        if (i3 <= 0 || (findItem = findItem(i3)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public void w(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((r) item.getSubMenu()).w(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void x(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        Resources resources = this.b;
        if (view != null) {
            this.o = view;
            this.f1660m = null;
            this.n = null;
        } else {
            if (i2 > 0) {
                this.f1660m = resources.getText(i2);
            } else if (charSequence != null) {
                this.f1660m = charSequence;
            }
            if (i3 > 0) {
                this.n = e.i.c.a.getDrawable(this.a, i3);
            } else if (drawable != null) {
                this.n = drawable;
            }
            this.o = null;
        }
        q(false);
    }

    public void y() {
        this.p = false;
        if (this.q) {
            this.q = false;
            q(this.r);
        }
    }

    public void z() {
        if (this.p) {
            return;
        }
        this.p = true;
        this.q = false;
        this.r = false;
    }

    @Override // android.view.Menu
    public MenuItem add(int i2) {
        return a(0, 0, 0, this.b.getString(i2));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.b.getString(i2));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        i iVar = (i) a(i2, i3, i4, charSequence);
        r rVar = new r(this.a, this, iVar);
        iVar.o = rVar;
        rVar.setHeaderTitle(iVar.f1665e);
        return rVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.b.getString(i5));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, this.b.getString(i5));
    }
}
