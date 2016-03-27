/**
 * Created by Mike on 26.03.2016.
 */
public class L26_Main {
    public static void main(String[] args) {
        GenericWriting.f1();

        Box<Integer> integerBox = new BoxImpl<Integer>();
        Box<Number> numberBox = new BoxImpl<Number>();
//        numberBox.put(integerBox);  //Error
        numberBox.putExtended(integerBox);  //No error

        Box.EqualityComparator<Object> sameObjectComparator = new Box.EqualityComparator<Object>() {

            public boolean compare(Object o1, Object o2) {
                return o1 == o2;
            }
        };
//        boolean b = numberBox.containsSame(integerBox, sameObjectComparator);   //Error
        boolean b = numberBox.containsSameExtended(integerBox, sameObjectComparator);
    }
}
