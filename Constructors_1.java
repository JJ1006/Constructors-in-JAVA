
class team{
    private int id;
    private String name;

    public team(int myid, String myname){
        id = 10;
        name = myname;
    }

    public String getname(){
        return name;
    }
    public void setname(String n){
        this.name = n;
    }
    public void setid(int i){
        this.id = i;
    }
    public int getid(){
        return id;
    }
}

public class Constructors_1 {
    public static void main(String[] args) {
        team Jaahanava = new team(10, "JJ");
        System.out.println(Jaahanava.getid());
        System.out.println(Jaahanava.getname());
    }
}
