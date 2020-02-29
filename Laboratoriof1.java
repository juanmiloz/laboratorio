import java.util.Scanner;

public class Laboratoriof1{

		private final static int ENTRY_CHAINS = 1;
		private final static int ENTRY_NUMBERS = 2;
		private final static int ARRANGEMENTS_LENGTH = 3;
		//
		private final static int LENGTH_CHAINS = 1;
		private final static int SHOW_CHAINS = 2;
		private final static int CHARACTER_POSITION = 3;
		private final static int RETURN = 4;
		//
		private final static int DIVISION_NUMBERS = 1;
		private final static int DIVISION_RESIDUE = 2;
		private final static int RETURN2 = 3;
		//
		private final static int ARRANGEMENT_NUMBERS = 1;
		private final static int ARRANGEMENT_AVERAGE = 2;
		private final static int HIGHER_NUMBER = 3;
		private final static int ARRANGEMENT_OPERATIONS = 4;
		private final static int JOIN_ARRANGEMENTS = 5; 
		private final static int JOIN_ARRANGEMENTS_WITHOUT_REPEATING = 6;
		private final static int INTERCEPTION = 7;
		private final static int ROTATE_ARRANGEMENT = 8;
		private final static int ORDER_ARRANGEMENT = 9;		
		private final static int RETURN3 = 10;
		
		
		static Scanner in = new Scanner(System.in);
		static int regresar = 1, submenu1 = 0, submenu2 = 0, submenu3 = 0;
		static int menu = 0, long1 = 0, long2 = 0, long3 = 0, NumArray = 0, NumHigher = 0, ArrayAdd1 = 0, ArrayAdd2 = 0, operationarray = 0, longT = 0, numrepeat = 0, numinter = 0, numTurn = 0 ;
		static String ComeBack = "si";
		static String cadena [] = new String[3];
		static int longitud [] = new int [3];
		static double numero [] = new double [2];
		static int array1 [];
		static int array2 [];
		static int array3 [];
		static int arrayresultado [];
		static int arraytogether [];
		static int arrayTogether2 [];
		static int arraywithoutrepeat [];
		static int arrayInterception [];
		static int arraySpin [];
		static double proma1 = 0, proma2 = 0, proma3 = 0;

		/**
		display the main menu along with the main program options
		
		<b>pre: <b/> 
		<b>post: <b/> shows the main program options
		*/
		public static void Options(){
			
			while(regresar == 1){
				System.out.println("BIENVENIDO AL PRIMER LABORATORIO ICESI");
				System.out.println("");
				System.out.println("==================");
				System.out.println("= MENU PRINCIPAL =");
				System.out.println("==================");
				System.out.println(" ¿QUE OPCION DESEA REALIZAR? ");
				System.out.println("1<---- Ingresar 3 cadenas de caracteres");
				System.out.println("");
				System.out.println("2<---- Ingresar 2 numeros mayores a 0");
				System.out.println("");
				System.out.println("3<---- Ingresar 3 arreglos de numeros enteros (la longitud de los arreglos las escogera el usuario)");
				System.out.println("");
				menu = in.nextInt();
			
				regresar = 0;
				
				switch(menu){
					
					case ENTRY_CHAINS :
						EntryChains();
						submenu1 = 0;
						ComeBack = "si";
						while(ComeBack.equalsIgnoreCase("si") == true){
							SubMenu1();
							
							if(submenu1 != 4){
								System.out.println("");
								System.out.println("¿Desea volver al menu? Si es asi escriba (si)");
								in.nextLine();
								ComeBack = in.nextLine();
							}else{
								ComeBack = "";
							}
						}
					break;
					
					case ENTRY_NUMBERS :
						EntryNumbers();
						submenu2 = 0;
						ComeBack = "si";
						while(ComeBack.equalsIgnoreCase("si") == true){
							SubMenu2();
							
							if(submenu2 != 3){
								System.out.println("");
								System.out.println("¿Desea volver al menu? Si es asi escriba (si) ");
								in.nextLine();
								ComeBack = in.nextLine();
							}else{
								ComeBack = "";
							}
						}
					break;
					
					case ARRANGEMENTS_LENGTH :
						ArrangementsLength();
						submenu3 = 0;
						ComeBack = "si";
						while(ComeBack.equalsIgnoreCase("si") == true){
							SubMenu3();
							
							if(submenu3 != 10){
								System.out.println("");
								System.out.println("¿Desea volver al menu? Si es asi escriba (si) ");
								in.nextLine();
								ComeBack = in.nextLine();
							}else{
								ComeBack = "";
							}
						}
					break;
				}
			}	
		}
		
