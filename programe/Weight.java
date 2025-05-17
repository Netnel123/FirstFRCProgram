package programe;

public class Weight {
    private int kg;
    private int grams;
    public Weight(int kg, int grams){
        this.grams=grams;
        this.kg=kg;
        if (grams>999){
            this.kg+=(grams/1000);
            this.grams-=1000*(grams/1000);
        }
    }
    public String toString(){
        String toStr;
        toStr = "kg: "+kg+" grams: "+grams;
        return toStr;
    }
    public boolean equals(Weight other){
        if (other.grams==this.grams&&other.kg==this.kg){
            return true;
        }else {
            return false;
        }
    }
    public boolean lessThan(Weight other){
        if (other.grams<=this.grams&&other.kg<=this.kg){
            return true;
        }else {
            return false;
        }
    }
    public Weight add(Weight other){
        other.kg+=this.kg;
        other.grams=this.grams;
        return other;
    }
}
