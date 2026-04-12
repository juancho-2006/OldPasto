#include <iostream>
using namespace std;
float pedirNumero()
{
  cout << "ingresa un numero" << '\n';

  float numero{};
  
  cin >> numero;

  return numero;
}
bool esParoImpar(int n) 
{
  if (n % 2== 0)
  {
    cout << "Es par "<< '\n';

  }else
  {
    cout << "Es impar "<<'\n';
  }
  return n % 2 ==0;
}

int pedirEntero()
{
    cout << "Ingresa un numero entero " << '\n';
    
    int numEntero{};
    
    cin >> numEntero;
    
    return numEntero;
}

float suma(float a, float b)
{

  return a+b;
}

float resta(float a, float b)
{
  return a-b;
}

float multiplicacion(float a, float b)
{
  return a*b;
}
float division(float a, float b)
{
  return a/b;

}

bool esPrimo(int n){
  if (n <= 1) {

    return false; // Los números menores o iguales a 1 no son primos
  }

for (int i = 2; i < n; i++) {
  
  if(n%2==0 &&n-1){

    return false; // Si n es divisible por algún número entre 2 y n-1, no es primo
  }
}
    return true; 
      
}
void esNegativo(int n){
  if (n < 0) {
    
    cout << "Es negativo"<< endl;
  
  }else if (n==0) {
    
    cout << "cero"<< endl; 
  
  }else{
  
    cout << "Es positivo";
  }
 
}

int sumaN(int n){

  int suma2{};
  for(int i =0; i<=n; i++){
  
    suma2+=i;
  }

return suma2;
}
void  contadorParesImpares(int n){

int pares{}, impares{};
for(int i =0; i <=10; i++){
if (esParoImpar(n)){
  pares++;
}else {
  impares++;
}
}
cout << "Cantidad de pares: " << pares << '\n';
cout << "Cantidad de impares: " << impares << '\n';

}
int main() {
  
 cout << " ¿Cual numero es par ? " << '\n';
    
  esParoImpar(pedirEntero()); 
    
    cout << "Ingresa una opcion 1) sumar, 2) restar, 3) multiplicar, 4)dividir  " << endl;
    int opcion{};
    cin >> opcion;

    cout<< "Primero ingresa el primer numero " << '\n';
    float a{pedirNumero()};
    cout << "Ahora ingresa el segundo numero " << '\n';
    float b{pedirNumero()};

    switch (opcion) {
      case 1:
       cout << "La suma es :" << suma(a,b)<< '\n';
        break;
      case 2:
        cout << "La resta es " << resta(a,b)<<'\n';
        break;
      case 3: 
         cout << "La multiplicacion es:" << multiplicacion(a,b) << '\n';

          break;
      case 4:
         cout << "La division es:" << division(a,b) << '\n';

          break;
    }

cout << "\n¿ES PRIMO? " << '\n';
if (esPrimo(pedirEntero())) {
  cout << " es un número primo." << '\n';
}else {
  cout  << " no es un número primo." << '\n';
}
int n{pedirEntero()};
cout << "El numero entero..." << endl;
esNegativo(n);
esParoImpar(n); 
contadorParesImpares(n);
cout << "\n resultado de la suma consecutiva es: " <<sumaN(n)<< endl;
return 0;

}
