package e.b.h;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* compiled from: AppCompatTextClassifierHelper.java */
/* loaded from: classes.dex */
public final class x {
    public TextView a;
    public TextClassifier b;

    public x(TextView textView) {
        this.a = textView;
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.b;
        if (textClassifier == null) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) this.a.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            return TextClassifier.NO_OP;
        }
        return textClassifier;
    }
}
