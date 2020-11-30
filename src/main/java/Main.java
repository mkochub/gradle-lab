public class Main {
 public static void main(String[]args) {

   // Should print "this is a secret string from Public Library"
   System.out.println(PublicLibrary.getString());

   //This Secret class should not be able to be resolved
   //System.out.println(SecretClass.secretString());

   //Exposed library should not be hidden
   // Should print "ExposedLibrary"
   System.out.println(PublicLibrary.getExposed().getString());
   
   //Should print static ExposedLibrary
   System.out.println(ExposedLibrary.getStaticString());


   // This line should print "Implementation 2"
   System.out.println(RuntimeImpl.getString());

   // This line should throw an exception
   System.out.println(RuntimeImpl.compileMethod());
 }
}
