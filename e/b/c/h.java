package e.b.c;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import com.video_converter.video_compressor.R;
import e.i.j.z;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: AlertDialog.java */
/* loaded from: classes.dex */
public class h extends s implements DialogInterface {

    /* renamed from: h  reason: collision with root package name */
    public final AlertController f1479h;

    /* compiled from: AlertDialog.java */
    /* loaded from: classes.dex */
    public static class a {
        public final AlertController.b a;
        public final int b;

        public a(Context context) {
            this(context, h.d(context, 0));
        }

        public h create() {
            int i2;
            h hVar = new h(this.a.a, this.b);
            AlertController.b bVar = this.a;
            AlertController alertController = hVar.f1479h;
            View view = bVar.f101f;
            if (view != null) {
                alertController.G = view;
            } else {
                CharSequence charSequence = bVar.f100e;
                if (charSequence != null) {
                    alertController.f87e = charSequence;
                    TextView textView = alertController.E;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = bVar.f99d;
                if (drawable != null) {
                    alertController.C = drawable;
                    alertController.B = 0;
                    ImageView imageView = alertController.D;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.D.setImageDrawable(drawable);
                    }
                }
                int i3 = bVar.c;
                if (i3 != 0) {
                    alertController.f(i3);
                }
            }
            CharSequence charSequence2 = bVar.f102g;
            if (charSequence2 != null) {
                alertController.f88f = charSequence2;
                TextView textView2 = alertController.F;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = bVar.f103h;
            if (charSequence3 != null) {
                alertController.e(-1, charSequence3, bVar.f104i, null, null);
            }
            CharSequence charSequence4 = bVar.f105j;
            if (charSequence4 != null) {
                alertController.e(-2, charSequence4, bVar.f106k, null, null);
            }
            if (bVar.n != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar.b.inflate(alertController.L, (ViewGroup) null);
                if (bVar.q) {
                    i2 = alertController.N;
                } else {
                    i2 = alertController.O;
                }
                ListAdapter listAdapter = bVar.n;
                if (listAdapter == null) {
                    listAdapter = new AlertController.d(bVar.a, i2, 16908308, null);
                }
                alertController.H = listAdapter;
                alertController.I = bVar.r;
                if (bVar.o != null) {
                    recycleListView.setOnItemClickListener(new g(bVar, alertController));
                }
                if (bVar.q) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.f89g = recycleListView;
            }
            View view2 = bVar.p;
            if (view2 != null) {
                alertController.f90h = view2;
                alertController.f91i = 0;
                alertController.n = false;
            }
            hVar.setCancelable(this.a.f107l);
            if (this.a.f107l) {
                hVar.setCanceledOnTouchOutside(true);
            }
            Objects.requireNonNull(this.a);
            hVar.setOnCancelListener(null);
            Objects.requireNonNull(this.a);
            hVar.setOnDismissListener(null);
            DialogInterface.OnKeyListener onKeyListener = this.a.f108m;
            if (onKeyListener != null) {
                hVar.setOnKeyListener(onKeyListener);
            }
            return hVar;
        }

        public Context getContext() {
            return this.a.a;
        }

        public a setNegativeButton(int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.f105j = bVar.a.getText(i2);
            this.a.f106k = onClickListener;
            return this;
        }

        public a setPositiveButton(int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.f103h = bVar.a.getText(i2);
            this.a.f104i = onClickListener;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.a.f100e = charSequence;
            return this;
        }

        public a setView(View view) {
            this.a.p = view;
            return this;
        }

        public a(Context context, int i2) {
            this.a = new AlertController.b(new ContextThemeWrapper(context, h.d(context, i2)));
            this.b = i2;
        }
    }

    public h(Context context, int i2) {
        super(context, d(context, i2));
        this.f1479h = new AlertController(getContext(), this, getWindow());
    }