		/**
		return to main menu
		
		<b>pre: <b/> 
		<b>post: <b/> will come back to main menu
		*/
		public static void Return(){
			regresar = 1;
		}
		
		/**
		enter 3 text strings
		
		<b>pre: <b/> 
		<b>post: <b/> an arrangement will be created with 3 text strings inside
		*/
		public static void EntryChains(){
			
			for (int i = 0; i < 3; i++){
				System.out.println("Ingrese la cadena " + (i+1));
				cadena[i] = in.next();
			}
		}
		
		/**
		allows to enter 2 numbers
		
		<b>pre: <b/> 
		<b>post: <b/> an arrangement with two numbers will be created
		*/
		public static void EntryNumbers(){
			
			for(int i = 0; i < 2 ; i++){
				System.out.println("Ingrese el numero que se guardara en la posicion: " + (i+1));
				numero[i] = in.nextDouble(); 
			}
			System.out.println(numero[0]);
			System.out.println(numero[1]);
		}
		
		/**
		define the length of 3 arrangement and allow enter numbers within these
		
		<b>pre: <b/> 
		<b>post: <b/> the length of the three arrangements is defined along with their numbers
		*/
		public static void ArrangementsLength(){
			
			System.out.println("");
			System.out.println("Ingrese el largo del primer arreglo");
			long1 = in.nextInt(); 
			array1 = new int [long1];
			
			System.out.println("Ingrese el largo del segundo arreglo");
			long2 = in.nextInt();
			array2 = new int [long2];
			
			System.out.println("Ingrese el largo del tercer arreglo");
			long3 = in.nextInt();
			array3 = new int [long3];
			
			System.out.println("");
			for(int i = 0; i < long1; i++){
				System.out.println("Ingrese el numero " + (i+1) + " de " + long1 + " numeros disponibles");
				array1 [i] = in.nextInt();
			}

			System.out.println("");
			for(int i = 0; i < long2 ; i++){
				System.out.println("Ingrese el numero " + (i+1) + " de " + long2 + " numeros disponibles");
				array2 [i] = in.nextInt();
			}
			
			System.out.println("");
			for(int i = 0; i < long3 ; i++){
				System.out.println("Ingrese el numero " + (i+1) + " de " + long3 + " numeros disponibles");
				array3 [i] = in.nextInt();
			}
		}
		
		/**
		It is displayed after choosing an option in the main menu
		
		<b>pre: <b/> 
		<b>post: <b/> It is displayed after choosing an option in the main menu and allows you to make different options
		*/
		public static void SubMenu1(){
			System.out.println("");
			System.out.println("Que desea realizar con estas cadenas");
			System.out.println("");
			System.out.println("1<---- Desplegar las longitudes de las 3 cadenas");
			System.out.println("");
			System.out.println("2<---- Mostrar las 3 cadenas ingresadas anteriormente");
			System.out.println("");
			System.out.println("3<---- Mostrar caracter ubicado en la posicion que desee selecionar");
			System.out.println("");
			System.out.println("4<---- Volver al menu principal");
			System.out.println("");
			
			submenu1 = in.nextInt();
			
			switch(submenu1){
				
				case LENGTH_CHAINS:
					ChainsLength();
				break;
				
				case SHOW_CHAINS:
					ShowChains();
				break; 
				
				case CHARACTER_POSITION:
					CharacterPosition();
				break;
				
				case RETURN:
					Return();
				break;
			}
		}
		
