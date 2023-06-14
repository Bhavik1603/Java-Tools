
## How to use
```bash
java SetterGetterGenerator class_name
```

## Demonstration
Firstly, i created a java file named *Student.java* having a class named *Student* defined in it as follows :
```java
class Student
{
private int rollNumber;
private String name;
public String city;
public float grades;
}
```
and compiled it with following command:
```bash
javac Student.java
```
This command created a class file named as *Student.class* 

Now to create Setter-Getter code, write the following command in the command prompt
```bash
java SetterGetterGenerator Student
```
Output:
```bash
setter/getters for : Student generated in file named as tmp.tmp
```
Content of tmp.tmp:
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
