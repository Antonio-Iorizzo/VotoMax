class AlunnoTest{
    public static void main(String[] args){
        Alunno g=new Alunno('A', 7.0);
        Alunno f=new Alunno('F', 9.0);
        Alunno h=new Alunno('C', 8.0);
        Calcolo j=new Calcolo();
        

        j.max(7.0, 9.0, 8.0);
        
        System.out.println(j);
    }
}