    public static int d(Context context, int i2) {
        if (((i2 >>> 24) & 255) >= 1) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // e.b.c.s, android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i2;
        boolean z;
        View view;
        ListAdapter listAdapter;
        View view2;
        View findViewById;
        super.onCreate(bundle);
        AlertController alertController = this.f1479h;
        if (alertController.K == 0) {
            i2 = alertController.J;
        } else {
            i2 = alertController.J;
        }
        alertController.b.setContentView(i2);
        View findViewById2 = alertController.c.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        View view3 = alertController.f90h;
        if (view3 == null) {
            view3 = alertController.f91i != 0 ? LayoutInflater.from(alertController.a).inflate(alertController.f91i, viewGroup, false) : null;
        }
        boolean z2 = view3 != null;
        if (!z2 || !AlertController.a(view3)) {
            alertController.c.setFlags(131072, 131072);
        }
        if (z2) {
            FrameLayout frameLayout = (FrameLayout) alertController.c.findViewById(R.id.custom);
            frameLayout.addView(view3, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.n) {
                frameLayout.setPadding(alertController.f92j, alertController.f93k, alertController.f94l, alertController.f95m);
            }
            if (alertController.f89g != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.a) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup d2 = alertController.d(findViewById6, findViewById3);
        ViewGroup d3 = alertController.d(findViewById7, findViewById4);
        ViewGroup d4 = alertController.d(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) alertController.c.findViewById(R.id.scrollView);
        alertController.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) d3.findViewById(16908299);
        alertController.F = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.f88f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.A.removeView(alertController.F);
                if (alertController.f89g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.A.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(alertController.A);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(alertController.f89g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    d3.setVisibility(8);
                }
            }
        }
        Button button = (Button) d4.findViewById(16908313);
        alertController.o = button;
        button.setOnClickListener(alertController.R);
        if (TextUtils.isEmpty(alertController.p) && alertController.r == null) {
            alertController.o.setVisibility(8);
            z = false;
        } else {
            alertController.o.setText(alertController.p);
            Drawable drawable = alertController.r;
            if (drawable != null) {
                int i3 = alertController.f86d;
                drawable.setBounds(0, 0, i3, i3);
                alertController.o.setCompoundDrawables(alertController.r, null, null, null);
            }
            alertController.o.setVisibility(0);
            z = true;
        }
        Button button2 = (Button) d4.findViewById(16908314);
        alertController.s = button2;
        button2.setOnClickListener(alertController.R);
        if (TextUtils.isEmpty(alertController.t) && alertController.v == null) {
            alertController.s.setVisibility(8);
        } else {
            alertController.s.setText(alertController.t);
            Drawable drawable2 = alertController.v;
            if (drawable2 != null) {
                int i4 = alertController.f86d;
                drawable2.setBounds(0, 0, i4, i4);
                alertController.s.setCompoundDrawables(alertController.v, null, null, null);
            }
            alertController.s.setVisibility(0);
            z |= true;
        }
        Button button3 = (Button) d4.findViewById(16908315);
        alertController.w = button3;
        button3.setOnClickListener(alertController.R);
        if (TextUtils.isEmpty(alertController.x) && alertController.z == null) {
            alertController.w.setVisibility(8);
            view = null;
        } else {
            alertController.w.setText(alertController.x);
            Drawable drawable3 = alertController.z;
            if (drawable3 != null) {
                int i5 = alertController.f86d;
                drawable3.setBounds(0, 0, i5, i5);
                view = null;
                alertController.w.setCompoundDrawables(alertController.z, null, null, null);
            } else {
                view = null;
            }
            alertController.w.setVisibility(0);
            z |= true;
        }
        Context context = alertController.a;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (z) {
                alertController.b(alertController.o);
            } else if (z) {
                alertController.b(alertController.s);
            } else if (z) {
                alertController.b(alertController.w);
            }
        }
        if (!(z)) {
            d4.setVisibility(8);
        }
        if (alertController.G != null) {
            d2.addView(alertController.G, 0, new ViewGroup.LayoutParams(-1, -2));
            alertController.c.findViewById(R.id.title_template).setVisibility(8);
        } else {
            alertController.D = (ImageView) alertController.c.findViewById(16908294);
            if ((!TextUtils.isEmpty(alertController.f87e)) && alertController.P) {
                TextView textView2 = (TextView) alertController.c.findViewById(R.id.alertTitle);
                alertController.E = textView2;
                textView2.setText(alertController.f87e);
                int i6 = alertController.B;
                if (i6 != 0) {
                    alertController.D.setImageResource(i6);
                } else {
                    Drawable drawable4 = alertController.C;
                    if (drawable4 != null) {
                        alertController.D.setImageDrawable(drawable4);
                    } else {
                        alertController.E.setPadding(alertController.D.getPaddingLeft(), alertController.D.getPaddingTop(), alertController.D.getPaddingRight(), alertController.D.getPaddingBottom());
                        alertController.D.setVisibility(8);
                    }
                }
            } else {
                alertController.c.findViewById(R.id.title_template).setVisibility(8);
                alertController.D.setVisibility(8);
                d2.setVisibility(8);
            }
        }
        boolean z3 = viewGroup.getVisibility() != 8;
        int i7 = (d2 == null || d2.getVisibility() == 8) ? 0 : 1;
        boolean z4 = d4.getVisibility() != 8;
        if (!z4 && (findViewById = d3.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i7 != 0) {
            NestedScrollView nestedScrollView2 = alertController.A;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = (alertController.f88f == null && alertController.f89g == null) ? view : d2.findViewById(R.id.titleDividerNoCustom);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = d3.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        ListView listView = alertController.f89g;
        if (listView instanceof AlertController.RecycleListView) {
            AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) listView;
            Objects.requireNonNull(recycleListView);
            if (!z4 || i7 == 0) {
                recycleListView.setPadding(recycleListView.getPaddingLeft(), i7 != 0 ? recycleListView.getPaddingTop() : recycleListView.f96f, recycleListView.getPaddingRight(), z4 ? recycleListView.getPaddingBottom() : recycleListView.f97g);
            }
        }
        if (!z3) {
            View view4 = alertController.f89g;
            if (view4 == null) {
                view4 = alertController.A;
            }
            if (view4 != null) {
                int i8 = i7 | (z4 ? 2 : 0);
                View findViewById11 = alertController.c.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = alertController.c.findViewById(R.id.scrollIndicatorDown);
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 23) {
                    AtomicInteger atomicInteger = z.a;
                    if (i9 >= 23) {
                        z.j.c(view4, i8, 3);
                    }
                    if (findViewById11 != null) {
                        d3.removeView(findViewById11);
                    }
                    if (findViewById12 != null) {
                        d3.removeView(findViewById12);
                    }
                } else {
                    if (findViewById11 != null && (i8 & 1) == 0) {
                        d3.removeView(findViewById11);
                        findViewById11 = view;
                    }
                    if (findViewById12 == null || (i8 & 2) != 0) {
                        view2 = findViewById12;
                    } else {
                        d3.removeView(findViewById12);
                        view2 = view;
                    }
                    if (findViewById11 != null || view2 != null) {
                        if (alertController.f88f != null) {
                            alertController.A.setOnScrollChangeListener(new c(alertController, findViewById11, view2));
                            alertController.A.post(new d(alertController, findViewById11, view2));
                        } else {
                            ListView listView2 = alertController.f89g;
                            if (listView2 != null) {
                                listView2.setOnScrollListener(new e(alertController, findViewById11, view2));
                                alertController.f89g.post(new f(alertController, findViewById11, view2));
                            } else {
                                if (findViewById11 != null) {
                                    d3.removeView(findViewById11);
                                }
                                if (view2 != null) {
                                    d3.removeView(view2);
                                }
                            }
                        }
                    }
                }
            }
        }
        ListView listView3 = alertController.f89g;
        if (listView3 == null || (listAdapter = alertController.H) == null) {
            return;
        }
        listView3.setAdapter(listAdapter);
        int i10 = alertController.I;
        if (i10 > -1) {
            listView3.setItemChecked(i10, true);
            listView3.setSelection(i10);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1479h.A;
        if (nestedScrollView != null && nestedScrollView.g(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1479h.A;
        if (nestedScrollView != null && nestedScrollView.g(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    @Override // e.b.c.s, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f1479h;
        alertController.f87e = charSequence;
        TextView textView = alertController.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