		/**
		show the length of the text strings
		
		<b>pre: <b/> the strings must be entered
		<b>post: <b/> will allow to see the different lengths of the 3 chains entered previously
		*/
		public static void ChainsLength() {
			
			if (!cadena[0].equalsIgnoreCase("") && !cadena[1].equalsIgnoreCase("") && !cadena[2].equalsIgnoreCase("")){
				for(int i2 = 0; i2 < 3; i2++){
					longitud[i2] = cadena[i2].length();  
					System.out.println("");
					System.out.println("La longitud de la cadena " + (i2+1) + " es de " + longitud[i2] );
				}	
			}else{
				System.out.println("No hay cadenas de texto ingresadas");
			}
		}
		
		/**
		show the 3 text strings
		
		<b>pre: <b/> the strings must be entered
		<b>post: <b/> will display the three chains together
		*/
		public static void ShowChains(){
			
			System.out.println("Las 3 cadenas ingresadas son " + cadena[0] + " " + cadena[1] + " " + cadena[2] + " ");
		}
		
		/**
		will show the letter located in the position chosen by the user
		
		<b>pre: <b/> the strings must be entered
		<b>post: <b/> will show the letter located in a position of the chain, this position will be chosen by the user
		*/
		public static void CharacterPosition(){
			
			int posChar = 0;
			
			System.out.println("Ingrese el numero de la posicion del caracter que desea ver: ");
			posChar = in.nextInt();
			
			for(int i3 = 0; i3 < 3; i3++){
				if(cadena[i3].length() < posChar){
					System.out.println("La posicion " + (posChar-1) + " de la cadena " + (i3+1) + " no existe");
				}else{
					System.out.println("La letra ubicada en la posicion " + posChar + " es: " + cadena[i3].charAt((posChar-1)));
				}
			}
		}
		
		/**
		will show the options corresponding to the second option of the main menu
		
		<b>pre: <b/> 
		<b>post: <b/> display different options that can be done after inserting the 2 numbers
		*/
		public static void SubMenu2(){
			System.out.println("Que desea realizar con los numeros insertados");
			System.out.println("");
			System.out.println("1<---- Mostrar la division de ambos numeros");
			System.out.println("");
			System.out.println("2<---- Mostrar la division de ambos numeros y su residuo");
			System.out.println("");
			System.out.println("3<---- Volver al menu principal");
			System.out.println("");
			
			
			submenu2 = in.nextInt();
			
			switch(submenu2){
				
				case DIVISION_NUMBERS:
					DivisionNumbers();
				break;
				
				case DIVISION_RESIDUE:
					DivisionResidue();
				break; 
				
				case RETURN2 :
					Return();
				break;
			}
		}
		
		/**
		divide the numbers
		
		<b>pre: <b/>
		<b>post: <b/> it will show de answer of the division of numbers 
		*/
		public static void DivisionNumbers(){
			double division = numero[0]/numero[1];
			
			System.out.println("El resultado de la division de ambos numeros es: " + division);
		}
		
		/**
		divide the numbers and take out the residue
		
		<b>pre: <b/>
		<b>post: <b/> it will show de answer of the division of numbers and your residue
		*/
		public static void DivisionResidue(){
			
			double residuo = numero[0]%numero[1];
			double division2 = numero[0]/numero[1];
			
			System.out.println("El resultado de la division de ambos numeros es de: " + division2 + " y su residuo es de: " + residuo);
		}
		
