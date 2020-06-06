package Test;

public class This {
    int id;
    String name;
    This( int maSo , String ten){
        this.id = maSo;
        this.name = ten;
    }

    void display(){
        System.out.println( id + " " + name);
    }

    public static void main(String[] args) {
        This user1 = new This( 123 , "lam");
        This user2 = new This(122,"nam");
        user1.display();
        user2.display();
    }
}
