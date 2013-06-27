interface Voice{

void voice(); 

}

class Dog implements Voice{

  public void voice (){

    System.out.println("Gav-gav!");

  } 

}

class Cat implements Voice{

  public void voice (){

    System.out.println("Miaou!");

  } 

}

class Cow implements Voice{ 

  public void voice(){

    System.out.println("Mu-u-u!"); 

  }

}

public class Chorus{

  public static void main(String[] args){ 

    Voice[] singer = new Voice[3]; 

    singer[0] = new Dog(); 

    singer[1] = new Cat(); 

    singer[2] = new Cow(); 

    for(int i = 0; i < singer.length; i++)

      singer[i].voice();

  }

}