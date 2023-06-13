## How to use
Run the following code in terminal, where class_name is the name of class to be analyzed
```bash
java Analyzer class_name
```
## Demonstration
Firstly, I created a java file named Student.java, in which I defined a Student class
Compiled it using the following command
```bash
javac Student.java
```
which created a Student.class file

Now to Analyze the Student class, I run following code :
```bash
java Analyzer Student
```

Output : 
```bash
Name (Package name included) : Student
Simple Name : Student
Number of methods : 6

1. Name of method : getName
2. Name of method : setName
3. Name of method : process
4. Name of method : doSomething
5. Name of method : getRollNumber
6. Name of method : setRollNumber

Return Type : java.lang.String  Name of method : getName
Number of parameters : 0

Return Type : void      Name of method : setName
Number of parameters : 1
1. java.lang.String

Return Type : void      Name of method : process
Number of parameters : 0

Return Type : void      Name of method : doSomething
Number of parameters : 4
1. java.lang.String
2. java.lang.String
3. java.lang.Integer
4. int

Return Type : int       Name of method : getRollNumber
Number of parameters : 0

Return Type : void      Name of method : setRollNumber
Number of parameters : 1
1. int

Number of fields : 3
1. Name: rollNumber,     Type : int
2. Name: name,   Type : java.lang.String
3. Name: city,   Type : java.lang.String
```
