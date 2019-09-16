package z_19_01_2627.Programisci;

public enum JezykProgramowania {
    JAVA("java"),
    PYTHON("python"),
    C("c"),
    CPLUSPLUS("c++"),
    CSHARP("c#"),
    JAVASCRIPT("js"),
    PHP("php");

    private String nazwaKodowa;

    JezykProgramowania(String nazwaKodowa) {
        this.nazwaKodowa = nazwaKodowa;
    }

    public void setNazwaKodowa(String nazwaKodowa) {
        this.nazwaKodowa = nazwaKodowa;
    }

}

