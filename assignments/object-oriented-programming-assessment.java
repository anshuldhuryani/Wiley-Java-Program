
/* Problem Statement 1: */

Define a class named as circle that contains two private instance variables: radius (of type double) and 
color (of type String),
with default value of 1.0 and "red", respectively.
Create two overloaded constructors one with default values and another for assigning radius using parameterized constructor. Also define two public methods display() and getArea() to display the details of Circle and calculate the area.

/* *************************************************************** */

/* Problem Statement 2: */

Write a program perform the addition of numbers using two parameters and three parameters then we can write two separate addition methods with the same name but with different number of parameters.

/* *************************************************************** */

/* Problem Statement 3: */

Define a concrete class named as Vehicle with start and stop methods that defines the default functionality of any vehicle. Inherit Vehicle class into further subclass named as TwoWheeler and FourWheeler and override start and stop methods to redefine their functionality. Invoke all the methods from their respective class and test the program.

/* *************************************************************** */

/* Problem Statement 4: */

Here we have defined an abstract class Player and 3 sub-classes Bowler, Batsmen and WicketKeeper. We have added additional member variables and methods/functions in individual sub-classes. We have also created a constructor which initializes the member variables of the each player. The print method overrides the print method in the super-class Player and also add additional details for Bowler, Batsmen and WicketKeeper. 

Create an array of 11 players and initialized them with either Batsmen, Bowler and WicketKeeper and print their their details. Please make sure, we have made the Player class abstract such that no instance of that class can be created.

/* *************************************************************** */

/* Problem Statement 5: */

Define an interface IAccount and declared the methods getBalance, deposit and withdraw. Create two concreate classes named as HDFCAccount and StateBankAccount that implements IAccount interface. There is difference between implementation of these classes, HDFCAccount uses member variables deposits and withdrawals for maintaining the balance, where as StateBankAccount uses only balance to maintain the balance. Test your application with creating objects of HDFCAccount and StateBankAccount. Don't forget to assigned them to the reference of the interface IAccount. The methods transactOnAccount and printBalance only know about the interface IAccount and does not getting impacted on which class's object is passed.