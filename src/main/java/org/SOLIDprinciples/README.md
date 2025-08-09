SOLID Principles 

Single responsibility principle:
It states that every java class must perform a single functionality. 
Implementation of multiple functionalities in a single class mashup the code.

Assuming a Bank service:
Inside there are multiple Sub services they do not satisfy that SRP principle by coding
in a single class file as bank services so 
1) OTPService
2) PrinterService
3) LoanService

Open Close Principle:
It states that according to new requirements, the module should be open for extension but closed for modifications.

1) NotificationService → it is class, but if we satisfy our OCP principle, then we can mark 
notification service class as Interface so others can extend for any further extensions
also we will close for modification
2) Now create a separate class to implement methods then we can satisfy these OCP principles
Here notification service is bound to email and mobile, but in future it might be extended to 

Liskov substitution Principle:
It applies to Inheritance in such a way that the derived classes must be completely substitutable for their 
base classes 
(Or)
If class A is a subtype of class B, Then we should be able to replace B with A without interrupting the behavior
of the program.
1) SocialMedia is an abstract class that can have all the all abstract methods
2) Now we can create a class for our requirements like facebook and WhatsApp which can use similar 
kind of uses. also, some methods are not being used in child classes even though we can keep it there
3) To overcome the issue, create an interface called social media - add methods which respect to the
implementation according to the compatibility


Interface Segregation Principle:
It is also similar to the SRP. Larger interfaces are split into smaller ones. Because the implementation
classes use only the methods that they do not want to use

Dependency Inversion principle:
The principle states that we must use abstraction instead of concrete implementations
High level modules should not depend on the low level module, but both should depend on
the abstraction