		/**
		will show the options corresponding to the three option of the main menu
		
		<b>pre: <b/> 
		<b>post: <b/> show different options that can be made after inserting the length of the arrangements and their numbers
		*/
		public static void SubMenu3(){
			System.out.println("Que desea realizar con los arreglos ingresados");
			System.out.println("");
			System.out.println("1<---- Ver el contenido de los arreglos");
			System.out.println("");
			System.out.println("2<--- Promedio del arreglo que desee escoger");
			System.out.println("");
			System.out.println("3<--- El mayor numero del arreglo que usted seleccione");
			System.out.println("");
			System.out.println("4<--- Sumar, restar o multiplicar los dos arreglos que desee");
			System.out.println("");
			System.out.println("5<--- Juntar los tres arreglos");
			System.out.println("");
			System.out.println("6<--- Juntar arreglos sin repetir numeros (es necesario haberlos juntado en la opcion 5)");
			System.out.println("");
			System.out.println("7<--- intercepcion entre arreglos (es necesario haberlos juntado en la opcion 5)");
			System.out.println("");
			System.out.println("8<--- Girar n posiciones un arreglo (es necesario haberlos juntado en la opcion 5)");
			System.out.println("");
			System.out.println("9<--- ordenar de menor a mayor los valores del arreglo (es necesario haberlos juntado en la opcion 5)");
			System.out.println("");
			System.out.println("10<---- Volver al menu principal");
			System.out.println("");
			
			submenu3 = in.nextInt();
			
			switch(submenu3){
				
				case ARRANGEMENT_NUMBERS: 
					ArrangementNumbers();
				break;
				
				case ARRANGEMENT_AVERAGE:
					AverageArrangements();
				break;
				
				case HIGHER_NUMBER:
					HigherNum();
				break;
				
				case ARRANGEMENT_OPERATIONS:
					CalculatorArrangements();
				break;
				
				case JOIN_ARRANGEMENTS:
					JoinArrangements();
				break; 
				
				case JOIN_ARRANGEMENTS_WITHOUT_REPEATING:
					JoinArrangementsWithoutRepeating();
				break;
				
				case INTERCEPTION:
					Interception();
				break;
				
				case ROTATE_ARRANGEMENT:
					Turn();
				break;

				case ORDER_ARRANGEMENT:
					OrderLeastToGreatest();
				break;
				
				case RETURN3:
					Return();
				break;
			}
		}
		
		/**
		shows the numbers that each array has
		
		<b>pre: <b/>
		<b>post: <b/>show the numbers belonging to each array
		*/
		public static void ArrangementNumbers(){
		
			System.out.println("");
			System.out.println("Los numeros ingresados son:");
			
			System.out.println("En el arreglo 1 hay los siguientes numeros:");
			for(int i=0; i<long1; i++){
				System.out.print(array1[i]+" ");
			}
			
			System.out.println("");
			System.out.println("");
			System.out.println("En el arreglo 2 hay los siguientes numeros:");
			for(int i=0; i<long2; i++){
				System.out.print(array2[i]+" ");
			}
			
			System.out.println("");
			System.out.println("");
			System.out.println("En el arreglo 3 hay los siguientes numeros:");
			for(int i=0; i<long3; i++){
				System.out.print(array3[i]+" ");
			}
		}
		
		/**
		show one average of an array 
		
		<b>pre: <b/>
		<b>post: <b/> allows you to select an arrangement and get your average
		*/
		public static void AverageArrangements(){
			
			System.out.println("");
			System.out.println("Ingrese el numero del arreglo (1,2 o 3) al cual le desea ver el promedio: ");
			NumArray = in.nextInt();
			
			if(NumArray == 1){
				for(int i = 0; i < long1; i++){
					proma1 += array1[i]; 
				}
			proma1 = proma1/long1;
			System.out.println("El promedio del arreglo 1 es de: " + proma1);
			}else if(NumArray == 2){
				for(int i = 0; i < long2; i++){
					proma2 += array2[i]; 
				}
			proma2 = proma2/long2;
			System.out.println("El promedio del arreglo 2 es de: " + proma2);
			}else if(NumArray == 3){
				for(int i = 0; i < long3; i++){
					proma3 += array3[i]; 
				}
			proma3 = proma3/long3;
			System.out.println("El promedio del arreglo 3 es de: " + proma3);
			}else{
				System.out.println("Ingrese un numero valido");
			}
			NumArray = 0;
		}
		
		/**
		show the higher number of the array
		
		<b>pre: <b/>
		<b>post: <b/>allows you to select an arrangement and find the higher number
		*/
		public static void HigherNum(){
			
			System.out.println("Que arreglo desea utilizar para ver el mayor numero? ");
			NumArray = in.nextInt();

			if( NumArray == 1){
				for(int i = 0; i < long1 ; i++){
					if(array1 [i] > NumHigher){
						NumHigher = array1 [i];
					}
				}
			}else if(NumArray == 2){
				for(int i = 0; i < long2 ; i++){
					if(array2 [i] > NumHigher){
						NumHigher = array2 [i];
					}
				}
			}else if(NumArray == 3){
				for(int i = 0; i < long3 ; i++){
					if(array3 [i] > NumHigher){
						NumHigher = array3 [i];
					}
				}
			}
			
			System.out.println("El mayor numero es: " + NumHigher);
		}
		
