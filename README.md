# Kefetator
Interpreter for kef language. HW - compilers &amp; interpreters

# Documentation
All programs on Kef language start from function "main". 


1.Variable:
    
    Aliases:
    1. name must start with [a-z], then can be [a-z] or [0-9]
    2. value can be [0-9]
    
    Structure:
    [name] = [value | variable];
    
    example:
      x = 5;
      b = x;
      x123 = 15;

2.If-statement
    
    Aliases:
    1.statement: 0 - is False, all other values are True. Else branch is optional.
    
    Structure:
    if ([statement]) {
       //type if-body here
    } else {
      //type else-body here
    } 
    
    example:
      if (1) {
        x = 5;
      }
    
      if (a) {
        a = a + 1;
      } else {
        a = a - 1;
      }
    
    
3.Loop
    
    Aliases:
    1. preaction - init counter. (optional)
    2. forpredicate - statement (while forpredicate != 0 loop goes on). (optional)
    3. forpostaction - statement (optional)
    
    Structure:
    for [preaction];[forpredicate];[forpostaction] {
        //for-body
    }
    
    example:
      a = 5;
      sum = 0;
      for i = 1; (i - n); i = i + 1 {
        sum = sum + 10;
      }
      print(sum);


4.Function
**All functions start with "func".** Enumeration of arguments goes with spaces(" "). All functions **must** return something. 
    
    Aliases:
    1. name must start with [a-z], then can be [a-z] or [0-9]
    2. args = Variable | Num | Function
    3. returnValue = Variable | Num | Function
    
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
function for printing values to console

    Aliases:
    1. statement =  Num | Variable | Function

    print([statement]);
    
    example:
      a = 10;
      b = 15;
      
      func sum(a b) {
        return a + b;
      }
    
      func main() {
        print(5);
        print(a);
        print(sum(2 a));
      }
      

# Examples of programs

1. Read **N** from console. Calculate **factorial** of **N**. 

        func f(n) {
          if (n) {
            return n * f( (n - 1) );
          } else {
            return 1;
          }
        }
        
        func main() {
            n = readInt();
            print(f(n));
            return 0;
        }

2. Read **N** from console. Calulate the **N'th** Fibonacci number.

        func is1(n) {
            if ((n - 1)) {
                return 0;
            }
            return 1;
        }

        func is0(n) {
            if (n) {
                return 0;
            }
            return 1;
        }    
            
            
        func fib(n) {
            if (is0(n)) {
                return 1;
            }
            if (is1(n)) {
                return 1;
            }
            return fib((n-2)) + fib((n - 1));
          }

        func main() {
            n = readInt();
            m = fib(n);
            print(m);
            return 0;
        }
        
3. Read **N** from console. Print **squares** of all numbers from **1** to **N**(inclusive).

        func sq(n) {
          return n * n;
        }

        func main() {
          n = readInt();
          for i = 1; (i - n - 1); i = i + 1 {
            print(sq(i));
          }
          return 0;
        }
