package programe;

public class Baby {
    private String name;
    private String id;
    private Date birthDate;
    private Weight birthWeight;
    private Weight currentWeight;
    public Baby(String name,int id,Date birthDate,Weight birthWeight){
        this.name = name;
        this.id = ""+id;
        if (id/1000000000>0||id<100000000){
            this.id = "000000000";
        }
        this.birthDate=birthDate;
        this.birthWeight = birthWeight;
        currentWeight = this.birthWeight;
    }
    public Baby ClonBaby(Baby other){
        other = this;
        return other;
    }


    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public Date getDateOfBirth(){
        return birthDate;
    }
    public Weight getBirthWeight(){
        return birthWeight;
    }
    public Weight getCurrentWeight(){
        return currentWeight;
    }
    public void setCurrentWeight(Weight weightToSet){
        currentWeight = weightToSet;
    }
    public String toString(){
        //Name: Ariel Israeli
        //Id: 123456789
        //Date of Birth: 03/08/2024
        //Birth Weight: 3.005
        //Current Weight: 3.425
        String stut;
        stut = "Name: "+name+"\n"+
                "id: "+id+"\n"+
                "Date of Birth: " + birthDate.toString() +"\n"+
                "Birth Weight " + birthWeight.toString() +"\n"+
                "Current Weight " + currentWeight.toString();
        return stut;
    }
    public boolean equals (Baby other){
        if (other.currentWeight == this.currentWeight&&
                other.id == this.id&&
                other.name == this.name&&
                other.birthDate == this.birthDate&&
                other.birthWeight == this.birthWeight){
            return true;
        }
        else {
            return false;
        }
    }

    public void updateCurrentWeight (int grams){
        if(grams+currentWeight.grams<0){

        }else{
            currentWeight.add(new Weight(0,grams));
        }
    }
    public boolean isWeightInValidRange(Date date){
        if (birthDate.month == date.month){
            if (birthDate.day>=date.day-6){
               if (currentWeight.lessThan(birthWeight.add(new Weight(0,-10)))){
                   return true;
               }else {
                   return false;
               }
            } else {
                if (currentWeight.lessThan(birthWeight.add(
                        new Weight(0,30*(date.day-birthDate.day))))){
                    return false;
                }else {
                    return true;
                }
            }
        }else if(birthDate.month+1==date.month){
            if (currentWeight.lessThan(birthWeight.add(
                    new Weight(0,30*(24+(date.day-birthDate.day)))))){
                return false;
            }else {
                return true;
            }
            //אד לפו אסיתי לבנטיים(אני לא בטוח שדרך החישוב שעסיתי נחון)
        }else if(birthDate.month+4 >= date.month){
            if (currentWeight.grams>=birthWeight.grams+(date.month*750)){
                return true;
            }else {
                return false;
            }
        } else if (birthDate.month+8>=date.month){
            if (currentWeight.grams>=birthWeight.grams+3000+((date.month-4)*500)){
                return true;
            }else {
                return false;
            }
        }else if (birthDate.month+12>=date.month){
            if (currentWeight.grams>=birthWeight.grams+5000+((date.month-8)*250)){
                return true;
            }else {
                return false;
            }
        }
        return false;
    }
}
