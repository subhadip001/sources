package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.video_converter.video_compressor.R;
import e.b.b;
import e.b.g.i.i;
import e.b.g.i.n;
import e.b.h.z0;
import e.i.j.z;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: f  reason: collision with root package name */
    public i f113f;

    /* renamed from: g  reason: collision with root package name */
    public ImageView f114g;

    /* renamed from: h  reason: collision with root package name */
    public RadioButton f115h;

    /* renamed from: i  reason: collision with root package name */
    public TextView f116i;

    /* renamed from: j  reason: collision with root package name */
    public CheckBox f117j;

    /* renamed from: k  reason: collision with root package name */
    public TextView f118k;

    /* renamed from: l  reason: collision with root package name */
    public ImageView f119l;

    /* renamed from: m  reason: collision with root package name */
    public ImageView f120m;
    public LinearLayout n;
    public Drawable o;
    public int p;
    public Context q;
    public boolean r;
    public Drawable s;
    public boolean t;
    public LayoutInflater u;
    public boolean v;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z0 q = z0.q(getContext(), attributeSet, b.s, R.attr.listMenuViewStyle, 0);
        this.o = q.g(5);
        this.p = q.l(1, -1);
        this.r = q.a(7, false);
        this.q = context;
        this.s = q.g(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.t = obtainStyledAttributes.hasValue(0);
        q.b.recycle();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.u == null) {
            this.u = LayoutInflater.from(getContext());
        }
        return this.u;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f119l;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public final void a() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f117j = checkBox;
        LinearLayout linearLayout = this.n;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f120m;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f120m.getLayoutParams();
        rect.top = this.f120m.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    public final void b() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f115h = radioButton;
        LinearLayout linearLayout = this.n;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }

    public void c(boolean z) {
        String sb;
        int i2 = (z && this.f113f.n()) ? 0 : 8;
        if (i2 == 0) {
            TextView textView = this.f118k;
            i iVar = this.f113f;
            char e2 = iVar.e();
            if (e2 == 0) {
                sb = "";
            } else {
                Resources resources = iVar.n.a.getResources();
                StringBuilder sb2 = new StringBuilder();
                if (ViewConfiguration.get(iVar.n.a).hasPermanentMenuKey()) {
                    sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i3 = iVar.n.n() ? iVar.f1671k : iVar.f1669i;
                i.c(sb2, i3, LogFileManager.MAX_LOG_SIZE, resources.getString(R.string.abc_menu_meta_shortcut_label));
                i.c(sb2, i3, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                i.c(sb2, i3, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                i.c(sb2, i3, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                i.c(sb2, i3, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                i.c(sb2, i3, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (e2 == '\b') {
                    sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (e2 == '\n') {
                    sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (e2 != ' ') {
                    sb2.append(e2);
                } else {
                    sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                sb = sb2.toString();
            }
            textView.setText(sb);
        }
        if (this.f118k.getVisibility() != i2) {
            this.f118k.setVisibility(i2);
        }
    }

    @Override // e.b.g.i.n.a
    public void d(i iVar, int i2) {
        this.f113f = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.f1665e);
        setCheckable(iVar.isCheckable());
        boolean n = iVar.n();
        iVar.e();
        c(n);
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.q);
    }

    @Override // e.b.g.i.n.a
    public i getItemData() {
        return this.f113f;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = this.o;
        AtomicInteger atomicInteger = z.a;
        z.d.q(this, drawable);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f116i = textView;
        int i2 = this.p;
        if (i2 != -1) {
            textView.setTextAppearance(this.q, i2);
        }
        this.f118k = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f119l = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.s);
        }
        this.f120m = (ImageView) findViewById(R.id.group_divider);
        this.n = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        if (this.f114g != null && this.r) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f114g.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.f115h == null && this.f117j == null) {
            return;
        }
        if (this.f113f.h()) {
            if (this.f115h == null) {
                b();
            }
            compoundButton = this.f115h;
            compoundButton2 = this.f117j;
        } else {
            if (this.f117j == null) {
                a();
            }
            compoundButton = this.f117j;
            compoundButton2 = this.f115h;
        }
        if (z) {
            compoundButton.setChecked(this.f113f.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f117j;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f115h;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f113f.h()) {
            if (this.f115h == null) {
                b();
            }
            compoundButton = this.f115h;
        } else {
            if (this.f117j == null) {
                a();
            }
            compoundButton = this.f117j;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.v = z;
        this.r = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f120m;
        if (imageView != null) {
            imageView.setVisibility((this.t || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        Objects.requireNonNull(this.f113f.n);
        boolean z = this.v;
        if (z || this.r) {
            ImageView imageView = this.f114g;
            if (imageView == null && drawable == null && !this.r) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f114g = imageView2;
                LinearLayout linearLayout = this.n;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.r) {
                this.f114g.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f114g;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f114g.getVisibility() != 0) {
                this.f114g.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f116i.setText(charSequence);
            if (this.f116i.getVisibility() != 0) {
                this.f116i.setVisibility(0);
            }
        } else if (this.f116i.getVisibility() != 8) {
            this.f116i.setVisibility(8);
        }
    }
}
