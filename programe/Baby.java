package programe;

public class Baby {
    private String name;
    private int id;
    private Date birthDate;
    private Weight birthWeight;
    private Weight currentWeight;
    public Baby(String name,int id,Date birthDate,Weight birthWeight){
        this.name = name;
        if (id/1000000000>0&&id/100000000<0){
            id=0;
        }
        this.id = id;
        this.birthDate=birthDate;
        this.birthWeight = birthWeight;
    }
}
