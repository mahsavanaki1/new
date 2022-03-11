package lesson;

public class Main {

    public static void main(String[] args) {
        Lesson mabaniReizi = new Lesson("mabani Reizi", 3);
        Lesson hendeseh = new Lesson("hendeseh", 3);
        hendeseh.setNeeds(new Lesson[]{mabaniReizi});
        Lesson hendesehMozeie = new Lesson("hendeseh Mozeie", 4);
        hendesehMozeie.setNeeds(new Lesson[]{new Lesson("riazi1", 3),new Lesson("riazi2", 3)});
        hendesehMozeie.setPrerequisites(new Lesson[]{hendeseh,mabaniReizi});
        System.out.println(mabaniReizi);
        System.out.println(hendeseh);
        System.out.println(hendesehMozeie);
    }

}