		/**
		makes operations between arrangements
		
		<b>pre: <b/>the arrangements have to be the same size
		<b>post: <b/> perform the operation chosen between two arrangements of the same size and generate a new arrangement in response
		*/
		public static void CalculatorArrangements(){
			
			System.out.println("El largo de los dos arreglos debera ser iguales");
			System.out.println("ingrese el numero del primer arreglo que desea utilizar para operar? \n 1, 2 o 3?");
			ArrayAdd1 = in.nextInt();
			System.out.println("Cual otro arreglo desea utilizar? \n 1, 2 o 3?");
			ArrayAdd2 = in.nextInt();
			
			if(ArrayAdd1 == 1 && ArrayAdd2 == 2){
				
				System.out.println("Que operacion desea realizar entre los arreglos: \n (1) suma \n (2) resta \n (3) multiplicacion");
				operationarray = in.nextInt();
				arrayresultado = new int [long1];
				if(operationarray == 1){
					for(int i = 0; i < long1; i++){
						arrayresultado [i] = array1 [i] + array2 [i];
					}
				}else if(operationarray == 2){
					for(int i = 0; i < long1; i++){
						arrayresultado [i] = array1 [i] - array2 [i];
					}
				}else if(operationarray == 3){
					for(int i = 0; i < long1; i++){
						arrayresultado [i] = array1 [i] * array2 [i];
					}
				}else{
					System.out.println("Ingrese una operacion valida ");
				}
			}else if(ArrayAdd1 == 1 && ArrayAdd2 == 3){
				
				System.out.println("Que operacion desea realizar entre los arreglos: \n (1) suma \n (2) resta \n (3) multiplicacion");
				operationarray = in.nextInt();
				arrayresultado = new int [long1];
				if(operationarray == 1){
					for(int i = 0; i < long1; i++){
						arrayresultado [i] = array1 [i] + array3 [i];
					}
				}else if(operationarray == 2){
					for(int i = 0; i < long1; i++){
						arrayresultado [i] = array1 [i] - array3 [i];
					}
				}else if(operationarray == 3){
					for(int i = 0; i < long1; i++){
						arrayresultado [i] = array1 [i] * array3 [i];
					}
				}else{
					System.out.println("Ingrese una operacion valida ");
				}
			}else if(ArrayAdd1 == 2 && ArrayAdd2 == 3){
				
				System.out.println("Que operacion desea realizar entre los arreglos: \n (1) suma \n (2) resta \n (3) multiplicacion");
				operationarray = in.nextInt();
				arrayresultado = new int [long2];
				if(operationarray == 1){
					for(int i = 0; i < long2; i++){
						arrayresultado [i] = array2 [i] + array3 [i];
					}
				}else if(operationarray == 2){
					for(int i = 0; i < long2; i++){
						arrayresultado [i] = array2 [i] - array3 [i];
					}
				}else if(operationarray == 3){
					for(int i = 0; i < long2; i++){
						arrayresultado [i] = array2 [i] * array3 [i];
					}
				}else{
					System.out.println("Ingrese una operacion valida ");
				}
			}
			
			System.out.println("");
			System.out.println("El arreglo resultante es:");
			for(int i = 0; i < arrayresultado.length; i++){
				System.out.print(arrayresultado[i] + " ");
			}
		}
		
		/**
		put the three arrangements together and put them in a new arrangement
		
		<b>pre: <b/>
		<b>post: <b/> grab the numbers of the three arrangements and place them in a new arrangement all together
		*/
		public static void JoinArrangements(){
			
			longT = long1 + long2 + long3;
			arraytogether = new int [longT];
			for(int i = 0; i < long1; i++){
				arraytogether [i] = array1 [i];
			}
			for(int i = long1; i < (long1+long2) ; i++){
				arraytogether [i] = array2[i-long1];
			}
			for(int i = (long1+long2) ; i<longT ; i++){
				arraytogether [i] = array3 [i-(long1+long2)];
			}
			System.out.println("");
			for(int i = 0; i < longT ; i++){
				if(i<(longT-1)){
					System.out.print(arraytogether [i] + ", ");
				}else{
					System.out.print(arraytogether [i]);
				}
			}
		
			
		}
		
