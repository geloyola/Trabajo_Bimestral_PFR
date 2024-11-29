// crear una funcion con el nombre de integracion que use el metodo Simpson

def integracion(f: Double => Double, a: Double, b: Double): Double= (b-a) * ((f(a)+(4*f((a+b)/2))+f(b))/6)

// aproximo el valor de las siguientes integrales definidas
//usando la funcion de integracion creada en el paso 1

//integral 1

val inte1: Double => Double =(x: Double)=>  -math.pow(x,2) + 8*x -12
val valorE1: Double = 7.33
val valorO1: Double = integracion(inte1,3,5)

//integral 2
val inte2: Double => Double =(x: Double) => (3 * math.pow(x,2))
val valorE2: Double =8
val valorO2: Double = integracion(inte2, 0, 2)

//integral 3
val inte3: Double => Double = (x: Double) => x+2 * math.pow(x, 2) - math.pow(x, 3) + 5
* math.pow(x, 4)
val valorE3: Double = 3.333
val valorO3: Double = integracion(inte3, -1, 1)

//integral 4
val inte4: Double => Double =(x: Double) => (2 * x + 1)/ (math.pow(x,2) + x)
val valorE4: Double = 1.09861
val valorO4: Double = integracion(inte4, 1,2 )

//integral 5
val inte5: Double => Double = (x: Double)  => math.exp(x)
val valorE5: Double = 1.71828
val valorO5: Double = integracion(inte5, 0, 1)

// integral 6
val inte6: Double => Double =(x:Double) => 1/ (math.sqrt(x) - 1)
val valorE6: Double = 0.828427
val valorO6: Double = integracion(inte6, 2, 3)

//integral 7
val inte7: Double => Double = (x: Double) => 1 /(1 + math.pow(x, 2))
val valorE7: Double = 0.785398
val valorO7: Double = integracion(inte7, 0, 1)

// funcion que calcula el error
def calcularError ( valorEsperado: Double, valorObtenido: Double): Double = math.abs(valorEsperado - valorObtenido)


//Calular los errores de aproximacion por cada integral
//Integral 1
val error1: Double = calcularError (valorE1, valorO1)
//integral 2
val error2: Double = calcularError (valorE2, valorO2)
// integral 3
val error3: Double = calcularError (valorE3, valorO3)
//integral 4
val error4: Double = calcularError (valorE4, valorO4)
// integral 5
val error5: Double = calcularError (valorE5, valorO5)
// integral 6
val error6: Double = calcularError (valorE6, valorO6)
//integral 7
val error7: Double = calcularError (valorE7, valorO7)



