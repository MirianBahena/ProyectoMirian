public class Student {
    private long controlNumber;
    private String name;
    private  String lastName;
    private String career;
    private int semester;

    public Student() {
        this.controlNumber = controlNumber;
        this.name = name;
        this.lastName = lastName;
        this.career = career;
        this.semester = semester;
    }

    public long getControlNumber() {
        return controlNumber;
    }

    public void setControlNumber(long controlNumber) {
        this.controlNumber = controlNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }



    public String toString (){
        System.out.println("Los datos del estudiante: ");
        System.out.println("Nombre: "+ getName());
        System.out.println("Apellido: "+ getLastName());
        System.out.println("El numero de control es:"+getControlNumber());
        System.out.println("El semestre es: "+ getSemester());
        System.out.println("La carrera es: "+ getCareer());
        return "";
    }

    }


