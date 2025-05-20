package programe;

public class Weight {
    private int kg;
    public int grams;
    public Weight(int kg, int grams){
        this.grams=grams;
        this.kg=kg;
        if (grams>999){
            this.kg+=(grams/1000);
            this.grams-=1000*(grams/1000);
        }
    }
    public String toString(){
        return "kg: "+kg+" grams: "+grams;
    }
    public boolean equals(Weight other){
        if (other.grams==this.grams&&other.kg==this.kg){
            return true;
        }else {
            return false;
        }
    }
    public boolean lessThan(Weight other) {
            if (other.grams < this.grams && other.kg < this.kg) {
                return true;
            } else {
                return false;
            }
    }
    public Weight add(Weight other){
        other.kg+=this.kg;
        other.grams+=this.grams;
        if (other.kg>999){
            int GramsToAdd;
            GramsToAdd = other.kg/1000;
            other.kg=GramsToAdd*1000;
            other.grams +=GramsToAdd;
        }
        return other;
    }
}
