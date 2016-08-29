package ua.com.juja.a4fourthWeek.quiz17.a;

/**
 * Created by oleksandr.baglai on 29.12.2015.
 */
public class Main {
    public static void main(String[] args) {
        InnerClass1 inner11 = new InnerClass1();
        InnerClass1 inner12 = new InnerClass1();
        InnerClass1 inner13 = new InnerClass1();
        InnerClass1 inner14 = new InnerClass1();
        InnerClass1 inner15 = new InnerClass1();

        AppStaticInner.InnerClass2 inner21 = new AppStaticInner.InnerClass2();
        AppStaticInner.InnerClass2 inner22 = new AppStaticInner.InnerClass2();
        AppStaticInner.InnerClass2 inner23 = new AppStaticInner.InnerClass2();
        AppStaticInner.InnerClass2 inner24 = new AppStaticInner.InnerClass2();
        AppStaticInner.InnerClass2 inner25 = new AppStaticInner.InnerClass2();

        AppInner appInner1 = new AppInner();
        AppInner.InnerClass3 inner31 = appInner1.new InnerClass3();
        AppInner.InnerClass3 inner32 = appInner1.new InnerClass3();
        AppInner.InnerClass3 inner33 = appInner1.new InnerClass3();

        AppInner appInner2 = new AppInner();
        AppInner.InnerClass3 inner34 = appInner2.new InnerClass3();
        AppInner.InnerClass3 inner35 = appInner2.new InnerClass3();

        inner35.get();
        inner32.get();
    }
}
