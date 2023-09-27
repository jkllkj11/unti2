/*public class Test {
    public static void main(String[] args) {
        HardDisk disk=new HardDisk();
        disk.setAmount(200);
        CPU cpu=new CPU();
        cpu.setspeed(2200);
        PC pc=new PC();
        pc.setCPU(cpu);
        pc.setHardDisk(disk);
        pc.show();
    }
}
class CPU{
   int speed;
   public void setspeed(int speed){
       this.speed=speed;
   }
   public int getSpeed(){
       return speed;
   }

}
class PC{
    CPU CPU;
    HardDisk HD;
    public void setCPU(CPU c){
        CPU=c;
    }
    public void setHardDisk(HardDisk h) {
        HD = h;
    }
    public void show(){
        System.out.println("CPU的速度为："+CPU.getSpeed());
        System.out.println("硬盘的容量为:"+HD.getAmount());
    }
}
class HardDisk{
    int amount;
    public void setAmount(int m){
        amount=m;
    }
    public int getAmount(){
        return amount;
    }
}*/
/*public class Test {
    public static void main(String[] args) {
        Student1 p=new Student1(1231,"s");
    }
}
class Student{
    int number;
    String name;
    public Student(){

    }
    public Student(int number,String name){
        this.name=name;
        this.number=number;
        System.out.println("我的名字是"+this.name+"  "+"xuehaoshi"+this.number);
    }
}
class Student1 extends Student{
    public Student1(int number,String name){
        super(number,name);
    }
}*/

/*class Animal{
    int num=10001;

    public void eat(){
        System.out.println("动物：吃");
    }
    public void shout(){
        System.out.println("动物：叫");
    }
}
class Dog extends Animal{
    int num=1002;
    public void eat(){
        System.out.println("dog：吃骨头");
    }
    public void shout(){
        System.out.println("汪汪汪汪");
    }
    public void print(){

        super.eat();
    }

}
class Cat extends Animal{
    public void eat(){
        System.out.println("cat：吃鱼");
    }
    public void shout(){
        System.out.println("喵喵喵");
    }
}*/
/*public class Test {
    public static void main(String[] args) {
        Animal a=new Dog();
        a.eat();

        if(a instanceof Animal){
            Dog m=(Dog)a;//向下类型转换
            ((Dog) a).want();
        }
    }
}

class Animal{
    int num=10001;
    public Animal(){
        System.out.println("我无处不在");
    }

    public void eat(){
        System.out.println("动物：吃");
    }
    public void shout(){
        System.out.println("动物：叫");
    }
}
class Dog extends Animal{
    public Dog(){
        super();
    }
    int num=1002;
    public void eat(){
        System.out.println("dog：吃骨头");
    }
    public void shout(){
        System.out.println("汪汪汪汪");
    }
    public void want(){
        System.out.println("我想要");
    }
    public void print(){

        super.eat();
    }

}
class Cat extends Animal{
    public void eat(){
        System.out.println("cat：吃鱼");
    }
    public void shout(){
        System.out.println("喵喵喵");
    }
}*/
