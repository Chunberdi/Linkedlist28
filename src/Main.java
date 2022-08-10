import jdk.internal.icu.text.UnicodeSet;

import java.security.DigestException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {


    private static UnicodeSet listcat;

    public static void main(String[] args) {
        System.out.println("Hello world!");
        LinkedList<Animals> list = new LinkedList<>();
        LinkedList<Animals> list1 = new LinkedList<>();
        int catAge = 1;
        int docAge = 1;


        for (int i = 0; i < 50; i++) {
            list.add(new Cat(catAge++));
            list.add(new Doc(docAge++));


        }

        int coount = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof Cat){
                coount++;
                if(coount==41){
                    list.remove(list.get(i));
                }
            }

        }
        coount = 0;
        int mouseAge = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)instanceof Doc){
                coount++;
                if (coount % 3 == 0){ // ==3
                    list.add(i +1,new Mouse(mouseAge++));
                   // coount = 0;
                }
            }

            for (int j = 0; j < list.size(); j++) {
                if (list.get(i)instanceof Cat){
                    if(list.get(i - 1)instanceof Mouse){//|| list.get(i + 1) instanceof Mouse ){
                        listcat.add(((Cat) list.get(i)).getAge());
                        list.remove(list.get(i));
                    }


                }

            }

        }
        System.out.println(list);






        /*
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }










    LinkedList<String> linkedList = new LinkedList<>();
    linkedList.add("one");
    linkedList.addFirst("1,5");
    linkedList.add("two");
    linkedList.add("trow");
    linkedList.addLast("four");


    System.out.println(linkedList);
    System.out.println(linkedList.peekFirst());
    System.out.println(linkedList.peekLast());
    System.out.println(linkedList.remove(4));

   // System.out.println(linkedList.size());*/
        }
}