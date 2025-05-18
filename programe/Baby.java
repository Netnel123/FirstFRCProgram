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
    public Baby(Baby other){
        other.birthWeight=birthWeight;
        other.birthDate = birthDate;
        other.name = name;
        other.id = id;
        other.currentWeight = currentWeight;
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
        if (other == this){
            return true;
        }
        else {
            return false;
        }
    }
    public void updateCurrentWeight (int grams){
        if(grams+currentWeight.grams<0){

        }else{
          currentWeight= currentWeight.add(new Weight(0,grams));
        }
    }
    public boolean isWeightInValidRange(Date date){
        if (birthDate.month == date.month){
            if (birthDate.day>=date.day-6){
               if (birthWeight.grams-10>currentWeight.grams){
                   return false;
               }else {
                   return true;
               }
            } else if (birthDate.day>=date.day-30){
                if(currentWeight.grams>birthWeight.grams+((date.day-6)*30)){
                    return true;
                }else {
                    return false;
                }
            }
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