		/**
		create an array without repeated numbers
		
		<b>pre: <b/>must have put the arrangements together before
		<b>post: <b/>create an array without any repeated number
		*/
		public static void JoinArrangementsWithoutRepeating(){
			
			arrayTogether2 = arraytogether ;
			
			for(int i = 0; i < longT ; i++){
				for (int j = i+1; j < longT ; j++){
					if(arrayTogether2 [i] == arrayTogether2 [j]){
						arrayTogether2 [j] = 0;
					}
				}
			}
			
			for(int i = 0; i < longT ; i++){
				if(arrayTogether2 [i] == 0 ){
					numrepeat += 1;
				} 
			}	
			arraywithoutrepeat = new int [longT - numrepeat];
			
			int R = 0;
			for(int i = 0; i < longT ; i++){
				if(arrayTogether2 [i] != 0 ){
					arraywithoutrepeat [R] = arrayTogether2 [i];
					R += 1;
				}
			}
			
			System.out.println("");
			System.out.println("El arreglo sin repetidos es:");
			for(int i = 0; i < arraywithoutrepeat.length ; i++){
				System.out.print(arraywithoutrepeat [i] + " ");
			}
		}
		
		/**
		create a new arrangement with the numbers that are repeated
		
		<b>pre: <b/>must have put the arrangements together before
		<b>post: <b/>create a new arrangement only with the numbers that are repeated
		*/
		public static void Interception(){
			
			for(int i = 0; i < longT ; i++){
				for(int j = i+1; j < longT; j++){
					if(arraytogether [i] == arraytogether [j]){
						numinter += 1;
					}
				}
			}
			
			arrayInterception = new int [numinter];
			
			int R = 0;
			for(int i = 0; i < longT ; i++){
				for(int j = i+1 ; j < longT; j++){
					if(arraytogether[i] == arraytogether[j]){
						arrayInterception[R]= arraytogether[j];
						R += 1;
					}
				}
			}
			
			System.out.println("");	
			
			for(int i = 0; i < numinter; i++){
				System.out.print(arrayInterception[i] + " ");
			}
			
		}	
		
		/**
		move array numbers
		
		<b>pre: <b/>must have put the arrangements together before
		<b>post: <b/>allows to move the numbers of the arrangements according to the number of times indicated by the user
		*/
		public static void Turn(){
			
			System.out.println("cuantas veces desea girar el arreglo ");
			numTurn = in.nextInt();
			
			int mod = numTurn%longT;
			
			arraySpin = new int [longT];
			
			for(int i = 0; i < longT ; i++){
				if((i + numTurn) < longT){
					arraySpin [i+numTurn] = arraytogether [i];
				}else if( (i+numTurn) >= longT){
					arraySpin [(i + numTurn)-longT] = arraytogether [i];
				}
				
			}
			
			System.out.println("");
			for(int i = 0; i < longT ; i++){
				System.out.print(arraySpin [i] + " ");
			}
			
			
		}
		
		/**
		order from least to greatest
		
		<b>pre: <b/>must have put the arrangements together before
		<b>post: <b/>sort the array numbers from least to greatest by the bubble method
		*/
		public static void OrderLeastToGreatest(){
			
			int aux = 0; 
			for(int i = 0; i < (longT-1) ; i++){
				for(int j = 0; j < (longT-1) ; j++){
					if(arraytogether [j]> arraytogether[j+1]){
						aux = arraytogether[j];
						arraytogether[j] = arraytogether[j+1];
						arraytogether[j+1] = aux;
					}
				}
			}
			
			System.out.println("");
			for(int i = 0 ; i < longT ; i++){
				System.out.print(arraytogether [i] + " " );
			}
		}
		
		public static void main(String args[]){
			Options();	
		}
		
	}