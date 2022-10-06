

/**
 *
 * @author Zinhle
 */
public class TestMyLinkedList {

    public static void main(String[] args) {
        MyLinkedList<Integer> list1= new MyLinkedList<>();
        MyLinkedList<Integer> list2= new MyLinkedList<>();
        
        System.out.println("Test Empty");
        System.out.println("List Before: "+list1);
        list2=list1.makePalindrome();
        System.out.println("List After: "+list2);
        
        
        System.out.println("\nAdd to List and Test");
        list1.append(new Integer(8));
        list1.append(new Integer(1));
        list1.append(new Integer(0));
        list1.append(new Integer(6));
        list1.append(new Integer(12));
        System.out.println("List Before: "+list1);
        list2=list1.makePalindrome();
        System.out.println("List After: "+list2);
        
        
    }
    
}
