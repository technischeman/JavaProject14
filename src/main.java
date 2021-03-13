public class main {
    public static void main(String[] args) {
        attributes a1 = new attributes();
        attributes a2 = new attributes();
        attributes a3 = new attributes();
        attributes a4 = new attributes();
        attributes b1=new attributes();
        attributes b2=new attributes();
        attributes b3=new attributes();
        attributes b4=new attributes();
        attributes c1=new attributes();
        attributes c2=new attributes();
        attributes c3=new attributes();
        attributes c4=new attributes();
        a1.setName("ali");
        a2.setName("veli");
        a3.setName("kerem");
        a4.setName("vecih");
        b1.setAge(15);
        b2.setAge(17);
        b3.setAge(19);
        b4.setAge(21);
        c1.setCountry("turkie");
        c2.setCountry("deutsch");
        c3.setCountry("greece");
        c4.setCountry("italy");



        System.out.println("name+age+country of a1=" + a1.getName()+"  "+b1.getAge()+"  "+c1.getCountry());
        System.out.println("name+age+country of a2=" + a2.getName()+b2.getAge()+c2.getCountry());
        System.out.println("name+age+country of a3=" + a3.getName()+b3.getAge()+c3.getCountry());
        System.out.println("name+age+country of a4=" + a4.getName()+b4.getAge()+c4.getCountry());
    }
}
