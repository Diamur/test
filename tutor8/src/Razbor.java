import java.util.*;

class Razbor2{

static Vector v = new Vector();
static String s = "Строка, которую мы хотим разобрать на слова."; 
static StringTokenizer st = new StringTokenizer(s, " \t\n\r,."); 

		public static void main(String[] args){ 
					
while (st.hasMoreTokens()){     // Получаем слово и заносим в вектор.
				v.add(st.nextToken());                                 // Добавляем в конец вектора }
				System.out.println(v.firstElement());                      // Первый элемент 
				System.out.println(v.lastElement());                        // Последний элемент 
				v.setSize(4);                                               // Уменьшаем число элементов
				v.add("собрать.");                                         // Добавляем в конец укороченного вектора 
				v.set(3, "опять");                                          // Ставим в позицию 3
				for (int i = 0; i < v.size(); i++)                           // Перебираем весь вектор
				System.out.print(v.get(i) + "."); 
				System.out.println();
                ListIterator lit = v.listIterator();                       // получаем итератор вектора
		try{
			while(lit.hasNext())                                     // Пока в векторе есть элементы,
			System.out.println(lit.next());           // выводим текущий элемент 
			
			while (lit.hasPrevious ())
            System.out.println(lit.previous());
			
			}
		catch(Exception e){};
		}
	} 
}