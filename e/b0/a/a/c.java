package e.b0.a.a;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import com.arthenica.ffmpegkit.MediaInformation;
import com.google.logging.type.LogSeverity;
import java.util.ArrayList;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: AnimatorInflaterCompat.java */
/* loaded from: classes.dex */
public class c {

    /* compiled from: AnimatorInflaterCompat.java */
    /* loaded from: classes.dex */
    public static class a implements TypeEvaluator<e.i.d.d[]> {
        public e.i.d.d[] a;

        @Override // android.animation.TypeEvaluator
        public e.i.d.d[] evaluate(float f2, e.i.d.d[] dVarArr, e.i.d.d[] dVarArr2) {
            e.i.d.d[] dVarArr3 = dVarArr;
            e.i.d.d[] dVarArr4 = dVarArr2;
            if (e.i.a.e(dVarArr3, dVarArr4)) {
                if (!e.i.a.e(this.a, dVarArr3)) {
                    this.a = e.i.a.w(dVarArr3);
                }
                for (int i2 = 0; i2 < dVarArr3.length; i2++) {
                    e.i.d.d dVar = this.a[i2];
                    e.i.d.d dVar2 = dVarArr3[i2];
                    e.i.d.d dVar3 = dVarArr4[i2];
                    Objects.requireNonNull(dVar);
                    dVar.a = dVar2.a;
                    int i3 = 0;
                    while (true) {
                        float[] fArr = dVar2.b;
                        if (i3 < fArr.length) {
                            dVar.b[i3] = (dVar3.b[i3] * f2) + ((1.0f - f2) * fArr[i3]);
                            i3++;
                        }
                    }
                }
                return this.a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:181:0x034d, code lost:
        if (r26 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x034f, code lost:
        if (r13 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0351, code lost:
        r1 = new android.animation.Animator[r13.size()];
        r2 = r13.iterator();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0360, code lost:
        if (r2.hasNext() == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0362, code lost:
        r1[r3] = (android.animation.Animator) r2.next();
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x036e, code lost:
        if (r27 != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0370, code lost:
        r26.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0374, code lost:
        r26.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0377, code lost:
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.animation.Animator a(android.content.Context r21, android.content.res.Resources r22, android.content.res.Resources.Theme r23, org.xmlpull.v1.XmlPullParser r24, android.util.AttributeSet r25, android.animation.AnimatorSet r26, int r27, float r28) {
        /*
            Method dump skipped, instructions count: 888
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b0.a.a.c.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    public static Keyframe b(Keyframe keyframe, float f2) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f2);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f2);
        }
        return Keyframe.ofObject(f2);
    }

    public static PropertyValuesHolder c(TypedArray typedArray, int i2, int i3, int i4, String str) {
        int i5;
        PropertyValuesHolder ofInt;
        int i6;
        int i7;
        float f2;
        float f3;
        float f4;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i3);
        boolean z = peekValue != null;
        int i8 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i4);
        boolean z2 = peekValue2 != null;
        int i9 = z2 ? peekValue2.type : 0;
        if (i2 == 4) {
            i2 = ((z && d(i8)) || (z2 && d(i9))) ? 3 : 0;
        }
        boolean z3 = i2 == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i2 == 2) {
            String string = typedArray.getString(i3);
            String string2 = typedArray.getString(i4);
            e.i.d.d[] u = e.i.a.u(string);
            e.i.d.d[] u2 = e.i.a.u(string2);
            if (u == null && u2 == null) {
                return null;
            }
            if (u == null) {
                if (u2 != null) {
                    return PropertyValuesHolder.ofObject(str, new a(), u2);
                }
                return null;
            }
            a aVar = new a();
            if (u2 != null) {
                if (e.i.a.e(u, u2)) {
                    ofObject = PropertyValuesHolder.ofObject(str, aVar, u, u2);
                } else {
                    throw new InflateException(f.a.b.a.a.r(" Can't morph from ", string, " to ", string2));
                }
            } else {
                ofObject = PropertyValuesHolder.ofObject(str, aVar, u);
            }
            return ofObject;
        }
        d dVar = i2 == 3 ? d.a : null;
        if (z3) {
            if (z) {
                if (i8 == 5) {
                    f3 = typedArray.getDimension(i3, 0.0f);
                } else {
                    f3 = typedArray.getFloat(i3, 0.0f);
                }
                if (z2) {
                    if (i9 == 5) {
                        f4 = typedArray.getDimension(i4, 0.0f);
                    } else {
                        f4 = typedArray.getFloat(i4, 0.0f);
                    }
                    ofInt = PropertyValuesHolder.ofFloat(str, f3, f4);
                } else {
                    ofInt = PropertyValuesHolder.ofFloat(str, f3);
                }
            } else {
                if (i9 == 5) {
                    f2 = typedArray.getDimension(i4, 0.0f);
                } else {
                    f2 = typedArray.getFloat(i4, 0.0f);
                }
                ofInt = PropertyValuesHolder.ofFloat(str, f2);
            }
        } else if (!z) {
            if (z2) {
                if (i9 == 5) {
                    i5 = (int) typedArray.getDimension(i4, 0.0f);
                } else if (d(i9)) {
                    i5 = typedArray.getColor(i4, 0);
                } else {
                    i5 = typedArray.getInt(i4, 0);
                }
                ofInt = PropertyValuesHolder.ofInt(str, i5);
            }
            if (propertyValuesHolder == null && dVar != null) {
                propertyValuesHolder.setEvaluator(dVar);
                return propertyValuesHolder;
            }
        } else {
            if (i8 == 5) {
                i6 = (int) typedArray.getDimension(i3, 0.0f);
            } else if (d(i8)) {
                i6 = typedArray.getColor(i3, 0);
            } else {
                i6 = typedArray.getInt(i3, 0);
            }
            if (z2) {
                if (i9 == 5) {
                    i7 = (int) typedArray.getDimension(i4, 0.0f);
                } else if (d(i9)) {
                    i7 = typedArray.getColor(i4, 0);
                } else {
                    i7 = typedArray.getInt(i4, 0);
                }
                ofInt = PropertyValuesHolder.ofInt(str, i6, i7);
            } else {
                ofInt = PropertyValuesHolder.ofInt(str, i6);
            }
        }
        propertyValuesHolder = ofInt;
        return propertyValuesHolder == null ? propertyValuesHolder : propertyValuesHolder;
    }

    public static boolean d(int i2) {
        return i2 >= 28 && i2 <= 31;
    }

    public static ValueAnimator e(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f2, XmlPullParser xmlPullParser) {
        ValueAnimator valueAnimator2;
        TypedArray typedArray;
        TypedArray typedArray2;
        ValueAnimator valueAnimator3;
        TypedArray Q = e.i.a.Q(resources, theme, attributeSet, e.b0.a.a.a.f1874g);
        TypedArray Q2 = e.i.a.Q(resources, theme, attributeSet, e.b0.a.a.a.f1878k);
        ValueAnimator valueAnimator4 = valueAnimator == null ? new ValueAnimator() : valueAnimator;
        boolean G = e.i.a.G(xmlPullParser, MediaInformation.KEY_DURATION);
        int i2 = LogSeverity.NOTICE_VALUE;
        if (G) {
            i2 = Q.getInt(1, LogSeverity.NOTICE_VALUE);
        }
        long j2 = i2;
        int i3 = 0;
        long j3 = !e.i.a.G(xmlPullParser, "startOffset") ? 0 : Q.getInt(2, 0);
        int i4 = !e.i.a.G(xmlPullParser, "valueType") ? 4 : Q.getInt(7, 4);
        if (e.i.a.G(xmlPullParser, "valueFrom") && e.i.a.G(xmlPullParser, "valueTo")) {
            if (i4 == 4) {
                TypedValue peekValue = Q.peekValue(5);
                boolean z = peekValue != null;
                int i5 = z ? peekValue.type : 0;
                TypedValue peekValue2 = Q.peekValue(6);
                boolean z2 = peekValue2 != null;
                i4 = ((z && d(i5)) || (z2 && d(z2 ? peekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder c = c(Q, i4, 5, 6, "");
            if (c != null) {
                valueAnimator4.setValues(c);
            }
        }
        valueAnimator4.setDuration(j2);
        valueAnimator4.setStartDelay(j3);
        valueAnimator4.setRepeatCount(!e.i.a.G(xmlPullParser, "repeatCount") ? 0 : Q.getInt(3, 0));
        valueAnimator4.setRepeatMode(!e.i.a.G(xmlPullParser, "repeatMode") ? 1 : Q.getInt(4, 1));
        if (Q2 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator4;
            String D = e.i.a.D(Q2, xmlPullParser, "pathData", 1);
            if (D != null) {
                String D2 = e.i.a.D(Q2, xmlPullParser, "propertyXName", 2);
                String D3 = e.i.a.D(Q2, xmlPullParser, "propertyYName", 3);
                if (D2 == null && D3 == null) {
                    throw new InflateException(Q2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path v = e.i.a.v(D);
                float f3 = 0.5f * f2;
                PathMeasure pathMeasure = new PathMeasure(v, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f4 = 0.0f;
                do {
                    f4 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f4));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(v, false);
                int min = Math.min(100, ((int) (f4 / f3)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f5 = f4 / (min - 1);
                valueAnimator2 = valueAnimator4;
                typedArray = Q;
                int i6 = 0;
                float f6 = 0.0f;
                while (true) {
                    if (i3 >= min) {
                        break;
                    }
                    int i7 = min;
                    pathMeasure2.getPosTan(f6 - ((Float) arrayList.get(i6)).floatValue(), fArr3, null);
                    fArr[i3] = fArr3[0];
                    fArr2[i3] = fArr3[1];
                    f6 += f5;
                    int i8 = i6 + 1;
                    if (i8 < arrayList.size() && f6 > ((Float) arrayList.get(i8)).floatValue()) {
                        pathMeasure2.nextContour();
                        i6 = i8;
                    }
                    i3++;
                    min = i7;
                }
                PropertyValuesHolder ofFloat = D2 != null ? PropertyValuesHolder.ofFloat(D2, fArr) : null;
                PropertyValuesHolder ofFloat2 = D3 != null ? PropertyValuesHolder.ofFloat(D3, fArr2) : null;
                if (ofFloat == null) {
                    i3 = 0;
                    objectAnimator.setValues(ofFloat2);
                } else {
                    i3 = 0;
                    if (ofFloat2 == null) {
                        objectAnimator.setValues(ofFloat);
                    } else {
                        objectAnimator.setValues(ofFloat, ofFloat2);
                    }
                }
            } else {
                valueAnimator2 = valueAnimator4;
                typedArray = Q;
                objectAnimator.setPropertyName(e.i.a.D(Q2, xmlPullParser, "propertyName", 0));
            }
        } else {
            valueAnimator2 = valueAnimator4;
            typedArray = Q;
        }
        if (e.i.a.G(xmlPullParser, "interpolator")) {
            typedArray2 = typedArray;
            i3 = typedArray2.getResourceId(i3, i3);
        } else {
            typedArray2 = typedArray;
        }
        if (i3 > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(AnimationUtils.loadInterpolator(context, i3));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        typedArray2.recycle();
        if (Q2 != null) {
            Q2.recycle();
        }
        return valueAnimator3;
    }
}
