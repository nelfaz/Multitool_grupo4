# Multitool_grupo4
Integrantes: Joan,Nela,Diego,Samuel y Sergio
Nela-> Rol líder, se encarga del apartado de tareas
Samuel-> Rol Documentador, se encarga del apartado gestor de numeros
Joan-> se encarga del conversor
Sergio-> se encarga del juego
Diego-> se encarga del texto

--#Descripción#--
TODOS->> van a tener una opción de volver, asignada al nº 0

Gestor de numeros:Se va a encargar de gestionar números añadidos por el usuario->
1.- Añadir numero
2.- Listar numeros
3.- Ver mínimo y máximo
4.- Buscar número
Cabe destacar que para este apartado se usará un array, será de enteros y su limite será de 20

Conversor:Se va a encargar de convertir un dato dado a otro dato; en este caso tenemos estas opciones-> 
1.- Celsius ↔  Fahrenheit
2.-Metros ↔ Pies
3.-Kilogramos(Kg) ↔ Libras

Texto:se va a encargar de analizar un texto y hacer diferentes analisis:
1.- Contar vocales
2.- Contar palabras
3.- Palabra más larga
Cabe destacar que para este apartado se usarán String,bucles y comparaciones

Tareas:se va a encargar de gestionar las tareas
1.- Añadir tarea
2.- Listar taresas
3.- Buscar palabra
Cabe destacar que para este apartado se usará un array String con un límite de 15 tareas

Juego:Es un minijuego de adivinar un nº entre el  1 y el 50
1.- Jugar(1-50)
2.- Mostrar intentos del último juego
Cabe destacar que para este apartado el programa generará un nº aleatorio entre  1-50 (math.random), el usuario irá probando hasta acertar y se registra los intentos del último juego

--#Ejecución#--
Al darle al botón de iniciar programa, se nos abrirá un menu en la terminal en el cual tendremos estas opciones:
"Inicio"
"1.Gestor de numeros"
"2.Conversor multitipo"
"3.Analizador de texto"
"4.Gestión de tareas"
"5.Adivinar el numero"
"0 Salir"
Dependiendo de a lo que le introduzcamos ocurriran diferentes cosas, si le das al 1 sale el gestor de numeros, al 2 conversor multitipo...

Dandole al 1, nos sale el menu del gestor de números, este nos presenta 4 opciones, las cuales fueron mencionadas anteriormente; 
la primera de ellas consiste en escribir un nº y el programa lo guardará, su máx es 20 nº guardados, la 2da opción consiste en listar 
los nº añadidos anteriormente, la 3ra opción es ver el nº maximo(el más grande) y el mínimo(el más pequeño) y la 4ta opción, la última, 
consiste en buscar un nº en concreto

Dandole al 2, nos sale el menu del conversor multitipo, este nos presenta 3 opciones de conversión, la primera es pasar de grados celsius a 
fahrenheit y viceversa, la 2da opción consiste en pasar de metros a pies y viceversa y la tercera, la última, consiste en pasar de kilogramos a 
libras y viceversa; el usuario introduce un valor y luego elige entre 1 o 2, las cuales estan especificadas; un ejemplo de esto sería "1 para 
grados y 2 para fahrenheit"

Dandole al 3, nos sale el menu del analizador de texto, este nos presenta 3 opciones, la primera es contar todas las vocales del texto introducido y mostrarlas, la segunda opción es contar cuantas palabras tiene el texto y la 3ra opción, la última, consiste en indicar cual es la palabra más larga encontrada en el texto 
introducido

Dandole al 4, nos sale el menu del gestión de tareas, este nos presenta 3 opciones, la primera es añadir una nueva tarea, la 2da opción es listar las tareas existentes (en caso de que no haya seguramente no mostrará nada o pondra un texto de "no hay tareas existentes"), y la 3ra opción, la última, es buscar una palabra que este escrita en alguna de las tareas; el máx de tareas es de 15

Dandole al 5, nos sale el menu de adivinar el numero,este nos presenta 2 opciones, la primera es "jugar", lo que es sinónimo de iniciar el juego de adivinar del 1 al 50, este estará preguntando hasta que acertemos el nº elegido de forma aleatoria, la 2da opción, la última, nos mostrará el nº de intentos del anterior juego; cada vez que se acabe el juego, se mostrará el nº de intentos 

Al darle al 0, nos saldra un mensaje de "Saliendo del programa" y finalizará su ejecución
