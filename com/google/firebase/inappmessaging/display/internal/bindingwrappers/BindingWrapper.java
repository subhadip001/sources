package com.google.firebase.inappmessaging.display.internal.bindingwrappers;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import com.google.firebase.inappmessaging.display.internal.InAppMessageLayoutConfig;
import com.google.firebase.inappmessaging.display.internal.Logging;
import com.google.firebase.inappmessaging.model.Action;
import com.google.firebase.inappmessaging.model.InAppMessage;
import e.i.a;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class BindingWrapper {
    public final InAppMessageLayoutConfig config;
    public final LayoutInflater inflater;
    public final InAppMessage message;

    public BindingWrapper(InAppMessageLayoutConfig inAppMessageLayoutConfig, LayoutInflater layoutInflater, InAppMessage inAppMessage) {
        this.config = inAppMessageLayoutConfig;
        this.inflater = layoutInflater;
        this.message = inAppMessage;
    }

    public static void setButtonBgColorFromHex(Button button, String str) {
        try {
            Drawable l0 = a.l0(button.getBackground());
            l0.setTint(Color.parseColor(str));
            button.setBackground(l0);
        } catch (IllegalArgumentException e2) {
            StringBuilder A = f.a.b.a.a.A("Error parsing background color: ");
            A.append(e2.toString());
            Logging.loge(A.toString());
        }
    }

    public static void setupViewButtonFromModel(Button button, com.google.firebase.inappmessaging.model.Button button2) {
        String hexColor = button2.getText().getHexColor();
        setButtonBgColorFromHex(button, button2.getButtonHexColor());
        button.setText(button2.getText().getText());
        button.setTextColor(Color.parseColor(hexColor));
    }

    public boolean canSwipeToDismiss() {
        return false;
    }

    public InAppMessageLayoutConfig getConfig() {
        return this.config;
    }

    public abstract View getDialogView();

    public View.OnClickListener getDismissListener() {
        return null;
    }

    public abstract ImageView getImageView();

    public abstract ViewGroup getRootView();

    public abstract ViewTreeObserver.OnGlobalLayoutListener inflate(Map<Action, View.OnClickListener> map, View.OnClickListener onClickListener);

    public void setButtonActionListener(Button button, View.OnClickListener onClickListener) {
        if (button != null) {
            button.setOnClickListener(onClickListener);
        }
    }

    public void setViewBgColorFromHex(View view, String str) {
        if (view == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            view.setBackgroundColor(Color.parseColor(str));
        } catch (IllegalArgumentException e2) {
            StringBuilder A = f.a.b.a.a.A("Error parsing background color: ");
            A.append(e2.toString());
            A.append(" color: ");
            A.append(str);
            Logging.loge(A.toString());
        }
    }
}
