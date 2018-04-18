#include <iostream> 
using namespace std; 


// pass by value
void swap1(int a, int b){
    int tmp = a;
    a = b;
    b = tmp;
}
// pass by pointer (address)
void swap2(int *a, int *b){
    int tmp = *a;
    *a = *b;
    *b = tmp;
}
// pass by reference
void swap3(int &a, int &b){
    int tmp = a;
    a = b;
    b = tmp;
}

int main() { 
   cout << "Hello! World!" << endl;

   int a = 1;
   int b = 100;
   cout << "a:" << a << " b:" << b << endl;
   swap1(a, b);
   a = 1;
   b = 100;
   cout << "a:" << a << " b:" << b << endl;
   swap2(&a, &b);
   cout << "a:" << a << " b:" << b << endl;
   a = 1;
   b = 100;
   swap3(a,b);
   cout << "a:" << a << " b:" << b << endl;
   
 return 0; 
}

