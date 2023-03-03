public class testStudend {
    public static void main(String[] args) {
        System.out.println("Probando clase Student");
        Student mirian18 = new Student();

        mirian18.setName("Mirian");
        mirian18.setLastName("Bahena");
        mirian18.setCareer("Ingenieria Informatica");
        mirian18.setControlNumber(22670052L);
        mirian18.setSemester(2);

        mirian18.toString();
        mirian18.setName("Juan Pedro");
        mirian18.toString();
    }



}
