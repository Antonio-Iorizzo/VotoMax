class Calcolo{
    private double max;

    public double max(double n1, double n2, double n3){
        if(n1>n2){
            if(n1>n3){
                this.max=n1;
            }else{
                this.max=n3;
            }
        }else{
            if(n2>n3){
            this.max=n2;
            }else{
             this.max=n3;
            }
        }
        return this.max;
    }

    public String toString(){
        return "(" + Double.toString(this.max) + ")";
    }
}