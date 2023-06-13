import java.lang.reflect.*;
class Analyzer
{
public static void main(String args[])
{
if(args.length != 1)
{
System.out.println("Usage : java Analyzer class_name");
return;
}
try
{
String classToAnalyze = args[0];
// class loader : forName
Class c = Class.forName(classToAnalyze);
System.out.println("\nName (Package name included) : " + c.getName());
System.out.println("Simple Name : " + c.getSimpleName());
Method methods[];
methods = c.getDeclaredMethods(); // getMethods will include all methods (including base class methods)
System.out.println("Number of methods : " + methods.length + "\n");
Method m;
String methodName;
Class methodReturnType;
Class parameters[];
int e;
int j;

for(e = 0; e < methods.length; e++)
{
m = methods[e];
methodName = m.getName();
System.out.printf("%d. Name of method : %s\n", e+1, methodName);
}
System.out.println();


for(e = 0; e < methods.length; e++)
{
m = methods[e];
methodReturnType = m.getReturnType();
System.out.print("Return Type : " + methodReturnType.getName() + "\t");
methodName = m.getName();
System.out.println("Name of method : " + methodName);
parameters = m.getParameterTypes();
System.out.println("Number of parameters : " + parameters.length);
for(j = 0; j < parameters.length; j++)
{
System.out.printf("%d. %s\n", j+1, parameters[j].getName());
}
System.out.println();
}
Field fields[];
String fieldName;
Class fieldType;
Field f;
fields = c.getDeclaredFields();
System.out.println("Number of fields : " + fields.length);
for(e = 0; e < fields.length; e++)
{
f = fields[e];
fieldName = f.getName();
fieldType = f.getType();
System.out.printf("%d. Name: %s,\t Type : %s\n", e+1, fieldName, fieldType.getName());
}

}catch(ClassNotFoundException cnfe)
{
System.out.println("Class : " + cnfe.getMessage() + " Not Found");
}

}
}