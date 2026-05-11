class A{
    void print(){
        System.out.println("class A");
    } 
}
class B extends A{
    void print(){
        System.out.println("class B");
    }


    public static void main(String[] args) {
        A t=new A();
        t.print();
    }

}