## Description
This tool will help you generate the setter-getters for the fields of the class. By using this, the setter-getters will be copied to your clipboard 
## How to use
```bash
java SetterGetterGenerator class_name
```

## Demonstration
Firstly, I created a java file named *Student.java* having a class called *Student* defined in it as follows :
```java
class Student
{
private int rollNumber;
private String name;
public String city;
public float grades;
}
```
and compiled it with the following command:
```bash
javac Student.java
```
This command created a class file named *Student.class* 

Now to create Setter-Getter code, write the following command in the command prompt
```bash
java SetterGetterGenerator Student
```
Output:
```bash
Setter/Getters copied to clipboard :)
```
The content of your clipboard will be:
```java
public void setRollNumber(int rollNumber)
{
this.rollNumber = rollNumber;
}
public int getRollNumber()
{
return this.rollNumber;
}
public void setName(java.lang.String name)
{
this.name = name;
}
public java.lang.String getName()
{
return this.name;
}
public void setCity(java.lang.String city)
{
this.city = city;
}
public java.lang.String getCity()
{
return this.city;
}
public void setGrades(float grades)
{
this.grades = grades;
}
public float getGrades()
{
return this.grades;
}
```
Now simply just paste the copied code wherever you want.
