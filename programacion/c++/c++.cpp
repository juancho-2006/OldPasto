
#include <iostream>
using namespace std;


float obtenerValorUsuario()
{
  float numero{};
  static int i{1};
 
  cout << "Ingresa el " << i++ << " número ";

  cin >> numero;

  return numero;
}


float encontrarMayor(float n1,float n2,float n3)
{

int mayor{};

  if (n1 > n2 && n1 > n3)
  {

    mayor=n1;

  }else if (n2 > n1 && n2 > n3)
  {
    mayor=n2;

  }else {
    mayor=n3;
  }

  return mayor ;
}

int pedirNumTabla()
{
  int  numTabla{};

  cout << "Ingresa el número para mostrar su tablaMultiplicar  ";

  cin >> numTabla;

return numTabla;
}

void tablaMultiplicar(int n)
{
 for (int i = 1; i <= 10; i++) {

  int result{n*i};

  cout << n << "*" << i << " = " << result << '\n';
  }

}


int  pedirNumeroSumar()
{
  float cantidadNumeros{};
  cout << "Ingresa cuantos números deseas sumar ";
  
 
  
  cin >> cantidadNumeros;

  return cantidadNumeros;
}


float sumaNumeros(float cantidadNumeros)
{
 float sumaTotal{}, numeroIngresado{};

   for (int i = 1; i <= cantidadNumeros; i++) {
    cout << "Ingresa el número " << i << " ";

    cin >> numeroIngresado;

    sumaTotal+=numeroIngresado;
  }

cout << "La suma total es = " << sumaTotal << '\n';
  return sumaTotal;
}

void promedioNumerosPedidos(float sumaTotal, float cantidadNumeros)
{
  
  cout << "El promedio de los numeros pedidos es = " << sumaTotal/cantidadNumeros;

}

int main ()
{ 
cout <<"\t***************Programa practica con numeros***************\n";
cout << "Ingresa 3 numeros\n";
float x = {obtenerValorUsuario()};
  
float y = {obtenerValorUsuario()};

float c = {obtenerValorUsuario()};

cout << "El promedio de los tres numeros es: " << (y+x+c) /3.0 << '\n';

cout << "El mayor es " << encontrarMayor(x,y,c) << '\n';

tablaMultiplicar(pedirNumTabla());

float l = pedirNumeroSumar();
float d = sumaNumeros(l);
promedioNumerosPedidos(l, d);
  
  return 0;

} 
  

