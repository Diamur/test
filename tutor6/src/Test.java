import java.util.*;

public  class Test  {

    public static void main(String[] args)  {
	Vector v = new Vector();
	String s = "Строка, которую мы хотим разобрать на слова.";
	StringTokenizer st = new StringTokenizer(s, " \t\n\r,.");


 while (st.hasMoreTokens()) {
   // Получаем слово и заносим в вектор
  v.add(st.nextToken());                                         // Добавляем в конец вектора 
}
System.out.println(v.firstElement());       // Первый элемент
System.out.println(v.lastElement());        // Последний элемент
 v.setSize(4);                              // Уменьшаем число элементов 
v.add("собрать.");                         // Добавляем в конец
                                            // укороченного вектора
v.set(3, "опять");                          // Ставим в позицию 3 
for (int i = 0; i < v.size(); i++)         // Перебираем весь вектор
System.out.print(v.get(i) + " "); 
System.out.println();
    }
}