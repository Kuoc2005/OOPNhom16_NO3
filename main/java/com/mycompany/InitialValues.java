public class InitialValues {
 boolean t;
 char c;
 byte b;
 short s;
 int i;
 long l;
 float f;
 double d;
 InitialValues reference;
 void printInitialValues() {
 print("Data type Initial value");
 print("boolean " + t);
 print("char [" + c + "]");
 print("byte " + b);
 print("short " + s);
 print("int " + i);
 print("long " + l);
 print("float " + f);
 print("double " + d);
 print("reference " + reference);
 }
 public static void main(String[] args) {
 InitialValues iv = new InitialValues();
 iv.printInitialValues();
 /* You could also say:
 new InitialValues().printInitialValues();
 */
 }
}
