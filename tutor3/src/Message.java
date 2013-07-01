public class Message
{
public static void main(String[] args)
{
if (args[0].equals("-h"))
System.out.print ("Здравствуй,");
else if (args[0].equals("-g"))
System.out.print("Прощай,");
// Печатает другие аргументы командной строки,
for (int i = 1; i < args.length; i++)
System.out.print(" " + args[i]);
System.out.print("!");
    st
}
}