package d19stringbuilder_buffer_accessmodifier_static;

public class Student02Runner {

    public static void main(String[] args) {
        //static class üyelerine ulaşmak için sadece class ismi yeterlidir
        System.out.println(Student02.stdname);
        // age non-static olduğu için ona ulaşmak için object oluşturmalıyız
        Student02 ali=new Student02();
        System.out.println(ali.age);


        Student02.staticMethod();
        ali.nonstaticMethod();

    }
}
