package com.google.firebase.inappmessaging.display.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Application;
import android.graphics.Point;
import android.view.View;
import com.google.firebase.inappmessaging.display.internal.injection.scopes.FirebaseAppScope;

@FirebaseAppScope
/* loaded from: classes2.dex */
public class FiamAnimator {

    /* renamed from: com.google.firebase.inappmessaging.display.internal.FiamAnimator$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$firebase$inappmessaging$display$internal$FiamAnimator$Position;

        static {
            Position.values();
            int[] iArr = new int[4];
            $SwitchMap$com$google$firebase$inappmessaging$display$internal$FiamAnimator$Position = iArr;
            try {
                Position position = Position.LEFT;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$com$google$firebase$inappmessaging$display$internal$FiamAnimator$Position;
                Position position2 = Position.RIGHT;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = $SwitchMap$com$google$firebase$inappmessaging$display$internal$FiamAnimator$Position;
                Position position3 = Position.TOP;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = $SwitchMap$com$google$firebase$inappmessaging$display$internal$FiamAnimator$Position;
                Position position4 = Position.BOTTOM;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface AnimationCompleteListener {
        void onComplete();
    }

    /* loaded from: classes2.dex */
    public enum Position {
        LEFT,
        RIGHT,
        TOP,
        BOTTOM;

        /* JADX INFO: Access modifiers changed from: private */
        public static Point getPoint(Position position, View view) {
            view.measure(-2, -2);
            int ordinal = position.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            return new Point(0, view.getMeasuredHeight() * (-1));
                        }
                        return new Point(0, view.getMeasuredHeight() * 1);
                    }
                    return new Point(0, view.getMeasuredHeight() * (-1));
                }
                return new Point(view.getMeasuredWidth() * 1, 0);
            }
            return new Point(view.getMeasuredWidth() * (-1), 0);
        }
    }

    public void slideIntoView(final Application application, final View view, Position position) {
        view.setAlpha(0.0f);
        Point point = Position.getPoint(position, view);
        view.animate().translationX(point.x).translationY(point.y).setDuration(1L).setListener(new AnimatorListenerAdapter() { // from class: com.google.firebase.inappmessaging.display.internal.FiamAnimator.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                view.animate().translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(application.getResources().getInteger(17694722)).setListener(null);
            }
        });
    }

    public void slideOutOfView(Application application, View view, Position position, final AnimationCompleteListener animationCompleteListener) {
        Point point = Position.getPoint(position, view);
        view.animate().translationX(point.x).translationY(point.y).setDuration(application.getResources().getInteger(17694722)).setListener(new AnimatorListenerAdapter() { // from class: com.google.firebase.inappmessaging.display.internal.FiamAnimator.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                animationCompleteListener.onComplete();
            }
        });
    }
}
