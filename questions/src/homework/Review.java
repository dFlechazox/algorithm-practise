package homework;

public class Review {
    protected int name;
    Review review = new Review();

    public int getName() {
        return name;
    }
}

class Review01 extends Review{
    Review01 review01 = new Review01();
    public  void main(String args[]){
        int a = review01.name;
    }
    int b = getName();
}


