# Kefetator
Interpreter for kef language. HW - compilers &amp; interpreters

# Documentation
All programs on Kef language start from function "main".


1.Variable:
    
    name must start with [a-z], then can be [a-z] or [0-9]
    value can be [0-9]
    
    [name] = [value | variable];
    
    example:
      x = 5;
      b = x;
      x123 = 15;

2.If-statement
    
 
    // else-body is optional
    
    if ([statement]) {
       //type if-body here
    } else {
      //type else-body here
    } 
    
    example:
      if (a) {
        a = a + 1;
      } else {
        a = a - 1;
      }
    
3.Loop

    //loopstatement = Variable | Num
    
    for ( loopstatement ) {
      //type loop-body here
    }
    
    example:
      a = 5;
      sum = 0;
      for (a) {
        sum = sum + 10;
      }

4.Function
All functions start with "func". Enumeration of arguments goes with space(" "). All functions must return something. 
    
    //args = Variable | Num | Function
    //returnValue = Variable | Num | Function
    
    func [name] (args) {
      //type func-body here
      return returnValue;
    }
    
    example:
      func mul(a b) {
        return a * b;
      }
      
      func main() {
        a = 2;
        b = mul(a 10);
        return b;
      }
 
 
5.Print

    //statement = Function | Num | Variable

    print(statement);
    
    example:
      a = 10;
      b = 15;
      
      func sum(a b) {
        return a + b;
      }
    
      func main() {
        print(5);
        print(a);
        print(2 a);
      }
      



