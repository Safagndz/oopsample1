
public class sixthprogram {
    public static void main(String args[]){
        School scholl = new School("Erguvan IO", 1, "Üstün Zeka", "Bahçelievler", true);
        person person = new person(22,"Sefa", "Gündüz", "Erkek", 45, scholl);
//        person.setFootNo(50);
//        person.setName("Sefa");
//        person.setAge(22);
        System.out.println ("Hello Sefa " +  person.toString());
    }
}


